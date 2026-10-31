package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tov implements h0r0 {
    public final bpv a;
    public final qyj b;
    public final res c;
    public final cbr0 d;

    public tov(bpv bpvVar, qyj qyjVar, res resVar) {
        this.a = bpvVar;
        this.b = qyjVar;
        this.c = resVar;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.t0(), new lik1(bpvVar.getPageUri()), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.b.a(apo.j(228049708, new utt(this, (byte) 18), true));
    }
}
