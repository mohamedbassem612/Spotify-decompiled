package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tg31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg31 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg31(iu30 iu30Var, gg31 gg31Var) {
        super(1);
        this.a = (byte) 2;
        this.c = iu30Var;
        this.b = gg31Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gg31 gg31Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                gg31Var.s.invoke();
                iu30Var.invoke(new pf31(((s201) obj).a));
                return rih1Var;
            case 1:
                tv80 tv80Var = (tv80) obj;
                gg31Var.s.invoke();
                iu30Var.invoke(new lf31(tv80Var != null ? tv80Var.a : null));
                return rih1Var;
            default:
                z001 z001Var = (z001) obj;
                if (z001Var.equals(x001.a)) {
                    iu30Var.invoke(new kf31(gg31Var.q));
                } else {
                    if (!(z001Var instanceof y001)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new sf31(((y001) z001Var).a));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg31(gg31 gg31Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = gg31Var;
        this.c = iu30Var;
    }
}
