package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class esy0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ shl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esy0(shl shlVar, byte b) {
        super(1);
        this.a = b;
        this.b = shlVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        shl shlVar = this.b;
        switch (b) {
            case 0:
                dhl dhlVar = (dhl) obj;
                yf.p(dhlVar.g, shlVar, 0.0f, 6);
                xid xidVar = dhlVar.d;
                ihl ihlVar = dhlVar.c;
                xid.r(xidVar, ihlVar.d, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                break;
            case 1:
                dhl dhlVar2 = (dhl) obj;
                xid xidVar2 = dhlVar2.d;
                ihl ihlVar2 = dhlVar2.c;
                xid.r(xidVar2, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar2.f, ihlVar2.f, 0.0f, 6);
                yf.p(dhlVar2.e, shlVar, 0.0f, 6);
                yf.p(dhlVar2.g, shlVar, 0.0f, 6);
                break;
            case 2:
                dhl dhlVar3 = (dhl) obj;
                yf.p(dhlVar3.e, shlVar, 0.0f, 6);
                yf.p(dhlVar3.g, shlVar, 0.0f, 6);
                break;
            default:
                dhl dhlVar4 = (dhl) obj;
                yf.p(dhlVar4.e, shlVar, 0.0f, 6);
                yf.p(dhlVar4.g, shlVar, 0.0f, 6);
                break;
        }
        return rih1Var;
    }
}
