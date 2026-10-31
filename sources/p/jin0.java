package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jin0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kzy b;
    public final /* synthetic */ wto0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jin0(kzy kzyVar, wto0 wto0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kzyVar;
        this.c = wto0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wto0 wto0Var = this.c;
        kzy kzyVar = this.b;
        switch (b) {
            case 0:
                return t3p1.w(kzyVar.c, ((Number) obj).intValue(), wto0Var.c.c, wto0Var.j);
            default:
                int iIntValue = ((Number) obj).intValue();
                wmy wmyVar = kzyVar.c;
                cvy0 cvy0Var = wto0Var.j;
                return wmyVar.m(iIntValue, cvy0Var.a, cvy0Var.c, cvy0Var.b, null);
        }
    }
}
