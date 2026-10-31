package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g7u implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ yjq c;

    public /* synthetic */ g7u(vr20 vr20Var, yjq yjqVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = yjqVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        f7u f7uVar;
        i7u i7uVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yjq yjqVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof f7u) {
                    f7uVar = (f7u) lnmVar;
                    int i = f7uVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        f7uVar.b = i - Integer.MIN_VALUE;
                    } else {
                        f7uVar = new f7u(this, lnmVar);
                    }
                } else {
                    f7uVar = new f7u(this, lnmVar);
                }
                Object obj2 = f7uVar.a;
                int i2 = f7uVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                long jG = ((dma1) obj).g((bma1) yjqVar.e, 0L);
                Boolean boolValueOf = Boolean.valueOf(jG == 0 || ((yqg) yjqVar.b).b() - jG > 2592000000L);
                f7uVar.b = 1;
                return vr20Var.emit(boolValueOf, f7uVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof i7u) {
                    i7uVar = (i7u) lnmVar;
                    int i3 = i7uVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        i7uVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        i7uVar = new i7u(this, lnmVar);
                    }
                } else {
                    i7uVar = new i7u(this, lnmVar);
                }
                Object obj3 = i7uVar.a;
                int i4 = i7uVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    dma1 dma1VarB = ((ut71) yjqVar.d).b((Context) yjqVar.c, ((th61) obj).a);
                    i7uVar.b = 1;
                    return vr20Var.emit(dma1VarB, i7uVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
