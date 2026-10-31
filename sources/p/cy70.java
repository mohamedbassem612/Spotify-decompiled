package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cy70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dy70 b;
    public final /* synthetic */ uto0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy70(dy70 dy70Var, uto0 uto0Var, byte b) {
        super(1);
        this.a = b;
        this.b = dy70Var;
        this.c = uto0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uto0 uto0Var = this.c;
        dy70 dy70Var = this.b;
        switch (b) {
            case 0:
                return t3p1.w(dy70Var.b, ((Number) obj).intValue(), uto0Var.c.c, uto0Var.f);
            default:
                int iIntValue = ((Number) obj).intValue();
                wmy wmyVar = dy70Var.b;
                cvy0 cvy0Var = uto0Var.f;
                return wmyVar.m(iIntValue, cvy0Var.a, cvy0Var.c, cvy0Var.b, null);
        }
    }
}
