package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ysv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ysv(tjq tjqVar, byte b) {
        super(1);
        this.a = b;
        this.b = tjqVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tjq tjqVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) tjqVar.b;
            default:
                return new h3h1(new ysv(tjqVar, (byte) 0));
        }
    }
}
