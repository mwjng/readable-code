package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapshot;
import cleancode.minesweeper.tobe.cell.CellSnapshotStatus;

public class LandMineCellSignProvider implements CellSignProvidable {

    private static final String LAND_MINE_SIGN = "☼";

    @Override
    public boolean supports(final CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.LAND_MINE);
    }

    @Override
    public String provide(final CellSnapshot cellSnapshot) {
        return LAND_MINE_SIGN;
    }
}
