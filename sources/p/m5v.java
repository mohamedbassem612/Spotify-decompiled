package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class m5v extends l5t implements mav0, va80, j4k, f6v {
    public qqq0 Q0;
    public iu30 R0;
    public boolean S0;
    public idn0 T0;
    public bbc U0;
    public o5v V0;
    public boolean W0;
    public boolean X0;
    public g4v Y0;
    public long Z0 = 0;
    public rj40 a1;
    public rj40 b1;
    public j4v c1;
    public i4v d1;
    public h4v e1;
    public i541 f1;
    public tui1 g1;
    public o0g h1;
    public ua80 i1;

    public m5v(iu30 iu30Var, boolean z, idn0 idn0Var, qqq0 qqq0Var) {
        this.Q0 = qqq0Var;
        this.R0 = iu30Var;
        this.S0 = z;
        this.T0 = idn0Var;
    }

    public static void O1(m5v m5vVar, hav0 hav0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        i4v i4vVar = m5vVar.d1;
        if (i4vVar == null) {
            i4vVar = new i4v();
            m5vVar.d1 = i4vVar;
        }
        i4vVar.d0(hav0Var);
        i4vVar.e0(j);
        o0g o0gVar = m5vVar.h1;
        qqq0 qqq0Var = m5vVar.Q0;
        if (o0gVar == null) {
            m5vVar.h1 = new o0g(qqq0Var);
        } else {
            o0gVar.Q(qqq0Var);
            o0g o0gVar2 = m5vVar.h1;
            if (o0gVar2 != null) {
                o0gVar2.N(j2);
            }
        }
        i4vVar.f0(false);
        m5vVar.f1 = i4vVar;
    }

    @Override // p.pim0
    public final void A1() {
        this.W0 = false;
        K1();
        rj40 rj40Var = this.b1;
        if (rj40Var != null) {
            I1(rj40Var);
        }
        rj40 rj40Var2 = this.a1;
        if (rj40Var2 != null) {
            I1(rj40Var2);
        }
        this.b1 = null;
        this.a1 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        i4v i4vVar;
        cav0 cav0Var2;
        Object obj4;
        Object obj5;
        this.X0 = true;
        if (this.S0) {
            if (this.a1 == null) {
                rj40 rj40VarX = crm0.x(this);
                H1(rj40VarX);
                this.a1 = rj40VarX;
            }
            g4v g4vVar = this.f1;
            if (g4vVar == null) {
                g4vVar = this.Y0;
                if (g4vVar == null) {
                    g4vVar = new g4v();
                    this.Y0 = g4vVar;
                }
                this.f1 = g4vVar;
            }
            boolean z2 = g4vVar instanceof g4v;
            cav0 cav0Var3 = cav0.a;
            cav0 cav0Var4 = cav0.b;
            if (z2) {
                g4v g4vVar2 = g4vVar;
                if (!bav0Var.a.isEmpty() && rqd1.e(bav0Var, false)) {
                    hav0 hav0Var = (hav0) o7h.q0(bav0Var.a);
                    int iA0 = i5v.a[l1d.C(g4vVar2.a0())] == 1 ? !Z1() ? 1 : 2 : g4vVar2.a0();
                    g4vVar2.d0(iA0);
                    if (cav0Var == cav0Var3) {
                        if (iA0 == 2) {
                            hav0Var.a();
                            g4vVar2.e0(true);
                        }
                        g4vVar2.f0(true);
                    }
                    if (cav0Var == cav0Var4) {
                        if (iA0 == 1) {
                            O1(this, hav0Var, hav0Var.d(), 0L, 12);
                            return;
                        }
                        if (g4vVar2.b0()) {
                            Y1(hav0Var, hav0Var, 0L);
                            X1(0L, hav0Var);
                            long jD = hav0Var.d();
                            j4v j4vVar = this.c1;
                            if (j4vVar == null) {
                                j4vVar = new j4v();
                                this.c1 = j4vVar;
                            }
                            j4vVar.b0(jD);
                            this.f1 = j4vVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = g4vVar instanceof i4v;
            cav0 cav0Var5 = cav0.c;
            if (!z3) {
                if (g4vVar instanceof h4v) {
                    h4v h4vVar = (h4v) g4vVar;
                    if (cav0Var != cav0Var5) {
                        return;
                    }
                    List list = bav0Var.a;
                    List list2 = list;
                    int size = list2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        } else {
                            if (((hav0) list.get(i)).l()) {
                                z = false;
                                break;
                            }
                            i++;
                        }
                    }
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (((hav0) list.get(i2)).f()) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jE = ((hav0) o7h.q0(list)).e();
                                hav0 hav0VarA0 = h4vVar.a0();
                                hav0VarA0.getClass();
                                long jF = Offset.f(jE, hav0VarA0.e());
                                hav0 hav0VarA1 = h4vVar.a0();
                                if (hav0VarA1 != null) {
                                    O1(this, hav0VarA1, h4vVar.b0(), jF, 8);
                                    return;
                                } else {
                                    hhg1.n("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    M1();
                    return;
                }
                if (!(g4vVar instanceof j4v)) {
                    eg.o();
                    return;
                }
                j4v j4vVar2 = (j4v) g4vVar;
                if (cav0Var != cav0Var4) {
                    return;
                }
                long jA0 = j4vVar2.a0();
                List list3 = bav0Var.a;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list3.get(i3);
                    if (w8p1.n(((hav0) obj).d(), jA0)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                hav0 hav0Var2 = (hav0) obj;
                if (hav0Var2 == null) {
                    return;
                }
                boolean zK = p8p1.k(hav0Var2);
                k4v k4vVar = k4v.a;
                if (!zK) {
                    if (hav0Var2.l()) {
                        V1().l(k4vVar);
                        return;
                    } else {
                        if (Offset.d(p8p1.A(hav0Var2)) == 0.0f) {
                            return;
                        }
                        X1(p8p1.z(hav0Var2), hav0Var2);
                        hav0Var2.a();
                        return;
                    }
                }
                List list4 = bav0Var.a;
                int size4 = list4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj2 = null;
                        break;
                    }
                    Object obj6 = list4.get(i4);
                    if (((hav0) obj6).f()) {
                        obj2 = obj6;
                        break;
                    }
                    i4++;
                }
                hav0 hav0Var3 = (hav0) obj2;
                if (hav0Var3 != null) {
                    j4vVar2.b0(hav0Var3.d());
                    return;
                }
                if (hav0Var2.l() || !p8p1.k(hav0Var2)) {
                    V1().l(k4vVar);
                } else {
                    float f = ((e8k1) lcc.z(this, t4k.t)).f();
                    eyo1.h(W1(), hav0Var2);
                    long jC = W1().c(j2h1.g(f, f));
                    W1().d();
                    V1().l(new n4v(k6v.d(jC)));
                    this.X0 = false;
                }
                M1();
                return;
            }
            i4v i4vVar2 = (i4v) g4vVar;
            if (cav0Var == cav0Var3) {
                return;
            }
            List list5 = bav0Var.a;
            List list6 = list5;
            int size5 = list6.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list5.get(i5);
                int i6 = i5;
                if (w8p1.n(((hav0) obj3).d(), i4vVar2.b0())) {
                    break;
                } else {
                    i5 = i6 + 1;
                }
            }
            hav0 hav0Var4 = (hav0) obj3;
            if (hav0Var4 == null) {
                int size6 = list6.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list5.get(i7);
                    if (((hav0) obj5).f()) {
                        break;
                    } else {
                        i7++;
                    }
                }
                hav0Var4 = (hav0) obj5;
                if (hav0Var4 == null) {
                    M1();
                    return;
                }
                i4vVar2.e0(hav0Var4.d());
            }
            if (cav0Var != cav0Var4) {
                i4vVar = i4vVar2;
                cav0Var2 = cav0Var5;
            } else if (hav0Var4.l()) {
                i4vVar = i4vVar2;
                cav0Var2 = cav0Var5;
                hav0 hav0VarA2 = i4vVar.a0();
                if (hav0VarA2 == null) {
                    hhg1.n("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long jB0 = i4vVar.b0();
                o0g o0gVar = this.h1;
                if (o0gVar == null) {
                    hhg1.n("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
                N1(hav0VarA2, jB0, o0gVar);
            } else if (p8p1.k(hav0Var4)) {
                int size7 = list6.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list5.get(i8);
                    if (((hav0) obj4).f()) {
                        break;
                    } else {
                        i8++;
                    }
                }
                hav0 hav0Var5 = (hav0) obj4;
                if (hav0Var5 == null) {
                    M1();
                } else {
                    i4vVar2.e0(hav0Var5.d());
                }
                i4vVar = i4vVar2;
                cav0Var2 = cav0Var5;
            } else {
                float fP = g5v.p((e8k1) lcc.z(this, t4k.t), hav0Var4.j());
                o0g o0gVar2 = this.h1;
                if (o0gVar2 == null) {
                    hhg1.n("Touch slop detector not initialized.");
                    return;
                }
                long jG = o0g.G(o0gVar2, p8p1.A(hav0Var4), fP);
                if ((9223372034707292159L & jG) != 9205357640488583168L) {
                    cav0Var2 = cav0Var5;
                    i4vVar = i4vVar2;
                    long jG2 = Offset.g(this.Z0, p8p1.z(hav0Var4));
                    this.Z0 = jG2;
                    float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.Z0 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jG2 >> 32))))) * 57.29578f;
                    qqq0 qqq0Var = this.Q0;
                    boolean zA = qqq0Var == null ? true : k6v.a(qqq0Var, fAtan2);
                    l811 l811Var = new l811();
                    k6v.e(this, new h5v(fAtan2, l811Var));
                    if (zA || !l811Var.a) {
                        hav0Var4.a();
                        hav0 hav0VarA3 = i4vVar.a0();
                        hav0VarA3.getClass();
                        Y1(hav0VarA3, hav0Var4, jG);
                        X1(jG, hav0Var4);
                        long jD2 = hav0Var4.d();
                        j4v j4vVar3 = this.c1;
                        if (j4vVar3 == null) {
                            j4vVar3 = new j4v();
                            this.c1 = j4vVar3;
                        }
                        j4vVar3.b0(jD2);
                        this.f1 = j4vVar3;
                    } else {
                        i4vVar.f0(true);
                    }
                } else {
                    i4vVar = i4vVar2;
                    cav0Var2 = cav0Var5;
                    i4vVar.f0(true);
                    this.Z0 = Offset.g(this.Z0, p8p1.A(hav0Var4));
                }
            }
            if (cav0Var == cav0Var2 && i4vVar.c0()) {
                if (!hav0Var4.l()) {
                    i4vVar.f0(false);
                    return;
                }
                hav0 hav0VarA4 = i4vVar.a0();
                if (hav0VarA4 == null) {
                    hhg1.n("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long jB1 = i4vVar.b0();
                o0g o0gVar3 = this.h1;
                if (o0gVar3 != null) {
                    N1(hav0VarA4, jB1, o0gVar3);
                } else {
                    hhg1.n("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // p.mav0
    public final void K0() {
        if (this.X0) {
            M1();
            if (this.W0) {
                V1().l(k4v.a);
            }
            this.g1 = null;
        }
        this.X0 = false;
    }

    public final void K1() {
        o5v o5vVar = this.V0;
        if (o5vVar != null) {
            idn0 idn0Var = this.T0;
            if (idn0Var != null) {
                idn0Var.a(new n5v(o5vVar));
            }
            this.V0 = null;
        }
    }

    public abstract Object L1(swn swnVar, rzu rzuVar);

    public final void M1() {
        this.Z0 = 0L;
        g4v g4vVar = this.Y0;
        if (g4vVar == null) {
            g4vVar = new g4v();
            this.Y0 = g4vVar;
        }
        g4vVar.d0(3);
        g4vVar.e0(false);
        g4vVar.f0(false);
        this.f1 = g4vVar;
    }

    public final void N1(hav0 hav0Var, long j, o0g o0gVar) {
        h4v h4vVar = this.e1;
        if (h4vVar == null) {
            h4vVar = new h4v();
            this.e1 = h4vVar;
        }
        h4vVar.c0(hav0Var);
        h4vVar.d0(j);
        o0g.O(o0gVar);
        this.f1 = h4vVar;
    }

    public final void P1(o4v o4vVar) {
        if ((o4vVar instanceof m4v) && !this.W0) {
            this.W0 = true;
            a2();
        }
        V1().l(o4vVar);
    }

    public final String Q() {
        if (!this.S0) {
            return "idle";
        }
        g4v g4vVar = this.f1;
        if (g4vVar instanceof g4v) {
            return g4vVar.c0() ? "waiting" : "idle";
        }
        if ((g4vVar instanceof i4v) || (g4vVar instanceof h4v)) {
            return "waiting";
        }
        return g4vVar instanceof j4v ? "recognized" : "idle";
    }

    public void R1(n4v n4vVar) {
        if (this.N0) {
            fn31.T(v1(), (o8n) null, 0, new wt(this, n4vVar, (lnm) null, (byte) 6), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S1(onm onmVar) {
        j5v j5vVar;
        if (onmVar instanceof j5v) {
            j5vVar = (j5v) onmVar;
            int i = j5vVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j5vVar.c = i - Integer.MIN_VALUE;
            } else {
                j5vVar = new j5v(this, onmVar);
            }
        } else {
            j5vVar = new j5v(this, onmVar);
        }
        Object obj = j5vVar.a;
        int i2 = j5vVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            o5v o5vVar = this.V0;
            if (o5vVar != null) {
                idn0 idn0Var = this.T0;
                if (idn0Var != null) {
                    n5v n5vVar = new n5v(o5vVar);
                    j5vVar.c = 1;
                    Object objB = idn0Var.b(n5vVar, j5vVar);
                    d9n d9nVar = d9n.a;
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            R1(new n4v(0L));
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        this.V0 = null;
        R1(new n4v(0L));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T1(m4v m4vVar, onm onmVar) {
        k5v k5vVar;
        idn0 idn0Var;
        o5v o5vVar;
        m4v m4vVar2;
        o5v o5vVar2;
        if (onmVar instanceof k5v) {
            k5vVar = (k5v) onmVar;
            int i = k5vVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k5vVar.e = i - Integer.MIN_VALUE;
            } else {
                k5vVar = new k5v(this, onmVar);
            }
        } else {
            k5vVar = new k5v(this, onmVar);
        }
        Object obj = k5vVar.c;
        int i2 = k5vVar.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            o5v o5vVar3 = this.V0;
            if (o5vVar3 != null && (idn0Var = this.T0) != null) {
                n5v n5vVar = new n5v(o5vVar3);
                k5vVar.a = m4vVar;
                k5vVar.e = 1;
                if (idn0Var.b(n5vVar, k5vVar) != d9nVar) {
                }
                return d9nVar;
            }
            this.V0 = o5vVar;
            Q1(m4vVar.a());
            return rih1.a;
        }
        if (i2 == 1) {
            m4vVar = k5vVar.a;
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o5vVar2 = k5vVar.b;
            m4vVar2 = k5vVar.a;
            hm5.M(obj);
        }
        o5vVar = o5vVar2;
        m4vVar = m4vVar2;
        this.V0 = o5vVar;
        Q1(m4vVar.a());
        return rih1.a;
        o5vVar = new o5v();
        idn0 idn0Var2 = this.T0;
        if (idn0Var2 != null) {
            k5vVar.a = m4vVar;
            k5vVar.b = o5vVar;
            k5vVar.e = 2;
            if (idn0Var2.b(o5vVar, k5vVar) != d9nVar) {
                m4vVar2 = m4vVar;
                o5vVar2 = o5vVar;
                o5vVar = o5vVar2;
                m4vVar = m4vVar2;
            }
            return d9nVar;
        }
        this.V0 = o5vVar;
        Q1(m4vVar.a());
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U1(n4v n4vVar, onm onmVar) {
        l5v l5vVar;
        if (onmVar instanceof l5v) {
            l5vVar = (l5v) onmVar;
            int i = l5vVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l5vVar.d = i - Integer.MIN_VALUE;
            } else {
                l5vVar = new l5v(this, onmVar);
            }
        } else {
            l5vVar = new l5v(this, onmVar);
        }
        Object obj = l5vVar.b;
        int i2 = l5vVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            o5v o5vVar = this.V0;
            if (o5vVar != null) {
                idn0 idn0Var = this.T0;
                if (idn0Var != null) {
                    p5v p5vVar = new p5v(o5vVar);
                    l5vVar.a = n4vVar;
                    l5vVar.d = 1;
                    Object objB = idn0Var.b(p5vVar, l5vVar);
                    d9n d9nVar = d9n.a;
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            R1(n4vVar);
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        n4vVar = l5vVar.a;
        hm5.M(obj);
        this.V0 = null;
        R1(n4vVar);
        return rih1.a;
    }

    public final jfe V1() {
        bbc bbcVar = this.U0;
        if (bbcVar != null) {
            return bbcVar;
        }
        hhg1.n("Events channel not initialized.");
        return null;
    }

    public final tui1 W1() {
        tui1 tui1Var = this.g1;
        if (tui1Var != null) {
            return tui1Var;
        }
        hhg1.n("Velocity Tracker not initialized.");
        return null;
    }

    public final void X1(long j, hav0 hav0Var) {
        this.Z0 = Offset.g(this.Z0, j);
        eyo1.h(W1(), hav0Var);
        V1().l(new l4v(j));
    }

    public final void Y1(hav0 hav0Var, hav0 hav0Var2, long j) {
        if (this.g1 == null) {
            this.g1 = new tui1();
        }
        eyo1.h(W1(), hav0Var);
        long jF = Offset.f(hav0Var2.e(), j);
        if (((Boolean) this.R0.invoke(rav0.a(hav0Var.j()))).booleanValue()) {
            if (!this.W0) {
                if (this.U0 == null) {
                    this.U0 = mno1.a(Integer.MAX_VALUE, 0, 6);
                }
                a2();
            }
            V1().l(new m4v(jF, 0));
        }
    }

    @Override // p.va80
    public final void Z0() {
        ua80 ua80Var = this.i1;
        if (ua80Var != null) {
            ua80Var.g();
        }
    }

    public boolean Z1() {
        return false;
    }

    public final qqq0 a() {
        return this.Q0;
    }

    public final void a2() {
        this.W0 = true;
        if (this.U0 == null) {
            this.U0 = mno1.a(Integer.MAX_VALUE, 0, 6);
        }
        c921.y(v1(), (o8n) null, 0, new rzu(this, (lnm) null, (byte) 1), 3);
    }

    public final void b2(iu30 iu30Var, boolean z, idn0 idn0Var, qqq0 qqq0Var, boolean z2) {
        this.R0 = iu30Var;
        boolean z3 = true;
        if (this.S0 != z) {
            this.S0 = z;
            if (!z) {
                rj40 rj40Var = this.b1;
                if (rj40Var != null) {
                    I1(rj40Var);
                }
                rj40 rj40Var2 = this.a1;
                if (rj40Var2 != null) {
                    I1(rj40Var2);
                }
                this.b1 = null;
                this.a1 = null;
                K1();
                this.i1 = null;
            }
            z2 = true;
        }
        if (!u890.j(this.T0, idn0Var)) {
            K1();
            this.T0 = idn0Var;
        }
        if (this.Q0 != qqq0Var) {
            this.Q0 = qqq0Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (this.X0) {
                M1();
                if (this.W0) {
                    V1().l(k4v.a);
                }
                this.g1 = null;
            }
            ua80 ua80Var = this.i1;
            if (ua80Var != null) {
                ua80Var.g();
            }
        }
    }

    @Override // p.va80
    public final void r(mgc mgcVar, cav0 cav0Var) {
        if (this.S0) {
            ua80 ua80Var = this.i1;
            if (ua80Var == null) {
                ua80Var = new ua80(this);
                this.i1 = ua80Var;
            }
            if (this.b1 == null) {
                rj40 rj40VarX = crm0.x(ua80Var);
                H1(rj40VarX);
                this.b1 = rj40VarX;
            }
            ua80 ua80Var2 = this.i1;
            if (ua80Var2 != null) {
                ua80Var2.e(mgcVar, cav0Var);
            }
        }
    }

    public void Q1(long j) {
    }
}
