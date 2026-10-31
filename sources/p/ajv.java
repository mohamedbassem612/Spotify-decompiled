package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ajv {
    public static final ajv B = new ajv(new tw21(2131101447), new tw21(2131101437), new tw21(2131101448), new tw21(2131101438), new tw21(2131101450), new tw21(2131101439), new tw21(2131101451), new tw21(2131101440), new tw21(2131101455), new tw21(2131101444), new tw21(2131101456), new tw21(2131101445), new tw21(2131101432), new tw21(2131101433), new tw21(2131101435), new tw21(2131101436), new tw21(2131101431), new tw21(2131101434), new tw21(2131101452), new tw21(2131101441), new tw21(2131101454), new tw21(2131101443), new tw21(2131101446), new tw21(2131101442), new tw21(2131101453), new tw21(2131101449), new tw21(2131101457));
    public final tw21 A;
    public final tw21 a;
    public final tw21 b;
    public final tw21 c;
    public final tw21 d;
    public final tw21 e;
    public final tw21 f;
    public final tw21 g;
    public final tw21 h;
    public final tw21 i;
    public final tw21 j;
    public final tw21 k;
    public final tw21 l;
    public final tw21 m;
    public final tw21 n;
    public final tw21 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tw21 f11p;
    public final tw21 q;
    public final tw21 r;
    public final tw21 s;
    public final tw21 t;
    public final tw21 u;
    public final tw21 v;
    public final tw21 w;
    public final tw21 x;
    public final tw21 y;
    public final tw21 z;

    public ajv(tw21 tw21Var, tw21 tw21Var2, tw21 tw21Var3, tw21 tw21Var4, tw21 tw21Var5, tw21 tw21Var6, tw21 tw21Var7, tw21 tw21Var8, tw21 tw21Var9, tw21 tw21Var10, tw21 tw21Var11, tw21 tw21Var12, tw21 tw21Var13, tw21 tw21Var14, tw21 tw21Var15, tw21 tw21Var16, tw21 tw21Var17, tw21 tw21Var18, tw21 tw21Var19, tw21 tw21Var20, tw21 tw21Var21, tw21 tw21Var22, tw21 tw21Var23, tw21 tw21Var24, tw21 tw21Var25, tw21 tw21Var26, tw21 tw21Var27) {
        this.a = tw21Var;
        this.b = tw21Var2;
        this.c = tw21Var3;
        this.d = tw21Var4;
        this.e = tw21Var5;
        this.f = tw21Var6;
        this.g = tw21Var7;
        this.h = tw21Var8;
        this.i = tw21Var9;
        this.j = tw21Var10;
        this.k = tw21Var11;
        this.l = tw21Var12;
        this.m = tw21Var13;
        this.n = tw21Var14;
        this.o = tw21Var15;
        this.f11p = tw21Var16;
        this.q = tw21Var17;
        this.r = tw21Var18;
        this.s = tw21Var19;
        this.t = tw21Var20;
        this.u = tw21Var21;
        this.v = tw21Var22;
        this.w = tw21Var23;
        this.x = tw21Var24;
        this.y = tw21Var25;
        this.z = tw21Var26;
        this.A = tw21Var27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ajv ajvVar = (ajv) obj;
        return this.a.equals(ajvVar.a) && this.b.equals(ajvVar.b) && this.c.equals(ajvVar.c) && this.d.equals(ajvVar.d) && this.e.equals(ajvVar.e) && this.f.equals(ajvVar.f) && this.g.equals(ajvVar.g) && this.h.equals(ajvVar.h) && this.i.equals(ajvVar.i) && this.j.equals(ajvVar.j) && this.k.equals(ajvVar.k) && this.l.equals(ajvVar.l) && this.m.equals(ajvVar.m) && this.n.equals(ajvVar.n) && this.o.equals(ajvVar.o) && this.f11p.equals(ajvVar.f11p) && this.q.equals(ajvVar.q) && this.r.equals(ajvVar.r) && this.s.equals(ajvVar.s) && this.t.equals(ajvVar.t) && this.u.equals(ajvVar.u) && this.v.equals(ajvVar.v) && this.w.equals(ajvVar.w) && this.x.equals(ajvVar.x) && this.y.equals(ajvVar.y) && this.z.equals(ajvVar.z) && this.A.equals(ajvVar.A);
    }

    public final int hashCode() {
        return this.A.hashCode() + ktd.h(this.z, ktd.h(this.y, ktd.h(this.x, ktd.h(this.w, ktd.h(this.v, ktd.h(this.u, ktd.h(this.t, ktd.h(this.s, ktd.h(this.r, ktd.h(this.q, ktd.h(this.f11p, ktd.h(this.o, ktd.h(this.n, ktd.h(this.m, ktd.h(this.l, ktd.h(this.k, ktd.h(this.j, ktd.h(this.i, ktd.h(this.h, ktd.h(this.g, ktd.h(this.f, ktd.h(this.e, ktd.h(this.d, ktd.h(this.c, ktd.h(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ColorProviders(primary=" + this.a + ", onPrimary=" + this.b + ", primaryContainer=" + this.c + ", onPrimaryContainer=" + this.d + ", secondary=" + this.e + ", onSecondary=" + this.f + ", secondaryContainer=" + this.g + ", onSecondaryContainer=" + this.h + ", tertiary=" + this.i + ", onTertiary=" + this.j + ", tertiaryContainer=" + this.k + ", onTertiaryContainer=" + this.l + ", error=" + this.m + ", errorContainer=" + this.n + ", onError=" + this.o + ", onErrorContainer=" + this.f11p + ", background=" + this.q + ", onBackground=" + this.r + ", surface=" + this.s + ", onSurface=" + this.t + ", surfaceVariant=" + this.u + ", onSurfaceVariant=" + this.v + ", outline=" + this.w + ", inverseOnSurface=" + this.x + ", inverseSurface=" + this.y + ", inversePrimary=" + this.z + ")widgetBackground=" + this.A;
    }
}
