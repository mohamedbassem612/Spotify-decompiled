package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t7m extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7m(vu30 vu30Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = vu30Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                vu30Var.invoke(Integer.valueOf(i), Boolean.valueOf(((h8m) obj).a));
                break;
            case 1:
                vu30Var.invoke(Integer.valueOf(i), (String) obj);
                break;
            case 2:
                vu30Var.invoke(Integer.valueOf(i), (fji0) obj);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                vu30Var.invoke(Integer.valueOf(i), bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                vu30Var.invoke(Integer.valueOf(i), bool2);
                break;
        }
        return rih1Var;
    }
}
