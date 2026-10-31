package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x6d0 {
    public final i6d0 a;

    public x6d0(Context context, mr20 mr20Var, ucd ucdVar) {
        this.a = new i6d0(mr20Var, ucdVar, context, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        u6d0 u6d0Var;
        if (onmVar instanceof u6d0) {
            u6d0Var = (u6d0) onmVar;
            int i = u6d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u6d0Var.c = i - Integer.MIN_VALUE;
            } else {
                u6d0Var = new u6d0(this, onmVar);
            }
        } else {
            u6d0Var = new u6d0(this, onmVar);
        }
        Object objK = u6d0Var.a;
        int i2 = u6d0Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            u6d0Var.c = 1;
            objK = b5p1.k(this.a, u6d0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        dma1 dma1Var = (dma1) objK;
        return Boolean.valueOf(dma1Var != null ? dma1Var.h(y6d0.a, false) : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        v6d0 v6d0Var;
        if (onmVar instanceof v6d0) {
            v6d0Var = (v6d0) onmVar;
            int i = v6d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v6d0Var.c = i - Integer.MIN_VALUE;
            } else {
                v6d0Var = new v6d0(this, onmVar);
            }
        } else {
            v6d0Var = new v6d0(this, onmVar);
        }
        Object objK = v6d0Var.a;
        int i2 = v6d0Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            v6d0Var.c = 1;
            objK = b5p1.k(this.a, v6d0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        dma1 dma1Var = (dma1) objK;
        if (dma1Var != null) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.a(y6d0.a, true);
            hma1VarEdit.g();
        }
        return rih1.a;
    }
}
