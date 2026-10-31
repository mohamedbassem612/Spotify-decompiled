package p;

import android.R;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class o7s0 extends ConstraintLayout implements tf0, kfd {
    public static final int[] V0 = {R.attr.state_active};
    public static final int[] W0 = {-16842910};
    public boolean T0;
    public boolean U0;

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 2);
        if (this.T0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V0);
        }
        if (this.U0) {
            for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
                if (iArrOnCreateDrawableState[i2] == 16842910) {
                    iArrOnCreateDrawableState[i2] = -16842910;
                }
            }
            View.mergeDrawableStates(iArrOnCreateDrawableState, W0);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.tf0
    public void setActive(boolean z) {
        this.T0 = z;
        refreshDrawableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.kfd
    public void setAppearsDisabled(boolean z) {
        this.U0 = z;
        refreshDrawableState();
    }
}
