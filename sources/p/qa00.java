package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qa00 {
    public final uu00 a;
    public final q8n b;

    public /* synthetic */ qa00(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = q8nVar;
    }

    public static String a(mq70 mq70Var) {
        String str;
        up70 up70VarA = mq70Var.a(vp70.e);
        if (up70VarA == null && (up70VarA = mq70Var.a(vp70.c)) == null) {
            up70VarA = (up70) o7h.s0(mq70Var.a);
        }
        if (up70VarA == null || (str = up70VarA.a.a) == null || ihc1.y0(str)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(ma00 ma00Var, onm onmVar) {
        oa00 oa00Var;
        p811 p811Var;
        if (onmVar instanceof oa00) {
            oa00Var = (oa00) onmVar;
            int i = oa00Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oa00Var.e = i - Integer.MIN_VALUE;
            } else {
                oa00Var = new oa00(this, onmVar);
            }
        } else {
            oa00Var = new oa00(this, onmVar);
        }
        Object objP = oa00Var.c;
        int i2 = oa00Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                oi oiVar = new oi("concert-entity-page-event-hero", false, new nty(ma00Var, (byte) 24));
                p811 p811Var2 = new p811();
                evz evzVar = new evz(f5p1.q(o4p1.r(yoi1.g(this.a.b(oiVar)), this.b), new hak(p811Var2, (lnm) null, (byte) 1)), ma00Var, (byte) 1);
                long jA = ra00.a();
                ett ettVar = new ett(evzVar, (lnm) null, (byte) 24);
                oa00Var.a = ma00Var;
                oa00Var.b = p811Var2;
                oa00Var.e = 1;
                objP = rc2.P(jA, ettVar, oa00Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                p811Var = p811Var2;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811Var = oa00Var.b;
                ma00Var = oa00Var.a;
                hm5.M(objP);
            }
            uv00 uv00Var = (uv00) objP;
            if (uv00Var == null && p811Var.a == null) {
                Logger.k("Timed out resolving event hero metadata for %s", new Object[]{ma00Var.e()});
            }
            return uv00Var == null ? (uv00) p811Var.a : uv00Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to resolve event hero metadata for %s", new Object[]{ma00Var.e()});
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, hz00 hz00Var, onm onmVar) {
        anj0 anj0Var;
        if (onmVar instanceof anj0) {
            anj0Var = (anj0) onmVar;
            int i = anj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                anj0Var.c = i - Integer.MIN_VALUE;
            } else {
                anj0Var = new anj0(this, onmVar);
            }
        } else {
            anj0Var = new anj0(this, onmVar);
        }
        Object objH = anj0Var.a;
        int i2 = anj0Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            v4e0 v4e0Var = new v4e0(hz00Var, this, str, (lnm) null, (byte) 26);
            anj0Var.c = 1;
            objH = c921.H(this.b, v4e0Var, anj0Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(ma00 ma00Var, onm onmVar) {
        pa00 pa00Var;
        String strA;
        mq70 mq70Var;
        String strC;
        afx afxVar;
        pp70 pp70Var;
        mq70 mq70Var2;
        pp70 pp70Var2;
        String str;
        mq70 mq70Var3;
        if (onmVar instanceof pa00) {
            pa00Var = (pa00) onmVar;
            int i = pa00Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pa00Var.d = i - Integer.MIN_VALUE;
            } else {
                pa00Var = new pa00(this, onmVar);
            }
        } else {
            pa00Var = new pa00(this, onmVar);
        }
        Object objB = pa00Var.b;
        int i2 = pa00Var.d;
        if (i2 == 0) {
            hm5.M(objB);
            pa00Var.a = ma00Var;
            pa00Var.d = 1;
            objB = b(ma00Var, pa00Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ma00Var = pa00Var.a;
            hm5.M(objB);
        }
        uv00 uv00Var = (uv00) objB;
        if (uv00Var == null) {
            return ma00Var;
        }
        xkk1 xkk1Var = uv00Var.a(xkk1.class, ma00Var.e()).b;
        m6k m6kVar = uv00Var.a(m6k.class, ma00Var.e()).b;
        if (xkk1Var == null || (mq70Var3 = xkk1Var.a) == null || (strA = a(mq70Var3)) == null) {
            strA = (xkk1Var == null || (mq70Var = xkk1Var.e) == null) ? null : a(mq70Var);
            if (strA == null) {
                strA = ma00Var.b();
            }
        }
        if (ma00Var.d() != 2) {
            strC = ma00Var.c();
        } else if (m6kVar != null) {
            strC = m6kVar.c;
            if (ihc1.y0(strC)) {
                strC = null;
            }
            if (strC == null) {
                if (m6kVar != null) {
                    str = m6kVar.b;
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    strC = str;
                } else {
                    strC = null;
                }
                if (strC == null) {
                    strC = ma00Var.c();
                }
            }
        } else {
            if (m6kVar != null) {
                str = m6kVar.b;
                if (ihc1.y0(str)) {
                    str = null;
                }
                strC = str;
            } else {
                strC = null;
            }
            if (strC == null) {
                strC = ma00Var.c();
            }
        }
        if (ma00Var.d() != 2) {
            afxVar = null;
        } else if (xkk1Var != null && (mq70Var2 = xkk1Var.a) != null && (pp70Var2 = mq70Var2.b) != null) {
            afxVar = pp70Var2.c;
        } else if (xkk1Var == null || (pp70Var = xkk1Var.d) == null) {
            afxVar = null;
        } else {
            afxVar = pp70Var.c;
        }
        return ma00.a(ma00Var, strA, strC, afxVar != null ? yah0.p(z4p1.G(afxVar.a.c)) : null, afxVar != null ? yah0.p(z4p1.G(afxVar.b.b)) : null);
    }
}
