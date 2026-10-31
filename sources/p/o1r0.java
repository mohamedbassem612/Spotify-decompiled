package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o1r0 extends cwb {
    public final lzn0 Q0;
    public final boolean R0;
    public final int S0;
    public final idd1 T0;
    public final idd1 U0;
    public final idd1 V0;

    /* JADX WARN: Multi-variable type inference failed */
    public o1r0(ConstraintLayout constraintLayout, cir0 cir0Var, lzn0 lzn0Var) {
        super(constraintLayout.getContext());
        this.Q0 = lzn0Var;
        this.R0 = true;
        this.S0 = -1;
        idd1 idd1Var = new idd1(new m1r0(this, (byte) 1));
        this.T0 = idd1Var;
        this.U0 = new idd1(new m1r0(this, (byte) 2));
        idd1 idd1Var2 = new idd1(new m1r0(this, (byte) 0));
        this.V0 = idd1Var2;
        cir0Var.e().getLifecycle().a(new k1r0(this));
        setContentView(constraintLayout);
        x9p1.p((View) idd1Var.getValue(), x9p1.h(constraintLayout));
        hm5.J((View) idd1Var.getValue(), this);
        setOnShowListener(new l1r0(this, (byte) 0));
        ((View) idd1Var2.getValue()).setBackground(getContext().getDrawable(2131231020));
        g().E = true;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        idd1 idd1Var = this.T0;
        ((View) idd1Var.getValue()).setFitsSystemWindows(false);
        rwq0.s((View) idd1Var.getValue(), new n1r0(this, (byte) 0));
        ((View) this.U0.getValue()).setFitsSystemWindows(false);
        idd1 idd1Var2 = this.V0;
        ((View) idd1Var2.getValue()).setFitsSystemWindows(false);
        View view = (View) idd1Var2.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = this.S0;
            view.setLayoutParams(layoutParams);
        }
    }
}
