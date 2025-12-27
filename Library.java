import java.util.ArrayList;

public class Library {
    private ArrayList<Checkoutable> items;
    private ArrayList<Member> members;

    public Library(){
        this.items = new ArrayList<Checkoutable>();
        this.members = new ArrayList<Member>();
    }

    public void addItem(Checkoutable item){
        items.add(item);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public ArrayList<Checkoutable> getAvailableItems(){
        ArrayList<Checkoutable> available = new ArrayList<Checkoutable>();
        for (Checkoutable item : items){
            if (item.isAvailable()){
                available.add(item);
            }
        }
        return available;
    }

    public void displayAllMembers(){
        for (Member member : members){
            System.out.println("Member: " + member.getName());
            System.out.println("Fines: $" + member.getTotalFinesDue());
            System.out.println("Books: " + member.getCurrentCheckouts().size());
            System.out.println("---");
        }
    }
}