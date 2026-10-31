package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i5o0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rt01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5o0(rt01 rt01Var, byte b) {
        super(1);
        this.a = b;
        this.b = rt01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rt01 rt01Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new x3o0(rt01Var, (byte) 1));
                return rih1.a;
            default:
                return (qzh) rt01Var.d;
        }
    }
}
