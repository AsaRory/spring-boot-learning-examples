package com.rhwayfun.springboot.datasource.model;

public class Car {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.id
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.manu_facturer
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    private String manuFacturer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.license_plate
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    private String licensePlate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.seat_count
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    private Integer seatCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.id
     *
     * @return the value of car.id
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.id
     *
     * @param id the value for car.id
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.manu_facturer
     *
     * @return the value of car.manu_facturer
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public String getManuFacturer() {
        return manuFacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.manu_facturer
     *
     * @param manuFacturer the value for car.manu_facturer
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer == null ? null : manuFacturer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.license_plate
     *
     * @return the value of car.license_plate
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.license_plate
     *
     * @param licensePlate the value for car.license_plate
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate == null ? null : licensePlate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.seat_count
     *
     * @return the value of car.seat_count
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public Integer getSeatCount() {
        return seatCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.seat_count
     *
     * @param seatCount the value for car.seat_count
     *
     * @mbg.generated Sat Jul 29 11:37:47 CST 2017
     */
    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }
}