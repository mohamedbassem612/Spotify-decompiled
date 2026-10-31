package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nij1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ihl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nij1(ihl ihlVar, byte b) {
        super(1);
        this.a = b;
        this.b = ihlVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ihl ihlVar = this.b;
        switch (b) {
            case 0:
                dhl dhlVar = (dhl) obj;
                xid.r(dhlVar.d, ihlVar.d, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                yf.p(dhlVar.g, ihlVar.g, 0.0f, 6);
                break;
            case 1:
                dhl dhlVar2 = (dhl) obj;
                xid.r(dhlVar2.f, ihlVar.f, 14.0f, 4);
                dhl.b(dhlVar2, dhlVar2.c);
                break;
            case 2:
                dhl dhlVar3 = (dhl) obj;
                xid.r(dhlVar3.f, ihlVar.f, 16.0f, 4);
                dhl.b(dhlVar3, dhlVar3.c);
                break;
            case 3:
                dhl dhlVar4 = (dhl) obj;
                xid.r(dhlVar4.f, ihlVar.f, 14.0f, 4);
                dhl.b(dhlVar4, dhlVar4.c);
                break;
            case 4:
                dhl dhlVar5 = (dhl) obj;
                xid.r(dhlVar5.f, ihlVar.f, 16.0f, 4);
                dhl.b(dhlVar5, dhlVar5.c);
                break;
            case 5:
                dhl dhlVar6 = (dhl) obj;
                xid.r(dhlVar6.f, ihlVar.f, 16.0f, 4);
                dhl.b(dhlVar6, dhlVar6.c);
                break;
            case 6:
                dhl.e((dhl) obj, ihlVar.d, ihlVar.e, ihlVar.f, ihlVar.g);
                break;
            case 7:
                dhl dhlVar7 = (dhl) obj;
                yf.p(dhlVar7.e, dhlVar7.c.e, 0.0f, 6);
                yf.p(dhlVar7.g, ihlVar.e, 0.0f, 6);
                hrt.m((p3v) null, "parent", dhlVar7, (p3v) null, "spread");
                break;
            default:
                dhl dhlVar8 = (dhl) obj;
                xid xidVar = dhlVar8.d;
                ihl ihlVar2 = dhlVar8.c;
                xid.r(xidVar, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar8.f, ihlVar2.f, 0.0f, 6);
                yf.p(dhlVar8.g, ihlVar.g, 0.0f, 6);
                break;
        }
        return rih1Var;
    }
}
