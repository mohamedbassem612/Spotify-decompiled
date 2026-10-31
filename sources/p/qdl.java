package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qdl implements h0r0 {
    public final qyj a;
    public final mdl b;
    public final g341 c;
    public final cbr0 d;

    public qdl(qyj qyjVar, mdl mdlVar, g341 g341Var) {
        this.a = qyjVar;
        this.b = mdlVar;
        this.c = g341Var;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarJ0 = yon1.j0();
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarJ0, oap1.i("spotify:internal:bluejay:connector-apps:authentication"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(40152346, new boj(this, (byte) 26), true));
    }
}
