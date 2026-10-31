package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pzp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ szp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pzp0(szp0 szp0Var, byte b) {
        super(1);
        this.a = b;
        this.b = szp0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((sp21) obj).g = Long.valueOf(this.b.b.b());
                break;
            case 1:
                sp21 sp21Var = (sp21) obj;
                sp21Var.s = this.b.c.h;
                sp21Var.h = Long.valueOf(this.b.b.b());
                break;
            default:
                ((sp21) obj).j = Long.valueOf(this.b.b.b());
                break;
        }
        return rih1.a;
    }
}
