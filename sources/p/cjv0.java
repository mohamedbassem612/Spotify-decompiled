package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cjv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ijv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cjv0(ijv0 ijv0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ijv0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ijv0 ijv0Var = this.b;
        switch (b) {
            case 0:
                return new x010(new lt20(new evz(yoi1.g(ijv0Var.a.b(((viv0) obj).a)), new a5s0(ijv0Var, (lnm) null), (byte) 11), new ob00(3, (lnm) null, (byte) 23), (byte) 0), ijv0Var.d, bjv0.h, (byte) 1);
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new a4a(ijv0Var, qtrVar, (lnm) null, (byte) 2));
                return rih1.a;
        }
    }
}
