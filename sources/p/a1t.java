package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a1t extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l6s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1t(l6s l6sVar, byte b) {
        super(1);
        this.a = b;
        this.b = l6sVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        l6s l6sVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return ((l5m0) ((idd1) l6sVar.c).getValue()).b();
            default:
                return new h3h1(new a1t(l6sVar, (byte) 0));
        }
    }
}
