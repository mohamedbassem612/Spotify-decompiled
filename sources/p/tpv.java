package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tpv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vpv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tpv(vpv vpvVar, byte b) {
        super(1);
        this.a = b;
        this.b = vpvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vpv vpvVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return vpvVar.f;
            default:
                return new h3h1(new tpv(vpvVar, (byte) 0));
        }
    }
}
