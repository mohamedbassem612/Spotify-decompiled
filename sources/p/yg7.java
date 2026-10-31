package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yg7 {
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(x4k0 x4k0Var, onm onmVar) {
        e2e0 e2e0Var;
        if (onmVar instanceof e2e0) {
            e2e0Var = (e2e0) onmVar;
            int i = e2e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2e0Var.c = i - Integer.MIN_VALUE;
            } else {
                e2e0Var = new e2e0(this, onmVar);
            }
        } else {
            e2e0Var = new e2e0(this, onmVar);
        }
        Object objM = e2e0Var.a;
        int i2 = e2e0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                k1e0 k1e0Var = new k1e0(x4k0Var, this, (lnm) null, (byte) 1);
                e2e0Var.c = 1;
                objM = rc2.M(15000L, k1e0Var, e2e0Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objM);
            }
            return (m5k0) objM;
        } catch (TimeoutCancellationException e) {
            Logger.e(e, "Timed out loading extended version data", new Object[0]);
            return g5k0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.e(e3, "Failed to load extended version data", new Object[0]);
            return g5k0.a;
        }
    }

    public Single b(wu00 wu00Var) {
        if (q7h.V(wu00Var.a.values()).isEmpty()) {
            return Single.just(new xu00(b7x.a));
        }
        return this.a.b(new oi("assisted-curation", false, new gi00(wu00Var, (byte) 3))).filter(vrg.d1).timeout(10L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().map(new j3v(wu00Var, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, onm onmVar) {
        xg7 xg7Var;
        if (onmVar instanceof xg7) {
            xg7Var = (xg7) onmVar;
            int i = xg7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg7Var.c = i - Integer.MIN_VALUE;
            } else {
                xg7Var = new xg7(this, onmVar);
            }
        } else {
            xg7Var = new xg7(this, onmVar);
        }
        Object objL = xg7Var.a;
        int i2 = xg7Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.a.b(new oi("album-context-menu", false, new wk3(str, (byte) 16))).filter(cq41.h).map(new hdn1(str, (byte) 1));
            xg7Var.c = 1;
            objL = fc11.l(map, 1, (Object) null, xg7Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(uu00 uu00Var, oi oiVar, onm onmVar) {
        f2e0 f2e0Var;
        if (onmVar instanceof f2e0) {
            f2e0Var = (f2e0) onmVar;
            int i = f2e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2e0Var.c = i - Integer.MIN_VALUE;
            } else {
                f2e0Var = new f2e0(this, onmVar);
            }
        } else {
            f2e0Var = new f2e0(this, onmVar);
        }
        Object objJ = f2e0Var.a;
        int i2 = f2e0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ezc ezcVarG = yoi1.g(((zu00) uu00Var).b(oiVar));
            fca0 fca0Var = new fca0(2, (lnm) null, (byte) 8);
            f2e0Var.c = 1;
            objJ = b5p1.j(ezcVarG, fca0Var, f2e0Var);
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
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable e(List list, onm onmVar) {
        g2e0 g2e0Var;
        if (onmVar instanceof g2e0) {
            g2e0Var = (g2e0) onmVar;
            int i = g2e0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g2e0Var.d = i - Integer.MIN_VALUE;
            } else {
                g2e0Var = new g2e0(this, onmVar);
            }
        } else {
            g2e0Var = new g2e0(this, onmVar);
        }
        Object objD = g2e0Var.b;
        int i2 = g2e0Var.d;
        if (i2 == 0) {
            hm5.M(objD);
            oi oiVar = new oi("playlist-mixing-extended-versions", false, new nec0(list, (byte) 2));
            g2e0Var.a = list;
            g2e0Var.d = 1;
            objD = d(this.a, oiVar, g2e0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = g2e0Var.a;
            hm5.M(objD);
        }
        uv00 uv00Var = (uv00) objD;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : list) {
            if (uv00Var.a(hll.class, (String) obj).b != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
