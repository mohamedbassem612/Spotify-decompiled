package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ae90 implements h0r0 {
    public final hvj a;
    public final zd90 b;
    public final st60 c;
    public final cbr0 d;

    public ae90(hvj hvjVar, zd90 zd90Var, st60 st60Var) {
        this.a = hvjVar;
        this.b = zd90Var;
        this.c = st60Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MANAGED_ACCOUNT_LINKING_INVITE_OPTIONS", "managed-account-linking/invite-options", 1005, "managed-account-linking");
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1("spotify:managed-account-linking:invite-options"), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837), new t1r0(true), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(f4p1.g(this.b), new j2i(1100773304, new yy80(this, (byte) 3), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }
}
