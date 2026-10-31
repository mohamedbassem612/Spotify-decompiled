package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s16 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u16 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s16(u16 u16Var, byte b) {
        super(1);
        this.a = b;
        this.b = u16Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        u16 u16Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(u16Var.a, u16Var.d, (p16) obj);
            default:
                ((qtr) obj).b(new kr((Object) u16Var, (lnm) null, (byte) 3));
                return rih1.a;
        }
    }
}
