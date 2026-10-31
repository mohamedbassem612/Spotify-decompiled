package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hgy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k0t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgy(k0t k0tVar, byte b) {
        super(1);
        this.a = b;
        this.b = k0tVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new ggy(this.b, (byte) 0);
            default:
                return new ggy(this.b, (byte) 1);
        }
    }
}
