package p;

import j$.time.Instant;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u4q0 {
    public final k4q0 a;
    public final hrg1 b;
    public final yqg c;
    public final wn4 d;
    public final ov20 e;

    public u4q0(k4q0 k4q0Var, hrg1 hrg1Var, yqg yqgVar, wn4 wn4Var, ov20 ov20Var) {
        this.a = k4q0Var;
        this.b = hrg1Var;
        this.c = yqgVar;
        this.d = wn4Var;
        this.e = ov20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        m4q0 m4q0Var;
        if (onmVar instanceof m4q0) {
            m4q0Var = (m4q0) onmVar;
            int i = m4q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m4q0Var.c = i - Integer.MIN_VALUE;
            } else {
                m4q0Var = new m4q0(this, onmVar);
            }
        } else {
            m4q0Var = new m4q0(this, onmVar);
        }
        Object objP = m4q0Var.a;
        int i2 = m4q0Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            ytw0 ytw0Var = jfv.b;
            long jL0 = fdg1.l0(10L, ngv.SECONDS);
            i2p0 i2p0Var = new i2p0(this, (lnm) null, (byte) 4);
            m4q0Var.c = 1;
            objP = rc2.P(jL0, i2p0Var, m4q0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        Boolean bool = (Boolean) objP;
        return yah0.m(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae A[PHI: r11
      0x00ae: PHI (r11v16 java.lang.Object) = (r11v15 java.lang.Object), (r11v1 java.lang.Object) binds: [B:47:0x00ab, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r11 == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        if (r11 == r8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u4q0.b(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        p4q0 p4q0Var;
        Object objA;
        if (onmVar instanceof p4q0) {
            p4q0Var = (p4q0) onmVar;
            int i = p4q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p4q0Var.c = i - Integer.MIN_VALUE;
            } else {
                p4q0Var = new p4q0(this, onmVar);
            }
        } else {
            p4q0Var = new p4q0(this, onmVar);
        }
        Object obj = p4q0Var.a;
        int i2 = p4q0Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (h()) {
                p4q0Var.c = 1;
                objA = this.a.a(p4q0Var);
                if (objA != d9nVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        objA = ((e331) obj).a;
        if (objA instanceof m231) {
            objA = null;
        }
        org1 org1Var = (org1) objA;
        nrg1 nrg1Var = new nrg1(org1Var != null ? org1Var.b() : null, org1Var != null ? org1Var.c() : null, org1Var != null ? org1Var.d() : false, org1Var != null ? org1Var.a() : false);
        p4q0Var.c = 2;
        return this.b.m(nrg1Var, p4q0Var) == d9nVar ? d9nVar : rih1Var;
    }

    public final mr20 d() {
        wn4 wn4Var = this.d;
        boolean zC = wn4Var.c();
        ov20 ov20Var = this.e;
        hrg1 hrg1Var = this.b;
        if (zC) {
            return x4p1.h(rqt0.u(h5p1.t(u4p1.b0(d5p1.g(hrg1Var.d), new wqg1(hrg1Var, (lnm) null, (byte) 1)), lyg.w(ov20Var), new xq0(this))), new i440((byte) 25));
        }
        return wn4Var.e() ? x4p1.h(rqt0.u(h5p1.s(u4p1.b0(d5p1.g(hrg1Var.d), new wqg1(hrg1Var, (lnm) null, (byte) 1)), new sii0(u4p1.b0(d5p1.g(hrg1Var.e), new wqg1(hrg1Var, (lnm) null, (byte) 0)), this, (byte) 28), lyg.w(ov20Var), new ui(this))), new i440((byte) 26)) : h4p1.m(sig0.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        q4q0 q4q0Var;
        if (onmVar instanceof q4q0) {
            q4q0Var = (q4q0) onmVar;
            int i = q4q0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q4q0Var.d = i - Integer.MIN_VALUE;
            } else {
                q4q0Var = new q4q0(this, onmVar);
            }
        } else {
            q4q0Var = new q4q0(this, onmVar);
        }
        Object objC = q4q0Var.b;
        int i2 = q4q0Var.d;
        if (i2 == 0) {
            hm5.M(objC);
            q4q0Var.a = this;
            q4q0Var.d = 1;
            objC = this.b.c(q4q0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = q4q0Var.a;
            hm5.M(objC);
        }
        return yah0.m(this.f((List) objC));
    }

    public final boolean f(List list) {
        long epochDay = Instant.ofEpochMilli(this.c.b()).atZone(ZoneId.systemDefault()).toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).longValue() < epochDay) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        wn4 wn4Var = this.d;
        if (size >= wn4Var.h()) {
            return false;
        }
        return arrayList.isEmpty() || epochDay <= ((Number) o7h.q0(arrayList)).longValue() + ((long) wn4Var.i());
    }

    public final mr20 g() {
        return h() ? (mr20) new pdp0(this, (byte) 20).invoke() : h4p1.m(Boolean.FALSE);
    }

    public final boolean h() {
        wn4 wn4Var = this.d;
        return wn4Var.c() || wn4Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        t4q0 t4q0Var;
        if (onmVar instanceof t4q0) {
            t4q0Var = (t4q0) onmVar;
            int i = t4q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t4q0Var.c = i - Integer.MIN_VALUE;
            } else {
                t4q0Var = new t4q0(this, onmVar);
            }
        } else {
            t4q0Var = new t4q0(this, onmVar);
        }
        Object objK = t4q0Var.a;
        int i2 = t4q0Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objK);
            if (h()) {
                mr20 mr20VarG = g();
                t4q0Var.c = 1;
                objK = b5p1.k(mr20VarG, t4q0Var);
                if (objK != d9nVar) {
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objK);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objK);
        Boolean bool = (Boolean) objK;
        if (bool != null ? bool.booleanValue() : false) {
            t4q0Var.c = 2;
            hrg1 hrg1Var = this.b;
            hrg1Var.getClass();
            Object objM = hrg1Var.m(new nrg1(), t4q0Var);
            if (objM != d9nVar) {
                objM = rih1Var;
            }
            if (objM == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
