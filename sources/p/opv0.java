package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class opv0 {
    public final w6e0 a;
    public final o241 b;
    public final ptk c;
    public final abm d;

    public opv0(w6e0 w6e0Var, o241 o241Var, ptk ptkVar, abm abmVar) {
        this.a = w6e0Var;
        this.b = o241Var;
        this.c = ptkVar;
        this.d = abmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(w6e0 w6e0Var, String str, onm onmVar) {
        ipv0 ipv0Var;
        goj0 goj0VarA;
        if (onmVar instanceof ipv0) {
            ipv0Var = (ipv0) onmVar;
            int i = ipv0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ipv0Var.e = i - Integer.MIN_VALUE;
            } else {
                ipv0Var = new ipv0(this, onmVar);
            }
        } else {
            ipv0Var = new ipv0(this, onmVar);
        }
        Object obj = ipv0Var.c;
        int i2 = ipv0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.d.a()) {
                if (((ioj0) w6e0Var.n().a.getValue()).c(bql.class, str) == null) {
                    Map mapT = zno1.t(oqn1.n(str, Collections.singleton(new zp21(bql.class))));
                    ipv0Var.a = w6e0Var;
                    ipv0Var.b = str;
                    ipv0Var.e = 1;
                    Object objD = w6e0Var.d(mapT, ipv0Var);
                    d9n d9nVar = d9n.a;
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = ipv0Var.b;
        w6e0Var = ipv0Var.a;
        hm5.M(obj);
        hoj0 hoj0VarC = ((ioj0) w6e0Var.n().a.getValue()).c(bql.class, str);
        bql bqlVar = (bql) ((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA.a);
        if (bqlVar != null) {
            return bqlVar.a;
        }
        return null;
    }

    public final mr20 b(String str, ymd0 ymd0Var) {
        if (!this.c.b) {
            return h4p1.m((Object) null);
        }
        o241 o241Var = this.b;
        return ymd0Var != null ? hu20.e(rqt0.u(new uop0(yoi1.g(((p241) o241Var).a), (byte) 19)), new m53(this, ymd0Var, str, (lnm) null, (byte) 10)) : hu20.e(rqt0.u(new uop0(yoi1.g(((p241) o241Var).a), (byte) 19)), new c6e0((byte) 12, this, str, (lnm) null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        npv0 npv0Var;
        if (onmVar instanceof npv0) {
            npv0Var = (npv0) onmVar;
            int i = npv0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                npv0Var.c = i - Integer.MIN_VALUE;
            } else {
                npv0Var = new npv0(this, onmVar);
            }
        } else {
            npv0Var = new npv0(this, onmVar);
        }
        Object objA = npv0Var.a;
        int i2 = npv0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            npv0Var.c = 1;
            objA = a(this.a, str, npv0Var);
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
        return u890.j((lql) objA, kql.a) ? gpe0.a : fpe0.a;
    }
}
