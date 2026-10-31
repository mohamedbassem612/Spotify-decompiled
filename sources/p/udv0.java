package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class udv0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ uxd b;
    public /* synthetic */ yxd c;
    public /* synthetic */ rxd d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ dyd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udv0(dyd dydVar, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = dydVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dyd dydVar = this.f;
        uxd uxdVar = (uxd) obj;
        yxd yxdVar = (yxd) obj2;
        rxd rxdVar = (rxd) obj3;
        tqw tqwVar = (tqw) obj4;
        lnm lnmVar = (lnm) obj5;
        switch (b) {
            case 0:
                udv0 udv0Var = new udv0(dydVar, lnmVar, (byte) 0);
                udv0Var.b = uxdVar;
                udv0Var.c = yxdVar;
                udv0Var.d = rxdVar;
                udv0Var.e = tqwVar;
                udv0Var.invokeSuspend(rih1Var);
                break;
            default:
                udv0 udv0Var2 = new udv0(dydVar, lnmVar, (byte) 1);
                udv0Var2.b = uxdVar;
                udv0Var2.c = yxdVar;
                udv0Var2.d = rxdVar;
                udv0Var2.e = tqwVar;
                udv0Var2.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dyd dydVar = this.f;
        switch (b) {
            case 0:
                uxd uxdVar = this.b;
                yxd yxdVar = this.c;
                rxd rxdVar = this.d;
                tqw tqwVar = this.e;
                hm5.M(obj);
                dydVar.J(uxdVar, yxdVar, rxdVar, tqwVar);
                break;
            default:
                uxd uxdVar2 = this.b;
                yxd yxdVar2 = this.c;
                rxd rxdVar2 = this.d;
                tqw tqwVar2 = this.e;
                hm5.M(obj);
                dydVar.J(uxdVar2, yxdVar2, rxdVar2, tqwVar2);
                break;
        }
        return rih1Var;
    }
}
