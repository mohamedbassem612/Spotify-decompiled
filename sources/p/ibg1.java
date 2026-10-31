package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ibg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mbg1 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibg1(mbg1 mbg1Var, boolean z, byte b) {
        super(1);
        this.a = b;
        this.b = mbg1Var;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mbg1 mbg1Var = this.b;
        switch (b) {
            case 0:
                av31 av31Var = (av31) obj;
                mbg1Var.getClass();
                String str = av31Var.b;
                String str2 = av31Var.c;
                String str3 = av31Var.d;
                return new why(mbg1Var.a.getContext().getColor(2131101393), str, av31Var.e, str2, str3, av31Var.f, av31Var.g, av31Var.h, this.c);
            case 1:
                ev31 ev31Var = (ev31) obj;
                mbg1Var.getClass();
                return new ps70(ev31Var.b, ev31Var.c, ev31Var.a, ev31Var.d, ev31Var.e, ev31Var.f, ev31Var.g, ev31Var.h, this.c, ev31Var.i);
            default:
                gv31 gv31Var = (gv31) obj;
                mbg1Var.getClass();
                return new p7f0(gv31Var.b, gv31Var.c, gv31Var.a, gv31Var.d, gv31Var.e, gv31Var.f, gv31Var.g, this.c, 256);
        }
    }
}
