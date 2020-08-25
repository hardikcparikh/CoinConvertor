import com.company.coin.Coin
import com.company.coin.CoinFactory
import spock.lang.Specification
class CoinConvertorSpec extends Specification {

    def "check US coin convertor"() {

        given:"Country name and total amount"
        String country="US"
        int cents=287

        when:"We ask to convert total amount in denominations"
        Coin coin = CoinFactory.getCoin(country);
        def expectedResults = [2,3,1,0,2]
        def result = coin.convertCoin(cents);

        then:"We match expected and actual denominations array"
        expectedResults==result

    }
    def "Check India coin convertor"() {

        given:"Country name and total amount"
        String country="India"
        int cents=287

        when:"We ask to convert total amount in denominations"
        Coin coin = CoinFactory.getCoin(country);
        def expectedResults = [2,1,1,1,2]
        def result = coin.convertCoin(cents);

        then:"We match expected and actual denominations array"
        expectedResults==result

    }
    def "Check Europe coin convertor"() {

        given:"Country name and total amount"
        String country="Europe"
        int cents=287

        when:"We ask to convert total amount in denominations"
        Coin coin = CoinFactory.getCoin(country);
        def expectedResults = [2,1,1,1,1,2]
        def result = coin.convertCoin(cents);

        then:"We match expected and actual denominations array"
        expectedResults==result

    }
}