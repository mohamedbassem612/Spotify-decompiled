package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xva implements h0r0 {
    public final ix81 a;
    public final bwa b;
    public final cbr0 c;

    public xva(ix81 ix81Var, zva zvaVar, bwa bwaVar) {
        this.a = ix81Var;
        this.b = bwaVar;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarO = yon1.O();
        Parcelable.Creator creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarO, oap1.i(zvaVar.a()), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
        bwaVar.b(new wva(this, (byte) 0));
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new wva(this, (byte) 1));
    }
}
