package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iih extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ thl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iih(thl thlVar, byte b) {
        super(1);
        this.a = b;
        this.b = thlVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        thl thlVar = this.b;
        switch (b) {
            case 0:
                dhl dhlVar = (dhl) obj;
                xid.r(dhlVar.d, dhlVar.c.d, 0.0f, 6);
                xid.r(dhlVar.f, thlVar, 0.0f, 6);
                dhlVar.g(new e5u((p3v) null, "preferWrap"));
                break;
            default:
                dhl dhlVar2 = (dhl) obj;
                dhl.d(dhlVar2, thlVar, thlVar, 124);
                yf.p(dhlVar2.e, dhlVar2.c.e, 196.0f, 4);
                break;
        }
        return rih1Var;
    }
}
