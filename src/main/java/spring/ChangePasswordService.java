package spring;

public class ChangePasswordService {

    private MemberDao memberDao;

    public ChangePasswordService(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    //암호를 변경할 데이터를 찾기 위해 email을 사용한다.
    public void changePassword(String email, String oldPwd, String newPwd){
        Member member = memberDao.selectByEmail(email);
        if(member == null){
            throw new MemberNotFoundException();
        }

        member.changePassword(oldPwd, newPwd);

        memberDao.update(member);
    }
}
