package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vlu extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlu(vu30 vu30Var, String str, byte b) {
        super(1);
        this.a = b;
        this.b = vu30Var;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                return (ez00) vu30Var.invoke(str, (qxc0) obj);
            case 1:
                mqu0 mqu0Var = (mqu0) obj;
                if (vu30Var != null) {
                    vu30Var.invoke(str, mqu0Var.b);
                }
                return rih1Var;
            default:
                vu30Var.invoke(str, (String) obj);
                return rih1Var;
        }
    }
}
