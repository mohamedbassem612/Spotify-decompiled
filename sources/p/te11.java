package p;

import com.spotify.connectivity.hosts.esperanto.proto.EsServiceType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class te11 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ by60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te11(by60 by60Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = by60Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                te11 te11Var = new te11(this.d, lnmVar, (byte) 0);
                te11Var.c = obj;
                return te11Var;
            default:
                te11 te11Var2 = new te11(this.d, lnmVar, (byte) 1);
                te11Var2.c = obj;
                return te11Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        by60 by60Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                be beVar = by60Var.a;
                grz grzVarN = EsServiceType.ServiceType.n();
                grzVarN.n(hrz.c);
                String strO = beVar.p(grzVarN.build()).o();
                this.c = null;
                this.b = true;
                return vr20Var.emit(strO, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                be beVar2 = by60Var.a;
                grz grzVarN2 = EsServiceType.ServiceType.n();
                grzVarN2.n(hrz.b);
                String strO2 = beVar2.p(grzVarN2.build()).o();
                this.c = null;
                this.b = true;
                return vr20Var2.emit(strO2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
