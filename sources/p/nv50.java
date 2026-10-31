package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nv50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv50(ov50 ov50Var, byte b) {
        super(1);
        this.a = b;
        this.b = ov50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ov50 ov50Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return ov50Var.c;
            default:
                return new h3h1(new nv50(ov50Var, (byte) 0));
        }
    }
}
