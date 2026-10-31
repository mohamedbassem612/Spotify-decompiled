package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ih7 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih7(qzh qzhVar, byte b) {
        super(1);
        this.a = b;
        this.b = qzhVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.getView();
            default:
                return this.b;
        }
    }
}
