package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xy70 {
    public final o8n a;
    public final o8n b;
    public final o8n c;
    public final jsc d;
    public final iu30 e;
    public final iu30 f;
    public final z291 g;
    public final dg41 h;
    public final int i;

    public xy70(o8n o8nVar, o8n o8nVar2, o8n o8nVar3, jsc jscVar, iu30 iu30Var, iu30 iu30Var2, z291 z291Var, dg41 dg41Var, int i) {
        this.a = o8nVar;
        this.b = o8nVar2;
        this.c = o8nVar3;
        this.d = jscVar;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.g = z291Var;
        this.h = dg41Var;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy70)) {
            return false;
        }
        xy70 xy70Var = (xy70) obj;
        return u890.j(this.a, xy70Var.a) && u890.j(this.b, xy70Var.b) && u890.j(this.c, xy70Var.c) && this.d == xy70Var.d && this.e.equals(xy70Var.e) && this.f.equals(xy70Var.f) && u890.j(this.g, xy70Var.g) && this.h == xy70Var.h && this.i == xy70Var.i;
    }

    public final int hashCode() {
        o8n o8nVar = this.a;
        int iHashCode = (o8nVar == null ? 0 : o8nVar.hashCode()) * 31;
        o8n o8nVar2 = this.b;
        int iHashCode2 = (iHashCode + (o8nVar2 == null ? 0 : o8nVar2.hashCode())) * 31;
        o8n o8nVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (o8nVar3 == null ? 0 : o8nVar3.hashCode())) * 961;
        jsc jscVar = this.d;
        int iHashCode4 = (hf41.d.hashCode() + ktd.g(this.f, ktd.g(this.e, (iHashCode3 + (jscVar == null ? 0 : jscVar.hashCode())) * 961, 31), 31)) * 31;
        z291 z291Var = this.g;
        int iHashCode5 = (iHashCode4 + (z291Var == null ? 0 : z291Var.hashCode())) * 31;
        dg41 dg41Var = this.h;
        int iHashCode6 = (iHashCode5 + (dg41Var == null ? 0 : dg41Var.hashCode())) * 31;
        int i = this.i;
        return iHashCode6 + (i != 0 ? l1d.C(i) : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=" + this.d + ", networkCachePolicy=null, placeholderFactory=" + this.e + ", errorFactory=" + this.f + ", fallbackFactory=" + hf41.d + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + lzu0.k(this.i) + ')';
    }
}
