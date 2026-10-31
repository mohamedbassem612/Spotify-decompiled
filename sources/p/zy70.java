package p;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zy70 {
    public final Context a;
    public final Object b;
    public final drd1 c;
    public final yy70 d;
    public final Map e;
    public final i520 f;
    public final o8n g;
    public final o8n h;
    public final o8n i;
    public final jsc j;
    public final jsc k;
    public final jsc l;
    public final iu30 m;
    public final iu30 n;
    public final iu30 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z291 f156p;
    public final dg41 q;
    public final int r;
    public final kc10 s;
    public final xy70 t;
    public final wy70 u;

    public zy70(Context context, Object obj, drd1 drd1Var, yy70 yy70Var, Map map, i520 i520Var, o8n o8nVar, o8n o8nVar2, o8n o8nVar3, jsc jscVar, jsc jscVar2, jsc jscVar3, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, z291 z291Var, dg41 dg41Var, int i, kc10 kc10Var, xy70 xy70Var, wy70 wy70Var) {
        this.a = context;
        this.b = obj;
        this.c = drd1Var;
        this.d = yy70Var;
        this.e = map;
        this.f = i520Var;
        this.g = o8nVar;
        this.h = o8nVar2;
        this.i = o8nVar3;
        this.j = jscVar;
        this.k = jscVar2;
        this.l = jscVar3;
        this.m = iu30Var;
        this.n = iu30Var2;
        this.o = iu30Var3;
        this.f156p = z291Var;
        this.q = dg41Var;
        this.r = i;
        this.s = kc10Var;
        this.t = xy70Var;
        this.u = wy70Var;
    }

    public static vy70 a(zy70 zy70Var) {
        Context context = zy70Var.a;
        zy70Var.getClass();
        return new vy70(zy70Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy70)) {
            return false;
        }
        zy70 zy70Var = (zy70) obj;
        return u890.j(this.a, zy70Var.a) && this.b.equals(zy70Var.b) && u890.j(this.c, zy70Var.c) && u890.j(this.d, zy70Var.d) && this.e.equals(zy70Var.e) && u890.j(this.f, zy70Var.f) && u890.j(this.g, zy70Var.g) && u890.j(this.h, zy70Var.h) && u890.j(this.i, zy70Var.i) && this.j == zy70Var.j && this.k == zy70Var.k && this.l == zy70Var.l && u890.j(this.m, zy70Var.m) && u890.j(this.n, zy70Var.n) && u890.j(this.o, zy70Var.o) && u890.j(this.f156p, zy70Var.f156p) && this.q == zy70Var.q && this.r == zy70Var.r && this.s.equals(zy70Var.s) && this.t.equals(zy70Var.t) && u890.j(this.u, zy70Var.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        drd1 drd1Var = this.c;
        int iHashCode2 = (iHashCode + (drd1Var == null ? 0 : drd1Var.hashCode())) * 31;
        yy70 yy70Var = this.d;
        return this.u.hashCode() + ((this.t.hashCode() + cy30.e(ab80.k(this.r, (this.q.hashCode() + ((this.f156p.hashCode() + ktd.g(this.o, ktd.g(this.n, ktd.g(this.m, (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + cy30.e((iHashCode2 + (yy70Var != null ? yy70Var.hashCode() : 0)) * 961, 961, this.e)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31), 31), 31)) * 31)) * 31, 31), 31, this.s.a)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.m + ", errorFactory=" + this.n + ", fallbackFactory=" + this.o + ", sizeResolver=" + this.f156p + ", scale=" + this.q + ", precision=" + lzu0.k(this.r) + ", extras=" + this.s + ", defined=" + this.t + ", defaults=" + this.u + ')';
    }
}
