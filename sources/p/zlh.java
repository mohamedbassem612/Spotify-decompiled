package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zlh implements h0r0 {
    public final hvj a;
    public final hmh b;
    public final gmh c;
    public final ldo d;
    public final jd6 e;
    public final xnb f;
    public final cbr0 g;

    public zlh(hvj hvjVar, hmh hmhVar, gmh gmhVar, ldo ldoVar, jd6 jd6Var, xnb xnbVar) {
        this.a = hvjVar;
        this.b = hmhVar;
        this.c = gmhVar;
        this.d = ldoVar;
        this.e = jd6Var;
        this.f = xnbVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.G1("COMMENTS", "comments", 376, "comments"), new lik1("spotify:comments"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return hvj.b(this.a, new h190(new m441(new vs0(this.c, this.b.a, false, (lnm) null, (byte) 28)), (byte) 1), new j2i(-922945529, new okg(this, (byte) 10), true));
    }
}
