package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ny11 implements c9n, ky11 {
    public static final xhd e = new xhd((byte) 0);
    public final o8n a;
    public final o8n b;
    public final ny11 c = this;
    public volatile o8n d;

    public ny11(o8n o8nVar, o8n o8nVar2) {
        this.a = o8nVar;
        this.b = o8nVar2;
    }

    public final o8n J() {
        xhd xhdVarY;
        xhd xhdVar = this.d;
        if (xhdVar == null || xhdVar == e) {
            y3k y3kVar = (y3k) this.a.A(y3k.b);
            my11 my11Var = y3kVar != null ? new my11(y3kVar, this) : o6x.a;
            synchronized (this.c) {
                try {
                    xhd xhdVar2 = this.d;
                    if (xhdVar2 == null) {
                        o8n o8nVar = this.a;
                        xhdVarY = o8nVar.y(op71.e(o8nVar.A(fkj0.W0))).y(this.b).y(my11Var);
                    } else if (xhdVar2 == e) {
                        o8n o8nVar2 = this.a;
                        gaa0 gaa0VarE = op71.e(o8nVar2.A(fkj0.W0));
                        gaa0VarE.R(new yd30());
                        xhdVarY = o8nVar2.y(gaa0VarE).y(this.b).y(my11Var);
                    } else {
                        xhdVarY = xhdVar2;
                    }
                    this.d = xhdVarY;
                } catch (Throwable th) {
                    throw th;
                }
            }
            xhdVar = xhdVarY;
        }
        xhdVar.getClass();
        return xhdVar;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                o8n o8nVar = this.d;
                if (o8nVar == null) {
                    this.d = e;
                } else {
                    op71.m(o8nVar, new yd30());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.ky11
    public final void f() {
        a();
    }

    @Override // p.ky11
    public final void h() {
        a();
    }

    @Override // p.ky11
    public final void b() {
    }
}
