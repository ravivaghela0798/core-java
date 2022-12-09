public class Cricket implements Sports {
    @Override
    public void setHomeTeam(String name) {
        System.out.println("Home Team : " + name);
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Visiting Team : " + name);
    }

    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.setHomeTeam("India");
        cricket.setVisitingTeam("Australia");
    }
}
