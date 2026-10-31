package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class em1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rt01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em1(rt01 rt01Var, byte b) {
        super(1);
        this.a = b;
        this.b = rt01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rt01 rt01Var = this.b;
        switch (b) {
            case 0:
                qtr qtrVar = (qtr) obj;
                qtrVar.c(new ms4(new ab(rt01Var, (byte) 22), (lnm) null, (byte) 8));
                rwq0.z(qtrVar, new m3(rt01Var, (byte) 28));
                return rih1.a;
            default:
                return (qzh) rt01Var.d;
        }
    }
}
