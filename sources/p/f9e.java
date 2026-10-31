package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f9e extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g9e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9e(g9e g9eVar, byte b) {
        super(1);
        this.a = b;
        this.b = g9eVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        g9e g9eVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F(g9eVar.b, g9eVar.c, (d9e) obj);
            default:
                ((qtr) obj).b(new ep0(g9eVar, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
