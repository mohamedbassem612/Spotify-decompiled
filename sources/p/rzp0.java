package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rzp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ry21 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzp0(long j, ry21 ry21Var, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = ry21Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ry21 ry21Var = this.c;
        switch (b) {
            case 0:
                return new k4g1(((gxc) obj).a, this.b, ry21Var.f.b());
            default:
                sp21 sp21Var = (sp21) obj;
                sp21Var.k = Long.valueOf(this.b);
                sp21Var.p = Long.valueOf(ry21Var.f.b());
                return rih1.a;
        }
    }
}
