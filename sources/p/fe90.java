package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fe90 implements h0r0 {
    public final qyj a;
    public final ee90 b;
    public final cbr0 c;

    public fe90(qyj qyjVar, ee90 ee90Var) {
        this.a = qyjVar;
        this.b = ee90Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131956801));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MANAGED_ACCOUNT_LINKING_INVITE_PARENT", "managed-account-linking/invite-parent", 1006, "managed-account-linking");
        Parcelable.Creator creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG1, new lik1("spotify:managed-account-linking:invite-parent"), (nar0) null), new t1r0(true), new hgr0(egr0.a, 0, 2)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(907146796, new jb50(this, (byte) 28), true));
    }
}
