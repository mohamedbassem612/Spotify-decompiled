package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class use implements h0r0 {
    public final qyj a;
    public final s4p b;
    public final cbr0 c;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public use(wse wseVar, qyj qyjVar, s4p s4pVar, e5b0 e5b0Var) {
        this.a = qyjVar;
        this.b = s4pVar;
        j0c0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.u0(), new lik1(wseVar.a()), (nar0) null), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(725548616, new cka(this, (byte) 27), true));
    }
}
