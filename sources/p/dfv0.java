package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dfv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kls0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfv0(kls0 kls0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kls0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kls0 kls0Var = this.b;
        switch (b) {
            case 0:
                return new uop0(yoi1.g(((o241) kls0Var.c).b("country_code")), (byte) 16);
            default:
                ((qtr) obj).b(new pnp0(kls0Var, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
