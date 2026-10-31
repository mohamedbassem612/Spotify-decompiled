package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i0k implements h0r0 {
    public final hvj a;
    public final toj0 b;
    public final cbr0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public i0k(hvj hvjVar, l0k l0kVar, toj0 toj0Var, e5b0 e5b0Var) {
        this.a = hvjVar;
        this.b = toj0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarN = yon1.N();
        Parcelable.Creator creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{new bn70(p6r0VarN, oap1.i(l0kVar.getUri()), (nar0) null), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new sg0()), apo.j(-2036764959, new okg(this, (byte) 26), true));
    }
}
