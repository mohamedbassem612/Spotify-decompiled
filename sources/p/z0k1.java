package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z0k1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c1k1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0k1(c1k1 c1k1Var, byte b) {
        super(1);
        this.a = b;
        this.b = c1k1Var;
    }

    public final Object invoke(Object obj) {
        w7h1 w7h1VarI;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c1k1 c1k1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return c1k1Var.e.b();
            case 1:
                return new h3h1(new z0k1(c1k1Var, (byte) 0));
            case 2:
                c1k1Var.g.g();
                c1k1Var.f.h(nik1.c1.a);
                return rih1Var;
            case 3:
                gxb gxbVar = (hxb) obj;
                gxb gxbVar2 = gxbVar instanceof gxb ? gxbVar : null;
                if (gxbVar2 == null) {
                    return rih1Var;
                }
                lr61 lr61Var = c1k1Var.e;
                int iC = l1d.C(gxbVar2.a);
                if (iC == 0) {
                    w7h1VarI = lr61Var.i();
                } else {
                    if (iC != 1 && iC != 2) {
                        eg.o();
                        return null;
                    }
                    w7h1VarI = lr61Var.j();
                }
                ((i8h1) c1k1Var.d.get()).m(w7h1VarI, (xj61) null);
                return rih1Var;
            default:
                return new hp0(c1k1Var.b.c(new z0k1(c1k1Var, (byte) 3)), (byte) 20);
        }
    }
}
