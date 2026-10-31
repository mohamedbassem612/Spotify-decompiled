package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zis extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ajs b;
    public final /* synthetic */ sto0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zis(ajs ajsVar, sto0 sto0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ajsVar;
        this.c = sto0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        sto0 sto0Var = this.c;
        ajs ajsVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                wmy wmyVar = ajsVar.b;
                cvy0 cvy0Var = sto0Var.e;
                return wmyVar.m(iIntValue, cvy0Var.a, cvy0Var.c, cvy0Var.b, null);
            default:
                return t3p1.w(ajsVar.b, ((Number) obj).intValue(), sto0Var.c.c, sto0Var.e);
        }
    }
}
