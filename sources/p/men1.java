package p;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract /* synthetic */ class men1 {
    public static final m a = new m((byte) 19);
    public static b180 b;

    public static final int[] A(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = z4p1.G(((u7h) list.get(i3)).a);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int iL = p7h.L(list);
        int size2 = list.size();
        int i4 = 0;
        while (i3 < size2) {
            long j = ((u7h) list.get(i3)).a;
            if (u7h.c(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = z4p1.G(u7h.b(((u7h) list.get(1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                } else if (i3 == iL) {
                    i2 = i4 + 1;
                    iArr2[i4] = z4p1.G(u7h.b(((u7h) list.get(i3 - 1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = z4p1.G(u7h.b(((u7h) list.get(i3 - 1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                    i4 += 2;
                    iArr2[i5] = z4p1.G(u7h.b(((u7h) list.get(i3 + 1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                }
                i4 = i2;
            } else {
                iArr2[i4] = z4p1.G(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final float[] B(int i, List list, List list2) {
        if (i == 0) {
            if (list != null) {
                return o7h.i1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iL = p7h.L(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < iL; i3++) {
            long j = ((u7h) list2.get(i3)).a;
            float fFloatValue = list != null ? ((Number) list.get(i3)).floatValue() : i3 / p7h.L(list2);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (u7h.c(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? ((Number) list.get(p7h.L(list2))).floatValue() : 1.0f;
        return fArr;
    }

    public static void C(ViewGroup viewGroup) {
        viewGroup.setTag(2131431516, null);
    }

    public static final String D(qfm0 qfm0Var) {
        if (qfm0Var instanceof efm0) {
            return "auth";
        }
        if (qfm0Var instanceof mfm0) {
            return "unauth";
        }
        eg.o();
        return null;
    }

    public static final long[] E(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = w361.w(((u7h) list.get(i)).a);
        }
        return jArr;
    }

    public static final List F(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return z6x.a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            jsb0 jsb0Var = (jsb0) arrayList.get(i3);
            int index = jsb0Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(jsb0Var);
            }
        }
        r7h.f0(arrayList2, a);
        return arrayList2;
    }

    public static final void G(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            hhg1.n("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            hhg1.n("colors and colorStops arguments must have equal length.");
        }
    }

    public static final LinearGradient a(int i, long j, long j2, List list, List list2) {
        G(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            return q650.a.a(j, j2, E(list), list2 != null ? o7h.i1(list2) : null, i);
        }
        int iQ = q(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)), A(iQ, list), B(iQ, list2, list), oon1.D(i));
    }

    public static final RadialGradient b(float f, long j, List list, List list2) {
        G(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            return q650.a.b(j, f, E(list), list2 != null ? o7h.i1(list2) : null, 0);
        }
        int iQ = q(list);
        return new RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, A(iQ, list), B(iQ, list2, list), oon1.D(0));
    }

    public static final void c(d0r d0rVar, qim0 qim0Var, qxl qxlVar, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        Object ur1Var;
        ttj ttjVar;
        ven0 ven0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-443298433);
        int i2 = i | (x340Var.i(d0rVar) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.g(qxlVar) ? 256 : 128) | 27648;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new ttj();
                x340Var.s0(objT);
            }
            ttj ttjVar2 = (ttj) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                x340Var.s0(d0rVar);
                objT3 = d0rVar;
            }
            d0r d0rVar2 = (d0r) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                j2iVar2 = j2iVar;
                x340Var.s0(j2iVar);
                objT4 = j2iVar2;
            } else {
                j2iVar2 = j2iVar;
            }
            vu30 vu30Var = (vu30) objT4;
            boolean zI = x340Var.i(d0rVar) | x340Var.i(d0rVar2);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                f80 f80Var = new f80(d0rVar, d0rVar2, j2iVar2, vu30Var, (byte) 28);
                x340Var.s0(f80Var);
                objT5 = f80Var;
            }
            qxd0.S((Function0) objT5, x340Var);
            boolean zI2 = x340Var.i(ttjVar2) | x340Var.i(d0rVar);
            Object objT6 = x340Var.T();
            if (zI2 || objT6 == m4cVar) {
                ttjVar = ttjVar2;
                ven0Var = ven0Var2;
                ur1Var = new ur1(j2iVar, ttjVar, d0rVar, ven0Var, (lnm) null);
                x340Var.s0(ur1Var);
            } else {
                ur1Var = objT6;
                ttjVar = ttjVar2;
                ven0Var = ven0Var2;
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, x340Var, (vu30) ur1Var);
            mod.b(bsl.a.a(false), apo.r(-153718209, new mzj(qim0Var, ttjVar, qxlVar, (byte) 15), x340Var), x340Var, 56);
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = new f4g(ven0Var, (byte) 21);
                x340Var.s0(objT7);
            }
            qxd0.i(rih1Var, (iu30) objT7, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new csl(d0rVar, qim0Var, qxlVar, j2iVar, i);
        }
    }

    public static final void d(String str, Map map, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1749319888);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.i(map) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.h(z2) ? 2048 : 1024) | 24576;
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            fcf0 fcf0VarC = h5p1.G(new pcf0(str), (String) null, (xu30) null, b0kVar2, 24576, 46).c();
            b0kVar2 = b0kVar2;
            kbf0 kbf0VarN = zpn1.n(fcf0VarC, z, false, (bcf0) null, 0.0f, (z && z2) ? Integer.MAX_VALUE : 1, b0kVar2, 956);
            boolean z3 = !z2 && ((Number) kbf0VarN.getValue()).floatValue() >= 1.0f;
            boolean zI = b0kVar2.i(fcf0VarC) | b0kVar2.i(map);
            Object objT = b0kVar2.T();
            if (zI || objT == m4cVar) {
                objT = new nnu(fcf0VarC, map, (lnm) null, (byte) 11);
                b0kVar2.s0(objT);
            }
            qxd0.s(fcf0VarC, map, (vu30) objT, b0kVar2);
            boolean z4 = z3;
            qim0 qim0Var3 = nim0.a;
            if (z4) {
                b0kVar2.i0(1145918898);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1145706517);
                boolean zI2 = b0kVar2.i(kbf0VarN);
                Object objT2 = b0kVar2.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new uk1(kbf0VarN, (byte) 4);
                    b0kVar2.s0(objT2);
                }
                mp10.e(fcf0VarC, (Function0) objT2, qim0Var3, false, false, false, (xc21) null, false, (ddf0) null, een.h, mif1.Q0, false, false, (Map) null, (jj7) null, true, b0kVar2, 384, 196608, 31224);
                b0kVar2.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(str, map, z, z2, qim0Var2, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void e(String str, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        float f2;
        int i3;
        boolean z;
        qim0 qim0Var2;
        float f3;
        h311 h311VarV;
        int i4;
        float f4;
        qim0 qim0Var3;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1569858935);
        int i5 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if ((i2 & 4) == 0) {
            f2 = f;
            int i6 = x340Var.d(f2) ? 256 : 128;
            i3 = i5 | i6;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    i4 = i2 & 4;
                    qim0 qim0Var4 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar = cbx.a;
                        f2 = cbx.b(x340Var).b.b;
                        i3 &= -897;
                    }
                    f4 = f2;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    qim0Var3 = qim0Var;
                    f4 = f2;
                }
                x340Var.s();
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).c;
                long j = cbx.a(x340Var).b.a;
                qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, f4, 0.0f, 0.0f, 13);
                qim0 qim0Var5 = qim0Var3;
                float f5 = f4;
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = r850.d;
                    x340Var.s0(objT);
                }
                uwo1.e(str, s161.b(qim0VarB, false, (iu30) objT), lee1Var, j, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 14, 0, 2016);
                qim0Var2 = qim0Var5;
                f3 = f5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                f3 = f2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new k950(str, qim0Var2, f3, i, i2);
            }
        }
        f2 = f;
        i3 = i5 | i6;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                i4 = i2 & 4;
                qim0 qim0Var6 = nim0.a;
                if (i4 != 0) {
                    uwr uwrVar3 = cbx.a;
                    f2 = cbx.b(x340Var).b.b;
                    i3 &= -897;
                }
                f4 = f2;
                qim0Var3 = qim0Var6;
            } else {
                i4 = i2 & 4;
                qim0 qim0Var7 = nim0.a;
                if (i4 != 0) {
                    uwr uwrVar4 = cbx.a;
                    f2 = cbx.b(x340Var).b.b;
                    i3 &= -897;
                }
                f4 = f2;
                qim0Var3 = qim0Var7;
            }
            x340Var.s();
            uwr uwrVar5 = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var).c;
            long j2 = cbx.a(x340Var).b.a;
            qim0 qim0VarB2 = uyn1.B(qim0Var3, 0.0f, f4, 0.0f, 0.0f, 13);
            qim0 qim0Var8 = qim0Var3;
            float f6 = f4;
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = r850.d;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarB2, false, (iu30) objT), lee1Var2, j2, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 14, 0, 2016);
            qim0Var2 = qim0Var8;
            f3 = f6;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            f3 = f2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k950(str, qim0Var2, f3, i, i2);
        }
    }

    public static final void f(c0b1 c0b1Var, rbt rbtVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-795137836);
        byte b2 = 4;
        int i2 = i | (x340Var.i(c0b1Var) ? 4 : 2) | (x340Var.i(rbtVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            h((i2 >> 3) & 1008, c0b1Var.b, function0, function1, x340Var, null);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            pbq pbqVar = rbtVar.l;
            x340Var.i0(1297613125);
            j2i j2iVarR = apo.r(-1608520798, new n260(pbqVar, (byte) 3), x340Var);
            x340Var.r(false);
            pbq pbqVar2 = rbtVar.m;
            x340Var.i0(1297703397);
            j2i j2iVarR2 = apo.r(1267122467, new n260(pbqVar2, b2), x340Var);
            x340Var.r(false);
            tro1.d(j2iVarR, j2iVarR2, (qim0) null, x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            x0d.s(nim0Var, 8.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(c0b1Var, rbtVar, function0, function1, qim0Var, i, (byte) 20);
        }
    }

    public static final void g(g7g0 g7g0Var, vzq0 vzq0Var, pbq pbqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2013307074);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g7g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= x340Var.g(vzq0Var2) ? 32 : 16;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(pbqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fD = vzq0Var2.d();
            uwr uwrVar = cbx.a;
            float f = fD + cbx.b(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarD = u291.d(uyn1.B(nim0.a, 16.0f, f, 16.0f, 0.0f, 8), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            int i3 = i2 >> 3;
            ago1.h(g7g0Var, pbqVar, iu30Var, x340Var, (i2 & 14) | (i3 & 112) | (i3 & 896));
            i(g7g0Var, vzq0Var2, pbqVar, iu30Var, x340Var, i2 & 8190);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7g0(g7g0Var, vzq0Var, pbqVar, iu30Var, i, (byte) 0);
        }
    }

    public static final void h(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(608179952);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            int i4 = i3 >> 3;
            dug.c(i4 & 14, function0, b0kVar3, (qim0) null);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).j;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0Var2 = qim0Var3;
            uwo1.e("•", uyn1.z(6.0f, 0.0f, 2, qim0Var3), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 6, 0, 2040);
            b0kVar2 = b0kVar3;
            fbp1.a((i3 & 14) | (i4 & 112), str, function1, b0kVar2, new wnb0(1.0f, true));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, str, function0, function1, qim0Var2, (byte) 20);
        }
    }

    public static final void i(g7g0 g7g0Var, vzq0 vzq0Var, pbq pbqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        two twoVar = (two) pbqVar.X;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1708451012);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(g7g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(pbqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar3.f0(-1143904493, g7g0Var.c);
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            b0kVar3.r(false);
            swo swoVar = (swo) pbqVar.t;
            boolean zG = b0kVar3.g(twoVar);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = twoVar.a(new k2g0(iu30Var, (byte) 3));
                b0kVar3.s0(objT);
            }
            lxr0 lxr0Var = (lxr0) objT;
            boolean zG2 = b0kVar3.g(swoVar);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = swoVar.a(new k2g0(iu30Var, (byte) 4));
                b0kVar3.s0(objT2);
            }
            vyr0 vyr0Var = (vyr0) objT2;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float fA = vzq0Var.a();
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 8.0f, 0.0f, fA + 16.0f, 5);
            qim0 qim0VarN = anm1.N("blocked_content_list_test_tag", i1p1.r(u291.d(nim0.a, 1.0f)));
            boolean zI = b0kVar3.i(pbqVar) | ((i2 & 14) == 4) | b0kVar3.g(lxr0Var) | b0kVar3.g(vyr0Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                ntf0 ntf0Var = new ntf0(g7g0Var, pbqVar, lxr0Var, vyr0Var, (byte) 2);
                b0kVar3.s0(ntf0Var);
                objT3 = ntf0Var;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarN, xtb0VarA, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT3, b0kVar2, 6, 504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new a7g0(g7g0Var, vzq0Var, pbqVar, iu30Var, i, (byte) 1);
        }
    }

    public static final void j(boolean z, boolean z2, Function0 function0, List list, boolean z3, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(892577967);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.h(z2) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(list) ? 2048 : 1024) | (b0kVar3.h(z3) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536) | 1572864;
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            boolean zI = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | b0kVar3.i(list) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                q7m1 q7m1Var = new q7m1(z, list, function0, z2, z3, iu30Var);
                b0kVar3.s0(q7m1Var);
                objT = q7m1Var;
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            too1.b(qim0Var3, xtb0VarA, zzq0Var, (iu30) objT, b0kVar2, 6, 0);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x140(z, z2, function0, list, z3, iu30Var, qim0Var2, i);
        }
    }

    public static final void k(umx0 umx0Var, tqw tqwVar, lzn0 lzn0Var) {
        hqn1.q(lzn0Var, umx0Var.d, tqwVar, (Bundle) null);
    }

    public static final void l(umx0 umx0Var, tqw tqwVar, vgm vgmVar) {
        if (!umx0Var.u || tqwVar == null) {
            return;
        }
        vgm.b(vgmVar, umx0Var.d, (String) null, n3o1.y(tqwVar), new tgm((String) null, true, true, false, false, false, false, oon1.E(umx0Var), false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -271, 1), 2);
    }

    public static final boolean m(eln0 eln0Var) {
        return eln0Var.a.length() == 0;
    }

    public static final void n(tmx0 tmx0Var, umx0 umx0Var, o600 o600Var, l0x0 l0x0Var) {
        zz zzVar;
        if (u890.j(o600Var, lwz.a)) {
            n1x n1xVar = tmx0Var.d;
            l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
            return;
        }
        if (o600Var instanceof qwz) {
            n1x n1xVar2 = tmx0Var.d;
            l0x0Var.o(new z00(wgo1.x(n1xVar2), gho1.r(n1xVar2), ((qwz) o600Var).a));
            return;
        }
        if (o600Var instanceof p100) {
            n1x n1xVar3 = tmx0Var.d;
            if (umx0Var.o) {
                zzVar = zz.a;
            } else {
                zzVar = umx0Var.f48p ? b00.a : a00.a;
            }
            l0x0Var.o(new d00(gho1.r(n1xVar3), wgo1.w(n1xVar3), zzVar));
            return;
        }
        if (u890.j(o600Var, z000.a)) {
            l0x0Var.o(new cz(gho1.r(tmx0Var.d), wgo1.w(tmx0Var.d), umx0Var.q ? az.a : zy.a));
        } else if (u890.j(o600Var, v000.a)) {
            l0x0Var.o(new wy(gho1.r(tmx0Var.d)));
        } else if (o600Var instanceof r100) {
            l0x0Var.o(new e00(wgo1.w(tmx0Var.d), gho1.r(tmx0Var.d), ((r100) o600Var).a));
        }
    }

    public static final js20 o(h6w h6wVar, mwv0 mwv0Var, lzn0 lzn0Var, l0x0 l0x0Var, vgm vgmVar) {
        return x3p1.n(mwv0Var, fft0.h, ibi0.t, (o8n) null, new ozu0(lzn0Var, vgmVar, l0x0Var, (byte) 11), 8);
    }

    public static final void p(fzq0 fzq0Var, kf30 kf30Var, ArrayList arrayList) {
        if (fzq0Var instanceof hzq0) {
            ((hzq0) fzq0Var).b(kf30Var, arrayList);
        } else {
            arrayList.addAll(fzq0Var.c(kf30Var));
        }
    }

    public static final int q(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iL = p7h.L(list);
        for (int i2 = 1; i2 < iL; i2++) {
            if (u7h.c(((u7h) list.get(i2)).a) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static zzy r(String str) {
        if (u890.j(str, "accountCreation")) {
            return uzy.b;
        }
        if (u890.j(str, "accountTransition")) {
            return vzy.b;
        }
        return u890.j(str, "parentalConsent") ? yzy.b : xzy.b;
    }

    public static void s(ViewGroup viewGroup) {
        if (viewGroup.getTag(2131431516) == null) {
            return;
        }
        bhn0.d();
    }

    public static final Object t(jsb0 jsb0Var, int i) {
        return ((q5t0) jsb0Var.g().get(i)).g();
    }

    public static String u(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final int v(jsb0 jsb0Var) {
        return jsb0Var.g().size();
    }

    public static final String w(hm61 hm61Var) {
        return f4i1.e(Integer.toHexString(hm61Var.c.hashCode()), ".pb");
    }

    public static final boolean x(lhg1 lhg1Var) {
        return lhg1Var.c || lhg1Var.d || ila0.u(lhg1Var.a);
    }

    public static final boolean y(fzq0 fzq0Var, kf30 kf30Var) {
        if (fzq0Var instanceof hzq0) {
            return ((hzq0) fzq0Var).a(kf30Var);
        }
        ArrayList arrayList = new ArrayList();
        p(fzq0Var, kf30Var, arrayList);
        return arrayList.isEmpty();
    }

    public static final int z(jsb0 jsb0Var, boolean z) {
        int iK;
        int iF;
        if (z) {
            iK = jsb0Var.c();
            iF = jsb0Var.h();
        } else {
            iK = jsb0Var.k();
            iF = jsb0Var.f();
        }
        return iF + iK;
    }
}
