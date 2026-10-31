package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class chl extends sgp0 {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ dhl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chl(dhl dhlVar) {
        super(wjk1.b);
        this.c = dhlVar;
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        aic aicVarA;
        byte b = this.b;
        dhl dhlVar = this.c;
        switch (b) {
            case 0:
                e5u e5uVar = (e5u) obj2;
                eic eicVar = dhlVar.b;
                String name = mma0Var.getName();
                gmt gmtVar = e5uVar.a;
                gmt gmtVar2 = e5uVar.c;
                gmt gmtVar3 = e5uVar.b;
                if (gmtVar3.k() && gmtVar2.k()) {
                    aicVarA = gmtVar.a();
                } else {
                    eic eicVar2 = new eic(new char[0]);
                    if (!gmtVar3.k()) {
                        eicVar2.I("min", gmtVar3.a());
                    }
                    if (!gmtVar2.k()) {
                        eicVar2.I("max", gmtVar2.a());
                    }
                    eicVar2.I("value", gmtVar.a());
                    aicVarA = eicVar2;
                }
                eicVar.I(name, aicVarA);
                break;
            default:
                dhlVar.b.K(mma0Var.getName(), ((wjk1) obj2).a);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chl(dhl dhlVar, e5u e5uVar) {
        super(e5uVar);
        this.c = dhlVar;
    }
}
