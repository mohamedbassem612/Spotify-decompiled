package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aq6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bq6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq6(bq6 bq6Var, byte b) {
        super(1);
        this.a = b;
        this.b = bq6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bq6 bq6Var = this.b;
        switch (b) {
            case 0:
                wp6 wp6Var = (wp6) obj;
                return yoi1.h(bq6Var.c, o6x.a).x(new lan1(bq6Var, wp6Var)).J(new yo31(bq6Var, wp6Var));
            default:
                ((qtr) obj).b(new lu(bq6Var, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
