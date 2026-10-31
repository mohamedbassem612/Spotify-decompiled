package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class odg extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pdg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ odg(pdg pdgVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pdgVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pdg pdgVar = this.c;
        switch (b) {
            case 0:
                return new odg(pdgVar, lnmVar, (byte) 0);
            default:
                return new odg(pdgVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        pdg pdgVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var = pdgVar.d;
                mdg mdgVar = pdgVar.f;
                String str = mdgVar.a;
                String str2 = mdgVar.b;
                this.b = true;
                xyc0 xyc0Var2 = xyc0Var;
                Object objH = c921.H(xyc0Var2.c, new qyc0(str, xyc0Var2, str2, (lnm) null, (byte) 0), this);
                return objH == d9nVar ? d9nVar : objH;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var3 = pdgVar.d;
                String str3 = pdgVar.f.a;
                this.b = true;
                Object objU = xyc0Var3.u(str3, ddd1.X, this);
                return objU == d9nVar ? d9nVar : objU;
        }
    }
}
