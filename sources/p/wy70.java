package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wy70 {
    public static final wy70 o;
    public final i520 a;
    public final o8n b;
    public final o8n c;
    public final o8n d;
    public final jsc e;
    public final jsc f;
    public final jsc g;
    public final iu30 h;
    public final iu30 i;
    public final iu30 j;
    public final z291 k;
    public final dg41 l;
    public final int m;
    public final kc10 n;

    static {
        hf41 hf41Var = hf41.d;
        gka0 gka0VarU = vyo1.u();
        zmo1.v();
        b3s b3sVar = b3s.c;
        zmo1.v();
        ag01 ag01Var = z291.l0;
        kc10 kc10Var = kc10.b;
        o6x o6xVar = o6x.a;
        jsc jscVar = jsc.ENABLED;
        o = new wy70(gka0VarU, o6xVar, b3sVar, b3sVar, jscVar, jscVar, jscVar, hf41Var, hf41Var, hf41Var, ag01Var, dg41.b, 1, kc10Var);
    }

    public wy70(i520 i520Var, o8n o8nVar, o8n o8nVar2, o8n o8nVar3, jsc jscVar, jsc jscVar2, jsc jscVar3, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, z291 z291Var, dg41 dg41Var, int i, kc10 kc10Var) {
        this.a = i520Var;
        this.b = o8nVar;
        this.c = o8nVar2;
        this.d = o8nVar3;
        this.e = jscVar;
        this.f = jscVar2;
        this.g = jscVar3;
        this.h = iu30Var;
        this.i = iu30Var2;
        this.j = iu30Var3;
        this.k = z291Var;
        this.l = dg41Var;
        this.m = i;
        this.n = kc10Var;
    }

    public static wy70 a(wy70 wy70Var, kc10 kc10Var, int i) {
        i520 i520Var = wy70Var.a;
        o8n o8nVar = wy70Var.b;
        o8n o8nVar2 = wy70Var.c;
        o8n o8nVar3 = wy70Var.d;
        jsc jscVar = wy70Var.e;
        jsc jscVar2 = wy70Var.f;
        jsc jscVar3 = wy70Var.g;
        iu30 iu30Var = wy70Var.h;
        iu30 iu30Var2 = wy70Var.i;
        iu30 iu30Var3 = wy70Var.j;
        z291 z291Var = wy70Var.k;
        dg41 dg41Var = wy70Var.l;
        int i2 = (i & 4096) != 0 ? wy70Var.m : 2;
        kc10 kc10Var2 = (i & 8192) != 0 ? wy70Var.n : kc10Var;
        wy70Var.getClass();
        return new wy70(i520Var, o8nVar, o8nVar2, o8nVar3, jscVar, jscVar2, jscVar3, iu30Var, iu30Var2, iu30Var3, z291Var, dg41Var, i2, kc10Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy70)) {
            return false;
        }
        wy70 wy70Var = (wy70) obj;
        return u890.j(this.a, wy70Var.a) && u890.j(this.b, wy70Var.b) && u890.j(this.c, wy70Var.c) && u890.j(this.d, wy70Var.d) && this.e == wy70Var.e && this.f == wy70Var.f && this.g == wy70Var.g && u890.j(this.h, wy70Var.h) && u890.j(this.i, wy70Var.i) && u890.j(this.j, wy70Var.j) && u890.j(this.k, wy70Var.k) && this.l == wy70Var.l && this.m == wy70Var.m && u890.j(this.n, wy70Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ab80.k(this.m, (this.l.hashCode() + ((this.k.hashCode() + ktd.g(this.j, ktd.g(this.i, ktd.g(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + lzu0.k(this.m) + ", extras=" + this.n + ')';
    }
}
