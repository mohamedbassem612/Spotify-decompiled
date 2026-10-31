package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bgn0 implements h0r0 {
    public final lzn0 a;
    public final bfd b;
    public final dgn0 c;
    public final qyj d;
    public final e27 e;
    public final q8n f;
    public final q8n g;
    public final cbr0 h;

    public bgn0(lzn0 lzn0Var, bfd bfdVar, dgn0 dgn0Var, qyj qyjVar, e27 e27Var, q8n q8nVar, q8n q8nVar2) {
        this.a = lzn0Var;
        this.b = bfdVar;
        this.c = dgn0Var;
        this.d = qyjVar;
        this.e = e27Var;
        this.f = q8nVar;
        this.g = q8nVar2;
        dbr0 j0c0Var = new j0c0(mno1.e);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{j0c0Var, new bn70(yon1.A0(), new lik1(dgn0Var.getPageUri()), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return this.d.a(apo.j(-1187425696, new fhk0(this, (byte) 14), true));
    }
}
