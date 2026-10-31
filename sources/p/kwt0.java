package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kwt0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;
    public final /* synthetic */ gwt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwt0(s24 s24Var, gwt0 gwt0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = s24Var;
        this.c = gwt0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gwt0 gwt0Var = this.c;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                return new kwt0(s24Var, gwt0Var, lnmVar, (byte) 0);
            default:
                return new kwt0(s24Var, gwt0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gwt0 gwt0Var = this.c;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                x1i1 x1i1Var = (x1i1) s24Var.g;
                vvt0 vvt0Var = (vvt0) gwt0Var;
                String str = vvt0Var.c;
                int iC = l1d.C(vvt0Var.d);
                int i = 1;
                if (iC != 0) {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2;
                }
                x1i1.a(x1i1Var, new z740(i, str, "play"), 6);
                return rih1Var;
            default:
                hm5.M(obj);
                zvt0 zvt0Var = (zvt0) gwt0Var;
                ((xqt0) ((idd1) s24Var.Z).getValue()).a(zvt0Var.a, zvt0Var.b);
                return rih1Var;
        }
    }
}
