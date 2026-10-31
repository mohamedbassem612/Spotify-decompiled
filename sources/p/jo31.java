package p;

import android.os.Parcelable;
import android.view.DragEvent;
import android.view.ViewGroup;
import com.spotify.mobius.Next;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class jo31 {
    public static final y550 a = new y550("Unknown", "Unknown");
    public static b180 b;
    public static ye90 c;

    public static final void a(String str, kb4 kb4Var, pdl pdlVar, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(385813343);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(kb4Var) ? 32 : 16) | (x340Var.g(pdlVar) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = {str};
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = aok.h;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            Object[] objArr2 = {str};
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = aok.g;
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT2, x340Var, 48);
            ven0 ven0VarS = v8r.s(function0, x340Var);
            boolean zI = x340Var.i(ven0Var2) | x340Var.i(ven0VarS);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new zqe(ven0Var2, ven0VarS, (byte) 1);
                x340Var.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            e1r0 e1r0Var = new e1r0((byte) 5, false);
            boolean zG = x340Var.g(function1);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new vj0(function1, (byte) 24);
                x340Var.s0(objT4);
            }
            ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) objT4, x340Var);
            boolean zI2 = ((i2 & 14) == 4) | x340Var.i(ven0Var) | x340Var.i(ven0Var2) | x340Var.g(function1) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | x340Var.i(ihg0VarE);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                zn0 zn0Var = new zn0(str, function1, pdlVar, kb4Var, ihg0VarE, ven0Var, ven0Var2, (lnm) null);
                x340Var.s0(zn0Var);
                objT5 = zn0Var;
            }
            qxd0.t(str, x340Var, (vu30) objT5);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(str, kb4Var, pdlVar, function0, i, (byte) 29);
        }
    }

    public static final void b(vnr0 vnr0Var, vnr0 vnr0Var2, drf1 drf1Var, vtq vtqVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(425864638);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(vnr0Var) ? 4 : 2) | (x340Var.i(vnr0Var2) ? 32 : 16) | (x340Var.i(drf1Var) ? 256 : 128) | (x340Var.i(vtqVar) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zG = x340Var.g(vtqVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                uw0 uw0Var = (uw0) vtqVar.a.c;
                gw70 gw70VarB = ((zuj) uw0Var.f).b();
                c8o.l(gw70VarB);
                ytp0 ytp0VarD = uw0Var.D();
                xgi1 xgi1Var = (xgi1) uw0Var.d;
                ssf1 ssf1Var = (ssf1) xgi1Var.i.get();
                c8o.l(ssf1Var);
                q8n q8nVar = (q8n) xgi1Var.e.get();
                c8o.l(q8nVar);
                vqf1 vqf1Var = new vqf1(ytp0VarD, ssf1Var, q8nVar);
                ytp0 ytp0VarD2 = uw0Var.D();
                q8n q8nVar2 = (q8n) xgi1Var.d.get();
                c8o.l(q8nVar2);
                objT = new grf1(gw70VarB, vqf1Var, new iff1(ytp0VarD2, q8nVar2, (byte) 1), uw0Var.x());
                x340Var.s0(objT);
            }
            grf1 grf1Var = (grf1) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qgo1.f(vnr0Var, (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var, 8 | (i3 & 14), 62);
            if (vnr0Var2 == null) {
                x340Var.i0(707314379);
                x340Var.r(false);
                i2 = i3;
                z = true;
            } else {
                x340Var.i0(707314380);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var3, 8.0f));
                i2 = i3;
                z = true;
                qgo1.f(vnr0Var2, (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var, 8, 62);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(z);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            otw.c(grf1Var, drf1Var, (qim0) null, (ipb1) null, x340Var, 72 | ((i2 >> 3) & 112), 12);
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(vnr0Var, vnr0Var2, drf1Var, vtqVar, qim0Var2, i, (byte) 19);
        }
    }

    public static final void c(int i, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-345989174);
        int i4 = (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 4 : 2) | i2;
        if (!x340Var.Y(i4 & 1, (i4 & 3) != 2)) {
            i3 = i;
            x340Var.b0();
        } else if (i != 0) {
            x340Var.i0(558109825);
            i3 = i;
            mth1.i((Integer) null, i3, (qim0) null, x340Var, ((i4 << 3) & 112) | 6, 4);
            x340Var.r(false);
        } else {
            i3 = i;
            x340Var.i0(558162680);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zxd1((byte) 1, i3, i2);
        }
    }

    public static final n511 d(long j, n511 n511Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new n511(Float.intBitsToFloat(i) + n511Var.a, Float.intBitsToFloat(i2) + n511Var.b, Float.intBitsToFloat(i) + n511Var.c, Float.intBitsToFloat(i2) + n511Var.d);
    }

    public static final Next e(z6x0 z6x0Var, Function0 function0) {
        return z6x0Var.Y == wbk1.c ? Next.j() : Next.a((Set) function0.invoke());
    }

    public static final LinkedHashSet f(b8e0 b8e0Var) {
        ArrayList arrayListN0 = o7h.N0(b8e0Var.getItems(), b8e0Var.g());
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN0) {
            ttm1 ttm1Var = (ttm1) obj;
            if (ttm1Var.e == aey.t && ttm1Var.h == 4) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((ttm1) it.next()).a);
        }
        return linkedHashSet;
    }

    public static srf0 g(erf0 erf0Var, nrf0 nrf0Var, ArrayList arrayList, boolean z, int i) {
        orf0 orf0Var;
        if ((i & 2) != 0) {
            arrayList = z6x.a;
        }
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        arf0 arf0Var = erf0Var.a;
        boolean z3 = arf0Var instanceof zqf0;
        nrf0 irf0Var = hrf0.a;
        if (!z3) {
            boolean z4 = arf0Var instanceof arf0;
            Map mapA = b7x.a;
            if (z4) {
                whc0 whc0Var = arf0Var.a;
                vhc0 vhc0Var = new vhc0(whc0Var.a);
                if (!whc0Var.isEmpty()) {
                    Iterator it = whc0Var.iterator();
                    while (it.hasNext()) {
                        int i2 = ((vhc0) it.next()).a;
                        int size = arrayList.size();
                        if (i2 >= 0 && i2 < size && ((CharSequence) arrayList.get(i2)).length() > 0) {
                            mapA = suo1.A(mapA, arrayList, i2);
                        }
                    }
                }
                irf0Var = new mrf0(vhc0Var, mapA, false);
            } else if (arf0Var instanceof crf0) {
                if (nrf0Var == null || nrf0Var.equals(irf0Var) || (nrf0Var instanceof irf0)) {
                    crf0 crf0Var = (crf0) arf0Var;
                    irf0Var = new mrf0(crf0Var.a, mapA, crf0Var.b);
                } else {
                    if (!(nrf0Var instanceof mrf0)) {
                        eg.o();
                        return null;
                    }
                    mrf0 mrf0Var = (mrf0) nrf0Var;
                    boolean z5 = mrf0Var.c;
                    boolean z6 = ((crf0) arf0Var).b;
                    if (z5 != z6 || (z6 && z)) {
                        z2 = true;
                    }
                    vhc0 vhc0Var2 = mrf0Var.a;
                    if (!z2) {
                        mapA = mrf0Var.b;
                    }
                    irf0Var = new mrf0(vhc0Var2, mapA, z6);
                }
            } else {
                if (!(arf0Var instanceof brf0)) {
                    eg.o();
                    return null;
                }
                irf0 irf0Var2 = nrf0Var instanceof irf0 ? (irf0) nrf0Var : null;
                Map map = irf0Var2 != null ? irf0Var2.a : null;
                if (map != null) {
                    mapA = map;
                }
                irf0Var = new irf0(mapA);
            }
        }
        nrf0 nrf0Var2 = irf0Var;
        int iC = l1d.C(erf0Var.b);
        if (iC == 0) {
            orf0Var = qrf0.a;
        } else if (iC == 1) {
            orf0Var = prf0.a;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            orf0Var = orf0.a;
        }
        return new srf0(nrf0Var2, orf0Var, erf0Var.c, erf0Var.d, erf0Var.e, erf0Var.f, 16.0f);
    }

    public static final ArrayList h(frf0 frf0Var) {
        List listD1;
        yqf0 yqf0Var = frf0Var.a;
        boolean z = yqf0Var.e;
        fef0 fef0Var = yqf0Var.c;
        if (z) {
            List listD2 = o7h.d1(fef0Var.a, 5);
            if (listD2.isEmpty()) {
                listD1 = z6x.a;
                break;
            }
            ListIterator listIterator = listD2.listIterator(listD2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listD1 = z6x.a;
                    break;
                }
                if (((aef0) listIterator.previous()).b.length() != 0) {
                    listD1 = o7h.d1(listD2, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listD1 = fef0Var.a;
        }
        List list = listD1;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            aef0 aef0Var = (aef0) obj;
            arrayList.add(new xlf0(i, aef0Var.b, aef0Var.a, aef0Var.c));
            i = i2;
        }
        return arrayList;
    }

    public static final long j(x3v x3vVar) {
        DragEvent dragEvent = x3vVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final fsf0 k(frf0 frf0Var) {
        def0 def0Var = (def0) o7h.s0(frf0Var.a.c.c);
        if (def0Var == null) {
            return esf0.a;
        }
        return new dsf0(frf0Var.b.d, def0Var.b, def0Var.c);
    }

    public static final int m(int i, w4c0 w4c0Var) {
        int iZ;
        int iZ2;
        if (w4c0Var.r(w4c0Var.z(i))) {
            w4c0Var.d(i);
            iZ = i;
            while (iZ != -1 && (w4c0Var.v(iZ) || !w4c0Var.r(iZ))) {
                iZ = w4c0Var.z(iZ);
            }
        } else {
            w4c0Var.d(i);
            if (w4c0Var.q(i)) {
                if (!w4c0Var.s(i) || w4c0Var.u(i)) {
                    iZ2 = w4c0Var.z(i);
                    iZ = iZ2;
                } else {
                    iZ = i;
                }
            } else if (w4c0Var.u(i)) {
                iZ2 = w4c0Var.z(i);
                iZ = iZ2;
            } else {
                iZ = -1;
            }
        }
        return iZ == -1 ? i : iZ;
    }

    public static final int n(int i, w4c0 w4c0Var) {
        int iE;
        int iE2;
        if (w4c0Var.v(w4c0Var.E(i))) {
            w4c0Var.d(i);
            iE = i;
            while (iE != -1 && (!w4c0Var.v(iE) || w4c0Var.r(iE))) {
                iE = w4c0Var.E(iE);
            }
        } else {
            w4c0Var.d(i);
            if (w4c0Var.u(i)) {
                if (!w4c0Var.s(i) || w4c0Var.q(i)) {
                    iE2 = w4c0Var.E(i);
                    iE = iE2;
                } else {
                    iE = i;
                }
            } else if (w4c0Var.q(i)) {
                iE2 = w4c0Var.E(i);
                iE = iE2;
            } else {
                iE = -1;
            }
        }
        return iE == -1 ? i : iE;
    }

    public static boolean o(String str) {
        return u890.j(str, "com.google.android.projection.gearhead") || u890.j(str, "com.spotify.auto.mediatest");
    }

    public static final boolean p(ttm1 ttm1Var) {
        if (ttm1Var.e == aey.t) {
            nb10 nb10Var = ttm1Var.g;
            xlu0 xlu0Var = nb10Var instanceof xlu0 ? (xlu0) nb10Var : null;
            if (xlu0Var != null && !xlu0Var.c) {
                return true;
            }
        }
        return false;
    }

    public static final void q(AbstractSet abstractSet, tr3 tr3Var) {
        sxc0 sxc0Var = tr3Var.b;
        Parcelable parcelable = sxc0Var.c;
        if (parcelable instanceof b8e0) {
            List list = sxc0Var.a.d;
            if (list.isEmpty()) {
                return;
            }
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!(((d6c0) it.next()) instanceof e5c0)) {
                        return;
                    }
                }
            }
            b8e0 b8e0Var = (b8e0) parcelable;
            if (((rr80) b8e0Var.a()).b >= b8e0Var.getCount() - 20) {
                abstractSet.add(po3.d);
            }
        }
    }

    public static final void r(AbstractSet abstractSet, tr3 tr3Var) {
        sxc0 sxc0Var = tr3Var.b;
        un90 un90Var = sxc0Var.c;
        w7c0 w7c0Var = tr3Var.c;
        Boolean bool = (Boolean) w7c0Var.a(x9v0.a);
        Boolean bool2 = (Boolean) w7c0Var.a(kf90.a);
        if (bool == null || bool2 == null) {
            return;
        }
        if ((un90Var instanceof b8e0) || (un90Var instanceof on90)) {
            abstractSet.add(new qo3(ryo1.r(sxc0Var.c), bool.booleanValue() && !bool2.booleanValue(), h4p1.p(ryo1.t(sxc0Var.c), rc11.a.b(z5c0.class))));
        }
    }

    public static knn0 s(cbr0 cbr0Var, ViewGroup viewGroup, lnn0 lnn0Var) {
        qnr0 qnr0VarA = cbr0Var.b0(qnr0.class).a();
        if (qnr0VarA != null) {
            pnr0 pnr0Var = qnr0VarA.a;
            return lnn0.b(lnn0Var, pnr0Var.a, pnr0Var.b);
        }
        if (viewGroup != null) {
            return jon1.o(viewGroup);
        }
        return null;
    }

    public static final Object t(o8n o8nVar, vu30 vu30Var) throws Throwable {
        ab00 ab00VarA;
        o8n o8nVarL;
        long jY;
        wdu0 wdu0Var = wdu0.Y;
        q8n q8nVarA = o8nVar.A(wdu0Var);
        o6x o6xVar = o6x.a;
        if (q8nVarA == null) {
            ab00VarA = jge1.a();
            o8nVarL = ulo1.l(o6xVar, o8nVar.y(ab00VarA), true);
            o8n o8nVar2 = igu.a;
            if (o8nVarL != o8nVar2 && o8nVarL.A(wdu0Var) == null) {
                o8nVarL = o8nVarL.y(o8nVar2);
            }
        } else {
            ab00VarA = (ab00) jge1.a.get();
            o8nVarL = ulo1.l(o6xVar, o8nVar, true);
            o8n o8nVar3 = igu.a;
            if (o8nVarL != o8nVar3 && o8nVarL.A(wdu0Var) == null) {
                o8nVarL = o8nVarL.y(o8nVar3);
            }
        }
        l8b l8bVar = new l8b(o8nVarL, Thread.currentThread(), ab00VarA);
        l8bVar.A0(1, l8bVar, vu30Var);
        ab00 ab00Var = l8bVar.f;
        if (ab00Var != null) {
            int i = ab00.f;
            ab00Var.T(false);
        }
        while (true) {
            if (ab00Var != null) {
                try {
                    jY = ab00Var.Y();
                } catch (Throwable th) {
                    if (ab00Var != null) {
                        int i2 = ab00.f;
                        ab00Var.N(false);
                    }
                    throw th;
                }
            } else {
                jY = Long.MAX_VALUE;
            }
            if (l8bVar.v()) {
                break;
            }
            LockSupport.parkNanos(l8bVar, jY);
            if (Thread.interrupted()) {
                l8bVar.R(new InterruptedException());
            }
        }
        if (ab00Var != null) {
            int i3 = ab00.f;
            ab00Var.N(false);
        }
        Object objD = j1e1.D(l8bVar.g0());
        nyh nyhVar = objD instanceof nyh ? (nyh) objD : null;
        if (nyhVar == null) {
            return objD;
        }
        throw nyhVar.a;
    }

    public static Object u(vu30 vu30Var) {
        return t(o6x.a, vu30Var);
    }

    public static final tr3 v(tr3 tr3Var, String str) {
        z6x z6xVar = (List) tr3Var.c.a(vg60.a);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) z6xVar) {
            if (!u890.j(((ehy) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        return iqo1.s(tr3Var, arrayList);
    }

    public int i() {
        return -65281;
    }

    public int l() {
        return -7829368;
    }
}
