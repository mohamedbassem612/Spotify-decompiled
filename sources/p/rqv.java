package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rqv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqv(vqv vqvVar, byte b) {
        super(1);
        this.a = b;
        this.b = vqvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vqv vqvVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return vqvVar.g;
            default:
                return new h3h1(new rqv(vqvVar, (byte) 0));
        }
    }
}
