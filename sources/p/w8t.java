package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w8t extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zfr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8t(zfr zfrVar, byte b) {
        super(1);
        this.a = b;
        this.b = zfrVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zfr zfrVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) zfrVar.b;
            default:
                return new h3h1(new w8t(zfrVar, (byte) 0));
        }
    }
}
