package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7z extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jb3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7z(jb3 jb3Var, byte b) {
        super(1);
        this.a = b;
        this.b = jb3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jb3 jb3Var = this.b;
        switch (b) {
            case 0:
                w2c1 w2c1Var = (y1c1) jb3Var.c;
                tb2 tb2Var = (tb2) w2c1Var.U(tb2.class).getValue();
                cot0 cot0Var = (cot0) w2c1Var.U(cot0.class).getValue();
                return new s7z(cot0Var.a, cot0Var.c, tb2Var);
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.c(new xx0(jb3Var, (lnm) null, (byte) 9));
                qtrVar.b(new lu(jb3Var, (lnm) null, (byte) 29));
                return rih1.a;
        }
    }
}
