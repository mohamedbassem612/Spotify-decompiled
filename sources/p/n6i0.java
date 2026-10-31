package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n6i0 extends x7e0 {
    public final llm N0 = smo1.e(op71.f());
    public final bpb1 O0;
    public final bpb1 P0;
    public xab1 Q0;
    public final o3r R0;
    public final o3r S0;
    public final o3r T0;
    public final o3r U0;
    public final o3r V0;
    public final q7i0 X;
    public final bt4 Y;
    public final wai1 Z;
    public final d0r d;
    public final u3i0 e;
    public final y1t0 f;
    public final b7i0 g;
    public final t2r0 h;
    public final q8n i;
    public final bbb1 t;

    public n6i0(d0r d0rVar, u3i0 u3i0Var, y1t0 y1t0Var, b7i0 b7i0Var, t2r0 t2r0Var, q8n q8nVar, bbb1 bbb1Var, q7i0 q7i0Var, bt4 bt4Var, wai1 wai1Var) {
        this.d = d0rVar;
        this.e = u3i0Var;
        this.f = y1t0Var;
        this.g = b7i0Var;
        this.h = t2r0Var;
        this.i = q8nVar;
        this.t = bbb1Var;
        this.X = q7i0Var;
        this.Y = bt4Var;
        this.Z = wai1Var;
        bpb1 bpb1VarB = gio1.b(new x5i0(null, 0L, 0L, 0L, null, null, o6i0.b, false, null, true, 0L, Long.MAX_VALUE));
        this.O0 = bpb1VarB;
        this.P0 = bpb1VarB;
        jd11 jd11Var = rc11.a;
        this.R0 = w3p1.o(new l4r(new xv00(jd11Var.b(d7u0.class)), 1, i6i0.Y, new j4r(l2i0.V0), i6i0.Z), l2i0.W0);
        this.S0 = w3p1.k(new l4r(new xv00(jd11Var.b(d7u0.class)), 2, i6i0.c, new j4r(l2i0.X0), i6i0.d), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, i6i0.e, new j4r(l2i0.Y0), i6i0.f), new l4r(new xv00(jd11Var.b(prl.class)), 1, i6i0.N0, new j4r(l2i0.Z0), i6i0.O0), new l4r(new xv00(jd11Var.b(hll.class)), 1, i6i0.P0, new j4r(l2i0.a1), i6i0.Q0), new l4r(new xv00(jd11Var.b(be60.class)), 1, i6i0.R0, new j4r(l2i0.b1), i6i0.S0), qsj.P0);
        this.T0 = w3p1.o(new l4r(hvm.c, 1, i6i0.T0, new j4r(l2i0.e1), i6i0.g), i6i0.b);
        this.U0 = w3p1.o(new l4r(new xv00(jd11Var.b(jo70.class)), 1, i6i0.h, new j4r(l2i0.c1), i6i0.i), l2i0.d1);
        this.V0 = w3p1.o(new l4r(new xv00(jd11Var.b(zge1.class)), 1, i6i0.t, new j4r(i6i0.U0), i6i0.X), i6i0.V0);
    }

    public static String p(y5i0 y5i0Var) {
        d7u0 d7u0Var = y5i0Var.a;
        ArrayList arrayList = d7u0Var != null ? d7u0Var.b : null;
        if (arrayList == null) {
            arrayList = z6x.a;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            return ((tqj1) it.next()).b.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(n6i0 n6i0Var, xve1 xve1Var, onm onmVar) {
        m6i0 m6i0Var;
        long jA;
        String str;
        if (onmVar instanceof m6i0) {
            m6i0Var = (m6i0) onmVar;
            int i = m6i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m6i0Var.c = i - Integer.MIN_VALUE;
            } else {
                m6i0Var = new m6i0(onmVar);
            }
        } else {
            m6i0Var = new m6i0(onmVar);
        }
        Object objM = m6i0Var.b;
        int i2 = m6i0Var.c;
        if (i2 == 0) {
            hm5.M(objM);
            if (xve1Var instanceof tve1) {
                jA = ((tve1) xve1Var).a;
            } else {
                if (xve1Var instanceof uve1) {
                    eg.m("Ingested timestamps are not supported for trimming");
                    return null;
                }
                if (!(xve1Var instanceof vve1)) {
                    eg.o();
                    return null;
                }
                y1t0 y1t0Var = n6i0Var.f;
                String str2 = n6i0Var.e.a;
                long jV = lm5.v(xve1Var);
                m6i0Var.a = n6i0Var;
                m6i0Var.c = 1;
                objM = y1t0Var.m(jV, str2, m6i0Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            }
            return new Long(jA);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        n6i0Var = m6i0Var.a;
        hm5.M(objM);
        mwe1 mwe1Var = (mwe1) objM;
        if (mwe1Var instanceof kwe1) {
            int i3 = ((kwe1) mwe1Var).b;
            if (i3 == 1) {
                str = "error";
            } else {
                if (i3 != 2) {
                    throw null;
                }
                str = "timeout";
            }
            n6i0Var.q("timestamp_conversion_error", str);
        }
        jA = mwe1Var.a();
        return new Long(jA);
    }

    public final void e() {
        this.Q0 = fn31.T(this.N0, (o8n) null, 0, new tfe0(this, null, (byte) 29), 3);
    }

    public final void f() {
        xab1 xab1Var = this.Q0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Q0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(o3r o3rVar, Object obj, onm onmVar) {
        a6i0 a6i0Var;
        if (onmVar instanceof a6i0) {
            a6i0Var = (a6i0) onmVar;
            int i = a6i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a6i0Var.c = i - Integer.MIN_VALUE;
            } else {
                a6i0Var = new a6i0(this, onmVar);
            }
        } else {
            a6i0Var = new a6i0(this, onmVar);
        }
        Object objI = a6i0Var.a;
        int i2 = a6i0Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            p1e0 p1e0Var = new p1e0(d3p1.F(this.d, o3rVar, obj), (byte) 8);
            a6i0Var.c = 1;
            objI = b5p1.i(p1e0Var, a6i0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        i1r i1rVar = (k1r) objI;
        if (i1rVar instanceof i1r) {
            return i1rVar.a;
        }
        if (i1rVar instanceof h1r) {
            eg.m(((h1r) i1rVar).a.getMessage());
            return null;
        }
        eg.m("Unexpected DataResult state");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable l(String str, onm onmVar) {
        d6i0 d6i0Var;
        List list;
        if (onmVar instanceof d6i0) {
            d6i0Var = (d6i0) onmVar;
            int i = d6i0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d6i0Var.d = i - Integer.MIN_VALUE;
            } else {
                d6i0Var = new d6i0(this, onmVar);
            }
        } else {
            d6i0Var = new d6i0(this, onmVar);
        }
        Object objK = d6i0Var.b;
        int i2 = d6i0Var.d;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                o3r o3rVar = this.T0;
                d6i0Var.d = 1;
                objK = k(o3rVar, str, d6i0Var);
                if (objK == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                hm5.M(objK);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = d6i0Var.a;
                hm5.M(objK);
            }
            return w361.u(list, (Map) objK);
            List list2 = (List) objK;
            if (list2.isEmpty()) {
                return z6x.a;
            }
            v4e0 v4e0Var = new v4e0(list2, this, (lnm) null, (byte) 23);
            d6i0Var.a = list2;
            d6i0Var.d = 2;
            objK = smo1.s(v4e0Var, d6i0Var);
            if (objK != d9nVar) {
                list = list2;
                return w361.u(list, (Map) objK);
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, onm onmVar) throws Exception {
        e6i0 e6i0Var;
        String str2;
        Object objK;
        Exception e;
        if (onmVar instanceof e6i0) {
            e6i0Var = (e6i0) onmVar;
            int i = e6i0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                e6i0Var.e = i - Integer.MIN_VALUE;
            } else {
                e6i0Var = new e6i0(this, onmVar);
            }
        } else {
            e6i0Var = new e6i0(this, onmVar);
        }
        Object obj = e6i0Var.c;
        int i2 = e6i0Var.e;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                str2 = "metadata_error";
                try {
                    o3r o3rVar = this.S0;
                    e6i0Var.a = this;
                    e6i0Var.b = "metadata_error";
                    e6i0Var.e = 1;
                    objK = k(o3rVar, str, e6i0Var);
                    d9n d9nVar = d9n.a;
                    if (objK == d9nVar) {
                        return d9nVar;
                    }
                } catch (Exception e2) {
                    e = e2;
                    this.q(str2, e.getClass().getSimpleName());
                    throw e;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = e6i0Var.b;
                n6i0 n6i0Var = e6i0Var.a;
                try {
                    hm5.M(obj);
                    str2 = str3;
                    this = n6i0Var;
                    objK = obj;
                } catch (Exception e3) {
                    str2 = str3;
                    this = n6i0Var;
                    e = e3;
                    this.q(str2, e.getClass().getSimpleName());
                    throw e;
                }
            }
            return (y5i0) objK;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(long j, String str, onm onmVar) throws Throwable {
        f6i0 f6i0Var;
        Object objA;
        if (onmVar instanceof f6i0) {
            f6i0Var = (f6i0) onmVar;
            int i = f6i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6i0Var.c = i - Integer.MIN_VALUE;
            } else {
                f6i0Var = new f6i0(this, onmVar);
            }
        } else {
            f6i0Var = new f6i0(this, onmVar);
        }
        Object obj = f6i0Var.a;
        int i2 = f6i0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                wai1 wai1Var = this.Z;
                mw01 mw01Var = new mw01(str, j);
                f6i0Var.c = 1;
                objA = wai1Var.a(mw01Var, f6i0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objA = ((e331) obj).a;
            }
            Throwable thA = e331.a(objA);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                q("range_recommendation_error", thA.getClass().getSimpleName());
            }
            if (objA instanceof m231) {
                objA = null;
            }
            return (nw01) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            q("range_recommendation_error", e2.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, onm onmVar) {
        h6i0 h6i0Var;
        if (onmVar instanceof h6i0) {
            h6i0Var = (h6i0) onmVar;
            int i = h6i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6i0Var.c = i - Integer.MIN_VALUE;
            } else {
                h6i0Var = new h6i0(this, onmVar);
            }
        } else {
            h6i0Var = new h6i0(this, onmVar);
        }
        Object objK = h6i0Var.a;
        int i2 = h6i0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                Set set = s4b1.f;
                if (uic.x(str).c == blc0.ti) {
                    o3r o3rVar = this.V0;
                    h6i0Var.c = 1;
                    objK = k(o3rVar, str, h6i0Var);
                    Object obj = d9n.a;
                    if (objK == obj) {
                        return obj;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
            return (zge1) objK;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public final void q(String str, String str2) {
        this.h.c(new u2r0(str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(String str, onm onmVar) {
        j6i0 j6i0Var;
        z1u0 z1u0Var;
        if (onmVar instanceof j6i0) {
            j6i0Var = (j6i0) onmVar;
            int i = j6i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j6i0Var.c = i - Integer.MIN_VALUE;
            } else {
                j6i0Var = new j6i0(this, onmVar);
            }
        } else {
            j6i0Var = new j6i0(this, onmVar);
        }
        Object objK = j6i0Var.a;
        int i2 = j6i0Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            j6i0Var.c = 1;
            objK = k(this.R0, str, j6i0Var);
            Object obj = d9n.a;
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        d7u0 d7u0Var = (d7u0) objK;
        Iterator it = d7u0Var.a.iterator();
        do {
            if (!it.hasNext()) {
                z1u0Var = null;
                break;
            }
            z1u0Var = ((my7) it.next()).c;
        } while (z1u0Var == null);
        if (z1u0Var == null) {
            Iterator it2 = d7u0Var.b.iterator();
            do {
                if (!it2.hasNext()) {
                    z1u0Var = null;
                    break;
                }
                z1u0Var = ((tqj1) it2.next()).d;
            } while (z1u0Var == null);
        }
        if (z1u0Var != null) {
            return new r3i0(new tve1(jfv.h(z1u0Var.a)), new tve1(jfv.h(z1u0Var.b)));
        }
        q("clip_offsets_error", "missing");
        eg.m("Clip has missing saved offsets");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable s(t3i0 t3i0Var, blc0 blc0Var, onm onmVar) throws Throwable {
        k6i0 k6i0Var;
        Object objT;
        t3i0 t3i0Var2;
        t3i0 t3i0Var3;
        xve1 xve1Var;
        if (onmVar instanceof k6i0) {
            k6i0Var = (k6i0) onmVar;
            int i = k6i0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k6i0Var.e = i - Integer.MIN_VALUE;
            } else {
                k6i0Var = new k6i0(this, onmVar);
            }
        } else {
            k6i0Var = new k6i0(this, onmVar);
        }
        Object objN = k6i0Var.c;
        int i2 = k6i0Var.e;
        nw01 nw01Var = null;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                t3i0Var = k6i0Var.a;
                hm5.M(objN);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t3i0Var3 = k6i0Var.b;
                hm5.M(objN);
            }
            nw01Var = (nw01) objN;
            t3i0Var2 = t3i0Var3;
            return new mmr0(t3i0Var2, nw01Var);
        }
        hm5.M(objN);
        k6i0Var.a = t3i0Var;
        k6i0Var.e = 1;
        if (blc0Var != blc0.ti) {
            objT = t(t3i0Var, k6i0Var);
        } else if (t3i0Var instanceof s3i0) {
            objT = new s3i0(new tve1(lm5.v(((s3i0) t3i0Var).a)));
        } else {
            if (!(t3i0Var instanceof r3i0)) {
                eg.o();
                return null;
            }
            r3i0 r3i0Var = (r3i0) t3i0Var;
            tve1 tve1Var = new tve1(lm5.v(r3i0Var.a));
            xve1 xve1Var2 = r3i0Var.b;
            objT = new r3i0(tve1Var, xve1Var2 != null ? new tve1(lm5.v(xve1Var2)) : null);
        }
        objN = objT;
        if (objN != d9nVar) {
        }
        return d9nVar;
        t3i0Var2 = (t3i0) objN;
        if (this.Y.b()) {
            r3i0 r3i0Var2 = t3i0Var instanceof r3i0 ? (r3i0) t3i0Var : null;
            if (r3i0Var2 == null || (xve1Var = r3i0Var2.b) == null || lm5.v(((r3i0) t3i0Var).a) == lm5.v(xve1Var)) {
                long j = t3i0Var2.m().a;
                String str = this.e.a;
                k6i0Var.a = null;
                k6i0Var.b = t3i0Var2;
                k6i0Var.e = 2;
                objN = n(j, str, k6i0Var);
                if (objN != d9nVar) {
                    t3i0Var3 = t3i0Var2;
                    nw01Var = (nw01) objN;
                    t3i0Var2 = t3i0Var3;
                }
                return d9nVar;
            }
        }
        return new mmr0(t3i0Var2, nw01Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(t3i0 t3i0Var, onm onmVar) {
        l6i0 l6i0Var;
        t3i0 t3i0Var2;
        r3i0 r3i0Var;
        s3i0 s3i0Var;
        tve1 tve1Var;
        xve1 xve1Var;
        Object objU;
        tve1 tve1Var2;
        if (onmVar instanceof l6i0) {
            l6i0Var = (l6i0) onmVar;
            int i = l6i0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6i0Var.g = i - Integer.MIN_VALUE;
            } else {
                l6i0Var = new l6i0(this, onmVar);
            }
        } else {
            l6i0Var = new l6i0(this, onmVar);
        }
        Object objU2 = l6i0Var.e;
        int i2 = l6i0Var.g;
        tve1 tve1Var3 = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objU2);
            if (t3i0Var instanceof s3i0) {
                s3i0 s3i0Var2 = (s3i0) t3i0Var;
                xve1 xve1Var2 = s3i0Var2.a;
                l6i0Var.a = null;
                l6i0Var.b = s3i0Var2;
                l6i0Var.g = 1;
                objU2 = u(this, xve1Var2, l6i0Var);
                if (objU2 != d9nVar) {
                    s3i0Var = s3i0Var2;
                    tve1 tve1Var4 = new tve1(((Number) objU2).longValue());
                    s3i0Var.getClass();
                    return new s3i0(tve1Var4);
                }
            } else {
                if (!(t3i0Var instanceof r3i0)) {
                    eg.o();
                    return null;
                }
                r3i0 r3i0Var2 = (r3i0) t3i0Var;
                xve1 xve1Var3 = r3i0Var2.a;
                l6i0Var.a = r3i0Var2;
                l6i0Var.b = r3i0Var2;
                l6i0Var.g = 2;
                Object objU3 = u(this, xve1Var3, l6i0Var);
                if (objU3 != d9nVar) {
                    t3i0Var2 = t3i0Var;
                    r3i0Var = r3i0Var2;
                    objU2 = objU3;
                    tve1Var = new tve1(((Number) objU2).longValue());
                    xve1Var = ((r3i0) t3i0Var2).b;
                    if (xve1Var != null) {
                        l6i0Var.a = null;
                        l6i0Var.b = null;
                        l6i0Var.c = r3i0Var;
                        l6i0Var.d = tve1Var;
                        l6i0Var.g = 3;
                        objU = u(this, xve1Var, l6i0Var);
                        if (objU != d9nVar) {
                            objU2 = objU;
                            tve1Var2 = tve1Var;
                            tve1Var3 = new tve1(((Number) objU2).longValue());
                            tve1Var = tve1Var2;
                        }
                    }
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            s3i0Var = (s3i0) l6i0Var.b;
            hm5.M(objU2);
            tve1 tve1Var5 = new tve1(((Number) objU2).longValue());
            s3i0Var.getClass();
            return new s3i0(tve1Var5);
        }
        if (i2 == 2) {
            r3i0Var = (r3i0) l6i0Var.b;
            t3i0Var2 = l6i0Var.a;
            hm5.M(objU2);
            tve1Var = new tve1(((Number) objU2).longValue());
            xve1Var = ((r3i0) t3i0Var2).b;
            if (xve1Var != null) {
                l6i0Var.a = null;
                l6i0Var.b = null;
                l6i0Var.c = r3i0Var;
                l6i0Var.d = tve1Var;
                l6i0Var.g = 3;
                objU = u(this, xve1Var, l6i0Var);
                if (objU != d9nVar) {
                    objU2 = objU;
                    tve1Var2 = tve1Var;
                }
                return d9nVar;
            }
        } else {
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tve1Var2 = l6i0Var.d;
            r3i0Var = l6i0Var.c;
            xve1 xve1Var4 = l6i0Var.b;
            hm5.M(objU2);
        }
        tve1Var3 = new tve1(((Number) objU2).longValue());
        tve1Var = tve1Var2;
        r3i0Var.getClass();
        return new r3i0(tve1Var, tve1Var3);
    }
}
