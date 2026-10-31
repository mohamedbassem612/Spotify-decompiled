package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fs21 {
    public final xrk a;
    public final br21 b;
    public final wq21 c;

    public fs21(xrk xrkVar, br21 br21Var, wq21 wq21Var) {
        this.a = xrkVar;
        this.b = br21Var;
        this.c = wq21Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wa71 wa71Var, lnm lnmVar) {
        es21 es21Var;
        u771 u771Var;
        if (lnmVar instanceof es21) {
            es21Var = (es21) lnmVar;
            int i = es21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                es21Var.d = i - Integer.MIN_VALUE;
            } else {
                es21Var = new es21(this, lnmVar);
            }
        } else {
            es21Var = new es21(this, lnmVar);
        }
        Object objO = es21Var.b;
        int i2 = es21Var.d;
        wq21 wq21Var = this.c;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                if (this.a.r) {
                    d821 d821Var = new d821(this, wa71Var, (lnm) null, (byte) 9);
                    es21Var.a = wa71Var;
                    es21Var.d = 2;
                    objO = rc2.O(8000L, d821Var, es21Var);
                    if (objO == d9nVar) {
                    }
                } else {
                    es21Var.a = null;
                    es21Var.d = 1;
                    Object objA = wq21Var.a(wa71Var, es21Var);
                    if (objA != d9nVar) {
                        return objA;
                    }
                }
            }
            if (i2 == 1) {
                hm5.M(objO);
                return objO;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objO);
                    return objO;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wa71Var = es21Var.a;
            hm5.M(objO);
            u771Var = (u771) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            u771Var = null;
        }
        if (u771Var != null) {
            return u771Var;
        }
        es21Var.a = null;
        es21Var.d = 3;
        Object objA2 = wq21Var.a(wa71Var, es21Var);
        return objA2 == d9nVar ? d9nVar : objA2;
    }
}
