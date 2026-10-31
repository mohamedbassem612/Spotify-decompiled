package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class in61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jn61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in61(jn61 jn61Var, byte b) {
        super(1);
        this.a = b;
        this.b = jn61Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jn61 jn61Var = this.b;
        switch (b) {
            case 0:
                return lro1.p(jn61Var.a, (gn61) obj);
            default:
                ((xas) obj).a(ec61.Y0, new u841(jn61Var, (byte) 18));
                return rih1.a;
        }
    }
}
