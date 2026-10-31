package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dg81 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dea0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg81(dea0 dea0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = dea0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        dea0 dea0Var = this.b;
        switch (b) {
            case 0:
                return new dg81(dea0Var, lnmVar, (byte) 0);
            default:
                return new dg81(dea0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dea0 dea0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                jqd0 jqd0Var = (jqd0) dea0Var.h;
                t45 t45Var = (t45) jqd0Var.d;
                if (t45Var != null) {
                    t45.m(t45Var, "load_latest_rows_data", 4);
                }
                jqd0Var.b = true;
                break;
            default:
                hm5.M(obj);
                ((jqd0) dea0Var.h).y(1);
                break;
        }
        return rih1Var;
    }
}
