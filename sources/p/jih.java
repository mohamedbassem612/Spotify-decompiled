package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jih extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ihl b;
    public final /* synthetic */ ihl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jih(ihl ihlVar, ihl ihlVar2, byte b) {
        super(1);
        this.a = b;
        this.b = ihlVar;
        this.c = ihlVar2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ihl ihlVar = this.c;
        ihl ihlVar2 = this.b;
        switch (b) {
            case 0:
                dhl dhlVar = (dhl) obj;
                xid.r(dhlVar.d, ihlVar2.f, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.d, 0.0f, 6);
                dhlVar.g(new e5u((p3v) null, "spread"));
                break;
            case 1:
                dhl dhlVar2 = (dhl) obj;
                xid.r(dhlVar2.d, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar2.f, ihlVar2.f, 0.0f, 6);
                yf.p(dhlVar2.e, ihlVar2.e, 0.0f, 6);
                yf.p(dhlVar2.g, ihlVar.g, 0.0f, 6);
                hrt.m(null, "spread", dhlVar2, null, "spread");
                break;
            case 2:
                dhl dhlVar3 = (dhl) obj;
                xid.r(dhlVar3.d, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar3.f, ihlVar2.f, 0.0f, 6);
                yf.p(dhlVar3.e, ihlVar2.e, 0.0f, 6);
                yf.p(dhlVar3.g, ihlVar.g, 0.0f, 6);
                hrt.m(null, "spread", dhlVar3, null, "spread");
                break;
            case 3:
                dhl dhlVar4 = (dhl) obj;
                xid.r(dhlVar4.d, ihlVar2.f, 0.0f, 6);
                xid.r(dhlVar4.f, ihlVar.d, 0.0f, 6);
                yf.p(dhlVar4.e, dhlVar4.c.e, 0.0f, 6);
                dhlVar4.g(new e5u((p3v) null, "spread"));
                break;
            case 4:
                dhl dhlVar5 = (dhl) obj;
                xid.r(dhlVar5.d, ihlVar2.f, 0.0f, 6);
                yf.p(dhlVar5.e, ihlVar.g, 0.0f, 6);
                xid xidVar = dhlVar5.f;
                ihl ihlVar3 = dhlVar5.c;
                xid.r(xidVar, ihlVar3.f, 0.0f, 6);
                yf.p(dhlVar5.g, ihlVar3.g, 0.0f, 6);
                dhlVar5.g(new e5u((p3v) null, "spread"));
                break;
            case 5:
                dhl dhlVar6 = (dhl) obj;
                hrt.m(null, "parent", dhlVar6, null, "spread");
                yf.p(dhlVar6.e, ihlVar2.e, -48.0f, 4);
                yf.p(dhlVar6.g, ihlVar.g, 0.0f, 6);
                break;
            case 6:
                dhl dhlVar7 = (dhl) obj;
                xid.r(dhlVar7.d, dhlVar7.c.d, 0.0f, 6);
                xid.r(dhlVar7.f, ihlVar2.f, 0.0f, 6);
                dhlVar7.g(new e5u((p3v) null, "spread"));
                yf.p(dhlVar7.e, ihlVar.e, 0.0f, 6);
                yf.p(dhlVar7.g, ihlVar.g, 0.0f, 6);
                dhlVar7.f(new e5u((p3v) null, "spread"));
                break;
            default:
                dhl dhlVar8 = (dhl) obj;
                xid.r(dhlVar8.d, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar8.f, ihlVar.d, 0.0f, 6);
                hrt.m(null, "spread", dhlVar8, null, "wrap");
                dhl.b(dhlVar8, dhlVar8.c);
                break;
        }
        return rih1Var;
    }
}
