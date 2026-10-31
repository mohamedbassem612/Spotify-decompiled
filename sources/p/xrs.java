package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xrs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xrs(cir0 cir0Var, byte b) {
        super(1);
        this.a = b;
        this.b = cir0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cir0 cir0Var = this.b;
        switch (b) {
            case 0:
                cir0Var.c().a(new y231(new jia1((zha1) obj)));
                break;
            default:
                cir0Var.g().c(((tv80) obj).a.a);
                break;
        }
        return rih1Var;
    }
}
