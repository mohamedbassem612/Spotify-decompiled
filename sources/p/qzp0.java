package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qzp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ry21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qzp0(ry21 ry21Var, byte b) {
        super(1);
        this.a = b;
        this.b = ry21Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ry21 ry21Var = this.b;
        switch (b) {
            case 0:
                ((mxc) obj).f = ry21Var.f;
                break;
            default:
                sp21 sp21Var = (sp21) obj;
                sp21Var.d = ry21Var.b.a;
                sp21Var.e = Integer.valueOf(ry21Var.d);
                break;
        }
        return rih1Var;
    }
}
