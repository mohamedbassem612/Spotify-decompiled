package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t0o1 extends a8d1 implements vu30 {
    public final /* synthetic */ String X;
    public xgn0 a;
    public u9c b;
    public String c;
    public vrv0 d;
    public String e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ u9c h;
    public final /* synthetic */ String i;
    public final /* synthetic */ vrv0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0o1(u9c u9cVar, String str, vrv0 vrv0Var, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.h = u9cVar;
        this.i = str;
        this.t = vrv0Var;
        this.X = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        t0o1 t0o1Var = new t0o1(this.h, this.i, this.t, this.X, lnmVar);
        t0o1Var.g = obj;
        return t0o1Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        zwo1 zwo1Var;
        u9c u9cVar;
        String str;
        vgn0 vgn0Var;
        vrv0 vrv0Var;
        String str2;
        String str3;
        u9c u9cVar2;
        zwo1 zwo1Var2;
        vgn0 vgn0Var2;
        vgn0 vgn0Var3;
        h2x0 h2x0Var;
        n0o1 n0o1Var;
        byte b = this.f;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (b == 0) {
                    hm5.M(obj);
                    zwo1Var = (zwo1) this.g;
                    u9cVar = this.h;
                    vgn0 vgn0Var4 = (xgn0) u9cVar.e;
                    this.g = zwo1Var;
                    this.a = vgn0Var4;
                    this.b = u9cVar;
                    str = this.i;
                    this.c = str;
                    vrv0 vrv0Var2 = this.t;
                    this.d = vrv0Var2;
                    String str4 = this.X;
                    this.e = str4;
                    this.f = (byte) 1;
                    if (vgn0Var4.a(this) != d9nVar) {
                        vgn0Var = vgn0Var4;
                        vrv0Var = vrv0Var2;
                        str2 = str4;
                    }
                    return d9nVar;
                }
                if (b != 1) {
                    vgn0Var3 = (vgn0) this.g;
                    try {
                        hm5.M(obj);
                        vgn0Var3.c((Object) null);
                        return rih1.a;
                    } catch (Throwable th) {
                        th = th;
                        vgn0Var3.c((Object) null);
                        throw th;
                    }
                }
                String str5 = this.e;
                vrv0 vrv0Var3 = this.d;
                str = this.c;
                u9cVar = this.b;
                vgn0 vgn0Var5 = this.a;
                zwo1Var = (zwo1) this.g;
                hm5.M(obj);
                str2 = str5;
                vrv0Var = vrv0Var3;
                vgn0Var = vgn0Var5;
                if (h2x0Var.c(5, 100L, 1000L, 2.0d, n0o1Var, this) != d9nVar) {
                    vgn0Var3 = vgn0Var2;
                    vgn0Var3.c((Object) null);
                    return rih1.a;
                }
                return d9nVar;
            } catch (Throwable th2) {
                th = th2;
                vgn0Var3 = vgn0Var2;
                vgn0Var3.c((Object) null);
                throw th;
            }
            h2x0Var = h2x0.Z0;
            n0o1Var = new n0o1(zwo1Var2, u9cVar2, str3, vrv0Var, str2, null);
            this.g = vgn0Var;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = (byte) 2;
            vgn0Var2 = vgn0Var;
        } catch (Throwable th3) {
            th = th3;
            vgn0Var2 = vgn0Var;
        }
        str3 = str;
        u9cVar2 = u9cVar;
        zwo1Var2 = zwo1Var;
    }
}
