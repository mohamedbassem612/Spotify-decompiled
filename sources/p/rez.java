package p;

import android.os.Parcelable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rez implements h0r0 {
    public final nez a;
    public final c7w0 b;
    public final a8e0 c;
    public final l4h1 d;
    public final cbr0 e;

    public rez(xez xezVar, nez nezVar, c7w0 c7w0Var, a8e0 a8e0Var, l4h1 l4h1Var) {
        this.a = nezVar;
        this.b = c7w0Var;
        this.c = a8e0Var;
        this.d = l4h1Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131955598));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarC5 = yon1.c5();
        Parcelable.Creator creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarC5, oap1.i(xezVar.getUri()), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        nez nezVar = this.a;
        return a8e0.b(this.c, bbp1.g(Single.zip(nezVar.b(), nezVar.a(), this.b.a(), rzs0.d1)), new nty(this, (byte) 18));
    }
}
