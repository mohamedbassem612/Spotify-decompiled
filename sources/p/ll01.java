package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ll01 implements h0r0 {
    public final nl01 a;
    public final yuj b;
    public final mk01 c;
    public final pl01 d;
    public final tp41 e;
    public final ynb0 f;
    public final i4m0 g;
    public boolean h;

    public ll01(nl01 nl01Var, yuj yujVar, mk01 mk01Var, pl01 pl01Var, tp41 tp41Var, ynb0 ynb0Var, i4m0 i4m0Var) {
        this.a = nl01Var;
        this.b = yujVar;
        this.c = mk01Var;
        this.d = pl01Var;
        this.e = tp41Var;
        this.f = ynb0Var;
        this.g = i4m0Var;
    }

    public final cbr0 a() {
        dbr0 tc30Var = new tc30(1);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("WRAPPED_RECEIPT", "wrapped/receipt", 2182, "wrapped");
        Parcelable.Creator creator = lik1.CREATOR;
        return new cbr0(new dbr0[]{tc30Var, new bn70(p6r0VarG1, new lik1(l1d.m("spotify:wrapped:receipt:", this.a.a)), (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true), new s9h1(6, true, false, true)}, false);
    }

    public final p2r0 b() {
        return this.b.a(new o6e0(new ro8(this, null, (byte) 20), f46.I(new p6e0[0])), new j2i(-1514249856, new g001(this, (byte) 11), true), new n7e0(new kl01(this), atz0.T0, r5x0.e, th01.Y), new xvj((xu30) null, bcj.a, (j2i) null, false, 61));
    }
}
