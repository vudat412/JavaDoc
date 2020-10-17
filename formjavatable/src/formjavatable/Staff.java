/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formjavatable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author DATV
 */
public class Staff extends Person {

    public static final File savedStaff = new File("D:/abcxyz.dat");
    public static final LinkedHashMap<String, Staff> STAFF_MAP = new LinkedHashMap<>();

    private String department;
    private float salary, basicsalary, coefficient, senority;

    public Staff(String name, String birth, String address, String gender, long telephone, String email, String department, float salary, float basicsalary, float coefficient, float senority) {
        super(name, birth, address, gender, email, telephone);
        this.department = department;
        this.salary = salary;
        this.basicsalary = basicsalary;
        this.coefficient = coefficient;
        this.senority = senority;
    }

    public static void updateStaff(final String name, final Staff newData) {
        STAFF_MAP.replace(name, newData);

        try {
            Path path = Paths.get(savedStaff.getPath());
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            int pos = new ArrayList<String>(STAFF_MAP.keySet()).indexOf(name);
            lines.set(pos, newData.getInfo());
            Files.write(path, lines, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Thêm staff vào cache (STAFF_MAP) đã tăng tốc độ lấy data
     *
     * @param data : dữ liệu staff truyền vào để thêm
     */
    public static void addStaff(final Staff data) {
        STAFF_MAP.put(data.name, data);
        writeFile(data); // Vẫn lưu
    }

    /**
     * Viết file
     *
     * @param data : dữ liệu staff truyền vào để viết
     */
    public static void writeFile(final Staff data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(savedStaff, true))) {
            String staffInfo = data.getInfo();
            writer.println(staffInfo.substring(0, data.getInfo().lastIndexOf("$")));
            writer.close();
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void saveCache() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(float basicsalary) {
        this.basicsalary = basicsalary;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public float getSenority() {
        return senority;
    }

    public void setSenority(float senority) {
        this.senority = senority;
    }

    public float getRealSalary() {
        return salary + basicsalary * (1 + coefficient + senority / 100);
    }

    public String getInfo() {
        return super.getPerson() + "$" + department + "$" + salary + "$" + basicsalary + "$" + coefficient + "$" + senority + "$" + getRealSalary();
    }
}
