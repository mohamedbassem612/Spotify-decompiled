package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jpk implements h0r0 {
    public final q7e0 a;
    public final npk b;
    public final fpk c;
    public final ps7 d;
    public final cfd e;
    public final o7p f;
    public final cbr0 g;

    public jpk(q7e0 q7e0Var, npk npkVar, fpk fpkVar, ps7 ps7Var, cfd cfdVar, o7p o7pVar) {
        this.a = q7e0Var;
        this.b = npkVar;
        this.c = fpkVar;
        this.d = ps7Var;
        this.e = cfdVar;
        this.f = o7pVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarM0 = yon1.M0();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) p6r0VarM0, oap1.i(npkVar.a()), (v8h1) t9p1.l(npkVar.b())), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return q7e0.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 4)), new mwh(this, (byte) 23), new n7e0(new ipk(this), new fc3(this, (byte) 2), uwg.U0));
    }
}
