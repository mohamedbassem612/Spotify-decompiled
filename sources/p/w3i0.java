package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w3i0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b431 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3i0(b431 b431Var, byte b) {
        super(1);
        this.a = b;
        this.b = b431Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b431 b431Var = this.b;
        switch (b) {
            case 0:
                return new k6r(b431Var, (byte) 26);
            default:
                b431Var.a(new mdl(((vcl) obj).g), (String) null);
                return rih1.a;
        }
    }
}
