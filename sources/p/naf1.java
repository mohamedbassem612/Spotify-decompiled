package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class naf1 extends f311 {
    public final /* synthetic */ byte a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Serializable g;
    public final Object h;
    public final Object i;

    public naf1(kaf1 kaf1Var, boolean z, ard1 ard1Var, Function0 function0, iu30 iu30Var, String str) {
        List list = kaf1Var.c;
        this.c = kaf1Var;
        this.b = z;
        this.d = ard1Var;
        this.e = function0;
        this.f = iu30Var;
        this.g = str;
        this.h = z ? new ok41(((list.size() - 1) * 100) + 900) : pk41.a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((laf1) it.next()).a.a);
        }
        this.i = mqo1.A(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01cb  */
    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        h311 h311VarV;
        maf1 maf1Var;
        Integer numValueOf;
        char c;
        Function0 function1;
        int i2;
        laf1 laf1Var;
        Function0 function2;
        naf1 naf1Var = this;
        switch (naf1Var.a) {
            case 0:
                String str = (String) naf1Var.g;
                Object obj = fkj0.X;
                kaf1 kaf1Var = (kaf1) naf1Var.c;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-1427859603);
                j06 j06Var = ((x340) b0kVar3).a;
                int i3 = (i & 6) == 0 ? (b0kVar3.g(i2cVar) ? 4 : 2) | i : i;
                if ((i & 48) == 0) {
                    i3 |= (i & 64) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i3 |= b0kVar3.i(naf1Var) ? 2048 : 1024;
                }
                int i4 = i3;
                if (b0kVar3.Y(i4 & 1, (i4 & 1043) != 1042)) {
                    List list = kaf1Var.c;
                    List list2 = kaf1Var.c;
                    if (list.isEmpty()) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            maf1Var = new maf1(naf1Var, i2cVar, rk41Var, function0, i, (byte) 0);
                        }
                    } else {
                        boolean zI = b0kVar3.i(naf1Var);
                        Object objT = b0kVar3.T();
                        if (zI || objT == obj) {
                            objT = new vbc1(naf1Var, (lnm) null, (byte) 5);
                            b0kVar3.s0(objT);
                        }
                        qxd0.t(rih1.a, b0kVar3, (vu30) objT);
                        Object objT2 = b0kVar3.T();
                        if (objT2 == obj) {
                            objT2 = v8r.q(new rfv0(0, 0));
                            b0kVar3.s0(objT2);
                        }
                        ven0 ven0Var = (ven0) objT2;
                        boolean zD = b0kVar3.d(i2cVar.c());
                        Object objT3 = b0kVar3.T();
                        if (zD || objT3 == obj) {
                            objT3 = Float.valueOf(i2cVar.c() * 0.563f);
                            b0kVar3.s0(objT3);
                        }
                        float fFloatValue = ((Number) objT3).floatValue();
                        boolean z = ((wat) b0kVar3.k(t4k.h)).U0() <= 1.5f;
                        qam1 qam1Var = (qam1) b0kVar3.k(sam1.a);
                        ven0 ven0VarS = v8r.s(b0kVar3.k(yhm1.a), b0kVar3);
                        boolean zG = b0kVar3.g(str) | b0kVar3.g(list2);
                        Object objT4 = b0kVar3.T();
                        if (zG || objT4 == obj) {
                            if (str != null) {
                                Iterator it = list2.iterator();
                                int i5 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        rx7 rx7Var = ((laf1) it.next()).b;
                                        if (!u890.j(rx7Var != null ? rx7Var.a : null, str)) {
                                            i5++;
                                        }
                                    } else {
                                        i5 = -1;
                                    }
                                }
                                numValueOf = Integer.valueOf(i5);
                                if (i5 < 0) {
                                    numValueOf = null;
                                }
                            } else {
                                numValueOf = null;
                            }
                            objT4 = v8r.q(numValueOf);
                            b0kVar3.s0(objT4);
                        }
                        ven0 ven0Var2 = (ven0) objT4;
                        c380 c380Var = (c380) naf1Var.i;
                        rfv0 rfv0Var = (rfv0) ven0Var.getValue();
                        Object objT5 = b0kVar3.T();
                        if (objT5 == obj) {
                            objT5 = new ry71(ven0Var, (byte) 23);
                            b0kVar3.s0(objT5);
                        }
                        iu30 iu30Var = (iu30) objT5;
                        uwr uwrVar = cbx.a;
                        oon1.a(c380Var, rfv0Var, iu30Var, cbx.d(b0kVar3).c, cbx.d(b0kVar3).b, (qim0) null, b0kVar3, 448);
                        b0kVar2 = b0kVar3;
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                        era eraVar = een.P0;
                        mbh mbhVarA = jbh.a(h36.e, eraVar, b0kVar2, 6);
                        boolean z2 = z;
                        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM = b0kVar2.m();
                        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar2.m0();
                        boolean z3 = ((x340) b0kVar2).S;
                        n4k n4kVar = hmb0.t1;
                        if (z3) {
                            b0kVar2.l(n4kVar);
                        } else {
                            b0kVar2.v0();
                        }
                        llj lljVar = y580.O0;
                        nko1.H(mbhVarA, b0kVar2, lljVar);
                        llj lljVar2 = y580.N0;
                        nko1.H(xos0VarM, b0kVar2, lljVar2);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        qam1 qam1Var2 = qam1Var;
                        llj lljVar3 = y580.R0;
                        nko1.H(numValueOf2, b0kVar2, lljVar3);
                        nko1.F(b0kVar2);
                        llj lljVar4 = y580.Y;
                        nko1.H(qim0VarE, b0kVar2, lljVar4);
                        ven0 ven0VarR = v8r.r("topSongsTitle", 100, rk41Var.a, naf1Var.b, (Function0) null, b0kVar2, 54, 16);
                        ven0 ven0Var3 = ven0Var2;
                        vnr0 vnr0Var = (vnr0) kaf1Var.b.invoke(b0kVar2, 0);
                        ven0 ven0Var4 = ven0VarS;
                        qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar2).b.b, 0.0f, 2, u291.f(nim0Var, 1.0f));
                        boolean zG2 = b0kVar2.g(ven0VarR);
                        Object objT6 = b0kVar2.T();
                        if (zG2 || objT6 == obj) {
                            objT6 = new ctd1(ven0VarR, (byte) 17);
                            b0kVar2.s0(objT6);
                        }
                        qgo1.f(vnr0Var, i541.C(qim0VarZ, (iu30) objT6), new a0e1(3), 0, false, (iu30) null, b0kVar2, 8, 56);
                        op71.g(b0kVar2, u291.h(nim0Var, cbx.b(b0kVar2).b.a));
                        qim0 qim0VarH = u291.h(nim0Var, fFloatValue);
                        mbh mbhVarA2 = jbh.a(h36.c, eraVar, b0kVar2, 0);
                        int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM2 = b0kVar2.m();
                        qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarH);
                        b0kVar2.m0();
                        if (((x340) b0kVar2).S) {
                            b0kVar2.l(n4kVar);
                        } else {
                            b0kVar2.v0();
                        }
                        nko1.H(mbhVarA2, b0kVar2, lljVar);
                        nko1.H(xos0VarM2, b0kVar2, lljVar2);
                        x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                        nko1.H(qim0VarE2, b0kVar2, lljVar4);
                        boolean zD2 = b0kVar2.d(fFloatValue);
                        Object objT7 = b0kVar2.T();
                        Object obj2 = objT7;
                        if (zD2 || objT7 == obj) {
                            int size = list2.size();
                            ArrayList arrayList = new ArrayList(size);
                            for (int i6 = 0; i6 < size; i6++) {
                                float size2 = fFloatValue / list2.size();
                                arrayList.add(new p3v((float) (((double) size2) - (((double) (i6 * size2)) * 0.04d))));
                            }
                            b0kVar2.s0(arrayList);
                            obj2 = arrayList;
                        }
                        List list3 = (List) obj2;
                        b0kVar2.i0(-691273455);
                        int i7 = 0;
                        for (Object obj3 : list2) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                p7h.T();
                                throw null;
                            }
                            laf1 laf1Var2 = (laf1) obj3;
                            Integer numValueOf3 = Integer.valueOf(i7);
                            boolean zE = b0kVar2.e(i7) | b0kVar2.i(naf1Var) | b0kVar2.i(laf1Var2);
                            Object objT8 = b0kVar2.T();
                            if (zE || objT8 == obj) {
                                objT8 = new ju01(i7, naf1Var, laf1Var2, (byte) 12);
                                b0kVar2.s0(objT8);
                            }
                            iu30 iu30Var2 = (iu30) objT8;
                            ard1 ard1Var = (ard1) naf1Var.d;
                            boolean zI2 = b0kVar2.i(ard1Var);
                            Object objT9 = b0kVar2.T();
                            if (zI2 || objT9 == obj) {
                                objT9 = new k7b1(1, ard1Var, ard1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 29);
                                b0kVar2.s0(objT9);
                            }
                            yhm1.a(numValueOf3, iu30Var2, (iu30) objT9, b0kVar2, 0);
                            float f = ((p3v) list3.get(i7)).a;
                            int i9 = ((rfv0) ven0Var.getValue()).a;
                            boolean z4 = rk41Var.a;
                            Integer num = (Integer) ven0Var3.getValue();
                            boolean z5 = num != null && num.intValue() == i7;
                            if (i7 == list2.size() - 1) {
                                b0kVar2.i0(971154748);
                                boolean z6 = (i4 & 112) == 32 || ((i4 & 64) != 0 && b0kVar2.i(rk41Var));
                                Object objT10 = b0kVar2.T();
                                if (z6 || objT10 == obj) {
                                    c = 5;
                                    objT10 = new kf6(rk41Var, (byte) 5);
                                    b0kVar2.s0(objT10);
                                } else {
                                    c = 5;
                                }
                                b0kVar2.r(false);
                                function1 = (Function0) objT10;
                            } else {
                                c = 5;
                                b0kVar2.i0(971262689);
                                b0kVar2.r(false);
                                function1 = null;
                            }
                            if (laf1Var2.b != null) {
                                b0kVar2.i0(971389139);
                                ven0 ven0Var5 = ven0Var4;
                                ven0Var3 = ven0Var3;
                                qam1 qam1Var3 = qam1Var2;
                                boolean zE2 = b0kVar2.e(i7) | b0kVar2.g(ven0Var5) | b0kVar2.i(naf1Var) | b0kVar2.i(laf1Var2) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && b0kVar2.i(rk41Var))) | b0kVar2.g(ven0Var3) | b0kVar2.i(qam1Var3);
                                Object objT11 = b0kVar2.T();
                                if (zE2 || objT11 == obj) {
                                    i2 = i7;
                                    laf1Var = laf1Var2;
                                    vts vtsVar = new vts(i2, laf1Var, this, rk41Var, ven0Var5, qam1Var3, ven0Var3);
                                    ven0Var4 = ven0Var5;
                                    qam1Var2 = qam1Var3;
                                    b0kVar2.s0(vtsVar);
                                    objT11 = vtsVar;
                                } else {
                                    i2 = i7;
                                    qam1Var2 = qam1Var3;
                                    ven0Var4 = ven0Var5;
                                    laf1Var = laf1Var2;
                                }
                                function2 = (Function0) objT11;
                                b0kVar2.r(false);
                            } else {
                                i2 = i7;
                                laf1Var = laf1Var2;
                                b0kVar2.i0(972951073);
                                b0kVar2.r(false);
                                function2 = null;
                            }
                            f(laf1Var, i2, f, i9, z4, z2, z5, function1, function2, b0kVar2, ((i4 << 18) & 1879048192) | 8);
                            naf1Var = this;
                            i7 = i8;
                            list3 = list3;
                        }
                        us71.m(b0kVar2, false, true, true);
                    }
                    h311VarV.d = maf1Var;
                    return;
                }
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    maf1Var = new maf1(this, i2cVar, rk41Var, function0, i, (byte) 1);
                    h311VarV.d = maf1Var;
                    return;
                }
                return;
            default:
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(2023519);
                int i10 = (i & 6) == 0 ? (x340Var.g(i2cVar) ? 4 : 2) | i : i;
                if ((i & 48) == 0) {
                    i10 |= (i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i10 |= x340Var.i(naf1Var) ? 2048 : 1024;
                }
                if (x340Var.Y(i10 & 1, (i10 & 1043) != 1042)) {
                    naf1Var.e(i2cVar, rk41Var, x340Var, ((i10 >> 3) & 896) | (i10 & 126));
                } else {
                    x340Var.b0();
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new ncf1(i, naf1Var, i2cVar, rk41Var, function0, (byte) 11);
                    return;
                }
                return;
        }
    }

    public void e(i2c i2cVar, rk41 rk41Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1064264931);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarH = rwq.h((zob1) this.f, x340Var, 0);
            gyg1 gyg1Var = (gyg1) this.c;
            wj31 wj31Var = (wj31) this.d;
            List list = (List) this.e;
            ((Boolean) ven0VarH.getValue()).getClass();
            ern1.m(i2cVar, gyg1Var, wj31Var, list, false, this.b, true, rk41Var, this.g, (xyg1) this.h, (yyg1) this.i, x340Var, (i2 & 14) | ((i2 << 18) & 29360128));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(this, i2cVar, rk41Var, i, (byte) 21);
        }
    }

    public void f(laf1 laf1Var, int i, float f, int i2, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, b0k b0kVar, int i3) {
        int i4;
        float f2;
        x340 x340Var;
        Function0 function2;
        yk4 yk4Var;
        boolean z4;
        qim0 qim0VarH;
        boolean z5;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(533055785);
        j06 j06Var = x340Var2.a;
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? x340Var2.g(laf1Var) : x340Var2.i(laf1Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var2.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var2.d(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var2.e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var2.h(z) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= x340Var2.h(z2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= x340Var2.h(z3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= x340Var2.i(function0) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= x340Var2.i(function1) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= x340Var2.i(this) ? 536870912 : 268435456;
        }
        int i5 = i4;
        if (x340Var2.Y(i5 & 1, (i5 & 306783379) != 306783378)) {
            wi90 wi90Var = laf1Var.a;
            yj41 yj41Var = wi90Var.b;
            String strC = f4i1.c(i, "topSongsRow_");
            int i6 = (i * 100) + 200;
            if (function0 == null) {
                x340Var2.i0(1771405783);
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = q9f1.c;
                    x340Var2.s0(objT);
                }
                x340Var2.r(false);
                function2 = (Function0) objT;
            } else {
                x340Var2.i0(1165520066);
                x340Var2.r(false);
                function2 = function0;
            }
            Function0 function3 = function2;
            j06 j06Var2 = j06Var;
            ven0 ven0VarR = v8r.r(strC, i6, z, this.b, function3, x340Var2, (i5 >> 6) & 896, 0);
            float fM0 = ((wat) x340Var2.k(t4k.h)).M0(i2);
            if (z2) {
                x340Var2.i0(1771541408);
                boolean zG = x340Var2.g(yj41Var.a);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    yk4 yk4Var2 = new yk4(yj41Var.a);
                    x340Var2.s0(yk4Var2);
                    objT2 = yk4Var2;
                }
                yk4Var = (yk4) objT2;
                x340Var2.r(false);
            } else {
                j06Var2 = j06Var2;
                x340Var2.i0(1771633012);
                x340Var2.r(false);
                yk4Var = null;
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            yk4 yk4Var3 = yk4Var;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            fra fraVar = een.N0;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarF = u291.f(z2 ? u291.h(qim0Var, f) : u291.j(56.0f, 0.0f, 2, qim0Var), 1.0f);
            boolean z6 = ((i5 & 14) == 4 || ((i5 & 8) != 0 && x340Var2.i(laf1Var))) | ((i5 & 234881024) == 67108864) | ((i5 & 3670016) == 1048576);
            Object objT3 = x340Var2.T();
            byte b = 6;
            if (z6 || objT3 == m4cVar) {
                objT3 = new wq01(laf1Var, function1, z3, b);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT3);
            boolean zG2 = x340Var2.g(ven0VarR);
            Object objT4 = x340Var2.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new ctd1(ven0VarR, (byte) 18);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarC = i541.C(qim0VarA, (iu30) objT4);
            if (function1 != null) {
                qim0VarC = a8o.D(qim0VarC, function1);
            }
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).b.b, 0.0f, 2, qim0VarC);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var2 == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z7 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qgo1.f(omo1.q((vnr0) wi90Var.a.invoke(x340Var2, 0), cbx.d(x340Var2).c, cbx.d(x340Var2).b, x340Var2), u291.x(fM0, 0.0f, 2, qim0Var), (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 60);
            x340 x340Var3 = x340Var2;
            if (yk4Var3 != null) {
                x340Var3.i0(1116963277);
                qim0 qim0VarJ = v8r.j(qim0Var, yj41Var.c);
                cbx.a.getClass();
                f2 = f;
                eso1.f(yk4Var3, isl.a, qim0VarJ, new p3v(f2), (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, x340Var3, ((i5 << 3) & 7168) | 24624, 448);
                z4 = false;
                x340Var3.r(false);
            } else {
                f2 = f;
                z4 = false;
                x340Var3.i0(1117255669);
                x340Var3.r(false);
            }
            if (z2) {
                x340Var3 = x340Var3;
                qim0VarH = u291.h(qim0Var, f2);
            } else {
                x340Var3 = x340Var3;
                qim0VarH = qim0Var;
            }
            qim0 qim0VarH2 = kx40.h(1.0f, qim0VarH, z4);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var3, 6);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarH2);
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
            x340 x340Var4 = x340Var3;
            qgo1.f(omo1.q((vnr0) wi90Var.c.invoke(x340Var3, 0), lee1.a(cbx.d(x340Var3).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(x340Var3).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), x340Var3), (qim0) null, new a0e1(5), 2, false, (iu30) null, x340Var4, 3080, 50);
            x340Var = x340Var4;
            if (z2) {
                x340Var.i0(870178775);
                vnr0 vnr0Var = (vnr0) wi90Var.d.invoke(x340Var, 0);
                if (vnr0Var == null || ihc1.y0(vnr0Var.a)) {
                    z5 = false;
                    x340Var.i0(870853087);
                    x340Var.r(false);
                } else {
                    x340Var.i0(870286097);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qgo1.f(omo1.q(vnr0Var, lee1.a(kk0.p(qim0Var, 4.0f, x340Var, x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(x340Var).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), x340Var), (qim0) null, new a0e1(5), 2, false, (iu30) null, x340Var, 3080, 50);
                    x340Var = x340Var;
                    z5 = false;
                    x340Var.r(false);
                }
                x340Var.r(z5);
            } else {
                x340Var.i0(870863007);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            f2 = f;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n6f1(this, laf1Var, i, f2, i2, z, z2, z3, function0, function1, i3);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        switch (this.a) {
            case 0:
                return (qk41) this.h;
            default:
                return nk41.a;
        }
    }

    public naf1(gyg1 gyg1Var, wj31 wj31Var, List list, boolean z, zob1 zob1Var, hcf1 hcf1Var, xyg1 xyg1Var, yyg1 yyg1Var) {
        this.c = gyg1Var;
        this.d = wj31Var;
        this.e = list;
        this.b = z;
        this.f = zob1Var;
        this.g = hcf1Var;
        this.h = xyg1Var;
        this.i = yyg1Var;
    }
}
