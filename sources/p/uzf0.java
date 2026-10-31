package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uzf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vzf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uzf0(vzf0 vzf0Var, byte b) {
        super(1);
        this.a = b;
        this.b = vzf0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vzf0 vzf0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                vzf0Var.b();
                break;
            case 1:
                ((Number) obj).intValue();
                vzf0Var.b();
                break;
            case 2:
                ((Number) obj).intValue();
                vzf0Var.c();
                break;
            default:
                nk80 nk80Var = (nk80) obj;
                gfn0 gfn0Var = (gfn0) vzf0Var.c.b;
                mn20 mn20Var = new mn20(nk80Var.a, nk80Var.b, nk80Var.c, nk80Var.d);
                if (!u890.j(gfn0Var.e(), mn20Var)) {
                    gfn0Var.f(mn20Var);
                }
                vzf0Var.b();
                vzf0Var.c();
                break;
        }
        return rih1Var;
    }
}
