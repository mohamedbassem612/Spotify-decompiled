package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aii1 implements h0r0 {
    public final yuj a;
    public final dlg1 b;
    public final ohi1 c;
    public final bii1 d;
    public final jqd0 e;
    public final cbr0 f;

    public aii1(yuj yujVar, dlg1 dlg1Var, ohi1 ohi1Var, bii1 bii1Var, jqd0 jqd0Var, int i, g6m0 g6m0Var, l6m0 l6m0Var) {
        this.a = yujVar;
        this.b = dlg1Var;
        this.c = ohi1Var;
        this.d = bii1Var;
        this.e = jqd0Var;
        yxe1 yxe1Var = new yxe1(new jx21(i));
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, t1r0Var, s9h1Var, new bn70((n6r0) yon1.u2(), nik1.A4.b("spotify:listeningstatsdetails:" + g6m0Var.a() + ":" + bii1Var.a().b()), (v8h1) l6m0Var)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        bii1 bii1Var = this.d;
        pks0 pks0VarA = bii1Var.a();
        return this.a.a(f610.c(this.e.o(bii1Var.b(), pks0VarA).map(wbx0.V0).toObservable()), apo.j(-1370467003, new xhi1(this, (byte) 0), true), new n7e0(new yhi1(this), zhi1.b, ybx0.V0, kei1.S0), new xvj((xu30) null, (j2i) null, apo.j(-953260634, new xhi1(this, (byte) 1), true), false, 59));
    }
}
