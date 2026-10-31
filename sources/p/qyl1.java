package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qyl1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qyl1(e0t e0tVar, byte b) {
        super(1);
        this.a = b;
        this.b = e0tVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        e0t e0tVar = this.b;
        switch (b) {
            case 0:
                return new rxc0(e0tVar.b);
            default:
                return e0tVar.b;
        }
    }
}
