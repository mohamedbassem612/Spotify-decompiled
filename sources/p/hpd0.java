package p;

import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hpd0 implements hj71 {
    public final xrk a;
    public final fs21 b;
    public final br21 c;

    public hpd0(xrk xrkVar, fs21 fs21Var, br21 br21Var) {
        this.a = xrkVar;
        this.b = fs21Var;
        this.c = br21Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(vu30 vu30Var, wa71 wa71Var, onm onmVar) {
        epd0 epd0Var;
        if (onmVar instanceof epd0) {
            epd0Var = (epd0) onmVar;
            int i = epd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                epd0Var.c = i - Integer.MIN_VALUE;
            } else {
                epd0Var = new epd0(this, onmVar);
            }
        } else {
            epd0Var = new epd0(this, onmVar);
        }
        Object objInvoke = epd0Var.a;
        int i2 = epd0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                epd0Var.c = 1;
                objInvoke = vu30Var.invoke(wa71Var, epd0Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objInvoke);
            }
            return (u771) objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        fpd0 fpd0Var;
        jlw0 jlw0Var;
        if (onmVar instanceof fpd0) {
            fpd0Var = (fpd0) onmVar;
            int i = fpd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fpd0Var.c = i - Integer.MIN_VALUE;
            } else {
                fpd0Var = new fpd0(this, onmVar);
            }
        } else {
            fpd0Var = new fpd0(this, onmVar);
        }
        Object objA = fpd0Var.a;
        int i2 = fpd0Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objA);
            if (this.a.p) {
                vu30 q4d0Var = new q4d0(this, lnmVar, (byte) 12);
                wa71 wa71Var = new wa71(str, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126);
                fpd0Var.c = 1;
                objA = a(q4d0Var, wa71Var, fpd0Var);
                Object obj = d9n.a;
                if (objA == obj) {
                    return obj;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objA);
        u771 u771Var = (u771) objA;
        if (u771Var != null) {
            g0a g0aVar = u771Var.b.b;
            g0a g0aVar2 = g0aVar instanceof g0a ? g0aVar : null;
            if (g0aVar2 != null && (jlw0Var = g0aVar2.b) != null) {
                return new wr21(jlw0Var.a, jlw0Var.b);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(gs21 gs21Var, onm onmVar) {
        gpd0 gpd0Var;
        if (onmVar instanceof gpd0) {
            gpd0Var = (gpd0) onmVar;
            int i = gpd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gpd0Var.c = i - Integer.MIN_VALUE;
            } else {
                gpd0Var = new gpd0(this, onmVar);
            }
        } else {
            gpd0Var = new gpd0(this, onmVar);
        }
        Object objO = gpd0Var.a;
        int i2 = gpd0Var.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                if (this.a.b) {
                    q4d0 q4d0Var = new q4d0(this, gs21Var, lnmVar, (byte) 13);
                    gpd0Var.c = 1;
                    objO = rc2.O(8000L, q4d0Var, gpd0Var);
                    d9n d9nVar = d9n.a;
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
            return (wr21) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object n(k371 k371Var, lnm lnmVar) {
        dpd0 dpd0Var;
        wa71 wa71Var;
        blc0 m231Var;
        if (lnmVar instanceof dpd0) {
            dpd0Var = (dpd0) lnmVar;
            int i = dpd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpd0Var.c = i - Integer.MIN_VALUE;
            } else {
                dpd0Var = new dpd0(this, (onm) lnmVar);
            }
        } else {
            dpd0Var = new dpd0(this, (onm) lnmVar);
        }
        dpd0 dpd0Var2 = dpd0Var;
        Object objA = dpd0Var2.a;
        int i2 = dpd0Var2.c;
        if (i2 == 0) {
            hm5.M(objA);
            if (this.a.p && (wa71Var = k371Var.a) != null) {
                try {
                    Set set = s4b1.f;
                    m231Var = uic.x(wa71Var.a).c;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                blc0 blc0Var = m231Var;
                if (blc0Var == blc0.U4 || blc0Var == blc0.X4) {
                    dpd0Var2.c = 1;
                    objA = a(new c4z(2, this.b, fs21.class, "load", "load(Lcom/spotify/share/models/ShareMenuData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 20), wa71Var, dpd0Var2);
                    Object obj = d9n.a;
                    if (objA == obj) {
                        return obj;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objA);
        u771 u771Var = (u771) objA;
        if (u771Var != null) {
            return new qj71(Collections.singletonList(u771Var), 0, puk.d);
        }
        return null;
    }
}
