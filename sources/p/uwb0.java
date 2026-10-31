package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uwb0 implements h0r0 {
    public final hvj a;
    public final twb0 b;
    public final axd1 c;
    public final cbr0 d;

    public uwb0(hvj hvjVar, twb0 twb0Var, axd1 axd1Var) {
        this.a = hvjVar;
        this.b = twb0Var;
        this.c = axd1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MANAGED_ACCOUNT_LINKING_LEARN_MORE", "managed-account-linking/learn-more", 1007, "managed-account-linking");
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1("spotify:managed-account-linking:learn-more"), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837), new t1r0(true), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new o6e0(new oxa0(this, null, (byte) 3), f46.I(new p6e0[0])), new j2i(897166864, new yy80(this, (byte) 24), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }
}
