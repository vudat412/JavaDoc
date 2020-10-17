/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formjavatable;

import java.util.Scanner;

/**
 *
 * @author DATV
 */
public class Person {

        protected String name, birth, address, gender, email;
        protected long telephone;

        public Person(String name, String birth, String address, String gender, String email, long telephone) {
            this.name = name;
            this.birth = birth;
            this.address = address;
            this.gender = gender;
            this.email = email;
            this.telephone = telephone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getTelephone() {
            return telephone;
        }

        public void setTelephone(long telephone) {
            this.telephone = telephone;
        }
        Scanner scanner = new Scanner(System.in);

        public void setPerson() {
            name = scanner.nextLine();
            birth = scanner.nextLine();
            address = scanner.nextLine();
            gender = scanner.nextLine();
            telephone = scanner.nextInt();
            email = scanner.nextLine();
        }

        public String getPerson() {
            return name + "$" + birth + "$" + address + "$" + gender + "$" + telephone + "$" + email;
        }
    }