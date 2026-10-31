package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rbx0 implements h0r0 {
    public final a8e0 a;
    public final k8x0 b;
    public final ynb0 c;
    public final cbr0 d;

    public rbx0(a8e0 a8e0Var, k8x0 k8x0Var, sbx0 sbx0Var, ynb0 ynb0Var, ytp0 ytp0Var) {
        this.a = a8e0Var;
        this.b = k8x0Var;
        this.c = ynb0Var;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        yxe1 yxe1Var = new yxe1(new jx21(ytp0Var.s()));
        n6r0 n6r0VarP = ytp0Var.p();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{t1r0Var, s9h1Var, yxe1Var, u890.j(n6r0VarP, yon1.p4()) ? new bn70(ytp0Var.p(), ytp0Var.t(), (v8h1) c8o.t()) : u890.j(n6r0VarP, yon1.q4()) ? new bn70(ytp0Var.p(), ytp0Var.t(), (v8h1) dro.E()) : u890.j(n6r0VarP, yon1.l4()) ? new bn70(ytp0Var.p(), ytp0Var.t(), (v8h1) tgp1.t()) : new bn70(ytp0Var.p(), ytp0Var.t(), (nar0) null), new j0c0(mno1.l0), new qod1(sbx0Var.getUri()), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        Parcelable.Creator creator = j8x0.CREATOR;
        bs51.o();
        m6e0 m6e0VarN = p8p1.n(this.b.i(j8x0.h).doOnNext(new wx91(this, (byte) 15)).filter(new zov0(this)));
        xy50 xy50Var = new xy50(this, (byte) 28);
        m391 m391Var = z391.Z;
        return this.a.a(m6e0VarN, xy50Var, new u7r0(a4p1.v(new e491[]{z391.a, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var, m391Var}), null, null, false, false, 126));
    }
}
