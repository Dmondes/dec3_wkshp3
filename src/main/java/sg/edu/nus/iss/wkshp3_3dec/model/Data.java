package sg.edu.nus.iss.wkshp3_3dec.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

public class Data {
    @NotBlank(message ="Full name is required")
    @Min(value =3, message="Name must be at least 3 characters")
    @Max(value =64, message="Nmae must be at least 64 characters")
    private String name;
    @Email(message="Invalid email")
    private String email;
    @Pattern(regexp="^[0-9]{7,}$", message="Phone number must be at least 7 digits")
    private String phone;
    @Past(message="Date of birth must be past")
    private LocalDate dob;

    public Data() {
    }

    public Data(String name, String email, String phone, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
