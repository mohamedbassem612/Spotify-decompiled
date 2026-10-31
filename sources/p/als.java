package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class als {
    public static final bma1 e = bma1.b.u("account_linking_not_linked");
    public final Context a;
    public final mr20 b;
    public final ut71 c;
    public final ep31 d;

    public als(Context context, mr20 mr20Var, ut71 ut71Var, ep31 ep31Var) {
        this.a = context;
        this.b = mr20Var;
        this.c = ut71Var;
        this.d = ep31Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        yks yksVar;
        dma1 dma1Var;
        if (onmVar instanceof yks) {
            yksVar = (yks) onmVar;
            int i = yksVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yksVar.d = i - Integer.MIN_VALUE;
            } else {
                yksVar = new yks(this, onmVar);
            }
        } else {
            yksVar = new yks(this, onmVar);
        }
        Object objB = yksVar.b;
        int i2 = yksVar.d;
        bma1 bma1Var = e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            yksVar.d = 1;
            objB = b(yksVar);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objB);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dma1Var = yksVar.a;
            hm5.M(objB);
        }
        if (((Boolean) objB).booleanValue()) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.a(bma1Var, false);
            hma1VarEdit.g();
        }
        return objB;
        dma1 dma1Var2 = (dma1) objB;
        if (!dma1Var2.h(bma1Var, true)) {
            return Boolean.TRUE;
        }
        Single singleFlatMap = ((ya10) this.d.b).a().flatMap(f2x0.i);
        yksVar.a = dma1Var2;
        yksVar.d = 2;
        Object objJ = fc11.j(singleFlatMap, yksVar);
        if (objJ != obj) {
            objB = objJ;
            dma1Var = dma1Var2;
            if (((Boolean) objB).booleanValue()) {
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.a(bma1Var, false);
                hma1VarEdit2.g();
            }
            return objB;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        zks zksVar;
        if (onmVar instanceof zks) {
            zksVar = (zks) onmVar;
            int i = zksVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zksVar.c = i - Integer.MIN_VALUE;
            } else {
                zksVar = new zks(this, onmVar);
            }
        } else {
            zksVar = new zks(this, onmVar);
        }
        Object objJ = zksVar.a;
        int i2 = zksVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            jte jteVar = new jte(2, (lnm) null, (byte) 20);
            zksVar.c = 1;
            objJ = b5p1.j(this.b, jteVar, zksVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return this.c.b(this.a, ((th61) objJ).a);
    }
}
