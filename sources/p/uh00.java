package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uh00 implements h0r0 {
    public final z7e0 a;
    public final zep b;
    public final nh00 c;
    public final cbr0 d;

    public uh00(z7e0 z7e0Var, zep zepVar, wh00 wh00Var, nh00 nh00Var) {
        this.a = z7e0Var;
        this.b = zepVar;
        this.c = nh00Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131955783));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarN0 = yon1.N0();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) p6r0VarN0, oap1.i(wh00Var.getUri()), (v8h1) v9p1.L(yon1.N0().c, wh00Var.getUri())), new j0c0(mno1.C), new qod1("Concert Hub"), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        nty ntyVar = new nty(this, (byte) 29);
        i391 i391Var = z391.i;
        return new w6e0(this.c, this.a, new u7r0(a4p1.v(new e491[]{z391.f, z391.h, i391Var, i391Var}), null, null, false, false, 126), ntyVar, (byte) 3);
    }
}
