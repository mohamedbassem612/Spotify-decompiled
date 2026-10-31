package p;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Intent;
import android.icu.text.DateFormatSymbols;
import android.os.Bundle;
import android.os.ParcelUuid;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.common.ParserException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class j82 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static b180 b;
    public static b180 c;

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    public static final i0d A(zft zftVar, boolean z, Field field) {
        tdy0 tdy0VarZ = zftVar.z().z();
        n9r n9rVarK = tdy0VarZ.k();
        if (iht.k(n9rVarK)) {
            n9r n9rVarK2 = n9rVarK.k();
            if ((iht.l(n9rVarK2, 2) || iht.l(n9rVarK2, 5)) && (!(tdy0VarZ instanceof hit) || !fka0.e(((hit) tdy0VarZ).b1))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (zftVar.z().z().getAnnotations().d0(bpi1.a)) {
                        if (z) {
                        }
                    }
                    if (z) {
                        if (fc11.N(zftVar)) {
                        }
                    }
                    if (fc11.N(zftVar)) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (zftVar.z().z().getAnnotations().d0(bpi1.a)) {
                return z ? new yzc(field, false, (byte) 2) : new c0d(field, B(zftVar), false, (byte) 2);
            }
            if (z) {
                return fc11.N(zftVar) ? new xzc(field, false) : new yzc(field, true, (byte) 1);
            }
            return fc11.N(zftVar) ? new b0d(field, B(zftVar), false) : new c0d(field, B(zftVar), true, (byte) 1);
        }
        if (z) {
            return fc11.N(zftVar) ? new wzc(field, G(zftVar)) : new yzc(field, true, (byte) 0);
        }
        return fc11.N(zftVar) ? new a0d(field, B(zftVar), G(zftVar)) : new c0d(field, B(zftVar), true, (byte) 0);
    }

    public static final boolean B(zft zftVar) {
        return !o1h1.e(zftVar.z().z().getType());
    }

    public static final cen0 C() {
        return new cen0(true);
    }

    public static final cen0 D(nnv0... nnv0VarArr) {
        cen0 cen0Var = new cen0(false);
        nnv0[] nnv0VarArr2 = (nnv0[]) Arrays.copyOf(nnv0VarArr, nnv0VarArr.length);
        if (cen0Var.b.get()) {
            eg.m("Do mutate preferences once returned to DataStore.");
            return null;
        }
        if (nnv0VarArr2.length <= 0) {
            return cen0Var;
        }
        nnv0 nnv0Var = nnv0VarArr2[0];
        throw null;
    }

    public static final Bundle E(Intent intent, String str, String str2) {
        Bundle bundleG = pzm.g("resolved_from_short_link", true);
        if (str != null) {
            bundleG.putString("short_link", str);
            bundleG.putString("shortlink_source", str2);
        }
        String stringExtra = intent.getStringExtra("extra_deeplink_navigation_reference");
        if (stringExtra != null) {
            bundleG.putString("extra_deeplink_navigation_reference", stringExtra);
        }
        return bundleG;
    }

    public static void F(int i, izr0 izr0Var) {
        izr0Var.O(7);
        byte[] bArr = izr0Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static final Object G(zft zftVar) {
        return fc11.A(zftVar.z());
    }

    public static tdl0 H() {
        return new tdl0((byte) 28);
    }

    public static mya I(ScanResult scanResult, boolean z) {
        Integer numC0;
        int iIntValue;
        byte[] manufacturerSpecificData;
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord != null) {
            byte[] serviceData = scanRecord.getServiceData(new ParcelUuid(tgl.a));
            if (serviceData != null) {
                Map map = lya.a;
                Integer numValueOf = serviceData.length != 2 ? null : Integer.valueOf(((serviceData[1] & 255) << 8) | (serviceData[0] & 255));
                if (numValueOf != null) {
                    return new mya(numValueOf.intValue(), 1);
                }
            }
            Map map2 = lya.a;
            String deviceName = scanRecord.getDeviceName();
            if (deviceName == null || (numC0 = nhc1.c0(deviceName)) == null || (iIntValue = numC0.intValue()) < 0 || iIntValue > 65535) {
                numC0 = null;
            }
            if (numC0 != null) {
                return new mya(numC0.intValue(), 2);
            }
            if (z && (manufacturerSpecificData = scanRecord.getManufacturerSpecificData(76)) != null && manufacturerSpecificData.length >= 17 && (manufacturerSpecificData[manufacturerSpecificData.length - 4] & 128) != 0) {
                return new mya(0, 3);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static xa J(bae baeVar) {
        int i;
        int i2;
        int iG = baeVar.g(16);
        int iG2 = baeVar.g(16);
        if (iG2 == 65535) {
            iG2 = baeVar.g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iG2 + i;
        if (iG == 44097) {
            i3 += 2;
        }
        if (baeVar.g(2) == 3) {
            do {
                baeVar.g(2);
            } while (baeVar.f());
        }
        int iG3 = baeVar.g(10);
        if (baeVar.f() && baeVar.g(3) > 0) {
            baeVar.o(2);
        }
        int i4 = baeVar.f() ? 48000 : 44100;
        int iG4 = baeVar.g(4);
        int[] iArr = a;
        if (i4 == 44100 && iG4 == 13) {
            i2 = iArr[iG4];
        } else if (i4 != 48000 || iG4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iG4];
            int i6 = iG3 % 5;
            if (i6 == 1) {
                if (iG4 != 3 || iG4 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iG4 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iG4 == 3 || iG4 == 8 || iG4 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iG4 == 8 || iG4 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new xa(i4, i3, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void K(bae baeVar, wa waVar) throws ParserException {
        int iG = baeVar.g(5);
        baeVar.o(2);
        if (baeVar.f()) {
            baeVar.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            baeVar.n();
        }
        if (baeVar.f()) {
            int iG2 = baeVar.g(3);
            if (waVar.a == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                waVar.a = iG;
            }
            if (baeVar.f()) {
                M(baeVar);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void L(bae baeVar, wa waVar) throws ParserException {
        baeVar.o(2);
        boolean zF = baeVar.f();
        int iG = baeVar.g(8);
        for (int i = 0; i < iG; i++) {
            baeVar.o(2);
            if (baeVar.f()) {
                baeVar.o(5);
            }
            if (zF) {
                baeVar.o(24);
            } else {
                if (baeVar.f()) {
                    if (!baeVar.f()) {
                        baeVar.o(4);
                    }
                    waVar.b = baeVar.g(6) + 1;
                }
                baeVar.o(4);
            }
        }
        if (baeVar.f()) {
            baeVar.o(3);
            if (baeVar.f()) {
                M(baeVar);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void M(bae baeVar) throws ParserException {
        int iG = baeVar.g(6);
        if (iG < 2 || iG > 42) {
            throw ParserException.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        baeVar.o(iG * 8);
    }

    /* JADX WARN: Code duplicated, block: B:142:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x0424  */
    /* JADX WARN: Code duplicated, block: B:150:0x0428  */
    /* JADX WARN: Code duplicated, block: B:153:0x0439  */
    /* JADX WARN: Code duplicated, block: B:155:0x0453  */
    /* JADX WARN: Code duplicated, block: B:158:0x0472  */
    /* JADX WARN: Code duplicated, block: B:159:0x0474  */
    /* JADX WARN: Code duplicated, block: B:165:0x0484  */
    /* JADX WARN: Code duplicated, block: B:168:0x0498  */
    /* JADX WARN: Code duplicated, block: B:170:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:171:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:175:0x04db  */
    /* JADX WARN: Code duplicated, block: B:178:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:183:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:186:0x051d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0228  */
    /* JADX WARN: Code duplicated, block: B:77:0x022a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0233  */
    /* JADX WARN: Code duplicated, block: B:84:0x025b  */
    /* JADX WARN: Code duplicated, block: B:85:0x025d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0266  */
    /* JADX WARN: Code duplicated, block: B:92:0x02be  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:98:0x0314  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v28, types: [int] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v49 */
    public static final void a(zg2 zg2Var, iu30 iu30Var, qim0 qim0Var, Function0 function0, Function0 function1, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function2;
        int i4;
        x340 x340Var;
        qim0 qim0Var2;
        Function0 function3;
        Function0 function4;
        Function0 function5;
        m4c m4cVar;
        iu30 iu30Var2;
        Object obj;
        boolean z;
        Object obj2;
        boolean z2;
        Object obj3;
        x340 x340Var2;
        vu30 vu30Var;
        llj lljVar;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String strK;
        boolean z7;
        ?? r8;
        boolean z8;
        hax haxVar;
        hax haxVar2;
        boolean z9;
        idx idxVar;
        String strO0;
        boolean z10;
        Object obj4;
        Function0 function6;
        x340 x340Var3;
        boolean z11;
        Object obj5;
        boolean z12;
        Object obj6;
        Object obj7;
        Object obj8;
        zg2 zg2Var2 = zg2Var;
        iu30 iu30Var3 = iu30Var;
        m4c m4cVar2 = fkj0.X;
        yg2 yg2Var = zg2Var2.d;
        boolean z13 = zg2Var2.f;
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.k0(-1486761759);
        j06 j06Var = x340Var4.a;
        int i6 = i | (x340Var4.g(zg2Var2) ? 4 : 2);
        if ((i & 48) == 0) {
            i6 |= x340Var4.i(iu30Var3) ? 32 : 16;
        }
        int i7 = i6 | 384;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 = i6 | 3456;
        } else {
            i3 = i7 | (x340Var4.i(function0) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i4 = i3 | 24576;
            function2 = function1;
        } else {
            function2 = function1;
            i4 = i3 | (x340Var4.i(function2) ? 16384 : 8192);
        }
        if (x340Var4.Y(i4 & 1, (i4 & 9363) != 9362)) {
            if (i8 != 0) {
                Object objT = x340Var4.T();
                if (objT == m4cVar2) {
                    obj8 = objT;
                    ou1 ou1Var = ou1.i;
                    x340Var4.s0(ou1Var);
                    obj8 = ou1Var;
                }
                obj8 = objT;
                function4 = (Function0) obj8;
            } else {
                function4 = function0;
            }
            if (i9 != 0) {
                Object objT2 = x340Var4.T();
                if (objT2 == m4cVar2) {
                    obj7 = objT2;
                    ou1 ou1Var2 = ou1.t;
                    x340Var4.s0(ou1Var2);
                    obj7 = ou1Var2;
                }
                obj7 = objT2;
                function5 = (Function0) obj7;
            } else {
                function5 = function2;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarY = uyn1.y(qim0Var3, 24.0f, 32.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
            int iHashCode = Long.hashCode(x340Var4.T);
            xos0 xos0VarM = x340Var4.m();
            qim0 qim0VarE = zr7.E(x340Var4, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var4.m0();
            boolean z14 = x340Var4.S;
            int i10 = i4;
            n4k n4kVar = hmb0.t1;
            if (z14) {
                x340Var4.l(n4kVar);
            } else {
                x340Var4.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(mbhVarA, x340Var4, lljVar2);
            llj lljVar3 = y580.N0;
            nko1.H(xos0VarM, x340Var4, lljVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var4, lljVar4);
            nko1.F(x340Var4);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var4, vu30Var2);
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var4, 0);
            int iHashCode2 = Long.hashCode(x340Var4.T);
            xos0 xos0VarM2 = x340Var4.m();
            qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarF);
            x340Var4.m0();
            if (x340Var4.S) {
                x340Var4.l(n4kVar);
            } else {
                x340Var4.v0();
            }
            nko1.H(jw31VarA, x340Var4, lljVar2);
            nko1.H(xos0VarM2, x340Var4, lljVar3);
            x0d.q(iHashCode2, x340Var4, lljVar4, x340Var4);
            nko1.H(qim0VarE2, x340Var4, vu30Var2);
            String strO1 = cwl1.o0(x340Var4, 2131962493);
            uwr uwrVar = cbx.a;
            uwo1.e(strO1, (qim0) null, cbx.d(x340Var4).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2042);
            x340Var4.r(true);
            op71.g(x340Var4, u291.h(qim0Var3, 8.0f));
            qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), 56.0f);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var4, 0);
            int iHashCode3 = Long.hashCode(x340Var4.T);
            xos0 xos0VarM3 = x340Var4.m();
            qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarH);
            x340Var4.m0();
            if (x340Var4.S) {
                x340Var4.l(n4kVar);
            } else {
                x340Var4.v0();
            }
            nko1.H(jw31VarA2, x340Var4, lljVar2);
            nko1.H(xos0VarM3, x340Var4, lljVar3);
            x0d.q(iHashCode3, x340Var4, lljVar4, x340Var4);
            nko1.H(qim0VarE3, x340Var4, vu30Var2);
            String str = zg2Var.a;
            int i11 = i10 & 112;
            boolean z15 = i11 == 32;
            Object objT3 = x340Var4.T();
            if (z15) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT3 != m4cVar) {
                    iu30Var2 = iu30Var;
                    obj = objT3;
                }
                iu30 iu30Var4 = (iu30) obj;
                boolean zB = zg2Var.b();
                boolean z16 = zg2Var.f;
                pw31 pw31Var = pw31.a;
                m4c m4cVar3 = m4cVar;
                d(0, str, x340Var4, iu30Var4, uyn1.x(pw31Var.a(1.0f, qim0Var3, true), 2.0f), zB, z16);
                tg2 tg2Var = zg2Var.b;
                if (i11 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                Object objT4 = x340Var4.T();
                obj2 = objT4;
                if (z || objT4 == m4cVar3) {
                    ib2 ib2Var = new ib2(iu30Var2, (byte) 6);
                    x340Var4.s0(ib2Var);
                    obj2 = ib2Var;
                }
                l(tg2Var, (iu30) obj2, zg2Var.b(), zg2Var.f, uyn1.x(pw31Var.a(2.0f, qim0Var3, true), 2.0f), x340Var4, 0);
                String str2 = zg2Var.c;
                if (i11 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objT5 = x340Var4.T();
                obj3 = objT5;
                if (z2 || objT5 == m4cVar3) {
                    ib2 ib2Var2 = new ib2(iu30Var2, (byte) 7);
                    x340Var4.s0(ib2Var2);
                    obj3 = ib2Var2;
                }
                x(0, str2, x340Var4, (iu30) obj3, uyn1.x(pw31Var.a(1.0f, qim0Var3, true), 2.0f), zg2Var.b(), zg2Var.f);
                x340Var2 = x340Var4;
                x340Var2.r(true);
                op71.g(x340Var2, u291.h(qim0Var3, 8.0f));
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarF2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar2);
                nko1.H(xos0VarM4, x340Var2, lljVar3);
                x0d.q(iHashCode4, x340Var2, lljVar4, x340Var2);
                nko1.H(qim0VarE4, x340Var2, vu30Var2);
                if (z13) {
                    x340Var2.i0(392483399);
                    i5 = i11;
                    vu30Var = vu30Var2;
                    lljVar = lljVar4;
                    xto1.e(h2c.a.a(uyn1.x(qim0Var3, 4.0f), een.h), 3, 0L, 0L, x340Var2, 48, 12);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                    r8 = 0;
                } else {
                    vu30Var = vu30Var2;
                    lljVar = lljVar4;
                    i5 = i11;
                    x340Var2.i0(392679784);
                    z3 = yg2Var instanceof vg2;
                    if (!z3 || ((z5 = yg2Var instanceof xg2))) {
                        z4 = false;
                        x340Var2.i0(393860605);
                        x340Var2.r(false);
                    } else {
                        boolean z17 = yg2Var instanceof ug2;
                        if (!z17) {
                            if (!(yg2Var instanceof wg2)) {
                                eg.o();
                                return;
                            } else if (((wg2) yg2Var).a instanceof xb90) {
                                z4 = false;
                                x340Var2.i0(393860605);
                                x340Var2.r(false);
                            }
                        }
                        x340Var2.i0(392721820);
                        if (z17) {
                            x340Var2.i0(289767889);
                            strK = cwl1.o0(x340Var2, ((ug2) yg2Var).a);
                            x340Var2.r(false);
                            z6 = false;
                        } else if (yg2Var instanceof wg2) {
                            x340Var2.i0(393022768);
                            zb90 zb90Var = ((wg2) yg2Var).a;
                            if (zb90Var instanceof ub90) {
                                z7 = false;
                                strK = x0d.k(x340Var2, 289774806, 2131962490, x340Var2, false);
                            } else {
                                z7 = false;
                                z7 = false;
                                z7 = false;
                                z7 = false;
                                if (zb90Var instanceof yb90) {
                                    strK = x0d.k(x340Var2, 289777976, 2131962509, x340Var2, false);
                                } else if (zb90Var instanceof wb90) {
                                    strK = x0d.k(x340Var2, 289782068, 2131962519, x340Var2, false);
                                } else if (zb90Var instanceof vb90) {
                                    strK = x0d.k(x340Var2, 289786070, 2131962490, x340Var2, false);
                                } else {
                                    if (!(zb90Var instanceof xb90)) {
                                        throw p3d1.k(x340Var2, 289772818, false);
                                    }
                                    strK = x0d.k(x340Var2, 289789912, 2131962509, x340Var2, false);
                                }
                            }
                            x340Var2.r(z7);
                            z6 = z7;
                        } else {
                            z6 = false;
                            if (!z3 && !z5) {
                                throw p3d1.k(x340Var2, 289764309, false);
                            }
                            x340Var2.i0(393742617);
                            x340Var2.r(false);
                            strK = "";
                        }
                        rzn1.j(z6 ? 1 : 0, strK, x340Var2, u291.f(qim0Var3, 1.0f));
                        x340Var2.r(z6);
                        z4 = z6;
                    }
                    x340Var2.r(z4);
                    r8 = z4;
                }
                x340Var2.r(true);
                op71.g(x340Var2, u291.h(qim0Var3, 36.0f));
                qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                jw31 jw31VarA3 = ew31.a(h36.e, een.Z, x340Var2, (int) r8);
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarF3);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA3, x340Var2, lljVar2);
                nko1.H(xos0VarM5, x340Var2, lljVar3);
                x0d.q(iHashCode5, x340Var2, lljVar, x340Var2);
                nko1.H(qim0VarE5, x340Var2, vu30Var);
                if (z13) {
                    x340Var2.i0(1792135673);
                    haxVar = new hax(cwl1.o0(x340Var2, 2131962484));
                    z8 = false;
                    x340Var2.r(false);
                } else {
                    z8 = false;
                    x340Var2.i0(1792138435);
                    x340Var2.r(false);
                    haxVar = jax.a;
                }
                haxVar2 = haxVar;
                z9 = z8;
                idxVar = new idx(8);
                strO0 = cwl1.o0(x340Var2, 2131962483);
                if (i5 == 32) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                Object objT6 = x340Var2.T();
                if (!z10 || objT6 == m4cVar3) {
                    k52 k52Var = new k52(iu30Var, (byte) 19);
                    x340Var2.s0(k52Var);
                    obj4 = k52Var;
                } else {
                    obj4 = objT6;
                }
                function6 = (Function0) obj4;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                x340Var3 = x340Var2;
                iu30Var3 = iu30Var;
                foo1.c(new gbx(new y50(strO0), function6), idxVar, (qim0) null, haxVar2, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, k5i.a, x340Var3, 0, 48, 2028);
                x340Var3.r(true);
                x340Var3.r(true);
                zg2Var2 = zg2Var;
                int i12 = zg2Var2.g;
                boolean z18 = zg2Var2.e;
                if (i5 == 32) {
                    z11 = true;
                } else {
                    z11 = z9;
                }
                Object objT7 = x340Var3.T();
                obj5 = objT7;
                if (z11 || objT7 == m4cVar3) {
                    k52 k52Var2 = new k52(iu30Var3, (byte) 20);
                    x340Var3.s0(k52Var2);
                    obj5 = k52Var2;
                }
                Function0 function7 = (Function0) obj5;
                if (i5 == 32) {
                    z12 = true;
                } else {
                    z12 = z9;
                }
                Object objT8 = x340Var3.T();
                obj6 = objT8;
                if (z12 || objT8 == m4cVar3) {
                    k52 k52Var3 = new k52(iu30Var3, (byte) 21);
                    x340Var3.s0(k52Var3);
                    obj6 = k52Var3;
                }
                Function0 function8 = function4;
                Function0 function9 = function5;
                exd0.b(i12, z18, function7, (Function0) obj6, function8, function9, (i3u) null, x340Var3, (i10 << 3) & 516096);
                function2 = function9;
                x340Var = x340Var3;
                qim0Var2 = qim0Var3;
                function3 = function8;
            }
            iu30Var2 = iu30Var;
            ib2 ib2Var3 = new ib2(iu30Var2, (byte) 5);
            x340Var4.s0(ib2Var3);
            obj = ib2Var3;
            iu30 iu30Var5 = (iu30) obj;
            boolean zB2 = zg2Var.b();
            boolean z19 = zg2Var.f;
            pw31 pw31Var2 = pw31.a;
            m4c m4cVar4 = m4cVar;
            d(0, str, x340Var4, iu30Var5, uyn1.x(pw31Var2.a(1.0f, qim0Var3, true), 2.0f), zB2, z19);
            tg2 tg2Var2 = zg2Var.b;
            if (i11 == 32) {
                z = true;
            } else {
                z = false;
            }
            Object objT9 = x340Var4.T();
            obj2 = objT9;
            if (z) {
                ib2 ib2Var4 = new ib2(iu30Var2, (byte) 6);
                x340Var4.s0(ib2Var4);
                obj2 = ib2Var4;
            } else {
                ib2 ib2Var5 = new ib2(iu30Var2, (byte) 6);
                x340Var4.s0(ib2Var5);
                obj2 = ib2Var5;
            }
            l(tg2Var2, (iu30) obj2, zg2Var.b(), zg2Var.f, uyn1.x(pw31Var2.a(2.0f, qim0Var3, true), 2.0f), x340Var4, 0);
            String str3 = zg2Var.c;
            if (i11 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objT10 = x340Var4.T();
            obj3 = objT10;
            if (z2) {
                ib2 ib2Var6 = new ib2(iu30Var2, (byte) 7);
                x340Var4.s0(ib2Var6);
                obj3 = ib2Var6;
            } else {
                ib2 ib2Var7 = new ib2(iu30Var2, (byte) 7);
                x340Var4.s0(ib2Var7);
                obj3 = ib2Var7;
            }
            x(0, str3, x340Var4, (iu30) obj3, uyn1.x(pw31Var2.a(1.0f, qim0Var3, true), 2.0f), zg2Var.b(), zg2Var.f);
            x340Var2 = x340Var4;
            x340Var2.r(true);
            op71.g(x340Var2, u291.h(qim0Var3, 8.0f));
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode6 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM6 = x340Var2.m();
            qim0 qim0VarE6 = zr7.E(x340Var2, qim0VarF4);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar2);
            nko1.H(xos0VarM6, x340Var2, lljVar3);
            x0d.q(iHashCode6, x340Var2, lljVar4, x340Var2);
            nko1.H(qim0VarE6, x340Var2, vu30Var2);
            if (z13) {
                x340Var2.i0(392483399);
                i5 = i11;
                vu30Var = vu30Var2;
                lljVar = lljVar4;
                xto1.e(h2c.a.a(uyn1.x(qim0Var3, 4.0f), een.h), 3, 0L, 0L, x340Var2, 48, 12);
                x340Var2 = x340Var2;
                x340Var2.r(false);
                r8 = 0;
            } else {
                vu30Var = vu30Var2;
                lljVar = lljVar4;
                i5 = i11;
                x340Var2.i0(392679784);
                z3 = yg2Var instanceof vg2;
                if (z3) {
                    z4 = false;
                    x340Var2.i0(393860605);
                    x340Var2.r(false);
                } else {
                    z4 = false;
                    x340Var2.i0(393860605);
                    x340Var2.r(false);
                }
                x340Var2.r(z4);
                r8 = z4;
            }
            x340Var2.r(true);
            op71.g(x340Var2, u291.h(qim0Var3, 36.0f));
            qim0 qim0VarF5 = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA4 = ew31.a(h36.e, een.Z, x340Var2, (int) r8);
            int iHashCode7 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM7 = x340Var2.m();
            qim0 qim0VarE7 = zr7.E(x340Var2, qim0VarF5);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA4, x340Var2, lljVar2);
            nko1.H(xos0VarM7, x340Var2, lljVar3);
            x0d.q(iHashCode7, x340Var2, lljVar, x340Var2);
            nko1.H(qim0VarE7, x340Var2, vu30Var);
            if (z13) {
                x340Var2.i0(1792135673);
                haxVar = new hax(cwl1.o0(x340Var2, 2131962484));
                z8 = false;
                x340Var2.r(false);
            } else {
                z8 = false;
                x340Var2.i0(1792138435);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            haxVar2 = haxVar;
            z9 = z8;
            idxVar = new idx(8);
            strO0 = cwl1.o0(x340Var2, 2131962483);
            if (i5 == 32) {
                z10 = true;
            } else {
                z10 = z9;
            }
            Object objT11 = x340Var2.T();
            if (z10) {
                k52 k52Var4 = new k52(iu30Var, (byte) 19);
                x340Var2.s0(k52Var4);
                obj4 = k52Var4;
            } else {
                k52 k52Var5 = new k52(iu30Var, (byte) 19);
                x340Var2.s0(k52Var5);
                obj4 = k52Var5;
            }
            function6 = (Function0) obj4;
            if (!ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            x340Var3 = x340Var2;
            iu30Var3 = iu30Var;
            foo1.c(new gbx(new y50(strO0), function6), idxVar, (qim0) null, haxVar2, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, k5i.a, x340Var3, 0, 48, 2028);
            x340Var3.r(true);
            x340Var3.r(true);
            zg2Var2 = zg2Var;
            int i13 = zg2Var2.g;
            boolean z110 = zg2Var2.e;
            if (i5 == 32) {
                z11 = true;
            } else {
                z11 = z9;
            }
            Object objT12 = x340Var3.T();
            obj5 = objT12;
            if (z11) {
                k52 k52Var6 = new k52(iu30Var3, (byte) 20);
                x340Var3.s0(k52Var6);
                obj5 = k52Var6;
            } else {
                k52 k52Var7 = new k52(iu30Var3, (byte) 20);
                x340Var3.s0(k52Var7);
                obj5 = k52Var7;
            }
            Function0 function10 = (Function0) obj5;
            if (i5 == 32) {
                z12 = true;
            } else {
                z12 = z9;
            }
            Object objT13 = x340Var3.T();
            obj6 = objT13;
            if (z12) {
                k52 k52Var8 = new k52(iu30Var3, (byte) 21);
                x340Var3.s0(k52Var8);
                obj6 = k52Var8;
            } else {
                k52 k52Var9 = new k52(iu30Var3, (byte) 21);
                x340Var3.s0(k52Var9);
                obj6 = k52Var9;
            }
            Function0 function11 = function4;
            Function0 function12 = function5;
            exd0.b(i13, z110, function10, (Function0) obj6, function11, function12, (i3u) null, x340Var3, (i10 << 3) & 516096);
            function2 = function12;
            x340Var = x340Var3;
            qim0Var2 = qim0Var3;
            function3 = function11;
        } else {
            x340Var = x340Var4;
            x340Var.b0();
            qim0Var2 = qim0Var;
            function3 = function0;
        }
        Function0 function13 = function2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ih2(zg2Var2, iu30Var3, qim0Var2, function3, function13, i, i2);
        }
    }

    public static final void b(qyk1 qyk1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(236603481);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qyk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            v(6, apo.r(-129640822, new ouk1(qyk1Var, iu30Var, (byte) 0), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new puk1(qyk1Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(217100543);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            eso1.h(i3o1.n(2131233925, x340Var, 0), isl.a, i1p1.q(k1u.u(u291.m(qim0Var, 50.0f), -10.73f), er31.b(4.0f)), null, null, null, mif1.P0, null, null, x340Var, 224312, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 26);
        }
    }

    public static final void d(int i, String str, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z, boolean z2) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1528285716);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strO0 = cwl1.o0(b0kVar3, 2131962489);
            boolean z3 = !z2;
            lee1 lee1Var = (lee1) b0kVar3.k(rgx.a);
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(lee1Var, cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            kua0 kua0VarA = kua0.a(kua0.g, 0, (Boolean) null, 123);
            boolean z4 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z4 || objT == fkj0.X) {
                objT = new ib2(iu30Var, (byte) 8);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            j0o1.m(str, (iu30) objT, strO0, qim0Var, z, z3, z2, lee1VarA, kua0VarA, (bua0) null, true, 0, 0, (elk1) null, b0kVar2, (i2 & 14) | ((i2 >> 3) & 7168) | (57344 & (i2 << 6)) | ((i2 << 9) & 3670016));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jh2(str, iu30Var, z, z2, qim0Var, i, (byte) 0);
        }
    }

    public static final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1875052604);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956136);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new bb30(iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.h(new gbx(new y50(strO0), function0), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, apo.r(1929695580, new ps00(strO0, (byte) 15), x340Var), x340Var, 12582912, 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 10, i, iu30Var, false);
        }
    }

    public static final void f(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-994587354);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.g(13, apo.r(1439435027, new qgd((byte) 7, cwl1.o0(x340Var, 2131956137), iu30Var, false), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 11, i, iu30Var, false);
        }
    }

    public static final void g(qyk1 qyk1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-844195458);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qyk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            v(6, apo.r(8978159, new ouk1(qyk1Var, iu30Var, (byte) 1), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new puk1(qyk1Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void h(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        iu30 iu30Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1828414359);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            n(x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            r(x340Var, 0);
            qim0 qim0VarO = ab80.o(qim0Var3, cbx.b(x340Var).b.a, x340Var, qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0Var2 = qim0Var3;
            uwo1.e(cwl1.o0(x340Var, 2131956140), uyn1.z(16.0f, 0.0f, 2, qim0VarO), lee1.a(cbx.d(x340Var).e, 0L, fc11.G(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = ywx0.k(qim0Var2, 8.0f, x340Var, x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131956139), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            op71.g(x340Var, u291.h(qim0Var2, cbx.b(x340Var).b.a));
            int i3 = i2 & 14;
            iu30Var2 = iu30Var;
            f(iu30Var2, x340Var, i3);
            cvx cvxVar7 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var2, 8.0f));
            e(iu30Var2, x340Var, i3);
            x0d.s(qim0Var2, cbx.b(x340Var).b.c, x340Var, true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var2, qim0Var2, i, (byte) 3);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(809740709);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarR = u291.r(qim0Var, 57.41f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            eso1.h(i3o1.n(2131233926, x340Var, 0), isl.a, k1u.u(u291.m(nim0.a, 74.0f), 9.28f), null, null, null, mif1.P0, null, null, x340Var, 224312, 384);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 27);
        }
    }

    public static final void j(int i, eeo0 eeo0Var, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        sqk0 adl0Var;
        String str = eeo0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1351085657);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(eeo0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            zcl0 zcl0VarC = mno1.C(gfe0.b(x340Var));
            if (zcl0VarC instanceof zcl0) {
                adl0Var = new sqk0(zcl0VarC, Integer.valueOf(i), str);
            } else {
                adl0Var = zcl0VarC instanceof bdl0 ? new adl0((bdl0) zcl0VarC, Integer.valueOf(i), str) : null;
            }
            k(adl0Var, j2iVar, x340Var, (i3 >> 3) & 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, eeo0Var, j2iVar, i2, (byte) 23);
        }
    }

    public static final void k(n8h1 n8h1Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2015933657);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(n8h1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new cvk1();
                x340Var.s0(objT);
            }
            cvk1 cvk1Var = (cvk1) objT;
            if (n8h1Var == null) {
                x340Var.i0(-151716408);
                dv20.l((i2 >> 3) & 14, j2iVar, x340Var, false);
            } else {
                x340Var.i0(-151689159);
                otw.c(cvk1Var, new bvk1(n8h1Var, j2iVar), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(n8h1Var, j2iVar, i, (byte) 29);
        }
    }

    public static final void l(tg2 tg2Var, iu30 iu30Var, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1998446017);
        int i2 = i | (b0kVar3.g(tg2Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        int i3 = 0;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            List listQ0 = f46.Q0(DateFormatSymbols.getInstance(new Locale(upn1.q())).getMonths(1, 1));
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            b0kVar3.i0(656253793);
            String strO0 = tg2Var.a;
            if (strO0.length() == 0) {
                strO0 = cwl1.o0(b0kVar3, 2131962494);
            }
            b0kVar3.r(false);
            List list = listQ0;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) obj;
                str.getClass();
                arrayList.add(new tg2(str, i3));
                i3 = i4;
            }
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI = b0kVar3.i(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xj0(ven0Var, (byte) 11);
                b0kVar3.s0(objT2);
            }
            j2i j2iVarR = apo.r(-194019497, new kh2(z, ven0Var, z2, strO0, arrayList, iu30Var, tg2Var), b0kVar3);
            b0kVar2 = b0kVar3;
            eio1.h(zBooleanValue, (iu30) objT2, qim0VarD, j2iVarR, b0kVar2, 3072);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(tg2Var, iu30Var, z, z2, qim0Var, i, (byte) 2);
        }
    }

    public static final void m(tg2 tg2Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2050132861);
        int i2 = i | (x340Var.g(tg2Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.f(qim0Var4, 1.0f), 4.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(tg2Var.a, uyn1.A(qim0Var4, 8.0f, 4.0f, 8.0f, 4.0f), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2044);
            if (z) {
                x340Var.i0(-366130890);
                qim0Var3 = qim0Var4;
                nl70.c(i3o1.n(2131233224, x340Var, 0), (String) null, uyn1.x(qim0Var3, 2.0f), 0L, x340Var, 56, 8);
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(1534995177);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(tg2Var, z, qim0Var2, i, (byte) 3);
        }
    }

    public static final void n(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(274624774);
        if (x340Var.Y(i & 1, i != 0)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            wsx wsxVar = wsx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.c, 0L, false, x340Var, wsx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131956138), (qim0) null, ktd.l(nim0Var, 4.0f, x340Var, x340Var).k, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 4);
        }
    }

    public static final void o(qyk1 qyk1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1257217664);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qyk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            v(6, apo.r(-1961768657, new g2j1(qyk1Var, (byte) 23), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(qyk1Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:111:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x016f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0193  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01de  */
    /* JADX WARN: Code duplicated, block: B:126:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0294  */
    /* JADX WARN: Code duplicated, block: B:128:0x0296  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:144:0x02da  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:151:0x0314 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0316  */
    /* JADX WARN: Code duplicated, block: B:154:0x0374  */
    /* JADX WARN: Code duplicated, block: B:157:0x0384  */
    /* JADX WARN: Code duplicated, block: B:161:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef A[PHI: r1 r2 r9 r10 r19
      0x00ef: PHI (r1v73 int) = (r1v6 int), (r1v77 int) binds: [B:100:0x011e, B:85:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r2v44 p.xtb0) = (r2v8 p.xtb0), (r2v45 p.xtb0) binds: [B:100:0x011e, B:85:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r9v4 float) = (r9v2 float), (r9v6 float) binds: [B:100:0x011e, B:85:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r10v7 p.vzq0) = (r10v3 p.vzq0), (r10v2 p.vzq0) binds: [B:100:0x011e, B:85:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r19v2 p.c380) = (r19v0 p.c380), (r19v3 p.c380) binds: [B:100:0x011e, B:85:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    public static final void p(float f, xtb0 xtb0Var, c380 c380Var, vzq0 vzq0Var, vu30 vu30Var, txj txjVar, b0k b0kVar, int i, int i2) {
        float f2;
        int i3;
        xtb0 xtb0Var2;
        c380 c380VarS;
        vzq0 vzq0Var2;
        int i4;
        vu30 vu30Var2;
        int i5;
        int i6;
        boolean z;
        float f3;
        x340 x340Var;
        xtb0 xtb0Var3;
        c380 c380Var2;
        vzq0 vzq0Var3;
        vu30 vu30Var3;
        h311 h311VarV;
        float f4;
        xtb0 xtb0VarA;
        int i7;
        float f5;
        int i8;
        c380 c380Var3;
        vu30 vu30Var4;
        s061 s061Var;
        boolean z2;
        m4c m4cVar;
        boolean zI;
        Object objT;
        ?? r2;
        boolean z3;
        Object objT2;
        ven0 ven0VarH;
        z6x z6xVar;
        List list;
        List list2;
        z6x z6xVar2;
        List list3;
        Object objT3;
        Object objT4;
        ven0 ven0Var;
        boolean zG;
        HashSet hashSet;
        ArrayList arrayList;
        Iterator it;
        List list4;
        Object next;
        Object obj;
        boolean zG2;
        Object objT5;
        boolean z4;
        sen0 sen0Var;
        boolean zI2;
        int i9;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2031258943);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (x340Var2.d(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xtb0Var2 = xtb0Var;
                int i11 = x340Var2.g(xtb0Var2) ? 32 : 16;
                i3 |= i11;
            } else {
                xtb0Var2 = xtb0Var;
            }
            i3 |= i11;
        } else {
            xtb0Var2 = xtb0Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                c380VarS = c380Var;
                int i12 = x340Var2.i(c380VarS) ? 256 : 128;
                i3 |= i12;
            } else {
                c380VarS = c380Var;
            }
            i3 |= i12;
        } else {
            c380VarS = c380Var;
        }
        int i13 = i2 & 8;
        if (i13 == 0) {
            if ((i & 3072) == 0) {
                vzq0Var2 = vzq0Var;
                i3 |= x340Var2.g(vzq0Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    vu30Var2 = vu30Var;
                    if (x340Var2.i(vu30Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if ((262144 & i) == 0) {
                        zI2 = x340Var2.g(txjVar);
                    } else {
                        zI2 = x340Var2.i(txjVar);
                    }
                    if (zI2) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i6 = i3;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var2.Y(i6 & 1, z)) {
                    x340Var2.d0();
                    if ((i & 1) != 0 || x340Var2.E()) {
                        if (i10 != 0) {
                            f4 = 0.0f;
                        } else {
                            f4 = f2;
                        }
                        if ((i2 & 2) != 0) {
                            xtb0VarA = aub0.a(0, x340Var2, 3);
                            i7 = i6 & (-113);
                        } else {
                            xtb0VarA = xtb0Var2;
                            i7 = i6;
                        }
                        if ((i2 & 4) != 0) {
                            c380VarS = mqo1.s(new d6o0[]{k1o1.q(x340Var2)});
                            i7 &= -897;
                        }
                        if (i13 != 0) {
                            vzq0Var2 = null;
                        }
                        f5 = f4;
                        i8 = i7;
                        c380Var3 = c380VarS;
                        if (i4 != 0) {
                            vu30Var4 = null;
                        }
                        x340Var2.s();
                        s061Var = txjVar.f;
                        z2 = txjVar.c;
                        m4cVar = fkj0.X;
                        x340Var2.i0(-1715536387);
                        j1v0 j1v0Var = txjVar.e;
                        for (Map.Entry entry : ((Map) j1v0Var.s.getValue()).entrySet()) {
                            sen0Var = (sen0) entry.getValue();
                            if (sen0Var != null) {
                                txjVar.o.put(entry.getKey(), sen0Var);
                            }
                        }
                        zI = x340Var2.i(txjVar);
                        objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new hzb(txjVar, (lnm) null, (byte) 16);
                            x340Var2.s0(objT);
                        }
                        qxd0.t(rih1.a, x340Var2, (vu30) objT);
                        vgo1.f(txjVar.h, xtb0VarA, false, x340Var2, i8 & 112, 4);
                        xtb0 xtb0Var4 = xtb0VarA;
                        if (z2) {
                            x340Var2.i0(-1727601064);
                            r2 = 0;
                            boolean zBooleanValue = ((Boolean) rwq.h(s061Var.d, x340Var2, 0).getValue()).booleanValue();
                            x340Var2.r(false);
                            z3 = zBooleanValue;
                        } else {
                            r2 = 0;
                            x340Var2.i0(-1727520402);
                            x340Var2.r(false);
                            z3 = false;
                        }
                        if (z2) {
                            x340Var2.i0(-1727242425);
                            ven0VarH = rwq.h(s061Var.b, x340Var2, (int) r2);
                            x340Var2.r((boolean) r2);
                        } else {
                            x340Var2.i0(-1727175124);
                            objT2 = x340Var2.T();
                            if (objT2 == m4cVar) {
                                objT2 = v8r.q(w7x.a);
                                x340Var2.s0(objT2);
                            }
                            ven0VarH = (ven0) objT2;
                            x340Var2.r(false);
                        }
                        ven0 ven0Var2 = ven0VarH;
                        cxc0 cxc0Var = (cxc0) rwq.g(txjVar.g, (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                        z6xVar = (List) rwq.g((mr20) j1v0Var.u.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                        list = (List) rwq.g((at71) j1v0Var.y.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                        list2 = (List) rwq.g((at71) j1v0Var.x.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                        String str = (String) rwq.g((at71) j1v0Var.A.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                        at71 at71Var = (at71) j1v0Var.B.getValue();
                        z6xVar2 = z6x.a;
                        List list5 = (List) rwq.g(at71Var, z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                        list3 = (List) rwq.g((at71) j1v0Var.C.getValue(), z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                        ven0 ven0VarS = v8r.s(Float.valueOf(f5), x340Var2);
                        objT3 = x340Var2.T();
                        if (objT3 == m4cVar) {
                            if (vu30Var4 != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objT3 = c13.l(z4, x340Var2);
                        }
                        ven0 ven0Var3 = (ven0) objT3;
                        objT4 = x340Var2.T();
                        if (objT4 == m4cVar) {
                            objT4 = v8r.q(Boolean.FALSE);
                            x340Var2.s0(objT4);
                        }
                        ven0Var = (ven0) objT4;
                        zG = x340Var2.g(z6xVar);
                        Object objT6 = x340Var2.T();
                        if (!zG || objT6 == m4cVar) {
                            if (z6xVar != null) {
                                z6xVar2 = z6xVar;
                            }
                            hashSet = new HashSet();
                            arrayList = new ArrayList();
                            it = ((Iterable) z6xVar2).iterator();
                            while (it.hasNext()) {
                                List list6 = list3;
                                next = it.next();
                                Iterator it2 = it;
                                if (hashSet.add(((hwq) next).g.a())) {
                                    arrayList.add(next);
                                }
                                list3 = list6;
                                it = it2;
                            }
                            list4 = list3;
                            x340Var2.s0(arrayList);
                            obj = arrayList;
                        } else {
                            list4 = list3;
                            obj = objT6;
                        }
                        List list7 = (List) obj;
                        zG2 = x340Var2.g(z6xVar) | x340Var2.g(list) | x340Var2.g(list2);
                        objT5 = x340Var2.T();
                        if (zG2 || objT5 == m4cVar) {
                            objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                            x340Var2.s0(objT5);
                        }
                        qxd0.r(z6xVar, list, list2, (vu30) objT5, x340Var2);
                        vzq0 vzq0Var4 = vzq0Var2;
                        nyx.a(2, (wux) null, apo.r(-515518128, new rxj(z6xVar, list, list2, cxc0Var, xtb0Var4, vzq0Var4, txjVar, vu30Var4, f5, list4, list7, z3, ven0Var2, list5, str, ven0VarS, ven0Var, ven0Var3, c380Var3), x340Var2), x340Var2, 3078, 6);
                        x340Var2.r(false);
                        x340Var = x340Var2;
                        vzq0Var3 = vzq0Var4;
                        vu30Var3 = vu30Var4;
                        f3 = f5;
                        xtb0Var3 = xtb0Var4;
                        c380Var2 = c380Var3;
                    } else {
                        x340Var2.b0();
                        i8 = (i2 & 2) != 0 ? i6 & (-113) : i6;
                        if ((i2 & 4) != 0) {
                            i8 &= -897;
                        }
                        f5 = f2;
                        xtb0VarA = xtb0Var2;
                        c380Var3 = c380VarS;
                    }
                    vu30Var4 = vu30Var2;
                    x340Var2.s();
                    s061Var = txjVar.f;
                    z2 = txjVar.c;
                    m4cVar = fkj0.X;
                    x340Var2.i0(-1715536387);
                    j1v0 j1v0Var2 = txjVar.e;
                    while (r3.hasNext()) {
                        sen0Var = (sen0) entry.getValue();
                        if (sen0Var != null) {
                            txjVar.o.put(entry.getKey(), sen0Var);
                        }
                    }
                    zI = x340Var2.i(txjVar);
                    objT = x340Var2.T();
                    if (zI) {
                        objT = new hzb(txjVar, (lnm) null, (byte) 16);
                        x340Var2.s0(objT);
                    } else {
                        objT = new hzb(txjVar, (lnm) null, (byte) 16);
                        x340Var2.s0(objT);
                    }
                    qxd0.t(rih1.a, x340Var2, (vu30) objT);
                    vgo1.f(txjVar.h, xtb0VarA, false, x340Var2, i8 & 112, 4);
                    xtb0 xtb0Var5 = xtb0VarA;
                    if (z2) {
                        x340Var2.i0(-1727601064);
                        r2 = 0;
                        boolean zBooleanValue2 = ((Boolean) rwq.h(s061Var.d, x340Var2, 0).getValue()).booleanValue();
                        x340Var2.r(false);
                        z3 = zBooleanValue2;
                    } else {
                        r2 = 0;
                        x340Var2.i0(-1727520402);
                        x340Var2.r(false);
                        z3 = false;
                    }
                    if (z2) {
                        x340Var2.i0(-1727242425);
                        ven0VarH = rwq.h(s061Var.b, x340Var2, (int) r2);
                        x340Var2.r((boolean) r2);
                    } else {
                        x340Var2.i0(-1727175124);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = v8r.q(w7x.a);
                            x340Var2.s0(objT2);
                        }
                        ven0VarH = (ven0) objT2;
                        x340Var2.r(false);
                    }
                    ven0 ven0Var4 = ven0VarH;
                    cxc0 cxc0Var2 = (cxc0) rwq.g(txjVar.g, (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                    z6xVar = (List) rwq.g((mr20) j1v0Var2.u.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                    list = (List) rwq.g((at71) j1v0Var2.y.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                    list2 = (List) rwq.g((at71) j1v0Var2.x.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                    String str2 = (String) rwq.g((at71) j1v0Var2.A.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                    at71 at71Var2 = (at71) j1v0Var2.B.getValue();
                    z6xVar2 = z6x.a;
                    List list8 = (List) rwq.g(at71Var2, z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                    list3 = (List) rwq.g((at71) j1v0Var2.C.getValue(), z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                    ven0 ven0VarS2 = v8r.s(Float.valueOf(f5), x340Var2);
                    objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        if (vu30Var4 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objT3 = c13.l(z4, x340Var2);
                    }
                    ven0 ven0Var5 = (ven0) objT3;
                    objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT4);
                    }
                    ven0Var = (ven0) objT4;
                    zG = x340Var2.g(z6xVar);
                    Object objT7 = x340Var2.T();
                    if (zG) {
                        if (z6xVar != null) {
                            z6xVar2 = z6xVar;
                        }
                        hashSet = new HashSet();
                        arrayList = new ArrayList();
                        it = ((Iterable) z6xVar2).iterator();
                        while (it.hasNext()) {
                            List list9 = list3;
                            next = it.next();
                            Iterator it3 = it;
                            if (hashSet.add(((hwq) next).g.a())) {
                                arrayList.add(next);
                            }
                            list3 = list9;
                            it = it3;
                        }
                        list4 = list3;
                        x340Var2.s0(arrayList);
                        obj = arrayList;
                    } else {
                        if (z6xVar != null) {
                            z6xVar2 = z6xVar;
                        }
                        hashSet = new HashSet();
                        arrayList = new ArrayList();
                        it = ((Iterable) z6xVar2).iterator();
                        while (it.hasNext()) {
                            List list10 = list3;
                            next = it.next();
                            Iterator it4 = it;
                            if (hashSet.add(((hwq) next).g.a())) {
                                arrayList.add(next);
                            }
                            list3 = list10;
                            it = it4;
                        }
                        list4 = list3;
                        x340Var2.s0(arrayList);
                        obj = arrayList;
                    }
                    List list11 = (List) obj;
                    zG2 = x340Var2.g(z6xVar) | x340Var2.g(list) | x340Var2.g(list2);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                        x340Var2.s0(objT5);
                    }
                    qxd0.r(z6xVar, list, list2, (vu30) objT5, x340Var2);
                    vzq0 vzq0Var5 = vzq0Var2;
                    nyx.a(2, (wux) null, apo.r(-515518128, new rxj(z6xVar, list, list2, cxc0Var2, xtb0Var5, vzq0Var5, txjVar, vu30Var4, f5, list4, list11, z3, ven0Var4, list8, str2, ven0VarS2, ven0Var, ven0Var5, c380Var3), x340Var2), x340Var2, 3078, 6);
                    x340Var2.r(false);
                    x340Var = x340Var2;
                    vzq0Var3 = vzq0Var5;
                    vu30Var3 = vu30Var4;
                    f3 = f5;
                    xtb0Var3 = xtb0Var5;
                    c380Var2 = c380Var3;
                } else {
                    x340Var2.b0();
                    f3 = f2;
                    x340Var = x340Var2;
                    xtb0Var3 = xtb0Var2;
                    c380Var2 = c380VarS;
                    vzq0Var3 = vzq0Var2;
                    vu30Var3 = vu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new d61(f3, xtb0Var3, c380Var2, vzq0Var3, vu30Var3, txjVar, i, i2);
                }
            }
            i3 |= 24576;
            vu30Var2 = vu30Var;
            if ((196608 & i) == 0) {
                if ((262144 & i) == 0) {
                    zI2 = x340Var2.g(txjVar);
                } else {
                    zI2 = x340Var2.i(txjVar);
                }
                if (zI2) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i6 = i3;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i6 & 1, z)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var2, 3);
                        i7 = i6 & (-113);
                    } else {
                        xtb0VarA = xtb0Var2;
                        i7 = i6;
                    }
                    if ((i2 & 4) != 0) {
                        c380VarS = mqo1.s(new d6o0[]{k1o1.q(x340Var2)});
                        i7 &= -897;
                    }
                    if (i13 != 0) {
                        vzq0Var2 = null;
                    }
                    f5 = f4;
                    i8 = i7;
                    c380Var3 = c380VarS;
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                } else {
                    if (i10 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var2, 3);
                        i7 = i6 & (-113);
                    } else {
                        xtb0VarA = xtb0Var2;
                        i7 = i6;
                    }
                    if ((i2 & 4) != 0) {
                        c380VarS = mqo1.s(new d6o0[]{k1o1.q(x340Var2)});
                        i7 &= -897;
                    }
                    if (i13 != 0) {
                        vzq0Var2 = null;
                    }
                    f5 = f4;
                    i8 = i7;
                    c380Var3 = c380VarS;
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                }
                x340Var2.s();
                s061Var = txjVar.f;
                z2 = txjVar.c;
                m4cVar = fkj0.X;
                x340Var2.i0(-1715536387);
                j1v0 j1v0Var3 = txjVar.e;
                while (r3.hasNext()) {
                    sen0Var = (sen0) entry.getValue();
                    if (sen0Var != null) {
                        txjVar.o.put(entry.getKey(), sen0Var);
                    }
                }
                zI = x340Var2.i(txjVar);
                objT = x340Var2.T();
                if (zI) {
                    objT = new hzb(txjVar, (lnm) null, (byte) 16);
                    x340Var2.s0(objT);
                } else {
                    objT = new hzb(txjVar, (lnm) null, (byte) 16);
                    x340Var2.s0(objT);
                }
                qxd0.t(rih1.a, x340Var2, (vu30) objT);
                vgo1.f(txjVar.h, xtb0VarA, false, x340Var2, i8 & 112, 4);
                xtb0 xtb0Var6 = xtb0VarA;
                if (z2) {
                    x340Var2.i0(-1727601064);
                    r2 = 0;
                    boolean zBooleanValue3 = ((Boolean) rwq.h(s061Var.d, x340Var2, 0).getValue()).booleanValue();
                    x340Var2.r(false);
                    z3 = zBooleanValue3;
                } else {
                    r2 = 0;
                    x340Var2.i0(-1727520402);
                    x340Var2.r(false);
                    z3 = false;
                }
                if (z2) {
                    x340Var2.i0(-1727242425);
                    ven0VarH = rwq.h(s061Var.b, x340Var2, (int) r2);
                    x340Var2.r((boolean) r2);
                } else {
                    x340Var2.i0(-1727175124);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(w7x.a);
                        x340Var2.s0(objT2);
                    }
                    ven0VarH = (ven0) objT2;
                    x340Var2.r(false);
                }
                ven0 ven0Var6 = ven0VarH;
                cxc0 cxc0Var3 = (cxc0) rwq.g(txjVar.g, (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                z6xVar = (List) rwq.g((mr20) j1v0Var3.u.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                list = (List) rwq.g((at71) j1v0Var3.y.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                list2 = (List) rwq.g((at71) j1v0Var3.x.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                String str3 = (String) rwq.g((at71) j1v0Var3.A.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                at71 at71Var3 = (at71) j1v0Var3.B.getValue();
                z6xVar2 = z6x.a;
                List list12 = (List) rwq.g(at71Var3, z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                list3 = (List) rwq.g((at71) j1v0Var3.C.getValue(), z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                ven0 ven0VarS3 = v8r.s(Float.valueOf(f5), x340Var2);
                objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    if (vu30Var4 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT3 = c13.l(z4, x340Var2);
                }
                ven0 ven0Var7 = (ven0) objT3;
                objT4 = x340Var2.T();
                if (objT4 == m4cVar) {
                    objT4 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT4);
                }
                ven0Var = (ven0) objT4;
                zG = x340Var2.g(z6xVar);
                Object objT8 = x340Var2.T();
                if (zG) {
                    if (z6xVar != null) {
                        z6xVar2 = z6xVar;
                    }
                    hashSet = new HashSet();
                    arrayList = new ArrayList();
                    it = ((Iterable) z6xVar2).iterator();
                    while (it.hasNext()) {
                        List list13 = list3;
                        next = it.next();
                        Iterator it5 = it;
                        if (hashSet.add(((hwq) next).g.a())) {
                            arrayList.add(next);
                        }
                        list3 = list13;
                        it = it5;
                    }
                    list4 = list3;
                    x340Var2.s0(arrayList);
                    obj = arrayList;
                } else {
                    if (z6xVar != null) {
                        z6xVar2 = z6xVar;
                    }
                    hashSet = new HashSet();
                    arrayList = new ArrayList();
                    it = ((Iterable) z6xVar2).iterator();
                    while (it.hasNext()) {
                        List list14 = list3;
                        next = it.next();
                        Iterator it6 = it;
                        if (hashSet.add(((hwq) next).g.a())) {
                            arrayList.add(next);
                        }
                        list3 = list14;
                        it = it6;
                    }
                    list4 = list3;
                    x340Var2.s0(arrayList);
                    obj = arrayList;
                }
                List list15 = (List) obj;
                zG2 = x340Var2.g(z6xVar) | x340Var2.g(list) | x340Var2.g(list2);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                    x340Var2.s0(objT5);
                }
                qxd0.r(z6xVar, list, list2, (vu30) objT5, x340Var2);
                vzq0 vzq0Var6 = vzq0Var2;
                nyx.a(2, (wux) null, apo.r(-515518128, new rxj(z6xVar, list, list2, cxc0Var3, xtb0Var6, vzq0Var6, txjVar, vu30Var4, f5, list4, list15, z3, ven0Var6, list12, str3, ven0VarS3, ven0Var, ven0Var7, c380Var3), x340Var2), x340Var2, 3078, 6);
                x340Var2.r(false);
                x340Var = x340Var2;
                vzq0Var3 = vzq0Var6;
                vu30Var3 = vu30Var4;
                f3 = f5;
                xtb0Var3 = xtb0Var6;
                c380Var2 = c380Var3;
            } else {
                x340Var2.b0();
                f3 = f2;
                x340Var = x340Var2;
                xtb0Var3 = xtb0Var2;
                c380Var2 = c380VarS;
                vzq0Var3 = vzq0Var2;
                vu30Var3 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new d61(f3, xtb0Var3, c380Var2, vzq0Var3, vu30Var3, txjVar, i, i2);
            }
        }
        i3 |= 3072;
        vzq0Var2 = vzq0Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                vu30Var2 = vu30Var;
                if (x340Var2.i(vu30Var2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if ((262144 & i) == 0) {
                    zI2 = x340Var2.g(txjVar);
                } else {
                    zI2 = x340Var2.i(txjVar);
                }
                if (zI2) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i6 = i3;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i6 & 1, z)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var2, 3);
                        i7 = i6 & (-113);
                    } else {
                        xtb0VarA = xtb0Var2;
                        i7 = i6;
                    }
                    if ((i2 & 4) != 0) {
                        c380VarS = mqo1.s(new d6o0[]{k1o1.q(x340Var2)});
                        i7 &= -897;
                    }
                    if (i13 != 0) {
                        vzq0Var2 = null;
                    }
                    f5 = f4;
                    i8 = i7;
                    c380Var3 = c380VarS;
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                } else {
                    if (i10 != 0) {
                        f4 = 0.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var2, 3);
                        i7 = i6 & (-113);
                    } else {
                        xtb0VarA = xtb0Var2;
                        i7 = i6;
                    }
                    if ((i2 & 4) != 0) {
                        c380VarS = mqo1.s(new d6o0[]{k1o1.q(x340Var2)});
                        i7 &= -897;
                    }
                    if (i13 != 0) {
                        vzq0Var2 = null;
                    }
                    f5 = f4;
                    i8 = i7;
                    c380Var3 = c380VarS;
                    if (i4 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                }
                x340Var2.s();
                s061Var = txjVar.f;
                z2 = txjVar.c;
                m4cVar = fkj0.X;
                x340Var2.i0(-1715536387);
                j1v0 j1v0Var4 = txjVar.e;
                while (r3.hasNext()) {
                    sen0Var = (sen0) entry.getValue();
                    if (sen0Var != null) {
                        txjVar.o.put(entry.getKey(), sen0Var);
                    }
                }
                zI = x340Var2.i(txjVar);
                objT = x340Var2.T();
                if (zI) {
                    objT = new hzb(txjVar, (lnm) null, (byte) 16);
                    x340Var2.s0(objT);
                } else {
                    objT = new hzb(txjVar, (lnm) null, (byte) 16);
                    x340Var2.s0(objT);
                }
                qxd0.t(rih1.a, x340Var2, (vu30) objT);
                vgo1.f(txjVar.h, xtb0VarA, false, x340Var2, i8 & 112, 4);
                xtb0 xtb0Var7 = xtb0VarA;
                if (z2) {
                    x340Var2.i0(-1727601064);
                    r2 = 0;
                    boolean zBooleanValue4 = ((Boolean) rwq.h(s061Var.d, x340Var2, 0).getValue()).booleanValue();
                    x340Var2.r(false);
                    z3 = zBooleanValue4;
                } else {
                    r2 = 0;
                    x340Var2.i0(-1727520402);
                    x340Var2.r(false);
                    z3 = false;
                }
                if (z2) {
                    x340Var2.i0(-1727242425);
                    ven0VarH = rwq.h(s061Var.b, x340Var2, (int) r2);
                    x340Var2.r((boolean) r2);
                } else {
                    x340Var2.i0(-1727175124);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(w7x.a);
                        x340Var2.s0(objT2);
                    }
                    ven0VarH = (ven0) objT2;
                    x340Var2.r(false);
                }
                ven0 ven0Var8 = ven0VarH;
                cxc0 cxc0Var4 = (cxc0) rwq.g(txjVar.g, (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                z6xVar = (List) rwq.g((mr20) j1v0Var4.u.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                list = (List) rwq.g((at71) j1v0Var4.y.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                list2 = (List) rwq.g((at71) j1v0Var4.x.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                String str4 = (String) rwq.g((at71) j1v0Var4.A.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
                at71 at71Var4 = (at71) j1v0Var4.B.getValue();
                z6xVar2 = z6x.a;
                List list16 = (List) rwq.g(at71Var4, z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                list3 = (List) rwq.g((at71) j1v0Var4.C.getValue(), z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
                ven0 ven0VarS4 = v8r.s(Float.valueOf(f5), x340Var2);
                objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    if (vu30Var4 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT3 = c13.l(z4, x340Var2);
                }
                ven0 ven0Var9 = (ven0) objT3;
                objT4 = x340Var2.T();
                if (objT4 == m4cVar) {
                    objT4 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT4);
                }
                ven0Var = (ven0) objT4;
                zG = x340Var2.g(z6xVar);
                Object objT9 = x340Var2.T();
                if (zG) {
                    if (z6xVar != null) {
                        z6xVar2 = z6xVar;
                    }
                    hashSet = new HashSet();
                    arrayList = new ArrayList();
                    it = ((Iterable) z6xVar2).iterator();
                    while (it.hasNext()) {
                        List list17 = list3;
                        next = it.next();
                        Iterator it7 = it;
                        if (hashSet.add(((hwq) next).g.a())) {
                            arrayList.add(next);
                        }
                        list3 = list17;
                        it = it7;
                    }
                    list4 = list3;
                    x340Var2.s0(arrayList);
                    obj = arrayList;
                } else {
                    if (z6xVar != null) {
                        z6xVar2 = z6xVar;
                    }
                    hashSet = new HashSet();
                    arrayList = new ArrayList();
                    it = ((Iterable) z6xVar2).iterator();
                    while (it.hasNext()) {
                        List list18 = list3;
                        next = it.next();
                        Iterator it8 = it;
                        if (hashSet.add(((hwq) next).g.a())) {
                            arrayList.add(next);
                        }
                        list3 = list18;
                        it = it8;
                    }
                    list4 = list3;
                    x340Var2.s0(arrayList);
                    obj = arrayList;
                }
                List list19 = (List) obj;
                zG2 = x340Var2.g(z6xVar) | x340Var2.g(list) | x340Var2.g(list2);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                    x340Var2.s0(objT5);
                }
                qxd0.r(z6xVar, list, list2, (vu30) objT5, x340Var2);
                vzq0 vzq0Var7 = vzq0Var2;
                nyx.a(2, (wux) null, apo.r(-515518128, new rxj(z6xVar, list, list2, cxc0Var4, xtb0Var7, vzq0Var7, txjVar, vu30Var4, f5, list4, list19, z3, ven0Var8, list16, str4, ven0VarS4, ven0Var, ven0Var9, c380Var3), x340Var2), x340Var2, 3078, 6);
                x340Var2.r(false);
                x340Var = x340Var2;
                vzq0Var3 = vzq0Var7;
                vu30Var3 = vu30Var4;
                f3 = f5;
                xtb0Var3 = xtb0Var7;
                c380Var2 = c380Var3;
            } else {
                x340Var2.b0();
                f3 = f2;
                x340Var = x340Var2;
                xtb0Var3 = xtb0Var2;
                c380Var2 = c380VarS;
                vzq0Var3 = vzq0Var2;
                vu30Var3 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new d61(f3, xtb0Var3, c380Var2, vzq0Var3, vu30Var3, txjVar, i, i2);
            }
        }
        i3 |= 24576;
        vu30Var2 = vu30Var;
        if ((196608 & i) == 0) {
            if ((262144 & i) == 0) {
                zI2 = x340Var2.g(txjVar);
            } else {
                zI2 = x340Var2.i(txjVar);
            }
            if (zI2) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        i6 = i3;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i6 & 1, z)) {
            x340Var2.d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var2, 3);
                    i7 = i6 & (-113);
                } else {
                    xtb0VarA = xtb0Var2;
                    i7 = i6;
                }
                if ((i2 & 4) != 0) {
                    c380VarS = mqo1.s(new d6o0[]{k1o1.q(x340Var2)});
                    i7 &= -897;
                }
                if (i13 != 0) {
                    vzq0Var2 = null;
                }
                f5 = f4;
                i8 = i7;
                c380Var3 = c380VarS;
                if (i4 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
            } else {
                if (i10 != 0) {
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var2, 3);
                    i7 = i6 & (-113);
                } else {
                    xtb0VarA = xtb0Var2;
                    i7 = i6;
                }
                if ((i2 & 4) != 0) {
                    c380VarS = mqo1.s(new d6o0[]{k1o1.q(x340Var2)});
                    i7 &= -897;
                }
                if (i13 != 0) {
                    vzq0Var2 = null;
                }
                f5 = f4;
                i8 = i7;
                c380Var3 = c380VarS;
                if (i4 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
            }
            x340Var2.s();
            s061Var = txjVar.f;
            z2 = txjVar.c;
            m4cVar = fkj0.X;
            x340Var2.i0(-1715536387);
            j1v0 j1v0Var5 = txjVar.e;
            while (r3.hasNext()) {
                sen0Var = (sen0) entry.getValue();
                if (sen0Var != null) {
                    txjVar.o.put(entry.getKey(), sen0Var);
                }
            }
            zI = x340Var2.i(txjVar);
            objT = x340Var2.T();
            if (zI) {
                objT = new hzb(txjVar, (lnm) null, (byte) 16);
                x340Var2.s0(objT);
            } else {
                objT = new hzb(txjVar, (lnm) null, (byte) 16);
                x340Var2.s0(objT);
            }
            qxd0.t(rih1.a, x340Var2, (vu30) objT);
            vgo1.f(txjVar.h, xtb0VarA, false, x340Var2, i8 & 112, 4);
            xtb0 xtb0Var8 = xtb0VarA;
            if (z2) {
                x340Var2.i0(-1727601064);
                r2 = 0;
                boolean zBooleanValue5 = ((Boolean) rwq.h(s061Var.d, x340Var2, 0).getValue()).booleanValue();
                x340Var2.r(false);
                z3 = zBooleanValue5;
            } else {
                r2 = 0;
                x340Var2.i0(-1727520402);
                x340Var2.r(false);
                z3 = false;
            }
            if (z2) {
                x340Var2.i0(-1727242425);
                ven0VarH = rwq.h(s061Var.b, x340Var2, (int) r2);
                x340Var2.r((boolean) r2);
            } else {
                x340Var2.i0(-1727175124);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(w7x.a);
                    x340Var2.s0(objT2);
                }
                ven0VarH = (ven0) objT2;
                x340Var2.r(false);
            }
            ven0 ven0Var10 = ven0VarH;
            cxc0 cxc0Var5 = (cxc0) rwq.g(txjVar.g, (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
            z6xVar = (List) rwq.g((mr20) j1v0Var5.u.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
            list = (List) rwq.g((at71) j1v0Var5.y.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
            list2 = (List) rwq.g((at71) j1v0Var5.x.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
            String str5 = (String) rwq.g((at71) j1v0Var5.A.getValue(), (Object) null, (o8n) null, x340Var2, 48, 2).getValue();
            at71 at71Var5 = (at71) j1v0Var5.B.getValue();
            z6xVar2 = z6x.a;
            List list110 = (List) rwq.g(at71Var5, z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
            list3 = (List) rwq.g((at71) j1v0Var5.C.getValue(), z6xVar2, (o8n) null, x340Var2, 48, 2).getValue();
            ven0 ven0VarS5 = v8r.s(Float.valueOf(f5), x340Var2);
            objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                if (vu30Var4 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT3 = c13.l(z4, x340Var2);
            }
            ven0 ven0Var11 = (ven0) objT3;
            objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT4);
            }
            ven0Var = (ven0) objT4;
            zG = x340Var2.g(z6xVar);
            Object objT10 = x340Var2.T();
            if (zG) {
                if (z6xVar != null) {
                    z6xVar2 = z6xVar;
                }
                hashSet = new HashSet();
                arrayList = new ArrayList();
                it = ((Iterable) z6xVar2).iterator();
                while (it.hasNext()) {
                    List list111 = list3;
                    next = it.next();
                    Iterator it9 = it;
                    if (hashSet.add(((hwq) next).g.a())) {
                        arrayList.add(next);
                    }
                    list3 = list111;
                    it = it9;
                }
                list4 = list3;
                x340Var2.s0(arrayList);
                obj = arrayList;
            } else {
                if (z6xVar != null) {
                    z6xVar2 = z6xVar;
                }
                hashSet = new HashSet();
                arrayList = new ArrayList();
                it = ((Iterable) z6xVar2).iterator();
                while (it.hasNext()) {
                    List list112 = list3;
                    next = it.next();
                    Iterator it10 = it;
                    if (hashSet.add(((hwq) next).g.a())) {
                        arrayList.add(next);
                    }
                    list3 = list112;
                    it = it10;
                }
                list4 = list3;
                x340Var2.s0(arrayList);
                obj = arrayList;
            }
            List list113 = (List) obj;
            zG2 = x340Var2.g(z6xVar) | x340Var2.g(list) | x340Var2.g(list2);
            objT5 = x340Var2.T();
            if (zG2) {
                objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                x340Var2.s0(objT5);
            } else {
                objT5 = new x4c(z6xVar, list, list2, ven0Var, (lnm) null, (byte) 14);
                x340Var2.s0(objT5);
            }
            qxd0.r(z6xVar, list, list2, (vu30) objT5, x340Var2);
            vzq0 vzq0Var8 = vzq0Var2;
            nyx.a(2, (wux) null, apo.r(-515518128, new rxj(z6xVar, list, list2, cxc0Var5, xtb0Var8, vzq0Var8, txjVar, vu30Var4, f5, list4, list113, z3, ven0Var10, list110, str5, ven0VarS5, ven0Var, ven0Var11, c380Var3), x340Var2), x340Var2, 3078, 6);
            x340Var2.r(false);
            x340Var = x340Var2;
            vzq0Var3 = vzq0Var8;
            vu30Var3 = vu30Var4;
            f3 = f5;
            xtb0Var3 = xtb0Var8;
            c380Var2 = c380Var3;
        } else {
            x340Var2.b0();
            f3 = f2;
            x340Var = x340Var2;
            xtb0Var3 = xtb0Var2;
            c380Var2 = c380VarS;
            vzq0Var3 = vzq0Var2;
            vu30Var3 = vu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d61(f3, xtb0Var3, c380Var2, vzq0Var3, vu30Var3, txjVar, i, i2);
        }
    }

    public static final void q(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-296174604);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarM = u291.m(qim0Var, 40.0f);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarM, cr31Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarE = d1u.E(2.51f, cbx.a(x340Var).a.a.a(), dug.f(qim0VarQ, cbx.a(x340Var).a.a.c(), d4o1.a), cr31Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            w0h1.a(gsx.c, isl.a, u291.r(nim0.a, 20.0f), cbx.a(x340Var).c.c, 0L, false, x340Var, gsx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 28);
        }
    }

    public static final void r(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-897008243);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = u291.n(nim0Var, 142.76f, 61.24f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            i(eqr0.C(nim0Var, 85.35f, 1.16f), x340Var, 0);
            q(lrn1.x(eqr0.C(nim0Var, 50.72f, 21.12f), 1.0f), x340Var, 0);
            c(lrn1.x(eqr0.C(nim0Var, 4.22f, 4.22f), 2.0f), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0157  */
    /* JADX WARN: Code duplicated, block: B:102:0x015e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0164  */
    /* JADX WARN: Code duplicated, block: B:106:0x0184  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:116:0x0201  */
    /* JADX WARN: Code duplicated, block: B:119:0x020f  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    public static final void s(Function0 function0, qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, r891 r891Var, bke1 bke1Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        vu30 vu30Var3;
        int i4;
        vu30 vu30VarR;
        int i5;
        boolean z;
        bke1 bke1Var2;
        vu30 vu30Var4;
        r891 r891Var2;
        vu30 vu30Var5;
        h311 h311VarV;
        int i6;
        bke1 bke1Var3;
        r891 r891Var3;
        vu30 vu30Var6;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i7;
        int i8;
        boolean zI;
        int i9;
        boolean zI2;
        r891 p891Var = r891Var;
        bke1 bke1Var4 = bke1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1391989260);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                vu30Var3 = vu30Var;
                i3 |= x340Var.i(vu30Var3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    vu30VarR = vu30Var2;
                    if (x340Var.i(vu30VarR)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) != 0) {
                        i9 = 8192;
                    } else {
                        if ((32768 & i) == 0) {
                            zI2 = x340Var.g(p891Var);
                        } else {
                            zI2 = x340Var.i(p891Var);
                        }
                        if (zI2) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) != 0) {
                        i8 = 65536;
                    } else {
                        if ((262144 & i) == 0) {
                            zI = x340Var.g(bke1Var4);
                        } else {
                            zI = x340Var.i(bke1Var4);
                        }
                        if (zI) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    i3 |= i8;
                }
                if ((1572864 & i) == 0) {
                    if (x340Var.i(j2iVar)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i10 != 0) {
                            vu30Var3 = qij.a;
                        }
                        if (i4 != 0) {
                            vu30VarR = apo.r(1629007403, new h621(function0, (byte) 7), x340Var);
                        }
                        if ((i2 & 16) != 0) {
                            p891Var = new p891();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            bke1Var4 = new bke1(function0);
                            i3 &= -458753;
                        }
                    } else {
                        x340Var.b0();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                    i6 = i3;
                    bke1Var3 = bke1Var4;
                    r891Var3 = p891Var;
                    vu30Var6 = vu30VarR;
                    x340Var.s();
                    qim0 qim0VarY = voo1.y(qim0Var, voo1.c);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarX = uyn1.x(qim0VarY, cbx.b(x340Var).e.c);
                    mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarX);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    if (vu30Var3 == null) {
                        x340Var.i0(281930555);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(9094534);
                        us71.j((i6 >> 6) & 14, vu30Var3, x340Var, false);
                    }
                    float f = cbx.b(x340Var).b.b;
                    cvx cvxVar = cbx.b(x340Var).b;
                    w2g0.c(kx40.h(1.0f, u291.f(uyn1.B(nim0.a, 0.0f, f, 0.0f, 16.0f, 5), 1.0f), false), (tl3) null, apo.r(-224543320, new n891(r891Var3, bke1Var3, j2iVar, (byte) 0), x340Var), x340Var, 3072, 6);
                    if (vu30Var6 == null) {
                        x340Var.i0(284092123);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(9164262);
                        us71.j((i6 >> 9) & 14, vu30Var6, x340Var, false);
                    }
                    x340Var.r(true);
                    r891Var2 = r891Var3;
                    vu30Var4 = vu30Var3;
                    bke1Var2 = bke1Var3;
                    vu30Var5 = vu30Var6;
                } else {
                    x340Var.b0();
                    vu30 vu30Var7 = vu30Var3;
                    bke1Var2 = bke1Var4;
                    vu30Var4 = vu30Var7;
                    r891Var2 = p891Var;
                    vu30Var5 = vu30VarR;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o891(function0, qim0Var, vu30Var4, vu30Var5, r891Var2, bke1Var2, j2iVar, i, i2);
                }
            }
            i3 |= 3072;
            vu30VarR = vu30Var2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i9 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI2 = x340Var.g(p891Var);
                    } else {
                        zI2 = x340Var.i(p891Var);
                    }
                    if (zI2) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) != 0) {
                    i8 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zI = x340Var.g(bke1Var4);
                    } else {
                        zI = x340Var.i(bke1Var4);
                    }
                    if (zI) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                i3 |= i8;
            }
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        vu30Var3 = qij.a;
                    }
                    if (i4 != 0) {
                        vu30VarR = apo.r(1629007403, new h621(function0, (byte) 7), x340Var);
                    }
                    if ((i2 & 16) != 0) {
                        p891Var = new p891();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        bke1Var4 = new bke1(function0);
                        i3 &= -458753;
                    }
                } else {
                    if (i10 != 0) {
                        vu30Var3 = qij.a;
                    }
                    if (i4 != 0) {
                        vu30VarR = apo.r(1629007403, new h621(function0, (byte) 7), x340Var);
                    }
                    if ((i2 & 16) != 0) {
                        p891Var = new p891();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        bke1Var4 = new bke1(function0);
                        i3 &= -458753;
                    }
                }
                i6 = i3;
                bke1Var3 = bke1Var4;
                r891Var3 = p891Var;
                vu30Var6 = vu30VarR;
                x340Var.s();
                qim0 qim0VarY2 = voo1.y(qim0Var, voo1.c);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarX2 = uyn1.x(qim0VarY2, cbx.b(x340Var).e.c);
                mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX2);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (vu30Var3 == null) {
                    x340Var.i0(281930555);
                    x340Var.r(false);
                } else {
                    x340Var.i0(9094534);
                    us71.j((i6 >> 6) & 14, vu30Var3, x340Var, false);
                }
                float f2 = cbx.b(x340Var).b.b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                w2g0.c(kx40.h(1.0f, u291.f(uyn1.B(nim0.a, 0.0f, f2, 0.0f, 16.0f, 5), 1.0f), false), (tl3) null, apo.r(-224543320, new n891(r891Var3, bke1Var3, j2iVar, (byte) 0), x340Var), x340Var, 3072, 6);
                if (vu30Var6 == null) {
                    x340Var.i0(284092123);
                    x340Var.r(false);
                } else {
                    x340Var.i0(9164262);
                    us71.j((i6 >> 9) & 14, vu30Var6, x340Var, false);
                }
                x340Var.r(true);
                r891Var2 = r891Var3;
                vu30Var4 = vu30Var3;
                bke1Var2 = bke1Var3;
                vu30Var5 = vu30Var6;
            } else {
                x340Var.b0();
                vu30 vu30Var8 = vu30Var3;
                bke1Var2 = bke1Var4;
                vu30Var4 = vu30Var8;
                r891Var2 = p891Var;
                vu30Var5 = vu30VarR;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o891(function0, qim0Var, vu30Var4, vu30Var5, r891Var2, bke1Var2, j2iVar, i, i2);
            }
        }
        i3 |= 384;
        vu30Var3 = vu30Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                vu30VarR = vu30Var2;
                if (x340Var.i(vu30VarR)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i9 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI2 = x340Var.g(p891Var);
                    } else {
                        zI2 = x340Var.i(p891Var);
                    }
                    if (zI2) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) != 0) {
                    i8 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zI = x340Var.g(bke1Var4);
                    } else {
                        zI = x340Var.i(bke1Var4);
                    }
                    if (zI) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                i3 |= i8;
            }
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        vu30Var3 = qij.a;
                    }
                    if (i4 != 0) {
                        vu30VarR = apo.r(1629007403, new h621(function0, (byte) 7), x340Var);
                    }
                    if ((i2 & 16) != 0) {
                        p891Var = new p891();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        bke1Var4 = new bke1(function0);
                        i3 &= -458753;
                    }
                } else {
                    if (i10 != 0) {
                        vu30Var3 = qij.a;
                    }
                    if (i4 != 0) {
                        vu30VarR = apo.r(1629007403, new h621(function0, (byte) 7), x340Var);
                    }
                    if ((i2 & 16) != 0) {
                        p891Var = new p891();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        bke1Var4 = new bke1(function0);
                        i3 &= -458753;
                    }
                }
                i6 = i3;
                bke1Var3 = bke1Var4;
                r891Var3 = p891Var;
                vu30Var6 = vu30VarR;
                x340Var.s();
                qim0 qim0VarY3 = voo1.y(qim0Var, voo1.c);
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarX3 = uyn1.x(qim0VarY3, cbx.b(x340Var).e.c);
                mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX3);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (vu30Var3 == null) {
                    x340Var.i0(281930555);
                    x340Var.r(false);
                } else {
                    x340Var.i0(9094534);
                    us71.j((i6 >> 6) & 14, vu30Var3, x340Var, false);
                }
                float f3 = cbx.b(x340Var).b.b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                w2g0.c(kx40.h(1.0f, u291.f(uyn1.B(nim0.a, 0.0f, f3, 0.0f, 16.0f, 5), 1.0f), false), (tl3) null, apo.r(-224543320, new n891(r891Var3, bke1Var3, j2iVar, (byte) 0), x340Var), x340Var, 3072, 6);
                if (vu30Var6 == null) {
                    x340Var.i0(284092123);
                    x340Var.r(false);
                } else {
                    x340Var.i0(9164262);
                    us71.j((i6 >> 9) & 14, vu30Var6, x340Var, false);
                }
                x340Var.r(true);
                r891Var2 = r891Var3;
                vu30Var4 = vu30Var3;
                bke1Var2 = bke1Var3;
                vu30Var5 = vu30Var6;
            } else {
                x340Var.b0();
                vu30 vu30Var9 = vu30Var3;
                bke1Var2 = bke1Var4;
                vu30Var4 = vu30Var9;
                r891Var2 = p891Var;
                vu30Var5 = vu30VarR;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o891(function0, qim0Var, vu30Var4, vu30Var5, r891Var2, bke1Var2, j2iVar, i, i2);
            }
        }
        i3 |= 3072;
        vu30VarR = vu30Var2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i9 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zI2 = x340Var.g(p891Var);
                } else {
                    zI2 = x340Var.i(p891Var);
                }
                if (zI2) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) != 0) {
                i8 = 65536;
            } else {
                if ((262144 & i) == 0) {
                    zI = x340Var.g(bke1Var4);
                } else {
                    zI = x340Var.i(bke1Var4);
                }
                if (zI) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
            }
            i3 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (x340Var.i(j2iVar)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    vu30Var3 = qij.a;
                }
                if (i4 != 0) {
                    vu30VarR = apo.r(1629007403, new h621(function0, (byte) 7), x340Var);
                }
                if ((i2 & 16) != 0) {
                    p891Var = new p891();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    bke1Var4 = new bke1(function0);
                    i3 &= -458753;
                }
            } else {
                if (i10 != 0) {
                    vu30Var3 = qij.a;
                }
                if (i4 != 0) {
                    vu30VarR = apo.r(1629007403, new h621(function0, (byte) 7), x340Var);
                }
                if ((i2 & 16) != 0) {
                    p891Var = new p891();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    bke1Var4 = new bke1(function0);
                    i3 &= -458753;
                }
            }
            i6 = i3;
            bke1Var3 = bke1Var4;
            r891Var3 = p891Var;
            vu30Var6 = vu30VarR;
            x340Var.s();
            qim0 qim0VarY4 = voo1.y(qim0Var, voo1.c);
            uwr uwrVar4 = cbx.a;
            qim0 qim0VarX4 = uyn1.x(qim0VarY4, cbx.b(x340Var).e.c);
            mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarX4);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (vu30Var3 == null) {
                x340Var.i0(281930555);
                x340Var.r(false);
            } else {
                x340Var.i0(9094534);
                us71.j((i6 >> 6) & 14, vu30Var3, x340Var, false);
            }
            float f4 = cbx.b(x340Var).b.b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            w2g0.c(kx40.h(1.0f, u291.f(uyn1.B(nim0.a, 0.0f, f4, 0.0f, 16.0f, 5), 1.0f), false), (tl3) null, apo.r(-224543320, new n891(r891Var3, bke1Var3, j2iVar, (byte) 0), x340Var), x340Var, 3072, 6);
            if (vu30Var6 == null) {
                x340Var.i0(284092123);
                x340Var.r(false);
            } else {
                x340Var.i0(9164262);
                us71.j((i6 >> 9) & 14, vu30Var6, x340Var, false);
            }
            x340Var.r(true);
            r891Var2 = r891Var3;
            vu30Var4 = vu30Var3;
            bke1Var2 = bke1Var3;
            vu30Var5 = vu30Var6;
        } else {
            x340Var.b0();
            vu30 vu30Var10 = vu30Var3;
            bke1Var2 = bke1Var4;
            vu30Var4 = vu30Var10;
            r891Var2 = p891Var;
            vu30Var5 = vu30VarR;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o891(function0, qim0Var, vu30Var4, vu30Var5, r891Var2, bke1Var2, j2iVar, i, i2);
        }
    }

    public static final void t(Function0 function0, vu30 vu30Var, vu30 vu30Var2, r891 r891Var, bke1 bke1Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        vu30 vu30Var3;
        bke1 bke1Var2;
        vu30 vu30VarR;
        int i3;
        bke1 bke1Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(446088652);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(nim0.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? b0kVar3.g(r891Var) : b0kVar3.i(r891Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= b0kVar3.i(j2iVar) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                vu30VarR = apo.r(-1936834365, new h621(function0, (byte) 8), b0kVar3);
                i3 = i4 & (-458753);
                bke1Var3 = new bke1(function0);
            } else {
                b0kVar3.b0();
                i3 = i4 & (-458753);
                vu30VarR = vu30Var2;
                bke1Var3 = bke1Var;
            }
            int i5 = i3;
            b0kVar3.s();
            vu30Var3 = vu30VarR;
            b0kVar2 = b0kVar3;
            anm1.a(function0, new i3u(3, false, false, false), apo.r(2130922453, new wyy0(function0, vu30Var, vu30VarR, r891Var, bke1Var3, j2iVar), b0kVar3), b0kVar2, (i5 & 14) | 384, 0);
            bke1Var2 = bke1Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            vu30Var3 = vu30Var2;
            bke1Var2 = bke1Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(function0, vu30Var, vu30Var3, r891Var, bke1Var2, j2iVar, i);
        }
    }

    public static final void u(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1750510328);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            dui1 dui1VarS = byo1.s(((hux) wsx.c).a.b, x340Var);
            qim0 qim0VarD = i541.D(u291.r(qim0Var, 50.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
            boolean zI = x340Var.i(dui1VarS);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new qwc1(dui1VarS, (byte) 25);
                x340Var.s0(objT);
            }
            t1c.a(exd0.r(qim0VarD, (iu30) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 4);
        }
    }

    public static final void v(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1600153324);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(pbh.a, x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p6k1(j2iVar, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void w(qyk1 qyk1Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1808644550);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qyk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iC = l1d.C(qyk1Var.f);
            if (iC == 0) {
                x340Var.i0(-1354337534);
                b(qyk1Var, iu30Var, x340Var, i2 & 126);
                x340Var.r(false);
            } else {
                if (iC != 1 && iC != 2) {
                    throw p3d1.k(x340Var, -1354338987, false);
                }
                x340Var.i0(965347792);
                if (qyk1Var.k) {
                    x340Var.i0(965383256);
                    o(qyk1Var, x340Var, i2 & 14);
                    x340Var.r(false);
                } else {
                    x340Var.i0(965457160);
                    g(qyk1Var, iu30Var, x340Var, i2 & 126);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new puk1(qyk1Var, iu30Var, i, (byte) 2);
        }
    }

    public static final void x(int i, String str, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z, boolean z2) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1692594999);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strO0 = cwl1.o0(b0kVar3, 2131962495);
            boolean z3 = !z2;
            lee1 lee1Var = (lee1) b0kVar3.k(rgx.a);
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(lee1Var, cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            kua0 kua0VarA = kua0.a(kua0.g, 0, (Boolean) null, 123);
            boolean z4 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z4 || objT == fkj0.X) {
                objT = new ib2(iu30Var, (byte) 9);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            j0o1.m(str, (iu30) objT, strO0, qim0Var, z, z3, z2, lee1VarA, kua0VarA, (bua0) null, true, 0, 0, (elk1) null, b0kVar2, (i2 & 14) | ((i2 >> 3) & 7168) | (57344 & (i2 << 6)) | ((i2 << 9) & 3670016));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jh2(str, iu30Var, z, z2, qim0Var, i, (byte) 1);
        }
    }

    public static final qlq0 y(boolean z) {
        return z ? new nlq0(Collections.singleton(mlq0.a)) : olq0.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151  */
    public static final rzc z(zft zftVar, boolean z) throws i9n {
        dja0 dja0Var;
        Method method;
        rzc e0dVar;
        wja0 wja0Var;
        rzc g0dVar;
        Field fieldQ;
        ajn0 ajn0Var;
        beg begVar;
        if (mla0.a.e(zftVar.z().t)) {
            return ehe1.a;
        }
        heg hegVar = i141.a;
        ton1 ton1VarB = i141.b(zftVar.z().z());
        Class clsP = null;
        if (ton1VarB instanceof rja0) {
            rja0 rja0Var = (rja0) ton1VarB;
            zjn0 zjn0Var = rja0Var.f;
            yja0 yja0Var = rja0Var.e;
            if (z) {
                if (yja0Var.i()) {
                    wja0Var = yja0Var.e;
                } else {
                    wja0Var = null;
                }
            } else if ((yja0Var.b & 8) == 8) {
                wja0Var = yja0Var.f;
            } else {
                wja0Var = null;
            }
            Method methodZ = wja0Var != null ? zftVar.z().h.z(zjn0Var.getString(wja0Var.c), zjn0Var.getString(wja0Var.d)) : null;
            if (methodZ == null) {
                tdy0 tdy0VarZ = zftVar.z().z();
                int i = vf80.a;
                if (tdy0VarZ.L() == null && tdy0VarZ.g0().isEmpty()) {
                    n9r n9rVarK = tdy0VarZ.k();
                    beg begVar2 = n9rVarK instanceof beg ? (beg) n9rVarK : null;
                    if (begVar2 != null) {
                        int i2 = kht.a;
                        ksi1 ksi1VarQ = begVar2.Q();
                        uf80 uf80Var = ksi1VarQ instanceof uf80 ? (uf80) ksi1VarQ : null;
                        if (uf80Var != null) {
                            ajn0Var = uf80Var.a;
                        } else {
                            ajn0Var = null;
                        }
                    } else {
                        ajn0Var = null;
                    }
                    if (u890.j(ajn0Var, tdy0VarZ.getName()) && u890.j(zftVar.z().z().getVisibility(), mht.d)) {
                        n9r n9rVarK2 = zftVar.z().z().k();
                        if ((n9rVarK2 instanceof beg) && vf80.a(n9rVarK2) && (clsP = bpi1.p((begVar = (beg) n9rVarK2))) == null) {
                            StringBuilder sb = new StringBuilder("Class object for the class ");
                            sb.append(begVar.getName());
                            heg hegVarF = kht.f((jfg) n9rVarK2);
                            sb.append(" cannot be found (classId=");
                            sb.append(hegVarF);
                            sb.append(')');
                            throw new i9n(sb.toString());
                        }
                        if (clsP == null) {
                            throw new i9n("Underlying property of inline class " + zftVar.z() + " should have a field");
                        }
                        Method methodY = yxo1.y(clsP, zftVar.z());
                        e0dVar = fc11.N(zftVar) ? new n690(methodY, G(zftVar)) : new o690(methodY);
                    } else {
                        fieldQ = zftVar.z().q();
                        if (fieldQ != null) {
                            tw20.x(zftVar.z(), "No accessors or field is found for property ");
                            return null;
                        }
                        e0dVar = A(zftVar, z, fieldQ);
                    }
                } else {
                    fieldQ = zftVar.z().q();
                    if (fieldQ != null) {
                        tw20.x(zftVar.z(), "No accessors or field is found for property ");
                        return null;
                    }
                    e0dVar = A(zftVar, z, fieldQ);
                }
            } else {
                if (!Modifier.isStatic(methodZ.getModifiers())) {
                    g0dVar = fc11.N(zftVar) ? new e0d(methodZ, G(zftVar)) : new h0d(methodZ, (byte) 0);
                } else if (zftVar.z().z().getAnnotations().d0(bpi1.a)) {
                    g0dVar = fc11.N(zftVar) ? new f0d(methodZ) : new h0d(methodZ);
                } else {
                    g0dVar = fc11.N(zftVar) ? new g0d(methodZ, false, G(zftVar)) : new h0d(methodZ, (byte) 2);
                }
                e0dVar = g0dVar;
            }
        } else if (ton1VarB instanceof pja0) {
            e0dVar = A(zftVar, z, ((pja0) ton1VarB).c);
        } else {
            if (!(ton1VarB instanceof qja0)) {
                if (!(ton1VarB instanceof sja0)) {
                    eg.o();
                    return null;
                }
                if (z) {
                    dja0Var = ((sja0) ton1VarB).c;
                } else {
                    dja0Var = ((sja0) ton1VarB).d;
                    if (dja0Var == null) {
                        tw20.x(zftVar.z(), "No setter found for property ");
                        return null;
                    }
                }
                mla0 mla0Var = zftVar.z().h;
                fja0 fja0Var = dja0Var.c;
                Method methodZ2 = mla0Var.z(fja0Var.d, fja0Var.e);
                if (methodZ2 != null) {
                    Modifier.isStatic(methodZ2.getModifiers());
                    return fc11.N(zftVar) ? new e0d(methodZ2, G(zftVar)) : new h0d(methodZ2, (byte) 0);
                }
                tw20.x(zftVar.z(), "No accessor found for property ");
                return null;
            }
            if (z) {
                method = ((qja0) ton1VarB).c;
            } else {
                qja0 qja0Var = (qja0) ton1VarB;
                method = qja0Var.d;
                if (method == null) {
                    tw20.x(qja0Var.c, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            e0dVar = fc11.N(zftVar) ? new e0d(method, G(zftVar)) : new h0d(method, (byte) 0);
        }
        return yxo1.u(z6x.a, e0dVar, zftVar, false);
    }
}
