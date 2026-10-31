package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c3x extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ihl b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3x(ihl ihlVar, String str, byte b) {
        super(1);
        this.a = b;
        this.b = ihlVar;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        ihl ihlVar = this.b;
        switch (b) {
            case 0:
                dhl dhlVar = (dhl) obj;
                ihl ihlVar2 = dhlVar.c;
                dhl.d(dhlVar, ihlVar2.d, ihlVar2.f, 124);
                yf.p(dhlVar.e, ihlVar2.e, 0.0f, 6);
                yf.p(dhlVar.g, ihlVar.e, 0.0f, 6);
                hrt.m((p3v) null, str, dhlVar, (p3v) null, "spread");
                break;
            default:
                dhl dhlVar2 = (dhl) obj;
                ihl ihlVar3 = dhlVar2.c;
                dhl.d(dhlVar2, ihlVar3.d, ihlVar3.f, 124);
                yf.p(dhlVar2.e, ihlVar3.e, 0.0f, 6);
                yf.p(dhlVar2.g, ihlVar.e, 0.0f, 6);
                hrt.m((p3v) null, str, dhlVar2, (p3v) null, "spread");
                break;
        }
        return rih1Var;
    }
}
