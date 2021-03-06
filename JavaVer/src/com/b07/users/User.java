package com.b07.users;

import com.b07.database.helper.DatabaseSelectHelper;
import com.b07.security.PasswordHelpers;
import java.io.Serializable;
import java.sql.SQLException;

public abstract class User implements Serializable {
  /**
   * id for serialization.
   */
  private static final long serialVersionUID = 9023461578645549355L;
  private int id;
  private String name;
  private int age;
  private String address;
  @SuppressWarnings("unused")
  private int roleId;
  protected boolean authenticated;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getRoleId() throws SQLException {
    return DatabaseSelectHelper.getUserRoleId(id);
  }

  public boolean isAuthenticated() {
    return authenticated;
  }

  public final boolean authenticate(String password) throws SQLException {
    authenticated = PasswordHelpers.comparePassword(DatabaseSelectHelper.getPassword(id), password);
    return authenticated;
  }
}
