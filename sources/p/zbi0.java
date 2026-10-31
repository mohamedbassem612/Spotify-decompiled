package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zbi0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ hob1 b;
    public final /* synthetic */ kko c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbi0(kko kkoVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = kkoVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kko kkoVar = this.c;
        hob1 hob1Var = (hob1) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                zbi0 zbi0Var = new zbi0(kkoVar, lnmVar, (byte) 0);
                zbi0Var.b = hob1Var;
                zbi0Var.invokeSuspend(rih1Var);
                break;
            default:
                zbi0 zbi0Var2 = new zbi0(kkoVar, lnmVar, (byte) 1);
                zbi0Var2.b = hob1Var;
                zbi0Var2.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kko kkoVar = this.c;
        hob1 hob1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                uho uhoVar = hob1Var.p;
                if (hob1Var.A && uhoVar != null) {
                    kkoVar.c(Collections.singleton(uhoVar.a));
                }
                break;
            default:
                hm5.M(obj);
                uho uhoVar2 = hob1Var.p;
                if (hob1Var.A && uhoVar2 != null) {
                    kkoVar.c(Collections.singleton(uhoVar2.a));
                }
                break;
        }
        return rih1Var;
    }
}
