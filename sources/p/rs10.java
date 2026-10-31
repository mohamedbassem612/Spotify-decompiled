package p;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rs10 extends Dialog {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nzo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs10(nzo nzoVar, dg30 dg30Var, byte b) {
        super(dg30Var, R.style.Theme.Translucent.NoTitleBar);
        this.a = b;
        this.b = nzoVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        byte b = this.a;
        nzo nzoVar = this.b;
        switch (b) {
            case 0:
                ts10 ts10Var = (ts10) nzoVar;
                ts10Var.j1(p7h.M(new ObjectAnimator[]{j0o1.y(ts10Var.i1()), ObjectAnimator.ofFloat(ts10Var.i1(), (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, 20.0f)}), new zf10(ts10Var, this, (byte) 5));
                break;
            default:
                ((bvg0) nzoVar).j1(2, new e4f0(this, (byte) 25));
                break;
        }
    }
}
