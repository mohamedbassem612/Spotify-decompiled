package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jwd1 implements h0r0 {
    public final mwd1 a;
    public final yuj b;
    public final gwd1 c;
    public final lvc1 d;
    public final axd1 e;
    public final cbr0 f;

    public jwd1(mwd1 mwd1Var, yuj yujVar, gwd1 gwd1Var, lvc1 lvc1Var, axd1 axd1Var) {
        this.a = mwd1Var;
        this.b = yujVar;
        this.c = gwd1Var;
        this.d = lvc1Var;
        this.e = axd1Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131963126));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MANAGED_ACCOUNT_LINKING_TEEN_EDUCATION", "managed-account-linking/teen-education", 1011, "managed-account-linking");
        Parcelable.Creator creator = lik1.CREATOR;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG1, new lik1(f4i1.f("spotify:managed-account-linking:teen-education:", mwd1Var.a, "")), (nar0) null), new hgr0(egr0.a, 0, 2), new kce0(), new t1r0(true)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return yuj.b(this.b, new o6e0(new ob01(this, null), f46.I(new p6e0[0])), new j2i(-271498324, new nsb1(this, (byte) 11), true), new n7e0(new iwd1(this), ppd1.h, b4x0.R0, pod1.b1));
    }
}
