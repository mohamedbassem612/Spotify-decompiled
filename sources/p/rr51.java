package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class rr51 {
    public static final long a = jhc1.c(28.0f, 28.0f);
    public static final float b = 6.0f;
    public static final float c = 9.0f;
    public static final float d = 14.0f;
    public static final float e = 2.0f;
    public static final float f = 100.0f;
    public static final float g = 100.0f;

    public static final void a(String str, boolean z, boolean z2, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1936645456);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.h(z) ? 32 : 16) | (b0kVar2.h(z2) ? 256 : 128) | (b0kVar2.i(function0) ? 2048 : 1024) | (b0kVar2.i(function1) ? 16384 : 8192);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 0);
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
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            c(olx.d | ((i2 << 3) & 896) | (i2 & 7168), cwl1.o0(b0kVar2, 2131955947), function0, b0kVar2, olx.c, z);
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, i2 & 14, 0, 2016);
            b0kVar2 = b0kVar2;
            c(plx.d | (i2 & 896) | ((i2 >> 3) & 7168), cwl1.o0(b0kVar2, 2131955946), function1, b0kVar2, plx.c, z2);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(str, z, z2, function0, function1, i, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:105:0x0224  */
    /* JADX WARN: Code duplicated, block: B:108:0x025f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0266  */
    /* JADX WARN: Code duplicated, block: B:111:0x026c  */
    /* JADX WARN: Code duplicated, block: B:134:0x033e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0355  */
    /* JADX WARN: Code duplicated, block: B:137:0x0357  */
    /* JADX WARN: Code duplicated, block: B:140:0x0362  */
    /* JADX WARN: Code duplicated, block: B:141:0x0364  */
    /* JADX WARN: Code duplicated, block: B:144:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0371  */
    /* JADX WARN: Code duplicated, block: B:148:0x0389 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x038b  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:164:0x0411  */
    /* JADX WARN: Code duplicated, block: B:166:0x0417  */
    /* JADX WARN: Code duplicated, block: B:168:0x041e  */
    /* JADX WARN: Code duplicated, block: B:173:0x043f  */
    /* JADX WARN: Code duplicated, block: B:184:0x045a  */
    /* JADX WARN: Code duplicated, block: B:185:0x045f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0484  */
    /* JADX WARN: Code duplicated, block: B:192:0x049a  */
    /* JADX WARN: Code duplicated, block: B:193:0x049c  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:203:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:208:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:211:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:212:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:216:0x0508  */
    /* JADX WARN: Code duplicated, block: B:218:0x0520  */
    /* JADX WARN: Code duplicated, block: B:220:0x0529  */
    /* JADX WARN: Code duplicated, block: B:222:0x053a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0542  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e7  */
    public static final void b(List list, String str, mr20 mr20Var, yzu yzuVar, vu30 vu30Var, vu30 vu30Var2, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        vu30 vu30Var3;
        iu30 iu30Var3;
        iu30 iu30Var4;
        vu30 vu30Var4;
        b0k b0kVar2;
        dqy dqyVar;
        boolean z;
        az20 az20Var;
        boolean z2;
        boolean zI;
        hdn0 hdn0Var;
        Object sew0Var;
        Map map;
        boolean z3;
        boolean z4;
        mr20 mr20Var2;
        int i2;
        boolean z5;
        boolean z6;
        boolean zH;
        Object objT;
        boolean z7;
        boolean zI2;
        Object objT2;
        nim0 nim0Var;
        Map map2;
        qim0 qim0VarJ;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        dqy dqyVar2;
        Integer num;
        c220 c220Var;
        boolean z8;
        boolean z9;
        boolean zI3;
        Object objT3;
        boolean zI4;
        Object objT4;
        b220 b220Var;
        boolean z10;
        y120 y120Var;
        String str2;
        int iIntValue;
        boolean z11;
        boolean z12;
        Object objT5;
        Integer numC0;
        z120 z120Var;
        List list2;
        String str3;
        Integer numValueOf;
        String str4;
        boolean z13;
        boolean z14;
        Object objT6;
        boolean z15;
        List list3;
        String str5;
        String str6;
        dqy dqyVar3;
        boolean z16;
        boolean zI5;
        Object objT7;
        dqy dqyVar4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1738574761);
        int i3 = (b0kVar3.i(iu30Var2) ? 8388608 : 4194304) | i | (b0kVar3.g(list) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.i(mr20Var) ? 256 : 128) | (b0kVar3.i(yzuVar) ? 2048 : 1024) | (b0kVar3.i(vu30Var) ? 16384 : 8192) | (b0kVar3.i(vu30Var2) ? 131072 : 65536) | (b0kVar3.i(iu30Var) ? 1048576 : 524288);
        if (!b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            vu30Var3 = vu30Var2;
            iu30Var3 = iu30Var;
            iu30Var4 = iu30Var2;
            vu30Var4 = vu30Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        } else {
            if (list.isEmpty()) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new nr51(list, str, mr20Var, yzuVar, vu30Var, vu30Var2, iu30Var, iu30Var2, i, (byte) 0);
                    return;
                }
                return;
            }
            iu30Var3 = iu30Var;
            iu30Var4 = iu30Var2;
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z17 = (i4 == 4) | ((i3 & 112) == 32);
            Object objT8 = b0kVar3.T();
            if (z17 || objT8 == m4cVar) {
                objT8 = new rl21(list, str, (byte) 25);
                b0kVar3.s0(objT8);
            }
            hdn0 hdn0Var2 = (hdn0) k5p1.s(objArr, (Function0) objT8, b0kVar3, 0);
            err0 err0Var = (err0) hdn0Var2;
            c220 c220Var2 = (c220) list.get(err0Var.s());
            Object[] objArr2 = new Object[0];
            df41 df41Var = f220.a;
            df41 df41Var2 = new df41(new s6(list, (byte) 26), wo10.g);
            boolean z18 = i4 == 4;
            Object objT9 = b0kVar3.T();
            if (z18 || objT9 == m4cVar) {
                objT9 = new a1e(list, (byte) 2);
                b0kVar3.s0(objT9);
            }
            Map map3 = (Map) k5p1.u(objArr2, df41Var2, (Function0) objT9, b0kVar3, 0);
            Object[] objArr3 = new Object[0];
            df41 df41Var3 = f220.a;
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar) {
                objT10 = oa41.Z0;
                b0kVar3.s0(objT10);
            }
            dw91 dw91Var = (dw91) k5p1.u(objArr3, df41Var3, (Function0) objT10, b0kVar3, 384);
            String str7 = c220Var2.a;
            dqy dqyVar5 = (dqy) map3.get(str7);
            if (dqyVar5 != null) {
                dqyVar = dqyVar5;
                z = dqyVar5.e();
                az20Var = (az20) b0kVar3.k(t4k.i);
                boolean zI6 = b0kVar3.i(mr20Var);
                if (i4 != 4) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                zI = zI6 | z2 | b0kVar3.i(hdn0Var2) | b0kVar3.i(map3) | b0kVar3.i(az20Var);
                Object objT11 = b0kVar3.T();
                if (!zI || objT11 == m4cVar) {
                    boolean z19 = z;
                    hdn0Var = hdn0Var2;
                    map = map3;
                    z3 = false;
                    z4 = z19;
                    sew0Var = new sew0(mr20Var, list, map, hdn0Var, az20Var, (lnm) null);
                    mr20Var2 = mr20Var;
                    az20Var = az20Var;
                    b0kVar3.s0(sew0Var);
                } else {
                    z3 = false;
                    z4 = z;
                    hdn0Var = hdn0Var2;
                    sew0Var = objT11;
                    map = map3;
                    mr20Var2 = mr20Var;
                }
                i2 = i3 >> 6;
                qxd0.t(mr20Var2, b0kVar3, (vu30) sew0Var);
                Boolean boolValueOf = Boolean.valueOf(z4);
                if ((i3 & 3670016) == 1048576) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                z6 = z4;
                zH = z5 | b0kVar3.h(z6);
                objT = b0kVar3.T();
                if (zH || objT == m4cVar) {
                    objT = new w73(iu30Var3, z6, (lnm) null, (byte) 15);
                    b0kVar3.s0(objT);
                }
                qxd0.t(boolValueOf, b0kVar3, (vu30) objT);
                if ((i3 & 29360128) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zI2 = z7 | b0kVar3.i(c220Var2);
                objT2 = b0kVar3.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new wp41(iu30Var4, c220Var2, (lnm) null, (byte) 2);
                    b0kVar3.s0(objT2);
                }
                qxd0.t(str7, b0kVar3, (vu30) objT2);
                nim0Var = nim0.a;
                map2 = map;
                qim0VarJ = u291.j(((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.5f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                if (z6) {
                    qim0VarJ = qim0VarJ.then(u291.c(nim0Var, 1.0f));
                }
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarJ);
                mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarP);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(hmb0.t1);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(mbhVarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                op71.g(b0kVar3, u291.h(nim0Var, 8.0f));
                if (dqyVar == 0 && z6) {
                    b0kVar3.i0(1099135077);
                    boolean zI7 = b0kVar3.i(az20Var) | b0kVar3.i(dqyVar) | ((i3 & 458752) == 131072) | b0kVar3.i(c220Var2);
                    Object objT12 = b0kVar3.T();
                    if (zI7 || objT12 == m4cVar) {
                        dqy dqyVar6 = dqyVar;
                        vvu0 vvu0Var = new vvu0(az20Var, dqyVar6, vu30Var2, c220Var2, (byte) 29);
                        dqyVar4 = dqyVar6;
                        vu30Var3 = vu30Var2;
                        c220Var = c220Var2;
                        b0kVar3.s0(vvu0Var);
                        objT12 = vvu0Var;
                    } else {
                        dqyVar4 = dqyVar;
                        c220Var = c220Var2;
                        vu30Var3 = vu30Var2;
                    }
                    iu30 iu30Var5 = (iu30) objT12;
                    int size = dqyVar4.d.size() + dqyVar4.e.size();
                    dqy dqyVar7 = dqyVar4;
                    Integer num2 = dqyVar7.c;
                    boolean zC = dqyVar7.c();
                    boolean zG = b0kVar3.g(iu30Var5);
                    Object objT13 = b0kVar3.T();
                    if (zG || objT13 == m4cVar) {
                        objT13 = new wg31(iu30Var5, (byte) 22);
                        b0kVar3.s0(objT13);
                    }
                    Function0 function0 = (Function0) objT13;
                    boolean zG2 = b0kVar3.g(iu30Var5);
                    Object objT14 = b0kVar3.T();
                    if (zG2 || objT14 == m4cVar) {
                        objT14 = new wg31(iu30Var5, (byte) 23);
                        b0kVar3.s0(objT14);
                    }
                    b0kVar2 = b0kVar3;
                    num = null;
                    dqyVar2 = dqyVar7;
                    d(size, num2, zC, function0, (Function0) objT14, b0kVar2, 0);
                    b0kVar2.r(false);
                } else {
                    b0kVar2 = b0kVar3;
                    dqyVar2 = dqyVar;
                    map2 = map2;
                    num = null;
                    c220Var = c220Var2;
                    vu30Var3 = vu30Var2;
                    b0kVar2.i0(1099544339);
                    String str8 = c220Var.b;
                    if (err0Var.s() > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (err0Var.s() < p7h.L(list)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zI3 = b0kVar2.i(hdn0Var);
                    objT3 = b0kVar2.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new xh6(hdn0Var, (byte) 5);
                        b0kVar2.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    zI4 = b0kVar2.i(hdn0Var);
                    objT4 = b0kVar2.T();
                    if (zI4 || objT4 == m4cVar) {
                        objT4 = new xh6(hdn0Var, (byte) 6);
                        b0kVar2.s0(objT4);
                    }
                    a(str8, z8, z9, function1, (Function0) objT4, b0kVar2, 0);
                    b0kVar2.r(false);
                }
                b0kVar2.f0(-1211447791, Integer.valueOf(err0Var.s()));
                b220Var = c220Var.c;
                if (b220Var instanceof x120) {
                    b0kVar2.i0(-1211445177);
                    if (dqyVar2 != null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    if ((i3 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zI5 = b0kVar2.i(c220Var) | z16;
                    objT7 = b0kVar2.T();
                    if (zI5 || objT7 == m4cVar) {
                        objT7 = new hf31(vu30Var3, c220Var, (byte) 26);
                        b0kVar2.s0(objT7);
                    }
                    iu30 iu30Var6 = (iu30) objT7;
                    wnb0 wnb0Var = new wnb0(1.0f, false);
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    b0k b0kVar4 = b0kVar2;
                    j1e1.d(dqyVar2, yzuVar, iu30Var6, uyn1.B(wnb0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), b0kVar4, i2 & 112);
                    b0kVar2 = b0kVar4;
                    z10 = false;
                    b0kVar2.r(false);
                    vu30Var4 = vu30Var;
                } else if (b220Var instanceof z120) {
                    b0kVar2.i0(1100279473);
                    z120Var = (z120) b220Var;
                    list2 = z120Var.f;
                    str3 = z120Var.e;
                    if (str3 != null || (dqyVar3 = (dqy) map2.get(str3)) == null) {
                        numValueOf = num;
                    } else {
                        numValueOf = Integer.valueOf(dqyVar3.d.size());
                    }
                    if (numValueOf != null && numValueOf.intValue() > 1 && (list3 = list2) != null && !list3.isEmpty()) {
                        str5 = z120Var.g;
                        if (str5 == null) {
                            str6 = z120Var.d;
                        } else {
                            str6 = str5;
                        }
                        z120Var = new z120(z120Var.b, z120Var.c, str6, z120Var.e, str5, list2, list2);
                    }
                    List list4 = z120Var.a;
                    str4 = (String) dw91Var.get(str7);
                    if (str4 == null) {
                        str4 = z120Var.b;
                    }
                    String str9 = z120Var.c;
                    String str10 = z120Var.d;
                    boolean zI8 = b0kVar2.i(dw91Var) | b0kVar2.i(c220Var);
                    if ((i3 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zI8;
                    objT6 = b0kVar2.T();
                    if (!z14 || objT6 == m4cVar) {
                        vu30Var4 = vu30Var;
                        z15 = false;
                        objT6 = new or51(dw91Var, c220Var, vu30Var4, (byte) 0);
                        b0kVar2.s0(objT6);
                    } else {
                        vu30Var4 = vu30Var;
                        z15 = false;
                    }
                    e(list4, str4, str9, str10, (iu30) objT6, b0kVar2, 0);
                    b0kVar2.r(z15);
                    z10 = z15;
                } else {
                    vu30Var4 = vu30Var;
                    if (b220Var instanceof y120) {
                        b0kVar2.i0(-1211413752);
                        y120Var = (y120) b220Var;
                        str2 = (String) dw91Var.get(str7);
                        if (str2 != null || (numC0 = nhc1.c0(str2)) == null) {
                            iIntValue = y120Var.a;
                        } else {
                            iIntValue = numC0.intValue();
                        }
                        boolean zI9 = b0kVar2.i(dw91Var) | b0kVar2.i(c220Var);
                        if ((i3 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zI9 | z11;
                        objT5 = b0kVar2.T();
                        if (z12 || objT5 == m4cVar) {
                            objT5 = new or51(dw91Var, c220Var, vu30Var4, (byte) 1);
                            b0kVar2.s0(objT5);
                        }
                        b0k b0kVar5 = b0kVar2;
                        h7p1.h(y120Var, iIntValue, (iu30) objT5, (qim0) null, b0kVar5, 0);
                        b0kVar2 = b0kVar5;
                        z10 = false;
                        b0kVar2.r(false);
                    } else {
                        z10 = false;
                        if (u890.j(b220Var, a220.a)) {
                            throw p3d1.k(b0kVar2, -1211446991, false);
                        }
                        b0kVar2.i0(-1211402235);
                        b0kVar2.r(false);
                    }
                }
                b0kVar2.r(z10);
                b0kVar2.r(true);
            } else {
                dqyVar = dqyVar5;
            }
            az20Var = (az20) b0kVar3.k(t4k.i);
            boolean zI10 = b0kVar3.i(mr20Var);
            if (i4 != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            zI = zI10 | z2 | b0kVar3.i(hdn0Var2) | b0kVar3.i(map3) | b0kVar3.i(az20Var);
            Object objT15 = b0kVar3.T();
            if (zI) {
                boolean z110 = z;
                hdn0Var = hdn0Var2;
                map = map3;
                z3 = false;
                z4 = z110;
                sew0Var = new sew0(mr20Var, list, map, hdn0Var, az20Var, (lnm) null);
                mr20Var2 = mr20Var;
                az20Var = az20Var;
                b0kVar3.s0(sew0Var);
            } else {
                boolean z111 = z;
                hdn0Var = hdn0Var2;
                map = map3;
                z3 = false;
                z4 = z111;
                sew0Var = new sew0(mr20Var, list, map, hdn0Var, az20Var, (lnm) null);
                mr20Var2 = mr20Var;
                az20Var = az20Var;
                b0kVar3.s0(sew0Var);
            }
            i2 = i3 >> 6;
            qxd0.t(mr20Var2, b0kVar3, (vu30) sew0Var);
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            if ((i3 & 3670016) == 1048576) {
                z5 = true;
            } else {
                z5 = z3;
            }
            z6 = z4;
            zH = z5 | b0kVar3.h(z6);
            objT = b0kVar3.T();
            if (zH) {
                objT = new w73(iu30Var3, z6, (lnm) null, (byte) 15);
                b0kVar3.s0(objT);
            } else {
                objT = new w73(iu30Var3, z6, (lnm) null, (byte) 15);
                b0kVar3.s0(objT);
            }
            qxd0.t(boolValueOf2, b0kVar3, (vu30) objT);
            if ((i3 & 29360128) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            zI2 = z7 | b0kVar3.i(c220Var2);
            objT2 = b0kVar3.T();
            if (zI2) {
                objT2 = new wp41(iu30Var4, c220Var2, (lnm) null, (byte) 2);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new wp41(iu30Var4, c220Var2, (lnm) null, (byte) 2);
                b0kVar3.s0(objT2);
            }
            qxd0.t(str7, b0kVar3, (vu30) objT2);
            nim0Var = nim0.a;
            map2 = map;
            qim0VarJ = u291.j(((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.5f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            if (z6) {
                qim0VarJ = qim0VarJ.then(u291.c(nim0Var, 1.0f));
            }
            WeakHashMap weakHashMap2 = osl1.x;
            qim0 qim0VarP2 = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarJ);
            mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0VarM = b0kVar3.m();
            qim0VarE = zr7.E(b0kVar3, qim0VarP2);
            hzj.A.getClass();
            if (((x340) b0kVar3).a != null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.h(nim0Var, 8.0f));
            if (dqyVar == 0) {
                b0kVar2 = b0kVar3;
                dqyVar2 = dqyVar;
                map2 = map2;
                num = null;
                c220Var = c220Var2;
                vu30Var3 = vu30Var2;
                b0kVar2.i0(1099544339);
                String str11 = c220Var.b;
                if (err0Var.s() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (err0Var.s() < p7h.L(list)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zI3 = b0kVar2.i(hdn0Var);
                objT3 = b0kVar2.T();
                if (zI3) {
                    objT3 = new xh6(hdn0Var, (byte) 5);
                    b0kVar2.s0(objT3);
                } else {
                    objT3 = new xh6(hdn0Var, (byte) 5);
                    b0kVar2.s0(objT3);
                }
                Function0 function2 = (Function0) objT3;
                zI4 = b0kVar2.i(hdn0Var);
                objT4 = b0kVar2.T();
                if (zI4) {
                    objT4 = new xh6(hdn0Var, (byte) 6);
                    b0kVar2.s0(objT4);
                } else {
                    objT4 = new xh6(hdn0Var, (byte) 6);
                    b0kVar2.s0(objT4);
                }
                a(str11, z8, z9, function2, (Function0) objT4, b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                dqyVar2 = dqyVar;
                map2 = map2;
                num = null;
                c220Var = c220Var2;
                vu30Var3 = vu30Var2;
                b0kVar2.i0(1099544339);
                String str12 = c220Var.b;
                if (err0Var.s() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (err0Var.s() < p7h.L(list)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zI3 = b0kVar2.i(hdn0Var);
                objT3 = b0kVar2.T();
                if (zI3) {
                    objT3 = new xh6(hdn0Var, (byte) 5);
                    b0kVar2.s0(objT3);
                } else {
                    objT3 = new xh6(hdn0Var, (byte) 5);
                    b0kVar2.s0(objT3);
                }
                Function0 function3 = (Function0) objT3;
                zI4 = b0kVar2.i(hdn0Var);
                objT4 = b0kVar2.T();
                if (zI4) {
                    objT4 = new xh6(hdn0Var, (byte) 6);
                    b0kVar2.s0(objT4);
                } else {
                    objT4 = new xh6(hdn0Var, (byte) 6);
                    b0kVar2.s0(objT4);
                }
                a(str12, z8, z9, function3, (Function0) objT4, b0kVar2, 0);
                b0kVar2.r(false);
            }
            b0kVar2.f0(-1211447791, Integer.valueOf(err0Var.s()));
            b220Var = c220Var.c;
            if (b220Var instanceof x120) {
                b0kVar2.i0(-1211445177);
                if (dqyVar2 != null) {
                    eg.m("Required value was null.");
                    return;
                }
                if ((i3 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zI5 = b0kVar2.i(c220Var) | z16;
                objT7 = b0kVar2.T();
                if (zI5) {
                    objT7 = new hf31(vu30Var3, c220Var, (byte) 26);
                    b0kVar2.s0(objT7);
                } else {
                    objT7 = new hf31(vu30Var3, c220Var, (byte) 26);
                    b0kVar2.s0(objT7);
                }
                iu30 iu30Var7 = (iu30) objT7;
                wnb0 wnb0Var2 = new wnb0(1.0f, false);
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                b0k b0kVar6 = b0kVar2;
                j1e1.d(dqyVar2, yzuVar, iu30Var7, uyn1.B(wnb0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), b0kVar6, i2 & 112);
                b0kVar2 = b0kVar6;
                z10 = false;
                b0kVar2.r(false);
                vu30Var4 = vu30Var;
            } else if (b220Var instanceof z120) {
                b0kVar2.i0(1100279473);
                z120Var = (z120) b220Var;
                list2 = z120Var.f;
                str3 = z120Var.e;
                if (str3 != null) {
                    numValueOf = num;
                } else {
                    numValueOf = num;
                }
                if (numValueOf != null) {
                    str5 = z120Var.g;
                    if (str5 == null) {
                        str6 = z120Var.d;
                    } else {
                        str6 = str5;
                    }
                    z120Var = new z120(z120Var.b, z120Var.c, str6, z120Var.e, str5, list2, list2);
                }
                List list5 = z120Var.a;
                str4 = (String) dw91Var.get(str7);
                if (str4 == null) {
                    str4 = z120Var.b;
                }
                String str13 = z120Var.c;
                String str14 = z120Var.d;
                boolean zI11 = b0kVar2.i(dw91Var) | b0kVar2.i(c220Var);
                if ((i3 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zI11;
                objT6 = b0kVar2.T();
                if (z14) {
                    vu30Var4 = vu30Var;
                    z15 = false;
                    objT6 = new or51(dw91Var, c220Var, vu30Var4, (byte) 0);
                    b0kVar2.s0(objT6);
                } else {
                    vu30Var4 = vu30Var;
                    z15 = false;
                    objT6 = new or51(dw91Var, c220Var, vu30Var4, (byte) 0);
                    b0kVar2.s0(objT6);
                }
                e(list5, str4, str13, str14, (iu30) objT6, b0kVar2, 0);
                b0kVar2.r(z15);
                z10 = z15;
            } else {
                vu30Var4 = vu30Var;
                if (b220Var instanceof y120) {
                    b0kVar2.i0(-1211413752);
                    y120Var = (y120) b220Var;
                    str2 = (String) dw91Var.get(str7);
                    if (str2 != null) {
                        iIntValue = y120Var.a;
                    } else {
                        iIntValue = y120Var.a;
                    }
                    boolean zI12 = b0kVar2.i(dw91Var) | b0kVar2.i(c220Var);
                    if ((i3 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zI12 | z11;
                    objT5 = b0kVar2.T();
                    if (z12) {
                        objT5 = new or51(dw91Var, c220Var, vu30Var4, (byte) 1);
                        b0kVar2.s0(objT5);
                    } else {
                        objT5 = new or51(dw91Var, c220Var, vu30Var4, (byte) 1);
                        b0kVar2.s0(objT5);
                    }
                    b0k b0kVar7 = b0kVar2;
                    h7p1.h(y120Var, iIntValue, (iu30) objT5, (qim0) null, b0kVar7, 0);
                    b0kVar2 = b0kVar7;
                    z10 = false;
                    b0kVar2.r(false);
                } else {
                    z10 = false;
                    if (u890.j(b220Var, a220.a)) {
                        throw p3d1.k(b0kVar2, -1211446991, false);
                    }
                    b0kVar2.i0(-1211402235);
                    b0kVar2.r(false);
                }
            }
            b0kVar2.r(z10);
            b0kVar2.r(true);
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new nr51(list, str, mr20Var, yzuVar, vu30Var4, vu30Var3, iu30Var3, iu30Var4, i, (byte) 1);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, boolean z) {
        int i2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(252418122);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gra graVar = een.h;
            vq60 vq60Var = jw80.a;
            qim0 qim0VarX = bin.x(tsj0.a, z, (String) null, new pm31(0), (idn0) null, function0, 10);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            jsl jslVar = new jsl(str);
            if (z) {
                x340Var.i0(-581245737);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.b;
            } else {
                x340Var.i0(-581244489);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).c.b;
            }
            x340Var.r(false);
            long j2 = j;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, jslVar, u291.r(nim0.a, 16.0f), j2, 0L, false, x340Var, 8 | (i2 & 14), 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cbh0(huxVar, str, z, function0, i);
        }
    }

    public static final void d(int i, Integer num, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        x340 x340Var;
        x340 x340Var2;
        long j;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-296118254);
        j06 j06Var = x340Var3.a;
        int i3 = i2 | (x340Var3.e(i) ? 4 : 2) | (x340Var3.g(num) ? 32 : 16) | (x340Var3.h(z) ? 256 : 128) | (x340Var3.i(function0) ? 2048 : 1024) | (x340Var3.i(function1) ? 16384 : 8192);
        if (x340Var3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z2 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, lljVar4);
            String strO0 = cwl1.o0(x340Var3, 2131955949);
            lee1 lee1Var = cbx.d(x340Var3).k;
            long j2 = cbx.a(x340Var3).b.b;
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            uwo1.e(strO0, bin.x(h2cVar.a(nim0Var, graVar), false, (String) null, new pm31(0), (idn0) null, function0, 11), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2032);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var3, 0);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, nim0Var);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, lljVar);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            uwo1.e(cwl1.o0(x340Var3, 2131955948), (qim0) null, cbx.d(x340Var3).h, cbx.a(x340Var3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2018);
            if (num != null) {
                x340Var3.i0(1597666882);
                uwo1.e(cwl1.U(2131820689, num.intValue(), new Object[]{Integer.valueOf(i), num}, x340Var3), (qim0) null, cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2018);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                x340Var2.i0(1598022452);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            String strO1 = cwl1.o0(x340Var2, 2131955950);
            lee1 lee1Var2 = cbx.d(x340Var2).k;
            if (z) {
                x340Var2.i0(143663780);
                j = cbx.a(x340Var2).b.c;
            } else {
                x340Var2.i0(143665183);
                j = cbx.a(x340Var2).c.b;
            }
            x340Var2.r(false);
            x340 x340Var4 = x340Var2;
            uwo1.e(strO1, bin.x(h2cVar.a(nim0Var, een.i), z, (String) null, new pm31(0), (idn0) null, function1, 10), lee1Var2, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0((byte) 8, i, i2, num, function0, function1, z);
        }
    }

    public static final void e(List list, String str, String str2, String str3, iu30 iu30Var, b0k b0kVar, int i) {
        h311 h311VarV;
        pr51 pr51Var;
        nim0 nim0Var;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1485964886);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (list.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    pr51Var = new pr51(list, str, str2, str3, iu30Var, i, (byte) 0);
                }
            } else {
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (u890.j(((fr51) it.next()).a, str)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = bb00.h(i3, x340Var);
                }
                err0 err0Var = (hdn0) objT;
                uwr uwrVar = cbx.a;
                long jC = cbx.a(x340Var).a.a.c();
                lb91 lb91Var = lb91.a;
                long j = cbx.a(x340Var).b.a;
                long j2 = cbx.a(x340Var).c.c;
                long jB = cbx.a(x340Var).a.b.b();
                long j3 = u7h.j;
                fb91 fb91VarE = lb91.e(j, j2, j3, jB, j3, 0L, 0L, 0L, 0L, 0L, x340Var, 992);
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
                qim0 qim0VarH = u291.h(nim0Var2, f);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
                mbh mbhVarA2 = jbh.a(h36.d, eraVar, x340Var, 0);
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
                err0 err0Var2 = err0Var;
                uwo1.e(((fr51) list.get(err0Var2.s())).b, (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var2, 12.0f));
                x340Var.r(true);
                float fS = err0Var2.s();
                jsg jsgVar = new jsg(0.0f, list.size() - 1);
                int size = list.size() - 2;
                int i4 = size < 0 ? 0 : size;
                qim0 qim0VarF2 = u291.f(nim0Var2, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarZ2 = uyn1.z(16.0f - d, 0.0f, 2, qim0VarF2);
                boolean zI = x340Var.i(err0Var) | ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new v721(list, iu30Var, err0Var, (byte) 28);
                    x340Var.s0(objT2);
                }
                rb91.a(fS, (iu30) objT2, qim0VarZ2, false, (Function0) null, fb91VarE, (idn0) null, i4, apo.r(773477340, new u451(fb91VarE, (byte) 10), x340Var), apo.r(-985882531, new gv6(fb91VarE, jC, (byte) 9), x340Var), jsgVar, x340Var, 905969664, 0, 88);
                x340Var = x340Var;
                if (str2 == null && str3 == null) {
                    x340Var.i0(795761506);
                    x340Var.r(false);
                    nim0Var = nim0Var2;
                    z = true;
                } else {
                    x340Var.i0(795191633);
                    qim0 qim0VarF3 = u291.f(nim0Var2, 1.0f);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF3), 0.0f, c, 0.0f, 0.0f, 13);
                    jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    nim0Var = nim0Var2;
                    uwo1.e(str2 == null ? "" : str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    uwo1.e(str3 == null ? "" : str3, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    z = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                nim0 nim0Var3 = nim0Var;
                cvx cvxVar5 = ywx0.k(nim0Var3, g, x340Var, x340Var).b;
                x0d.s(nim0Var3, 16.0f, x340Var, z);
            }
            h311VarV.d = pr51Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            pr51Var = new pr51(list, str, str2, str3, iu30Var, i, (byte) 1);
            h311VarV.d = pr51Var;
        }
    }
}
