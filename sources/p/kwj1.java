package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kwj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwj1(lwj1 lwj1Var, byte b) {
        super(1);
        this.a = b;
        this.b = lwj1Var;
    }

    public final Object invoke(Object obj) {
        w7h1 w7h1Var;
        byte b = this.a;
        lwj1 lwj1Var = this.b;
        switch (b) {
            case 0:
                gxb gxbVar = (hxb) obj;
                gxb gxbVar2 = gxbVar instanceof gxb ? gxbVar : null;
                if (gxbVar2 != null) {
                    dhl0 dhl0Var = lwj1Var.h;
                    int iC = l1d.C(gxbVar2.a);
                    if (iC == 0) {
                        b7x b7xVar = b7x.a;
                        w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), dhl0Var.a, r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC != 1 && iC != 2) {
                            eg.o();
                            return null;
                        }
                        w7h1Var = dhl0Var.e();
                    }
                    ((i8h1) lwj1Var.g.get()).m(w7h1Var, (xj61) null);
                }
                return rih1.a;
            default:
                return new hp0(lwj1Var.f.c(new kwj1(lwj1Var, (byte) 0)), (byte) 19);
        }
    }
}
