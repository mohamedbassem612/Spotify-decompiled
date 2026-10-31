package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.contentagnostic.v2.Audio;
import com.spotify.contentagnostic.v2.Transcript;
import com.spotify.contentagnostic.v2.Video;
import com.spotify.contentagnostic.v2.VideoAsset;
import defpackage.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l3p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(String str, String str2, hti1 hti1Var, qim0 qim0Var, String str3, b0k b0kVar, int i) {
        String str4;
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2029939253);
        if ((i & 6) == 0) {
            str4 = str;
            i2 = (b0kVar3.g(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.e(hti1Var.ordinal()) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(str3) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = gx0.d;
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            cwl1.b(s161.b(qim0Var3, false, (iu30) objT), (tl3) null, er31.b(2.0f), hti1Var.a, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1407089314, new k8((Object) str4, (Object) str2, (Object) hti1Var, (Object) str3, (byte) 2), b0kVar3), b0kVar2, 0, 48, 2018);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(str, str2, hti1Var, qim0Var2, str3, i);
        }
    }

    public static final void b(String str, String str2, hti1 hti1Var, qim0 qim0Var, String str3, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(666882094);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.e(hti1Var.ordinal()) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.g(str3) ? 16384 : 8192);
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.b0();
        } else if (str2 == null || ihc1.y0(str2)) {
            x340Var.i0(-1434050757);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            c(hti1Var, uyn1.y(qim0Var, 6.0f, 2.0f), str, str3, x340Var, ((i2 >> 6) & 14) | ((i2 << 6) & 896) | ((i2 >> 3) & 7168));
            x340Var.r(false);
        } else {
            x340Var.i0(-1433742028);
            String strN0 = cwl1.n0(2131951992, new Object[]{str}, x340Var);
            qim0 qim0VarD = sgc1.D(1, qim0Var);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new v1(strN0, (byte) 9);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarD, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            Uri uri = Uri.parse(str2);
            qim0 qim0VarQ = i1p1.q(d7e.r(1.0f, u291.c(nim0.a, 1.0f), false), er31.b(hti1Var.b));
            uwr uwrVar2 = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            ebp1.a(uri, qim0VarQ, null, new p3v(24.0f), x340Var, 384, 0);
            wnb0 wnb0Var = new wnb0(1.0f, false);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            c(hti1Var, uyn1.y(wnb0Var, 6.0f, 2.0f), str, str3, x340Var, ((i2 >> 6) & 14) | ((i2 << 6) & 896) | ((i2 >> 3) & 7168));
            x340Var.r(true);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m((Object) str, (Object) str2, (Object) hti1Var, qim0Var, (Object) str3, i, (byte) 2);
        }
    }

    public static final void c(hti1 hti1Var, qim0 qim0Var, String str, String str2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        lee1 lee1Var;
        lee1 lee1Var2;
        long j;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1188341526);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.e(hti1Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str2) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(b0kVar3, 2131951993);
            boolean z2 = hti1Var == hti1.f;
            if (z2) {
                b0kVar3.i0(465105464);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(b0kVar3).h;
            } else {
                b0kVar3.i0(465106675);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(b0kVar3).j;
            }
            b0kVar3.r(false);
            if (z2) {
                b0kVar3.i0(465109044);
                lee1Var2 = cbx.d(b0kVar3).g;
            } else {
                b0kVar3.i0(465110131);
                lee1Var2 = cbx.d(b0kVar3).j;
            }
            b0kVar3.r(false);
            if (z2) {
                b0kVar3.i0(465112529);
                j = ((u7h) b0kVar3.k(qgx.a)).a;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(465113976);
                b0kVar3.r(false);
                j = ((vex) zex.a.e).m;
            }
            ye5 ye5VarO = kk0.o(465116226, b0kVar3);
            if (str == null || ihc1.y0(str)) {
                z = false;
                b0kVar3.i0(36310330);
                b0kVar3.r(false);
                ye5VarO.g(strO0);
            } else {
                b0kVar3.i0(36352893);
                zma1 zma1Var = lee1Var.a;
                int iO = ye5VarO.o(new zma1(cbx.a(b0kVar3).b.a, 0L, zma1Var.c, zma1Var.d, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490));
                try {
                    ye5VarO.g(str);
                    ye5VarO.k(iO);
                    ye5VarO.g(" • ");
                    ye5VarO.g(strO0);
                    z = false;
                    b0kVar3.r(false);
                } catch (Throwable th) {
                    ye5VarO.k(iO);
                    throw th;
                }
            }
            af5 af5VarP = ye5VarO.p();
            b0kVar3.r(z);
            qim0 qim0VarN = e9k.n(62, qim0Var);
            qim0 qim0VarB = nim0.a;
            if (str2 == null || str == null || ihc1.y0(str)) {
                b0kVar3.i0(1534596214);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1534435448);
                qim0 qim0VarN2 = anm1.N(str2, qim0VarB);
                boolean z3 = (i2 & 896) == 256;
                Object objT = b0kVar3.T();
                if (z3 || objT == fkj0.X) {
                    objT = new v1(str, (byte) 10);
                    b0kVar3.s0(objT);
                }
                qim0VarB = s161.b(qim0VarN2, false, (iu30) objT);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, j, qim0VarN.then(qim0VarB), lee1Var2, new a0e1(5), null, 0, false, new cjc0(1), 0, null, null, b0kVar2, 0, 0, 3808);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(hti1Var, qim0Var, str, str2, i);
        }
    }

    public static final void d(boolean z, boolean z2, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        b0k b0kVar2;
        ven0 ven0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1687024140);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.h(z2) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            int i4 = i2 & 896;
            boolean z3 = (i3 == 4) | (i4 == 256);
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new w73(z, iu30Var, (lnm) null);
                b0kVar3.s0(objT2);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT2);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            Boolean boolValueOf3 = Boolean.valueOf(z2);
            Boolean bool = (Boolean) ven0Var2.getValue();
            bool.getClass();
            boolean zI = (i3 == 4) | ((i2 & 112) == 32) | b0kVar3.i(ven0Var2) | (i4 == 256);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                ven0Var = ven0Var2;
                es9 es9Var = new es9(z, z2, iu30Var, ven0Var, (lnm) null, (byte) 0);
                b0kVar3.s0(es9Var);
                objT3 = es9Var;
            } else {
                ven0Var = ven0Var2;
            }
            qxd0.r(boolValueOf2, boolValueOf3, bool, (vu30) objT3, b0kVar3);
            j2iVar2 = j2iVar;
            b0kVar2 = b0kVar3;
            fq7.g(z2, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(-1313019164, new fs9(j2iVar2, ven0Var), b0kVar3), b0kVar2, ((i2 >> 3) & 14) | 196608, 18);
        } else {
            j2iVar2 = j2iVar;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(z, z2, (Object) iu30Var, (Object) j2iVar2, i, (byte) 1);
        }
    }

    public static final void e(boolean z, int i, w2k1 w2k1Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, j2i j2iVar6, qim0 qim0Var, iu30 iu30Var, Function0 function0, iu30 iu30Var2, b0k b0kVar, int i2) {
        j2i j2iVar7;
        Function0 function1;
        qim0 qim0Var2;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1343483165);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.h(z) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.e(2) ? 256 : 128) | (x340Var.i(w2k1Var) ? 2048 : 1024);
        int i4 = 6 | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            int i5 = i3 & 112;
            boolean z3 = i5 == 32;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = c13.l(i == 2, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            boolean zI = x340Var.i(ven0Var) | ((i4 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new wq9(iu30Var2, ven0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarD, false, null, null, null, (Function0) objT2, 15);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean zI2 = ((i3 & 896) == 256) | (i5 == 32) | x340Var.i(w2k1Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new ym(i, w2k1Var, (byte) 6);
                x340Var.s0(objT3);
            }
            dm5.a((iu30) objT3, u291.d(qim0Var3, 1.0f), (iu30) null, x340Var, 0, 4);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI3 = x340Var.i(ven0Var);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new cy7(ven0Var, (byte) 5);
                x340Var.s0(objT4);
            }
            d(z, zBooleanValue, (iu30) objT4, apo.r(-1640225865, new gs9(i, iu30Var, function0, j2iVar, j2iVar2, j2iVar3, j2iVar4, j2iVar5, j2iVar6), x340Var), x340Var, (i3 & 14) | 3072);
            x340Var = x340Var;
            if (i == 1) {
                x340Var.i0(-259025431);
                qim0Var2 = qim0Var3;
                qim0 qim0VarA = h2c.a.a(qim0Var2, een.f);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                j2iVar7 = j2iVar2;
                function1 = function0;
                fq7.f(((Boolean) ven0Var.getValue()).booleanValue(), (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(-963863686, new rv71(j2iVar7, (byte) 5), x340Var), x340Var, 1572870, 18);
                i((i4 >> 6) & 14, function1, x340Var, null);
                z2 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                j2iVar7 = j2iVar2;
                function1 = function0;
                z2 = true;
                qim0Var2 = qim0Var3;
                x340Var.i0(-258789025);
                x340Var.r(false);
            }
            x340Var.r(z2);
        } else {
            j2iVar7 = j2iVar2;
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hs9(z, i, w2k1Var, j2iVar, j2iVar7, j2iVar3, j2iVar4, j2iVar5, j2iVar6, qim0Var2, iu30Var, function1, iu30Var2, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(iu30 iu30Var, cr71 cr71Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        j2i j2iVar3;
        mmr0 mmr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2008616983);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.g(cr71Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (cr71Var.equals(ar71.a)) {
                x340Var.i0(1840613886);
                p3v p3vVar = new p3v(8.0f);
                uwr uwrVar = cbx.a;
                mmr0Var = new mmr0(p3vVar, new u7h(cbx.a(x340Var).a.c));
                x340Var.r(false);
            } else {
                if (!cr71Var.equals(br71.a)) {
                    throw p3d1.k(x340Var, 1840612149, false);
                }
                x340Var.i0(1840616421);
                p3v p3vVar2 = new p3v(0.0f);
                uwr uwrVar2 = cbx.a;
                mmr0Var = new mmr0(p3vVar2, new u7h(cbx.a(x340Var).a.b.a()));
                x340Var.r(false);
            }
            float f = ((p3v) mmr0Var.a).a;
            long j = ((u7h) mmr0Var.b).a;
            long jB = eah.b(j, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            boolean z = (i2 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new m861(iu30Var, (byte) 20);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = qi71.X0;
                x340Var.s0(objT3);
            }
            j2iVar3 = j2iVar;
            w3d1.b(function0, s161.b(qim0Var, false, (iu30) objT3), false, er31.b(22.0f), j, jB, f, f, idn0Var, apo.r(-1348420500, new pmg0(j2iVar3, j2iVar2, (byte) 1), x340Var), x340Var, 805306368, 260);
        } else {
            j2iVar3 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(iu30Var, cr71Var, j2iVar3, j2iVar2, qim0Var, i);
        }
    }

    public static final void g(String str, boolean z, Function0 function0, qim0 qim0Var, Integer num, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(750187874);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | 3072 | (b0kVar3.g(num) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, apo.r(-2145634513, new wr1(cwl1.o0(b0kVar3, z ? 2131953969 : 2131953967), cwl1.o0(b0kVar3, z ? 2131953966 : 2131953968), function0, str, z, num), b0kVar3), b0kVar2, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((Object) str, z, (cv30) function0, qim0Var2, (Object) num, i, (byte) 10);
        }
    }

    public static final void h(Context context, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(331687122);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(context) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
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
            String string = context.getString(2131959691);
            uwr uwrVar = cbx.a;
            uwo1.e(string, null, cbx.d(x340Var).d, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(context.getString(2131959689), uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 20);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(13), qim0VarB, null, null, null, null, null, null, null, apo.r(1498813373, new yd2(context, (byte) 6), x340Var), x340Var, 0, 48, 2040);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(context, function0, i, (byte) 22);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-167984345);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0Var2 = nim0.a;
            wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var2, null, yla.r(x340Var), null, false, null, null, v8i.a, x340Var, (i3 << 3) & 896, 6, 984);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var2, i, (byte) 5);
        }
    }

    public static final void j(Function0 function0, Function0 function1, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, j2i j2iVar6, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        j2i j2iVar7 = j2iVar3;
        j2i j2iVar8 = j2iVar4;
        j2i j2iVar9 = j2iVar5;
        iu30 iu30Var2 = iu30Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1286233116);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(j2iVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(j2iVar7) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(j2iVar8) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.i(j2iVar9) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var2.i(j2iVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var2.i(iu30Var2) ? 67108864 : 33554432;
        }
        int i3 = i2 | 805306368;
        if (x340Var2.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, ((vex) zex.a.e).d, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            gra graVar = een.d;
            h2c h2cVar = h2c.a;
            qim0 qim0VarF2 = u291.f(h2cVar.a(qim0Var3, graVar), 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, wnb0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            dv20.l((i3 >> 6) & 14, j2iVar, x340Var2, true);
            j2iVar2.invoke(x340Var2, Integer.valueOf((i3 >> 9) & 14));
            i((i3 >> 3) & 14, function1, x340Var2, null);
            x340Var2.r(true);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF3);
            iu30Var2 = iu30Var;
            ni6 ni6Var = new ni6(iu30Var2, (byte) 1);
            rih1 rih1Var = rih1.a;
            qim0 qim0VarB = f8d1.b(qim0VarZ, rih1Var, ni6Var);
            jw31 jw31VarA2 = ew31.a(h36.f, fraVar, x340Var2, 0);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA2, x340Var2, lljVar);
            nko1.H(xos0VarM4, x340Var2, lljVar2);
            x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar4);
            j2iVar8 = j2iVar4;
            j2iVar8.invoke(x340Var2, Integer.valueOf((i3 >> 15) & 14));
            j2iVar7 = j2iVar3;
            j2iVar7.invoke(x340Var2, Integer.valueOf((i3 >> 12) & 14));
            dv20.l((i3 >> 21) & 14, j2iVar6, x340Var2, true);
            qim0 qim0VarF4 = u291.f(h2cVar.a(qim0Var3, een.X), 1.0f);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = f8d1.b(uyn1.x(qim0VarF4, 16.0f), rih1Var, new ni6(iu30Var2, (byte) 1));
            jw31 jw31VarA3 = ew31.a(gex0Var, fraVar, x340Var2, 0);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA3, x340Var2, lljVar);
            nko1.H(xos0VarM5, x340Var2, lljVar2);
            x0d.q(iHashCode5, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE5, x340Var2, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var2 = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode6 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM6 = x340Var2.m();
            qim0 qim0VarE6 = zr7.E(x340Var2, wnb0Var2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC3, x340Var2, lljVar);
            nko1.H(xos0VarM6, x340Var2, lljVar2);
            x0d.q(iHashCode6, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE6, x340Var2, lljVar4);
            j2iVar9 = j2iVar5;
            dv20.l((i3 >> 18) & 14, j2iVar9, x340Var2, true);
            k(function0, zox.c, cwl1.o0(x340Var2, 2131953060), null, x340Var2, (i3 & 14) | (zox.d << 3), 8);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new is9((Object) function0, (Object) function1, (Object) j2iVar, (Object) j2iVar2, (Object) j2iVar7, (Object) j2iVar8, (Object) j2iVar9, (Object) j2iVar6, (Object) iu30Var2, qim0Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void k(Function0 function0, hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        byte b2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(905503677);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 2048 : 1024;
            }
            b2 = 1;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                b0kVar2 = b0kVar3;
                wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var4, null, null, null, false, null, null, apo.r(-556764538, new cp9(huxVar, str, b2), b0kVar3), b0kVar2, (i3 >> 3) & 896, 6, 1016);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2((Object) function0, (Parcelable) huxVar, str, (Object) qim0Var3, i, i2, (byte) 2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        b2 = 1;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var4, null, null, null, false, null, null, apo.r(-556764538, new cp9(huxVar, str, b2), b0kVar3), b0kVar2, (i3 >> 3) & 896, 6, 1016);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) function0, (Parcelable) huxVar, str, (Object) qim0Var3, i, i2, (byte) 2);
        }
    }

    public static final void l(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-619909198);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, ((vex) zex.a.e).d, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            inx inxVar = inx.c;
            String strO0 = cwl1.o0(x340Var, 2131953059);
            qim0 qim0VarA = h2c.a.a(qim0Var2, een.Y);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            function1 = function0;
            k(function1, inxVar, strO0, uyn1.x(qim0VarA, 16.0f), x340Var, (i2 & 14) | (inx.d << 3), 0);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function1, qim0Var, i, (byte) 6);
        }
    }

    public static final void m(Context context, Function0 function0, String str, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(523453853);
        int i2 = i | (x340Var.i(context) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            if (str != null) {
                x340Var.i0(115243754);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = fnc0.X0;
                    x340Var.s0(objT);
                }
                lrn1.h(((i2 >> 6) & 14) | 48, 4, str, (Function0) objT, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(115317782);
                h(context, function0, x340Var, i2 & 126);
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
            h311VarV.d = new cb60(i, (Object) context, (Object) function0, (Object) str, (Object) qim0Var2, (byte) 24);
        }
    }

    public static final void n(String str, jo70 jo70Var, xkk1 xkk1Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(291497868);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(jo70Var) ? 32 : 16) | (b0kVar3.i(xkk1Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(b0kVar3).a.a.c();
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            jto1.b(dug.f(qim0Var, jC, er31.b(16.0f)), null, null, false, null, null, null, null, null, apo.r(2128138115, new mbj0(xkk1Var, (byte) 14), b0kVar3), apo.r(-1244952573, new qdg0(str, (byte) 7), b0kVar3), apo.r(-26672956, new pdk0(jo70Var, (byte) 0), b0kVar3), j2iVar, null, null, apo.r(551478216, new pdk0(jo70Var, (byte) 1), b0kVar3), b0kVar2, 805306368, 197046, 25086);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 6, i, str, jo70Var, xkk1Var, qim0Var, j2iVar);
        }
    }

    public static final void o(tm11 tm11Var, p40 p40Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Function0 function0;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-711373789);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? i | (x340Var.i(tm11Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(p40Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 12.0f, 5);
            boolean zI = x340Var.i(tm11Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ak01(tm11Var, (byte) 21);
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0Var3, 16.0f, 6.0f, 16.0f, 6.0f);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = hm11.P0;
                x340Var.s0(objT2);
            }
            Function0 function2 = function1;
            qim0 qim0Var4 = qim0Var3;
            byte b2 = 1;
            uwo1.e(tm11Var.a, s161.b(qim0VarA, false, (iu30) objT2), cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            ArrayList arrayList = tm11Var.b;
            x340Var.i0(-940968456);
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                sm11 sm11Var = (sm11) obj;
                byte b3 = i4 == arrayList.size() - b2 ? b2 : (byte) 0;
                boolean zE = x340Var.e(i4);
                Object objT3 = x340Var.T();
                if (zE || objT3 == m4cVar) {
                    objT3 = new sl11(i4, b2);
                    x340Var.s0(objT3);
                }
                qim0 qim0Var5 = qim0Var4;
                qim0 qim0VarB3 = s161.b(qim0Var5, false, (iu30) objT3);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB3);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function2;
                    x340Var.l(function0);
                } else {
                    function0 = function2;
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                function2 = function0;
                otw.c(p40Var, sm11Var, (qim0) null, (ipb1) null, x340Var, (i3 >> 3) & 14, 12);
                x340Var.r(true);
                if (b3 == 0) {
                    x340Var.i0(1694085969);
                    qim0 qim0VarF2 = u291.f(qim0Var5, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    cvx cvxVar8 = cbx.b(x340Var).b;
                    rqo1.g(0, 0, x340Var, uyn1.B(qim0VarF2, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1694327180);
                    x340Var.r(false);
                }
                b2 = 1;
                qim0Var4 = qim0Var5;
                i4 = i5;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(tm11Var, p40Var, qim0Var2, i, (byte) 23);
        }
    }

    public static final void p(er71 er71Var, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, cr71 cr71Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-750060231);
        int i2 = i | (x340Var.g(er71Var) ? 4 : 2) | (x340Var.i(gw70Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024) | (x340Var.g(cr71Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            nyx.a(2, (wux) null, apo.r(1862829068, new wyy0(er71Var, qim0Var, (idn0) objT, iu30Var, cr71Var, gw70Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(er71Var, gw70Var, iu30Var, qim0Var, cr71Var, i);
        }
    }

    public static final zma1 q(x340 x340Var) {
        uwr uwrVar = cbx.a;
        FontFamily fontFamily = cbx.d(x340Var).k.a.f;
        return new zma1(0L, 0L, cbx.d(x340Var).k.a.c, cbx.d(x340Var).k.a.d, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65491);
    }

    public static final List r(String str, List list) {
        int iIndexOf = list.indexOf(str);
        if (iIndexOf == -1) {
            return o7h.d1(list, Math.min(100, list.size()));
        }
        int iMin = Math.min(Math.min(50, list.size()), iIndexOf);
        List list2 = list;
        List listD1 = o7h.d1(o7h.k0(list2, iIndexOf - iMin), iMin);
        return o7h.N0(o7h.d1(o7h.k0(list2, iIndexOf), 100 - listD1.size()), listD1);
    }

    public static final void t(h4e1 h4e1Var, int i, int i2) {
        h4e1Var.e = false;
        nbe1 nbe1Var = h4e1Var.h;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        h4e1Var.k(iMin, iMax, "");
        if (nbe1Var != null) {
            long jG = u2p1.g(nbe1Var.a, iMin, iMax, 0);
            if (nbe1.d(jG)) {
                h4e1Var.o((nbe1) null);
            } else {
                h4e1Var.n(nbe1.g(jG), nbe1.f(jG), (List) null);
            }
        }
    }

    public static final void u(h4e1 h4e1Var, int i, int i2, CharSequence charSequence) {
        h4e1 h4e1Var2;
        yzr0 yzr0Var = h4e1Var.c;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == yzr0Var.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        int i5 = iMax;
        while (i5 > i4 && length > i3 && charSequence.charAt(length - 1) == yzr0Var.charAt(i5 - 1)) {
            length--;
            i5--;
        }
        if (i4 == i5 && i3 == length) {
            h4e1Var.o((nbe1) null);
            h4e1Var.t = null;
            h4e1Var2 = h4e1Var;
        } else {
            CharSequence charSequenceSubSequence = (i3 == 0 && length == charSequence.length()) ? charSequence : charSequence.subSequence(i3, length);
            h4e1Var2 = h4e1Var;
            h4e1.l(h4e1Var2, i4, i5, charSequenceSubSequence, 0, 0, false, 24);
        }
        int length2 = charSequence.length() + iMin;
        h4e1Var2.p(e6p1.e(length2, length2));
    }

    public static final go80 v(klm klmVar, zbp0 zbp0Var) {
        return klmVar.a("SaveProfileDaemon", new mcp0(zbp0Var, (byte) 11));
    }

    public static final boolean w(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        return (device == null || device.isVirtual() || device.getKeyboardType() != 2 || (keyEvent.getFlags() & 2) == 2) ? false : true;
    }

    public static final boolean x(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final z6j1 y(Video video) {
        x6j1 w6j1Var;
        VideoAsset videoAssetO = video.o();
        int iR = videoAssetO.r();
        int i = iR == 0 ? -1 : lqj1.a[l1d.C(iR)];
        if (i == 1) {
            w6j1Var = new w6j1(new so20(videoAssetO.p().o()));
        } else {
            if (i != 2) {
                hhg1.n("Unknown video type");
                return null;
            }
            w6j1Var = new x6j1(videoAssetO.q().getManifestId());
        }
        mq70 mq70VarY = z1p1.y(video.r());
        Audio audioQ = video.q();
        ko7 ko7VarB = audioQ != null ? jto1.B(audioQ) : null;
        Transcript transcriptS = video.s();
        return new z6j1(w6j1Var, mq70VarY, ko7VarB, transcriptS != null ? new l8g1(new so20(transcriptS.p().o())) : null);
    }

    public float s(jot jotVar) {
        return jotVar.O0 * 10000.0f;
    }

    public void z(jot jotVar, float f) {
        jotVar.O0 = f / 10000.0f;
        jotVar.invalidateSelf();
    }
}
