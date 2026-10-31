package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s6k0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6k0(t6k0 t6k0Var, byte b) {
        super(1);
        this.a = b;
        this.b = t6k0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        t6k0 t6k0Var = this.b;
        switch (b) {
            case 0:
                return new r6k0(((mnk0) t6k0Var.f).a, (byte) 0);
            default:
                ((qtr) obj).b(new skv(t6k0Var, (lnm) null, (byte) 23));
                return rih1.a;
        }
    }
}
