package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hwv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwv(lwv lwvVar, byte b) {
        super(2);
        this.a = b;
        this.b = lwvVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        lwv lwvVar = this.b;
        switch (b) {
            case 0:
                return (xpw) lwvVar.b.get();
            default:
                return (xpw) lwvVar.d.get();
        }
    }
}
