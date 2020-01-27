package com.b07.exceptions;

public class ExceptionHandler {

  private static final boolean DEBUG = false;
  private static final String pack = "com.b07.exceptions.";

  /**
   * Checks className and prints message associated with that exception.
   * 
   * @param error Exception to handle
   */
  public static void handle(Exception error) {

    if (DEBUG) {
      System.err.println("EXCEPTION STACK TRACE (DW) IT IS HANDLED");
      error.printStackTrace();
    }
    if (error.getClass().getName().equals(pack + "AuthenticationException")) {
      System.out.println("Authentication exception!");
    } else if (error.getClass().getName().equals(pack + "AccountNotFoundException")) {
      System.out.println("Account not found");
    } else if (error.getClass().getName().equals(pack + "AccountNotFoundException")) {
      System.out.println("Account not detected");
    } else if (error.getClass().getName().equals(pack + "ConnectionFailedException")) {
      System.out.println("Connection failed!");
    } else if (error.getClass().getName().equals(pack + "DatabaseInsertException")) {
      System.out.println("Exception when inserting into database!");
    } else if (error.getClass().getName().equals(pack + "InsufficientInventoryException")) {
      System.out.println("Insufficient inventory!");
    } else if (error.getClass().getName().equals("InvalidCombinationException")) {
      System.out.println("Invalid combination. Try again.");
    } else if (error.getClass().getName().equals(pack + "InvalidCredentialsException")) {
      System.out.println("Login failed. Try again.");
    } else if (error.getClass().getName().equals(pack + "InvalidNameException")) {
      System.out.println("Name is invalid!");
    } else if (error.getClass().getName().equals(pack + "InvalidRoleException")) {
      System.out.println("Role is invalid!");
    } else if (error.getClass().getName().equals(pack + "ItemNotFoundException")) {
      System.out.println("Item not found!");
    } else if (error.getClass().getName().equals(pack + "NegativeQuantityException")) {
      System.out.println("Negative quantity!");
    } else if (error.getClass().getName().equals(pack + "NullInputExceptionException")) {
      System.out.println("Input is null!");
    } else if (error.getClass().getName().equals(pack + "PrecisionException")) {
      System.out.println("Invalid currency expression!");
    } else if (error.getClass().getName().equals(pack + "RoleIdNotFoundException")) {
      System.out.println("RoleID not found!");
    } else if (error.getClass().getName().equals(pack + "SaleNotFoundException")) {
      System.out.println("Sale not found!");
    } else if (error.getClass().getName().equals(pack + "StringLengthException")) {
      System.out.println("Input is too long! Input should be less than 100 characters.");
    } else if (error.getClass().getName().equals(pack + "TotalPriceMismatchException")) {
      System.out.println("Price doesn't match the total price!");
    } else if (error.getClass().getName().equals(pack + "UserNotFoundException")) {
      System.out.println("User not found!");
    } else if (error.getClass().getName().equals(pack + "IncorrectActivityException")) {
      System.out.println("Account cannot be updated to active!");
    } else if (error.getClass().getName().equals(pack + "RefundException")) {
      System.out.println("Number of items to be refunded inappropriate!");
    } else {
      System.out.println("Error! ");
      if (DEBUG) {
        System.out.println("Make sure to add " + error.getClass().getName() + " to the handler");
      }
    }
  }
}
