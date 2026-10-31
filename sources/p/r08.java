package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r08 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y08 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r08(y08 y08Var, byte b) {
        super(1);
        this.a = b;
        this.b = y08Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        y08 y08Var = this.b;
        switch (b) {
            case 0:
                ay8 ay8VarG = d3p1.G(y08Var.g, y08Var.Y, (p08) obj);
                kkw0 kkw0Var = y08Var.f;
                return new x010(ay8VarG, d5p1.t(hu20.e(kkw0Var.c, new i64(3, (lnm) null, (byte) 24)), kkw0Var.b, ey71.a, (Object) null), new l2(3, (lnm) null, (byte) 11), (byte) 1);
            default:
                ((qtr) obj).b(new u08(y08Var, lnmVar, (byte) 0));
                return rih1.a;
        }
    }
}
