package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wl0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl0(rwj rwjVar, byte b) {
        super(1);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rwj rwjVar = this.b;
        switch (b) {
            case 0:
                uv61 uv61VarA = ((xv61) rwjVar.f).a(rc11.a.b(ol0.class), ((tl0) obj).b);
                return new x010(uv61VarA.d, uv61VarA.f, vl0.h, (byte) 1);
            default:
                ((qtr) obj).b(new k1(rwjVar, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
