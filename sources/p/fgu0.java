package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fgu0 implements n86 {
    public final i5y0 a;

    public fgu0(i5y0 i5y0Var) {
        this.a = i5y0Var;
    }

    public final boolean a() {
        return this.a.c();
    }

    public final boolean b() {
        return this.a.e();
    }

    public final boolean c() {
        return this.a.g();
    }

    public final mr20 d() {
        return this.a.h();
    }

    public final boolean e() {
        return this.a.d();
    }

    public final boolean f() {
        return this.a.b.g();
    }

    public final String g() {
        return ((lm10) this.a.d).a;
    }

    public final mr20 h() {
        zl10 yl10Var;
        a5y0 huzVar;
        mr20 mr20VarA;
        i5y0 i5y0Var = this.a;
        rg4 rg4Var = i5y0Var.b;
        if (rg4Var.i()) {
            if (rg4Var.h()) {
                mr20VarA = ((u601) i5y0Var.g.getValue()).a();
            } else {
                huzVar = new a5y0(i5y0Var.b().a(), i5y0Var, (byte) 0);
            }
            return new ht20(mr20VarA, new b5y0(i5y0Var, null, (byte) 0));
        }
        if (rg4Var.d()) {
            yl10Var = new zl10();
        } else {
            yl10Var = new yl10("generate", rd.a, new f1i1(e1i1.d));
        }
        huzVar = new huz(yl10Var, (byte) 10);
        mr20VarA = huzVar;
        return new ht20(mr20VarA, new b5y0(i5y0Var, null, (byte) 0));
    }
}
