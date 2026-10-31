package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m190 implements h0r0 {
    public final o190 a;
    public final f190 b;
    public final yuj c;
    public final h190 d;
    public final weq e;
    public final cbr0 f;

    public m190(o190 o190Var, f190 f190Var, yuj yujVar, h190 h190Var, weq weqVar) {
        this.a = o190Var;
        this.b = f190Var;
        this.c = yujVar;
        this.d = h190Var;
        this.e = weqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.w0(), nik1.c5.b(o190Var.getUri()), (nar0) null), new pu00(true)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return yuj.b(this.c, this.d, apo.j(1441922305, new bt70(this, (byte) 9), true), this.b.a());
    }
}
