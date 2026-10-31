package p;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class j9k1 implements t9k1 {
    public static b180 a;

    public static final void A(vga0 vga0Var, String str, String str2) {
        vga0Var.b(str, fga0.c(str2));
    }

    public static final void B(vga0 vga0Var, String str, iu30 iu30Var) {
        vga0 vga0Var2 = new vga0();
        iu30Var.invoke(vga0Var2);
        vga0Var.b(str, vga0Var2.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object C(c0r c0rVar, onm onmVar) {
        jkx0 jkx0Var;
        if (onmVar instanceof jkx0) {
            jkx0Var = (jkx0) onmVar;
            int i = jkx0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkx0Var.b = i - Integer.MIN_VALUE;
            } else {
                jkx0Var = new jkx0(onmVar);
            }
        } else {
            jkx0Var = new jkx0(onmVar);
        }
        Object objK = jkx0Var.a;
        int i2 = jkx0Var.b;
        if (i2 == 0) {
            hm5.M(objK);
            c1v0 c1v0Var = new c1v0(c0rVar.a().a, (byte) 28);
            jkx0Var.b = 1;
            objK = b5p1.k(c1v0Var, jkx0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        e331 e331Var = (e331) objK;
        return e331Var != null ? e331Var.a : new m231(new IOException("Failed to load required metadata"));
    }

    public static final long D(long j) {
        ngv ngvVar = ngv.g;
        long jU = jfv.u(j, ngvVar);
        int iJ = jfv.j(j);
        if (jfv.l(j) < 30) {
            return j;
        }
        long jL0 = fdg1.l0(jU, ngvVar);
        ngv ngvVar2 = ngv.f;
        return jfv.q(jfv.q(jL0, fdg1.k0(iJ, ngvVar2)), fdg1.k0(1, ngvVar2));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.AbstractCollection, java.util.Collection, p.a9, p.bi91] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.AbstractCollection, java.util.Collection, p.a9, p.bi91] */
    public static final Collection E(Collection collection, iu30 iu30Var) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        ?? bi91Var = new bi91();
        while (!linkedList.isEmpty()) {
            Object objQ0 = o7h.q0(linkedList);
            ?? bi91Var2 = new bi91();
            ArrayList arrayListG = exq0.g(objQ0, linkedList, iu30Var, new gqb0(bi91Var2, (byte) 9));
            if (arrayListG.size() == 1 && bi91Var2.isEmpty()) {
                bi91Var.add(o7h.U0(arrayListG));
            } else {
                Object objS = exq0.s(arrayListG, iu30Var);
                hyc hycVar = (hyc) iu30Var.invoke(objS);
                for (Object obj : arrayListG) {
                    obj.getClass();
                    if (!exq0.k(hycVar, (hyc) iu30Var.invoke(obj))) {
                        bi91Var2.add(obj);
                    }
                }
                if (!bi91Var2.isEmpty()) {
                    bi91Var.addAll(bi91Var2);
                }
                bi91Var.add(objS);
            }
        }
        return bi91Var;
    }

    public static final o3r F(ArrayList arrayList) {
        l4r l4rVar;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zp21 zp21Var = (aq21) it.next();
            if (zp21Var instanceof zp21) {
                l4rVar = new l4r(new xv00(rc11.a.b((Class) zp21Var.a)), 1, kex0.W0, new j4r(kex0.Y0), kex0.X0);
            } else {
                if (!(zp21Var instanceof yp21)) {
                    eg.o();
                    return null;
                }
                l4rVar = new l4r(new xv00(rc11.a.b((Class) ((yp21) zp21Var).a)), 2, kex0.U0, new j4r(kex0.Z0), kex0.V0);
            }
            arrayList2.add(l4rVar);
        }
        return new o3r(arrayList2, kex0.T0, false);
    }

    public static final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2101642018);
        if (x340Var.Y(i & 1, i != 0)) {
            men1.e(cwl1.o0(x340Var, 2131956364), (qim0) null, 0.0f, x340Var, 0, 6);
            b(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 12);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1449765163);
        if (x340Var.Y(i & 1, i != 0)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131956376);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            c(cwl1.o0(x340Var, 2131956380), mqo1.s(new String[]{cwl1.o0(x340Var, 2131956374), cwl1.o0(x340Var, 2131956361), cwl1.o0(x340Var, 2131956362)}), x340Var, 0);
            c(cwl1.o0(x340Var, 2131956381), mqo1.s(new String[]{cwl1.o0(x340Var, 2131956378)}), x340Var, 0);
            String strO1 = cwl1.o0(x340Var, 2131956375);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 13);
        }
    }

    public static final void c(String str, c380 c380Var, b0k b0kVar, int i) {
        c380 c380Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1718749027);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = vc40.e1;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(nim0Var, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2032);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            cvx cvxVar2 = cbx.b(x340Var).b;
            c380Var2 = c380Var;
            op71.a(c380Var2, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var2, 0L, 0.0f, x340Var, (i2 >> 3) & 14, 24);
            x340Var.r(true);
        } else {
            c380Var2 = c380Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f850(str, c380Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x015c  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0200  */
    /* JADX WARN: Code duplicated, block: B:87:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void d(Set set, String str, qim0 qim0Var, int i, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        int i5;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        qim0 qim0VarB;
        Iterator it;
        Object next;
        x0a x0aVar;
        o1v o1vVar;
        o1v o1vVar2;
        qim0 qim0Var6;
        int iOrdinal;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(106579606);
        int i6 = 2;
        int i7 = (x340Var.g(set) ? 4 : 2) | i2 | (x340Var.g(str) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                qim0Var2 = qim0Var;
                i7 |= x340Var.g(qim0Var2) ? 256 : 128;
            }
            if (x340Var.e(i)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i7 | i4;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i8 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var5);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0VarB = uyn1.B(qim0Var4, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                if (set.contains(z0a.a)) {
                    x340Var.i0(-1437502850);
                    xap1.f(0, 0, x340Var, qim0VarB);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1437454800);
                    x340Var.r(false);
                }
                nys0 nys0Var = new nys0(set.contains(c1a.a));
                zov0 zov0Var = cbx.b(x340Var).g;
                luo1.i(nys0Var, u291.r(qim0VarB, 12.0f), x340Var, 0);
                fap1.b(0, x340Var, qim0VarB, set.contains(e1a.a));
                m1p1.n(0, x340Var, qim0VarB, set.contains(a1a.a));
                yap1.c(0, x340Var, qim0VarB, set.contains(d1a.a));
                s3o1.h(0, x340Var, qim0VarB, set.contains(b1a.a));
                t890.f(0, x340Var, qim0VarB, set.contains(y0a.a));
                it = set.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((g1a) next) instanceof x0a));
                x0aVar = next instanceof x0a ? (x0a) next : null;
                o1vVar = o1v.a;
                if (x0aVar != null) {
                    o1vVar2 = x0aVar.a;
                } else {
                    o1vVar2 = o1vVar;
                }
                if (o1vVar2 != o1vVar) {
                    x340Var.i0(-1436768522);
                    iOrdinal = o1vVar2.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            i6 = 3;
                        } else if (iOrdinal != 4) {
                            i6 = 1;
                        } else {
                            i6 = 4;
                        }
                    }
                    acq0.e(i6, 0, x340Var, qim0VarB);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1436682032);
                    x340Var.r(false);
                }
                j2p1.q(0, x340Var, qim0VarB, set.contains(f1a.a));
                if (str != null || ihc1.y0(str)) {
                    qim0Var6 = qim0Var5;
                    x340Var.i0(-1436265392);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1436505828);
                    uwr uwrVar2 = cbx.a;
                    qim0Var6 = qim0Var5;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(i), 0, (qx8) null, x340Var, ((i5 >> 3) & 14) | 1572864, 0, 1714);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var3 = qim0Var6;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mxy(set, str, qim0Var3, i, i2, i3);
            }
        }
        i7 |= 384;
        qim0Var2 = qim0Var;
        if (x340Var.e(i)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        i5 = i7 | i4;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i8 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var5);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar3 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0VarB = uyn1.B(qim0Var4, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            if (set.contains(z0a.a)) {
                x340Var.i0(-1437502850);
                xap1.f(0, 0, x340Var, qim0VarB);
                x340Var.r(false);
            } else {
                x340Var.i0(-1437454800);
                x340Var.r(false);
            }
            nys0 nys0Var2 = new nys0(set.contains(c1a.a));
            zov0 zov0Var2 = cbx.b(x340Var).g;
            luo1.i(nys0Var2, u291.r(qim0VarB, 12.0f), x340Var, 0);
            fap1.b(0, x340Var, qim0VarB, set.contains(e1a.a));
            m1p1.n(0, x340Var, qim0VarB, set.contains(a1a.a));
            yap1.c(0, x340Var, qim0VarB, set.contains(d1a.a));
            s3o1.h(0, x340Var, qim0VarB, set.contains(b1a.a));
            t890.f(0, x340Var, qim0VarB, set.contains(y0a.a));
            it = set.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((g1a) next) instanceof x0a));
            x0aVar = next instanceof x0a ? (x0a) next : null;
            o1vVar = o1v.a;
            if (x0aVar != null) {
                o1vVar2 = x0aVar.a;
            } else {
                o1vVar2 = o1vVar;
            }
            if (o1vVar2 != o1vVar) {
                x340Var.i0(-1436768522);
                iOrdinal = o1vVar2.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        i6 = 3;
                    } else if (iOrdinal != 4) {
                        i6 = 1;
                    } else {
                        i6 = 4;
                    }
                }
                acq0.e(i6, 0, x340Var, qim0VarB);
                x340Var.r(false);
            } else {
                x340Var.i0(-1436682032);
                x340Var.r(false);
            }
            j2p1.q(0, x340Var, qim0VarB, set.contains(f1a.a));
            if (str != null) {
                qim0Var6 = qim0Var5;
                x340Var.i0(-1436265392);
                x340Var.r(false);
            } else {
                qim0Var6 = qim0Var5;
                x340Var.i0(-1436265392);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mxy(set, str, qim0Var3, i, i2, i3);
        }
    }

    public static final void e(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-342087251);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131956363);
            String strN0 = cwl1.n0(2131956377, new Object[]{strO0}, x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0.a, 16.0f));
            c9 c9VarS = mqo1.s(new mae1[]{new mae1(strO0, str)});
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new xet(function0, (byte) 12);
                x340Var.s0(objT);
            }
            i8p1.i(strN0, c9VarS, (iu30) objT, (qim0) null, (lee1) null, cbx.a(x340Var).b.a, cbx.a(x340Var).b.a, x340Var, 0, 24);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 9);
        }
    }

    public static final void f(p850 p850Var, lc20 lc20Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-40624454);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(p850Var) : x340Var.i(p850Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(lc20Var) : x340Var.i(lc20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(-1655626547, new k850(p850Var, iu30Var, lc20Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(p850Var, lc20Var, iu30Var, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void g(u1g0 u1g0Var, iu30 iu30Var, ViewGroup.LayoutParams layoutParams, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        iu30 iu30Var3;
        int i4;
        boolean z;
        b0k b0kVar2;
        iu30 iu30Var4;
        h311 h311VarV;
        boolean z2;
        boolean z3;
        boolean zI;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1089024992);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(u1g0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(layoutParams) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            qim0Var2 = qim0Var;
            i3 |= b0kVar3.g(qim0Var2) ? 2048 : 1024;
        } else {
            qim0Var2 = qim0Var;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                iu30Var3 = iu30Var2;
                i3 |= b0kVar3.i(iu30Var3) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    iu30Var3 = null;
                } else {
                    iu30Var3 = iu30Var3;
                }
                if ((57344 & i4) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i4 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zI = z2 | z3 | ((i4 & 14) == 4) | b0kVar3.i(layoutParams);
                objT = b0kVar3.T();
                if (zI || objT == fkj0.X) {
                    ntf0 ntf0Var = new ntf0(iu30Var, u1g0Var, layoutParams, iu30Var3, (byte) 1);
                    b0kVar3.s0(ntf0Var);
                    objT = ntf0Var;
                }
                b0kVar2 = b0kVar3;
                dm5.a((iu30) objT, qim0Var2, (iu30) null, b0kVar2, (i4 >> 6) & 112, 4);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            iu30Var4 = iu30Var3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(u1g0Var, iu30Var, layoutParams, qim0Var, iu30Var4, i, i2, (byte) 12);
            }
        }
        i3 |= 24576;
        iu30Var3 = iu30Var2;
        i4 = i3;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            if (i5 != 0) {
                iu30Var3 = null;
            } else {
                iu30Var3 = iu30Var3;
            }
            if ((57344 & i4) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i4 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            zI = z2 | z3 | ((i4 & 14) == 4) | b0kVar3.i(layoutParams);
            objT = b0kVar3.T();
            if (zI) {
                ntf0 ntf0Var2 = new ntf0(iu30Var, u1g0Var, layoutParams, iu30Var3, (byte) 1);
                b0kVar3.s0(ntf0Var2);
                objT = ntf0Var2;
            } else {
                ntf0 ntf0Var3 = new ntf0(iu30Var, u1g0Var, layoutParams, iu30Var3, (byte) 1);
                b0kVar3.s0(ntf0Var3);
                objT = ntf0Var3;
            }
            b0kVar2 = b0kVar3;
            dm5.a((iu30) objT, qim0Var2, (iu30) null, b0kVar2, (i4 >> 6) & 112, 4);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        iu30Var4 = iu30Var3;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(u1g0Var, iu30Var, layoutParams, qim0Var, iu30Var4, i, i2, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void h(cj31 cj31Var, boolean z, lk31 lk31Var, qim0 qim0Var, int i, int i2, ik31 ik31Var, b0k b0kVar, int i3, int i4) {
        qim0 qim0Var2;
        int i5;
        int iC;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        qim0 qim0Var3;
        ik31 ik31Var2;
        h311 h311VarV;
        qim0 qim0Var4;
        int i14;
        int i15;
        int i16;
        ik31 ik31Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1646358947);
        int i17 = (x340Var.i(cj31Var) ? 4 : 2) | i3 | (x340Var.h(z) ? 32 : 16) | (x340Var.g(lk31Var) ? 256 : 128);
        int i18 = i4 & 8;
        if (i18 == 0) {
            if ((i3 & 3072) == 0) {
                qim0Var2 = qim0Var;
                i17 |= x340Var.g(qim0Var2) ? 2048 : 1024;
            }
            i5 = i4 & 16;
            if (i5 != 0) {
                i17 |= 24576;
            } else if ((i3 & 24576) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var.e(iC)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i17 |= i6;
            }
            i7 = i4 & 32;
            if (i7 != 0) {
                i17 |= 196608;
            } else if ((196608 & i3) == 0) {
                if (x340Var.e(i2 != 0 ? l1d.C(i2) : -1)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i17 |= i8;
            }
            i9 = i4 & 64;
            if (i9 != 0) {
                i11 = i17 | 1572864;
            } else {
                if (x340Var.g(ik31Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i11 = i17 | i10;
            }
            if ((599187 & i11) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i11 & 1, z2)) {
                if (i18 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    i15 = 4;
                    i14 = i7;
                } else {
                    i14 = i7;
                    i15 = i;
                }
                if (i14 != 0) {
                    i16 = 2;
                } else {
                    i16 = i2;
                }
                if (i9 != 0) {
                    ik31Var3 = null;
                } else {
                    ik31Var3 = ik31Var;
                }
                if (cj31Var instanceof bj31) {
                    x340Var.i0(1847444430);
                    lk31Var.a(new jk31(((bj31) cj31Var).a, z, i15, i16, ik31Var3, (Function0) null, (iu30) null, 96), u291.d(qim0Var4, 1.0f), x340Var, i11 & 896);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1847757251);
                    x340Var.r(false);
                }
                qim0Var3 = qim0Var4;
                i12 = i15;
                i13 = i16;
                ik31Var2 = ik31Var3;
            } else {
                x340Var.b0();
                i12 = i;
                i13 = i2;
                qim0Var3 = qim0Var2;
                ik31Var2 = ik31Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new t6m1(cj31Var, z, lk31Var, qim0Var3, i12, i13, ik31Var2, i3, i4);
            }
        }
        i17 |= 3072;
        qim0Var2 = qim0Var;
        i5 = i4 & 16;
        if (i5 != 0) {
            i17 |= 24576;
        } else if ((i3 & 24576) == 0) {
            if (i == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i);
            }
            if (x340Var.e(iC)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i17 |= i6;
        }
        i7 = i4 & 32;
        if (i7 != 0) {
            i17 |= 196608;
        } else if ((196608 & i3) == 0) {
            if (x340Var.e(i2 != 0 ? l1d.C(i2) : -1)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i17 |= i8;
        }
        i9 = i4 & 64;
        if (i9 != 0) {
            i11 = i17 | 1572864;
        } else {
            if (x340Var.g(ik31Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i11 = i17 | i10;
        }
        if ((599187 & i11) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i11 & 1, z2)) {
            if (i18 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i5 != 0) {
                i15 = 4;
                i14 = i7;
            } else {
                i14 = i7;
                i15 = i;
            }
            if (i14 != 0) {
                i16 = 2;
            } else {
                i16 = i2;
            }
            if (i9 != 0) {
                ik31Var3 = null;
            } else {
                ik31Var3 = ik31Var;
            }
            if (cj31Var instanceof bj31) {
                x340Var.i0(1847444430);
                lk31Var.a(new jk31(((bj31) cj31Var).a, z, i15, i16, ik31Var3, (Function0) null, (iu30) null, 96), u291.d(qim0Var4, 1.0f), x340Var, i11 & 896);
                x340Var.r(false);
            } else {
                x340Var.i0(1847757251);
                x340Var.r(false);
            }
            qim0Var3 = qim0Var4;
            i12 = i15;
            i13 = i16;
            ik31Var2 = ik31Var3;
        } else {
            x340Var.b0();
            i12 = i;
            i13 = i2;
            qim0Var3 = qim0Var2;
            ik31Var2 = ik31Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t6m1(cj31Var, z, lk31Var, qim0Var3, i12, i13, ik31Var2, i3, i4);
        }
    }

    public static final void i(vta1 vta1Var, vta1 vta1Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-442984154);
        int i2 = i | (b0kVar2.i(vta1Var) ? 4 : 2) | (b0kVar2.i(vta1Var2) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, voo1.y(u291.f(qim0Var3, 1.0f), voo1.g));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131962832);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
            uwo1.e(cwl1.o0(b0kVar2, 2131962829), uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            idx idxVar = new idx(4);
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, vta1Var), idxVar, qim0VarB, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, okj.a, b0kVar2, 0, 48, 2040);
            foo1.c(new gbx(z50Var, vta1Var2), ldx.c, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 8.0f, 5), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, okj.b, b0kVar2, 0, 48, 2040);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(vta1Var, vta1Var2, qim0Var2, i, (byte) 21);
        }
    }

    public static final void j(Integer num, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1446986817);
        int i2 = (x340Var.g(num) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            k(x340Var, 0);
            men1.e(cwl1.o0(x340Var, 2131956373), (qim0) null, 0.0f, x340Var, 0, 6);
            if (num != null) {
                x340Var.i0(1140999223);
                strK = cwl1.n0(2131956372, new Object[]{num}, x340Var);
                x340Var.r(false);
            } else {
                strK = x0d.k(x340Var, 1141151867, 2131956371, x340Var, false);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strK, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.i0(591025168);
            ListIterator listIterator = mqo1.s(new mmr0[]{new mmr0(vlx.c, cwl1.o0(x340Var, 2131956367)), new mmr0(tnx.c, cwl1.o0(x340Var, 2131956369)), new mmr0(mrx.c, cwl1.o0(x340Var, 2131956370)), new mmr0(bnx.c, cwl1.o0(x340Var, 2131956368))}).listIterator(0);
            while (listIterator.hasNext()) {
                mmr0 mmr0Var = (mmr0) listIterator.next();
                hux huxVar = (hux) mmr0Var.a;
                String str = (String) mmr0Var.b;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                b9p1.b(huxVar, str, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), x340Var, 8, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb2(num, i);
        }
    }

    public static final void k(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1057606907);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarQ = i1p1.q(qim0VarB, er31.b(12.0f));
            ni7 ni7VarA = oi7.a(Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-graduation/GraduationEducation.webp"), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070);
            as80 as80Var = mif1.S0;
            cbx.a.getClass();
            eso1.h(ni7VarA, isl.a, qim0VarQ, null, null, uwr.d(), as80Var, null, null, x340Var, 3120, 400);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 14);
        }
    }

    public static final ln21 l(ln21 ln21Var) {
        ln21Var.getClass();
        return ln21Var;
    }

    public static String m(Context context, String str, f0u f0uVar, boolean z, boolean z2, int i) {
        if (z2 && u890.j((Object) null, Boolean.FALSE)) {
            return o(context, f0uVar, str, null);
        }
        return z ? context.getString(a6o1.u(f0uVar)) : str;
    }

    public static String n(Context context, String str, f0u f0uVar, boolean z, boolean z2, String str2, luq0 luq0Var, f0u f0uVar2) {
        boolean z3;
        List listM = p7h.M(new Object[]{str2, luq0Var, f0uVar2});
        boolean z4 = false;
        if (!(listM instanceof Collection) || !listM.isEmpty()) {
            Iterator it = listM.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = true;
                    break;
                }
                if (it.next() == null) {
                    z3 = false;
                    break;
                }
            }
        } else {
            z3 = true;
            break;
        }
        if (z && !z3) {
            z4 = true;
        }
        if (str2 != null) {
            o7h.i0(f46.S0(new luq0[]{luq0.e, luq0.d, luq0.c}), luq0Var);
        }
        if (z4) {
            return context.getString(a6o1.u(f0uVar));
        }
        return (!z3 || str2 == null) ? str : str2;
    }

    public static final String o(Context context, f0u f0uVar, String str, String str2) {
        int iOrdinal = f0uVar.ordinal();
        if (iOrdinal == 2) {
            str = context.getString(2131954261);
        } else if (iOrdinal == 3) {
            str = context.getString(2131954260);
        }
        str.getClass();
        return context.getString(2131954233, str2, str);
    }

    public static final g23 p() {
        return new g23((byte) 15);
    }

    public static final jez q(q6w0 q6w0Var, kig1 kig1Var) {
        w8w0 w8w0Var;
        jez jezVar;
        hez hezVar = q6w0Var.c;
        if (hezVar != null && (jezVar = hezVar.a) != null) {
            return jezVar;
        }
        Map map = kig1Var.a;
        return (map == null || (w8w0Var = (w8w0) map.get(q6w0Var.a)) == null) ? jez.X : w8w0Var.b.a;
    }

    public static final ha20 r(q6w0 q6w0Var, kig1 kig1Var) {
        w8w0 w8w0Var;
        ha20 ha20Var;
        fa20 fa20Var = q6w0Var.d;
        if (fa20Var != null && (ha20Var = fa20Var.a) != null) {
            return ha20Var;
        }
        Map map = kig1Var.a;
        return (map == null || (w8w0Var = (w8w0) map.get(q6w0Var.a)) == null) ? ha20.b : w8w0Var.c.a;
    }

    public static final rx30 s(q6w0 q6w0Var, kig1 kig1Var) {
        w8w0 w8w0Var;
        rx30 rx30Var;
        px30 px30Var = q6w0Var.e;
        if (px30Var != null && (rx30Var = px30Var.a) != null) {
            return rx30Var;
        }
        Map map = kig1Var.a;
        return (map == null || (w8w0Var = (w8w0) map.get(q6w0Var.a)) == null) ? rx30.b : w8w0Var.d.a;
    }

    public static final duk1 t(q6w0 q6w0Var, kig1 kig1Var) {
        w8w0 w8w0Var;
        duk1 duk1Var;
        buk1 buk1Var = q6w0Var.b;
        if (buk1Var != null && (duk1Var = buk1Var.a) != null) {
            return duk1Var;
        }
        Map map = kig1Var.a;
        return (map == null || (w8w0Var = (w8w0) map.get(q6w0Var.a)) == null) ? duk1.Z : w8w0Var.a.a;
    }

    public static final String u(Context context) {
        return context.getString(2131954255);
    }

    public static final boolean v(Set set) {
        Set<g1a> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        for (g1a g1aVar : set2) {
            if (!(g1aVar instanceof x0a) || ((x0a) g1aVar).a != o1v.a) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        blc0 blc0Var = s4b1VarX.c;
        if ((blc0Var == blc0.ti && !s4b1VarX.u()) || blc0Var == blc0.ee || blc0Var == blc0.g1 || blc0Var == blc0.u1) {
            return true;
        }
        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
            return true;
        }
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e) || blc0Var == blc0.Pg || blc0Var == blc0.fh;
    }

    public static final qim0 x(qim0 qim0Var, xu30 xu30Var) {
        return qim0Var.then(new glb0(xu30Var));
    }

    public static final void y(vga0 vga0Var, String str, Boolean bool) {
        vga0Var.b(str, fga0.a(bool));
    }

    public static final void z(vga0 vga0Var, String str, Number number) {
        vga0Var.b(str, fga0.b(number));
    }
}
