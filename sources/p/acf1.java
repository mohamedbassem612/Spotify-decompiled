package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class acf1 {
    public static final pxg1 a;
    public static final pxg1 b;

    static {
        ilv.a.getClass();
        ceo ceoVar = flv.i;
        a = irn1.o0(100, 0, ceoVar, 2);
        b = new pxg1(500, 100, ceoVar);
    }

    public static final void a(tnu0 tnu0Var, Function0 function0, boolean z, lz20 lz20Var, Object obj, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1664038306);
        int i2 = i | (b0kVar2.i(tnu0Var) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.i(obj) ? 16384 : 8192);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            int i3 = i2 >> 3;
            qim0 qim0VarThen = u291.f(nim0Var, 1.0f).then(g(tnu0Var.j, z, lz20Var, obj, function0, b0kVar2, ((i2 << 12) & 458752) | (i3 & 7168) | (i3 & 112) | 24960, 0));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarThen);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                b0kVar2 = b0kVar2;
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2 = b0kVar2;
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2 = b0kVar2;
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            d(tnu0Var.c, tnu0Var.d, null, b0kVar2, 0, 4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            qgo1.f((vnr0) tnu0Var.e.invoke(b0kVar2, 0), (qim0) null, new a0e1(3), 0, false, (iu30) null, b0kVar2, 8, 58);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 8.0f));
            qgo1.f((vnr0) tnu0Var.f.invoke(b0kVar2, 0), (qim0) null, new a0e1(3), 0, false, (iu30) null, b0kVar2, 8, 58);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(tnu0Var, function0, z, lz20Var, obj, i, (byte) 19);
        }
    }

    public static final void b(List list, iu30 iu30Var, boolean z, boolean z2, boolean z3, Function0 function0, List list2, Integer num, int i, b0k b0kVar, int i2) {
        Object obj;
        Function0 function1;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1686882942);
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        int i3 = i2 | (x340Var.i(list) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.h(z4) ? 256 : 128) | (x340Var.h(z5) ? 2048 : 1024) | (x340Var.h(z6) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.g(list2) ? 1048576 : 524288) | (x340Var.g(num) ? 8388608 : 4194304) | (x340Var.e(i) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.Q0, x340Var, 48);
            boolean z7 = true;
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
            x340Var.i0(-1491074570);
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                tnu0 tnu0Var = (tnu0) next;
                String strC = f4i1.c(i4, "topPlaylistsRow-");
                Iterator it2 = it;
                int i6 = (i4 * 100) + 200;
                if (i4 == list.size() - 1) {
                    x340Var.i0(1351869903);
                    x340Var.r(false);
                    function1 = function0;
                } else {
                    x340Var.i0(-1041673973);
                    Object objT = x340Var.T();
                    if (objT == m4cVar) {
                        obj = objT;
                        q9f1 q9f1Var = q9f1.d;
                        x340Var.s0(q9f1Var);
                        obj = q9f1Var;
                    }
                    obj = objT;
                    function1 = (Function0) obj;
                    x340Var.r(false);
                }
                int i7 = i3 >> 3;
                Function0 function2 = function1;
                int i8 = i3;
                nim0 nim0Var2 = nim0Var;
                ven0 ven0VarU = xto.u(strC, i6, z5, z6, function2, x340Var, i7 & 8064, 0);
                vu30 vu30Var = tnu0Var.a;
                vu30 vu30Var2 = tnu0Var.b;
                boolean zG = x340Var.g(ven0VarU);
                Object objT2 = x340Var.T();
                Object obj2 = objT2;
                if (zG || objT2 == m4cVar) {
                    ctd1 ctd1Var = new ctd1(ven0VarU, (byte) 20);
                    x340Var.s0(ctd1Var);
                    obj2 = ctd1Var;
                }
                qim0 qim0VarC = i541.C(nim0Var2, (iu30) obj2);
                String str = tnu0Var.i;
                lz20 lz20Var = (lz20) o7h.t0(i4, list2);
                Integer numValueOf = (num != null && num.intValue() == i5) ? Integer.valueOf(i) : null;
                boolean zE = ((i8 & 112) == 32 ? z7 : false) | x340Var.e(i5);
                Object objT3 = x340Var.T();
                if (zE || objT3 == m4cVar) {
                    objT3 = new f8f1(iu30Var, i5, z7 ? (byte) 1 : (byte) 0);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarThen = qim0VarC.then(g(str, z4, lz20Var, numValueOf, (Function0) objT3, x340Var, i7 & 112, 16));
                x340 x340Var2 = x340Var;
                d(vu30Var, vu30Var2, qim0VarThen, x340Var2, 0, 0);
                z4 = z;
                z5 = z2;
                i4 = i5;
                nim0Var = nim0Var2;
                x340Var = x340Var2;
                it = it2;
                i3 = i8;
                z7 = true;
                z6 = z3;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u96(list, iu30Var, z, z2, z3, function0, list2, num, i, i2);
        }
    }

    public static final void c(j2i j2iVar, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1677547530);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = td4.m;
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = t3k1.x(nim0Var, "primary");
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j2iVar2 = j2iVar;
            dv20.l(6, j2iVar2, x340Var, true);
            if (vu30Var == null) {
                x340Var.i0(2143611696);
                x340Var.r(false);
            } else {
                x340Var.i0(2143611697);
                qim0 qim0VarX2 = t3k1.x(nim0Var, "overlay");
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                us71.k(0, vu30Var, x340Var, true, false);
            }
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(j2iVar2, qim0Var, vu30Var, i, (byte) 16);
        }
    }

    public static final void d(vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1543945788);
        int i4 = i | (x340Var.i(vu30Var) ? 4 : 2) | (x340Var.i(vu30Var2) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = i5 != 0 ? nim0.a : qim0Var2;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v7f1.N0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            vnr0 vnr0Var = (vnr0) vu30Var.invoke(x340Var, Integer.valueOf(i3 & 14));
            vq60 vq60Var = xl3.a;
            qgo1.f(vnr0Var, new vul1(vq60Var), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
            qgo1.f((vnr0) vu30Var2.invoke(x340Var, Integer.valueOf((i3 >> 3) & 14)), new vul1(vq60Var), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(vu30Var, vu30Var2, qim0Var2, i, i2, (byte) 17);
        }
    }

    public static final void e(i2c i2cVar, j7s j7sVar, rk41 rk41Var, Integer num, Integer num2, float f, iu30 iu30Var, iu30 iu30Var2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        boolean z;
        tnu0 tnu0Var;
        b0k b0kVar3;
        ven0 ven0Var;
        int i2;
        Integer num3;
        Throwable th;
        Integer num4;
        rk41 rk41Var2;
        boolean z2;
        qim0 qim0VarD;
        float f2;
        tob1 tob1Var;
        boolean z3;
        ven0 ven0Var2;
        Throwable th2;
        m4c m4cVar = fkj0.X;
        boolean z4 = j7sVar.a;
        List list = (List) j7sVar.f;
        boolean z5 = rk41Var.a;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(1066977427);
        j06 j06Var = ((x340) b0kVar4).a;
        int i3 = (i & 6) == 0 ? i | (b0kVar4.g(i2cVar) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar4.g(j7sVar) : b0kVar4.i(j7sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? b0kVar4.g(rk41Var) : b0kVar4.i(rk41Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar4.g(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar4.g(num2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= b0kVar4.d(f) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar4.i(iu30Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar4.i(iu30Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar4.i(function0) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (b0kVar4.Y(i4 & 1, (i4 & 38347923) != 38347922)) {
            qam1 qam1Var = (qam1) b0kVar4.k(sam1.a);
            if (num2 != null) {
                z = true;
                tnu0Var = (tnu0) o7h.t0(num2.intValue() - 1, list);
            } else {
                z = true;
                tnu0Var = null;
            }
            boolean zG = b0kVar4.g(list);
            Object objT = b0kVar4.T();
            if (zG || objT == m4cVar) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tnu0) it.next()).g);
                }
                b0kVar4.s0(arrayList);
                objT = arrayList;
            }
            List list3 = (List) objT;
            boolean zE = b0kVar4.e(list.size());
            Object objT2 = b0kVar4.T();
            Object obj = objT2;
            if (zE || objT2 == m4cVar) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(new lz20());
                }
                b0kVar4.s0(arrayList2);
                obj = arrayList2;
            }
            List list4 = (List) obj;
            Object objT3 = b0kVar4.T();
            if (objT3 == m4cVar) {
                objT3 = pzm.i(b0kVar4);
            }
            lz20 lz20Var = (lz20) objT3;
            Object objT4 = b0kVar4.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                b0kVar4.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) objT4;
            Object objT5 = b0kVar4.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(0);
                b0kVar4.s0(objT5);
            }
            ven0 ven0Var4 = (ven0) objT5;
            Object objT6 = b0kVar4.T();
            if (objT6 == m4cVar) {
                objT6 = v8r.q(Boolean.FALSE);
                b0kVar4.s0(objT6);
            }
            ven0 ven0Var5 = (ven0) objT6;
            tob1 tob1VarY = h7w.y(b0kVar4);
            Boolean bool = (Boolean) tob1VarY.getValue();
            bool.getClass();
            boolean zG2 = b0kVar4.g(tob1VarY);
            Object objT7 = b0kVar4.T();
            if (zG2 || objT7 == m4cVar) {
                objT7 = new vs3(tob1VarY, ven0Var5, null, (byte) 10);
                b0kVar4.s0(objT7);
            }
            qxd0.t(bool, b0kVar4, (vu30) objT7);
            ven0 ven0VarH = rwq.h(((xgm1) rk41Var.c).getState(), b0kVar4, 0);
            egm1 egm1Var = ((wgm1) ven0VarH.getValue()).c;
            int i6 = i4 & 7168;
            boolean zG3 = b0kVar4.g(ven0VarH) | (i6 == 2048 ? z : false);
            int i7 = i4 & 896;
            boolean z6 = ((i7 == 256 || ((i4 & 512) != 0 && b0kVar4.i(rk41Var))) ? z : false) | zG3;
            Object objT8 = b0kVar4.T();
            if (z6 || objT8 == m4cVar) {
                b0kVar3 = b0kVar4;
                ven0Var = ven0VarH;
                i2 = 2048;
                num3 = num;
                ku91 ku91Var = new ku91(num3, rk41Var, ven0Var, null, (byte) 13);
                th = null;
                b0kVar3.s0(ku91Var);
                objT8 = ku91Var;
            } else {
                b0kVar3 = b0kVar4;
                ven0Var = ven0VarH;
                i2 = 2048;
                th = null;
                num3 = num;
            }
            qxd0.s(num3, egm1Var, (vu30) objT8, b0kVar3);
            boolean zG4 = (i6 == i2) | b0kVar3.g(ven0Var);
            int i8 = i4 & 112;
            boolean z7 = (i7 == 256 || ((i4 & 512) != 0 && b0kVar3.i(rk41Var))) | zG4 | (i8 == 32 || ((i4 & 64) != 0 && b0kVar3.i(j7sVar))) | ((3670016 & i4) == 1048576);
            Object objT9 = b0kVar3.T();
            if (z7 || objT9 == m4cVar) {
                Integer num5 = num3;
                pwm0 pwm0Var = new pwm0(num5, j7sVar, ven0Var3, ven0Var, iu30Var, rk41Var, ven0Var4, (lnm) null);
                num4 = num5;
                rk41Var2 = rk41Var;
                b0kVar3.s0(pwm0Var);
                objT9 = pwm0Var;
            } else {
                num4 = num3;
                rk41Var2 = rk41Var;
            }
            qxd0.t(num4, b0kVar3, (vu30) objT9);
            float fC = i2cVar.c();
            uwr uwrVar = cbx.a;
            float f3 = cbx.b(b0kVar3).e.c;
            boolean z8 = tnu0Var != 0;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarD2 = u291.d(qim0Var, 1.0f);
            if (!z8 || ((Boolean) tob1VarY.getValue()).booleanValue()) {
                z2 = false;
                b0kVar3.i0(-1131767909);
                b0kVar3.r(false);
                qim0VarD = qim0Var;
            } else {
                b0kVar3.i0(-1131774381);
                boolean zI = (i8 == 32 || ((i4 & 64) != 0 && b0kVar3.i(j7sVar))) | b0kVar3.i(qam1Var) | ((i4 & 234881024) == 67108864);
                Object objT10 = b0kVar3.T();
                if (zI || objT10 == m4cVar) {
                    objT10 = new o8e1((Object) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x034a: CONSTRUCTOR (r15v18 'objT10' java.lang.Object) = 
                          (wrap java.lang.Object:?: CAST (java.lang.Object) (r2v0 ?? I:??[OBJECT, ARRAY]))
                          (r14v4 'qam1Var' p.qam1)
                          (r53v0 'function0' kotlin.jvm.functions.Function0)
                          (6 byte)
                         (LINE:843) call: p.o8e1.<init>(java.lang.Object, java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR in method: p.acf1.e(p.i2c, p.j7s, p.rk41, java.lang.Integer, java.lang.Integer, float, p.iu30, p.iu30, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1807
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.acf1.e(p.i2c, p.j7s, p.rk41, java.lang.Integer, java.lang.Integer, float, p.iu30, p.iu30, kotlin.jvm.functions.Function0, p.b0k, int):void");
                }

                public static final float f(boolean z, boolean z2, boolean z3, b0k b0kVar) {
                    zu91 zu91VarJ0;
                    Float fValueOf = Float.valueOf(z ? 1.0f : 0.0f);
                    if (z3) {
                        zu91VarJ0 = z ? b : a;
                    } else {
                        zu91VarJ0 = irn1.j0();
                    }
                    return ((Number) zod.G(fValueOf, z2, rno1.a, zu91VarJ0, b0kVar, 0)).floatValue();
                }

                public static final qim0 g(String str, boolean z, lz20 lz20Var, Object obj, Function0 function0, b0k b0kVar, int i, int i2) {
                    qim0 qim0VarX;
                    qim0 qim0VarA;
                    m4c m4cVar = fkj0.X;
                    boolean z2 = (i2 & 16) != 0;
                    x340 x340Var = (x340) b0kVar;
                    boolean zG = x340Var.g(obj);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    qim0 qim0VarD = nim0.a;
                    if (lz20Var != null) {
                        x340Var.i0(-2140200288);
                        qim0 qim0VarU = qxy0.u(vby0.p(qim0VarD, lz20Var), (idn0) null, 3);
                        boolean zI = ((((i & 896) ^ 384) > 256 && x340Var.g(lz20Var)) || (i & 384) == 256) | x340Var.i(obj) | x340Var.g(ven0Var);
                        Object objT2 = x340Var.T();
                        if (zI || objT2 == m4cVar) {
                            objT2 = new rsc1(obj, ven0Var, lz20Var, (byte) 11);
                            x340Var.s0(objT2);
                        }
                        qim0VarX = ern1.x(qim0VarU, (iu30) objT2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1039349562);
                        x340Var.r(false);
                        qim0VarX = qim0VarD;
                    }
                    if (ihc1.y0(str)) {
                        x340Var.i0(1039358586);
                        x340Var.r(false);
                        qim0VarA = qim0VarD;
                    } else {
                        x340Var.i0(-2139840781);
                        boolean z3 = ((((i & 14) ^ 6) > 4 && x340Var.g(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && x340Var.h(z)) || (i & 48) == 32) | ((((458752 & i) ^ 196608) > 131072 && x340Var.g(function0)) || (i & 196608) == 131072);
                        Object objT3 = x340Var.T();
                        if (z3 || objT3 == m4cVar) {
                            objT3 = new ehv(str, z, function0);
                            x340Var.s0(objT3);
                        }
                        qim0VarA = s161.a(qim0VarD, (iu30) objT3);
                        x340Var.r(false);
                    }
                    if (z && z2) {
                        qim0VarD = a8o.D(qim0VarD, function0);
                    }
                    return qim0VarX.then(qim0VarA).then(qim0VarD);
                }
            }
