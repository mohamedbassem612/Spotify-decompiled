package p;

import io.reactivex.rxjava3.core.Single;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ohm1 {
    public final Single a;

    public ohm1(Single single) {
        this.a = single;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        jhm1 jhm1Var;
        if (onmVar instanceof jhm1) {
            jhm1Var = (jhm1) onmVar;
            int i = jhm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jhm1Var.d = i - Integer.MIN_VALUE;
            } else {
                jhm1Var = new jhm1(this, onmVar);
            }
        } else {
            jhm1Var = new jhm1(this, onmVar);
        }
        Object objJ = jhm1Var.b;
        int i2 = jhm1Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            jhm1Var.a = str;
            jhm1Var.d = 1;
            objJ = fc11.j(this.a, jhm1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = jhm1Var.a;
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.f(bma1.b.n(str));
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        khm1 khm1Var;
        if (onmVar instanceof khm1) {
            khm1Var = (khm1) onmVar;
            int i = khm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                khm1Var.d = i - Integer.MIN_VALUE;
            } else {
                khm1Var = new khm1(this, onmVar);
            }
        } else {
            khm1Var = new khm1(this, onmVar);
        }
        Object objJ = khm1Var.b;
        int i2 = khm1Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            khm1Var.a = str;
            khm1Var.d = 1;
            objJ = fc11.j(this.a, khm1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = khm1Var.a;
            hm5.M(objJ);
        }
        return ((dma1) objJ).e(bma1.b.n(str), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        lhm1 lhm1Var;
        if (onmVar instanceof lhm1) {
            lhm1Var = (lhm1) onmVar;
            int i = lhm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lhm1Var.d = i - Integer.MIN_VALUE;
            } else {
                lhm1Var = new lhm1(this, onmVar);
            }
        } else {
            lhm1Var = new lhm1(this, onmVar);
        }
        Object objJ = lhm1Var.b;
        int i2 = lhm1Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            lhm1Var.a = str;
            lhm1Var.d = 1;
            objJ = fc11.j(this.a, lhm1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = lhm1Var.a;
            hm5.M(objJ);
        }
        return ((dma1) objJ).b(bma1.b.n(str), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, onm onmVar) {
        mhm1 mhm1Var;
        if (onmVar instanceof mhm1) {
            mhm1Var = (mhm1) onmVar;
            int i = mhm1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mhm1Var.e = i - Integer.MIN_VALUE;
            } else {
                mhm1Var = new mhm1(this, onmVar);
            }
        } else {
            mhm1Var = new mhm1(this, onmVar);
        }
        Object objJ = mhm1Var.c;
        int i2 = mhm1Var.e;
        if (i2 == 0) {
            hm5.M(objJ);
            mhm1Var.a = str;
            mhm1Var.b = str2;
            mhm1Var.e = 1;
            objJ = fc11.j(this.a, mhm1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = mhm1Var.b;
            str = mhm1Var.a;
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.d(bma1.b.n(str), str2);
        hma1VarEdit.g();
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, onm onmVar) {
        nhm1 nhm1Var;
        dma1 dma1Var;
        String str3;
        String str4;
        Set set;
        Set linkedHashSet;
        if (onmVar instanceof nhm1) {
            nhm1Var = (nhm1) onmVar;
            int i = nhm1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhm1Var.f = i - Integer.MIN_VALUE;
            } else {
                nhm1Var = new nhm1(this, onmVar);
            }
        } else {
            nhm1Var = new nhm1(this, onmVar);
        }
        Object objJ = nhm1Var.d;
        int i2 = nhm1Var.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            nhm1Var.a = str;
            nhm1Var.b = str2;
            nhm1Var.f = 1;
            objJ = fc11.j(this.a, nhm1Var);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            str2 = nhm1Var.b;
            str = nhm1Var.a;
            hm5.M(objJ);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dma1Var = nhm1Var.c;
            str4 = nhm1Var.b;
            str3 = nhm1Var.a;
            hm5.M(objJ);
        }
        set = (Set) objJ;
        if (set != null) {
            linkedHashSet = o7h.o1(set);
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        linkedHashSet.add(str4);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.e(bma1.b.n(str3), linkedHashSet);
        hma1VarEdit.g();
        return linkedHashSet;
        dma1 dma1Var2 = (dma1) objJ;
        nhm1Var.a = str;
        nhm1Var.b = str2;
        nhm1Var.c = dma1Var2;
        nhm1Var.f = 2;
        Object objC = c(str, nhm1Var);
        if (objC != d9nVar) {
            objJ = objC;
            dma1Var = dma1Var2;
            String str5 = str2;
            str3 = str;
            str4 = str5;
            set = (Set) objJ;
            if (set != null) {
                linkedHashSet = o7h.o1(set);
            } else {
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet.add(str4);
            hma1 hma1VarEdit2 = dma1Var.edit();
            hma1VarEdit2.e(bma1.b.n(str3), linkedHashSet);
            hma1VarEdit2.g();
            return linkedHashSet;
        }
        return d9nVar;
    }
}
