package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r7e1 {
    public final ggg1 a;
    public final aae1 b;
    public wat c;
    public final k3f1 d;
    public final c9n e;
    public final hdt0 f;
    public ung g;
    public boolean h;
    public boolean i;
    public boolean j;
    public ss50 k;
    public Function0 m;
    public s4e1 n;
    public final hrr0 s;
    public final hrr0 t;
    public final hrr0 u;
    public jqd0 v;
    public int w;
    public r9w0 x;
    public final mdt y;
    public final lls0 z;
    public final hrr0 l = xto.t(Boolean.TRUE);
    public final hrr0 o = xto.t(new Offset(9205357640488583168L));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hrr0 f105p = xto.t(new Offset(9205357640488583168L));
    public final hrr0 q = xto.t((Object) null);
    public final hrr0 r = xto.t(g7e1.a);

    public r7e1(ggg1 ggg1Var, aae1 aae1Var, wat watVar, boolean z, boolean z2, k3f1 k3f1Var, c9n c9nVar, hdt0 hdt0Var, ung ungVar) {
        this.a = ggg1Var;
        this.b = aae1Var;
        this.c = watVar;
        this.d = k3f1Var;
        this.e = c9nVar;
        this.f = hdt0Var;
        this.g = ungVar;
        this.i = z;
        this.j = z2;
        Boolean bool = Boolean.FALSE;
        this.s = xto.t(bool);
        this.t = xto.t(ree1.a);
        this.u = xto.t(bool);
        this.w = -1;
        this.y = xto.l(new nea(this, (byte) 3));
        this.z = new lls0(this.g, (byte) 13);
    }

    public static final void f(o811 o811Var, o811 o811Var2, r7e1 r7e1Var) {
        if ((o811Var.a & 9223372034707292159L) != 9205357640488583168L) {
            o811Var.a = 9205357640488583168L;
            o811Var2.a = 9205357640488583168L;
            r7e1Var.b();
        }
    }

    public static final void h(o811 o811Var, o811 o811Var2, r7e1 r7e1Var) {
        if ((o811Var.a & 9223372034707292159L) != 9205357640488583168L) {
            r7e1Var.b();
            o811Var.a = 9205357640488583168L;
            o811Var2.a = 0L;
            r7e1Var.w = -1;
        }
    }

    public final void A(qr50 qr50Var, long j) {
        this.q.setValue(qr50Var);
        this.f105p.setValue(new Offset(j));
    }

    public final long B(i4e1 i4e1Var, int i, int i2, boolean z, f341 f341Var, boolean z2, boolean z3, vs50 vs50Var) {
        long jE;
        ss50 ss50Var;
        long j = i4e1Var.e;
        nbe1 nbe1Var = new nbe1(j);
        if (z3 || (!z2 && nbe1.d(j))) {
            nbe1Var = null;
        }
        y9e1 y9e1VarC = this.b.c();
        if (y9e1VarC == null) {
            jE = b6p1.k();
        } else if (nbe1Var == null && u890.j(f341Var, w1x0.Y)) {
            jE = e6p1.e(i, i2);
        } else {
            jqd0 jqd0VarQ = ejo1.q(y9e1VarC, i, i2, this.w, nbe1Var != null ? nbe1Var.a : b6p1.k(), nbe1Var == null, z);
            if (nbe1Var == null || jqd0VarQ.B(this.v)) {
                long jB = f341Var.a(jqd0VarQ).b();
                this.v = jqd0VarQ;
                this.w = z ? i : i2;
                jE = jB;
            } else {
                jE = nbe1Var.a;
            }
        }
        if (vs50Var != null && ((nbe1.g(jE) != nbe1.g(j) || nbe1.f(jE) != nbe1.f(j)) && (ss50Var = this.k) != null)) {
            ((sct0) ss50Var).a(vs50Var.b());
        }
        return jE;
    }

    public final n511 a(y9e1 y9e1Var, i4e1 i4e1Var) {
        float f;
        if (!nbe1.d(i4e1Var.e)) {
            return n511.e;
        }
        n511 n511VarC = y9e1Var.c((int) (i4e1Var.e >> 32));
        float fFloor = (float) Math.floor(this.c.X0(2.0f));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (y9e1Var.a.h == flb0.a) {
            f = (fFloor / 2.0f) + n511VarC.a;
        } else {
            f = n511VarC.c - (fFloor / 2.0f);
        }
        float f2 = fFloor / 2.0f;
        float f3 = ((int) (y9e1Var.c >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new n511(fFloor2 - f2, n511VarC.b, fFloor2 + f2, n511VarC.d);
    }

    public final void b() {
        this.q.setValue(null);
        this.f105p.setValue(new Offset(9205357640488583168L));
        this.o.setValue(new Offset(9205357640488583168L));
    }

    public final rih1 c(boolean z, a8d1 a8d1Var) {
        af5 af5Var;
        ggg1 ggg1Var = this.a;
        if (nbe1.d(ggg1Var.h().e)) {
            af5Var = null;
        } else {
            af5Var = new af5(x2p1.l(ggg1Var.h()).toString());
            if (z) {
                ggg1Var.a();
            }
        }
        rih1 rih1Var = rih1.a;
        if (af5Var == null) {
            return rih1Var;
        }
        this.g.b(u1p1.D(af5Var));
        return rih1Var;
    }

    public final rih1 d(a8d1 a8d1Var) {
        af5 af5Var;
        ggg1 ggg1Var = this.a;
        if (nbe1.d(ggg1Var.h().e) || !m()) {
            af5Var = null;
        } else {
            af5Var = new af5(x2p1.l(ggg1Var.h()).toString());
            ggg1.d(ggg1Var);
        }
        rih1 rih1Var = rih1.a;
        if (af5Var == null) {
            return rih1Var;
        }
        this.g.b(u1p1.D(af5Var));
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(nav0 nav0Var, onm onmVar) throws Throwable {
        j7e1 j7e1Var;
        o811 o811Var;
        Throwable th;
        o811 o811Var2;
        if (onmVar instanceof j7e1) {
            j7e1Var = (j7e1) onmVar;
            int i = j7e1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7e1Var.e = i - Integer.MIN_VALUE;
            } else {
                j7e1Var = new j7e1(this, onmVar);
            }
        } else {
            j7e1Var = new j7e1(this, onmVar);
        }
        j7e1 j7e1Var2 = j7e1Var;
        Object obj = j7e1Var2.c;
        int i2 = j7e1Var2.e;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o811Var2 = j7e1Var2.b;
            o811Var = j7e1Var2.a;
            try {
                hm5.M(obj);
                f(o811Var, o811Var2, this);
                return rih1.a;
            } catch (Throwable th2) {
                th = th2;
                f(o811Var, o811Var2, this);
                throw th;
            }
        }
        hm5.M(obj);
        o811 o811Var3 = new o811();
        o811Var3.a = 9205357640488583168L;
        o811 o811Var4 = new o811();
        o811Var4.a = 9205357640488583168L;
        try {
            d5e1 d5e1Var = new d5e1(o811Var3, this, o811Var4, (byte) 3);
            e7e1 e7e1Var = new e7e1(o811Var3, o811Var4, this, (byte) 3);
            e7e1 e7e1Var2 = new e7e1(o811Var3, o811Var4, this, (byte) 0);
            qg qgVar = new qg(o811Var4, this, o811Var3, (byte) 11);
            j7e1Var2.a = o811Var3;
            j7e1Var2.b = o811Var4;
            j7e1Var2.e = 1;
            Object objH = g5v.h(e7e1Var, e7e1Var2, j7e1Var2, d5e1Var, qgVar, nav0Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
            o811Var = o811Var3;
            o811Var2 = o811Var4;
            f(o811Var, o811Var2, this);
            return rih1.a;
        } catch (Throwable th3) {
            o811Var = o811Var3;
            th = th3;
            o811Var2 = o811Var4;
            f(o811Var, o811Var2, this);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(nav0 nav0Var, boolean z, onm onmVar) throws Throwable {
        k7e1 k7e1Var;
        r7e1 r7e1Var;
        o811 o811Var;
        qr50 qr50Var;
        o811 o811Var2;
        o811 o811Var3;
        Throwable th;
        if (onmVar instanceof k7e1) {
            k7e1Var = (k7e1) onmVar;
            int i = k7e1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7e1Var.f = i - Integer.MIN_VALUE;
            } else {
                k7e1Var = new k7e1(this, onmVar);
            }
        } else {
            k7e1Var = new k7e1(this, onmVar);
        }
        k7e1 k7e1Var2 = k7e1Var;
        Object obj = k7e1Var2.d;
        int i2 = k7e1Var2.f;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qr50Var = k7e1Var2.c;
            o811Var2 = k7e1Var2.b;
            o811Var3 = k7e1Var2.a;
            try {
                hm5.M(obj);
                r7e1Var = this;
                if (r7e1Var.l() == qr50Var) {
                    h(o811Var3, o811Var2, r7e1Var);
                }
                return rih1.a;
            } catch (Throwable th2) {
                th = th2;
                r7e1Var = this;
                if (r7e1Var.l() != qr50Var) {
                    throw th;
                }
                h(o811Var3, o811Var2, r7e1Var);
                throw th;
            }
        }
        hm5.M(obj);
        o811 o811Var4 = new o811();
        o811Var4.a = 9205357640488583168L;
        o811 o811Var5 = new o811();
        o811Var5.a = 0L;
        qr50 qr50Var2 = z ? qr50.b : qr50.c;
        try {
            try {
                eti0 eti0Var = new eti0(qr50Var2, o811Var4, o811Var5, this, z);
                e7e1 e7e1Var = new e7e1(o811Var4, this, o811Var5, (byte) 1);
                e7e1 e7e1Var2 = new e7e1(o811Var4, this, o811Var5, (byte) 2);
                try {
                    f7e1 f7e1Var = new f7e1(qr50Var2, o811Var5, o811Var4, this, z);
                    qr50Var2 = qr50Var2;
                    r7e1Var = this;
                    o811Var = o811Var4;
                    o811Var5 = o811Var5;
                    try {
                        k7e1Var2.a = o811Var;
                        k7e1Var2.b = o811Var5;
                        k7e1Var2.c = qr50Var2;
                        k7e1Var2.f = 1;
                        Object objH = g5v.h(e7e1Var, e7e1Var2, k7e1Var2, eti0Var, f7e1Var, nav0Var);
                        d9n d9nVar = d9n.a;
                        if (objH == d9nVar) {
                            return d9nVar;
                        }
                        qr50Var = qr50Var2;
                        o811Var2 = o811Var5;
                        o811Var3 = o811Var;
                        if (r7e1Var.l() == qr50Var) {
                            h(o811Var3, o811Var2, r7e1Var);
                        }
                        return rih1.a;
                    } catch (Throwable th3) {
                        th = th3;
                        qr50Var = qr50Var2;
                        o811Var2 = o811Var5;
                        o811Var3 = o811Var;
                        th = th;
                        if (r7e1Var.l() != qr50Var) {
                            throw th;
                        }
                        h(o811Var3, o811Var2, r7e1Var);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    qr50Var2 = qr50Var2;
                    r7e1Var = this;
                    o811Var = o811Var4;
                    o811Var5 = o811Var5;
                }
            } catch (Throwable th5) {
                th = th5;
                r7e1Var = this;
                o811Var = o811Var4;
                qr50Var = qr50Var2;
                o811Var2 = o811Var5;
                o811Var3 = o811Var;
                th = th;
                if (r7e1Var.l() != qr50Var) {
                    throw th;
                }
                h(o811Var3, o811Var2, r7e1Var);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            r7e1Var = this;
        }
    }

    public final Object i(nav0 nav0Var, a8d1 a8d1Var) {
        Object objH1 = ((j8d1) nav0Var).H1(new lfa(this, (lnm) null, (byte) 3), a8d1Var);
        return objH1 == d9n.a ? objH1 : rih1.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if ((r0 != null ? p.ljo1.o(r5, p.ljo1.u(r0)) : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.g5e1 j(boolean r11) {
        /*
            r10 = this;
            p.ggg1 r0 = r10.a
            p.i4e1 r0 = r0.h()
            p.hrr0 r1 = r10.s
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            p.hrr0 r2 = r10.r
            java.lang.Object r2 = r2.getValue()
            p.g7e1 r2 = (p.g7e1) r2
            p.g7e1 r3 = p.g7e1.a
            r4 = 0
            if (r2 != r3) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = r4
        L22:
            p.qr50 r3 = r10.l()
            if (r1 == 0) goto L91
            if (r2 == 0) goto L91
            long r1 = r0.e
            boolean r1 = p.nbe1.d(r1)
            if (r1 == 0) goto L91
            p.mmr0 r1 = r0.g
            if (r1 != 0) goto L91
            java.lang.CharSequence r0 = r0.d
            int r0 = r0.length()
            if (r0 <= 0) goto L91
            p.qr50 r0 = p.qr50.a
            if (r3 == r0) goto L76
            p.jv91 r1 = p.ekb.o()
            if (r1 == 0) goto L4e
            p.iu30 r0 = r1.e()
        L4c:
            r2 = r0
            goto L50
        L4e:
            r0 = 0
            goto L4c
        L50:
            p.jv91 r3 = p.ekb.u(r1)
            p.n511 r0 = r10.k()     // Catch: java.lang.Throwable -> L70
            long r5 = r0.c()     // Catch: java.lang.Throwable -> L70
            p.ekb.C(r1, r3, r2)
            p.elb0 r0 = r10.q()
            if (r0 == 0) goto L6d
            p.n511 r0 = p.ljo1.u(r0)
            boolean r4 = p.ljo1.o(r5, r0)
        L6d:
            if (r4 == 0) goto L91
            goto L76
        L70:
            r0 = move-exception
            r10 = r0
            p.ekb.C(r1, r3, r2)
            throw r10
        L76:
            p.g5e1 r4 = new p.g5e1
            if (r11 == 0) goto L84
            p.n511 r10 = r10.k()
            long r10 = r10.c()
        L82:
            r7 = r10
            goto L8a
        L84:
            r10 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            r6 = 1
            r9 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9)
            return r4
        L91:
            p.g5e1 r10 = p.g5e1.f
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r7e1.j(boolean):p.g5e1");
    }

    public final n511 k() {
        y9e1 y9e1VarC = this.b.c();
        return y9e1VarC == null ? n511.e : a(y9e1VarC, this.a.h());
    }

    public final qr50 l() {
        return (qr50) this.q.getValue();
    }

    public final boolean m() {
        return this.i && !this.j;
    }

    public final long n() {
        hrr0 hrr0Var = this.f105p;
        if ((((Offset) hrr0Var.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        hrr0 hrr0Var2 = this.o;
        if ((((Offset) hrr0Var2.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return z4p1.y(this.b, ((Offset) hrr0Var.getValue()).a);
        }
        long j = ((Offset) hrr0Var.getValue()).a;
        long j2 = ((Offset) hrr0Var2.getValue()).a;
        elb0 elb0VarQ = q();
        return Offset.g(j, Offset.f(j2, elb0VarQ != null ? nho1.C(elb0VarQ) : 9205357640488583168L));
    }

    public final long o(boolean z) {
        long j;
        y9e1 y9e1VarC = this.b.c();
        if (y9e1VarC == null) {
            return 0L;
        }
        long j2 = this.a.h().e;
        if (z) {
            int i = nbe1.c;
            j = j2 >> 32;
        } else {
            int i2 = nbe1.c;
            j = 4294967295L & j2;
        }
        return l6p1.k(y9e1VarC, (int) j, z, nbe1.h(j2));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    public final g5e1 p(boolean z, boolean z2) {
        int iMax;
        long j;
        elb0 elb0VarQ;
        qr50 qr50Var = z ? qr50.b : qr50.c;
        y9e1 y9e1VarC = this.b.c();
        g5e1 g5e1Var = g5e1.f;
        if (y9e1VarC != null) {
            ggg1 ggg1Var = this.a;
            long j2 = ggg1Var.h().e;
            if (!nbe1.d(j2)) {
                long jO = o(z);
                if (((g7e1) this.r.getValue()) == g7e1.a) {
                    if (l() != qr50Var) {
                        elb0 elb0VarQ2 = q();
                        if (elb0VarQ2 != null ? ljo1.o(jO, ljo1.u(elb0VarQ2)) : false) {
                            if (ggg1Var.h().g == null) {
                                if (z) {
                                    iMax = (int) (j2 >> 32);
                                } else {
                                    iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                                }
                                int iA = y9e1VarC.a(iMax);
                                boolean zH = nbe1.h(j2);
                                if (z2) {
                                    elb0VarQ = q();
                                    if (elb0VarQ != null) {
                                        jO = z4p1.s(jO, ljo1.u(elb0VarQ));
                                    }
                                } else {
                                    jO = 9205357640488583168L;
                                }
                                long j3 = jO;
                                if (z) {
                                    j = j2 >> 32;
                                } else {
                                    j = j2 & 4294967295L;
                                }
                                return new g5e1(x4p1.k(y9e1VarC, (int) j), iA, j3, zH);
                            }
                        }
                    } else if (ggg1Var.h().g == null) {
                        if (z) {
                            iMax = (int) (j2 >> 32);
                        } else {
                            iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                        }
                        int iA2 = y9e1VarC.a(iMax);
                        boolean zH2 = nbe1.h(j2);
                        if (z2) {
                            elb0VarQ = q();
                            if (elb0VarQ != null) {
                                jO = z4p1.s(jO, ljo1.u(elb0VarQ));
                            }
                        } else {
                            jO = 9205357640488583168L;
                        }
                        long j4 = jO;
                        if (z) {
                            j = j2 >> 32;
                        } else {
                            j = j2 & 4294967295L;
                        }
                        return new g5e1(x4p1.k(y9e1VarC, (int) j), iA2, j4, zH2);
                    }
                }
            }
        }
        return g5e1Var;
    }

    public final elb0 q() {
        elb0 elb0VarE = this.b.e();
        if (elb0VarE == null || !elb0VarE.a()) {
            return null;
        }
        return elb0VarE;
    }

    public final void r() {
        hdt0 hdt0Var = this.f;
        if (hdt0Var == null) {
            return;
        }
        ggg1 ggg1Var = this.a;
        CharSequence charSequence = ggg1Var.h().d;
        long j = ggg1Var.h().e;
        if (charSequence.length() <= 0 || nbe1.d(j)) {
            return;
        }
        c921.y(this.e, (o8n) null, 4, new xn2(hdt0Var, charSequence, j, this, (lnm) null, (byte) 14), 1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(boolean z, onm onmVar) {
        n7e1 n7e1Var;
        if (onmVar instanceof n7e1) {
            n7e1Var = (n7e1) onmVar;
            int i = n7e1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7e1Var.c = i - Integer.MIN_VALUE;
            } else {
                n7e1Var = new n7e1(this, onmVar);
            }
        } else {
            n7e1Var = new n7e1(this, onmVar);
        }
        Object obj = n7e1Var.a;
        int i2 = n7e1Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            s4e1 s4e1Var = this.n;
            if (s4e1Var != null) {
                s4e1Var.invoke();
            }
            n7e1Var.c = 1;
            if (t(z, n7e1Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (i2 == 1) {
            hm5.M(obj);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        kmg kmgVar = (kmg) obj;
        if (kmgVar != null) {
            kmgVar.a();
            throw null;
        }
        n7e1Var.c = 3;
        if (t(false, n7e1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r8 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(boolean r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.o7e1
            if (r0 == 0) goto L13
            r0 = r8
            p.o7e1 r0 = (p.o7e1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.o7e1 r0 = new p.o7e1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            p.rih1 r2 = p.rih1.a
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2e
            boolean r7 = r0.a
            p.hm5.M(r8)
            goto L5c
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L35:
            boolean r7 = r0.a
            p.hm5.M(r8)
            goto L4d
        L3b:
            p.hm5.M(r8)
            p.ung r8 = r6.g
            r0.a = r7
            r0.d = r4
            p.f94 r8 = (p.f94) r8
            p.kmg r8 = r8.a()
            if (r8 != r5) goto L4d
            goto L5b
        L4d:
            p.kmg r8 = (p.kmg) r8
            if (r8 == 0) goto L69
            r0.a = r7
            r0.d = r3
            java.lang.String r8 = p.u1p1.A(r8)
            if (r8 != r5) goto L5c
        L5b:
            return r5
        L5c:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L61
            goto L69
        L61:
            r0 = 0
            r1 = 10
            p.ggg1 r6 = r6.a
            p.ggg1.m(r6, r8, r0, r7, r1)
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r7e1.t(boolean, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean u(long j) throws NoWhenBranchMatchedException {
        int iG;
        int i;
        long j2;
        y9e1 y9e1VarC = this.b.c();
        if (y9e1VarC != null && (iG = y9e1VarC.b.g(j)) != -1) {
            ggg1 ggg1Var = this.a;
            long jI = ggg1Var.i(iG);
            long jK = ggg1Var.k(jI);
            if (nbe1.d(jI) && nbe1.d(jK)) {
                i = 1;
            } else if (nbe1.d(jI) || nbe1.d(jK)) {
                i = (!nbe1.d(jI) || nbe1.d(jK)) ? 4 : 2;
            } else {
                i = 3;
            }
            int iC = l1d.C(i);
            y061 y061Var = null;
            if (iC == 0) {
                j2 = jI >> 32;
            } else {
                if (iC == 1) {
                    y061Var = vgo1.u(j, y9e1VarC.c((int) (jK >> 32)), y9e1VarC.c((int) (jK & 4294967295L))) < 0 ? new y061(1) : new y061(2);
                } else if (iC != 2) {
                    if (iC != 3) {
                        eg.o();
                        return false;
                    }
                } else if (vgo1.u(j, y9e1VarC.c((int) (jK >> 32)), y9e1VarC.c((int) (jK & 4294967295L))) >= 0) {
                    j2 = jI & 4294967295L;
                }
                j2 = jI >> 32;
            }
            long jD = e6p1.d((int) j2);
            if (!nbe1.c(jD, ggg1Var.g().e) || (y061Var != null && !y061Var.equals(ggg1Var.f()))) {
                ggg1Var.p(jD);
                if (y061Var != null) {
                    ggg1Var.q(y061Var);
                }
                return true;
            }
        }
        return false;
    }

    public final void v(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void w(boolean z) {
        this.s.setValue(Boolean.valueOf(z));
    }

    public final void x(ree1 ree1Var) {
        this.t.setValue(ree1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(onm onmVar) {
        q7e1 q7e1Var;
        if (onmVar instanceof q7e1) {
            q7e1Var = (q7e1) onmVar;
            int i = q7e1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7e1Var.c = i - Integer.MIN_VALUE;
            } else {
                q7e1Var = new q7e1(this, onmVar);
            }
        } else {
            q7e1Var = new q7e1(this, onmVar);
        }
        Object objS = q7e1Var.a;
        int i2 = q7e1Var.c;
        k3f1 k3f1Var = this.d;
        hrr0 hrr0Var = this.t;
        ree1 ree1Var = ree1.a;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                kwb1 kwb1Var = new kwb1(this, (lnm) null, (byte) 8);
                q7e1Var.c = 1;
                objS = smo1.s(kwb1Var, q7e1Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objS);
            }
            w(false);
            if (((ree1) hrr0Var.getValue()) != ree1Var) {
                k3f1Var.a();
            }
            return rih1.a;
        } catch (Throwable th) {
            w(false);
            if (((ree1) hrr0Var.getValue()) != ree1Var) {
                k3f1Var.a();
            }
            throw th;
        }
    }

    public final rih1 z() {
        this.z.D();
        return rih1.a;
    }
}
