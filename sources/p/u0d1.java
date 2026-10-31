package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u0d1 extends w611 {
    public final qzh U0;
    public final k0d1 V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0d1(ConstraintLayout constraintLayout, qzh qzhVar, l0d1 l0d1Var) {
        super(constraintLayout);
        constraintLayout.addView(qzhVar.getView());
        this.U0 = qzhVar;
        this.V0 = l0d1Var;
    }
}
