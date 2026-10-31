package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o83 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x83 b;
    public final /* synthetic */ xe01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o83(x83 x83Var, xe01 xe01Var, byte b) {
        super(1);
        this.a = b;
        this.b = x83Var;
        this.c = xe01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xe01 xe01Var = this.c;
        x83 x83Var = this.b;
        switch (b) {
            case 0:
                return cso1.y(new jpg0((rt01) x83Var.b.U0, b03.a1), xe01Var, ah1.e1);
            default:
                return cso1.y(new jpg0((ug3) x83Var.b.T0, b03.b1), xe01Var, p83.b);
        }
    }
}
