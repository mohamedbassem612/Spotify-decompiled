package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qur0 implements h0r0 {
    public final qyj a;
    public final sur0 b;
    public final skc0 c;
    public final myq0 d;
    public final cbr0 e;

    public qur0(qyj qyjVar, sur0 sur0Var, skc0 skc0Var, myq0 myq0Var) {
        this.a = qyjVar;
        this.b = sur0Var;
        this.c = skc0Var;
        this.d = myq0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("MANAGED_ACCOUNT_LINKING_SHARE_PARENTAL_CONSENT", "managed-account-linking/share-parental-consent", 1010, "managed-account-linking");
        Parcelable.Creator creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(f4i1.f("spotify:managed-account-linking:share-parental-consent:", sur0Var.a, "")), (nar0) null), new nxb(null, ixb.b, null, 0, null, null, false, false, true, null, 3837), new t1r0(true)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(880599124, new nso0(this, (byte) 20), true));
    }
}
