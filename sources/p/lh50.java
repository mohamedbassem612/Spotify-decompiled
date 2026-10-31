package p;

import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lh50 implements h0r0 {
    public final hvj a;
    public final nh50 b;
    public final fp8 c;
    public final u961 d;
    public final lzn0 e;
    public final fjp f;
    public final cbr0 g;

    public lh50(hvj hvjVar, nh50 nh50Var, fp8 fp8Var, u961 u961Var, lzn0 lzn0Var, fjp fjpVar) {
        this.a = hvjVar;
        this.b = nh50Var;
        this.c = fp8Var;
        this.d = u961Var;
        this.e = lzn0Var;
        this.f = fjpVar;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarE0 = yon1.e0();
        Parcelable.Creator creator = lik1.CREATOR;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarE0, oap1.i(nh50Var.getPageUri()), (nar0) null), new j0c0(mno1.c), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        Set set = s4b1.f;
        nh50 nh50Var = this.b;
        s4b1 s4b1VarX = uic.x(nh50Var.getPageUri());
        blc0 blc0Var = s4b1VarX.c;
        if (blc0Var != blc0.w2) {
            bhn0.g(blc0Var, "GroupBlendMembersPage: invalid link type ");
            return null;
        }
        String strJ = s4b1VarX.j();
        if (strJ == null) {
            strJ = "";
        }
        lc20 lc20VarA = this.f.a(nh50Var.getPageUri());
        return hvj.b(this.a, bbp1.g(this.c.m(strJ).map(va20.d)), apo.j(239269050, new adx(this, lc20VarA, (byte) 5), true));
    }
}
