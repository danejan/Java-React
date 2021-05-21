package MernisService;

import Abstract.CheckUserManager;
import Entitities.User;

public class MernisServiceAdapters implements CheckUserManager {
    @Override
    public Boolean CheckIfRealPerson(User user) throws Exception {
        RQAKPSPublicSoap client = new RQAKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());
    }
}