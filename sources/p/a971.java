package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a971 implements h0r0 {
    public final qyj a;
    public final e821 b;
    public final c971 c;
    public final z871 d;
    public final cbr0 e;

    public a971(qyj qyjVar, e821 e821Var, c971 c971Var, z871 z871Var) {
        this.a = qyjVar;
        this.b = e821Var;
        this.c = c971Var;
        this.d = z871Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MANAGED_ACCOUNT_LINKING_SHARE_INVITE_LINK", "managed-account-linking/share-invite-link", 1009, "managed-account-linking");
        Parcelable.Creator creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(f4i1.f("spotify:managed-account-linking:share-invite-link:", c971Var.a, "")), (nar0) null), new nxb(null, ixb.b, null, 0, null, null, false, false, true, null, 3837), new t1r0(true)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-2101494185, new u841(this, (byte) 24), true));
    }
}
