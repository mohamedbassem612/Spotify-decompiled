package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class urr0 implements h0r0 {
    public final yqg a;
    public final nwa b;
    public final yuj c;
    public final wrr0 d;
    public final qrr0 e;
    public final rrr0 f;
    public final axd1 g;
    public final cbr0 h;

    public urr0(yqg yqgVar, nwa nwaVar, yuj yujVar, wrr0 wrr0Var, qrr0 qrr0Var, rrr0 rrr0Var, axd1 axd1Var) {
        this.a = yqgVar;
        this.b = nwaVar;
        this.c = yujVar;
        this.d = wrr0Var;
        this.e = qrr0Var;
        this.f = rrr0Var;
        this.g = axd1Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131959546));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MANAGED_ACCOUNT_LINKING_PARENT_ACCEPT_INVITE", "managed-account-linking/parent-accept-invite", 1008, "managed-account-linking");
        Parcelable.Creator creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG1, new lik1(f4i1.f("spotify:managed-account-linking:parent-accept-invite:", wrr0Var.a, "")), (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return yuj.b(this.c, new o6e0(new oxa0(this, null, (byte) 23), f46.I(new p6e0[0])), new j2i(-783231021, new x3o0(this, (byte) 14), true), new n7e0(new trr0(this), w0q0.S0, c710.U0, q4r0.U0));
    }
}
