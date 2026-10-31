package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h6d0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ ucd c;
    public final /* synthetic */ Context d;

    public /* synthetic */ h6d0(vr20 vr20Var, ucd ucdVar, Context context, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = ucdVar;
        this.d = context;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        g6d0 g6d0Var;
        w6d0 w6d0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Context context = this.d;
        ucd ucdVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        dma1 dma1VarB = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof g6d0) {
                    g6d0Var = (g6d0) lnmVar;
                    int i = g6d0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        g6d0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        g6d0Var = new g6d0(this, lnmVar);
                    }
                } else {
                    g6d0Var = new g6d0(this, lnmVar);
                }
                Object obj2 = g6d0Var.a;
                int i2 = g6d0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                th61 th61Var = (th61) obj;
                if (th61Var.b) {
                    dma1VarB = ucdVar.b.b(context, th61Var.a);
                }
                g6d0Var.b = 1;
                return vr20Var.emit(dma1VarB, g6d0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof w6d0) {
                    w6d0Var = (w6d0) lnmVar;
                    int i3 = w6d0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        w6d0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        w6d0Var = new w6d0(this, lnmVar);
                    }
                } else {
                    w6d0Var = new w6d0(this, lnmVar);
                }
                Object obj3 = w6d0Var.a;
                int i4 = w6d0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                th61 th61Var2 = (th61) obj;
                if (th61Var2.b) {
                    dma1VarB = ucdVar.b.b(context, th61Var2.a);
                }
                w6d0Var.b = 1;
                return vr20Var.emit(dma1VarB, w6d0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
