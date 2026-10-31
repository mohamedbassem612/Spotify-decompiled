package p;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Patterns;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wwo1 {
    public static b180 a;

    public static final void A(de5 de5Var, long j, float f, id5 id5Var, ie5 ie5Var, iu30 iu30Var) {
        long jE = f == 0.0f ? id5Var.e() : (long) ((j - de5Var.c) / f);
        de5Var.g = j;
        de5Var.e.setValue(id5Var.g(jE));
        de5Var.f = id5Var.c(jE);
        if (id5Var.d(jE)) {
            de5Var.h = de5Var.g;
            de5Var.i.setValue(Boolean.FALSE);
        }
        N(de5Var, ie5Var);
        iu30Var.invoke(de5Var);
    }

    public static final uyx B(dvx dvxVar, b0k b0kVar) {
        FontWeight fontWeight = FontWeight.f;
        lee1 lee1Var = new lee1(0L, dvxVar.j, fontWeight, hrt.c(5, fontWeight, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
        FontWeight fontWeight2 = FontWeight.e;
        lee1 lee1Var2 = new lee1(0L, dvxVar.i, fontWeight2, hrt.c(4, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
        lee1 lee1Var3 = new lee1(0L, dvxVar.h, fontWeight2, hrt.c(4, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
        lee1 lee1Var4 = new lee1(0L, dvxVar.g, fontWeight2, hrt.c(4, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
        lee1 lee1Var5 = new lee1(0L, dvxVar.f, fontWeight2, hrt.c(4, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
        lee1 lee1Var6 = new lee1(0L, dvxVar.e, fontWeight2, hrt.c(4, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113);
        FontWeight fontWeight3 = FontWeight.b;
        return new uyx(lee1Var, lee1Var2, lee1Var3, lee1Var4, lee1Var5, lee1Var6, new lee1(0L, dvxVar.d, fontWeight3, hrt.c(2, fontWeight3, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.d, fontWeight2, hrt.c(3, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.d, fontWeight3, hrt.c(1, fontWeight3, 2, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.c, fontWeight3, hrt.c(2, fontWeight3, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.c, fontWeight2, hrt.c(3, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.c, fontWeight3, hrt.c(1, fontWeight3, 2, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.b, fontWeight3, hrt.c(2, fontWeight3, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.b, fontWeight2, hrt.c(3, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.a, fontWeight3, hrt.c(2, fontWeight3, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113), new lee1(0L, dvxVar.a, fontWeight2, hrt.c(3, fontWeight2, 1, b0kVar), 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777113));
    }

    public static final float C(o8n o8nVar) {
        qmm0 qmm0VarA = o8nVar.A(xj20.P0);
        float fI = qmm0VarA != null ? qmm0VarA.i() : 1.0f;
        if (fI >= 0.0f) {
            return fI;
        }
        dmv0.b("negative scale factor");
        return fI;
    }

    public static final a690 D(ug30 ug30Var) {
        Bundle bundleO0 = ug30Var.b().O0();
        if (bundleO0.getBoolean("FeatureIdentifier.InternalReferrer.Self", false)) {
            return new a690(ug30Var.Q());
        }
        a690 parcelable = bundleO0.getParcelable("FeatureIdentifier.InternalReferrer");
        if (parcelable != null) {
            return parcelable;
        }
        hhg1.n("The feature identifier is undeclared. Have you forgotten to set it with FeatureIdentifierArgumentsHelper?");
        return null;
    }

    public static final go80 G(klm klmVar, xcp0 xcp0Var) {
        return klmVar.a("DevicePredictabilityProximityDetectorDaemon", new nbp0(xcp0Var, (byte) 3));
    }

    public static boolean I(wo4 wo4Var) {
        return wo4Var.a();
    }

    public static final void J(zf30 zf30Var, a690 a690Var) {
        Bundle bundle = zf30Var.f;
        if (bundle == null) {
            bundle = new Bundle();
            zf30Var.T0(bundle);
        }
        bundle.putParcelable("FeatureIdentifier.InternalReferrer", a690Var);
    }

    public static final float K(idn0 idn0Var, b0k b0kVar) {
        return ((Number) z95.b(((Boolean) k1u.m(idn0Var, b0kVar, 0).getValue()).booleanValue() ? 0.5f : 1.0f, irn1.o0(150, 0, null, 6), (String) null, (iu30) null, b0kVar, 0, 28).getValue()).floatValue();
    }

    public static final void N(de5 de5Var, ie5 ie5Var) {
        ie5Var.b.setValue(de5Var.e.getValue());
        oe5 oe5Var = ie5Var.c;
        oe5 oe5Var2 = de5Var.f;
        int iB = oe5Var.b();
        for (int i = 0; i < iB; i++) {
            oe5Var.e(oe5Var2.a(i), i);
        }
        ie5Var.e = de5Var.h;
        ie5Var.d = de5Var.g;
        ie5Var.f = ((Boolean) de5Var.i.getValue()).booleanValue();
    }

    public static final void O(zy70 zy70Var) {
        if (zy70Var.c != null) {
            hhg1.n("request.target must be null.");
        } else {
            if (((x8c0) kto1.u(zy70Var, dz70.e)) == null) {
                return;
            }
            hhg1.n("request.lifecycle must be null.");
        }
    }

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-35230638);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            plx plxVar = plx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(plxVar, isl.a, u291.r(qim0Var, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 21);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.vu30 */
    public static final void b(String str, w4i1 w4i1Var, c380 c380Var, boolean z, boolean z2, vu30 vu30Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i, int i2) throws vu30 {
        qim0 qim0Var2;
        int i3;
        x340 x340Var;
        qim0 qim0Var3;
        String strN0;
        int i4;
        vu30 vu30Var2;
        String strK;
        Function0 function2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-249928424);
        int i5 = (x340Var2.g(str) ? 4 : 2) | i | (x340Var2.g(w4i1Var) ? 32 : 16) | (x340Var2.g(c380Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= x340Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= x340Var2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= x340Var2.i(vu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= x340Var2.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= x340Var2.i(function1) ? 8388608 : 4194304;
        }
        int i6 = i2 & 256;
        if (i6 != 0) {
            i3 = i5 | 100663296;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i5 | (x340Var2.i(qim0Var2) ? 67108864 : 33554432);
        }
        if (x340Var2.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i6 != 0 ? qim0Var4 : qim0Var2;
            if (c380Var.size() > 1) {
                x340Var2.i0(336965798);
                x340Var2.r(false);
                strN0 = o7h.y0(o7h.a1(c380Var, new p0d((byte) 8)), ", ", (String) null, (String) null, rmf.T0, 30);
            } else if (c380Var.size() == 1) {
                x340Var2.i0(1856058623);
                strN0 = cwl1.n0(2131953781, new Object[]{w4i1Var.b}, x340Var2) + ", " + ((w4i1) o7h.q0(c380Var)).b;
                x340Var2.r(false);
            } else {
                x340Var2.i0(336974403);
                strN0 = cwl1.n0(2131953781, new Object[]{w4i1Var.b}, x340Var2);
                x340Var2.r(false);
            }
            if (str != null) {
                strN0 = str;
            }
            if (z2) {
                i4 = 2131953784;
            } else {
                i4 = z ? 2131953782 : 2131953786;
            }
            String strN1 = cwl1.n0(i4, new Object[]{strN0}, x340Var2);
            if (z2) {
                vu30Var2 = null;
                strK = x0d.k(x340Var2, 336991595, 2131953783, x340Var2, false);
            } else {
                vu30Var2 = null;
                x340Var2.i0(1856859941);
                x340Var2.r(false);
                strK = null;
            }
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT;
            String str2 = strK;
            float fK = K(idn0Var, x340Var2);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var2);
            }
            idn0 idn0Var2 = (idn0) objT2;
            float fK2 = K(idn0Var2, x340Var2);
            if (function0 == null) {
                x340Var2.i0(1857204104);
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = xrc.c1;
                    x340Var2.s0(objT3);
                }
                x340Var2.r(false);
                function2 = (Function0) objT3;
            } else {
                x340Var2.i0(337003916);
                x340Var2.r(false);
                function2 = function0;
            }
            ven0 ven0VarS = v8r.s(function2, x340Var2);
            ven0 ven0VarS2 = v8r.s(function1, x340Var2);
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = us71.i(0.0f, x340Var2);
            }
            drr0 drr0Var = (drr0) objT4;
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                objT5 = us71.i(0.0f, x340Var2);
            }
            drr0 drr0Var2 = (drr0) objT5;
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                objT6 = us71.i(Float.POSITIVE_INFINITY, x340Var2);
            }
            drr0 drr0Var3 = (drr0) objT6;
            Object objT7 = x340Var2.T();
            if (objT7 == m4cVar) {
                objT7 = us71.i(Float.NEGATIVE_INFINITY, x340Var2);
            }
            drr0 drr0Var4 = (drr0) objT7;
            Object objT8 = x340Var2.T();
            if (objT8 == m4cVar) {
                objT8 = us71.i(Float.POSITIVE_INFINITY, x340Var2);
            }
            drr0 drr0Var5 = (drr0) objT8;
            ven0 ven0VarS3 = v8r.s(x340Var2.k(t4k.n), x340Var2);
            qim0 qim0VarN = anm1.N("chat-toolbar-test-tag", u291.f(qim0Var5, 1.0f));
            boolean zI = x340Var2.i(drr0Var) | x340Var2.i(drr0Var2);
            Object objT9 = x340Var2.T();
            if (zI || objT9 == m4cVar) {
                objT9 = new crf(drr0Var, drr0Var2, (byte) 1);
                x340Var2.s0(objT9);
            }
            qim0 qim0VarThen = ern1.x(qim0VarN, (iu30) objT9).then(function0 != null ? f8d1.c(qim0Var4, idn0Var, idn0Var2, new mrf(idn0Var2, idn0Var, drr0Var, ven0VarS3, drr0Var3, drr0Var4, ven0VarS2, drr0Var2, drr0Var5, ven0VarS)) : qim0Var4);
            jw31 jw31VarA = ew31.a(z2 ? h36.a : h36.e, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw vu30Var2;
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
            boolean z3 = (i3 & 896) == 256;
            Object objT10 = x340Var2.T();
            if (z3 || objT10 == m4cVar) {
                objT10 = mqo1.A((Iterable) (c380Var.size() == 1 ? o7h.N0(c380Var, Collections.singletonList(w4i1Var)) : c380Var));
                x340Var2.s0(objT10);
            }
            j2i j2iVarR = apo.r(-1566990682, new ys((!z2 || vu30Var == null) ? hcx.b : hcx.c, (c380) objT10, function0, fK), x340Var2);
            float f = c380Var.size() == 1 ? 8.0f : 4.0f;
            vu30 vu30Var3 = z2 ? vu30Var : vu30Var2;
            if (function0 == null) {
                fK = 1.0f;
            }
            if (function0 == null) {
                fK2 = 1.0f;
            }
            boolean zI2 = x340Var2.i(drr0Var3) | x340Var2.i(drr0Var5) | x340Var2.i(drr0Var4);
            Object objT11 = x340Var2.T();
            if (zI2 || objT11 == m4cVar) {
                objT11 = new drf(drr0Var3, drr0Var5, drr0Var4, (byte) 1);
                x340Var2.s0(objT11);
            }
            int i7 = (57344 & i3) | 390;
            int i8 = (i3 >> 18) & 126;
            float f2 = fK;
            qim0 qim0Var6 = qim0Var5;
            m(strN0, j2iVarR, f, z2, vu30Var3, f2, fK2, strN1, str2, function0, function1, (xu30) objT11, x340Var2, i7, i8);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(-389387441);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                a(uyn1.x(qim0Var4, 8.0f), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-389303834);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var3 = qim0Var6;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new grf(str, w4i1Var, c380Var, z, z2, vu30Var, function0, function1, qim0Var3, i, i2);
        }
    }

    public static final void c(long j, n511 n511Var, n511 n511Var2, String str, String str2, Function0 function0, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        hrf hrfVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1978748795);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(n511Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(n511Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(function0) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            if (n511Var == null || n511Var2 == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    hrfVar = new hrf(j, n511Var, n511Var2, str, str2, function0, i, (byte) 0);
                }
            } else {
                float fMin = Math.min(n511Var.a, n511Var2.a);
                float fMin2 = Math.min(n511Var.b, n511Var2.b);
                float fMax = Math.max(n511Var.c, n511Var2.c);
                float fMax2 = Math.max(n511Var.d, n511Var2.d);
                n511 n511Var3 = new n511(fMin, fMin2, fMax, fMax2);
                wat watVar = (wat) x340Var.k(t4k.h);
                qim0 qim0VarA = h2cVar.a(nim0.a, dro.b);
                boolean zI = x340Var.i(n511Var3) | ((i2 & 112) == 32);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new n82(n511Var3, j, (byte) 2);
                    x340Var.s0(objT);
                }
                t1c.a(s161.a(u291.s(eqr0.k(qim0VarA, (iu30) objT), watVar.N0(fMax - fMin), watVar.N0(fMax2 - fMin2)), new o0d(str, function0, str2, (byte) 7)), x340Var, 0);
            }
            h311VarV.d = hrfVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            hrfVar = new hrf(j, n511Var, n511Var2, str, str2, function0, i, (byte) 1);
            h311VarV.d = hrfVar;
        }
    }

    public static final void d(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        long j;
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1807293562);
        int i4 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        byte b = 0;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            if (z) {
                x340Var.i0(1642329634);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).c.f;
            } else {
                x340Var.i0(1642330913);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).c.b;
            }
            x340Var.r(false);
            if (z) {
                i2 = 1642332236;
                i3 = 2131952123;
            } else {
                i2 = 1642334157;
                i3 = 2131952122;
            }
            String strK = x0d.k(x340Var, i2, i3, x340Var, false);
            qim0 qim0VarF = dug.f(u291.r(qim0Var, 8.0f), j, er31.a);
            boolean zG = x340Var.g(strK);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new irf(strK, b);
                x340Var.s0(objT);
            }
            t1c.a(s161.b(qim0VarF, false, (iu30) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 4);
        }
    }

    public static final void e(kly0 kly0Var, hcl1 hcl1Var, c380 c380Var, o0i o0iVar, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(335647225);
        int i2 = i | (x340Var.i(kly0Var) ? 4 : 2) | (x340Var.i(hcl1Var) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.i(o0iVar) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Object objT = x340Var.T();
            if (objT == obj) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c380Var.iterator();
                ArrayList arrayList3 = arrayList2;
                while (it.hasNext()) {
                    s3t0 s3t0Var = (s3t0) it.next();
                    if (s3t0Var.j) {
                        arrayList.add(mqo1.A(Collections.singletonList(s3t0Var)));
                    } else {
                        arrayList3.add(s3t0Var);
                        if (arrayList3.size() == 2) {
                            arrayList.add(mqo1.A(arrayList3));
                            arrayList3 = new ArrayList();
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(mqo1.A(arrayList3));
                }
                objT = mqo1.A(arrayList);
                x340Var.s0(objT);
            }
            c380 c380Var2 = (c380) objT;
            wat watVar = (wat) x340Var.k(t4k.h);
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                int iH = (int) (watVar.h() * configuration.screenWidthDp);
                double dX0 = ((double) (watVar.X0(6.0f) / iH)) * 0.6666666666666666d;
                double d = iH;
                float fM0 = watVar.M0((int) (d * 0.68d));
                if (fM0 > 320.0f) {
                    fM0 = 320.0f;
                }
                float fM1 = watVar.M0((int) ((0.34d - dX0) * d));
                if (fM1 > 156.0f) {
                    fM1 = 156.0f;
                }
                fvd fvdVar = new fvd(fM0, fM1);
                x340Var.s0(fvdVar);
                objT2 = fvdVar;
            }
            fvd fvdVar2 = (fvd) objT2;
            ven0 ven0VarS = v8r.s(iu30Var2, x340Var);
            boolean z = (i2 & 896) == 256;
            Object objT3 = x340Var.T();
            if (z || objT3 == obj) {
                objT3 = new LinkedHashMap();
                x340Var.s0(objT3);
            }
            Map map = (Map) objT3;
            boolean zG = x340Var.g(map);
            Object objT4 = x340Var.T();
            if (zG || objT4 == obj) {
                objT4 = new csb(map, (byte) 5);
                x340Var.s0(objT4);
            }
            iu30 iu30Var3 = (iu30) objT4;
            boolean zG2 = x340Var.g(map);
            Object objT5 = x340Var.T();
            if (zG2 || objT5 == obj) {
                objT5 = new csb(map, (byte) 6);
                x340Var.s0(objT5);
            }
            d9p1.i(o0iVar, xtb0VarA, c380Var2, iu30Var3, (iu30) objT5, iu30Var, x340Var, 8 | ((i2 >> 9) & 14) | ((i2 << 3) & 458752));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = f8d1.b(u291.B(u291.f(qim0Var3, 1.0f), (gra) null, 3), rih1.a, new ae4(hcl1Var, (byte) 18));
            fra fraVar = een.Z;
            boolean z2 = true;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            boolean zI = x340Var.i(c380Var2) | x340Var.g(map) | x340Var.i(kly0Var);
            if ((i2 & 7168) != 2048 && !x340Var.i(o0iVar)) {
                z2 = false;
            }
            boolean zG3 = zI | z2 | x340Var.g(ven0VarS) | x340Var.g(fvdVar2);
            Object objT6 = x340Var.T();
            if (zG3 || objT6 == obj) {
                t3t0 t3t0Var = new t3t0(c380Var2, map, kly0Var, o0iVar, ven0VarS, fvdVar2, (byte) 0);
                x340Var.s0(t3t0Var);
                objT6 = t3t0Var;
            }
            ujo1.e(qim0VarB, xtb0VarA, null, d36Var, fraVar, null, false, null, (iu30) objT6, x340Var, 221184, 460);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) kly0Var, (Object) hcl1Var, (Object) c380Var, (Object) o0iVar, (Object) iu30Var, (Object) iu30Var2, (Object) qim0Var2, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(eq01 eq01Var, gw70 gw70Var, iu30 iu30Var, float f, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1011252839);
        int i2 = i | (x340Var.i(eq01Var) ? 4 : 2) | (x340Var.i(gw70Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zG = x340Var.g(eq01Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = uwo1.I(eq01Var.f, eq01Var.n, eq01Var.l, eq01Var.o, eq01Var.d, eq01Var.p);
                x340Var.s0(objT);
            }
            fq01 fq01Var = (iq01) objT;
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z = fq01Var instanceof fq01;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(1702531847);
                nyo1.h(fq01Var.a.a, gw70Var, u291.d(nim0Var, 1.0f), x340Var, i2 & 112);
                x340Var.r(false);
            } else if (fq01Var instanceof gq01) {
                x340Var.i0(1702539390);
                gq01 gq01Var = (gq01) fq01Var;
                sap1.b(new hy81(gq01Var.a, gq01Var.b), gw70Var, iu30Var, null, x340Var, (i2 & 112) | 8 | (i2 & 896));
                x340Var.r(false);
            } else {
                if (!(fq01Var instanceof hq01)) {
                    throw p3d1.k(x340Var, 1702530531, false);
                }
                x340Var.i0(1702551450);
                hq01 hq01Var = (hq01) fq01Var;
                List list = hq01Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j47) it.next()).a);
                }
                rrn1.s(new eab1(mqo1.A(arrayList), hq01Var.a), gw70Var, iu30Var, u291.r(nim0Var, f), x340Var, (i2 & 112) | 8 | (i2 & 896), 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e0a(eq01Var, gw70Var, iu30Var, f, qim0Var, i, (byte) 6);
        }
    }

    public static final void g(eq01 eq01Var, gw70 gw70Var, iu30 iu30Var, znb0 znb0Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-841113285);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(eq01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(znb0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(function1) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            nyx.a(2, (wux) null, apo.r(-1276086706, new wyy0(eq01Var, function1, function0, gw70Var, iu30Var, znb0Var), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3((Object) eq01Var, (Object) gw70Var, iu30Var, (Object) znb0Var, function0, (Object) function1, (Object) qim0Var2, i, (byte) 19);
        }
    }

    public static final void h(String str, znb0 znb0Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-551040316);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(znb0Var) ? 32 : 16) | (x340Var.d(f) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("RecentsCardProgress", u291.h(u291.f(uyn1.B(nim0.a, 0.0f, dsa0.m(x340Var, 2131166903), 0.0f, 0.0f, 13), 1.0f), f));
            gfh0 gfh0VarC = t1c.c(een.g, false);
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
            otw.b((maa) znb0Var.getValue(), new vgx0(str, 200.0f), new joa0(str), (qim0) null, x340Var, 8, 8);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gf(str, znb0Var, f, i);
        }
    }

    public static final void i(eq01 eq01Var, b0k b0kVar, int i) {
        h311 h311VarV;
        jq01 jq01Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(536992757);
        int i2 = (x340Var.i(eq01Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = eq01Var.h;
            boolean z2 = eq01Var.g;
            boolean z3 = z && !z2;
            boolean z4 = eq01Var.i && !z2;
            if (z3 || z4) {
                String strO0 = cwl1.o0(x340Var, 2131960960);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                long jK = f5p1.k(x340Var, 2131101409);
                cjc0 cjc0Var = new cjc0(1);
                float fM = dsa0.m(x340Var, 2131166903);
                qim0 qim0VarA = nim0.a;
                qim0 qim0VarN = anm1.N("RecentsCardSponsorshipLabel", uyn1.B(qim0VarA, 0.0f, fM, 0.0f, 0.0f, 13));
                if (z3) {
                    x340Var.i0(653987005);
                } else {
                    x340Var.i0(653988076);
                    qim0 qim0VarK = d9y0.k(qim0VarA, 0.0f);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = mm01.W0;
                        x340Var.s0(objT);
                    }
                    qim0VarA = s161.a(qim0VarK, (iu30) objT);
                }
                x340Var.r(false);
                uwo1.e(strO0, qim0VarN.then(qim0VarA), lee1Var, jK, null, null, 2, false, cjc0Var, 0, null, x340Var, 0, 0, 1712);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    jq01Var = new jq01(eq01Var, i, (byte) 0);
                }
            }
            h311VarV.d = jq01Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            jq01Var = new jq01(eq01Var, i, (byte) 1);
            h311VarV.d = jq01Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(eq01 eq01Var, Function0 function0, b0k b0kVar, int i) {
        eq01 eq01Var2;
        byte b;
        int i2;
        b0k b0kVar2;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(873175823);
        int i4 = (b0kVar3.i(eq01Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i5 = i4;
        if (b0kVar3.Y(i5 & 1, (i5 & 19) != 18)) {
            String str = eq01Var.c;
            if (str == null || ihc1.y0(str)) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new kq01(eq01Var, function0, i, (byte) 0);
                    return;
                }
                return;
            }
            float fM = dsa0.m(b0kVar3, 2131166903);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, fM, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
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
            if (eq01Var.l) {
                b0kVar3.i0(-652824591);
                klx klxVar = klx.c;
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar3).c.c;
                i2 = 0;
                b0kVar2 = b0kVar3;
                i3 = 1;
                w0h1.a(klxVar, isl.a, anm1.N("RecentsCardSavedBadge", u291.r(uyn1.B(nim0Var, 0.0f, 0.0f, dsa0.m(b0kVar3, 2131165730), 0.0f, 11), dsa0.m(b0kVar3, 2131165733))), j, 0L, false, b0kVar2, klx.d | 48, 48);
                b0kVar2.r(false);
            } else {
                i2 = 0;
                b0kVar2 = b0kVar3;
                i3 = 1;
                b0kVar2.i0(-652413097);
                b0kVar2.r(false);
            }
            String str2 = eq01Var.c;
            if (str2 == null) {
                str2 = "";
            }
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).j;
            long j2 = cbx.a(b0kVar2).b.b;
            cjc0 cjc0Var = new cjc0(i3);
            if ((i5 & 112) == 32) {
                i2 = i3;
            }
            Object objT = b0kVar2.T();
            if (i2 != 0 || objT == fkj0.X) {
                objT = new hii0(function0, (byte) 14);
                b0kVar2.s0(objT);
            }
            int i6 = i3;
            b0kVar3 = b0kVar2;
            boolean z = i6;
            uwo1.e(str2, i541.C(nim0Var, (iu30) objT), lee1Var, j2, null, null, 2, false, cjc0Var, 0, null, b0kVar3, 0, 0, 1712);
            b0kVar3.r(z);
            eq01Var2 = eq01Var;
            b = z;
        } else {
            eq01Var2 = eq01Var;
            b = 1;
            b0kVar3.b0();
        }
        h311 h311VarV2 = b0kVar3.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new kq01(eq01Var2, function0, i, b);
        }
    }

    public static final void k(eq01 eq01Var, znb0 znb0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        String str;
        Integer num;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(356739881);
        int i2 = i | (x340Var2.i(eq01Var) ? 4 : 2) | (x340Var2.i(znb0Var) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            wat watVar = (wat) x340Var2.k(t4k.h);
            yae1 yae1VarQ = d5p1.q(0, x340Var2, 1);
            Integer num2 = eq01Var.j;
            boolean z = eq01Var.k;
            int iIntValue = num2 != null ? num2.intValue() : axo1.l(z, eq01Var.h);
            int i3 = z ? 2 : 1;
            float fM = dsa0.m(x340Var2, 2131166903);
            uwr uwrVar = cbx.a;
            float fD = lq01.d(yae1VarQ, watVar, cbx.d(x340Var2).j, 1);
            float fD2 = lq01.d(yae1VarQ, watVar, cbx.d(x340Var2).k, i3) + dsa0.m(x340Var2, 2131166904);
            float f = fM + fD;
            int i4 = iIntValue - (z ? 2 : 1);
            if (i4 < 1) {
                i4 = 1;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarJ = u291.j((f * i4) + fD2, 0.0f, 2, u291.f(nim0Var, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarJ);
            hzj.A.getClass();
            String strK = null;
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String str2 = eq01Var.b;
            int i5 = eq01Var.p;
            if (str2 == null) {
                x340Var2.i0(-578238484);
                x340Var2.r(false);
                str = "";
            } else {
                if (ihc1.y0(str2)) {
                    x340Var2.i0(-1819767313);
                    int iC = l1d.C(i5);
                    if (iC == 0) {
                        num = 2131952444;
                    } else if (iC == 7) {
                        num = 2131963321;
                    } else if (iC == 2) {
                        num = 2131952169;
                    } else if (iC == 3) {
                        num = 2131952579;
                    } else if (iC != 4) {
                        num = iC != 5 ? null : 2131955571;
                    } else {
                        num = 2131959896;
                    }
                    if (num == null) {
                        x340Var2.i0(691950154);
                        x340Var2.r(false);
                    } else {
                        strK = kk0.k(x340Var2, 691950155, num, x340Var2, false);
                    }
                    str2 = strK == null ? "" : strK;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1819765993);
                    x340Var2.r(false);
                }
                str = str2;
            }
            lee1 lee1Var = cbx.d(x340Var2).k;
            long j = cbx.a(x340Var2).b.a;
            cjc0 cjc0Var = new cjc0(i3);
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, dsa0.m(x340Var2, 2131166904), 0.0f, 0.0f, 13);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new hii0(function0, (byte) 15);
                x340Var2.s0(objT);
            }
            uwo1.e(str, i541.C(qim0VarB, (iu30) objT), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var2, 0, 0, 1712);
            x340Var = x340Var2;
            if (eq01Var.g) {
                x340Var.i0(1874169788);
                h(eq01Var.a, znb0Var, fD, x340Var, i2 & 112);
                x340Var.r(false);
            } else {
                x340Var.i0(1874319394);
                j(eq01Var, function0, x340Var, (i2 & 14) | ((i2 >> 3) & 112));
                x340Var.r(false);
            }
            i(eq01Var, x340Var, i2 & 14);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0((byte) 19, i, eq01Var, znb0Var, function0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(s171 s171Var, qim0 qim0Var, int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        qim0 qim0Var2;
        float f;
        float f2;
        boolean z;
        qim0 qim0Var3;
        lee1 lee1VarA;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1210727553);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(s171Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 256 : 128;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(-426951351);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 2.0f;
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -426953541, false);
                }
                x340Var.i0(-426950013);
                x340Var.r(false);
                f = 0.0f;
            }
            int iC2 = l1d.C(i);
            float f3 = 4.0f;
            if (iC2 == 0) {
                x340Var.i0(-426946455);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 4.0f;
            } else {
                if (iC2 != 1) {
                    throw p3d1.k(x340Var, -426948601, false);
                }
                x340Var.i0(-426945135);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                f2 = zjy.j(4.0f, new p3v(4.0f)).a;
                x340Var.r(false);
            }
            int iC3 = l1d.C(i);
            if (iC3 == 0) {
                x340Var.i0(-426940155);
                cua cuaVar = cbx.b(x340Var).f;
                x340Var.r(false);
            } else {
                if (iC3 != 1) {
                    throw p3d1.k(x340Var, -426942455, false);
                }
                x340Var.i0(-426938958);
                cua cuaVar2 = cbx.b(x340Var).f;
                f3 = zjy.j(4.0f, new p3v(4.0f)).a;
                x340Var.r(false);
            }
            int iC4 = l1d.C(i);
            float f4 = 12.0f;
            if (iC4 == 0) {
                x340Var.i0(-426934060);
                zov0 zov0Var = cbx.b(x340Var).g;
                x340Var.r(false);
            } else {
                if (iC4 != 1) {
                    throw p3d1.k(x340Var, -426936344, false);
                }
                x340Var.i0(-426932382);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                f4 = zjy.j(12.0f, new p3v(12.0f)).a;
                x340Var.r(false);
            }
            cr31 cr31VarB = er31.b(f3);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarY = uyn1.y(i1p1.q(qim0Var4, cr31VarB), f2, f);
            jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            if (s171Var.b != null) {
                x340Var.i0(855038003);
                qim0Var3 = qim0Var4;
                z = false;
                w0h1.a(s171Var.b, isl.a, anm1.N("share.card.info.label.icon", u291.r(qim0Var4, f4)), 0L, 0L, false, x340Var, 56, 56);
                ab80.p(qim0Var3, f2, x340Var, false);
            } else {
                z = false;
                qim0Var3 = qim0Var4;
                x340Var.i0(855301317);
                x340Var.r(false);
            }
            String str = s171Var.a;
            int iC5 = l1d.C(i);
            if (iC5 == 0) {
                x340Var.i0(27594601);
                lee1VarA = cbx.d(x340Var).n;
                x340Var.r(z);
            } else {
                if (iC5 != 1) {
                    throw p3d1.k(x340Var, 27592627, z);
                }
                x340Var.i0(27597298);
                lee1VarA = lee1.a(cbx.d(x340Var).p, 0L, fc11.G(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                x340Var.r(z);
            }
            uwo1.e(str, anm1.N("share.card.info.label.text", qim0Var3), lee1VarA, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572912, 0, 1720);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2((Object) s171Var, (Object) qim0Var2, i, i2, (byte) 18);
        }
    }

    public static final void m(String str, j2i j2iVar, float f, boolean z, vu30 vu30Var, float f2, float f3, String str2, String str3, Function0 function0, Function0 function1, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        j2i j2iVar2;
        x340 x340Var;
        qim0 qim0Var;
        qim0 qim0Var2;
        byte b;
        String str4 = str2;
        String str5 = str3;
        Function0 function2 = function0;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        fra fraVar = een.N0;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-376826606);
        j06 j06Var = x340Var2.a;
        int i5 = i & 6;
        pw31 pw31Var = pw31.a;
        if (i5 == 0) {
            i3 = i | (x340Var2.i(pw31Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var2.i(vu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var2.d(f2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= x340Var2.d(f3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= x340Var2.g(str4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var2.g(str5) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var2.i(function2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var2.i(xu30Var) ? 256 : 128;
        }
        int i7 = i4;
        if (x340Var2.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            qim0 qim0Var3 = nim0.a;
            gex0 gex0Var = h36.a;
            n4k n4kVar = hmb0.t1;
            if (vu30Var == null || !z) {
                x340Var = x340Var2;
                x340Var.i0(1006333853);
                qim0 qim0VarA = s161.a(qim0Var3, new o0d(str4, function2, str5, (byte) 7));
                jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                j2iVar2 = j2iVar;
                j2iVar2.invoke(x340Var, Integer.valueOf((i6 >> 6) & 14));
                uwr uwrVar = cbx.a;
                uwo1.e(str, i541.D(uyn1.B(qim0Var3, f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571), cbx.d(x340Var).h, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, (i6 >> 3) & 14, 0, 1720);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var2.i0(1003663854);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = kaa0.h(0L, x340Var2);
                }
                ven0 ven0Var = (ven0) objT;
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                }
                ven0 ven0Var2 = (ven0) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q((Object) null);
                    x340Var2.s0(objT3);
                }
                ven0 ven0Var3 = (ven0) objT3;
                qim0 qim0VarA2 = pw31Var.a(1.0f, qim0Var3, false);
                boolean zI = x340Var2.i(ven0Var);
                Object objT4 = x340Var2.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new cy7(ven0Var, (byte) 26);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarX = ern1.x(qim0VarA2, (iu30) objT4);
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
                hzj.A.getClass();
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
                nko1.H(gfh0VarC, x340Var2, lljVar4);
                nko1.H(xos0VarM2, x340Var2, lljVar3);
                x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar);
                jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0Var3);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM3, x340Var2, lljVar3);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar);
                qim0 qim0VarN = anm1.N("chat-toolbar-avatar-test-tag", qim0Var3);
                boolean zI2 = x340Var2.i(ven0Var2);
                Object objT5 = x340Var2.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new cy7(ven0Var2, (byte) 27);
                    x340Var2.s0(objT5);
                }
                qim0 qim0VarX2 = ern1.x(qim0VarN, (iu30) objT5);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarX2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar4);
                nko1.H(xos0VarM4, x340Var2, lljVar3);
                x0d.q(iHashCode4, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE4, x340Var2, lljVar);
                dv20.l((i6 >> 6) & 14, j2iVar, x340Var2, true);
                qim0 qim0VarB = uyn1.B(qim0Var3, f, 0.0f, 0.0f, 0.0f, 14);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarB);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar4);
                nko1.H(xos0VarM5, x340Var2, lljVar3);
                x0d.q(iHashCode5, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE5, x340Var2, lljVar);
                qim0 qim0VarN2 = anm1.N("chat-toolbar-title-test-tag", qim0Var3);
                boolean zI3 = x340Var2.i(ven0Var3);
                Object objT6 = x340Var2.T();
                if (zI3 || objT6 == m4cVar) {
                    objT6 = new cy7(ven0Var3, (byte) 28);
                    x340Var2.s0(objT6);
                }
                qim0 qim0VarX3 = ern1.x(qim0VarN2, (iu30) objT6);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode6 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM6 = x340Var2.m();
                qim0 qim0VarE6 = zr7.E(x340Var2, qim0VarX3);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC3, x340Var2, lljVar4);
                nko1.H(xos0VarM6, x340Var2, lljVar3);
                x0d.q(iHashCode6, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE6, x340Var2, lljVar);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).h;
                cjc0 cjc0Var = new cjc0(1);
                qim0 qim0VarD = i541.D(qim0Var3, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571);
                Object objT7 = x340Var2.T();
                if (objT7 == m4cVar) {
                    objT7 = rmf.S0;
                    x340Var2.s0(objT7);
                }
                uwo1.e(str, s161.a(qim0VarD, (iu30) objT7), lee1Var, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var2, (i6 >> 3) & 14, 0, 1720);
                x340Var = x340Var2;
                x340Var.r(true);
                if (function1 != null) {
                    x340Var.i0(-1179051442);
                    qim0 qim0VarD2 = i541.D(qim0Var3, 0.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571);
                    qim0Var = qim0Var3;
                    boolean z2 = (i7 & 112) == 32;
                    Object objT8 = x340Var.T();
                    if (z2 || objT8 == m4cVar) {
                        objT8 = new vj0(function1, (byte) 15);
                        x340Var.s0(objT8);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarD2, true, (iu30) objT8);
                    x340Var.r(false);
                    qim0Var2 = qim0VarB2;
                } else {
                    qim0Var = qim0Var3;
                    x340Var.i0(-1178822321);
                    x340Var.r(false);
                    qim0Var2 = qim0Var;
                }
                qim0 qim0VarN3 = anm1.N("chat-toolbar-subtitle-test-tag", qim0Var);
                boolean z3 = (i7 & 896) == 256;
                Object objT9 = x340Var.T();
                if (z3 || objT9 == m4cVar) {
                    b = 0;
                    objT9 = new jrf(xu30Var, b);
                    x340Var.s0(objT9);
                } else {
                    b = 0;
                }
                qim0 qim0VarThen = ern1.x(qim0VarN3, (iu30) objT9).then(qim0Var2);
                jw31 jw31VarA3 = ew31.a(gex0Var, fraVar, x340Var, b);
                qim0 qim0Var4 = qim0Var;
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarThen);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA3, x340Var, lljVar4);
                nko1.H(xos0VarM7, x340Var, lljVar3);
                x0d.q(iHashCode7, x340Var, lljVar2, x340Var);
                wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE7, lljVar, 1.0f, false);
                gfh0 gfh0VarC4 = t1c.c(graVar, false);
                int iHashCode8 = Long.hashCode(x340Var.T);
                xos0 xos0VarM8 = x340Var.m();
                qim0 qim0VarE8 = zr7.E(x340Var, wnb0VarQ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC4, x340Var, lljVar4);
                nko1.H(xos0VarM8, x340Var, lljVar3);
                x0d.q(iHashCode8, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE8, x340Var, lljVar);
                us71.j((i6 >> 15) & 14, vu30Var, x340Var, true);
                mlx mlxVar = mlx.c;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB3 = uyn1.B(qim0Var4, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(mlxVar, isl.a, u291.r(qim0VarB3, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 48);
                x340Var.r(true);
                x340Var.r(true);
                x340Var.r(true);
                int i8 = i6 >> 12;
                c(((Offset) ven0Var.getValue()).a, (n511) ven0Var2.getValue(), (n511) ven0Var3.getValue(), str2, str3, function0, x340Var, (i8 & 458752) | (57344 & i8) | 6 | ((i7 << 18) & 3670016));
                str4 = str2;
                str5 = str3;
                function2 = function0;
                x340Var.r(true);
                x340Var.r(false);
                j2iVar2 = j2iVar;
            }
        } else {
            j2iVar2 = j2iVar;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new krf(str, j2iVar2, f, z, vu30Var, f2, f3, str4, str5, function2, function1, xu30Var, i, i2);
        }
    }

    public static final Object r(float f, float f2, float f3, fe5 fe5Var, final vu30 vu30Var, lnm lnmVar) {
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        tzg1 tzg1Var = rno1.a;
        iu30 iu30Var = tzg1Var.a;
        oe5 oe5VarC = (oe5) iu30Var.invoke(f6);
        if (oe5VarC == null) {
            oe5VarC = ((oe5) iu30Var.invoke(f4)).c();
        }
        oe5 oe5Var = oe5VarC;
        hrd1 hrd1Var = new hrd1(fe5Var, tzg1Var, f4, f5, oe5Var);
        final byte b = 3;
        Object objS = s(new ie5(tzg1Var, f4, oe5Var, 56), hrd1Var, Long.MIN_VALUE, new iu30() { // from class: p.y4v
            public final Object invoke(Object obj) {
                byte b2 = b;
                rih1 rih1Var = rih1.a;
                vu30 vu30Var2 = vu30Var;
                switch (b2) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        hav0 hav0Var = (hav0) obj;
                        vu30Var2.invoke(hav0Var, new Offset(p8p1.B(hav0Var, false)));
                        hav0Var.a();
                        break;
                    case 1:
                        hav0 hav0Var2 = (hav0) obj;
                        vu30Var2.invoke(hav0Var2, Float.valueOf(Float.intBitsToFloat((int) (p8p1.B(hav0Var2, false) >> 32))));
                        hav0Var2.a();
                        break;
                    case 2:
                        hav0 hav0Var3 = (hav0) obj;
                        vu30Var2.invoke(hav0Var3, Float.valueOf(Float.intBitsToFloat((int) (p8p1.B(hav0Var3, false) & 4294967295L))));
                        hav0Var3.a();
                        break;
                    default:
                        de5 de5Var = (de5) obj;
                        vu30Var2.invoke(de5Var.e.getValue(), rno1.a.b.invoke(de5Var.f));
                        break;
                }
                return rih1Var;
            }
        }, lnmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? objS : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object s(ie5 ie5Var, id5 id5Var, long j, final iu30 iu30Var, lnm lnmVar) {
        x7d1 x7d1Var;
        final p811 p811Var;
        final ie5 ie5Var2;
        ie5 ie5Var3;
        p811 p811Var2;
        iu30 iu30Var2;
        de5 de5Var;
        de5 de5Var2;
        lqb lqbVar;
        final id5 id5Var2 = id5Var;
        if (lnmVar instanceof x7d1) {
            x7d1Var = (x7d1) lnmVar;
            int i = x7d1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x7d1Var.f = i - Integer.MIN_VALUE;
            } else {
                x7d1Var = new x7d1(lnmVar);
            }
        } else {
            x7d1Var = new x7d1(lnmVar);
        }
        x7d1 x7d1Var2 = x7d1Var;
        Object obj = x7d1Var2.e;
        int i2 = x7d1Var2.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            final Object objG = id5Var2.g(0L);
            final oe5 oe5VarC = id5Var2.c(0L);
            p811Var = new p811();
            if (j == Long.MIN_VALUE) {
                try {
                    final float fC = C(x7d1Var2.getContext());
                    ie5Var2 = ie5Var;
                    try {
                        iu30 iu30Var3 = new iu30() { // from class: p.u7d1
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                id5 id5Var3 = id5Var2;
                                tzg1 tzg1VarF = id5Var3.f();
                                Object objH = id5Var3.h();
                                ie5 ie5Var4 = ie5Var2;
                                de5 de5Var3 = new de5(objG, tzg1VarF, oe5VarC, jLongValue, objH, jLongValue, new v7d1(ie5Var4, (byte) 1));
                                wwo1.A(de5Var3, jLongValue, fC, id5Var3, ie5Var4, iu30Var);
                                p811Var.a = de5Var3;
                                return rih1.a;
                            }
                        };
                        p811Var2 = p811Var;
                        try {
                            x7d1Var2.a = ie5Var2;
                            x7d1Var2.b = id5Var2;
                            x7d1Var2.c = iu30Var;
                            x7d1Var2.d = p811Var2;
                            x7d1Var2.f = 1;
                            if ((id5Var2.b() ? k5p1.x(iu30Var3, x7d1Var2) : s110.r(new dqc(iu30Var3, (byte) 6), x7d1Var2)) != d9nVar) {
                                ie5Var3 = ie5Var2;
                                iu30Var2 = iu30Var;
                                p811Var = p811Var2;
                            }
                            return d9nVar;
                        } catch (CancellationException e) {
                            e = e;
                            ie5Var3 = ie5Var2;
                            p811Var = p811Var2;
                            de5Var = (de5) p811Var.a;
                            if (de5Var != null) {
                                de5Var.i.setValue(Boolean.FALSE);
                            }
                            de5Var2 = (de5) p811Var.a;
                            if (de5Var2 != null) {
                                ie5Var3.f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        ie5Var3 = ie5Var2;
                        de5Var = (de5) p811Var.a;
                        if (de5Var != null) {
                            de5Var.i.setValue(Boolean.FALSE);
                        }
                        de5Var2 = (de5) p811Var.a;
                        if (de5Var2 != null && de5Var2.g == ie5Var3.d) {
                            ie5Var3.f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    ie5Var2 = ie5Var;
                }
            } else {
                p811Var2 = p811Var;
                try {
                    de5 de5Var3 = new de5(objG, id5Var2.f(), oe5VarC, j, id5Var2.h(), j, new v7d1(ie5Var, (byte) 0));
                    A(de5Var3, j, C(x7d1Var2.getContext()), id5Var2, ie5Var, iu30Var);
                    p811Var2.a = de5Var3;
                    ie5Var3 = ie5Var;
                    id5Var2 = id5Var;
                    iu30Var2 = iu30Var;
                    p811Var = p811Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    ie5Var3 = ie5Var;
                    p811Var = p811Var2;
                    de5Var = (de5) p811Var.a;
                    if (de5Var != null) {
                        de5Var.i.setValue(Boolean.FALSE);
                    }
                    de5Var2 = (de5) p811Var.a;
                    if (de5Var2 != null) {
                        ie5Var3.f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = x7d1Var2.d;
            iu30Var2 = x7d1Var2.c;
            id5Var2 = x7d1Var2.b;
            ie5Var3 = x7d1Var2.a;
            try {
                hm5.M(obj);
            } catch (CancellationException e5) {
                e = e5;
                de5Var = (de5) p811Var.a;
                if (de5Var != null) {
                    de5Var.i.setValue(Boolean.FALSE);
                }
                de5Var2 = (de5) p811Var.a;
                if (de5Var2 != null) {
                    ie5Var3.f = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = p811Var.a;
            obj2.getClass();
            if (!((Boolean) ((de5) obj2).i.getValue()).booleanValue()) {
                return rih1.a;
            }
            p811 p811Var3 = p811Var;
            iu30 iu30Var4 = iu30Var2;
            id5 id5Var3 = id5Var2;
            ie5 ie5Var4 = ie5Var3;
            try {
                lqbVar = new lqb(p811Var3, C(x7d1Var2.getContext()), id5Var3, ie5Var4, iu30Var4);
                p811Var = p811Var3;
                id5Var2 = id5Var3;
                ie5Var3 = ie5Var4;
                iu30Var2 = iu30Var4;
                x7d1Var2.a = ie5Var3;
                x7d1Var2.b = id5Var2;
                x7d1Var2.c = iu30Var2;
                x7d1Var2.d = p811Var;
                x7d1Var2.f = 2;
            } catch (CancellationException e6) {
                e = e6;
                p811Var = p811Var3;
                ie5Var3 = ie5Var4;
                de5Var = (de5) p811Var.a;
                if (de5Var != null) {
                    de5Var.i.setValue(Boolean.FALSE);
                }
                de5Var2 = (de5) p811Var.a;
                if (de5Var2 != null) {
                    ie5Var3.f = false;
                }
                throw e;
            }
        } while ((id5Var2.b() ? k5p1.x(lqbVar, x7d1Var2) : s110.r(new dqc(lqbVar, (byte) 6), x7d1Var2)) != d9nVar);
        return d9nVar;
    }

    public static /* synthetic */ Object t(float f, float f2, fe5 fe5Var, vu30 vu30Var, lnm lnmVar, int i) {
        if ((i & 8) != 0) {
            fe5Var = irn1.l0(0.0f, 0.0f, null, 7);
        }
        return r(f, f2, 0.0f, fe5Var, vu30Var, lnmVar);
    }

    public static final Object u(ie5 ie5Var, e9r e9rVar, boolean z, iu30 iu30Var, onm onmVar) {
        Object objS = s(ie5Var, new mv2(e9rVar, ie5Var.a, ie5Var.b.getValue(), ie5Var.c), z ? ie5Var.d : Long.MIN_VALUE, iu30Var, onmVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    public static final Object v(ie5 ie5Var, Float f, fe5 fe5Var, boolean z, iu30 iu30Var, onm onmVar) {
        Object objS = s(ie5Var, new hrd1(fe5Var, ie5Var.a, ie5Var.b.getValue(), f, ie5Var.c), z ? ie5Var.d : Long.MIN_VALUE, iu30Var, onmVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    public static /* synthetic */ Object w(ie5 ie5Var, Float f, fe5 fe5Var, boolean z, iu30 iu30Var, onm onmVar, int i) {
        if ((i & 2) != 0) {
            fe5Var = irn1.l0(0.0f, 0.0f, null, 7);
        }
        fe5 fe5Var2 = fe5Var;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            iu30Var = new cix0((byte) 25);
        }
        return v(ie5Var, f, fe5Var2, z2, iu30Var, onmVar);
    }

    public static final String z(int i, String str) {
        if (i == 0) {
            return "chat has no participants";
        }
        if (ihc1.y0(str)) {
            return "current username is blank";
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches() ? "current username is an email address" : gvg.e(i, "chat has ", " participants but none match current user");
    }

    public abstract wwo1 E(String str);

    public abstract wwo1 F(x570 x570Var);

    public abstract wwo1 H(HubsImmutableComponentBundle hubsImmutableComponentBundle);

    public wwo1 L(i670 i670Var) {
        return M(i670Var.build());
    }

    public abstract wwo1 M(j670 j670Var);

    public abstract wwo1 n(y570... y570VarArr);

    public abstract wwo1 o(HubsImmutableComponentBundle hubsImmutableComponentBundle);

    public abstract wwo1 p(String str, Serializable serializable);

    public abstract wwo1 q(String str, j570 j570Var);

    public abstract gd70 x();

    public abstract wwo1 y(HubsImmutableComponentBundle hubsImmutableComponentBundle);
}
