import java.util.LinkedHashMap;
import java.util.Map;

public class Member implements Comparable<Member> {
    private String name;
    private Map<Sports, Level> sports = new LinkedHashMap<>();

    public Member(String name) {
        if(name.isEmpty() || name == null)
            throw new IllegalArgumentException("Name must be non empty and not null!");
        else
            this.name = name;
    }

    public Member(String name, Map<Sports, Level> sportsLevelMap) {
        // TODO
        if (sportsLevelMap == null)
            throw new IllegalArgumentException("sportsLevelMap must not be null!");
        this.sports = (Map<Sports, Level>) sportsLevelMap.clone();
    }

    public String getName() { return this.name; }

    @Override
    public int compareTo(Member member) {
        boolean result = name.equals((member.getName()));
        if (result)
                return 1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(getClass() != obj.getClass())
            return false;
        Member other = (Member) obj;
        return name == other.getName();
    }
    

    

}
