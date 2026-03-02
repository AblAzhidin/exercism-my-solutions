class Badge {
    public String print(Integer id, String name, String department) {
        return getIdAsString(id) + name + getDepartment(department);
    }

    private String getIdAsString(Integer id) {
        if (id == null) {
            return "";
        } else {
            return "[" + id + "] - ";
        }
    }

    private String getDepartment(String department) {
        if (department == null) {
            return " - OWNER";
        } else {
            return " - " + department.toUpperCase();
        }
    }
}
