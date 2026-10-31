package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4m1 {
    public final c9n a;
    public final q8n b;
    public final dai1 c;
    public final xgn0 d = ygn0.a();
    public volatile dma1 e;

    public y4m1(Context context, gn20 gn20Var, mr20 mr20Var, c9n c9nVar, q8n q8nVar) {
        this.a = c9nVar;
        this.b = q8nVar;
        this.c = new dai1(context, gn20Var, mr20Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        p4m1 p4m1Var;
        if (onmVar instanceof p4m1) {
            p4m1Var = (p4m1) onmVar;
            int i = p4m1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p4m1Var.c = i - Integer.MIN_VALUE;
            } else {
                p4m1Var = new p4m1(this, onmVar);
            }
        } else {
            p4m1Var = new p4m1(this, onmVar);
        }
        Object objA = p4m1Var.a;
        d9n d9nVar = d9n.a;
        int i2 = p4m1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            dma1 dma1Var = this.e;
            if (dma1Var != null) {
                return dma1Var;
            }
            dai1 dai1Var = this.c;
            p4m1Var.c = 1;
            objA = dai1Var.a(p4m1Var);
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        dma1 dma1Var2 = (dma1) objA;
        this.e = dma1Var2;
        return dma1Var2;
    }

    public final evz b(String str) {
        return h5p1.s(h4p1.l(new t4m1(this, ezl1.a, str, (lnm) null, (byte) 0)), h4p1.l(new t4m1(this, ezl1.b, str, (lnm) null, (byte) 0)), h4p1.l(new t4m1(this, ezl1.c, str, (lnm) null, (byte) 1)), new ryu());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar, boolean z) {
        v4m1 v4m1Var;
        if (onmVar instanceof v4m1) {
            v4m1Var = (v4m1) onmVar;
            int i = v4m1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v4m1Var.e = i - Integer.MIN_VALUE;
            } else {
                v4m1Var = new v4m1(this, onmVar);
            }
        } else {
            v4m1Var = new v4m1(this, onmVar);
        }
        Object objA = v4m1Var.c;
        int i2 = v4m1Var.e;
        if (i2 == 0) {
            hm5.M(objA);
            v4m1Var.a = str;
            v4m1Var.b = z;
            v4m1Var.e = 1;
            objA = a(v4m1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = v4m1Var.b;
            str = v4m1Var.a;
            hm5.M(objA);
        }
        dma1 dma1Var = (dma1) objA;
        bma1 bma1Var = ezl1.c;
        Set setO1 = o7h.o1(dma1Var.a(bma1Var));
        if (z) {
            setO1.add(str);
        } else {
            setO1.remove(str);
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.e(bma1Var, setO1);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(bma1 bma1Var, String str, boolean z, onm onmVar) {
        w4m1 w4m1Var;
        if (onmVar instanceof w4m1) {
            w4m1Var = (w4m1) onmVar;
            int i = w4m1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4m1Var.f = i - Integer.MIN_VALUE;
            } else {
                w4m1Var = new w4m1(this, onmVar);
            }
        } else {
            w4m1Var = new w4m1(this, onmVar);
        }
        Object objA = w4m1Var.d;
        int i2 = w4m1Var.f;
        if (i2 == 0) {
            hm5.M(objA);
            w4m1Var.a = bma1Var;
            w4m1Var.b = str;
            w4m1Var.c = z;
            w4m1Var.f = 1;
            objA = a(w4m1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = w4m1Var.c;
            str = w4m1Var.b;
            bma1Var = w4m1Var.a;
            hm5.M(objA);
        }
        dma1 dma1Var = (dma1) objA;
        Set setO1 = o7h.o1(dma1Var.a(bma1Var));
        if (z) {
            setO1.remove(str);
        } else {
            setO1.add(str);
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.e(bma1Var, setO1);
        hma1VarEdit.g();
        return rih1.a;
    }

    public final Object e(String str, onm onmVar, boolean z) {
        Object objH = c921.H(this.b, new x4m1(this, str, z, (lnm) null, (byte) 2), onmVar);
        return objH == d9n.a ? objH : rih1.a;
    }
}
