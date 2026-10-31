package p;

import android.R;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s7s0 extends FrameLayout implements tf0, kfd {
    public static final int[] c = {R.attr.state_active};
    public static final int[] d = {-16842910};
    public boolean a;
    public boolean b;

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.a) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        if (this.b) {
            for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
                if (iArrOnCreateDrawableState[i2] == 16842910) {
                    iArrOnCreateDrawableState[i2] = -16842910;
                }
            }
            View.mergeDrawableStates(iArrOnCreateDrawableState, d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p.tf0
    public void setActive(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // p.kfd
    public void setAppearsDisabled(boolean z) {
        this.b = z;
        refreshDrawableState();
    }
}
