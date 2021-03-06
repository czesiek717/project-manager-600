package pl.projectmanager600.entities;

public enum Role {
  PROGRAMMER("programista"),
  PROJECT_MANAGER("project manager"),
  TESTER("tester");

  private String name;

  Role(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
