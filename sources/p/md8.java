package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class md8 implements h0r0 {
    public final ix81 a;
    public final c2p b;
    public final cbr0 c;

    public md8(ix81 ix81Var, od8 od8Var, c2p c2pVar) {
        this.a = ix81Var;
        this.b = c2pVar;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarW = yon1.W();
        Parcelable.Creator creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarW, oap1.i(od8Var.a + ":weboverlaycheckout"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new rr6(this, (byte) 24));
    }
}
