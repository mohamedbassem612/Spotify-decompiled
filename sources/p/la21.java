package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class la21 implements h0r0 {
    public final yuj a;
    public final rpv0 b;
    public final ba21 c;
    public final k811 d;
    public final cbr0 e;

    public la21(yuj yujVar, rpv0 rpv0Var, ba21 ba21Var, k811 k811Var) {
        this.a = yujVar;
        this.b = rpv0Var;
        this.c = ba21Var;
        this.d = k811Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131961168));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PARENTAL_CONTROL_REMOVE_PARENT", "parental-control/remove-parent", 1416, "parental-control");
        Parcelable.Creator creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG1, new lik1("spotify:internal:parental-control:remove-parent"), (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return yuj.b(this.a, new o6e0(new l8t0(this, (lnm) null, (byte) 9), f46.I(new p6e0[0])), new j2i(265044437, new z821(this, (byte) 1), true), new n7e0(new ka21(this), rs11.Q0, s9x0.g, (iu30) null));
    }
}
