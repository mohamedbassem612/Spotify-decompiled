package p;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.SpotifyMainActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class eqn1 {
    public static final djm0 a = new djm0((Method) null, (Method) null, (Method) null);
    public static djm0 b;
    public static b180 c;

    public static void A(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.m1 = ynb0Var;
    }

    public static void B(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.n1 = ynb0Var;
    }

    public static void C(SpotifyMainActivity spotifyMainActivity, t2j0 t2j0Var) {
        spotifyMainActivity.A1 = t2j0Var;
    }

    public static void D(SpotifyMainActivity spotifyMainActivity, t0n0 t0n0Var) {
        spotifyMainActivity.y1 = t0n0Var;
    }

    public static void E(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.B1 = ynb0Var;
    }

    public static void F(SpotifyMainActivity spotifyMainActivity, uwn0 uwn0Var) {
        spotifyMainActivity.i1 = uwn0Var;
    }

    public static void G(SpotifyMainActivity spotifyMainActivity, yxn0 yxn0Var) {
        spotifyMainActivity.r1 = yxn0Var;
    }

    public static void H(SpotifyMainActivity spotifyMainActivity, ciq ciqVar) {
        spotifyMainActivity.s1 = ciqVar;
    }

    public static void I(SpotifyMainActivity spotifyMainActivity, ap31 ap31Var) {
        spotifyMainActivity.o1 = ap31Var;
    }

    public static void J(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.l1 = ynb0Var;
    }

    public static void K(SpotifyMainActivity spotifyMainActivity, yh0 yh0Var) {
        spotifyMainActivity.q1 = yh0Var;
    }

    public static void L(SpotifyMainActivity spotifyMainActivity, ni61 ni61Var) {
        spotifyMainActivity.p1 = ni61Var;
    }

    public static void M(SpotifyMainActivity spotifyMainActivity, xh81 xh81Var) {
        spotifyMainActivity.z1 = xh81Var;
    }

    public static final boolean N(String str) {
        Set set = s4b1.f;
        return uic.x(str).c == blc0.Pg;
    }

    public static final boolean O(String str, boolean z) {
        if (N(str)) {
            return true;
        }
        if (!z) {
            return false;
        }
        Set set = s4b1.f;
        return uic.x(str).c == blc0.ti;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void P(v161 v161Var, int i, kmy kmyVar) throws KotlinNothingValueException {
        bfn0 bfn0Var = new bfn0(0, new v161[16]);
        List listI = v161Var.i(false, false);
        while (true) {
            bfn0Var.c(bfn0Var.c, listI);
            while (true) {
                int i2 = bfn0Var.c;
                if (i2 == 0) {
                    return;
                }
                v161 v161Var2 = (v161) bfn0Var.l(i2 - 1);
                boolean zG = ggo1.G(v161Var2);
                o161 o161Var = v161Var2.d;
                nen0 nen0Var = o161Var.a;
                if (!zG && !nen0Var.c(z161.j)) {
                    ndo0 ndo0VarD = v161Var2.d();
                    if (ndo0VarD == null) {
                        throw l1d.w("Expected semantics node to have a coordinator.");
                    }
                    ur80 ur80VarH = hm5.H(nho1.n(ndo0VarD, true));
                    if (ur80VarH.e()) {
                        continue;
                    } else {
                        Object objG = o161Var.a.g(m161.e);
                        if (objG == null) {
                            objG = null;
                        }
                        vu30 vu30Var = (vu30) objG;
                        Object objG2 = nen0Var.g(z161.w);
                        pq41 pq41Var = (pq41) (objG2 != null ? objG2 : null);
                        if (vu30Var == null || pq41Var == null || ((Number) pq41Var.b.invoke()).floatValue() <= 0.0f) {
                            listI = v161Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            kmyVar.invoke(new wq41(v161Var2, i3, ur80VarH, ndo0VarD));
                            P(v161Var2, i3, kmyVar);
                        }
                    }
                }
            }
        }
    }

    public static final void a(dxs0 dxs0Var, ozg ozgVar, String str, boolean z, String str2, List list, int i, b0k b0kVar, int i2) {
        err0 err0Var = ozgVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-720427937);
        byte b2 = 2;
        int i3 = i2 | (x340Var.i(dxs0Var) ? 4 : 2) | (x340Var.i(ozgVar) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192) | (x340Var.i(list) ? 131072 : 65536) | (x340Var.e(i) ? 1048576 : 524288);
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            qim0 qim0VarR = i1p1.r(u291.f(nim0.a, 1.0f));
            boolean zI = x340Var.i(ozgVar) | ((i3 & 3670016) == 1048576);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ut1(ozgVar, i, b2);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = j9k1.x(qim0VarR, (xu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            otw.c(dxs0Var, new bxs0(str, z, str2, list, (Integer) null, err0Var.s() > 0 ? yoi1.o((-ozgVar.b.s()) / err0Var.s(), 0.0f, 1.0f) : 0.0f), (qim0) null, (ipb1) null, x340Var, (i3 & 14) | 72, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(dxs0Var, ozgVar, str, z, str2, list, i, i2);
        }
    }

    public static final void b(tf50 tf50Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        long j = tf50Var.h;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1723554840);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(tf50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zF = b0kVar3.f(j);
            Object objT = b0kVar3.T();
            if (zF || objT == obj) {
                objT = p7h.M(new u7h[]{new u7h(u7h.b(tf50Var.h, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)});
                b0kVar3.s0(objT);
            }
            List list = (List) objT;
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = r850.V0;
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarD, true, (iu30) objT2);
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            String strO0 = cwl1.o0(b0kVar3, 2131957188);
            boolean z = (i2 & 112) == 32;
            Object objT3 = b0kVar3.T();
            if (z || objT3 == obj) {
                objT3 = new g850(iu30Var, (byte) 7);
                b0kVar3.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarB, (tl3) null, d4o1.a, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(1750704271, new cex(tf50Var, list, (byte) 16), b0kVar3), b0kVar2, 24960, 48, 1514);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new say(tf50Var, iu30Var, i, (byte) 22);
        }
    }

    public static final void c(xqn0 xqn0Var, boolean z, boolean z2, Function0 function0, qim0 qim0Var, int i, boolean z3, vu30 vu30Var, Function0 function1, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        boolean z4;
        int i5;
        vu30 vu30Var2;
        int i6;
        Function0 function2;
        int i7;
        x340 x340Var;
        qim0 qim0Var3;
        vu30 vu30Var3;
        Function0 function3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(726669207);
        int i8 = (x340Var2.g(xqn0Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i8 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i8 |= x340Var2.h(z2) ? 256 : 128;
        }
        int i9 = i8 | (x340Var2.i(function0) ? 2048 : 1024);
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 = i9 | 24576;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i9 | (x340Var2.i(qim0Var2) ? 16384 : 8192);
        }
        if ((196608 & i2) == 0) {
            i4 |= x340Var2.e(i == 0 ? -1 : l1d.C(i)) ? 131072 : 65536;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i5 = i4 | 1572864;
            z4 = z3;
        } else {
            z4 = z3;
            i5 = i4 | (x340Var2.h(z4) ? 1048576 : 524288);
        }
        int i12 = i3 & 128;
        if (i12 != 0) {
            i6 = i5 | 12582912;
            vu30Var2 = vu30Var;
        } else {
            vu30Var2 = vu30Var;
            i6 = i5 | (x340Var2.i(vu30Var2) ? 8388608 : 4194304);
        }
        int i13 = i3 & 256;
        if (i13 != 0) {
            i7 = i6 | 100663296;
            function2 = function1;
        } else {
            function2 = function1;
            i7 = i6 | (x340Var2.i(function2) ? 67108864 : 33554432);
        }
        int i14 = i7;
        if (x340Var2.Y(i14 & 1, (i14 & 38347923) != 38347922)) {
            qim0 qim0Var4 = i10 != 0 ? nim0.a : qim0Var2;
            boolean z5 = i11 != 0 ? false : z4;
            vu30Var3 = i12 != 0 ? null : vu30Var2;
            Function0 function4 = i13 != 0 ? null : function2;
            boolean z6 = !ihc1.y0(xqn0Var.b) || xqn0Var.f;
            float f = z5 ? 4.0f : 8.0f;
            nyx.a(2, (wux) null, apo.r(109307882, new yqn0(anm1.N("NavigableHeading", uyn1.B(qim0Var4, 0.0f, (z || z6 || z2) ? 0.0f : f, 0.0f, ((z || !z6) && !z2) ? f : 0.0f, 1)), z, z6, i, xqn0Var, function0, function4, vu30Var3), x340Var2), x340Var2, 3078, 6);
            x340Var = x340Var2;
            function3 = function4;
            z4 = z5;
            qim0Var3 = qim0Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
            vu30Var3 = vu30Var2;
            function3 = function2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zqn0(xqn0Var, z, z2, function0, qim0Var3, i, z4, vu30Var3, function3, i2, i3);
        }
    }

    public static final void d(int i, String str, String str2, boolean z, boolean z2, boolean z3, iu30 iu30Var, gne gneVar, qim0 qim0Var, lee1 lee1Var, b0k b0kVar, int i2) {
        int i3;
        boolean z4;
        boolean z5;
        qim0 qim0Var2;
        lee1 lee1Var2;
        int i4;
        lee1 lee1Var3;
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1294072503);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i5 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z4 = z2;
            i5 |= x340Var.h(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((196608 & i2) == 0) {
            z5 = z3;
            i5 |= x340Var.h(z5) ? 131072 : 65536;
        } else {
            z5 = z3;
        }
        int i6 = i5 | (x340Var.i(iu30Var) ? 1048576 : 524288) | (x340Var.i(gneVar) ? 8388608 : 4194304);
        if ((100663296 & i2) == 0) {
            qim0Var2 = qim0Var;
            i6 |= x340Var.i(qim0Var2) ? 67108864 : 33554432;
        } else {
            qim0Var2 = qim0Var;
        }
        int i7 = i6 | 268435456;
        if (x340Var.Y(i7 & 1, (306783379 & i7) != 306783378)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                i4 = i7 & (-1879048193);
                lee1Var3 = cbx.d(x340Var).g;
            } else {
                x340Var.b0();
                i4 = i7 & (-1879048193);
                lee1Var3 = lee1Var;
            }
            x340Var.s();
            y7e1 y7e1VarD = c4p1.D((i4 >> 3) & 14, 2, str, x340Var);
            int i8 = gneVar.a;
            if (z) {
                x340Var.i0(88060549);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(88108258);
                haxVar = new hax(cwl1.o0(x340Var, 2131955261));
                x340Var.r(false);
            }
            int i9 = i4 << 6;
            e(y7e1VarD, i, str2, i8, qim0Var2, haxVar, z4, z5, lee1Var3, null, x340Var, ((i4 << 3) & 112) | (i4 & 896) | ((i4 >> 12) & 57344) | (i9 & 3670016) | (i9 & 29360128), 512);
            boolean zI = x340Var.i(y7e1VarD) | ((i4 & 3670016) == 1048576);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new qy5(y7e1VarD, iu30Var, (lnm) null, (byte) 5);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            lee1Var2 = lee1Var3;
        } else {
            x340Var.b0();
            lee1Var2 = lee1Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gpv(i, str, str2, z, z2, z3, iu30Var, gneVar, qim0Var, lee1Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:119:0x015a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0183  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:129:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x018e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01be  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0237  */
    /* JADX WARN: Code duplicated, block: B:146:0x024e  */
    /* JADX WARN: Code duplicated, block: B:149:0x025c  */
    /* JADX WARN: Code duplicated, block: B:150:0x025e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x026a  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:166:0x0313  */
    /* JADX WARN: Code duplicated, block: B:170:0x033c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0355 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x035b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0377  */
    /* JADX WARN: Code duplicated, block: B:182:0x0388  */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    public static final void e(y7e1 y7e1Var, int i, String str, int i2, qim0 qim0Var, max maxVar, boolean z, boolean z2, lee1 lee1Var, String str2, b0k b0kVar, int i3, int i4) {
        int i5;
        String str3;
        max maxVar2;
        boolean z3;
        int i6;
        int i7;
        int i8;
        String str4;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        x340 x340Var;
        String str5;
        boolean z6;
        max maxVar3;
        h311 h311VarV;
        max maxVar4;
        boolean z7;
        boolean z8;
        String str6;
        boolean z9;
        int i11;
        Object objT;
        m4c m4cVar;
        Object objT2;
        ven0 ven0Var;
        boolean z10;
        Object objT3;
        ven0 ven0Var2;
        d6e1 c6e1Var;
        boolean zI;
        Object objT4;
        int length;
        qim0 qim0VarN;
        boolean z11;
        Object objT5;
        boolean zI2;
        Object objT6;
        m4c m4cVar2;
        Object objT7;
        ven0 ven0Var3;
        boolean zI3;
        Object objT8;
        boolean z12;
        int i12;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-427457296);
        if ((i3 & 6) == 0) {
            i5 = (x340Var2.i(y7e1Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var2.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            str3 = str;
            i5 |= x340Var2.g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var2.e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            if ((i4 & 32) == 0) {
                maxVar2 = maxVar;
                int i13 = x340Var2.i(maxVar2) ? 131072 : 65536;
                i5 |= i13;
            } else {
                maxVar2 = maxVar;
            }
            i5 |= i13;
        } else {
            maxVar2 = maxVar;
        }
        int i14 = i4 & 64;
        if (i14 == 0) {
            if ((1572864 & i3) == 0) {
                z3 = z;
                i5 |= x340Var2.h(z3) ? 1048576 : 524288;
            }
            i6 = i4 & 128;
            if (i6 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                if (x340Var2.h(z2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i5 |= i7;
            }
            if ((i3 & 100663296) == 0) {
                if (x340Var2.i(lee1Var)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i5 |= i12;
            }
            i8 = i4 & 512;
            if (i8 != 0) {
                i5 |= 805306368;
                str4 = str2;
            } else {
                str4 = str2;
                if ((i3 & 805306368) == 0) {
                    if (x340Var2.g(str4)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i5 |= i9;
                }
            }
            i10 = i5;
            if ((i5 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var2.Y(i10 & 1, z4)) {
                x340Var2.d0();
                if ((i3 & 1) != 0 || x340Var2.E()) {
                    if ((i4 & 32) != 0) {
                        maxVar4 = jax.a;
                        i10 &= -458753;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    if (i8 != 0) {
                        str6 = "";
                        z8 = z7;
                    } else {
                        z8 = z7;
                    }
                    z9 = z3;
                    i11 = i10;
                    x340Var2.s();
                    objT = x340Var2.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = pzm.i(x340Var2);
                    }
                    lz20 lz20Var = (lz20) objT;
                    Object[] objArr = new Object[0];
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = xzu.Z;
                        x340Var2.s0(objT2);
                    }
                    max maxVar5 = maxVar4;
                    ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var2, 48);
                    Object[] objArr2 = new Object[0];
                    if ((i11 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objT3 = x340Var2.T();
                    if (z10 || objT3 == m4cVar) {
                        objT3 = new sg6((byte) 2, z9);
                        x340Var2.s0(objT3);
                    }
                    ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT3, x340Var2, 0);
                    if (z9 && !((Boolean) ven0Var2.getValue()).booleanValue()) {
                        ven0Var2.setValue(Boolean.TRUE);
                    }
                    zzq0 zzq0Var = new zzq0(8.0f, 6.0f, 8.0f, 6.0f);
                    if (i == 1) {
                        c6e1Var = d6e1.b;
                    } else {
                        c6e1Var = new c6e1(i, 0, 2);
                    }
                    uwr uwrVar = cbx.a;
                    zxx zxxVar = new zxx(cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b, cbx.a(x340Var2).b.d, cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).b.c, 0L, 896);
                    qim0 qim0VarP = vby0.p(u291.f(qim0Var, 1.0f), lz20Var);
                    zI = x340Var2.i(ven0Var);
                    objT4 = x340Var2.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new d7v(ven0Var, (byte) 4);
                        x340Var2.s0(objT4);
                    }
                    qim0 qim0VarG = cev0.G(qim0VarP, (iu30) objT4);
                    length = str6.length();
                    qim0VarN = nim0.a;
                    if (length > 0) {
                        qim0VarN = anm1.N(str6, qim0VarN);
                    }
                    qim0 qim0VarThen = qim0VarG.then(qim0VarN);
                    if ((i11 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objT5 = x340Var2.T();
                    if (z11 || objT5 == m4cVar) {
                        objT5 = new epv(i2, (byte) 0);
                        x340Var2.s0(objT5);
                    }
                    int i15 = i11 << 3;
                    String str7 = str6;
                    rwo1.b(y7e1Var, qim0VarThen, maxVar5, str3, null, null, false, false, (dk80) objT5, lee1Var, kua0.a(kua0.g, 7, (Boolean) null, 118), null, c6e1Var, null, null, null, null, zzq0Var, 0.0f, false, zxxVar, x340Var2, (i11 & 14) | ((i11 >> 9) & 896) | (i15 & 7168) | (i15 & 1879048192), 0, 911600);
                    maxVar2 = maxVar5;
                    Boolean bool = (Boolean) ven0Var2.getValue();
                    bool.getClass();
                    zI2 = x340Var2.i(ven0Var2) | x340Var2.i(lz20Var);
                    objT6 = x340Var2.T();
                    if (zI2) {
                        m4cVar2 = m4cVar;
                    } else {
                        m4cVar2 = m4cVar;
                        if (objT6 == m4cVar2) {
                        }
                        qxd0.t(bool, x340Var2, (vu30) objT6);
                        Object[] objArr3 = new Object[0];
                        objT7 = x340Var2.T();
                        if (objT7 == m4cVar2) {
                            objT7 = xzu.Y;
                            x340Var2.s0(objT7);
                        }
                        ven0Var3 = (ven0) k5p1.s(objArr3, (Function0) objT7, x340Var2, 48);
                        Boolean bool2 = (Boolean) ven0Var.getValue();
                        bool2.getClass();
                        zI3 = x340Var2.i(ven0Var) | ((i11 & 29360128) == 8388608) | x340Var2.i(ven0Var3) | x340Var2.i(y7e1Var) | x340Var2.i(ven0Var2);
                        objT8 = x340Var2.T();
                        if (!zI3 || objT8 == m4cVar2) {
                            z12 = z8;
                            swn swnVar = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                            x340Var2.s0(swnVar);
                            objT8 = swnVar;
                        } else {
                            z12 = z8;
                        }
                        qxd0.t(bool2, x340Var2, (vu30) objT8);
                        z5 = z12;
                        x340Var = x340Var2;
                        str5 = str7;
                        z6 = z9;
                    }
                    objT6 = new nnu(lz20Var, ven0Var2, (lnm) null, (byte) 12);
                    x340Var2.s0(objT6);
                    qxd0.t(bool, x340Var2, (vu30) objT6);
                    Object[] objArr4 = new Object[0];
                    objT7 = x340Var2.T();
                    if (objT7 == m4cVar2) {
                        objT7 = xzu.Y;
                        x340Var2.s0(objT7);
                    }
                    ven0Var3 = (ven0) k5p1.s(objArr4, (Function0) objT7, x340Var2, 48);
                    Boolean bool3 = (Boolean) ven0Var.getValue();
                    bool3.getClass();
                    zI3 = x340Var2.i(ven0Var) | ((i11 & 29360128) == 8388608) | x340Var2.i(ven0Var3) | x340Var2.i(y7e1Var) | x340Var2.i(ven0Var2);
                    objT8 = x340Var2.T();
                    if (zI3) {
                        z12 = z8;
                        swn swnVar2 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                        x340Var2.s0(swnVar2);
                        objT8 = swnVar2;
                    } else {
                        z12 = z8;
                        swn swnVar3 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                        x340Var2.s0(swnVar3);
                        objT8 = swnVar3;
                    }
                    qxd0.t(bool3, x340Var2, (vu30) objT8);
                    z5 = z12;
                    x340Var = x340Var2;
                    str5 = str7;
                    z6 = z9;
                } else {
                    x340Var2.b0();
                    if ((i4 & 32) != 0) {
                        i10 &= -458753;
                    }
                    z8 = z2;
                    maxVar4 = maxVar2;
                }
                str6 = str4;
                z9 = z3;
                i11 = i10;
                x340Var2.s();
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = pzm.i(x340Var2);
                }
                lz20 lz20Var2 = (lz20) objT;
                Object[] objArr5 = new Object[0];
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = xzu.Z;
                    x340Var2.s0(objT2);
                }
                max maxVar6 = maxVar4;
                ven0Var = (ven0) k5p1.s(objArr5, (Function0) objT2, x340Var2, 48);
                Object[] objArr6 = new Object[0];
                if ((i11 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objT3 = x340Var2.T();
                if (z10) {
                    objT3 = new sg6((byte) 2, z9);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new sg6((byte) 2, z9);
                    x340Var2.s0(objT3);
                }
                ven0Var2 = (ven0) k5p1.s(objArr6, (Function0) objT3, x340Var2, 0);
                if (z9) {
                    ven0Var2.setValue(Boolean.TRUE);
                }
                zzq0 zzq0Var2 = new zzq0(8.0f, 6.0f, 8.0f, 6.0f);
                if (i == 1) {
                    c6e1Var = d6e1.b;
                } else {
                    c6e1Var = new c6e1(i, 0, 2);
                }
                uwr uwrVar2 = cbx.a;
                zxx zxxVar2 = new zxx(cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b, cbx.a(x340Var2).b.d, cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).b.c, 0L, 896);
                qim0 qim0VarP2 = vby0.p(u291.f(qim0Var, 1.0f), lz20Var2);
                zI = x340Var2.i(ven0Var);
                objT4 = x340Var2.T();
                if (zI) {
                    objT4 = new d7v(ven0Var, (byte) 4);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new d7v(ven0Var, (byte) 4);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarG2 = cev0.G(qim0VarP2, (iu30) objT4);
                length = str6.length();
                qim0VarN = nim0.a;
                if (length > 0) {
                    qim0VarN = anm1.N(str6, qim0VarN);
                }
                qim0 qim0VarThen2 = qim0VarG2.then(qim0VarN);
                if ((i11 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objT5 = x340Var2.T();
                if (z11) {
                    objT5 = new epv(i2, (byte) 0);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new epv(i2, (byte) 0);
                    x340Var2.s0(objT5);
                }
                int i16 = i11 << 3;
                String str8 = str6;
                rwo1.b(y7e1Var, qim0VarThen2, maxVar6, str3, null, null, false, false, (dk80) objT5, lee1Var, kua0.a(kua0.g, 7, (Boolean) null, 118), null, c6e1Var, null, null, null, null, zzq0Var2, 0.0f, false, zxxVar2, x340Var2, (i11 & 14) | ((i11 >> 9) & 896) | (i16 & 7168) | (i16 & 1879048192), 0, 911600);
                maxVar2 = maxVar6;
                Boolean bool4 = (Boolean) ven0Var2.getValue();
                bool4.getClass();
                zI2 = x340Var2.i(ven0Var2) | x340Var2.i(lz20Var2);
                objT6 = x340Var2.T();
                if (zI2) {
                    m4cVar2 = m4cVar;
                    if (objT6 == m4cVar2) {
                    }
                    qxd0.t(bool4, x340Var2, (vu30) objT6);
                    Object[] objArr7 = new Object[0];
                    objT7 = x340Var2.T();
                    if (objT7 == m4cVar2) {
                        objT7 = xzu.Y;
                        x340Var2.s0(objT7);
                    }
                    ven0Var3 = (ven0) k5p1.s(objArr7, (Function0) objT7, x340Var2, 48);
                    Boolean bool5 = (Boolean) ven0Var.getValue();
                    bool5.getClass();
                    zI3 = x340Var2.i(ven0Var) | ((i11 & 29360128) == 8388608) | x340Var2.i(ven0Var3) | x340Var2.i(y7e1Var) | x340Var2.i(ven0Var2);
                    objT8 = x340Var2.T();
                    if (zI3) {
                        z12 = z8;
                        swn swnVar4 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                        x340Var2.s0(swnVar4);
                        objT8 = swnVar4;
                    } else {
                        z12 = z8;
                        swn swnVar5 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                        x340Var2.s0(swnVar5);
                        objT8 = swnVar5;
                    }
                    qxd0.t(bool5, x340Var2, (vu30) objT8);
                    z5 = z12;
                    x340Var = x340Var2;
                    str5 = str8;
                    z6 = z9;
                } else {
                    m4cVar2 = m4cVar;
                }
                objT6 = new nnu(lz20Var2, ven0Var2, (lnm) null, (byte) 12);
                x340Var2.s0(objT6);
                qxd0.t(bool4, x340Var2, (vu30) objT6);
                Object[] objArr8 = new Object[0];
                objT7 = x340Var2.T();
                if (objT7 == m4cVar2) {
                    objT7 = xzu.Y;
                    x340Var2.s0(objT7);
                }
                ven0Var3 = (ven0) k5p1.s(objArr8, (Function0) objT7, x340Var2, 48);
                Boolean bool6 = (Boolean) ven0Var.getValue();
                bool6.getClass();
                zI3 = x340Var2.i(ven0Var) | ((i11 & 29360128) == 8388608) | x340Var2.i(ven0Var3) | x340Var2.i(y7e1Var) | x340Var2.i(ven0Var2);
                objT8 = x340Var2.T();
                if (zI3) {
                    z12 = z8;
                    swn swnVar6 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                    x340Var2.s0(swnVar6);
                    objT8 = swnVar6;
                } else {
                    z12 = z8;
                    swn swnVar7 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                    x340Var2.s0(swnVar7);
                    objT8 = swnVar7;
                }
                qxd0.t(bool6, x340Var2, (vu30) objT8);
                z5 = z12;
                x340Var = x340Var2;
                str5 = str8;
                z6 = z9;
            } else {
                x340Var2.b0();
                z5 = z2;
                x340Var = x340Var2;
                str5 = str4;
                z6 = z3;
            }
            maxVar3 = maxVar2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fpv(y7e1Var, i, str, i2, qim0Var, maxVar3, z6, z5, lee1Var, str5, i3, i4);
            }
        }
        i5 |= 1572864;
        z3 = z;
        i6 = i4 & 128;
        if (i6 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            if (x340Var2.h(z2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i5 |= i7;
        }
        if ((i3 & 100663296) == 0) {
            if (x340Var2.i(lee1Var)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i5 |= i12;
        }
        i8 = i4 & 512;
        if (i8 != 0) {
            i5 |= 805306368;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i3 & 805306368) == 0) {
                if (x340Var2.g(str4)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            }
        }
        i10 = i5;
        if ((i5 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var2.Y(i10 & 1, z4)) {
            x340Var2.d0();
            if ((i3 & 1) != 0) {
                if ((i4 & 32) != 0) {
                    maxVar4 = jax.a;
                    i10 &= -458753;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i14 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                if (i8 != 0) {
                    str6 = "";
                    z8 = z7;
                } else {
                    z8 = z7;
                    str6 = str4;
                }
            } else {
                if ((i4 & 32) != 0) {
                    maxVar4 = jax.a;
                    i10 &= -458753;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i14 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                if (i8 != 0) {
                    str6 = "";
                    z8 = z7;
                } else {
                    z8 = z7;
                    str6 = str4;
                }
            }
            z9 = z3;
            i11 = i10;
            x340Var2.s();
            objT = x340Var2.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var2);
            }
            lz20 lz20Var3 = (lz20) objT;
            Object[] objArr9 = new Object[0];
            objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = xzu.Z;
                x340Var2.s0(objT2);
            }
            max maxVar7 = maxVar4;
            ven0Var = (ven0) k5p1.s(objArr9, (Function0) objT2, x340Var2, 48);
            Object[] objArr10 = new Object[0];
            if ((i11 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objT3 = x340Var2.T();
            if (z10) {
                objT3 = new sg6((byte) 2, z9);
                x340Var2.s0(objT3);
            } else {
                objT3 = new sg6((byte) 2, z9);
                x340Var2.s0(objT3);
            }
            ven0Var2 = (ven0) k5p1.s(objArr10, (Function0) objT3, x340Var2, 0);
            if (z9) {
                ven0Var2.setValue(Boolean.TRUE);
            }
            zzq0 zzq0Var3 = new zzq0(8.0f, 6.0f, 8.0f, 6.0f);
            if (i == 1) {
                c6e1Var = d6e1.b;
            } else {
                c6e1Var = new c6e1(i, 0, 2);
            }
            uwr uwrVar3 = cbx.a;
            zxx zxxVar3 = new zxx(cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b, cbx.a(x340Var2).b.d, cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).b.c, 0L, 896);
            qim0 qim0VarP3 = vby0.p(u291.f(qim0Var, 1.0f), lz20Var3);
            zI = x340Var2.i(ven0Var);
            objT4 = x340Var2.T();
            if (zI) {
                objT4 = new d7v(ven0Var, (byte) 4);
                x340Var2.s0(objT4);
            } else {
                objT4 = new d7v(ven0Var, (byte) 4);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarG3 = cev0.G(qim0VarP3, (iu30) objT4);
            length = str6.length();
            qim0VarN = nim0.a;
            if (length > 0) {
                qim0VarN = anm1.N(str6, qim0VarN);
            }
            qim0 qim0VarThen3 = qim0VarG3.then(qim0VarN);
            if ((i11 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objT5 = x340Var2.T();
            if (z11) {
                objT5 = new epv(i2, (byte) 0);
                x340Var2.s0(objT5);
            } else {
                objT5 = new epv(i2, (byte) 0);
                x340Var2.s0(objT5);
            }
            int i17 = i11 << 3;
            String str9 = str6;
            rwo1.b(y7e1Var, qim0VarThen3, maxVar7, str3, null, null, false, false, (dk80) objT5, lee1Var, kua0.a(kua0.g, 7, (Boolean) null, 118), null, c6e1Var, null, null, null, null, zzq0Var3, 0.0f, false, zxxVar3, x340Var2, (i11 & 14) | ((i11 >> 9) & 896) | (i17 & 7168) | (i17 & 1879048192), 0, 911600);
            maxVar2 = maxVar7;
            Boolean bool7 = (Boolean) ven0Var2.getValue();
            bool7.getClass();
            zI2 = x340Var2.i(ven0Var2) | x340Var2.i(lz20Var3);
            objT6 = x340Var2.T();
            if (zI2) {
                m4cVar2 = m4cVar;
                if (objT6 == m4cVar2) {
                }
                qxd0.t(bool7, x340Var2, (vu30) objT6);
                Object[] objArr11 = new Object[0];
                objT7 = x340Var2.T();
                if (objT7 == m4cVar2) {
                    objT7 = xzu.Y;
                    x340Var2.s0(objT7);
                }
                ven0Var3 = (ven0) k5p1.s(objArr11, (Function0) objT7, x340Var2, 48);
                Boolean bool8 = (Boolean) ven0Var.getValue();
                bool8.getClass();
                zI3 = x340Var2.i(ven0Var) | ((i11 & 29360128) == 8388608) | x340Var2.i(ven0Var3) | x340Var2.i(y7e1Var) | x340Var2.i(ven0Var2);
                objT8 = x340Var2.T();
                if (zI3) {
                    z12 = z8;
                    swn swnVar8 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                    x340Var2.s0(swnVar8);
                    objT8 = swnVar8;
                } else {
                    z12 = z8;
                    swn swnVar9 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                    x340Var2.s0(swnVar9);
                    objT8 = swnVar9;
                }
                qxd0.t(bool8, x340Var2, (vu30) objT8);
                z5 = z12;
                x340Var = x340Var2;
                str5 = str9;
                z6 = z9;
            } else {
                m4cVar2 = m4cVar;
            }
            objT6 = new nnu(lz20Var3, ven0Var2, (lnm) null, (byte) 12);
            x340Var2.s0(objT6);
            qxd0.t(bool7, x340Var2, (vu30) objT6);
            Object[] objArr12 = new Object[0];
            objT7 = x340Var2.T();
            if (objT7 == m4cVar2) {
                objT7 = xzu.Y;
                x340Var2.s0(objT7);
            }
            ven0Var3 = (ven0) k5p1.s(objArr12, (Function0) objT7, x340Var2, 48);
            Boolean bool9 = (Boolean) ven0Var.getValue();
            bool9.getClass();
            zI3 = x340Var2.i(ven0Var) | ((i11 & 29360128) == 8388608) | x340Var2.i(ven0Var3) | x340Var2.i(y7e1Var) | x340Var2.i(ven0Var2);
            objT8 = x340Var2.T();
            if (zI3) {
                z12 = z8;
                swn swnVar10 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                x340Var2.s0(swnVar10);
                objT8 = swnVar10;
            } else {
                z12 = z8;
                swn swnVar11 = new swn(z12, y7e1Var, ven0Var, ven0Var3, ven0Var2, (lnm) null);
                x340Var2.s0(swnVar11);
                objT8 = swnVar11;
            }
            qxd0.t(bool9, x340Var2, (vu30) objT8);
            z5 = z12;
            x340Var = x340Var2;
            str5 = str9;
            z6 = z9;
        } else {
            x340Var2.b0();
            z5 = z2;
            x340Var = x340Var2;
            str5 = str4;
            z6 = z3;
        }
        maxVar3 = maxVar2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fpv(y7e1Var, i, str, i2, qim0Var, maxVar3, z6, z5, lee1Var, str5, i3, i4);
        }
    }

    public static final void f(t9b0 t9b0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2122710949);
        int i2 = i | (x340Var.g(t9b0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = t9b0Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, anm1.N("HIGHLIGHT_LABEL", uyn1.y(dug.f(qim0Var, t9b0Var.b, er31.b(2.0f)), 3.0f, 1.0f)), vgo1.q(cbx.d(x340Var).k, z, x340Var), cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs((Object) t9b0Var, z, (Object) qim0Var, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void g(xqn0 xqn0Var, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z2;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        long j;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-249909251);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(xqn0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (b0kVar3.h(z)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar3.Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    qim0Var2 = nim0.a;
                }
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar3).k;
                if (z) {
                    b0kVar3.i0(355387401);
                    j = cbx.a(b0kVar3).b.c;
                } else {
                    b0kVar3.i0(355388644);
                    j = cbx.a(b0kVar3).b.b;
                }
                b0kVar3.r(false);
                b0kVar2 = b0kVar3;
                uwo1.e(xqn0Var.b, qim0Var2, lee1Var, j, new a0e1(6), null, 2, false, new cjc0(1), 0, null, b0kVar2, i3 & 112, 0, 1696);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            qim0Var3 = qim0Var2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nj8(xqn0Var, qim0Var3, z, i, i2, (byte) 3);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (b0kVar3.h(z)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b0kVar3.Y(i3 & 1, z2)) {
            if (i5 != 0) {
                qim0Var2 = nim0.a;
            }
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var2 = cbx.d(b0kVar3).k;
            if (z) {
                b0kVar3.i0(355387401);
                j = cbx.a(b0kVar3).b.c;
            } else {
                b0kVar3.i0(355388644);
                j = cbx.a(b0kVar3).b.b;
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            uwo1.e(xqn0Var.b, qim0Var2, lee1Var2, j, new a0e1(6), null, 2, false, new cjc0(1), 0, null, b0kVar2, i3 & 112, 0, 1696);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        qim0Var3 = qim0Var2;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nj8(xqn0Var, qim0Var3, z, i, i2, (byte) 3);
        }
    }

    public static final void h(der0 der0Var, b0k b0kVar, int i) {
        byte b2;
        Object obj;
        Object odp0Var;
        dcr0 dcr0Var = der0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-320171899);
        int i2 = (x340Var.g(der0Var) ? 4 : 2) | i;
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            ViewGroup viewGroup = (ViewGroup) x340Var.k(AndroidCompositionLocals_androidKt.f);
            int i3 = i2 << 6;
            m4c m4cVar = fkj0.X;
            x8c0 lifecycle = ((iac0) x340Var.k(jfe0.a)).getLifecycle();
            boolean zG = x340Var.g(context) | x340Var.g(viewGroup) | x340Var.g(dcr0Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                obj = objT;
                jir0 jir0Var = der0Var.b;
                oir0 oir0Var = jir0Var.c;
                if (oir0Var != null) {
                    oir0Var.b.clear();
                }
                oir0 oir0Var2 = new oir0(jir0Var);
                jir0Var.c = oir0Var2;
                x340Var.s0(oir0Var2);
                obj = oir0Var2;
            }
            oir0 oir0Var3 = (oir0) obj;
            Object[] objArr = {context, viewGroup, dcr0Var};
            bir0 bir0Var = new bir0(dcr0Var, der0Var.a, der0Var.c, context, viewGroup);
            int i4 = (i3 & 896) ^ 384;
            boolean zI = ((i4 > 256 && x340Var.g(der0Var)) || (i3 & 384) == 256) | x340Var.i(context) | x340Var.i(viewGroup) | x340Var.i(lifecycle);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                odp0Var = new odp0(der0Var, context, viewGroup, lifecycle, (byte) 3);
                x340Var.s0(odp0Var);
            } else {
                odp0Var = objT2;
            }
            b2 = 19;
            air0 air0Var = (air0) k5p1.t(objArr, bir0Var, "pageui", (Function0) odp0Var, x340Var, 384, 0);
            boolean zG2 = x340Var.g(dcr0Var) | x340Var.g(air0Var);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new nir0(dcr0Var.c(), dcr0Var.b(), yoi1.i(air0Var.i, o6x.a));
                x340Var.s0(objT3);
            }
            nir0 nir0Var = (nir0) objT3;
            if (!oir0Var3.d) {
                oir0Var3.c = nir0Var;
            }
            if ((i4 <= 256 || !x340Var.g(der0Var)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean zI2 = z | x340Var.i(air0Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new ozp0(der0Var, air0Var, (byte) 19);
                x340Var.s0(objT4);
            }
            qxd0.i(air0Var, (iu30) objT4, x340Var);
            ven0 ven0VarS = v8r.s(air0Var.c(), x340Var);
            cbr0 cbr0VarA = dcr0Var.c().a();
            cbr0 cbr0Var = cbr0.c;
            abr0.b(cbr0VarA, x340Var, 0);
            if (((View) ven0VarS.getValue()) != null) {
                x340Var.i0(881692720);
                boolean zI3 = x340Var.i(air0Var);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == m4cVar) {
                    objT5 = new xy50(air0Var, (byte) 23);
                    x340Var.s0(objT5);
                }
                iu30 iu30Var = (iu30) objT5;
                Object objT6 = x340Var.T();
                if (objT6 == m4cVar) {
                    objT6 = k8b0.e1;
                    x340Var.s0(objT6);
                }
                dm5.b(iu30Var, (qim0) null, (iu30) objT6, (iu30) null, (iu30) null, x340Var, 384, 26);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(882135741);
                x340Var.r(false);
            }
        } else {
            b2 = 19;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nso0(der0Var, i, b2);
        }
    }

    public static final void i(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1072323023);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strE = str.length() > 50 ? f4i1.e(ihc1.f1(ihc1.c1(50, str)).toString(), "…") : str;
            cr31 cr31VarB = er31.b(8.0f);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(strE, uyn1.y(bin.x(dug.f(i1p1.q(anm1.N("promptable-section-suggestion-chip", qim0Var3), cr31VarB), cbx.a(x340Var).a.b.a(), cr31VarB), false, null, new pm31(0), null, function0, 11), 12.0f, 8.0f), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0267  */
    /* JADX WARN: Code duplicated, block: B:82:0x0269  */
    /* JADX WARN: Code duplicated, block: B:88:0x0276  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b4  */
    public static final void j(boolean z, boolean z2, int i, xqn0 xqn0Var, Function0 function0, qim0 qim0Var, Function0 function1, vu30 vu30Var, b0k b0kVar, int i2) {
        Function0 function2;
        x340 x340Var;
        qim0 qim0Var2;
        vu30 vu30Var2;
        boolean z3;
        boolean z4;
        qim0 qim0Var3;
        boolean z5;
        qim0 qim0Var4;
        m4c m4cVar;
        boolean z6;
        Object objT;
        boolean z7;
        boolean z8;
        xqn0 xqn0Var2 = xqn0Var;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(744969770);
        j06 j06Var = x340Var2.a;
        int i3 = i2 | (x340Var2.h(z) ? 4 : 2) | (x340Var2.h(z2) ? 32 : 16) | (x340Var2.e(l1d.C(i)) ? 256 : 128) | (x340Var2.g(xqn0Var2) ? 2048 : 1024) | (x340Var2.i(function0) ? 16384 : 8192) | 196608 | (x340Var2.i(function1) ? 1048576 : 524288) | (x340Var2.i(vu30Var) ? 8388608 : 4194304);
        if (x340Var2.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var5);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z9 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z9) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            vu30 vu30Var3 = y580.O0;
            nko1.H(jw31VarA, x340Var2, vu30Var3);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar2);
            nko1.F(x340Var2);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar3);
            x340Var2.i0(1051462257);
            pw31 pw31Var = pw31.a;
            qim0 qim0VarA = pw31Var.a(1.0f, qim0Var5, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, vu30Var3);
            nko1.H(xos0VarM2, x340Var2, lljVar);
            x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar3);
            j2i j2iVarR = apo.r(-973854071, new pfm(i, xqn0Var2, z2), x340Var2);
            if (vu30Var != null) {
                x340Var2.i0(-461113274);
                jw31 jw31VarA2 = ew31.a(h36.a, fraVar, x340Var2, 0);
                vu30Var2 = vu30Var3;
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0Var5);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA2, x340Var2, vu30Var2);
                nko1.H(xos0VarM3, x340Var2, lljVar);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar3);
                z4 = false;
                j2iVarR.invoke(pw31Var.a(1.0f, qim0Var5, false), x340Var2, 48);
                z3 = true;
                us71.k((i3 >> 21) & 14, vu30Var, x340Var2, true, false);
            } else {
                vu30Var2 = vu30Var3;
                z3 = true;
                z4 = false;
                x340Var2.i0(-460940790);
                j2iVarR.invoke(qim0Var5, x340Var2, 54);
                x340Var2.r(false);
            }
            x340Var2.r(z3);
            String strF = f4i1.f(xqn0Var2.b, " ", xqn0Var2.a);
            if (!xqn0Var2.g || function1 == null) {
                boolean z10 = z4;
                boolean z11 = z3;
                x340Var = x340Var2;
                qim0Var3 = qim0Var5;
                if (z2) {
                    if (xqn0Var2.f) {
                        x340Var.i0(1053564459);
                        qim0 qim0VarA2 = u291.a(qim0Var3, 44.0f, 44.0f);
                        boolean z12 = (i3 & 7168) == 2048 ? true : z10;
                        Object objT2 = x340Var.T();
                        if (z12) {
                            m4cVar = m4cVar2;
                        } else {
                            m4cVar = m4cVar2;
                            if (objT2 == m4cVar) {
                            }
                            qim0 qim0VarB = s161.b(qim0VarA2, false, (iu30) objT2);
                            if ((i3 & 57344) == 16384) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objT = x340Var.T();
                            if (!z6 || objT == m4cVar) {
                                function2 = function0;
                                objT = new kek0(function2, (byte) 11);
                                x340Var.s0(objT);
                            } else {
                                function2 = function0;
                            }
                            qim0 qim0VarX = bin.x(qim0VarB, false, null, null, null, (Function0) objT, 15);
                            gfh0 gfh0VarC = t1c.c(een.i, false);
                            int iHashCode4 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM4 = x340Var.m();
                            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarX);
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(n4kVar);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC, x340Var, vu30Var2);
                            nko1.H(xos0VarM4, x340Var, lljVar);
                            x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                            nko1.H(qim0VarE4, x340Var, lljVar3);
                            uwr uwrVar = cbx.a;
                            zov0 zov0Var = cbx.b(x340Var).g;
                            w0h1.a(plx.c, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 48);
                            x340Var = x340Var;
                            x340Var.r(true);
                            z7 = false;
                            x340Var.r(false);
                            xqn0Var2 = xqn0Var;
                        }
                        objT2 = new xkm0(xqn0Var2, (byte) 21);
                        x340Var.s0(objT2);
                        qim0 qim0VarB2 = s161.b(qim0VarA2, false, (iu30) objT2);
                        if ((i3 & 57344) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objT = x340Var.T();
                        if (z6) {
                            function2 = function0;
                            objT = new kek0(function2, (byte) 11);
                            x340Var.s0(objT);
                        } else {
                            function2 = function0;
                            objT = new kek0(function2, (byte) 11);
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarX2 = bin.x(qim0VarB2, false, null, null, null, (Function0) objT, 15);
                        gfh0 gfh0VarC2 = t1c.c(een.i, false);
                        int iHashCode5 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM5 = x340Var.m();
                        qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX2);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var, vu30Var2);
                        nko1.H(xos0VarM5, x340Var, lljVar);
                        x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE5, x340Var, lljVar3);
                        uwr uwrVar2 = cbx.a;
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        w0h1.a(plx.c, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 48);
                        x340Var = x340Var;
                        x340Var.r(true);
                        z7 = false;
                        x340Var.r(false);
                        xqn0Var2 = xqn0Var;
                    } else {
                        function2 = function0;
                        if (z) {
                            x340Var.i0(1054407628);
                            gfh0 gfh0VarC3 = t1c.c(een.d, z10);
                            int iHashCode6 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM6 = x340Var.m();
                            qim0 qim0VarE6 = zr7.E(x340Var, qim0Var3);
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(n4kVar);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC3, x340Var, vu30Var2);
                            nko1.H(xos0VarM6, x340Var, lljVar);
                            x0d.q(iHashCode6, x340Var, lljVar2, x340Var);
                            nko1.H(qim0VarE6, x340Var, lljVar3);
                            boolean zG = x340Var.g(strF);
                            Object objT3 = x340Var.T();
                            if (zG || objT3 == m4cVar2) {
                                objT3 = new fki0(strF, (byte) 22);
                                x340Var.s0(objT3);
                            }
                            qim0 qim0VarB3 = s161.b(qim0Var3, false, (iu30) objT3);
                            boolean z13 = (i3 & 57344) == 16384;
                            Object objT4 = x340Var.T();
                            if (z13 || objT4 == m4cVar2) {
                                objT4 = new kek0(function2, (byte) 12);
                                x340Var.s0(objT4);
                            }
                            xqn0Var2 = xqn0Var;
                            z5 = false;
                            qim0Var4 = qim0Var3;
                            g(xqn0Var2, uyn1.B(bin.x(qim0VarB3, false, null, null, null, (Function0) objT4, 15), 16.0f, 2.0f, 0.0f, 2.0f, 4), xqn0Var2.e, x340Var, (i3 >> 9) & 14, 0);
                            x340Var.r(true);
                            x340Var.r(false);
                        } else {
                            xqn0Var2 = xqn0Var;
                            z5 = z10;
                            qim0Var4 = qim0Var3;
                            x340Var.i0(1054836141);
                            if (ihc1.y0(strF)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            }
                            gbx gbxVar = new gbx(new y50(strF), function2);
                            ldx ldxVar = ldx.c;
                            gdx gdxVarS = yla.s(x340Var);
                            uwr uwrVar3 = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            cvx cvxVar2 = cbx.b(x340Var).b;
                            cvx cvxVar3 = cbx.b(x340Var).b;
                            foo1.c(gbxVar, ldxVar, null, null, gdxVarS, new zzq0(16.0f, 4.0f, 0.0f, 4.0f), null, null, null, null, apo.r(-1657197370, new fhk0(xqn0Var2, (byte) 18), x340Var), x340Var, 0, 48, 1948);
                            x340Var = x340Var;
                            x340Var.r(z5);
                        }
                    }
                    x340Var.r(z5);
                    z8 = true;
                } else {
                    x340Var.i0(1053508690);
                    x340Var.r(z10);
                    x340Var.r(z10);
                    qim0Var4 = qim0Var3;
                    z8 = z11;
                    function2 = function0;
                }
                x340Var.r(z8);
                qim0Var2 = qim0Var4;
            } else {
                x340Var2.i0(1052701698);
                qim0 qim0VarE7 = pw31Var.e(qim0Var5, een.Z);
                String strO0 = cwl1.o0(x340Var2, 2131959086);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                z7 = z4;
                qim0Var3 = qim0Var5;
                wro1.h(new gbx(new y50(strO0), function1), new hdx(0, (vu30) null, (vu30) null, (vu30) null, (hw61) null, 31), qim0VarE7, null, yla.s(x340Var2), null, false, null, null, h3j.a, x340Var2, 12582912, 6, 856);
                x340Var = x340Var2;
                x340Var.r(z7);
                function2 = function0;
            }
            z5 = z7;
            qim0Var4 = qim0Var3;
            x340Var.r(z5);
            z8 = true;
            x340Var.r(z8);
            qim0Var2 = qim0Var4;
        } else {
            function2 = function0;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(z, z2, i, xqn0Var2, function2, qim0Var2, function1, vu30Var, i2);
        }
    }

    public static qim0 k(qim0 qim0Var, Function0 function0) {
        return zr7.i(qim0Var, new oa5(function0, (byte) 0));
    }

    public static void l(CaptureRequest.Builder builder, eqq0 eqq0Var) {
        uq8 uq8VarD = l2a.l(eqq0Var).d();
        for (sy8 sy8Var : uq8VarD.c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) sy8Var.c;
            try {
                builder.set(key, uq8VarD.e(sy8Var));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                j2h1.p("Camera2CaptureRequestBuilder");
            }
        }
    }

    public static void m(CaptureRequest.Builder builder, int i, ju8 ju8Var) {
        Map mapUnmodifiableMap;
        if (i == 3 && ju8Var.a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                ju8Var.getClass();
            } else if (ju8Var.b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest n(wnd wndVar, CameraDevice cameraDevice, HashMap map, boolean z, ju8 ju8Var) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        eqq0 eqq0Var = wndVar.b;
        if (cameraDevice != null) {
            ArrayList arrayList = wndVar.a;
            int i = wndVar.c;
            TreeMap treeMap = eqq0Var.a;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) map.get((j2t) it.next());
                if (surface == null) {
                    hhg1.n("DeferrableSurface not in configuredSurfaceMap");
                    return null;
                }
                arrayList2.add(surface);
            }
            if (!arrayList2.isEmpty()) {
                j2d j2dVar = wndVar.g;
                if (i == 5 && j2dVar != null && (j2dVar.b() instanceof TotalCaptureResult)) {
                    j2h1.o("Camera2CaptureRequestBuilder");
                    builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) j2dVar.b());
                } else {
                    j2h1.o("Camera2CaptureRequestBuilder");
                    if (i == 5) {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
                    } else {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
                    }
                }
                m(builderCreateCaptureRequest, i, ju8Var);
                sy8 sy8Var = wnd.j;
                Object objE = i29.f;
                try {
                    objE = eqq0Var.e(sy8Var);
                } catch (IllegalArgumentException unused) {
                }
                Range range = (Range) objE;
                Objects.requireNonNull(range);
                Object objE2 = i29.f;
                if (!range.equals(objE2)) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    try {
                        objE2 = eqq0Var.e(wnd.j);
                    } catch (IllegalArgumentException unused2) {
                    }
                    Range range2 = (Range) objE2;
                    Objects.requireNonNull(range2);
                    builderCreateCaptureRequest.set(key, range2);
                }
                if (wndVar.a() == 1 || wndVar.b() == 1) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                } else if (wndVar.a() == 2) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                } else if (wndVar.b() == 2) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                }
                sy8 sy8Var2 = wnd.h;
                if (treeMap.containsKey(sy8Var2)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) eqq0Var.e(sy8Var2));
                }
                sy8 sy8Var3 = wnd.i;
                if (treeMap.containsKey(sy8Var3)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) eqq0Var.e(sy8Var3)).byteValue()));
                }
                l(builderCreateCaptureRequest, eqq0Var);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    builderCreateCaptureRequest.addTarget((Surface) it2.next());
                }
                builderCreateCaptureRequest.setTag(wndVar.f);
                return builderCreateCaptureRequest.build();
            }
        }
        return null;
    }

    public static CaptureRequest o(wnd wndVar, CameraDevice cameraDevice, ju8 ju8Var) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        int i = wndVar.c;
        j2h1.o("Camera2CaptureRequestBuilder");
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        m(builderCreateCaptureRequest, i, ju8Var);
        l(builderCreateCaptureRequest, wndVar.b);
        return builderCreateCaptureRequest.build();
    }

    public static vma0 p(oma0 oma0Var) {
        e4x0 e4x0Var = e4x0.f;
        i0h1 i0h1VarQ = e4x0Var.q((b7) oma0Var);
        int iR = e4x0Var.R(i0h1VarQ);
        ArrayList arrayList = new ArrayList(iR);
        for (int i = 0; i < iR; i++) {
            arrayList.add(e4x0Var.h0(i0h1VarQ, i));
        }
        return !arrayList.isEmpty() ? new vma0(sqg0.T(o7h.v1(arrayList, oma0Var.v()))) : vma0.b;
    }

    public static final af5 q(af5 af5Var, zma1 zma1Var, zma1 zma1Var2, zma1 zma1Var3, String str, Function0 function0, yae1 yae1Var, lee1 lee1Var, int i) {
        String str2 = af5Var.b;
        String strConcat = " ".concat(str);
        if (yae1.b(yae1Var, af5Var, lee1Var, 0, false, 0, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1980).b.f <= 4) {
            return af5Var;
        }
        int length = str2.length();
        int length2 = str2.length() / 2;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) / 2;
            ye5 ye5Var = new ye5();
            ye5Var.h(af5Var.f(0, i3));
            int iO = ye5Var.o(zma1Var);
            try {
                ye5Var.g("...");
                ye5Var.k(iO);
                int iO2 = ye5Var.o(zma1Var2);
                String str3 = strConcat;
                try {
                    ye5Var.g(str3);
                    ye5Var.k(iO2);
                    if (yae1.b(yae1Var, ye5Var.p(), lee1Var, 0, false, 0, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1980).b.f <= 4) {
                        i2 = i3 + 1;
                        length2 = i3;
                    } else {
                        length = i3 - 1;
                    }
                    strConcat = str3;
                } catch (Throwable th) {
                    ye5Var.k(iO2);
                    throw th;
                }
            } catch (Throwable th2) {
                ye5Var.k(iO);
                throw th2;
            }
        }
        String str4 = strConcat;
        ye5 ye5Var2 = new ye5();
        ye5Var2.h(af5Var.f(0, length2));
        int iO3 = ye5Var2.o(zma1Var);
        try {
            ye5Var2.g("...");
            ye5Var2.k(iO3);
            int iL = ye5Var2.l(new kjc0("see_more", new pae1(zma1Var2, zma1Var3, 6), new nbg(function0, (byte) 6)));
            try {
                ye5Var2.g(str4);
                return ye5Var2.p();
            } finally {
                ye5Var2.k(iL);
            }
        } catch (Throwable th3) {
            ye5Var2.k(iO3);
            throw th3;
        }
    }

    public static void r() {
        vma0 vma0Var = vma0.b;
    }

    public static void s(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.w1 = ynb0Var;
    }

    public static void t(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.k1 = ynb0Var;
    }

    public static void u(SpotifyMainActivity spotifyMainActivity, mmo mmoVar) {
        spotifyMainActivity.j1 = mmoVar;
    }

    public static void v(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.x1 = ynb0Var;
    }

    public static void w(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.v1 = ynb0Var;
    }

    public static void x(SpotifyMainActivity spotifyMainActivity, ynb0 ynb0Var) {
        spotifyMainActivity.u1 = ynb0Var;
    }

    public static void y(SpotifyMainActivity spotifyMainActivity, yun0 yun0Var) {
        spotifyMainActivity.t1 = yun0Var;
    }

    public static void z(SpotifyMainActivity spotifyMainActivity, mjv mjvVar) {
        spotifyMainActivity.h1 = mjvVar;
    }
}
