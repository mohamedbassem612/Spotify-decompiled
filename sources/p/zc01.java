package p;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class zc01 {
    public static final id01 a = id01.b;

    public static final void a(hwb hwbVar, hc01 hc01Var, wux wuxVar, iu30 iu30Var, b0k b0kVar, int i) {
        long j;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-125102699);
        byte b = 4;
        int i2 = i | (x340Var.g(hwbVar) ? 4 : 2) | (x340Var.e(hc01Var.ordinal()) ? 32 : 16) | (x340Var.g(wuxVar) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (hc01Var.c) {
                uwr uwrVar = cbx.a;
                j = ((vex) zex.a.e).b;
            } else {
                uwr uwrVar2 = cbx.a;
                j = ((vex) zex.a.e).i;
            }
            long j2 = j;
            qim0 qim0VarT = l6o1.t(u291.f(nim0.a, 1.0f), l6o1.C(0, 0, 1, x340Var), 14);
            float f = wuxVar.e.b;
            qim0 qim0VarN = anm1.N("ereader_bottom_sheet_entry_points", uyn1.A(qim0VarT, f, 12.0f, f, 12.0f));
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            x340Var.i0(26309261);
            t0z t0zVar = fwb.e;
            ArrayList<fwb> arrayList = new ArrayList();
            t0zVar.getClass();
            d7 d7Var = new d7(t0zVar, (byte) 0);
            while (d7Var.hasNext()) {
                Object next = d7Var.next();
                if (((fwb) next) != fwb.Chapters) {
                    arrayList.add(next);
                }
            }
            for (fwb fwbVar : arrayList) {
                boolean zE = x340Var.e(fwbVar.ordinal());
                Object objT = x340Var.T();
                if (zE || objT == obj) {
                    objT = new cx0((byte) 3);
                    x340Var.s0(objT);
                }
                xpw xpwVar = (xpw) objT;
                long j3 = hc01Var.b;
                boolean zE2 = ((i2 & 7168) == 2048 ? z : false) | x340Var.e(fwbVar.ordinal());
                Object objT2 = x340Var.T();
                if (zE2 || objT2 == obj) {
                    objT2 = new zkz0(iu30Var, fwbVar, b);
                    x340Var.s0(objT2);
                }
                otw.c(xpwVar, new gwb(fwbVar, j3, j2, (Function0) objT2), (qim0) null, (ipb1) null, x340Var, 0, 12);
                z = true;
                b = 4;
            }
            x340Var.r(false);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(hwbVar, hc01Var, wuxVar, iu30Var, i, (byte) 5);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.validateException(MethodThrowsVisitor.java:228)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.isThrowsRequired(MethodThrowsVisitor.java:216)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visitThrows(MethodThrowsVisitor.java:204)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:155)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static final void b(sb01 sb01Var, Function0 function0, ed01 ed01Var, cxc cxcVar, hwb hwbVar, qe01 qe01Var, he01 he01Var, he01 he01Var2, ngs0 ngs0Var, gc01 gc01Var, nl9 nl9Var, td01 td01Var, gb01 gb01Var, String str, md01 md01Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        Object obj;
        int i3;
        Object objH;
        int i4;
        Object obj2;
        int i5;
        boolean z2;
        Object obj3;
        Object af0Var;
        m4c m4cVar;
        boolean z3;
        String str2;
        tob1 tob1Var;
        tob1 tob1Var2;
        Object obj4;
        sb01 sb01Var2 = sb01Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-238392473);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.i(sb01Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(ed01Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(cxcVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? x340Var2.g(hwbVar) : x340Var2.i(hwbVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= (i & 262144) == 0 ? x340Var2.g(qe01Var) : x340Var2.i(qe01Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= (i & 2097152) == 0 ? x340Var2.g(he01Var) : x340Var2.i(he01Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= (i & 16777216) == 0 ? x340Var2.g(he01Var2) : x340Var2.i(he01Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= (i & 134217728) == 0 ? x340Var2.g(ngs0Var) : x340Var2.i(ngs0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= (i & 1073741824) == 0 ? x340Var2.g(gc01Var) : x340Var2.i(gc01Var) ? 536870912 : 268435456;
        }
        int i6 = i2;
        int i7 = 6 | (x340Var2.g(nl9Var) ? 32 : 16) | (x340Var2.g(td01Var) ? 256 : 128) | (x340Var2.i(gb01Var) ? 2048 : 1024) | (x340Var2.g(str) ? 16384 : 8192) | (x340Var2.g(md01Var) ? 131072 : 65536) | (x340Var2.h(z) ? 1048576 : 524288) | 12582912;
        if (x340Var2.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 4793491) == 4793490) ? false : true)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                obj = objT;
                hd01 hd01Var = new hd01(context.getApplicationContext().getCacheDir(), cxcVar, ed01Var.c);
                x340Var2.s0(hd01Var);
                obj = hd01Var;
            }
            obj = objT;
            hd01 hd01Var2 = (hd01) obj;
            ven0 ven0VarK = f4p1.k(qe01Var.c, (iac0) null, x340Var2, 7);
            ven0 ven0VarK2 = f4p1.k(qe01Var.e, (iac0) null, x340Var2, 7);
            ven0 ven0VarK3 = f4p1.k(hd01Var2.f, (iac0) null, x340Var2, 7);
            tob1 tob1VarK = f4p1.k(qe01Var.g, (iac0) null, x340Var2, 7);
            ven0 ven0VarK4 = f4p1.k(qe01Var.i, (iac0) null, x340Var2, 7);
            ven0 ven0VarK5 = f4p1.k(qe01Var.k, (iac0) null, x340Var2, 7);
            ven0 ven0VarK6 = f4p1.k(gc01Var.b, (iac0) null, x340Var2, 7);
            ven0 ven0VarK7 = f4p1.k(td01Var.b, (iac0) null, x340Var2, 7);
            FontFamily fontFamily = (FontFamily) ((Map) ven0VarK3.getValue()).get((fd01) ven0VarK2.getValue());
            if (fontFamily == null) {
                fontFamily = ((fd01) ven0VarK2.getValue()).a;
            }
            FontFamily fontFamily2 = fontFamily;
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(x340Var2);
            cwx cwxVarC = cbx.c(x340Var2);
            long j = ((hc01) ven0VarK.getValue()).a;
            bwx bwxVar = cwxVarC.b;
            bwx bwxVar2 = cwxVarC.b;
            uo5 uo5Var = cwxVarC.a;
            tob1 tob1VarA = w191.a(j, irn1.o0((int) jfv.h(bwxVar.b), 0, ((jhx) uo5Var.d).a, 2), (String) null, x340Var2, 0, 12);
            cvx cvxVar = wuxVarB.b;
            float f = cvxVar.e;
            float f2 = cvxVar.f;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var2).e;
            pxg1 pxg1VarO0 = irn1.o0((int) jfv.h(bwxVar2.b), 0, ((jhx) uo5Var.b).a, 2);
            pxg1 pxg1VarO1 = irn1.o0((int) jfv.h(bwxVar2.b), 0, ((jhx) uo5Var.c).a, 2);
            Object[] objArr = new Object[0];
            Object objT2 = x340Var2.T();
            Object obj5 = objT2;
            if (objT2 == m4cVar2) {
                ijz0 ijz0Var = ijz0.h;
                x340Var2.s0(ijz0Var);
                obj5 = ijz0Var;
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) obj5, x340Var2, 48);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar2) {
                i3 = 0;
                objH = bb00.h(0, x340Var2);
            } else {
                i3 = 0;
                objH = objT3;
            }
            hdn0 hdn0Var = (hdn0) objH;
            Object objT4 = x340Var2.T();
            Object objH2 = objT4;
            if (objT4 == m4cVar2) {
                objH2 = bb00.h(i3, x340Var2);
            }
            hdn0 hdn0Var2 = (hdn0) objH2;
            Object objT5 = x340Var2.T();
            Object objH3 = objT5;
            if (objT5 == m4cVar2) {
                objH3 = bb00.h(-1, x340Var2);
            }
            err0 err0Var = (hdn0) objH3;
            Object objT6 = x340Var2.T();
            Object obj6 = objT6;
            if (objT6 == m4cVar2) {
                hrr0 hrr0VarQ = v8r.q(sb01Var);
                x340Var2.s0(hrr0VarQ);
                obj6 = hrr0VarQ;
            }
            tob1 tob1Var3 = (ven0) obj6;
            boolean z4 = ((Boolean) ven0VarK4.getValue()).booleanValue() || ((Boolean) ven0VarK5.getValue()).booleanValue() || ((Boolean) ven0VarK6.getValue()).booleanValue() || ((Boolean) ven0VarK7.getValue()).booleanValue();
            boolean z5 = (((crl1) x340Var2.k(t4k.u)).b() && z) ? false : true;
            Object objT7 = x340Var2.T();
            Object obj7 = objT7;
            if (objT7 == m4cVar2) {
                qb01 qb01Var = (qb01) gb01Var.a.get();
                x340Var2.s0(qb01Var);
                obj7 = qb01Var;
            }
            qb01 qb01Var2 = (qb01) obj7;
            boolean zI = x340Var2.i(qb01Var2);
            Object objT8 = x340Var2.T();
            Object obj8 = objT8;
            if (zI || objT8 == m4cVar2) {
                fbz0 fbz0Var = new fbz0(qb01Var2, (byte) 28);
                x340Var2.s0(fbz0Var);
                obj8 = fbz0Var;
            }
            rih1 rih1Var = rih1.a;
            qxd0.i(rih1Var, (iu30) obj8, x340Var2);
            Boolean boolValueOf = Boolean.valueOf(z5);
            boolean zI2 = x340Var2.i(qb01Var2) | x340Var2.h(z5);
            Object objT9 = x340Var2.T();
            if (zI2 || objT9 == m4cVar2) {
                i4 = 0;
                ic01 ic01Var = new ic01(qb01Var2, z5, (lnm) null, (byte) 0);
                x340Var2.s0(ic01Var);
                obj2 = ic01Var;
            } else {
                i4 = 0;
                obj2 = objT9;
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) obj2);
            boolean zI3 = x340Var2.i(hd01Var2);
            Object objT10 = x340Var2.T();
            if (zI3 || objT10 == m4cVar2) {
                i5 = 1;
                z2 = false;
                ic01 ic01Var2 = new ic01(hd01Var2, (lnm) null, (byte) 1);
                x340Var2.s0(ic01Var2);
                obj3 = ic01Var2;
            } else {
                i5 = 1;
                z2 = false;
                obj3 = objT10;
            }
            qxd0.t(rih1Var, x340Var2, (vu30) obj3);
            int i8 = i7 & 57344;
            boolean z6 = (((((((i6 & 1879048192) == 536870912 || ((i6 & 1073741824) != 0 && x340Var2.i(gc01Var))) ? i5 : i4) | (x340Var2.i(ed01Var) ? 1 : 0)) | (i8 == 16384 ? 1 : i4)) | (x340Var2.i(tob1Var3) ? 1 : 0)) == true ? 1 : 0) | (x340Var2.i(hdn0Var) ? 1 : 0) | (x340Var2.i(hdn0Var2) ? 1 : 0);
            Object objT11 = x340Var2.T();
            if (z6 || objT11 == m4cVar2) {
                m4cVar = m4cVar2;
                z3 = true;
                str2 = str;
                af0Var = new af0(gc01Var, ed01Var, str2, tob1Var3, hdn0Var, hdn0Var2, (lnm) null);
                tob1Var = tob1Var3;
                tob1Var2 = tob1VarK;
                x340Var2.s0(af0Var);
            } else {
                af0Var = objT11;
                m4cVar = m4cVar2;
                tob1Var2 = tob1VarK;
                z3 = true;
                tob1Var = tob1Var3;
                str2 = str;
            }
            qxd0.t(rih1Var, x340Var2, (vu30) af0Var);
            h(((Boolean) ven0Var.getValue()).booleanValue(), x340Var2, i4);
            qim0 qim0Var3 = nim0.a;
            boolean z7 = z5;
            qim0 qim0VarN = anm1.N("ereader_reader_content", dug.f(u291.d(qim0Var3, 1.0f), ((u7h) tob1VarA.getValue()).a, d4o1.a));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw z2;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            tob1 tob1Var4 = tob1Var2;
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.f0(1482938830, (sb01) tob1Var.getValue());
            sb01 sb01Var3 = (sb01) tob1Var.getValue();
            hc01 hc01Var = (hc01) ven0VarK.getValue();
            te01 te01Var = (te01) tob1Var4.getValue();
            boolean zH = x340Var2.h(z4) | x340Var2.i(ven0Var);
            Object objT12 = x340Var2.T();
            Object obj9 = objT12;
            if (zH || objT12 == m4cVar) {
                y72 y72Var = new y72(z4, ven0Var, (byte) 3);
                x340Var2.s0(y72Var);
                obj9 = y72Var;
            }
            Function0 function1 = (Function0) obj9;
            boolean zI4 = x340Var2.i(hdn0Var) | x340Var2.i(hdn0Var2);
            Object objT13 = x340Var2.T();
            Object obj10 = objT13;
            if (zI4 || objT13 == m4cVar) {
                kpw0 kpw0Var = new kpw0(hdn0Var, hdn0Var2, (byte) 20);
                x340Var2.s0(kpw0Var);
                obj10 = kpw0Var;
            }
            vu30 vu30Var = (vu30) obj10;
            boolean zI5 = (i8 == 16384 ? z3 : false) | x340Var2.i(qb01Var2) | x340Var2.h(z7);
            Object objT14 = x340Var2.T();
            Object obj11 = objT14;
            if (zI5 || objT14 == m4cVar) {
                r7e0 r7e0Var = new r7e0(qb01Var2, str2, z7, (byte) 20);
                x340Var2.s0(r7e0Var);
                obj11 = r7e0Var;
            }
            vu30 vu30Var2 = (vu30) obj11;
            int iS = err0Var.s();
            boolean zI6 = x340Var2.i(err0Var);
            Object objT15 = x340Var2.T();
            if (zI6 || objT15 == m4cVar) {
                xh6 xh6Var = new xh6(err0Var, (byte) 3);
                x340Var2.s0(xh6Var);
                obj4 = xh6Var;
            } else {
                obj4 = objT15;
            }
            d(sb01Var3, ed01Var, hc01Var, fontFamily2, te01Var, wuxVarB, function1, vu30Var, vu30Var2, iS, (Function0) obj4, md01Var, str2, uyn1.B(u291.d(qim0Var3, 1.0f), 0.0f, f2, 0.0f, 16.0f, 5), x340Var2, (i6 >> 3) & 112, ((i7 >> 12) & 112) | ((i7 >> 6) & 896));
            x340Var2.r(false);
            boolean z8 = !((Boolean) ven0Var.getValue()).booleanValue();
            Object objT16 = x340Var2.T();
            Object obj12 = objT16;
            if (objT16 == m4cVar) {
                oa01 oa01Var = oa01.Z;
                x340Var2.s0(oa01Var);
                obj12 = oa01Var;
            }
            bby bbyVarO = xay.o(pxg1VarO0, (iu30) obj12);
            Object objT17 = x340Var2.T();
            Object obj13 = objT17;
            if (objT17 == m4cVar) {
                oa01 oa01Var2 = oa01.N0;
                x340Var2.s0(oa01Var2);
                obj13 = oa01Var2;
            }
            ln00 ln00VarS = xay.s(pxg1VarO1, (iu30) obj13);
            h2c h2cVar = h2c.a;
            fq7.g(z8, h2cVar.a(qim0Var3, graVar), bbyVarO, ln00VarS, (String) null, apo.r(-2100820279, new lc01(function0, wuxVarB, f, f2, tob1Var, ven0VarK, hdn0Var, hdn0Var2, tob1VarA), x340Var2), x340Var2, 196608, 16);
            boolean z9 = !((Boolean) ven0Var.getValue()).booleanValue();
            Object objT18 = x340Var2.T();
            Object obj14 = objT18;
            if (objT18 == m4cVar) {
                oa01 oa01Var3 = oa01.O0;
                x340Var2.s0(oa01Var3);
                obj14 = oa01Var3;
            }
            bby bbyVarO2 = xay.o(pxg1VarO0, (iu30) obj14);
            Object objT19 = x340Var2.T();
            Object obj15 = objT19;
            if (objT19 == m4cVar) {
                oa01 oa01Var4 = oa01.P0;
                x340Var2.s0(oa01Var4);
                obj15 = oa01Var4;
            }
            fq7.g(z9, h2cVar.a(qim0Var3, een.t), bbyVarO2, xay.s(pxg1VarO1, (iu30) obj15), (String) null, apo.r(-396139278, new kc01(u85Var, f2, tob1VarA, err0Var, wuxVarB, hwbVar, qe01Var, gc01Var, td01Var, hdn0Var2, hdn0Var, ven0VarK), x340Var2), x340Var2, 196608, 16);
            x340Var = x340Var2;
            x340Var.r(z3);
            otw.c(he01Var, new oe01(((Boolean) ven0VarK4.getValue()).booleanValue()), (qim0) null, (ipb1) null, x340Var, (i6 >> 18) & 14, 12);
            otw.c(he01Var2, new fe01(((Boolean) ven0VarK5.getValue()).booleanValue()), (qim0) null, (ipb1) null, x340Var, (i6 >> 21) & 14, 12);
            otw.c(ngs0Var, new ec01(((Boolean) ven0VarK6.getValue()).booleanValue()), (qim0) null, (ipb1) null, x340Var, (i6 >> 24) & 14, 12);
            sb01Var2 = sb01Var;
            otw.c(nl9Var, new qd01(((Boolean) ven0VarK7.getValue()).booleanValue(), sb01Var2.a), (qim0) null, (ipb1) null, x340Var, (i7 >> 3) & 14, 12);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mc01(sb01Var2, function0, ed01Var, cxcVar, hwbVar, qe01Var, he01Var, he01Var2, ngs0Var, gc01Var, nl9Var, td01Var, gb01Var, str, md01Var, z, qim0Var2, i);
        }
    }

    public static final void c(String str, lee1 lee1Var, int i, int i2, boolean z, yae1 yae1Var, hc01 hc01Var, wux wuxVar, Function0 function0, z680 z680Var, int i3, List list, qim0 qim0Var, b0k b0kVar, int i4) {
        x340 x340Var;
        qim0 qim0Var2;
        boolean z2;
        int i5;
        m4c m4cVar;
        es41 es41Var;
        lee1 lee1Var2;
        x340 x340Var2;
        wat watVar;
        tob1 tob1Var;
        Object nc01Var;
        ven0 ven0Var;
        int iS;
        int iS2;
        z680 z680Var2;
        int i6;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1021696448);
        j06 j06Var = x340Var3.a;
        int i7 = i4 | (x340Var3.g(str) ? 4 : 2) | (x340Var3.i(lee1Var) ? 32 : 16) | (x340Var3.e(i) ? 256 : 128) | (x340Var3.e(i2) ? 2048 : 1024) | (x340Var3.h(z) ? 16384 : 8192) | (x340Var3.i(yae1Var) ? 131072 : 65536) | (x340Var3.e(hc01Var.ordinal()) ? 1048576 : 524288) | (x340Var3.g(wuxVar) ? 8388608 : 4194304) | (x340Var3.i(function0) ? 67108864 : 33554432) | (x340Var3.g(z680Var) ? 536870912 : 268435456);
        int i8 = (x340Var3.e(i3) ? (char) 4 : (char) 2) | (x340Var3.g(list) ? ' ' : (char) 16) | 384;
        if (x340Var3.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var3);
            wat watVar2 = (wat) x340Var3.k(t4k.h);
            int i9 = i7 & 14;
            boolean zG = ((i7 & 7168) == 2048) | (i9 == 4) | ((i7 & 896) == 256) | x340Var3.g(lee1Var) | ((57344 & i7) == 16384) | x340Var3.g(watVar2);
            Object objT = x340Var3.T();
            if (zG || objT == m4cVar2) {
                zma1 zma1Var = lee1Var.a;
                af5 af5VarK = k(str, lee1Var, i);
                if (str.length() != 0 && i2 > 0) {
                    z2 = false;
                    wat watVar3 = watVar2;
                    i5 = i9;
                    m4cVar = m4cVar2;
                    es41Var = es41VarC;
                    boolean z3 = true;
                    y9e1 y9e1VarB = yae1.b(yae1Var, af5VarK, lee1Var, 0, false, 0, jjl.b(0, i2, 0, Integer.MAX_VALUE, 5), (flb0) null, (wat) null, (f930) null, 1980);
                    lee1Var2 = lee1Var;
                    zrm0 zrm0Var = y9e1VarB.b;
                    int i10 = zrm0Var.f;
                    float fC = (TextUnit.e(zma1Var.h) ? TextUnit.c(zma1Var.h) : 0.0f) + (i < 0 ? 0 : i);
                    ye5 ye5Var = new ye5();
                    ye5Var.h(af5VarK);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((i11 != i10 - 1 || z) && str.charAt(zrm0Var.c(i11, false) - 1) != '\n') {
                            tr80 tr80VarQ = yoi1.Q(y9e1VarB.i(i11), zrm0Var.c(i11, z3));
                            ArrayList arrayList = new ArrayList();
                            lr80 it = tr80VarQ.iterator();
                            while (((sr80) it).c) {
                                Object next = it.next();
                                if (str.charAt(((Number) next).intValue()) == ' ') {
                                    arrayList.add(next);
                                }
                            }
                            float fH = (i2 - 2.0f) - (y9e1VarB.h(i11) - y9e1VarB.g(i11));
                            if (arrayList.isEmpty() || fH <= 0.0f) {
                                watVar = watVar3;
                            } else {
                                watVar = watVar3;
                                zma1 zma1Var2 = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, fc11.Y(TextUnit.c(watVar.L(fH / arrayList.size())) + fC, 4294967296L), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65407);
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    int iIntValue = ((Number) it2.next()).intValue();
                                    ye5Var.d(zma1Var2, iIntValue, iIntValue + 1);
                                }
                            }
                        } else {
                            watVar = watVar3;
                        }
                        i11++;
                        watVar3 = watVar;
                        z3 = true;
                    }
                    watVar2 = watVar3;
                    objT = ye5Var.p();
                    x340Var2 = x340Var3;
                } else {
                    objT = af5VarK;
                    i5 = i9;
                    m4cVar = m4cVar2;
                    es41Var = es41VarC;
                    lee1Var2 = lee1Var;
                    x340Var2 = x340Var3;
                    z2 = false;
                }
                x340Var2.s0(objT);
            } else {
                i5 = i9;
                m4cVar = m4cVar2;
                es41Var = es41VarC;
                i7 = i7;
                lee1Var2 = lee1Var;
                x340Var2 = x340Var3;
                z2 = false;
            }
            af5 af5VarP = (af5) objT;
            int i12 = i5;
            boolean z4 = i12 == 4 ? true : z2;
            Object objT2 = x340Var2.T();
            m4c m4cVar3 = m4cVar;
            if (z4 || objT2 == m4cVar3) {
                objT2 = new cde1();
                x340Var2.s0(objT2);
            }
            cde1 cde1Var = (cde1) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar3) {
                objT3 = v8r.q(null);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar3) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT4);
            }
            tob1 tob1Var2 = (ven0) objT4;
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar3) {
                objT5 = v8r.q(null);
                x340Var2.s0(objT5);
            }
            ven0 ven0Var3 = (ven0) objT5;
            long j = a.a;
            boolean zG2 = ((i7 & 3670016) == 1048576) | x340Var2.g(lee1Var2);
            Object objT6 = x340Var2.T();
            if (zG2 || objT6 == m4cVar3) {
                objT6 = lee1Var2.e(new lee1(hc01Var.b, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214));
                x340Var2.s0(objT6);
            }
            lee1 lee1Var3 = (lee1) objT6;
            ss50 ss50Var = (ss50) x340Var2.k(t4k.l);
            vng vngVar = (vng) x340Var2.k(t4k.e);
            boolean zG3 = ((i8 & 112) == 32) | x340Var2.g(af5VarP);
            Object objT7 = x340Var2.T();
            if (zG3 || objT7 == m4cVar3) {
                if (list.isEmpty()) {
                    tob1Var = tob1Var2;
                } else {
                    ye5 ye5Var2 = new ye5();
                    ye5Var2.h(af5VarP);
                    String str2 = af5VarP.b;
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        r8e1 r8e1Var = (r8e1) it3.next();
                        tob1 tob1Var3 = tob1Var2;
                        int iP = yoi1.p(r8e1Var.a - i3, 0, str2.length());
                        int iP2 = yoi1.p(r8e1Var.b - i3, 0, str2.length());
                        if (iP < iP2) {
                            ye5Var2.d(new zma1(u7h.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), iP, iP2);
                        }
                        tob1Var2 = tob1Var3;
                    }
                    tob1Var = tob1Var2;
                    af5VarP = ye5Var2.p();
                }
                x340Var2.s0(af5VarP);
                objT7 = af5VarP;
            } else {
                tob1Var = tob1Var2;
            }
            af5 af5Var = (af5) objT7;
            boolean z5 = (cde1Var.b() && ((Boolean) tob1Var.getValue()).booleanValue()) || ((r8e1) ven0Var3.getValue()) != null;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            Object objT8 = x340Var2.T();
            if (objT8 == m4cVar3) {
                objT8 = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT8;
            int i13 = i7 & 234881024;
            boolean zI = x340Var2.i(cde1Var) | x340Var2.i(ven0Var3) | (i13 == 67108864);
            Object objT9 = x340Var2.T();
            if (zI || objT9 == m4cVar3) {
                objT9 = new d4v0(cde1Var, function0, ven0Var3, (byte) 13);
                x340Var2.s0(objT9);
            }
            es41 es41Var2 = es41Var;
            qim0 qim0VarY = uyn1.y(l6o1.H(i1p1.z(bin.v(qim0VarD, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT9, 28), es41Var2, wuxVar.b.c), es41Var2, false, 14), wuxVar.e.c, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z6 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            float fX0 = watVar2.X0(8.0f);
            float f = 2.5f * fX0;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var3);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            int i14 = i8 & 14;
            int i15 = i7 & 1879048192;
            boolean zI2 = x340Var2.i(cde1Var) | x340Var2.i(ven0Var3) | x340Var2.i(ven0Var2) | (i14 == 4) | (i15 == 536870912) | (i13 == 67108864);
            Object objT10 = x340Var2.T();
            if (zI2 || objT10 == m4cVar3) {
                nc01Var = new nc01(cde1Var, i3, z680Var, function0, ven0Var3, ven0Var2);
                ven0Var = ven0Var3;
                x340Var2.s0(nc01Var);
            } else {
                nc01Var = objT10;
                ven0Var = ven0Var3;
            }
            qim0 qim0VarB = f8d1.b(qim0Var3, list, (PointerInputEventHandler) nc01Var);
            y9e1 y9e1Var = (y9e1) ven0Var2.getValue();
            boolean zI3 = x340Var2.i(ven0Var) | x340Var2.i(tob1Var);
            Object objT11 = x340Var2.T();
            if (zI3 || objT11 == m4cVar3) {
                objT11 = new zqe(ven0Var, tob1Var, (byte) 9);
                x340Var2.s0(objT11);
            }
            Function0 function1 = (Function0) objT11;
            boolean zI4 = x340Var2.i(tob1Var);
            Object objT12 = x340Var2.T();
            if (zI4 || objT12 == m4cVar3) {
                objT12 = new g8y0(tob1Var, (byte) 4);
                x340Var2.s0(objT12);
            }
            Function0 function2 = (Function0) objT12;
            Object objT13 = x340Var2.T();
            if (objT13 == m4cVar3) {
                objT13 = oa01.Q0;
                x340Var2.s0(objT13);
            }
            iu30 iu30Var = (iu30) objT13;
            boolean zI5 = x340Var2.i(ss50Var);
            Object objT14 = x340Var2.T();
            if (zI5 || objT14 == m4cVar3) {
                objT14 = new vwz0(ss50Var, (byte) 6);
                x340Var2.s0(objT14);
            }
            ven0 ven0Var4 = ven0Var;
            qim0Var2 = qim0Var3;
            qim0 qim0VarB2 = f8d1.b(f8d1.b(exd0.s(qim0VarB, new zce1(y9e1Var, cde1Var, j, fX0, list, i3)), str, new ny81(y9e1Var, cde1Var, fX0, f, function1, function2, iu30Var, str, (byte) 1)), str, new bde1(y9e1Var, cde1Var, str, function1, (Function0) objT14, function2, iu30Var));
            boolean zI6 = x340Var2.i(ven0Var2);
            Object objT15 = x340Var2.T();
            if (zI6 || objT15 == m4cVar3) {
                objT15 = new r9y0(ven0Var2, (byte) 3);
                x340Var2.s0(objT15);
            }
            x340 x340Var4 = x340Var2;
            jch0.b(af5Var, qim0VarB2, lee1Var3, (iu30) objT15, 0, false, 0, 0, (Map) null, (x9h) null, (m0e1) null, x340Var4, 0, 2032);
            x340Var = x340Var4;
            y9e1 y9e1Var2 = (y9e1) ven0Var2.getValue();
            if (!z5 || y9e1Var2 == null) {
                x340Var.i0(1394249182);
                x340Var.r(false);
            } else {
                x340Var.i0(1392140748);
                r8e1 r8e1Var2 = (r8e1) ven0Var4.getValue();
                if (r8e1Var2 != null) {
                    iS = r8e1Var2.a - i3;
                    if (iS < 0) {
                        iS = 0;
                    }
                } else {
                    iS = cde1Var.a.s();
                }
                int i16 = iS;
                r8e1 r8e1Var3 = (r8e1) ven0Var4.getValue();
                if (r8e1Var3 != null) {
                    iS2 = r8e1Var3.b - i3;
                    int length = str.length();
                    if (iS2 > length) {
                        iS2 = length;
                    }
                } else {
                    iS2 = cde1Var.b.s();
                }
                int i17 = iS2;
                r8e1 r8e1Var4 = (r8e1) ven0Var4.getValue();
                id01 id01Var = r8e1Var4 != null ? r8e1Var4.c : null;
                boolean zI7 = x340Var.i(ven0Var4) | (i15 == 536870912) | x340Var.i(cde1Var) | (i14 == 4);
                Object objT16 = x340Var.T();
                if (zI7 || objT16 == m4cVar3) {
                    z680Var2 = z680Var;
                    i6 = 536870912;
                    fu fuVar = new fu(z680Var2, cde1Var, i3, ven0Var4, (byte) 14);
                    x340Var.s0(fuVar);
                    objT16 = fuVar;
                } else {
                    z680Var2 = z680Var;
                    i6 = 536870912;
                }
                iu30 iu30Var2 = (iu30) objT16;
                boolean zI8 = x340Var.i(ven0Var4) | (i15 == i6);
                Object objT17 = x340Var.T();
                if (zI8 || objT17 == m4cVar3) {
                    objT17 = new ft0(z680Var2, ven0Var4, (byte) 21);
                    x340Var.s0(objT17);
                }
                Function0 function3 = (Function0) objT17;
                Object objT18 = x340Var.T();
                if (objT18 == m4cVar3) {
                    objT18 = ijz0.t;
                    x340Var.s0(objT18);
                }
                Function0 function4 = (Function0) objT18;
                boolean zI9 = x340Var.i(ven0Var4) | (i14 == 4) | x340Var.i(cde1Var) | (i12 == 4) | x340Var.i(vngVar);
                Object objT19 = x340Var.T();
                if (zI9 || objT19 == m4cVar3) {
                    lzm lzmVar = new lzm(cde1Var, vngVar, str, ven0Var4, i3);
                    x340Var.s0(lzmVar);
                    objT19 = lzmVar;
                }
                Function0 function5 = (Function0) objT19;
                Object objT20 = x340Var.T();
                if (objT20 == m4cVar3) {
                    objT20 = ijz0.i;
                    x340Var.s0(objT20);
                }
                yy51.a(i16, i17, y9e1Var2, id01Var, iu30Var2, function3, function4, function5, (Function0) objT20, x340Var, 102236672);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oc01(str, lee1Var, i, i2, z, yae1Var, hc01Var, wuxVar, function0, z680Var, i3, list, qim0Var2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0293  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:176:0x0321 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0328  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:188:0x041f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0423  */
    /* JADX WARN: Code duplicated, block: B:191:0x0426  */
    /* JADX WARN: Code duplicated, block: B:192:0x0433  */
    /* JADX WARN: Code duplicated, block: B:196:0x0480  */
    /* JADX WARN: Code duplicated, block: B:197:0x0483  */
    /* JADX WARN: Code duplicated, block: B:200:0x0495 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:211:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:220:0x0512  */
    /* JADX WARN: Code duplicated, block: B:223:0x0533 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x0535  */
    /* JADX WARN: Code duplicated, block: B:227:0x0554 A[LOOP:0: B:225:0x054e->B:227:0x0554, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x05b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x05c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    public static final void d(sb01 sb01Var, ed01 ed01Var, hc01 hc01Var, FontFamily fontFamily, te01 te01Var, wux wuxVar, Function0 function0, vu30 vu30Var, vu30 vu30Var2, int i, Function0 function1, md01 md01Var, String str, qim0 qim0Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        b0k b0kVar2;
        int i6;
        b0k b0kVar3;
        wat watVar;
        int i7;
        wux wuxVar2;
        int i8;
        Object objT;
        wat watVar2;
        int iIntValue;
        boolean z;
        Object objT2;
        int iIntValue2;
        boolean zI;
        Object objT3;
        jkr0 jkr0VarB;
        boolean zI2;
        Object objT4;
        ven0 ven0VarS;
        boolean zI3;
        Object objT5;
        b0k b0kVar4;
        int i9;
        boolean z2;
        iac0 iac0Var;
        boolean z3;
        int i10;
        c9n c9nVar;
        ven0 ven0Var;
        bw91 bw91Var;
        int i11;
        b0k b0kVar5;
        err0 err0Var;
        tob1 tob1Var;
        ed01 ed01Var2;
        jkr0 jkr0Var;
        yae1 yae1Var;
        boolean zI4;
        Object objT6;
        Object obj;
        int i12;
        Object obj2;
        bw91 bw91Var2;
        int i13;
        Object sc01Var;
        boolean z4;
        boolean zI5;
        Object objT7;
        int i14;
        iac0 iac0Var2;
        int i15;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objT8;
        jkr0 jkr0Var2;
        Object objT9;
        boolean zG;
        ArrayList arrayList;
        Iterator it;
        ?? r8;
        Object obj3;
        c9n c9nVar2;
        lee1 lee1Var;
        int i16;
        boolean zI6;
        Object objT10;
        int i17;
        ven0 ven0Var2;
        yae1 yae1Var2;
        int i18;
        tob1 tob1Var2;
        Object obj4 = fkj0.X;
        b0k b0kVar6 = (x340) b0kVar;
        b0kVar6.k0(-474066977);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar6.i(sb01Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar6.i(ed01Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar6.e(hc01Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar6.i(fontFamily) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar6.i(te01Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= (i2 & 262144) == 0 ? b0kVar6.g(wuxVar) : b0kVar6.i(wuxVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= b0kVar6.i(function0) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar6.i(vu30Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= b0kVar6.i(vu30Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar6.e(i) ? 536870912 : 268435456;
        }
        int i19 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar6.i(function1) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? b0kVar6.g(md01Var) : b0kVar6.i(md01Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar6.g(str) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= b0kVar6.i(qim0Var) ? 2048 : 1024;
        }
        int i20 = i5;
        if (b0kVar6.Y(i19 & 1, ((i19 & 306783379) == 306783378 && (i20 & 1171) == 1170) ? false : true)) {
            wat watVar3 = (wat) b0kVar6.k(t4k.h);
            boolean zG2 = b0kVar6.g(fontFamily) | b0kVar6.g(te01Var);
            Object objT11 = b0kVar6.T();
            if (zG2 || objT11 == obj4) {
                te01Var.getClass();
                int[] iArr = se01.a;
                int i21 = te01Var.a;
                int i22 = iArr[i21];
                i6 = i20;
                b0kVar3 = b0kVar6;
                watVar = watVar3;
                i7 = 1;
                lee1 lee1Var2 = new lee1(0L, fc11.G(i22), (FontWeight) null, fontFamily, fc11.Y(se01.d[te01Var.d], 4294967296L), 0L, 0, 0, fc11.Y(i22 * (((te01Var.b - 2) * 0.15f) + se01.b[i21]), 4294967296L), se01.e, mhc0.b, 13500253);
                b0kVar3.s0(lee1Var2);
                objT11 = lee1Var2;
            } else {
                i6 = i20;
                watVar = watVar3;
                b0kVar3 = b0kVar6;
                i7 = 1;
            }
            lee1 lee1Var3 = (lee1) objT11;
            te01Var.getClass();
            int i23 = se01.c[te01Var.c];
            yae1 yae1VarQ = d5p1.q(0, b0kVar3, i7);
            Object objT12 = b0kVar3.T();
            if (objT12 == obj4) {
                objT12 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT12);
            }
            c9n c9nVar3 = (c9n) objT12;
            Object objT13 = b0kVar3.T();
            if (objT13 == obj4) {
                objT13 = v8r.p(sb01Var);
                b0kVar3.s0(objT13);
            }
            bw91 bw91Var3 = (bw91) objT13;
            Object objT14 = b0kVar3.T();
            if (objT14 == obj4) {
                objT14 = v8r.q(z6x.a);
                b0kVar3.s0(objT14);
            }
            tob1 tob1Var3 = (ven0) objT14;
            Object objT15 = b0kVar3.T();
            if (objT15 == obj4) {
                objT15 = p3d1.n(0L, b0kVar3);
            }
            ven0 ven0Var3 = (ven0) objT15;
            Object objT16 = b0kVar3.T();
            if (objT16 == obj4) {
                objT16 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT16);
            }
            ven0 ven0Var4 = (ven0) objT16;
            Object objT17 = b0kVar3.T();
            if (objT17 == obj4) {
                objT17 = bb00.h(0, b0kVar3);
            }
            err0 err0Var2 = (hdn0) objT17;
            int i24 = i19 & 458752;
            if (i24 != 131072) {
                if ((i19 & 262144) != 0) {
                    wuxVar2 = wuxVar;
                    if (b0kVar3.g(wuxVar2)) {
                    }
                    objT = b0kVar3.T();
                    if (i8 == 0 || objT == obj4) {
                        watVar2 = watVar;
                        objT = Integer.valueOf(watVar2.i0(wuxVar2.e.c * 2.0f));
                        b0kVar3.s0(objT);
                    } else {
                        watVar2 = watVar;
                    }
                    iIntValue = ((Number) objT).intValue();
                    if (i24 != 131072 || ((i19 & 262144) != 0 && b0kVar3.g(wuxVar2))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objT2 = b0kVar3.T();
                    if (z || objT2 == obj4) {
                        objT2 = Integer.valueOf(watVar2.i0(32.0f));
                        b0kVar3.s0(objT2);
                    }
                    iIntValue2 = ((Number) objT2).intValue();
                    zI = b0kVar3.i(tob1Var3) | b0kVar3.i(ven0Var4);
                    objT3 = b0kVar3.T();
                    if (zI || objT3 == obj4) {
                        objT3 = new zqe(tob1Var3, ven0Var4, (byte) 10);
                        b0kVar3.s0(objT3);
                    }
                    jkr0VarB = lkr0.b(0, (Function0) objT3, b0kVar3, 0, 3);
                    Integer numValueOf = Integer.valueOf(((List) tob1Var3.getValue()).size());
                    zI2 = b0kVar3.i(jkr0VarB) | b0kVar3.i(tob1Var3);
                    objT4 = b0kVar3.T();
                    if (zI2 || objT4 == obj4) {
                        objT4 = new pc01(jkr0VarB, tob1Var3, null, (byte) 0);
                        b0kVar3.s0(objT4);
                    }
                    qxd0.t(numValueOf, b0kVar3, (vu30) objT4);
                    ven0VarS = v8r.s(vu30Var2, b0kVar3);
                    zI3 = b0kVar3.i(jkr0VarB) | b0kVar3.i(tob1Var3) | b0kVar3.i(err0Var2) | b0kVar3.i(ven0VarS) | b0kVar3.i(bw91Var3) | b0kVar3.i(ven0Var4) | b0kVar3.i(c9nVar3) | b0kVar3.i(ed01Var) | b0kVar3.i(ven0Var3) | b0kVar3.i(yae1VarQ) | b0kVar3.e(iIntValue) | b0kVar3.e(iIntValue2) | b0kVar3.i(lee1Var3) | b0kVar3.e(i23);
                    objT5 = b0kVar3.T();
                    b0kVar4 = b0kVar3;
                    if (!zI3 || objT5 == obj4) {
                        i9 = i23;
                        z2 = true;
                        iac0Var = null;
                        z3 = false;
                        i10 = iIntValue2;
                        objT5 = new rc01(jkr0VarB, tob1Var3, err0Var2, ven0VarS, bw91Var3, c9nVar3, ven0Var4, ed01Var, yae1VarQ, iIntValue, i10, ven0Var3, lee1Var3, i9, null);
                        c9nVar = c9nVar3;
                        ven0Var = ven0Var3;
                        bw91Var = bw91Var3;
                        i11 = iIntValue;
                        lee1Var3 = lee1Var3;
                        b0kVar5 = b0kVar4;
                        err0Var = err0Var2;
                        tob1Var = tob1Var3;
                        ed01Var2 = ed01Var;
                        jkr0Var = jkr0VarB;
                        yae1Var = yae1VarQ;
                        b0kVar5.s0(objT5);
                    } else {
                        yae1Var = yae1VarQ;
                        i9 = i23;
                        ven0Var = ven0Var3;
                        b0kVar5 = b0kVar4;
                        z2 = true;
                        iac0Var = null;
                        z3 = false;
                        i11 = iIntValue;
                        ed01Var2 = ed01Var;
                        c9nVar = c9nVar3;
                        bw91Var = bw91Var3;
                        tob1Var = tob1Var3;
                        jkr0Var = jkr0VarB;
                        err0Var = err0Var2;
                        i10 = iIntValue2;
                    }
                    qxd0.t(jkr0Var, b0kVar5, (vu30) objT5);
                    zI4 = b0kVar5.i(ven0Var) | b0kVar5.i(yae1Var) | b0kVar5.i(bw91Var) | b0kVar5.e(i11) | b0kVar5.e(i10) | b0kVar5.i(tob1Var) | b0kVar5.i(ed01Var2) | b0kVar5.i(lee1Var3) | b0kVar5.e(i9);
                    objT6 = b0kVar5.T();
                    if (zI4) {
                        obj = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0433: MOVE (r31v4 'obj' java.lang.Object) = (r1v6 java.lang.Object) in method: p.zc01.d(p.sb01, p.ed01, p.hc01, androidx.compose.ui.text.font.FontFamily, p.te01, p.wux, kotlin.jvm.functions.Function0, p.vu30, p.vu30, int, kotlin.jvm.functions.Function0, p.md01, java.lang.String, p.qim0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v6 java.lang.Object
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1628
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.zc01.d(p.sb01, p.ed01, p.hc01, androidx.compose.ui.text.font.FontFamily, p.te01, p.wux, kotlin.jvm.functions.Function0, p.vu30, p.vu30, int, kotlin.jvm.functions.Function0, p.md01, java.lang.String, p.qim0, p.b0k, int, int):void");
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                    public static final Object e(yae1 yae1Var, bw91 bw91Var, int i, int i2, ed01 ed01Var, ven0 ven0Var, lee1 lee1Var, int i3, ven0 ven0Var2, onm onmVar) {
                        wc01 wc01Var;
                        ven0 ven0Var3;
                        String strConcat;
                        if (onmVar instanceof wc01) {
                            wc01Var = (wc01) onmVar;
                            int i4 = wc01Var.c;
                            if ((i4 & Integer.MIN_VALUE) != 0) {
                                wc01Var.c = i4 - Integer.MIN_VALUE;
                            } else {
                                wc01Var = new wc01(onmVar);
                            }
                        } else {
                            wc01Var = new wc01(onmVar);
                        }
                        Object objY = wc01Var.b;
                        int i5 = wc01Var.c;
                        rih1 rih1Var = rih1.a;
                        if (i5 == 0) {
                            hm5.M(objY);
                            if (((int) (((yr80) ven0Var.getValue()).a >> 32)) > 0 && ((int) (((yr80) ven0Var.getValue()).a & 4294967295L)) > 0) {
                                utw0 utw0Var = new utw0(yae1Var);
                                ArrayList arrayList = new ArrayList();
                                ek60 ek60VarListIterator = bw91Var.listIterator();
                                while (true) {
                                    ek60 ek60Var = ek60VarListIterator;
                                    if (!ek60Var.hasNext()) {
                                        break;
                                    }
                                    ArrayList arrayList2 = ((sb01) ek60Var.next()).c;
                                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        flb flbVar = ((rf51) it.next()).b;
                                        if (flbVar instanceof qde1) {
                                            strConcat = ((qde1) flbVar).a;
                                        } else if (flbVar instanceof ihe) {
                                            strConcat = ((ihe) flbVar).a.concat("\n\n");
                                        } else {
                                            strConcat = flbVar instanceof por0 ? "\n\n" : "";
                                        }
                                        arrayList3.add(strConcat);
                                    }
                                    r7h.W(arrayList3, arrayList);
                                }
                                String strY0 = o7h.y0(arrayList, "", (String) null, (String) null, (iu30) null, 62);
                                int i6 = ((int) (((yr80) ven0Var.getValue()).a >> 32)) - i;
                                int i7 = ((int) (((yr80) ven0Var.getValue()).a & 4294967295L)) - i2;
                                q8n q8nVar = ed01Var.d;
                                xc01 xc01Var = new xc01(utw0Var, strY0, lee1Var, i6, i7, i3, null);
                                wc01Var.a = ven0Var2;
                                wc01Var.c = 1;
                                objY = fn31.Y(q8nVar, xc01Var, wc01Var);
                                d9n d9nVar = d9n.a;
                                if (objY == d9nVar) {
                                    return d9nVar;
                                }
                                ven0Var3 = ven0Var2;
                            }
                            return rih1Var;
                        }
                        if (i5 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ven0Var3 = wc01Var.a;
                        hm5.M(objY);
                        ven0Var3.setValue((List) objY);
                        return rih1Var;
                    }

                    public static final void f(sb01 sb01Var, Function0 function0, hc01 hc01Var, wux wuxVar, int i, int i2, qim0 qim0Var, b0k b0kVar, int i3) {
                        cvx cvxVar = wuxVar.b;
                        b0k b0kVar2 = (x340) b0kVar;
                        b0kVar2.k0(720278654);
                        j06 j06Var = ((x340) b0kVar2).a;
                        int i4 = i3 | (b0kVar2.i(sb01Var) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | (b0kVar2.e(hc01Var.ordinal()) ? 256 : 128) | (b0kVar2.g(wuxVar) ? 2048 : 1024) | (b0kVar2.e(i) ? 16384 : 8192) | (b0kVar2.e(i2) ? 131072 : 65536) | (b0kVar2.i(qim0Var) ? 1048576 : 524288);
                        if (b0kVar2.Y(i4 & 1, (599187 & i4) != 599186)) {
                            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                            float f = wuxVar.e.b;
                            qim0 qim0VarN = anm1.N("ereader_top_bar", uyn1.B(qim0VarF, f, 8.0f, f, 0.0f, 8));
                            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
                            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                            xos0 xos0VarM = b0kVar2.m();
                            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
                            hzj.A.getClass();
                            if (j06Var == null) {
                                tgp1.p();
                                throw null;
                            }
                            b0kVar2.m0();
                            boolean z = ((x340) b0kVar2).S;
                            n4k n4kVar = hmb0.t1;
                            if (z) {
                                b0kVar2.l(n4kVar);
                            } else {
                                b0kVar2.v0();
                            }
                            llj lljVar = y580.O0;
                            nko1.H(jw31VarA, b0kVar2, lljVar);
                            llj lljVar2 = y580.N0;
                            nko1.H(xos0VarM, b0kVar2, lljVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            llj lljVar3 = y580.R0;
                            nko1.H(numValueOf, b0kVar2, lljVar3);
                            nko1.F(b0kVar2);
                            llj lljVar4 = y580.Y;
                            nko1.H(qim0VarE, b0kVar2, lljVar4);
                            boolean z2 = (i4 & 112) == 32;
                            Object objT = b0kVar2.T();
                            if (z2 || objT == fkj0.X) {
                                objT = new lpx0(function0, (byte) 21);
                                b0kVar2.s0(objT);
                            }
                            wro1.h(new gbx(new y50("Close"), (Function0) objT), ldx.c, anm1.N("ereader_close_button", nim0.a), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(375866169, new fc3(hc01Var, (byte) 20), b0kVar2), b0kVar2, 0, 6, 1016);
                            b0kVar2 = b0kVar2;
                            qim0 qim0VarN2 = anm1.N("ereader_title", uyn1.B(new wnb0(1.0f, true), 0.0f, 0.0f, cvxVar.e, 0.0f, 11));
                            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
                            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                            xos0 xos0VarM2 = b0kVar2.m();
                            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarN2);
                            b0kVar2.m0();
                            if (((x340) b0kVar2).S) {
                                b0kVar2.l(n4kVar);
                            } else {
                                b0kVar2.v0();
                            }
                            nko1.H(mbhVarA, b0kVar2, lljVar);
                            nko1.H(xos0VarM2, b0kVar2, lljVar2);
                            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                            nko1.H(qim0VarE2, b0kVar2, lljVar4);
                            int i5 = i4 >> 6;
                            g(sb01Var, hc01Var, i, i2, b0kVar2, (i4 & 14) | ((i4 >> 3) & 112) | (i5 & 896) | (i5 & 7168));
                            b0kVar2.r(true);
                            b0kVar2.r(true);
                        } else {
                            b0kVar2.b0();
                        }
                        h311 h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new bxy(sb01Var, function0, hc01Var, wuxVar, i, i2, qim0Var, i3);
                        }
                    }

                    public static final void g(sb01 sb01Var, hc01 hc01Var, int i, int i2, b0k b0kVar, int i3) {
                        int i4;
                        x340 x340Var;
                        x340 x340Var2 = (x340) b0kVar;
                        x340Var2.k0(-1608769992);
                        if ((i3 & 6) == 0) {
                            i4 = (x340Var2.i(sb01Var) ? 4 : 2) | i3;
                        } else {
                            i4 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i4 |= x340Var2.e(hc01Var.ordinal()) ? 32 : 16;
                        }
                        if ((i3 & 384) == 0) {
                            i4 |= x340Var2.e(i) ? 256 : 128;
                        }
                        if ((i3 & 3072) == 0) {
                            i4 |= x340Var2.e(i2) ? 2048 : 1024;
                        }
                        if (x340Var2.Y(i4 & 1, (i4 & 1171) != 1170)) {
                            String str = sb01Var.g;
                            uwr uwrVar = cbx.a;
                            uwo1.e(str, (qim0) null, cbx.d(x340Var2).k, hc01Var.b, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1762);
                            int i5 = i2 > 0 ? ((i + 1) * 100) / i2 : 0;
                            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                            int iHashCode = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM = x340Var2.m();
                            qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
                            hzj.A.getClass();
                            if (x340Var2.a == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var2.m0();
                            if (x340Var2.S) {
                                x340Var2.l(hmb0.t1);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(jw31VarA, x340Var2, y580.O0);
                            nko1.H(xos0VarM, x340Var2, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                            nko1.F(x340Var2);
                            nko1.H(qim0VarE, x340Var2, y580.Y);
                            uwo1.e(sb01Var.h, new wnb0(1.0f, false), cbx.d(x340Var2).j, hc01Var.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                            uwo1.e(l1d.m(" • ", cwl1.n0(2131955651, new Object[]{Integer.valueOf(i5)}, x340Var2)), (qim0) null, cbx.d(x340Var2).j, hc01Var.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1778);
                            x340Var = x340Var2;
                            x340Var.r(true);
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new h0a0(sb01Var, hc01Var, i, i2, i3);
                        }
                    }

                    public static final void h(boolean z, b0k b0kVar, int i) {
                        m4c m4cVar = fkj0.X;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1909448687);
                        int i2 = (x340Var.h(z) ? 4 : 2) | i;
                        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                            Object objK = x340Var.k(AndroidCompositionLocals_androidKt.b);
                            Activity activity = objK instanceof Activity ? (Activity) objK : null;
                            Boolean boolValueOf = Boolean.valueOf(z);
                            boolean zI = x340Var.i(activity) | ((i2 & 14) == 4);
                            Object objT = x340Var.T();
                            if (zI || objT == m4cVar) {
                                objT = new wmf0(activity, z, (lnm) null);
                                x340Var.s0(objT);
                            }
                            qxd0.t(boolValueOf, x340Var, (vu30) objT);
                            boolean zI2 = x340Var.i(activity);
                            Object objT2 = x340Var.T();
                            if (zI2 || objT2 == m4cVar) {
                                objT2 = new nt9(activity, (byte) 2);
                                x340Var.s0(objT2);
                            }
                            qxd0.i(rih1.a, (iu30) objT2, x340Var);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new k750((byte) 26, i, z);
                        }
                    }

                    public static final void i(ven0 ven0Var) {
                        ven0Var.setValue((Object) null);
                    }

                    public static final r8e1 j(ven0 ven0Var) {
                        return (r8e1) ven0Var.getValue();
                    }

                    public static final af5 k(String str, lee1 lee1Var, int i) {
                        zma1 zma1Var = lee1Var.a;
                        if (i <= 0) {
                            return new af5(str);
                        }
                        long jY = fc11.Y((TextUnit.e(zma1Var.h) ? TextUnit.c(zma1Var.h) : 0.0f) + i, 4294967296L);
                        StringBuilder sb = new StringBuilder(16);
                        ArrayList arrayListM = xvj1.m();
                        new ArrayList();
                        sb.append(str);
                        char c = ' ';
                        int iG = 0;
                        int iV0 = ihc1.v0(str, ' ', 0, 6);
                        while (iV0 >= 0) {
                            char c2 = c;
                            int i2 = iV0;
                            int i3 = i2 + 1;
                            arrayListM.add(new xe5(i2, i3, 8, new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jY, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65407), (String) null));
                            c = c2;
                            iV0 = ihc1.v0(str, c2, i3, 4);
                            iG = iG;
                        }
                        String string = sb.toString();
                        ArrayList arrayList = new ArrayList(arrayListM.size());
                        int size = arrayListM.size();
                        while (iG < size) {
                            iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1);
                        }
                        return new af5(string, arrayList);
                    }
                }
