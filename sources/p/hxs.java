package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hxs implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ txs c;
    public final /* synthetic */ s5l d;

    public /* synthetic */ hxs(vr20 vr20Var, txs txsVar, s5l s5lVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = txsVar;
        this.d = s5lVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        gxs gxsVar;
        mmr0 mmr0Var;
        kxs kxsVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s5l s5lVar = this.d;
        txs txsVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof gxs) {
                    gxsVar = (gxs) lnmVar;
                    int i = gxsVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gxsVar.b = i - Integer.MIN_VALUE;
                    } else {
                        gxsVar = new gxs(this, lnmVar);
                    }
                } else {
                    gxsVar = new gxs(this, lnmVar);
                }
                Object obj2 = gxsVar.a;
                int i2 = gxsVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                List list = (List) obj;
                pr31 pr31VarF = txsVar.f(s5lVar, list);
                if (pr31VarF == null) {
                    pr31VarF = txsVar.g(s5lVar, list);
                }
                mmr0Var = pr31VarF != null ? new mmr0(pr31VarF, list) : null;
                if (mmr0Var == null) {
                    return rih1Var;
                }
                gxsVar.b = 1;
                return vr20Var.emit(mmr0Var, gxsVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof kxs) {
                    kxsVar = (kxs) lnmVar;
                    int i3 = kxsVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kxsVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        kxsVar = new kxs(this, lnmVar);
                    }
                } else {
                    kxsVar = new kxs(this, lnmVar);
                }
                Object obj3 = kxsVar.a;
                int i4 = kxsVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                List list2 = (List) obj;
                pr31 pr31VarF2 = txsVar.f(s5lVar, list2);
                mmr0Var = pr31VarF2 != null ? new mmr0(pr31VarF2, list2) : null;
                if (mmr0Var == null) {
                    return rih1Var;
                }
                kxsVar.b = 1;
                return vr20Var.emit(mmr0Var, kxsVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
