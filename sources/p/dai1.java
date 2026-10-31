package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dai1 {
    public final Context a;
    public final gn20 b;
    public final mr20 c;
    public volatile dma1 d;

    public dai1(Context context, gn20 gn20Var, mr20 mr20Var) {
        this.a = context;
        this.b = gn20Var;
        this.c = rqt0.u(new xkb1(new jha1(mr20Var, (byte) 28), (byte) 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        aai1 aai1Var;
        if (onmVar instanceof aai1) {
            aai1Var = (aai1) onmVar;
            int i = aai1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aai1Var.d = i - Integer.MIN_VALUE;
            } else {
                aai1Var = new aai1(this, onmVar);
            }
        } else {
            aai1Var = new aai1(this, onmVar);
        }
        Object objI = aai1Var.b;
        d9n d9nVar = d9n.a;
        int i2 = aai1Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            dma1 dma1Var = this.d;
            if (dma1Var != null) {
                return dma1Var;
            }
            mr20 mr20Var = this.c;
            aai1Var.a = this;
            aai1Var.d = 1;
            objI = b5p1.i(mr20Var, aai1Var);
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = aai1Var.a;
            hm5.M(objI);
        }
        gn20 gn20Var = this.b;
        Context context = this.a;
        dma1 dma1VarB = gn20Var.a.b(context, (String) objI);
        this.d = dma1VarB;
        return dma1VarB;
    }
}
