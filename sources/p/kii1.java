package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kii1 extends zf30 implements ug30, jik1, o6r0, bbr0 {
    public final iyh1 F1;
    public bte1 G1;
    public sun0 H1;
    public iii1 I1;
    public i8h1 J1;
    public l6h1 K1;
    public fhi1 L1;
    public ytq M1;
    public ztq N1;
    public boolean O1;
    public final bck1 P1;
    public final gn10 Q1;
    public final lik1 R1;
    public final cbr0 S1;

    public kii1(iyh1 iyh1Var) {
        this.F1 = iyh1Var;
        dch1 dch1Var = new dch1(this, (byte) 13);
        znb0 znb0VarS = dm5.S(3, new jqb0(new jqb0(this, (byte) 25), (byte) 26));
        this.P1 = ebp1.j(this, rc11.a.b(MobiusLoopViewModel.class), new g22(znb0VarS, (byte) 15), new g22(znb0VarS, (byte) 16), dch1Var);
        this.Q1 = mno1.p0;
        lik1 lik1Var = nik1.y4;
        this.R1 = lik1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.S1 = new cbr0(new dbr0[]{new bn70(yon1.t2(), lik1Var, (nar0) null)}, false);
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    @Override // p.fn10
    public final gn10 Q() {
        return this.Q1;
    }

    public final void Y0(xue1 xue1Var) {
        if (q0()) {
            if (xue1Var == null) {
                eg.o();
                return;
            }
            sun0 sun0Var = this.H1;
            if (sun0Var == null) {
                u890.C("navigationUseCase");
                throw null;
            }
            if (xue1Var.a().equals(mre1.c)) {
                sun0Var.a.e();
            }
        }
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return this.S1.b0(cls);
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.o(yon1.t2(), this.R1.a());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.t2();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return this.R1;
    }

    @Override // p.ug30
    public final String s() {
        return this.R1.a;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bck1 bck1Var = this.P1;
        ((MobiusLoopViewModel) bck1Var.getValue()).b.f(n0(), new jii1(this, (byte) 0));
        ((MobiusLoopViewModel) bck1Var.getValue()).c.a(this, new es3(this, (byte) 10), new jii1(this, (byte) 1));
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(2003210278, new eii1(composeView, this, (byte) 1), true));
        return composeView;
    }
}
