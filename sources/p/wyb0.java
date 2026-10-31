package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wyb0 extends zf30 implements ug30, o6r0, jik1 {
    public final bf70 F1;
    public w7r0 G1;
    public ees H1;
    public final gn10 I1 = mno1.U;
    public final lik1 J1 = nik1.X2;

    public wyb0(bf70 bf70Var) {
        this.F1 = bf70Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    public final void I0(View view, Bundle bundle) {
        b8k1.n(view, 2131428103).setOnClickListener(new zfs(this, (byte) 28));
    }

    @Override // p.fn10
    public final gn10 Q() {
        return this.I1;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.q(yon1.T3());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.T3();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return this.J1;
    }

    @Override // p.ug30
    public final String s() {
        return this.I1.getName();
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View, p.ges] */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131625127, viewGroup, false);
        g4b1 g4b1Var = new g4b1(h0(), j4b1.ARROW_LEFT, a8o.y(24.0f, viewGroup2.getResources()));
        g4b1Var.c(x74.E(viewGroup2.getContext(), 2131100487));
        ((ImageView) b8k1.n(viewGroup2, 2131428103)).setImageDrawable(g4b1Var);
        dug.r(b8k1.n(viewGroup2, 2131431407));
        ees eesVar = this.H1;
        if (eesVar == null) {
            u890.C("pageLoaderViewBuilder");
            throw null;
        }
        ?? A = eesVar.a(P0());
        iac0 iac0VarN0 = n0();
        w7r0 w7r0Var = this.G1;
        if (w7r0Var == null) {
            u890.C("pageLoaderScope");
            throw null;
        }
        A.E(iac0VarN0, w7r0Var.get());
        viewGroup2.addView((View) A, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        return viewGroup2;
    }
}
