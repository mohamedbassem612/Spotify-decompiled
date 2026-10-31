package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sbi1 {
    public final co70 a;
    public final pbi1 b;

    public sbi1(co70 co70Var, pbi1 pbi1Var) {
        this.a = co70Var;
        this.b = pbi1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        qbi1 qbi1Var;
        if (onmVar instanceof qbi1) {
            qbi1Var = (qbi1) onmVar;
            int i = qbi1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qbi1Var.d = i - Integer.MIN_VALUE;
            } else {
                qbi1Var = new qbi1(this, onmVar);
            }
        } else {
            qbi1Var = new qbi1(this, onmVar);
        }
        Object objL = qbi1Var.b;
        int i2 = qbi1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                co70 co70Var = this.a;
                if (str2 == null) {
                    str2 = "";
                }
                qbi1Var.a = str;
                qbi1Var.d = 1;
                objL = bro1.l(co70Var, str, str2, qbi1Var);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = qbi1Var.a;
                hm5.M(objL);
            }
            tv21 tv21Var = (tv21) objL;
            if (tv21Var != null) {
                this.b.a.put(str, tv21Var);
                return tv21Var;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, onm onmVar) {
        rbi1 rbi1Var;
        tv21 tv21Var;
        if (onmVar instanceof rbi1) {
            rbi1Var = (rbi1) onmVar;
            int i = rbi1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbi1Var.c = i - Integer.MIN_VALUE;
            } else {
                rbi1Var = new rbi1(this, onmVar);
            }
        } else {
            rbi1Var = new rbi1(this, onmVar);
        }
        Object objA = rbi1Var.a;
        int i2 = rbi1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            if (str2 == null && (tv21Var = (tv21) this.b.a.get(str)) != null) {
                return tv21Var.a();
            }
            rbi1Var.c = 1;
            objA = a(str, str2, rbi1Var);
            d9n d9nVar = d9n.a;
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
        tv21 tv21Var2 = (tv21) objA;
        if (tv21Var2 == null) {
            return null;
        }
        return tv21Var2.a();
    }
}
