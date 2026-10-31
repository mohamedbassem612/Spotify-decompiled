package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dff extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uvk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dff(uvk0 uvk0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uvk0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uvk0 uvk0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return uvk0Var.b();
            default:
                return new h3h1(new dff(uvk0Var, (byte) 0));
        }
    }
}
