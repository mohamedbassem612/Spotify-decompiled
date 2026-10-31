package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zvd0 implements h0r0 {
    public final ix81 a;
    public final fsl b;
    public final cbr0 c;

    public zvd0(ix81 ix81Var, fsl fslVar) {
        this.a = ix81Var;
        this.b = fslVar;
        dbr0 t1r0Var = new t1r0(true);
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{t1r0Var, yxe1Var, new bn70(yon1.G1("LIVE_ERROR_DIALOG", "live/error-dialog", 932, "live"), new lik1("spotify:internal:liveroom:error-dialog"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new l6d0(this, (byte) 16));
    }
}
