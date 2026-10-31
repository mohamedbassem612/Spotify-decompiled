package p;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wnm0 extends weo0 {
    public final yo31 f;
    public final bbc g;
    public xab1 h;

    public wnm0(du41 du41Var, yo31 yo31Var, u98 u98Var, wat watVar) {
        super(du41Var, u98Var, watVar);
        this.f = yo31Var;
        this.g = mno1.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.TimeoutCancellationException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(wnm0 wnm0Var, p811 p811Var, m811 m811Var, du41 du41Var, p811 p811Var2, long j, onm onmVar) throws TimeoutCancellationException {
        vnm0 vnm0Var;
        m811 m811Var2;
        du41 du41Var2;
        p811 p811Var3;
        boolean z;
        if (onmVar instanceof vnm0) {
            vnm0Var = (vnm0) onmVar;
            int i = vnm0Var.g;
            if ((i & os00.INVALID_ID) != 0) {
                vnm0Var.g = i - os00.INVALID_ID;
            } else {
                vnm0Var = new vnm0(onmVar);
            }
        } else {
            vnm0Var = new vnm0(onmVar);
        }
        Object objO = vnm0Var.f;
        int i2 = vnm0Var.g;
        if (i2 == 0) {
            hm5.M(objO);
            if (j < 0) {
                return Boolean.FALSE;
            }
            uug0 uug0Var = new uug0(wnm0Var, (lnm) null, (byte) 15);
            vnm0Var.a = wnm0Var;
            vnm0Var.b = p811Var;
            vnm0Var.c = m811Var;
            vnm0Var.d = du41Var;
            vnm0Var.e = p811Var2;
            vnm0Var.g = 1;
            objO = rc2.O(j, uug0Var, vnm0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
            m811Var2 = m811Var;
            du41Var2 = du41Var;
            p811Var3 = p811Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811 p811Var4 = vnm0Var.e;
            du41 du41Var3 = vnm0Var.d;
            m811Var2 = vnm0Var.c;
            p811 p811Var5 = vnm0Var.b;
            wnm0 wnm0Var2 = vnm0Var.a;
            hm5.M(objO);
            p811Var3 = p811Var4;
            du41Var2 = du41Var3;
            p811Var = p811Var5;
            wnm0Var = wnm0Var2;
        }
        snm0 snm0Var = (snm0) objO;
        if (snm0Var != null) {
            boolean z2 = ((snm0) p811Var.a).c;
            long j2 = snm0Var.a;
            p811Var.a = new snm0(j2, snm0Var.b, z2);
            m811Var2.a = du41Var2.j(du41Var2.f(j2));
            p811Var3.a = prn1.a(30, 0.0f, 0.0f);
            jut jutVar = ((weo0) wnm0Var).e;
            long j3 = snm0Var.b;
            long j4 = snm0Var.a;
            ((sui1) jutVar.b).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((sui1) jutVar.c).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !dsa0.q(m811Var2.a);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static snm0 i(bbc bbcVar) {
        snm0 snm0Var = null;
        r561 r561VarA = j2h1.A(new xeo0(new rnm0(bbcVar, (byte) 0), null));
        while (r561VarA.hasNext()) {
            snm0 snm0VarA = (snm0) r561VarA.next();
            if (snm0Var != null) {
                snm0VarA = snm0Var.a(snm0VarA);
            }
            snm0Var = snm0VarA;
        }
        return snm0Var;
    }

    public final float c(cu41 cu41Var, float f) {
        du41 du41Var = ((weo0) this).a;
        long jI = du41Var.i(du41Var.e(f));
        du41 du41Var2 = cu41Var.a;
        return du41Var.h(du41Var.f(du41Var2.d(du41Var2.k, jI, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(du41 du41Var, snm0 snm0Var, float f, float f2, onm onmVar) {
        tnm0 tnm0Var;
        rih1 rih1Var;
        d9n d9nVar;
        m811 m811Var;
        float f3;
        du41 du41Var2;
        long jG;
        if (onmVar instanceof tnm0) {
            tnm0Var = (tnm0) onmVar;
            int i = tnm0Var.f;
            if ((i & os00.INVALID_ID) != 0) {
                tnm0Var.f = i - os00.INVALID_ID;
            } else {
                tnm0Var = new tnm0(this, onmVar);
            }
        } else {
            tnm0Var = new tnm0(this, onmVar);
        }
        tnm0 tnm0Var2 = tnm0Var;
        Object obj = tnm0Var2.d;
        int i2 = tnm0Var2.f;
        jut jutVar = ((weo0) this).e;
        rih1 rih1Var2 = rih1.a;
        d9n d9nVar2 = d9n.a;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            p811VarU.a = snm0Var;
            rih1Var = rih1Var2;
            long j = snm0Var.b;
            long j2 = snm0Var.a;
            ((sui1) jutVar.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((sui1) jutVar.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            snm0 snm0VarI = i(this.g);
            if (snm0VarI != null) {
                long j3 = snm0VarI.b;
                long j4 = snm0VarI.a;
                ((sui1) jutVar.b).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((sui1) jutVar.c).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                p811VarU.a = ((snm0) p811VarU.a).a(snm0VarI);
            }
            m811 m811Var2 = new m811();
            float fH = du41Var.h(du41Var.f(((snm0) p811VarU.a).a));
            m811Var2.a = fH;
            if (!dsa0.q(fH)) {
                p811 p811Var = new p811();
                p811Var.a = prn1.a(30, 0.0f, 0.0f);
                d9nVar = d9nVar2;
                unm0 unm0Var = new unm0(m811Var2, p811Var, p811VarU, f, this, f2, du41Var, null);
                tnm0Var2.a = du41Var;
                tnm0Var2.b = m811Var2;
                tnm0Var2.c = f2;
                tnm0Var2.f = 1;
                if (b(unm0Var, tnm0Var2) != d9nVar) {
                    m811Var = m811Var2;
                    f3 = f2;
                    du41Var2 = du41Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = tnm0Var2.c;
        m811Var = tnm0Var2.b;
        du41Var2 = tnm0Var2.a;
        hm5.M(obj);
        d9nVar = d9nVar2;
        rih1Var = rih1Var2;
        long jG2 = j2h1.g(((sui1) jutVar.b).c(Float.MAX_VALUE), ((sui1) jutVar.c).c(Float.MAX_VALUE));
        if (qui1.c(jG2)) {
            float fE = du41Var2.e(Math.signum(m811Var.a)) * Math.min(Math.abs(m811Var.a) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                jG = 0;
            } else {
                jG = du41Var2.d == qqq0.b ? j2h1.g(fE, 0.0f) : j2h1.g(0.0f, fE);
            }
            jG2 = jG;
        }
        qui1 qui1Var = new qui1(jG2);
        tnm0Var2.a = null;
        tnm0Var2.b = null;
        tnm0Var2.f = 2;
        return ((weo0) this).b.invoke(qui1Var, tnm0Var2) == d9nVar ? d9nVar : rih1Var;
    }

    public final boolean f(bav0 bav0Var) {
        boolean zD;
        long jB = this.f.b(((weo0) this).c, bav0Var);
        du41 du41Var = ((weo0) this).a;
        float fJ = du41Var.j(du41Var.f(jB));
        if (fJ == 0.0f) {
            zD = false;
        } else {
            ct41 ct41Var = du41Var.a;
            zD = fJ > 0.0f ? ct41Var.d() : ct41Var.c();
        }
        if (zD) {
            return !(this.g.l(new snm0(jB, ((hav0) o7h.q0(bav0Var.a)).b, false)) instanceof pge);
        }
        return ((weo0) this).d;
    }

    public final void g(bav0 bav0Var, cav0 cav0Var, long j) {
        if (bav0Var.f == 6) {
            List list = bav0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((hav0) list.get(i)).l()) {
                    return;
                }
            }
            if (cav0Var == cav0.a && ((weo0) this).d) {
                f(bav0Var);
                weo0.a(bav0Var);
            }
            if (cav0Var == cav0.b && !((weo0) this).d && f(bav0Var)) {
                weo0.a(bav0Var);
            }
        }
    }

    public final void h(c9n c9nVar) {
        if (this.h == null) {
            this.h = fn31.T(c9nVar, null, 0, new m2a0(this, (lnm) null, (byte) 28), 3);
        }
    }
}
