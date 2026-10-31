package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class exm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ exm(c0r c0rVar, byte b) {
        super(1);
        this.a = b;
        this.b = c0rVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new dxm(this.b, (byte) 0);
            default:
                return new dxm(this.b, (byte) 1);
        }
    }
}
