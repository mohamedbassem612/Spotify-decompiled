package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xxm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxm(hw2 hw2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw2 hw2Var = this.b;
        switch (b) {
            case 0:
                sxm sxmVar = (sxm) obj;
                return d3p1.F(hw2Var.b, sxmVar.b != null ? hw2Var.c : (o3r) hw2Var.h, sxmVar);
            default:
                ((qtr) obj).b(new ep0(hw2Var, (lnm) null, (byte) 19));
                return rih1.a;
        }
    }
}
