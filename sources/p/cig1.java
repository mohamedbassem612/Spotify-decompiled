package p;

import com.spotify.alignedcuration.transitioncurationimpl.MixConversionException;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cig1 {
    public final dlg1 a;
    public final ptf1 b;
    public final owf1 c;
    public final kkg1 d;
    public final uu00 e;
    public final mwm1 f;

    public cig1(dlg1 dlg1Var, ptf1 ptf1Var, owf1 owf1Var, kkg1 kkg1Var, uu00 uu00Var, mwm1 mwm1Var) {
        this.a = dlg1Var;
        this.b = ptf1Var;
        this.c = owf1Var;
        this.d = kkg1Var;
        this.e = uu00Var;
        this.f = mwm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, String str3, String str4, boolean z, zxc0 zxc0Var, onm onmVar) {
        vhg1 vhg1Var;
        if (onmVar instanceof vhg1) {
            vhg1Var = (vhg1) onmVar;
            int i = vhg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vhg1Var.c = i - Integer.MIN_VALUE;
            } else {
                vhg1Var = new vhg1(this, onmVar);
            }
        } else {
            vhg1Var = new vhg1(this, onmVar);
        }
        vhg1 vhg1Var2 = vhg1Var;
        Object objF = vhg1Var2.a;
        int i2 = vhg1Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                dlg1 dlg1Var = this.a;
                vhg1Var2.c = 1;
                objF = dlg1Var.F(str2, str, str3, str4, z, zxc0Var, vhg1Var2);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            elg1 elg1Var = (elg1) objF;
            return new ugo(elg1Var.a, elg1Var.b);
        } catch (MixConversionException e) {
            return new sgo(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new tgo(e3);
        } catch (TimeoutCancellationException e4) {
            op71.x(vhg1Var2.getContext());
            return new tgo(e4);
        }
    }

    public final Object b(String str, List list, onm onmVar) {
        if (!list.isEmpty()) {
            this.d.getClass();
            lhg1 lhg1VarA = kkg1.a(str);
            if (lhg1VarA != null) {
                return smo1.s(new nsf1(list, this.c, lhg1VarA, (lnm) null, (byte) 5), onmVar);
            }
        }
        return w7x.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, onm onmVar) throws Throwable {
        zhg1 zhg1Var;
        String m231Var;
        mig1 mig1Var;
        if (onmVar instanceof zhg1) {
            zhg1Var = (zhg1) onmVar;
            int i = zhg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zhg1Var.c = i - Integer.MIN_VALUE;
            } else {
                zhg1Var = new zhg1(this, onmVar);
            }
        } else {
            zhg1Var = new zhg1(this, onmVar);
        }
        Object objJ = zhg1Var.a;
        int i2 = zhg1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleFirstOrError = this.e.b(new oi("aligned-curation", false, new ysf1(str, (byte) 11))).filter(icx0.T0).firstOrError();
                zhg1Var.c = 1;
                objJ = fc11.j(singleFirstOrError, zhg1Var);
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
            tv00 tv00Var = (tv00) o7h.s0(((uv00) objJ).b(mig1.class));
            m231Var = (tv00Var == null || (mig1Var = tv00Var.b) == null) ? null : mig1Var.f;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) throws Throwable {
        aig1 aig1Var;
        ruq0 ruq0Var;
        if (onmVar instanceof aig1) {
            aig1Var = (aig1) onmVar;
            int i = aig1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aig1Var.c = i - Integer.MIN_VALUE;
            } else {
                aig1Var = new aig1(this, onmVar);
            }
        } else {
            aig1Var = new aig1(this, onmVar);
        }
        Object objC = aig1Var.a;
        int i2 = aig1Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            aig1Var.c = 1;
            objC = c(str, aig1Var);
            Object obj = d9n.a;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        String str2 = (String) objC;
        if (str2 != null) {
            this.d.getClass();
            lhg1 lhg1VarA = kkg1.a(str2);
            if (lhg1VarA != null && (ruq0Var = lhg1VarA.b) != null) {
                return ruq0Var.a;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, onm onmVar) {
        big1 big1Var;
        if (onmVar instanceof big1) {
            big1Var = (big1) onmVar;
            int i = big1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                big1Var.c = i - Integer.MIN_VALUE;
            } else {
                big1Var = new big1(this, onmVar);
            }
        } else {
            big1Var = new big1(this, onmVar);
        }
        Object objU = big1Var.a;
        int i2 = big1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objU);
                this.d.getClass();
                lhg1 lhg1VarA = kkg1.a(str);
                if (lhg1VarA == null) {
                    return new chh1(new IllegalStateException("Could not decode transition"));
                }
                ptf1 ptf1Var = this.b;
                big1Var.c = 1;
                objU = ptf1Var.u(str2, lhg1VarA, big1Var);
                d9n d9nVar = d9n.a;
                if (objU == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objU);
            }
            return ((Boolean) objU).booleanValue() ? dhh1.a : new chh1(new IllegalStateException("Remove failed"));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new chh1(e2);
        }
    }
}
