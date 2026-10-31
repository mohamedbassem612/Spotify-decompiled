package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n03 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o03 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n03(o03 o03Var, byte b) {
        super(1);
        this.a = b;
        this.b = o03Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o03 o03Var = this.b;
        switch (b) {
            case 0:
                ycc1 ycc1Var = o03Var.g;
                ((m03) ycc1Var.c).a((String) obj, (i8h1) ycc1Var.b);
                break;
            default:
                o03Var.i.a(u890.j(o03Var.b.a, "prompted_playlists"));
                break;
        }
        return rih1Var;
    }
}
