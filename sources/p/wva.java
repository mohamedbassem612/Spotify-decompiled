package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wva extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wva(xva xvaVar, byte b) {
        super(1);
        this.a = b;
        this.b = xvaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xva xvaVar = this.b;
        switch (b) {
            case 0:
                xvaVar.c.a(new yxe1(new ehc1((String) obj)));
                return rih1.a;
            default:
                return xvaVar.b;
        }
    }
}
