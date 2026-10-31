package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class axi1 implements h0r0 {
    public final q7e0 a;
    public final euq b;
    public final dxi1 c;
    public final xwi1 d;
    public final utw0 e;
    public final f2g1 f;
    public final huq g;
    public final y1t0 h;
    public final ksk0 i;
    public final cbr0 j;

    public axi1(q7e0 q7e0Var, euq euqVar, dxi1 dxi1Var, xwi1 xwi1Var, utw0 utw0Var, f2g1 f2g1Var, huq huqVar, y1t0 y1t0Var) {
        this.a = q7e0Var;
        this.b = euqVar;
        this.c = dxi1Var;
        this.d = xwi1Var;
        this.e = utw0Var;
        this.f = f2g1Var;
        this.g = huqVar;
        this.h = y1t0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        ksk0 ksk0VarX = vbe.x(yon1.c6().c, dxi1Var.getUri());
        this.i = ksk0VarX;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        p6r0 p6r0VarC6 = yon1.c6();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.j = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) p6r0VarC6, oap1.i(dxi1Var.getUri()), (v8h1) ksk0VarX), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return q7e0.b(this.a, f610.e(new p6e0[0], new l24(this, this.c.getUri(), (lnm) null, (byte) 28)), new ymg1(this, (byte) 24), new n7e0(new zwi1(this), zhi1.e, new jma((byte) 29)));
    }
}
