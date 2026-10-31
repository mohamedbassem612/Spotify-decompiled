package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j6d0 {
    public final i6d0 a;

    public j6d0(Context context, mr20 mr20Var, ucd ucdVar) {
        this.a = new i6d0(mr20Var, ucdVar, context, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        e6d0 e6d0Var;
        if (onmVar instanceof e6d0) {
            e6d0Var = (e6d0) onmVar;
            int i = e6d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e6d0Var.c = i - Integer.MIN_VALUE;
            } else {
                e6d0Var = new e6d0(this, onmVar);
            }
        } else {
            e6d0Var = new e6d0(this, onmVar);
        }
        Object objK = e6d0Var.a;
        int i2 = e6d0Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            e6d0Var.c = 1;
            objK = b5p1.k(this.a, e6d0Var);
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
        return Boolean.valueOf(dma1Var != null ? dma1Var.h(k6d0.a, false) : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        f6d0 f6d0Var;
        if (onmVar instanceof f6d0) {
            f6d0Var = (f6d0) onmVar;
            int i = f6d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6d0Var.c = i - Integer.MIN_VALUE;
            } else {
                f6d0Var = new f6d0(this, onmVar);
            }
        } else {
            f6d0Var = new f6d0(this, onmVar);
        }
        Object objK = f6d0Var.a;
        int i2 = f6d0Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            f6d0Var.c = 1;
            objK = b5p1.k(this.a, f6d0Var);
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
            hma1VarEdit.a(k6d0.a, true);
            hma1VarEdit.g();
        }
        return rih1.a;
    }
}
