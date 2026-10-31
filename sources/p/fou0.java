package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fou0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hou0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fou0(hou0 hou0Var, byte b) {
        super(1);
        this.a = b;
        this.b = hou0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hou0 hou0Var = this.b;
        switch (b) {
            case 0:
                ynu0 ynu0Var = (ynu0) obj;
                return new k6e0(new php0(hou0Var.a.m(ynu0Var.a, ynu0Var.b, hou0.g), (byte) 26), (byte) 27);
            default:
                ((qtr) obj).b(new jaz(hou0Var, (lnm) null, (byte) 26));
                return rih1.a;
        }
    }
}
