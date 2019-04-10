package control;

import Exceptions.GameControlException;
import Exceptions.LandControlException;
import view.ErrorView;

/**
 *
 * @author Jeremy
 */
public class LandControl {

    public static int getBushelsForLand(int acres, int bushelsPerAcre)
            throws LandControlException {
        if (acres < 0) {
            throw new LandControlException("Number of acres cannot be less than 0.");
        }

        if (bushelsPerAcre < 0) {
            throw new LandControlException("Bushels per acre cannot be less than 0.");
        }

        int totalBushelsForLand = acres * bushelsPerAcre;
        return totalBushelsForLand;
    }
}
