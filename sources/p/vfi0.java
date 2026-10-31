package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vfi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ira b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfi0(ira iraVar, byte b) {
        super(1);
        this.a = b;
        this.b = iraVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ira iraVar = this.b;
        switch (b) {
            case 0:
                return fqo1.F((String) obj, iraVar);
            default:
                return fqo1.F(((String) obj).replace(' ', (char) 160), iraVar);
        }
    }
}
