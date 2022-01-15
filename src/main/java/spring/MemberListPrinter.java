package spring;

import java.util.Collection;

public class MemberListPrinter {

    private MemberDao memberDao;
    private MemberPrinter print;

    public MemberListPrinter(MemberDao memberDao, MemberPrinter memberPrinter) {
        this.memberDao = memberDao;
        this.print = memberPrinter;
    }

    public void printAll(){
        Collection<Member> members = memberDao.selectAll();
        for(Member m : members){
            print.print(m);
        }
    }
}
