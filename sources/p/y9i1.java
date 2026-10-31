package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y9i1 implements eck1 {
    public final vgr a;
    public final kt91 b;
    public final q8n c;
    public final q8n d;
    public final l9i1 e;
    public final uy10 f;
    public final fyh1 g;
    public final st60 h;
    public final a390 i;
    public final boolean j;
    public final ov20 k;
    public final mr20 l;
    public final ttq m;
    public final String n;
    public final eaa0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final px10 f52p;
    public final c490 q;
    public final String r;

    public y9i1(vgr vgrVar, kt91 kt91Var, q8n q8nVar, q8n q8nVar2, l9i1 l9i1Var, uy10 uy10Var, fyh1 fyh1Var, st60 st60Var, a390 a390Var, boolean z, ov20 ov20Var, mr20 mr20Var, ttq ttqVar, String str, eaa0 eaa0Var, px10 px10Var, c490 c490Var, String str2) {
        this.a = vgrVar;
        this.b = kt91Var;
        this.c = q8nVar;
        this.d = q8nVar2;
        this.e = l9i1Var;
        this.f = uy10Var;
        this.g = fyh1Var;
        this.h = st60Var;
        this.i = a390Var;
        this.j = z;
        this.k = ov20Var;
        this.l = mr20Var;
        this.m = ttqVar;
        this.n = str;
        this.o = eaa0Var;
        this.f52p = px10Var;
        this.q = c490Var;
        this.r = str2;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        fe41 fe41VarJ = a6o1.j(wcn0Var);
        if (!cls.isAssignableFrom(w9i1.class)) {
            hhg1.n("Unknown ViewModel class");
            return null;
        }
        d35 d35Var = (d35) this.m.get();
        boolean zA = d35Var.a();
        boolean z = true;
        if (!this.j) {
            if (!(x9i1.a[this.f52p.ordinal()] == 1 ? d35Var.a() : d35Var.c())) {
                z = false;
            }
        }
        return new w9i1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.n, this.o, this.f52p, this.j, this.q, this.r, fe41VarJ, zA, new rv3(this, null, (byte) 3), z);
    }
}
