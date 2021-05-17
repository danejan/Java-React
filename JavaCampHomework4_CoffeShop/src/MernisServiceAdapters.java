import Mernis.MUAKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapters implements ICustomerCheckService{

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        MUAKPSPublicSoap client =new MUAKPSPublicSoap();

        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.LastName.toUpperCase(),customer.getDateOfBirth().getYear());


    }
}
