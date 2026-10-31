package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kue1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uvg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kue1(uvg1 uvg1Var, byte b) {
        super(1);
        this.a = b;
        this.b = uvg1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new uvg1(((Number) obj).longValue(), this.b.b);
            default:
                return new uvg1(this.b.a, ((Number) obj).longValue());
        }
    }
}
