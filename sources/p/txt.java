package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class txt implements vr20 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public txt(yqg yqgVar, o811 o811Var, long j, vr20 vr20Var) {
        this.c = yqgVar;
        this.d = o811Var;
        this.b = j;
        this.e = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final Object emit(Object obj, lnm lnmVar) {
        ryt rytVar;
        Object objEmit;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        long j = this.b;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                p811 p811Var = (p811) obj4;
                p811 p811Var2 = (p811) obj3;
                faa0 faa0Var = (faa0) p811Var2.a;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                Object obj5 = p811Var.a;
                if (obj5 != null) {
                    rxt rxtVar = (rxt) obj5;
                    obj = (rxt) obj;
                    if (rxtVar.a) {
                        obj = rxtVar;
                    }
                }
                p811Var.a = obj;
                ssw0 ssw0Var = (ssw0) obj2;
                p811Var2.a = fn31.T(ssw0Var, (o8n) null, 0, new d6(this.b, p811Var, ssw0Var, (lnm) null), 3);
                return rih1Var;
            case 1:
                o811 o811Var = (o811) obj4;
                long jB = ((yqg) obj3).b();
                if (!((rxt) obj).a && jB - o811Var.a < j) {
                    return rih1Var;
                }
                o811Var.a = jB;
                Object objEmit2 = ((vr20) obj2).emit(obj, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case 2:
                if (lnmVar instanceof ryt) {
                    rytVar = (ryt) lnmVar;
                    int i = rytVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rytVar.b = i - Integer.MIN_VALUE;
                    } else {
                        rytVar = new ryt(this, lnmVar);
                    }
                } else {
                    rytVar = new ryt(this, lnmVar);
                }
                Object obj6 = rytVar.a;
                int i2 = rytVar.b;
                if (i2 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var = (vr20) obj3;
                    nzt nztVarJ = ezt.j((szt) obj, (oxt) obj4);
                    if (nztVarJ != null && (nztVarJ.b != ((iwc1) obj2) || nztVarJ.c > j)) {
                        rytVar.b = 1;
                        if (vr20Var.emit(obj, rytVar) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            default:
                long jB2 = ((iae1) obj4).b.b();
                p811 p811Var3 = (p811) obj3;
                Object obj7 = p811Var3.a;
                if (obj7 != null) {
                    return (jB2 - ((Number) obj7).longValue() >= j && (objEmit = ((vr20) obj2).emit(obj, lnmVar)) == d9nVar) ? objEmit : rih1Var;
                }
                p811Var3.a = new Long(jB2);
                return rih1Var;
        }
    }

    public txt(vr20 vr20Var, ezt eztVar, oxt oxtVar, iwc1 iwc1Var, long j) {
        this.c = vr20Var;
        this.d = oxtVar;
        this.e = iwc1Var;
        this.b = j;
    }

    public txt(p811 p811Var, p811 p811Var2, ssw0 ssw0Var, long j) {
        this.c = p811Var;
        this.d = p811Var2;
        this.e = ssw0Var;
        this.b = j;
    }

    public txt(iae1 iae1Var, p811 p811Var, long j, vr20 vr20Var) {
        this.d = iae1Var;
        this.c = p811Var;
        this.b = j;
        this.e = vr20Var;
    }
}
