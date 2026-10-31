package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f0a0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g0a0 b;
    public final /* synthetic */ vto0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0a0(g0a0 g0a0Var, vto0 vto0Var, byte b) {
        super(1);
        this.a = b;
        this.b = g0a0Var;
        this.c = vto0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vto0 vto0Var = this.c;
        g0a0 g0a0Var = this.b;
        switch (b) {
            case 0:
                return t3p1.w(g0a0Var.b, ((Number) obj).intValue(), vto0Var.c.c, vto0Var.f);
            default:
                int iIntValue = ((Number) obj).intValue();
                wmy wmyVar = g0a0Var.b;
                cvy0 cvy0Var = vto0Var.f;
                return wmyVar.m(iIntValue, cvy0Var.a, cvy0Var.c, cvy0Var.b, null);
        }
    }
}
