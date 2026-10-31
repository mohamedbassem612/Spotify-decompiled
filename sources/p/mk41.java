package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mk41 implements cy81 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConstraintLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mk41(ConstraintLayout constraintLayout, boolean z, byte b) {
        this.a = b;
        this.b = constraintLayout;
        this.c = z;
    }

    public final void z() {
        byte b = this.a;
        boolean z = this.c;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
            case 0:
                constraintLayout.setVisibility(0);
                constraintLayout.setAlpha(z ? 0.0f : 1.0f);
                break;
            default:
                constraintLayout.setVisibility(0);
                constraintLayout.setAlpha(z ? 0.0f : 1.0f);
                break;
        }
    }
}
