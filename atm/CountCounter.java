package atm.atm;

import atm.currency.Count;

public class CountCounter {
        public static float readCount(Count count) {
            switch(count) {
                case ONE:
                    return 1.0f;
                case TWO:
                    return 2.0f;
                case FIVE:
                    return 5.0f;
                case TEN:
                    return 10.0f;
                case TWENTY:
                    return 20.0f;
                case FIFTY:
                    return 50.0f;
                case HUNDRED:
                    return 1000.0f;
                default:
                    throw new IllegalArgumentException("Unknown bill type " + count.toString());
            }

}
