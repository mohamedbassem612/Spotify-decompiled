package p;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
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
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class c4p1 {
    public static b180 a;
    public static b180 b;

    public static final int A(PlayerState playerState) {
        String strA0;
        Integer numC0;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack == null || (strA0 = l4o1.a0(contextTrack, "iteration")) == null || (numC0 = nhc1.c0(strA0)) == null) {
            return 0;
        }
        return numC0.intValue();
    }

    public static void B(PlayOrigin playOrigin) {
        String strReferrerIdentifier;
        String strFeatureIdentifier = playOrigin.featureIdentifier();
        if (strFeatureIdentifier == null || strFeatureIdentifier.length() == 0 || (strReferrerIdentifier = playOrigin.referrerIdentifier()) == null || strReferrerIdentifier.length() == 0) {
            String strFeatureIdentifier2 = playOrigin.featureIdentifier();
            if (strFeatureIdentifier2 == null) {
                strFeatureIdentifier2 = "";
            }
            String strReferrerIdentifier2 = playOrigin.referrerIdentifier();
            if (strReferrerIdentifier2 == null) {
                strReferrerIdentifier2 = "";
            }
            String strViewUri = playOrigin.viewUri();
            String str = strViewUri != null ? strViewUri : "";
            StringBuilder sbN = gvg.n("Missing PlayOrigin fields:\nfeatureIdentifier=", strFeatureIdentifier2, ", \nreferrerIdentifier=", strReferrerIdentifier2, ", \nviewUri=");
            sbN.append(str);
            n57.q(new IllegalStateException(sbN.toString()));
        }
    }

    public static final lee1 C(lee1 lee1Var, float f) {
        long j = lee1Var.a.b;
        fc11.o(j);
        long jY = fc11.Y(TextUnit.c(j) * f, j & 1095216660480L);
        long jY2 = lee1Var.b.c;
        long j2 = 1095216660480L & jY2;
        if (j2 != 0) {
            fc11.o(jY2);
            jY2 = fc11.Y(TextUnit.c(jY2) * f, j2);
        }
        return lee1.a(lee1Var, 0L, jY, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, jY2, (u8e1) null, (wdt0) null, (shc0) null, 0, 16646141);
    }

    public static final y7e1 D(int i, int i2, String str, b0k b0kVar) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            str = "";
        }
        int length = str.length();
        long jE = e6p1.e(length, length);
        Object[] objArr = new Object[0];
        boolean z2 = (((i & 14) ^ 6) > 4 && ((x340) b0kVar).g(str)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !((x340) b0kVar).f(jE)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z3 || objT == fkj0.X) {
            objT = new n45(str, jE, (byte) 2);
            x340Var.s0(objT);
        }
        return (y7e1) k5p1.u(objArr, x7e1.b, (Function0) objT, x340Var, 48);
    }

    public static final void E(String str, y7e1 y7e1Var) {
        h4e1 h4e1VarH = y7e1Var.h();
        try {
            h4e1VarH.k(0, h4e1VarH.c.length(), str);
            u2p1.p(h4e1VarH);
            y7e1Var.a(h4e1VarH);
        } finally {
            y7e1Var.c();
        }
    }

    public static final ezc F(SharedPreferences sharedPreferences, ima1 ima1Var, bma1 bma1Var, vu30 vu30Var) {
        return h4p1.f(new sew0(bma1Var, sharedPreferences, vu30Var, ima1Var, (lnm) null, (byte) 28));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0264  */
    /* JADX WARN: Code duplicated, block: B:108:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0297  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x030f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:145:0x041f  */
    /* JADX WARN: Code duplicated, block: B:148:0x043b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0454 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x0212  */
    /* JADX WARN: Code duplicated, block: B:97:0x0217  */
    public static final void a(j2i j2iVar, qim0 qim0Var, List list, nl3 nl3Var, float f, gdx gdxVar, lee1 lee1Var, float f2, String str, String str2, vu30 vu30Var, boolean z, int i, float f3, b0k b0kVar, int i2, int i3, int i4) {
        List list2;
        int i5;
        nl3 nl3Var2;
        int i6;
        int i7;
        int i8;
        String str3;
        int i9;
        int i10;
        vu30 vu30Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        x340 x340Var;
        float f4;
        gdx gdxVar2;
        lee1 lee1Var2;
        float f5;
        boolean z3;
        int i15;
        String str4;
        vu30 vu30Var3;
        nl3 nl3Var3;
        List list3;
        qim0 qim0Var2;
        h311 h311Var;
        y51 y51Var;
        h311 h311VarV;
        int i16;
        qim0 qim0Var3;
        List list4;
        nl3 nl3Var4;
        float f6;
        List list5;
        nl3 nl3Var5;
        gdx gdxVar3;
        int i17;
        float f7;
        int i18;
        boolean z4;
        lee1 lee1Var3;
        qim0 qim0Var4;
        String str5;
        vu30 vu30Var4;
        es41 es41VarC;
        Object objT;
        m4c m4cVar;
        tob1 tob1Var;
        float f8;
        Object objT2;
        lw4 lw4Var;
        long jB;
        Object objT3;
        ven0 ven0Var;
        Object objT4;
        ven0 ven0Var2;
        boolean zI;
        Object objT5;
        es41 es41Var;
        qim0 qim0VarN;
        es41 es41Var2;
        boolean zI2;
        Object h61Var;
        es41 es41Var3;
        boolean z5;
        qim0 qim0VarB;
        qim0 qim0VarThen;
        float f9;
        gdx gdxVar4;
        nl3 nl3Var6;
        float f10;
        h311 h311VarV2;
        lee1 lee1Var4;
        gdx gdxVar5;
        nl3 nl3Var7;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2077028421);
        int i19 = i2 | 48;
        int i20 = i4 & 4;
        if (i20 != 0) {
            i5 = i2 | 432;
            list2 = list;
        } else {
            list2 = list;
            i5 = i19 | (x340Var2.g(list2) ? 256 : 128);
        }
        if ((i4 & 8) == 0) {
            nl3Var2 = nl3Var;
            int i21 = x340Var2.i(nl3Var2) ? 2048 : 1024;
            i6 = i5 | i21;
            i7 = 4792320 | i6;
            i8 = i4 & 512;
            if (i8 != 0) {
                if ((805306368 & i2) == 0) {
                    str3 = str2;
                    if (x340Var2.g(str3)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i7 |= i9;
                }
                i10 = i4 & 1024;
                if (i10 != 0) {
                    vu30Var2 = vu30Var;
                    i11 = 6;
                } else {
                    vu30Var2 = vu30Var;
                    if ((i3 & 6) == 0) {
                        if (x340Var2.i(vu30Var2)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i3 | i12;
                    } else {
                        i11 = i3;
                    }
                }
                int i22 = i11 | 432;
                if (x340Var2.d(f3)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i14 = i22 | i13;
                if ((i7 & 306783379) == 306783378 || (i14 & 1171) != 1170) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var2.Y(i7 & 1, z2)) {
                    x340Var2.d0();
                    i16 = i2 & 1;
                    qim0Var3 = nim0.a;
                    if (i16 != 0 || x340Var2.E()) {
                        if (i20 != 0) {
                            list4 = z6x.a;
                        } else {
                            list4 = list2;
                        }
                        if ((i4 & 8) != 0) {
                            nl3Var4 = een.Q0;
                            i7 &= -7169;
                        } else {
                            nl3Var4 = nl3Var2;
                        }
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        gdx gdxVarS = yla.s(x340Var2);
                        lee1 lee1Var5 = cbx.d(x340Var2).h;
                        int i23 = i7 & (-33546241);
                        if (i8 != 0) {
                            str3 = null;
                        }
                        if (i10 != 0) {
                            vu30Var2 = s3i.a;
                        }
                        f6 = 200.0f;
                        list5 = list4;
                        nl3Var5 = nl3Var4;
                        gdxVar3 = gdxVarS;
                        i17 = i23;
                        f7 = 8.0f;
                        i18 = 1;
                        z4 = true;
                        lee1Var3 = lee1Var5;
                        qim0Var4 = qim0Var3;
                    } else {
                        x340Var2.b0();
                        if ((i4 & 8) != 0) {
                            i7 &= -7169;
                        }
                        i17 = i7 & (-33546241);
                        qim0Var4 = qim0Var;
                        f7 = f;
                        gdxVar3 = gdxVar;
                        lee1Var3 = lee1Var;
                        f6 = f2;
                        z4 = z;
                        i18 = i;
                        list5 = list2;
                        nl3Var5 = nl3Var2;
                    }
                    str5 = str3;
                    vu30Var4 = vu30Var2;
                    x340Var2.s();
                    int i24 = 6 | ((i14 >> 6) & 112);
                    es41VarC = l6o1.C(0, 0, 1, x340Var2);
                    objT = x340Var2.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = yv91.a(new g61(es41VarC, (byte) 1));
                        x340Var2.s0(objT);
                    }
                    tob1Var = (tob1) objT;
                    uwr uwrVar2 = cbx.a;
                    f8 = cbx.b(x340Var2).b.c;
                    avw0 avw0Var = cbx.b(x340Var2).c;
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = fdg1.l();
                        x340Var2.s0(objT2);
                    }
                    lw4Var = (lw4) objT2;
                    avw0 avw0Var2 = cbx.b(x340Var2).c;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    jB = u7h.b(cbx.a(x340Var2).b.a, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                    objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var = x340Var2;
                        x340Var.s0(objT3);
                    } else {
                        x340Var = x340Var2;
                    }
                    ven0Var = (ven0) objT3;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT4);
                    }
                    ven0Var2 = (ven0) objT4;
                    zI = x340Var.i(es41VarC) | x340Var.i(ven0Var) | x340Var.i(ven0Var2);
                    objT5 = x340Var.T();
                    if (!zI || objT5 == m4cVar) {
                        objT5 = new c6(es41VarC, ven0Var, ven0Var2, (lnm) null, (byte) 7);
                        es41Var = es41VarC;
                        x340Var.s0(objT5);
                    } else {
                        es41Var = es41VarC;
                    }
                    qxd0.t(es41Var, x340Var, (vu30) objT5);
                    if (str != null) {
                        qim0VarN = anm1.N(str, qim0Var3);
                    } else {
                        qim0VarN = qim0Var3;
                    }
                    qim0 qim0Var5 = qim0VarN;
                    es41Var2 = es41Var;
                    zI2 = x340Var.i(es41Var) | x340Var.d(f8) | x340Var.d(4.0f) | x340Var.i(lw4Var) | x340Var.i(ven0Var) | x340Var.i((Object) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0278: ARITH (r0v45 'zI2' boolean) = (wrap boolean:0x0273: ARITH (wrap boolean:0x026b: ARITH (wrap boolean:0x0250: ARITH (wrap boolean:0x0246: ARITH (wrap boolean:0x023c: ARITH (wrap boolean:0x0236: ARITH (wrap boolean:0x0230: ARITH (wrap boolean:0x022a: ARITH (wrap boolean:0x0220: ARITH (wrap boolean:0x0218: INVOKE (r15v5 'x340Var' p.x340), (r1v11 'es41Var' p.es41) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) | (wrap boolean:0x021c: INVOKE (r15v5 'x340Var' p.x340), (r2v14 'f8' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x0226: INVOKE (r15v5 'x340Var' p.x340), (4.0f float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x022c: INVOKE (r15v5 'x340Var' p.x340), (r6v15 'lw4Var' p.lw4) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x0232: INVOKE (r15v5 'x340Var' p.x340), (r7v15 'ven0Var' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x0238: INVOKE (r15v5 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r46v2 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x0242: INVOKE (r15v5 'x340Var' p.x340), (2.0f float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x024c: INVOKE (r15v5 'x340Var' p.x340), (6.0f float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:?: TERNARY null = ((((wrap int:0x0256: ARITH (wrap int:0x0252: ARITH (r0v17 'i24' int) & (112 int) A[WRAPPED]) ^ (48 int) A[WRAPPED]) <= (32 int) && (wrap boolean:0x025e: INVOKE (r15v5 'x340Var' p.x340), (r55v0 'f3' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED]) == true) || (wrap int:0x0264: ARITH (r0v17 'i24' int) & (48 int) A[WRAPPED]) == (32 int))) ? true : false) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x026f: INVOKE (r15v5 'x340Var' p.x340), (12.0f float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x0274: INVOKE (r15v5 'x340Var' p.x340), (r10v5 'jB' long) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED]) in method: p.c4p1.a(p.j2i, p.qim0, java.util.List, p.nl3, float, p.gdx, p.lee1, float, java.lang.String, java.lang.String, p.vu30, boolean, int, float, p.b0k, int, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r46v2 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1109
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.c4p1.a(p.j2i, p.qim0, java.util.List, p.nl3, float, p.gdx, p.lee1, float, java.lang.String, java.lang.String, p.vu30, boolean, int, float, p.b0k, int, int, int):void");
                }

                /* JADX WARN: Code duplicated, block: B:19:0x003b  */
                /* JADX WARN: Code duplicated, block: B:21:0x0043  */
                /* JADX WARN: Code duplicated, block: B:22:0x0046  */
                /* JADX WARN: Code duplicated, block: B:26:0x004f  */
                /* JADX WARN: Code duplicated, block: B:28:0x0057  */
                /* JADX WARN: Code duplicated, block: B:29:0x005a  */
                /* JADX WARN: Code duplicated, block: B:33:0x0063  */
                /* JADX WARN: Code duplicated, block: B:35:0x0067 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:36:0x0069  */
                /* JADX WARN: Code duplicated, block: B:37:0x006b  */
                /* JADX WARN: Code duplicated, block: B:40:0x0075  */
                /* JADX WARN: Code duplicated, block: B:41:0x0078  */
                /* JADX WARN: Code duplicated, block: B:44:0x0086  */
                /* JADX WARN: Code duplicated, block: B:45:0x0088  */
                /* JADX WARN: Code duplicated, block: B:48:0x0090  */
                /* JADX WARN: Code duplicated, block: B:50:0x0097  */
                /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
                /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
                /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
                /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
                /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
                /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:68:0x00da  */
                /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
                /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:76:0x0100  */
                /* JADX WARN: Code duplicated, block: B:78:0x0106  */
                /* JADX WARN: Code duplicated, block: B:80:0x012b  */
                /* JADX WARN: Code duplicated, block: B:82:0x0132  */
                /* JADX WARN: Code duplicated, block: B:83:0x0138  */
                /* JADX WARN: Code duplicated, block: B:86:0x0171  */
                /* JADX WARN: Code duplicated, block: B:87:0x0180  */
                /* JADX WARN: Code duplicated, block: B:89:0x0185  */
                /* JADX WARN: Code duplicated, block: B:90:0x01b0  */
                /* JADX WARN: Code duplicated, block: B:93:0x01be  */
                /* JADX WARN: Code duplicated, block: B:94:0x01cf A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
                public static final void b(List list, qim0 qim0Var, nl3 nl3Var, float f, gdx gdxVar, lee1 lee1Var, int i, b0k b0kVar, int i2, int i3) {
                    float f2;
                    gdx gdxVar2;
                    lee1 lee1Var2;
                    int i4;
                    int iC;
                    int i5;
                    int i6;
                    boolean z;
                    int i7;
                    float f3;
                    gdx gdxVar3;
                    lee1 lee1Var3;
                    h311 h311VarV;
                    d61 d61Var;
                    float f4;
                    gdx gdxVarS;
                    lee1 lee1Var4;
                    int i8;
                    float f5;
                    gdx gdxVar4;
                    boolean z2;
                    lee1 lee1Var5;
                    gfh0 gfh0VarC;
                    int iHashCode;
                    xos0 xos0VarM;
                    qim0 qim0VarE;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(1087890300);
                    int i9 = i2 | (x340Var.g(list) ? 4 : 2) | (x340Var.i(nl3Var) ? 256 : 128);
                    if ((i3 & 8) == 0) {
                        f2 = f;
                        int i10 = x340Var.d(f2) ? 2048 : 1024;
                        int i11 = i9 | i10;
                        if ((i3 & 16) == 0) {
                            gdxVar2 = gdxVar;
                            int i12 = x340Var.i(gdxVar2) ? 16384 : 8192;
                            int i13 = i11 | i12;
                            if ((i3 & 32) == 0) {
                                lee1Var2 = lee1Var;
                                int i14 = x340Var.i(lee1Var2) ? 131072 : 65536;
                                int i15 = i13 | i14;
                                i4 = i3 & 64;
                                if (i4 != 0) {
                                    i5 = 1572864;
                                } else {
                                    if (i == 0) {
                                        iC = -1;
                                    } else {
                                        iC = l1d.C(i);
                                    }
                                    if (x340Var.e(iC)) {
                                        i5 = 1048576;
                                    } else {
                                        i5 = 524288;
                                    }
                                }
                                i6 = i15 | i5;
                                if ((599187 & i6) != 599186) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (x340Var.Y(i6 & 1, z)) {
                                    x340Var.d0();
                                    if ((i2 & 1) != 0 || x340Var.E()) {
                                        if ((i3 & 8) != 0) {
                                            uwr uwrVar = cbx.a;
                                            cvx cvxVar = cbx.b(x340Var).b;
                                            f4 = 8.0f;
                                        } else {
                                            f4 = f2;
                                        }
                                        if ((i3 & 16) != 0) {
                                            gdxVarS = yla.s(x340Var);
                                        } else {
                                            gdxVarS = gdxVar2;
                                        }
                                        if ((i3 & 32) != 0) {
                                            uwr uwrVar2 = cbx.a;
                                            lee1Var4 = cbx.d(x340Var).h;
                                        } else {
                                            lee1Var4 = lee1Var2;
                                        }
                                        if (i4 != 0) {
                                            f5 = f4;
                                            i8 = 1;
                                            gdxVar4 = gdxVarS;
                                            lee1Var5 = lee1Var4;
                                            z2 = true;
                                        } else {
                                            i8 = i;
                                            f5 = f4;
                                            gdxVar4 = gdxVarS;
                                            z2 = true;
                                            lee1Var5 = lee1Var4;
                                        }
                                    } else {
                                        x340Var.b0();
                                        i8 = i;
                                        f5 = f2;
                                        z2 = true;
                                        gdxVar4 = gdxVar2;
                                        lee1Var5 = lee1Var2;
                                    }
                                    x340Var.s();
                                    if (list.isEmpty()) {
                                        h311VarV = x340Var.v();
                                        if (h311VarV != null) {
                                            return;
                                        } else {
                                            d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                                        }
                                    } else if (list.size() == z2) {
                                        x340Var.i0(-482820059);
                                        gfh0VarC = t1c.c(een.d, (boolean) r9);
                                        iHashCode = Long.hashCode(x340Var.T);
                                        xos0VarM = x340Var.m();
                                        qim0VarE = zr7.E(x340Var, qim0Var);
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
                                        nko1.H(gfh0VarC, x340Var, y580.O0);
                                        nko1.H(xos0VarM, x340Var, y580.N0);
                                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                        nko1.F(x340Var);
                                        nko1.H(qim0VarE, x340Var, y580.Y);
                                        ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                                        x340Var.r(z2);
                                        x340Var.r(false);
                                        h311VarV = x340Var.v();
                                        if (h311VarV != null) {
                                            return;
                                        } else {
                                            d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                                        }
                                    } else {
                                        x340Var.i0(-482757594);
                                        x340Var.r((boolean) r9);
                                        float f6 = f5;
                                        gdx gdxVar5 = gdxVar4;
                                        lee1 lee1Var6 = lee1Var5;
                                        int i16 = i8;
                                        e61 e61Var = new e61(i16, list, f6, gdxVar5, lee1Var6, qim0Var, nl3Var);
                                        i7 = i16;
                                        lee1Var3 = lee1Var6;
                                        gdxVar3 = gdxVar5;
                                        f3 = f6;
                                        w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var, x340Var), x340Var, 3072, 7);
                                    }
                                    h311VarV.d = d61Var;
                                }
                                x340Var.b0();
                                i7 = i;
                                f3 = f2;
                                gdxVar3 = gdxVar2;
                                lee1Var3 = lee1Var2;
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                                    h311VarV.d = d61Var;
                                }
                            }
                            lee1Var2 = lee1Var;
                            int i17 = i13 | i14;
                            i4 = i3 & 64;
                            if (i4 != 0) {
                                i5 = 1572864;
                            } else {
                                if (i == 0) {
                                    iC = -1;
                                } else {
                                    iC = l1d.C(i);
                                }
                                if (x340Var.e(iC)) {
                                    i5 = 1048576;
                                } else {
                                    i5 = 524288;
                                }
                            }
                            i6 = i17 | i5;
                            if ((599187 & i6) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (x340Var.Y(i6 & 1, z)) {
                                x340Var.d0();
                                if ((i2 & 1) != 0) {
                                    if ((i3 & 8) != 0) {
                                        uwr uwrVar3 = cbx.a;
                                        cvx cvxVar2 = cbx.b(x340Var).b;
                                        f4 = 8.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    if ((i3 & 16) != 0) {
                                        gdxVarS = yla.s(x340Var);
                                    } else {
                                        gdxVarS = gdxVar2;
                                    }
                                    if ((i3 & 32) != 0) {
                                        uwr uwrVar4 = cbx.a;
                                        lee1Var4 = cbx.d(x340Var).h;
                                    } else {
                                        lee1Var4 = lee1Var2;
                                    }
                                    if (i4 != 0) {
                                        f5 = f4;
                                        i8 = 1;
                                        gdxVar4 = gdxVarS;
                                        lee1Var5 = lee1Var4;
                                        z2 = true;
                                    } else {
                                        i8 = i;
                                        f5 = f4;
                                        gdxVar4 = gdxVarS;
                                        z2 = true;
                                        lee1Var5 = lee1Var4;
                                    }
                                } else {
                                    if ((i3 & 8) != 0) {
                                        uwr uwrVar5 = cbx.a;
                                        cvx cvxVar3 = cbx.b(x340Var).b;
                                        f4 = 8.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    if ((i3 & 16) != 0) {
                                        gdxVarS = yla.s(x340Var);
                                    } else {
                                        gdxVarS = gdxVar2;
                                    }
                                    if ((i3 & 32) != 0) {
                                        uwr uwrVar6 = cbx.a;
                                        lee1Var4 = cbx.d(x340Var).h;
                                    } else {
                                        lee1Var4 = lee1Var2;
                                    }
                                    if (i4 != 0) {
                                        f5 = f4;
                                        i8 = 1;
                                        gdxVar4 = gdxVarS;
                                        lee1Var5 = lee1Var4;
                                        z2 = true;
                                    } else {
                                        i8 = i;
                                        f5 = f4;
                                        gdxVar4 = gdxVarS;
                                        z2 = true;
                                        lee1Var5 = lee1Var4;
                                    }
                                }
                                x340Var.s();
                                if (list.isEmpty()) {
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        return;
                                    } else {
                                        d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                                    }
                                } else if (list.size() == z2) {
                                    x340Var.i0(-482820059);
                                    gfh0VarC = t1c.c(een.d, (boolean) r9);
                                    iHashCode = Long.hashCode(x340Var.T);
                                    xos0VarM = x340Var.m();
                                    qim0VarE = zr7.E(x340Var, qim0Var);
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
                                    nko1.H(gfh0VarC, x340Var, y580.O0);
                                    nko1.H(xos0VarM, x340Var, y580.N0);
                                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                    nko1.F(x340Var);
                                    nko1.H(qim0VarE, x340Var, y580.Y);
                                    ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                                    x340Var.r(z2);
                                    x340Var.r(false);
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        return;
                                    } else {
                                        d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                                    }
                                } else {
                                    x340Var.i0(-482757594);
                                    x340Var.r((boolean) r9);
                                    float f7 = f5;
                                    gdx gdxVar6 = gdxVar4;
                                    lee1 lee1Var7 = lee1Var5;
                                    int i18 = i8;
                                    e61 e61Var2 = new e61(i18, list, f7, gdxVar6, lee1Var7, qim0Var, nl3Var);
                                    i7 = i18;
                                    lee1Var3 = lee1Var7;
                                    gdxVar3 = gdxVar6;
                                    f3 = f7;
                                    w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var2, x340Var), x340Var, 3072, 7);
                                }
                                h311VarV.d = d61Var;
                            }
                            x340Var.b0();
                            i7 = i;
                            f3 = f2;
                            gdxVar3 = gdxVar2;
                            lee1Var3 = lee1Var2;
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                                h311VarV.d = d61Var;
                            }
                        }
                        gdxVar2 = gdxVar;
                        int i19 = i11 | i12;
                        if ((i3 & 32) == 0) {
                            lee1Var2 = lee1Var;
                            if (x340Var.i(lee1Var2)) {
                            }
                            int i110 = i19 | i14;
                            i4 = i3 & 64;
                            if (i4 != 0) {
                                i5 = 1572864;
                            } else {
                                if (i == 0) {
                                    iC = -1;
                                } else {
                                    iC = l1d.C(i);
                                }
                                if (x340Var.e(iC)) {
                                    i5 = 1048576;
                                } else {
                                    i5 = 524288;
                                }
                            }
                            i6 = i110 | i5;
                            if ((599187 & i6) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (x340Var.Y(i6 & 1, z)) {
                                x340Var.d0();
                                if ((i2 & 1) != 0) {
                                    if ((i3 & 8) != 0) {
                                        uwr uwrVar7 = cbx.a;
                                        cvx cvxVar4 = cbx.b(x340Var).b;
                                        f4 = 8.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    if ((i3 & 16) != 0) {
                                        gdxVarS = yla.s(x340Var);
                                    } else {
                                        gdxVarS = gdxVar2;
                                    }
                                    if ((i3 & 32) != 0) {
                                        uwr uwrVar8 = cbx.a;
                                        lee1Var4 = cbx.d(x340Var).h;
                                    } else {
                                        lee1Var4 = lee1Var2;
                                    }
                                    if (i4 != 0) {
                                        f5 = f4;
                                        i8 = 1;
                                        gdxVar4 = gdxVarS;
                                        lee1Var5 = lee1Var4;
                                        z2 = true;
                                    } else {
                                        i8 = i;
                                        f5 = f4;
                                        gdxVar4 = gdxVarS;
                                        z2 = true;
                                        lee1Var5 = lee1Var4;
                                    }
                                } else {
                                    if ((i3 & 8) != 0) {
                                        uwr uwrVar9 = cbx.a;
                                        cvx cvxVar5 = cbx.b(x340Var).b;
                                        f4 = 8.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    if ((i3 & 16) != 0) {
                                        gdxVarS = yla.s(x340Var);
                                    } else {
                                        gdxVarS = gdxVar2;
                                    }
                                    if ((i3 & 32) != 0) {
                                        uwr uwrVar10 = cbx.a;
                                        lee1Var4 = cbx.d(x340Var).h;
                                    } else {
                                        lee1Var4 = lee1Var2;
                                    }
                                    if (i4 != 0) {
                                        f5 = f4;
                                        i8 = 1;
                                        gdxVar4 = gdxVarS;
                                        lee1Var5 = lee1Var4;
                                        z2 = true;
                                    } else {
                                        i8 = i;
                                        f5 = f4;
                                        gdxVar4 = gdxVarS;
                                        z2 = true;
                                        lee1Var5 = lee1Var4;
                                    }
                                }
                                x340Var.s();
                                if (list.isEmpty()) {
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        return;
                                    } else {
                                        d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                                    }
                                } else if (list.size() == z2) {
                                    x340Var.i0(-482820059);
                                    gfh0VarC = t1c.c(een.d, (boolean) r9);
                                    iHashCode = Long.hashCode(x340Var.T);
                                    xos0VarM = x340Var.m();
                                    qim0VarE = zr7.E(x340Var, qim0Var);
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
                                    nko1.H(gfh0VarC, x340Var, y580.O0);
                                    nko1.H(xos0VarM, x340Var, y580.N0);
                                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                    nko1.F(x340Var);
                                    nko1.H(qim0VarE, x340Var, y580.Y);
                                    ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                                    x340Var.r(z2);
                                    x340Var.r(false);
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        return;
                                    } else {
                                        d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                                    }
                                } else {
                                    x340Var.i0(-482757594);
                                    x340Var.r((boolean) r9);
                                    float f8 = f5;
                                    gdx gdxVar7 = gdxVar4;
                                    lee1 lee1Var8 = lee1Var5;
                                    int i111 = i8;
                                    e61 e61Var3 = new e61(i111, list, f8, gdxVar7, lee1Var8, qim0Var, nl3Var);
                                    i7 = i111;
                                    lee1Var3 = lee1Var8;
                                    gdxVar3 = gdxVar7;
                                    f3 = f8;
                                    w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var3, x340Var), x340Var, 3072, 7);
                                }
                                h311VarV.d = d61Var;
                            }
                            x340Var.b0();
                            i7 = i;
                            f3 = f2;
                            gdxVar3 = gdxVar2;
                            lee1Var3 = lee1Var2;
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                                h311VarV.d = d61Var;
                            }
                        }
                        lee1Var2 = lee1Var;
                        int i112 = i19 | i14;
                        i4 = i3 & 64;
                        if (i4 != 0) {
                            i5 = 1572864;
                        } else {
                            if (i == 0) {
                                iC = -1;
                            } else {
                                iC = l1d.C(i);
                            }
                            if (x340Var.e(iC)) {
                                i5 = 1048576;
                            } else {
                                i5 = 524288;
                            }
                        }
                        i6 = i112 | i5;
                        if ((599187 & i6) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i6 & 1, z)) {
                            x340Var.d0();
                            if ((i2 & 1) != 0) {
                                if ((i3 & 8) != 0) {
                                    uwr uwrVar11 = cbx.a;
                                    cvx cvxVar6 = cbx.b(x340Var).b;
                                    f4 = 8.0f;
                                } else {
                                    f4 = f2;
                                }
                                if ((i3 & 16) != 0) {
                                    gdxVarS = yla.s(x340Var);
                                } else {
                                    gdxVarS = gdxVar2;
                                }
                                if ((i3 & 32) != 0) {
                                    uwr uwrVar12 = cbx.a;
                                    lee1Var4 = cbx.d(x340Var).h;
                                } else {
                                    lee1Var4 = lee1Var2;
                                }
                                if (i4 != 0) {
                                    f5 = f4;
                                    i8 = 1;
                                    gdxVar4 = gdxVarS;
                                    lee1Var5 = lee1Var4;
                                    z2 = true;
                                } else {
                                    i8 = i;
                                    f5 = f4;
                                    gdxVar4 = gdxVarS;
                                    z2 = true;
                                    lee1Var5 = lee1Var4;
                                }
                            } else {
                                if ((i3 & 8) != 0) {
                                    uwr uwrVar13 = cbx.a;
                                    cvx cvxVar7 = cbx.b(x340Var).b;
                                    f4 = 8.0f;
                                } else {
                                    f4 = f2;
                                }
                                if ((i3 & 16) != 0) {
                                    gdxVarS = yla.s(x340Var);
                                } else {
                                    gdxVarS = gdxVar2;
                                }
                                if ((i3 & 32) != 0) {
                                    uwr uwrVar14 = cbx.a;
                                    lee1Var4 = cbx.d(x340Var).h;
                                } else {
                                    lee1Var4 = lee1Var2;
                                }
                                if (i4 != 0) {
                                    f5 = f4;
                                    i8 = 1;
                                    gdxVar4 = gdxVarS;
                                    lee1Var5 = lee1Var4;
                                    z2 = true;
                                } else {
                                    i8 = i;
                                    f5 = f4;
                                    gdxVar4 = gdxVarS;
                                    z2 = true;
                                    lee1Var5 = lee1Var4;
                                }
                            }
                            x340Var.s();
                            if (list.isEmpty()) {
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    return;
                                } else {
                                    d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                                }
                            } else if (list.size() == z2) {
                                x340Var.i0(-482820059);
                                gfh0VarC = t1c.c(een.d, (boolean) r9);
                                iHashCode = Long.hashCode(x340Var.T);
                                xos0VarM = x340Var.m();
                                qim0VarE = zr7.E(x340Var, qim0Var);
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
                                nko1.H(gfh0VarC, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                                x340Var.r(z2);
                                x340Var.r(false);
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    return;
                                } else {
                                    d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                                }
                            } else {
                                x340Var.i0(-482757594);
                                x340Var.r((boolean) r9);
                                float f9 = f5;
                                gdx gdxVar8 = gdxVar4;
                                lee1 lee1Var9 = lee1Var5;
                                int i113 = i8;
                                e61 e61Var4 = new e61(i113, list, f9, gdxVar8, lee1Var9, qim0Var, nl3Var);
                                i7 = i113;
                                lee1Var3 = lee1Var9;
                                gdxVar3 = gdxVar8;
                                f3 = f9;
                                w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var4, x340Var), x340Var, 3072, 7);
                            }
                            h311VarV.d = d61Var;
                        }
                        x340Var.b0();
                        i7 = i;
                        f3 = f2;
                        gdxVar3 = gdxVar2;
                        lee1Var3 = lee1Var2;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                            h311VarV.d = d61Var;
                        }
                    }
                    f2 = f;
                    int i114 = i9 | i10;
                    if ((i3 & 16) == 0) {
                        gdxVar2 = gdxVar;
                        if (x340Var.i(gdxVar2)) {
                        }
                        int i115 = i114 | i12;
                        if ((i3 & 32) == 0) {
                            lee1Var2 = lee1Var;
                            if (x340Var.i(lee1Var2)) {
                            }
                            int i116 = i115 | i14;
                            i4 = i3 & 64;
                            if (i4 != 0) {
                                i5 = 1572864;
                            } else {
                                if (i == 0) {
                                    iC = -1;
                                } else {
                                    iC = l1d.C(i);
                                }
                                if (x340Var.e(iC)) {
                                    i5 = 1048576;
                                } else {
                                    i5 = 524288;
                                }
                            }
                            i6 = i116 | i5;
                            if ((599187 & i6) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (x340Var.Y(i6 & 1, z)) {
                                x340Var.d0();
                                if ((i2 & 1) != 0) {
                                    if ((i3 & 8) != 0) {
                                        uwr uwrVar15 = cbx.a;
                                        cvx cvxVar8 = cbx.b(x340Var).b;
                                        f4 = 8.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    if ((i3 & 16) != 0) {
                                        gdxVarS = yla.s(x340Var);
                                    } else {
                                        gdxVarS = gdxVar2;
                                    }
                                    if ((i3 & 32) != 0) {
                                        uwr uwrVar16 = cbx.a;
                                        lee1Var4 = cbx.d(x340Var).h;
                                    } else {
                                        lee1Var4 = lee1Var2;
                                    }
                                    if (i4 != 0) {
                                        f5 = f4;
                                        i8 = 1;
                                        gdxVar4 = gdxVarS;
                                        lee1Var5 = lee1Var4;
                                        z2 = true;
                                    } else {
                                        i8 = i;
                                        f5 = f4;
                                        gdxVar4 = gdxVarS;
                                        z2 = true;
                                        lee1Var5 = lee1Var4;
                                    }
                                } else {
                                    if ((i3 & 8) != 0) {
                                        uwr uwrVar17 = cbx.a;
                                        cvx cvxVar9 = cbx.b(x340Var).b;
                                        f4 = 8.0f;
                                    } else {
                                        f4 = f2;
                                    }
                                    if ((i3 & 16) != 0) {
                                        gdxVarS = yla.s(x340Var);
                                    } else {
                                        gdxVarS = gdxVar2;
                                    }
                                    if ((i3 & 32) != 0) {
                                        uwr uwrVar18 = cbx.a;
                                        lee1Var4 = cbx.d(x340Var).h;
                                    } else {
                                        lee1Var4 = lee1Var2;
                                    }
                                    if (i4 != 0) {
                                        f5 = f4;
                                        i8 = 1;
                                        gdxVar4 = gdxVarS;
                                        lee1Var5 = lee1Var4;
                                        z2 = true;
                                    } else {
                                        i8 = i;
                                        f5 = f4;
                                        gdxVar4 = gdxVarS;
                                        z2 = true;
                                        lee1Var5 = lee1Var4;
                                    }
                                }
                                x340Var.s();
                                if (list.isEmpty()) {
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        return;
                                    } else {
                                        d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                                    }
                                } else if (list.size() == z2) {
                                    x340Var.i0(-482820059);
                                    gfh0VarC = t1c.c(een.d, (boolean) r9);
                                    iHashCode = Long.hashCode(x340Var.T);
                                    xos0VarM = x340Var.m();
                                    qim0VarE = zr7.E(x340Var, qim0Var);
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
                                    nko1.H(gfh0VarC, x340Var, y580.O0);
                                    nko1.H(xos0VarM, x340Var, y580.N0);
                                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                    nko1.F(x340Var);
                                    nko1.H(qim0VarE, x340Var, y580.Y);
                                    ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                                    x340Var.r(z2);
                                    x340Var.r(false);
                                    h311VarV = x340Var.v();
                                    if (h311VarV != null) {
                                        return;
                                    } else {
                                        d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                                    }
                                } else {
                                    x340Var.i0(-482757594);
                                    x340Var.r((boolean) r9);
                                    float f10 = f5;
                                    gdx gdxVar9 = gdxVar4;
                                    lee1 lee1Var10 = lee1Var5;
                                    int i117 = i8;
                                    e61 e61Var5 = new e61(i117, list, f10, gdxVar9, lee1Var10, qim0Var, nl3Var);
                                    i7 = i117;
                                    lee1Var3 = lee1Var10;
                                    gdxVar3 = gdxVar9;
                                    f3 = f10;
                                    w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var5, x340Var), x340Var, 3072, 7);
                                }
                                h311VarV.d = d61Var;
                            }
                            x340Var.b0();
                            i7 = i;
                            f3 = f2;
                            gdxVar3 = gdxVar2;
                            lee1Var3 = lee1Var2;
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                                h311VarV.d = d61Var;
                            }
                        }
                        lee1Var2 = lee1Var;
                        int i118 = i115 | i14;
                        i4 = i3 & 64;
                        if (i4 != 0) {
                            i5 = 1572864;
                        } else {
                            if (i == 0) {
                                iC = -1;
                            } else {
                                iC = l1d.C(i);
                            }
                            if (x340Var.e(iC)) {
                                i5 = 1048576;
                            } else {
                                i5 = 524288;
                            }
                        }
                        i6 = i118 | i5;
                        if ((599187 & i6) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i6 & 1, z)) {
                            x340Var.d0();
                            if ((i2 & 1) != 0) {
                                if ((i3 & 8) != 0) {
                                    uwr uwrVar19 = cbx.a;
                                    cvx cvxVar10 = cbx.b(x340Var).b;
                                    f4 = 8.0f;
                                } else {
                                    f4 = f2;
                                }
                                if ((i3 & 16) != 0) {
                                    gdxVarS = yla.s(x340Var);
                                } else {
                                    gdxVarS = gdxVar2;
                                }
                                if ((i3 & 32) != 0) {
                                    uwr uwrVar110 = cbx.a;
                                    lee1Var4 = cbx.d(x340Var).h;
                                } else {
                                    lee1Var4 = lee1Var2;
                                }
                                if (i4 != 0) {
                                    f5 = f4;
                                    i8 = 1;
                                    gdxVar4 = gdxVarS;
                                    lee1Var5 = lee1Var4;
                                    z2 = true;
                                } else {
                                    i8 = i;
                                    f5 = f4;
                                    gdxVar4 = gdxVarS;
                                    z2 = true;
                                    lee1Var5 = lee1Var4;
                                }
                            } else {
                                if ((i3 & 8) != 0) {
                                    uwr uwrVar111 = cbx.a;
                                    cvx cvxVar11 = cbx.b(x340Var).b;
                                    f4 = 8.0f;
                                } else {
                                    f4 = f2;
                                }
                                if ((i3 & 16) != 0) {
                                    gdxVarS = yla.s(x340Var);
                                } else {
                                    gdxVarS = gdxVar2;
                                }
                                if ((i3 & 32) != 0) {
                                    uwr uwrVar112 = cbx.a;
                                    lee1Var4 = cbx.d(x340Var).h;
                                } else {
                                    lee1Var4 = lee1Var2;
                                }
                                if (i4 != 0) {
                                    f5 = f4;
                                    i8 = 1;
                                    gdxVar4 = gdxVarS;
                                    lee1Var5 = lee1Var4;
                                    z2 = true;
                                } else {
                                    i8 = i;
                                    f5 = f4;
                                    gdxVar4 = gdxVarS;
                                    z2 = true;
                                    lee1Var5 = lee1Var4;
                                }
                            }
                            x340Var.s();
                            if (list.isEmpty()) {
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    return;
                                } else {
                                    d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                                }
                            } else if (list.size() == z2) {
                                x340Var.i0(-482820059);
                                gfh0VarC = t1c.c(een.d, (boolean) r9);
                                iHashCode = Long.hashCode(x340Var.T);
                                xos0VarM = x340Var.m();
                                qim0VarE = zr7.E(x340Var, qim0Var);
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
                                nko1.H(gfh0VarC, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                                x340Var.r(z2);
                                x340Var.r(false);
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    return;
                                } else {
                                    d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                                }
                            } else {
                                x340Var.i0(-482757594);
                                x340Var.r((boolean) r9);
                                float f11 = f5;
                                gdx gdxVar10 = gdxVar4;
                                lee1 lee1Var11 = lee1Var5;
                                int i119 = i8;
                                e61 e61Var6 = new e61(i119, list, f11, gdxVar10, lee1Var11, qim0Var, nl3Var);
                                i7 = i119;
                                lee1Var3 = lee1Var11;
                                gdxVar3 = gdxVar10;
                                f3 = f11;
                                w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var6, x340Var), x340Var, 3072, 7);
                            }
                            h311VarV.d = d61Var;
                        }
                        x340Var.b0();
                        i7 = i;
                        f3 = f2;
                        gdxVar3 = gdxVar2;
                        lee1Var3 = lee1Var2;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                            h311VarV.d = d61Var;
                        }
                    }
                    gdxVar2 = gdxVar;
                    int i1110 = i114 | i12;
                    if ((i3 & 32) == 0) {
                        lee1Var2 = lee1Var;
                        if (x340Var.i(lee1Var2)) {
                        }
                        int i1111 = i1110 | i14;
                        i4 = i3 & 64;
                        if (i4 != 0) {
                            i5 = 1572864;
                        } else {
                            if (i == 0) {
                                iC = -1;
                            } else {
                                iC = l1d.C(i);
                            }
                            if (x340Var.e(iC)) {
                                i5 = 1048576;
                            } else {
                                i5 = 524288;
                            }
                        }
                        i6 = i1111 | i5;
                        if ((599187 & i6) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i6 & 1, z)) {
                            x340Var.d0();
                            if ((i2 & 1) != 0) {
                                if ((i3 & 8) != 0) {
                                    uwr uwrVar113 = cbx.a;
                                    cvx cvxVar12 = cbx.b(x340Var).b;
                                    f4 = 8.0f;
                                } else {
                                    f4 = f2;
                                }
                                if ((i3 & 16) != 0) {
                                    gdxVarS = yla.s(x340Var);
                                } else {
                                    gdxVarS = gdxVar2;
                                }
                                if ((i3 & 32) != 0) {
                                    uwr uwrVar114 = cbx.a;
                                    lee1Var4 = cbx.d(x340Var).h;
                                } else {
                                    lee1Var4 = lee1Var2;
                                }
                                if (i4 != 0) {
                                    f5 = f4;
                                    i8 = 1;
                                    gdxVar4 = gdxVarS;
                                    lee1Var5 = lee1Var4;
                                    z2 = true;
                                } else {
                                    i8 = i;
                                    f5 = f4;
                                    gdxVar4 = gdxVarS;
                                    z2 = true;
                                    lee1Var5 = lee1Var4;
                                }
                            } else {
                                if ((i3 & 8) != 0) {
                                    uwr uwrVar115 = cbx.a;
                                    cvx cvxVar13 = cbx.b(x340Var).b;
                                    f4 = 8.0f;
                                } else {
                                    f4 = f2;
                                }
                                if ((i3 & 16) != 0) {
                                    gdxVarS = yla.s(x340Var);
                                } else {
                                    gdxVarS = gdxVar2;
                                }
                                if ((i3 & 32) != 0) {
                                    uwr uwrVar116 = cbx.a;
                                    lee1Var4 = cbx.d(x340Var).h;
                                } else {
                                    lee1Var4 = lee1Var2;
                                }
                                if (i4 != 0) {
                                    f5 = f4;
                                    i8 = 1;
                                    gdxVar4 = gdxVarS;
                                    lee1Var5 = lee1Var4;
                                    z2 = true;
                                } else {
                                    i8 = i;
                                    f5 = f4;
                                    gdxVar4 = gdxVarS;
                                    z2 = true;
                                    lee1Var5 = lee1Var4;
                                }
                            }
                            x340Var.s();
                            if (list.isEmpty()) {
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    return;
                                } else {
                                    d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                                }
                            } else if (list.size() == z2) {
                                x340Var.i0(-482820059);
                                gfh0VarC = t1c.c(een.d, (boolean) r9);
                                iHashCode = Long.hashCode(x340Var.T);
                                xos0VarM = x340Var.m();
                                qim0VarE = zr7.E(x340Var, qim0Var);
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
                                nko1.H(gfh0VarC, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                                x340Var.r(z2);
                                x340Var.r(false);
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    return;
                                } else {
                                    d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                                }
                            } else {
                                x340Var.i0(-482757594);
                                x340Var.r((boolean) r9);
                                float f12 = f5;
                                gdx gdxVar11 = gdxVar4;
                                lee1 lee1Var12 = lee1Var5;
                                int i1112 = i8;
                                e61 e61Var7 = new e61(i1112, list, f12, gdxVar11, lee1Var12, qim0Var, nl3Var);
                                i7 = i1112;
                                lee1Var3 = lee1Var12;
                                gdxVar3 = gdxVar11;
                                f3 = f12;
                                w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var7, x340Var), x340Var, 3072, 7);
                            }
                            h311VarV.d = d61Var;
                        }
                        x340Var.b0();
                        i7 = i;
                        f3 = f2;
                        gdxVar3 = gdxVar2;
                        lee1Var3 = lee1Var2;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                            h311VarV.d = d61Var;
                        }
                    }
                    lee1Var2 = lee1Var;
                    int i1113 = i1110 | i14;
                    i4 = i3 & 64;
                    if (i4 != 0) {
                        i5 = 1572864;
                    } else {
                        if (i == 0) {
                            iC = -1;
                        } else {
                            iC = l1d.C(i);
                        }
                        if (x340Var.e(iC)) {
                            i5 = 1048576;
                        } else {
                            i5 = 524288;
                        }
                    }
                    i6 = i1113 | i5;
                    if ((599187 & i6) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i6 & 1, z)) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if ((i3 & 8) != 0) {
                                uwr uwrVar117 = cbx.a;
                                cvx cvxVar14 = cbx.b(x340Var).b;
                                f4 = 8.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & 16) != 0) {
                                gdxVarS = yla.s(x340Var);
                            } else {
                                gdxVarS = gdxVar2;
                            }
                            if ((i3 & 32) != 0) {
                                uwr uwrVar118 = cbx.a;
                                lee1Var4 = cbx.d(x340Var).h;
                            } else {
                                lee1Var4 = lee1Var2;
                            }
                            if (i4 != 0) {
                                f5 = f4;
                                i8 = 1;
                                gdxVar4 = gdxVarS;
                                lee1Var5 = lee1Var4;
                                z2 = true;
                            } else {
                                i8 = i;
                                f5 = f4;
                                gdxVar4 = gdxVarS;
                                z2 = true;
                                lee1Var5 = lee1Var4;
                            }
                        } else {
                            if ((i3 & 8) != 0) {
                                uwr uwrVar119 = cbx.a;
                                cvx cvxVar15 = cbx.b(x340Var).b;
                                f4 = 8.0f;
                            } else {
                                f4 = f2;
                            }
                            if ((i3 & 16) != 0) {
                                gdxVarS = yla.s(x340Var);
                            } else {
                                gdxVarS = gdxVar2;
                            }
                            if ((i3 & 32) != 0) {
                                uwr uwrVar1110 = cbx.a;
                                lee1Var4 = cbx.d(x340Var).h;
                            } else {
                                lee1Var4 = lee1Var2;
                            }
                            if (i4 != 0) {
                                f5 = f4;
                                i8 = 1;
                                gdxVar4 = gdxVarS;
                                lee1Var5 = lee1Var4;
                                z2 = true;
                            } else {
                                i8 = i;
                                f5 = f4;
                                gdxVar4 = gdxVarS;
                                z2 = true;
                                lee1Var5 = lee1Var4;
                            }
                        }
                        x340Var.s();
                        if (list.isEmpty()) {
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                return;
                            } else {
                                d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 0);
                            }
                        } else if (list.size() == z2) {
                            x340Var.i0(-482820059);
                            gfh0VarC = t1c.c(een.d, (boolean) r9);
                            iHashCode = Long.hashCode(x340Var.T);
                            xos0VarM = x340Var.m();
                            qim0VarE = zr7.E(x340Var, qim0Var);
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
                            nko1.H(gfh0VarC, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            ((w51) o7h.V0(list)).c.invoke(x340Var, Integer.valueOf((int) r9));
                            x340Var.r(z2);
                            x340Var.r(false);
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                return;
                            } else {
                                d61Var = new d61(list, qim0Var, nl3Var, f5, gdxVar4, lee1Var5, i8, i2, i3, (byte) 1);
                            }
                        } else {
                            x340Var.i0(-482757594);
                            x340Var.r((boolean) r9);
                            float f13 = f5;
                            gdx gdxVar12 = gdxVar4;
                            lee1 lee1Var13 = lee1Var5;
                            int i1114 = i8;
                            e61 e61Var8 = new e61(i1114, list, f13, gdxVar12, lee1Var13, qim0Var, nl3Var);
                            i7 = i1114;
                            lee1Var3 = lee1Var13;
                            gdxVar3 = gdxVar12;
                            f3 = f13;
                            w2g0.c((qim0) null, (tl3) null, apo.r(2023951954, e61Var8, x340Var), x340Var, 3072, 7);
                        }
                        h311VarV.d = d61Var;
                    }
                    x340Var.b0();
                    i7 = i;
                    f3 = f2;
                    gdxVar3 = gdxVar2;
                    lee1Var3 = lee1Var2;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        d61Var = new d61(list, qim0Var, nl3Var, f3, gdxVar3, lee1Var3, i7, i2, i3, (byte) 2);
                        h311VarV.d = d61Var;
                    }
                }

                public static final void c(nl3 nl3Var, float f, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
                    int i2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-1182361403);
                    if ((i & 6) == 0) {
                        i2 = (x340Var.i(nl3Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.d(f) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= x340Var.i(qim0Var) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
                    }
                    if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                        mbh mbhVarA = jbh.a(new d36(f, false, new g21(een.Z, (byte) 28)), nl3Var, x340Var, ((((i2 >> 6) & 14) | ((i2 << 6) & 896)) >> 3) & 112);
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
                        dv20.l((i2 >> 9) & 14, j2iVar, x340Var, true);
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new f61(nl3Var, f, qim0Var, j2iVar, i, (byte) 0);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:30:0x0053  */
                /* JADX WARN: Code duplicated, block: B:31:0x0055  */
                /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:35:0x0060  */
                /* JADX WARN: Code duplicated, block: B:36:0x0064  */
                /* JADX WARN: Code duplicated, block: B:38:0x0093  */
                /* JADX WARN: Code duplicated, block: B:41:0x009f  */
                /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
                public static final void d(String str, qim0 qim0Var, ksl kslVar, b0k b0kVar, int i, int i2) {
                    String str2;
                    int i3;
                    ksl kslVar2;
                    boolean z;
                    b0k b0kVar2;
                    ksl kslVar3;
                    h311 h311VarV;
                    ksl kslVar4;
                    b0k b0kVar3 = (x340) b0kVar;
                    b0kVar3.k0(-107927093);
                    if ((i & 6) == 0) {
                        str2 = str;
                        i3 = (b0kVar3.g(str2) ? 4 : 2) | i;
                    } else {
                        str2 = str;
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= b0kVar3.g(qim0Var) ? 32 : 16;
                    }
                    int i4 = i2 & 4;
                    if (i4 == 0) {
                        if ((i & 384) == 0) {
                            kslVar2 = kslVar;
                            i3 |= b0kVar3.g(kslVar2) ? 256 : 128;
                        }
                        if ((i3 & 147) != 146) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i3 & 1, z)) {
                            if (i4 != 0) {
                                kslVar4 = isl.a;
                            } else {
                                kslVar4 = kslVar2;
                            }
                            Uri uri = Uri.parse(str2);
                            cbx.a.getClass();
                            b0kVar2 = b0kVar3;
                            eso1.e(uri, kslVar4, qim0Var, (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, oux.a, true, false, b0kVar2, ((i3 >> 3) & 112) | 27648 | ((i3 << 3) & 896), 6, 2496);
                            kslVar3 = kslVar4;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            kslVar3 = kslVar2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new qx1((Object) str2, (Object) qim0Var, (Object) kslVar3, i, i2, (byte) 5);
                        }
                    }
                    i3 |= 384;
                    kslVar2 = kslVar;
                    if ((i3 & 147) != 146) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        if (i4 != 0) {
                            kslVar4 = isl.a;
                        } else {
                            kslVar4 = kslVar2;
                        }
                        Uri uri2 = Uri.parse(str2);
                        cbx.a.getClass();
                        b0kVar2 = b0kVar3;
                        eso1.e(uri2, kslVar4, qim0Var, (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, oux.a, true, false, b0kVar2, ((i3 >> 3) & 112) | 27648 | ((i3 << 3) & 896), 6, 2496);
                        kslVar3 = kslVar4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        kslVar3 = kslVar2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new qx1((Object) str2, (Object) qim0Var, (Object) kslVar3, i, i2, (byte) 5);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void e(g2c g2cVar, String str, String str2, String str3, sxq0 sxq0Var, List list, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    b0k b0kVar2 = (x340) b0kVar;
                    b0kVar2.k0(-1122275912);
                    int i2 = i | (b0kVar2.g(g2cVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.g(str2) ? 256 : 128) | (b0kVar2.g(str3) ? 2048 : 1024) | (b0kVar2.i(sxq0Var) ? 16384 : 8192) | (b0kVar2.i(list) ? 131072 : 65536);
                    if (b0kVar2.Y(i2 & 1, (74899 & i2) != 74898)) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar2).b;
                        zov0 zov0Var = cbx.b(b0kVar2).g;
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarA = uyn1.A(u291.d(nim0Var, 1.0f), 8.0f, 8.0f, 8.0f, 24.0f);
                        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM = b0kVar2.m();
                        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarA);
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
                        f(str, str2, str3, sxq0Var, b0kVar2, (i2 >> 3) & 8190);
                        b0kVar2 = b0kVar2;
                        op71.g(b0kVar2, u291.h(nim0Var, 12.0f));
                        g(list, u291.f(new wnb0(1.0f, true), 1.0f), b0kVar2, (i2 >> 15) & 14);
                        b0kVar2.r(true);
                        zpn1.f(u291.h(uyn1.B(g2cVar.a(nim0Var, een.Y), 0.0f, 0.0f, 8.0f, 8.0f, 3), 16.0f), 0L, b0kVar2, 0, 2);
                    } else {
                        b0kVar2.b0();
                    }
                    h311 h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new k40(g2cVar, str, str2, str3, sxq0Var, list, i, (byte) 15);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void f(String str, String str2, String str3, sxq0 sxq0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    String str4;
                    int i2;
                    String str5 = str3;
                    sxq0 sxq0Var2 = sxq0Var;
                    b0k b0kVar2 = (x340) b0kVar;
                    b0kVar2.k0(-1107713985);
                    j06 j06Var = ((x340) b0kVar2).a;
                    if ((i & 6) == 0) {
                        str4 = str;
                        i2 = (b0kVar2.g(str4) ? 4 : 2) | i;
                    } else {
                        str4 = str;
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= b0kVar2.g(str2) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= b0kVar2.g(str5) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= b0kVar2.i(sxq0Var2) ? 2048 : 1024;
                    }
                    int i3 = i2;
                    if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar2).b;
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 48);
                        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM = b0kVar2.m();
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
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
                        int i4 = i3 >> 3;
                        int i5 = i4 & 14;
                        jsl jslVarC = two1.C(2131962251, i5, str2, b0kVar2);
                        zov0 zov0Var = cbx.b(b0kVar2).g;
                        qim0 qim0VarR = u291.r(nim0Var, 88.0f);
                        cua cuaVar = cbx.b(b0kVar2).f;
                        d(str4, i1p1.q(qim0VarR, er31.b(4.0f)), jslVarC, b0kVar2, i3 & 14, 0);
                        wnb0 wnb0VarK = c13.k(nim0Var, 16.0f, b0kVar2, 1.0f, true);
                        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                        int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM2 = b0kVar2.m();
                        qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0VarK);
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
                        b0kVar2 = b0kVar2;
                        uwo1.e(str2, null, cbx.d(b0kVar2).h, u7h.f, null, null, 2, false, new cjc0(2), 0, null, b0kVar2, i5 | 1575936, 0, 1714);
                        op71.g(b0kVar2, u291.h(nim0Var, 6.0f));
                        str5 = str3;
                        sxq0Var2 = sxq0Var;
                        l(sxq0Var2, str5, b0kVar2, ((i3 >> 9) & 14) | (i4 & 112));
                        b0kVar2.r(true);
                        b0kVar2.r(true);
                    } else {
                        b0kVar2.b0();
                    }
                    h311 h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vqa(i, str, str2, str5, sxq0Var2, (byte) 25);
                    }
                }

                public static final void g(List list, qim0 qim0Var, b0k b0kVar, int i) {
                    int i2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(964837602);
                    if ((i & 6) == 0) {
                        i2 = (x340Var.i(list) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.g(qim0Var) ? 32 : 16;
                    }
                    if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
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
                        x340Var.i0(2001762644);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            j((fi90) it.next(), x340Var, 0);
                        }
                        x340Var.r(false);
                        x340Var.r(true);
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new y6h(list, qim0Var, i, (byte) 0);
                    }
                }

                public static final void h(llw0 llw0Var, String str, String str2, String str3, sxq0 sxq0Var, List list, qim0 qim0Var, b0k b0kVar, int i) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(1913387067);
                    int i2 = i | (x340Var.g(llw0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.i(sxq0Var) ? 16384 : 8192) | (x340Var.i(list) ? 131072 : 65536) | (x340Var.g(qim0Var) ? 1048576 : 524288);
                    if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
                        w2g0.c(r(zr7.i(xcg1.k(cbx.a, u291.f(qim0Var, 1.0f)), gce0.a1), llw0Var), (tl3) null, apo.r(-1517063003, new jb1((Object) str, (Object) str2, (Object) str3, (Object) sxq0Var, (Object) list, (byte) 8), x340Var), x340Var, 3072, 6);
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ta5(llw0Var, str, str2, str3, sxq0Var, list, qim0Var, i, (byte) 6);
                    }
                }

                public static final void i(llw0 llw0Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
                    qim0 qim0Var2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-2083393989);
                    int i2 = (x340Var.g(llw0Var) ? 4 : 2) | i | 48;
                    if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                        qim0 qim0Var3 = nim0.a;
                        qim0 qim0VarK = xcg1.k(cbx.a, u291.f(qim0Var3, 1.0f));
                        if (llw0Var instanceof ilw0) {
                            ilw0 ilw0Var = (ilw0) llw0Var;
                            qim0VarK = r(qim0VarK, new ilw0(uah.d(ilw0Var.a, -16777216, 0.3f), uah.d(ilw0Var.b, -16777216, 0.3f), ilw0Var.c));
                        }
                        gfh0 gfh0VarC = t1c.c(een.h, false);
                        int iHashCode = Long.hashCode(x340Var.T);
                        xos0 xos0VarM = x340Var.m();
                        qim0 qim0VarE = zr7.E(x340Var, qim0VarK);
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
                        dv20.l(6, j2iVar, x340Var, true);
                        qim0Var2 = qim0Var3;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new swc(llw0Var, qim0Var2, j2iVar, i, (byte) 22);
                    }
                }

                public static final void j(fi90 fi90Var, b0k b0kVar, int i) {
                    fi90 fi90Var2;
                    byte b2;
                    lee1 lee1Var;
                    llj lljVar = y580.Y;
                    llj lljVar2 = y580.R0;
                    llj lljVar3 = y580.N0;
                    llj lljVar4 = y580.O0;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(868622961);
                    j06 j06Var = x340Var.a;
                    int i2 = i | (x340Var.i(fi90Var) ? 4 : 2);
                    if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarH = u291.h(nim0Var, 40.0f);
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
                        int iHashCode = Long.hashCode(x340Var.T);
                        xos0 xos0VarM = x340Var.m();
                        qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
                        nko1.H(jw31VarA, x340Var, lljVar4);
                        nko1.H(xos0VarM, x340Var, lljVar3);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, lljVar);
                        String str = fi90Var.c;
                        String str2 = fi90Var.a;
                        qim0 qim0VarR = u291.r(nim0Var, 40.0f);
                        cua cuaVar = cbx.b(x340Var).f;
                        String str3 = str2;
                        d(str, i1p1.q(qim0VarR, er31.b(4.0f)), null, x340Var, 0, 4);
                        cvx cvxVar = cbx.b(x340Var).b;
                        op71.g(x340Var, u291.v(nim0Var, 12.0f));
                        yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
                        wat watVar = (wat) x340Var.k(t4k.h);
                        lee1 lee1Var2 = cbx.d(x340Var).j;
                        lee1 lee1Var3 = cbx.d(x340Var).m;
                        String str4 = fi90Var.b;
                        boolean zG = x340Var.g(str3) | x340Var.g(str4) | x340Var.d(40.0f) | x340Var.g(watVar) | x340Var.g(lee1Var2) | x340Var.g(lee1Var3);
                        Object objT = x340Var.T();
                        if (zG || objT == fkj0.X) {
                            int iI0 = watVar.i0(40.0f);
                            float f = 1.0f;
                            lee1 lee1Var4 = lee1Var2;
                            lee1 lee1VarC = lee1Var3;
                            while (true) {
                                if (f <= 0.6f) {
                                    lee1Var = lee1Var4;
                                    break;
                                }
                                yae1 yae1Var = yae1VarQ;
                                String str5 = str3;
                                y9e1 y9e1VarA = yae1.a(yae1Var, str5, lee1Var4, 0, false, 1, 0L, (flb0) null, (xat) null, 996);
                                lee1 lee1Var5 = lee1Var4;
                                String str6 = str4;
                                lee1Var = lee1Var5;
                                yae1VarQ = yae1Var;
                                if (((int) (yae1.a(yae1VarQ, str6, lee1VarC, 0, false, 1, 0L, (flb0) null, (xat) null, 996).c & 4294967295L)) + ((int) (y9e1VarA.c & 4294967295L)) <= iI0) {
                                    break;
                                }
                                f -= 0.05f;
                                lee1 lee1VarC2 = C(lee1Var2, f);
                                lee1VarC = C(lee1Var3, f);
                                str3 = str5;
                                str4 = str6;
                                lee1Var4 = lee1VarC2;
                            }
                            mmr0 mmr0Var = new mmr0(lee1Var, lee1VarC);
                            x340Var.s0(mmr0Var);
                            objT = mmr0Var;
                        }
                        mmr0 mmr0Var2 = (mmr0) objT;
                        lee1 lee1Var6 = (lee1) mmr0Var2.a;
                        lee1 lee1Var7 = (lee1) mmr0Var2.b;
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                        hzj.A.getClass();
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA, x340Var, lljVar4);
                        nko1.H(xos0VarM2, x340Var, lljVar3);
                        nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE2, x340Var, lljVar);
                        fi90Var2 = fi90Var;
                        b2 = 1;
                        uwo1.e(fi90Var2.a, null, lee1Var6, u7h.f, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1575936, 0, 1714);
                        String str7 = fi90Var2.b;
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(str7, null, lee1Var7, ((yex) zex.a.d).g, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1714);
                        x340Var = x340Var;
                        x340Var.r(true);
                        x340Var.r(true);
                    } else {
                        fi90Var2 = fi90Var;
                        b2 = 1;
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new tqa(fi90Var2, i, b2);
                    }
                }

                public static final void k(a6q0 a6q0Var, boolean z, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
                    int i2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(1494433572);
                    if ((i & 6) == 0) {
                        i2 = (x340Var.g(a6q0Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.h(z) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= x340Var.g(qim0Var) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
                    }
                    byte b2 = 0;
                    if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                        boolean zJ = u890.j(a6q0Var.a(), gnt.a);
                        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
                        int i3 = (i2 >> 3) & 14;
                        w3p1.c(z, null, zJ, apo.r(-233939325, new ak10(j2iVar, (byte) 15), x340Var), x340Var, i3 | 3072, 2);
                        vby0.a(i3 | 384, apo.r(2070989892, new r7e0(a6q0Var, context, zJ, b2), x340Var), x340Var, (qim0) null, z);
                        x340Var.r(true);
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new d30(a6q0Var, z, qim0Var, j2iVar, i, (byte) 28);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void l(sxq0 sxq0Var, String str, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    int i2;
                    b0k b0kVar2;
                    b0k b0kVar3;
                    String str2 = str;
                    b0k b0kVar4 = (x340) b0kVar;
                    b0kVar4.k0(-960590383);
                    if ((i & 6) == 0) {
                        i2 = i | (b0kVar4.i(sxq0Var) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= b0kVar4.g(str2) ? 32 : 16;
                    }
                    int i3 = i2;
                    if (b0kVar4.Y(i3 & 1, (i3 & 19) != 18)) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar4).b;
                        zov0 zov0Var = cbx.b(b0kVar4).g;
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar4, 48);
                        int iHashCode = Long.hashCode(((x340) b0kVar4).T);
                        xos0 xos0VarM = b0kVar4.m();
                        qim0 qim0VarE = zr7.E(b0kVar4, nim0Var);
                        hzj.A.getClass();
                        if (((x340) b0kVar4).a == null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(hmb0.t1);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(jw31VarA, b0kVar4, y580.O0);
                        nko1.H(xos0VarM, b0kVar4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                        nko1.F(b0kVar4);
                        nko1.H(qim0VarE, b0kVar4, y580.Y);
                        if (sxq0Var instanceof pxq0) {
                            b0kVar4.i0(1903363489);
                            b0kVar3 = b0kVar4;
                            d(((pxq0) sxq0Var).a, i1p1.q(qim0VarR, er31.a), null, b0kVar3, 0, 4);
                            ab80.p(nim0Var, 4.0f, b0kVar4, false);
                        } else if (sxq0Var instanceof rxq0) {
                            b0kVar4.i0(1903542545);
                            w0h1.a(wsx.c, isl.a, qim0VarR, cbx.a(b0kVar4).c.c, 0L, false, b0kVar4, wsx.d | 48, 48);
                            b0kVar3 = b0kVar4;
                            ab80.p(nim0Var, 4.0f, b0kVar3, false);
                        } else {
                            b0kVar3 = b0kVar4;
                            if (!(sxq0Var instanceof qxq0)) {
                                throw p3d1.k(b0kVar3, -1185528356, false);
                            }
                            b0kVar3.i0(-1185511591);
                            b0kVar3.r(false);
                        }
                        b0k b0kVar5 = b0kVar3;
                        str2 = str;
                        uwo1.e(str2, null, cbx.d(b0kVar3).m, u7h.f, null, null, 2, false, new cjc0(1), 0, null, b0kVar5, ((i3 >> 3) & 14) | 1575936, 0, 1714);
                        b0kVar2 = b0kVar5;
                        b0kVar2.r(true);
                    } else {
                        b0kVar2 = b0kVar4;
                        b0kVar2.b0();
                    }
                    h311 h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new g90(sxq0Var, str2, i, (byte) 28);
                    }
                }

                public static final List m(nbe1 nbe1Var, bfn0 bfn0Var) {
                    if (bfn0Var != null && bfn0Var.c != 0) {
                        return o7h.l1(bfn0Var.f());
                    }
                    if (nbe1Var != null) {
                        long j = nbe1Var.a;
                        if (!nbe1.d(j)) {
                            return Collections.singletonList(new ze5(nbe1.g(j), nbe1.f(j), new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439)));
                        }
                    }
                    return z6x.a;
                }

                public static final a4p1 n(Intent intent) {
                    boolean booleanExtra = intent.getBooleanExtra("extra_pop_current_fragment", false);
                    String stringExtra = intent.getStringExtra("extra_fragment_tag");
                    boolean booleanExtra2 = intent.getBooleanExtra("extra_clear_backstack", false);
                    if (booleanExtra) {
                        return ju9.c;
                    }
                    if (stringExtra == null || stringExtra.length() == 0) {
                        return booleanExtra2 ? hu9.c : gu9.c;
                    }
                    return new iu9(stringExtra);
                }

                public static final ee5 o(Intent intent) {
                    return new ee5(intent.getBooleanExtra("extra_crossfade", false), intent.getIntExtra("extra_animation_in", 0), intent.getIntExtra("extra_animation_out", 0));
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
                public static final void p(AbortFlowException abortFlowException, gaa0 gaa0Var) throws AbortFlowException {
                    if (abortFlowException.a != gaa0Var) {
                        throw abortFlowException;
                    }
                }

                public static final void q(y7e1 y7e1Var) {
                    h4e1 h4e1VarH = y7e1Var.h();
                    try {
                        h4e1VarH.k(0, h4e1VarH.c.length(), "");
                        u2p1.p(h4e1VarH);
                        y7e1Var.a(h4e1VarH);
                    } finally {
                        y7e1Var.c();
                    }
                }

                public static final qim0 r(qim0 qim0Var, llw0 llw0Var) {
                    if (!(llw0Var instanceof ilw0)) {
                        return qim0Var;
                    }
                    ilw0 ilw0Var = (ilw0) llw0Var;
                    int i = ilw0Var.b;
                    int i2 = ilw0Var.a;
                    return i2 == i ? dug.f(qim0Var, z4p1.e(i2), d4o1.a) : dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(z4p1.e(i2)), new u7h(z4p1.e(i))}), 0.0f, 0.0f, 14), null, 0.0f, 6);
                }

                public static bt31 s(htv htvVar, String str) {
                    for (ftv ftvVar : htvVar.l) {
                        if (u890.j(ftvVar.a, str)) {
                            return new bt31(ftvVar.b, ftvVar.a);
                        }
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }

                public static final long t(PlayerState playerState) {
                    Long l = (Long) playerState.position(System.currentTimeMillis()).h();
                    if (l != null) {
                        return l.longValue();
                    }
                    return 0L;
                }

                public static final b180 u() {
                    b180 b180Var = b;
                    if (b180Var != null) {
                        return b180Var;
                    }
                    a180 a180Var = new a180("Encore.Vector.SearchActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
                    int i = bui1.a;
                    long j = u7h.b;
                    n6a1 n6a1Var = new n6a1(j);
                    cwh0 cwh0VarG = lf51.g(7.0f, 1.75f);
                    cwh0VarG.c(5.25f, 5.25f, true, false, 0.0f, 10.5f);
                    cwh0VarG.c(5.25f, 5.25f, false, false, 0.0f, -10.5f);
                    cwh0VarG.l(0.25f, 7.0f);
                    cwh0VarG.c(6.75f, 6.75f, true, true, 12.096f, 4.12f);
                    cwh0VarG.k(3.184f, 3.185f);
                    cwh0VarG.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
                    cwh0VarG.j(11.304f, 12.2f);
                    cwh0VarG.b(6.75f, 6.75f, false, true, 0.25f, 7.0f);
                    a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
                    n6a1 n6a1Var2 = new n6a1(j);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new f9s0(10.75f, 7.0f));
                    arrayList.add(new j9s0(3.75f, 3.75f, 0.0f, true, true, -7.5f, 0.0f));
                    arrayList.add(new j9s0(3.75f, 3.75f, 0.0f, false, true, 7.5f, 0.0f));
                    a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
                    b180 b180VarB = a180Var.b();
                    b = b180VarB;
                    return b180VarB;
                }

                public static final b8e1 v(h4e1 h4e1Var) {
                    mee1 mee1Var = h4e1Var.d;
                    if (mee1Var != null) {
                        return new b8e1(new mee1(mee1Var, false), h4e1Var.c.length());
                    }
                    return null;
                }

                public static final String w(PlayerState playerState) {
                    String strUri;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    return (contextTrack == null || (strUri = contextTrack.uri()) == null) ? "" : strUri;
                }

                public static final boolean x(PlayerState playerState) {
                    return playerState.track().c() && A(playerState) < 1 && playerState.isPaused();
                }

                public static final boolean y(PlayerState playerState) {
                    return playerState.positionAsOfTimestamp().c() && !playerState.isPaused() && ((Number) playerState.playbackSpeed().e(Double.valueOf(0.0d))).doubleValue() > 0.0d;
                }

                public static final boolean z(PlayerState playerState) {
                    String strUri;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    return (contextTrack == null || (strUri = contextTrack.uri()) == null || !nhc1.Y(strUri, "spotify:room", false)) ? false : true;
                }
            }
