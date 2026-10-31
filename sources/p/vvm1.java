package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class vvm1 {
    public static final xrb0[] a = new xrb0[0];
    public static b180 b;

    public static /* synthetic */ void A(y6 y6Var) {
        z(y6Var, "object");
        throw null;
    }

    public static final Long B(vrc vrcVar, int i) {
        Double d;
        trc trcVar = vrcVar instanceof trc ? (trc) vrcVar : null;
        if (trcVar == null || (d = (Double) o7h.t0(i, trcVar.a)) == null) {
            return null;
        }
        List list = krc.a;
        return Long.valueOf(jch0.a0(d.doubleValue() * 1.0E9d));
    }

    public static final CharSequence C(int i, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String E(String str, Number number) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return l1d.n(str != null ? f4i1.f(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.", sb);
    }

    public static final yo31 F(j4k j4kVar) {
        return new yo31(ViewConfiguration.get(pap1.E(j4kVar).getContext()), (byte) 17);
    }

    public static final void G(y6 y6Var, Number number) {
        y6.v(y6Var, E(null, number), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void a(ec5 ec5Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-346331134);
        int i2 = (x340Var.i(ec5Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cb80 cb80VarG = t5p1.g(t5p1.r("rotation", x340Var, 0), 360.0f, 0.0f, irn1.Y(irn1.o0(4500, 0, mlv.d, 2), 1, 0L, 4), "angle", x340Var, 29112, 0);
            Float fValueOf = Float.valueOf(((Number) cb80VarG.d.getValue()).floatValue());
            boolean zI = x340Var.i(cb80VarG) | x340Var.i(ec5Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new p2z0(ec5Var, cb80VarG, (lnm) null, (byte) 26);
                x340Var.s0(objT);
            }
            qxd0.s(ec5Var, fValueOf, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u841(ec5Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void b(String str, iu30 iu30Var, dr41 dr41Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, cg0 cg0Var, yt91 yt91Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        Object obj;
        vu30 vu30Var;
        Object tjf0Var;
        ven0 ven0Var;
        ven0 ven0Var2;
        ?? r1;
        ven0 ven0Var3;
        boolean z;
        Object obj2;
        ActivityInfo activityInfo;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2029832418);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(dr41Var) : b0kVar3.i(dr41Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        int i3 = i2 | (b0kVar3.i(function1) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.i(function2) ? 131072 : 65536;
        }
        int i4 = i3 | (b0kVar3.i(function3) ? 1048576 : 524288) | (b0kVar3.i(cg0Var) ? 8388608 : 4194304) | (b0kVar3.i(yt91Var) ? 67108864 : 33554432) | (b0kVar3.i(qim0Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                hrr0 hrr0VarQ = v8r.q("");
                b0kVar3.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            obj = objT;
            ven0 ven0Var4 = (ven0) obj;
            Object objT2 = b0kVar3.T();
            Object obj3 = objT2;
            if (objT2 == m4cVar) {
                hrr0 hrr0VarQ2 = v8r.q(str);
                b0kVar3.s0(hrr0VarQ2);
                obj3 = hrr0VarQ2;
            }
            ven0 ven0Var5 = (ven0) obj3;
            Object objT3 = b0kVar3.T();
            Object objI = objT3;
            if (objT3 == m4cVar) {
                objI = us71.i(0.0f, b0kVar3);
            }
            drr0 drr0Var = (drr0) objI;
            Object objT4 = b0kVar3.T();
            Object obj4 = objT4;
            if (objT4 == m4cVar) {
                hrr0 hrr0VarQ3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(hrr0VarQ3);
                obj4 = hrr0VarQ3;
            }
            ven0 ven0Var6 = (ven0) obj4;
            Object objT5 = b0kVar3.T();
            Object obj5 = objT5;
            if (objT5 == m4cVar) {
                hrr0 hrr0VarQ4 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(hrr0VarQ4);
                obj5 = hrr0VarQ4;
            }
            ven0 ven0Var7 = (ven0) obj5;
            Object objT6 = b0kVar3.T();
            Object obj6 = objT6;
            if (objT6 == m4cVar) {
                hrr0 hrr0VarQ5 = v8r.q(null);
                b0kVar3.s0(hrr0VarQ5);
                obj6 = hrr0VarQ5;
            }
            ven0 ven0Var8 = (ven0) obj6;
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            Object objT7 = b0kVar3.T();
            if (objT7 == m4cVar) {
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
                String str2 = (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
                objT7 = (str2 == null || str2.equals("android")) ? null : resolveInfoResolveActivity.loadLabel(context.getPackageManager()).toString();
                b0kVar3.s0(objT7);
            }
            String str3 = (String) objT7;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            vu30 vu30Var2 = y580.O0;
            nko1.H(mbhVarA, b0kVar3, vu30Var2);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar2);
            nko1.F(b0kVar3);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar3);
            String str4 = (String) ven0Var4.getValue();
            String str5 = (String) ven0Var5.getValue();
            float fS = drr0Var.s();
            boolean zBooleanValue = ((Boolean) ven0Var6.getValue()).booleanValue();
            boolean zI = b0kVar3.i(cg0Var) | b0kVar3.i(ven0Var8) | b0kVar3.i(ven0Var5) | b0kVar3.i(ven0Var4) | b0kVar3.i(yt91Var);
            Object objT8 = b0kVar3.T();
            if (zI || objT8 == m4cVar) {
                vu30Var = vu30Var2;
                ven0Var = ven0Var5;
                ven0Var2 = ven0Var8;
                r1 = 0;
                tjf0Var = new tjf0(cg0Var, yt91Var, ven0Var2, ven0Var, ven0Var4, (byte) 23);
                ven0Var3 = ven0Var4;
                b0kVar3.s0(tjf0Var);
            } else {
                tjf0Var = objT8;
                vu30Var = vu30Var2;
                ven0Var = ven0Var5;
                ven0Var3 = ven0Var4;
                ven0Var2 = ven0Var8;
                r1 = 0;
            }
            vu30 vu30Var3 = vu30Var;
            ven0 ven0Var9 = ven0Var2;
            ven0 ven0Var10 = ven0Var;
            b0kVar2 = b0kVar3;
            c(str4, str5, fS, zBooleanValue, function1, function2, function3, str3, (iu30) tjf0Var, b0kVar2, (i4 & 57344) | 12582912 | (i4 & 458752) | (i4 & 3670016));
            if (((Boolean) ven0Var7.getValue()).booleanValue()) {
                b0kVar2.i0(-1290139426);
                boolean zI2 = b0kVar2.i(ven0Var7);
                Object objT9 = b0kVar2.T();
                if (zI2 || objT9 == m4cVar) {
                    obj2 = objT9;
                    g8y0 g8y0Var = new g8y0(ven0Var7, (byte) 28);
                    b0kVar2.s0(g8y0Var);
                    obj2 = g8y0Var;
                }
                e((Function0) obj2, b0kVar2, r1);
                b0kVar2.r((boolean) r1);
                z = true;
            } else {
                b0kVar2.i0(-1290054424);
                qim0 qim0VarF = u291.f(new wnb0(1.0f, true), 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, (boolean) r1);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, vu30Var3);
                nko1.H(xos0VarM2, b0kVar2, lljVar);
                x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar3);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean zI3 = b0kVar2.i(ven0Var3);
                Object objT10 = b0kVar2.T();
                Object obj7 = objT10;
                if (zI3 || objT10 == m4cVar) {
                    ry71 ry71Var = new ry71(ven0Var3, (byte) 4);
                    b0kVar2.s0(ry71Var);
                    obj7 = ry71Var;
                }
                iu30 iu30Var2 = (iu30) obj7;
                boolean zI4 = b0kVar2.i(ven0Var10);
                Object objT11 = b0kVar2.T();
                Object obj8 = objT11;
                if (zI4 || objT11 == m4cVar) {
                    ry71 ry71Var2 = new ry71(ven0Var10, (byte) 5);
                    b0kVar2.s0(ry71Var2);
                    obj8 = ry71Var2;
                }
                iu30 iu30Var3 = (iu30) obj8;
                boolean zI5 = b0kVar2.i(drr0Var);
                Object objT12 = b0kVar2.T();
                Object obj9 = objT12;
                if (zI5 || objT12 == m4cVar) {
                    qg6 qg6Var = new qg6(drr0Var, (byte) 22);
                    b0kVar2.s0(qg6Var);
                    obj9 = qg6Var;
                }
                iu30 iu30Var4 = (iu30) obj9;
                boolean zI6 = b0kVar2.i(ven0Var6);
                Object objT13 = b0kVar2.T();
                Object obj10 = objT13;
                if (zI6 || objT13 == m4cVar) {
                    ry71 ry71Var3 = new ry71(ven0Var6, (byte) 6);
                    b0kVar2.s0(ry71Var3);
                    obj10 = ry71Var3;
                }
                iu30 iu30Var5 = (iu30) obj10;
                boolean zI7 = b0kVar2.i(ven0Var7);
                Object objT14 = b0kVar2.T();
                Object obj11 = objT14;
                if (zI7 || objT14 == m4cVar) {
                    g8y0 g8y0Var2 = new g8y0(ven0Var7, (byte) 29);
                    b0kVar2.s0(g8y0Var2);
                    obj11 = g8y0Var2;
                }
                Function0 function4 = (Function0) obj11;
                boolean zI8 = b0kVar2.i(ven0Var9);
                Object objT15 = b0kVar2.T();
                Object obj12 = objT15;
                if (zI8 || objT15 == m4cVar) {
                    ry71 ry71Var4 = new ry71(ven0Var9, (byte) 7);
                    b0kVar2.s0(ry71Var4);
                    obj12 = ry71Var4;
                }
                boolean z3 = r1;
                r(str, dr41Var, iu30Var2, iu30Var3, iu30Var4, iu30Var5, function4, iu30Var, function0, qim0VarD, (iu30) obj12, b0kVar2, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 18) & 29360128) | ((i4 << 15) & 234881024));
                if (function3 != null) {
                    b0kVar2.i0(1418769442);
                    t1c.a(bin.v(u291.d(nim0Var, 1.0f), (idn0) null, (ga80) null, false, (String) null, (pm31) null, function3, 28), b0kVar2, z3 ? 1 : 0);
                    b0kVar2.r(z3);
                } else {
                    b0kVar2.i0(1418952032);
                    b0kVar2.r(z3);
                }
                z = true;
                b0kVar2.r(true);
                b0kVar2.r(z3);
            }
            b0kVar2.r(z);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new is9(str, iu30Var, dr41Var, function0, function1, function2, function3, cg0Var, yt91Var, qim0Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public static final void c(String str, String str2, float f, boolean z, Function0 function0, Function0 function1, Function0 function2, String str3, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        x340 x340Var;
        String str4;
        ?? r0;
        tob1 tob1Var;
        float f2 = f;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(646792519);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.i(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var2.g(str3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            x340Var2.i0(-1202634910);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            if (function2 != null) {
                x340Var2.i0(341790613);
                x340Var2.r(false);
                r0 = 0;
                tob1Var = tob1Var2;
                x340Var = x340Var2;
                qim0VarF = qim0VarF.then(bin.v(nim0Var, (idn0) null, (ga80) null, false, (String) null, (pm31) null, function2, 28));
            } else {
                x340Var = x340Var2;
                r0 = 0;
                tob1Var = tob1Var2;
            }
            x340Var.r((boolean) r0);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, (int) r0);
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarH = u291.h(qim0VarF2, 56.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, (int) r0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            z50 z50Var = z50.c;
            if (function2 == null) {
                x340Var.i0(2010613437);
                wro1.h(new gbx(z50Var, function0), ldx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, tkj.c, x340Var, 0, 6, 988);
                x340Var.r(false);
            } else {
                x340Var.i0(2011047809);
                x340Var.r(false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, wnb0Var);
            mbh mbhVarA2 = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (str.length() > 0) {
                x340Var.i0(-1010106878);
                uwo1.e(str, (qim0) null, cbx.d(x340Var).h, 0L, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i3 & 14, 0, 1706);
                x340Var.r(false);
            } else {
                x340Var.i0(-1009873045);
                x340Var.r(false);
            }
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, (i3 >> 3) & 14, 0, 1698);
            x340Var.r(true);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            boolean zI = x340Var.i(tob1Var) | ((i3 & 458752) == 131072);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new swi0(function1, tob1Var, (byte) 15);
                x340Var.s0(objT2);
            }
            wro1.h(new gbx(z50Var, (Function0) objT2), ldx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, tkj.d, x340Var, 0, 6, 988);
            boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
            boolean zI2 = x340Var.i(tob1Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new aya1(tob1Var, (byte) 0);
                x340Var.s0(objT3);
            }
            str4 = str3;
            iu30Var2 = iu30Var;
            gt4.a(zBooleanValue, (Function0) objT3, (qim0) null, 0L, (es41) null, (nfv0) null, (hw61) null, 0L, 0.0f, apo.r(-508525684, new nu31(tob1Var, iu30Var2, str4, (byte) 19), x340Var), x340Var, 0, 2044);
            x340Var.r(true);
            x340Var.r(true);
            if (!z || f <= 0.0f) {
                f2 = f;
                x340Var.i0(-1753010907);
                x340Var.r(false);
            } else {
                x340Var.i0(-1753181004);
                f2 = f;
                t1c.a(dug.f(u291.h(u291.f(nim0Var, f2), 2.0f), cbx.a(x340Var).c.c, d4o1.a), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var = x340Var2;
            str4 = str3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bya1(str, str2, f2, z, function0, function1, function2, str4, iu30Var2, i);
        }
    }

    public static final void d(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-150758333);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = o6v.b1;
                x340Var.s0(objT);
            }
            ajc0 ajc0Var = new ajc0((iu30) objT);
            int i3 = i2 & 126;
            qim0Var2 = nim0.a;
            uwo1.e(str, qim0Var2, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, ajc0Var, 0, (qx8) null, x340Var, i3, 0, 1724);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 22);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-813571263);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(function0) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131962862);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            String strO1 = cwl1.o0(x340Var, 2131962861);
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            gbx gbxVar = new gbx(z50.c, function0);
            idx idxVar = new idx(4);
            gdx gdxVarP = yla.p(x340Var);
            cvx cvxVar2 = cbx.b(x340Var).b;
            foo1.c(gbxVar, idxVar, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (max) null, gdxVarP, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, tkj.b, x340Var, 0, 48, 2008);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function0, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void f(String str, qim0 qim0Var, lee1 lee1Var, float f, b0k b0kVar, int i, int i2) {
        lee1 lee1Var2;
        float f2;
        int i3;
        boolean z;
        float f3;
        qim0 qim0Var2;
        lee1 lee1Var3;
        h311 h311VarV;
        int i4;
        float f4;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1104127279);
        int i5 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if ((i2 & 4) == 0) {
            lee1Var2 = lee1Var;
            int i6 = x340Var.i(lee1Var2) ? 256 : 128;
            int i7 = i5 | i6;
            if ((i2 & 8) == 0) {
                f2 = f;
                int i8 = x340Var.d(f2) ? 2048 : 1024;
                i3 = i7 | i8;
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if ((i2 & 4) != 0) {
                            uwr uwrVar = cbx.a;
                            lee1Var2 = cbx.d(x340Var).g;
                            i3 &= -897;
                        }
                        i4 = i2 & 8;
                        qim0 qim0Var4 = nim0.a;
                        if (i4 != 0) {
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            i3 &= -7169;
                            f2 = 16.0f;
                        }
                        f4 = f2;
                        qim0Var3 = qim0Var4;
                    } else {
                        x340Var.b0();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        qim0Var3 = qim0Var;
                        f4 = f2;
                    }
                    x340Var.s();
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str, uyn1.B(qim0Var3, 0.0f, f4, 0.0f, 0.0f, 13), lee1Var2, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 910, 0, 2016);
                    qim0Var2 = qim0Var3;
                    f3 = f4;
                } else {
                    x340Var.b0();
                    f3 = f2;
                    qim0Var2 = qim0Var;
                }
                lee1Var3 = lee1Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ffc(str, qim0Var2, lee1Var3, f3, i, i2, (byte) 1);
                }
            }
            f2 = f;
            i3 = i7 | i8;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar4 = cbx.a;
                        lee1Var2 = cbx.d(x340Var).g;
                        i3 &= -897;
                    }
                    i4 = i2 & 8;
                    qim0 qim0Var5 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar5 = cbx.a;
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        i3 &= -7169;
                        f2 = 16.0f;
                    }
                    f4 = f2;
                    qim0Var3 = qim0Var5;
                } else {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar6 = cbx.a;
                        lee1Var2 = cbx.d(x340Var).g;
                        i3 &= -897;
                    }
                    i4 = i2 & 8;
                    qim0 qim0Var6 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar7 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var).b;
                        i3 &= -7169;
                        f2 = 16.0f;
                    }
                    f4 = f2;
                    qim0Var3 = qim0Var6;
                }
                x340Var.s();
                uwr uwrVar8 = cbx.a;
                uwo1.e(str, uyn1.B(qim0Var3, 0.0f, f4, 0.0f, 0.0f, 13), lee1Var2, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 910, 0, 2016);
                qim0Var2 = qim0Var3;
                f3 = f4;
            } else {
                x340Var.b0();
                f3 = f2;
                qim0Var2 = qim0Var;
            }
            lee1Var3 = lee1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ffc(str, qim0Var2, lee1Var3, f3, i, i2, (byte) 1);
            }
        }
        lee1Var2 = lee1Var;
        int i9 = i5 | i6;
        if ((i2 & 8) == 0) {
            f2 = f;
            if (x340Var.d(f2)) {
            }
            i3 = i9 | i8;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar9 = cbx.a;
                        lee1Var2 = cbx.d(x340Var).g;
                        i3 &= -897;
                    }
                    i4 = i2 & 8;
                    qim0 qim0Var7 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar10 = cbx.a;
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        i3 &= -7169;
                        f2 = 16.0f;
                    }
                    f4 = f2;
                    qim0Var3 = qim0Var7;
                } else {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar11 = cbx.a;
                        lee1Var2 = cbx.d(x340Var).g;
                        i3 &= -897;
                    }
                    i4 = i2 & 8;
                    qim0 qim0Var8 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar12 = cbx.a;
                        cvx cvxVar5 = cbx.b(x340Var).b;
                        i3 &= -7169;
                        f2 = 16.0f;
                    }
                    f4 = f2;
                    qim0Var3 = qim0Var8;
                }
                x340Var.s();
                uwr uwrVar13 = cbx.a;
                uwo1.e(str, uyn1.B(qim0Var3, 0.0f, f4, 0.0f, 0.0f, 13), lee1Var2, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 910, 0, 2016);
                qim0Var2 = qim0Var3;
                f3 = f4;
            } else {
                x340Var.b0();
                f3 = f2;
                qim0Var2 = qim0Var;
            }
            lee1Var3 = lee1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ffc(str, qim0Var2, lee1Var3, f3, i, i2, (byte) 1);
            }
        }
        f2 = f;
        i3 = i9 | i8;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    uwr uwrVar14 = cbx.a;
                    lee1Var2 = cbx.d(x340Var).g;
                    i3 &= -897;
                }
                i4 = i2 & 8;
                qim0 qim0Var9 = nim0.a;
                if (i4 != 0) {
                    uwr uwrVar15 = cbx.a;
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    i3 &= -7169;
                    f2 = 16.0f;
                }
                f4 = f2;
                qim0Var3 = qim0Var9;
            } else {
                if ((i2 & 4) != 0) {
                    uwr uwrVar16 = cbx.a;
                    lee1Var2 = cbx.d(x340Var).g;
                    i3 &= -897;
                }
                i4 = i2 & 8;
                qim0 qim0Var10 = nim0.a;
                if (i4 != 0) {
                    uwr uwrVar17 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    i3 &= -7169;
                    f2 = 16.0f;
                }
                f4 = f2;
                qim0Var3 = qim0Var10;
            }
            x340Var.s();
            uwr uwrVar18 = cbx.a;
            uwo1.e(str, uyn1.B(qim0Var3, 0.0f, f4, 0.0f, 0.0f, 13), lee1Var2, cbx.a(x340Var).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 910, 0, 2016);
            qim0Var2 = qim0Var3;
            f3 = f4;
        } else {
            x340Var.b0();
            f3 = f2;
            qim0Var2 = qim0Var;
        }
        lee1Var3 = lee1Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffc(str, qim0Var2, lee1Var3, f3, i, i2, (byte) 1);
        }
    }

    public static JsonEncodingException g(Number number) {
        return new JsonEncodingException(2, E(null, number), (String) null);
    }

    public static final JsonEncodingException h(h661 h661Var) {
        String str = "Value of type '" + h661Var.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + h661Var.getKind() + '\'';
        h661Var.h();
        return new JsonEncodingException(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    public static final void i(ixo ixoVar, fu1 fu1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        fu1 fu1Var2;
        iu30 iu30Var2;
        int i3;
        ixo ixoVar2;
        b0k b0kVar2;
        a4g0 a4g0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-481318067);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(ixoVar) : b0kVar3.i(ixoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(fu1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        boolean z = false;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uka1 uka1Var = fu1Var.r;
            uka1 uka1Var2 = uka1Var instanceof uka1 ? uka1Var : null;
            if (uka1Var2 == null) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new b4g0(ixoVar, fu1Var, iu30Var, i, (byte) 1);
                    return;
                }
                return;
            }
            uka1 uka1Var3 = uka1Var2;
            b0kVar2 = b0kVar3;
            i031 i031Var = fu1Var.h.e;
            if (i031Var != null) {
                if (i031Var instanceof i031) {
                    ot1 ot1Var = i031Var.a;
                    String str = ot1Var.a;
                    if (fu1Var.g(str) || ot1Var.N0 != 4) {
                        i4 = 0;
                    } else {
                        String str2 = bo1.a;
                        Set set = s4b1.f;
                        if (!bo1.a(uic.x(str)) || bo1.c(str)) {
                            i4 = 0;
                        } else if (ot1Var.O0) {
                            if (!fu1Var.s.contains(str)) {
                                i4 = 0;
                            }
                        }
                    }
                } else if (!(i031Var instanceof j031)) {
                    eg.o();
                    return;
                }
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                h311 h311VarV2 = b0kVar2.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new b4g0(ixoVar, fu1Var, iu30Var, i, (byte) 2);
                    return;
                }
                return;
            }
            ixoVar2 = ixoVar;
            fu1Var2 = fu1Var;
            iu30Var2 = iu30Var;
            i3 = i;
            ven0 ven0VarS = v8r.s(iu30Var2, b0kVar2);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && b0kVar2.g(ixoVar2))) {
                z = true;
            }
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                sqa0 sqa0Var = new sqa0(ven0VarS, (byte) 16);
                switch (ixoVar2.a) {
                    case 0:
                        q8n q8nVar = (q8n) ((kt1) ((ib3) ixoVar2.b.c).b).h.get();
                        c8o.l(q8nVar);
                        a4g0Var = new a4g0(q8nVar, sqa0Var);
                        break;
                    default:
                        q8n q8nVar2 = (q8n) ((xu1) ((ai0) ixoVar2.b.c).b).c.get();
                        c8o.l(q8nVar2);
                        a4g0Var = new a4g0(q8nVar2, sqa0Var);
                        break;
                }
                objT = a4g0Var;
                b0kVar2.s0(objT);
            }
            otw.c((a4g0) objT, new s3g0(i4, uka1Var3.a), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
        } else {
            fu1Var2 = fu1Var;
            iu30Var2 = iu30Var;
            i3 = i;
            ixoVar2 = ixoVar;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV3 = b0kVar2.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new b4g0(ixoVar2, fu1Var2, iu30Var2, i3, (byte) 0);
        }
    }

    public static final void j(Bitmap bitmap, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1901521926);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = b0kVar3.g(bitmap);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new yk4(bitmap);
                b0kVar3.s0(objT);
            }
            yk4 yk4Var = (yk4) objT;
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            b0kVar2 = b0kVar3;
            eso1.f(yk4Var, isl.a, u291.d(nim0.a, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, b0kVar2, 1797552, 384);
            if (z && z2) {
                b0kVar2.i0(1934854775);
                xto1.e((qim0) null, 6, 0L, 0L, b0kVar2, 48, 13);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1934926850);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gie1(bitmap, z, z2, qim0Var, i, (byte) 1);
        }
    }

    public static final void k(kmx0 kmx0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-430178483);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(kmx0Var) : x340Var.i(kmx0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            gra graVar = een.h;
            qim0 qim0VarQ = i1p1.q(dug.f(d7e.r(0.5625f, qim0Var, false), z4p1.e(Color.parseColor(kmx0Var.c)), cr31VarB), cr31VarB);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            Uri uri = Uri.parse(kmx0Var.d);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            cbx.a.getClass();
            eso1.e(uri, isl.a, qim0VarD, (p3v) null, (zvx) null, uwr.c(), (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 3120, 0, 3536);
            vnr0 vnr0VarG = kmx0Var.b.g((djc0) null, x340Var, 1);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qgo1.f(vnr0VarG, uyn1.y(qim0VarD2, 12.0f, 16.0f), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(kmx0Var, qim0Var, i, (byte) 19);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(qim0 qim0Var, vg41 vg41Var, vu30 vu30Var, iu30 iu30Var, vu30 vu30Var2, boolean z, boolean z2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        vu30 vu30Var3;
        qim0 qim0Var2;
        boolean z3;
        Object objJ;
        Object objJ2;
        boolean z4;
        Object objJ3;
        boolean z5;
        Object objJ4;
        boolean z6;
        Object objJ5;
        boolean z7;
        Object objJ6;
        boolean z8;
        Object objJ7;
        boolean z9;
        Object objJ8;
        boolean z10;
        Object objJ9;
        qim0 qim0VarY;
        boolean z11;
        qim0 qim0VarThen;
        boolean z12;
        he5 he5Var;
        boolean z13;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1480119078);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= x340Var.e(vg41Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z2) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            bjg1 bjg1VarY = bno1.y(vg41Var, "snakeState", x340Var, ((i2 >> 3) & 14) | 48, 0);
            k9 k9Var = ((mhg1) bjg1VarY).a;
            krz0 krz0Var = krz0.R0;
            x340Var.i0(1108136206);
            t0z t0zVar = vg41.f;
            int iS = zno1.s(q7h.U(t0zVar, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            Iterator it = t0zVar.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Iterator it2 = it;
                x340Var.i0(-992134955);
                wat watVar = (wat) x340Var.k(t4k.h);
                int i3 = i2;
                int iOrdinal = ((vg41) next).ordinal();
                if (iOrdinal == 0) {
                    x340Var.i0(2100442976);
                    long j = u7h.f;
                    avw0 avw0Var = cbx.b(x340Var).c;
                    he5Var = new he5(watVar.X0(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, u7h.g(j), u7h.f(j), u7h.d(j), 0.1f);
                    z13 = false;
                    x340Var.r(false);
                } else if (iOrdinal == 1) {
                    x340Var.i0(2100830662);
                    long j2 = cbx.a(x340Var).c.c;
                    avw0 avw0Var2 = cbx.b(x340Var).c;
                    he5Var = new he5(watVar.X0(8.0f), u7h.g(j2), u7h.f(j2), u7h.d(j2), 1.0f, u7h.g(j2), u7h.f(j2), u7h.d(j2), 0.1f);
                    z13 = false;
                    x340Var.r(false);
                } else if (iOrdinal == 2) {
                    x340Var.i0(2101241102);
                    long j3 = cbx.a(x340Var).c.c;
                    avw0 avw0Var3 = cbx.b(x340Var).c;
                    he5Var = new he5(watVar.X0(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, u7h.g(j3), u7h.f(j3), u7h.d(j3), 1.0f);
                    z13 = false;
                    x340Var.r(false);
                } else {
                    if (iOrdinal != 3) {
                        throw p3d1.k(x340Var, 1176134151, false);
                    }
                    x340Var.i0(2101644443);
                    long j4 = cbx.a(x340Var).b.e;
                    avw0 avw0Var4 = cbx.b(x340Var).c;
                    he5Var = new he5(watVar.X0(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, u7h.g(j4), u7h.f(j4), u7h.d(j4), 1.0f);
                    z13 = false;
                    x340Var.r(false);
                }
                he5 he5Var2 = he5Var;
                x340Var.r(z13);
                linkedHashMap.put(next, he5Var2);
                it = it2;
                i2 = i3;
            }
            int i4 = i2;
            x340Var.r(false);
            if (bjg1VarY.g()) {
                z3 = false;
                objJ = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG = x340Var.g(bjg1VarY);
                objJ = x340Var.T();
                if (zG || objJ == m4cVar) {
                    jv91 jv91VarO = ekb.o();
                    iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                    jv91 jv91VarU = ekb.u(jv91VarO);
                    try {
                        Object objP0 = k9Var.P0();
                        ekb.C(jv91VarO, jv91VarU, iu30VarE);
                        x340Var.s0(objP0);
                        objJ = objP0;
                    } catch (Throwable th) {
                        ekb.C(jv91VarO, jv91VarU, iu30VarE);
                        throw th;
                    }
                }
                z3 = false;
                x340Var.r(false);
            }
            x340Var.i0(779776243);
            float f = ((he5) sqg0.G((vg41) objJ, linkedHashMap)).a;
            x340Var.r(z3);
            Float fValueOf = Float.valueOf(f);
            boolean zG2 = x340Var.g(bjg1VarY);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = yv91.a(new ro20(bjg1VarY, (byte) 16));
                x340Var.s0(objT2);
            }
            vg41 vg41Var2 = (vg41) ((tob1) objT2).getValue();
            x340Var.i0(779776243);
            float f2 = ((he5) sqg0.G(vg41Var2, linkedHashMap)).a;
            x340Var.r(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zG3 = x340Var.g(bjg1VarY);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = yv91.a(new ro20(bjg1VarY, (byte) 17));
                x340Var.s0(objT3);
            }
            ni20 ni20Var = (ni20) krz0Var.invoke(((tob1) objT3).getValue(), x340Var, 0);
            tzg1 tzg1Var = rno1.a;
            boolean z14 = false;
            fhg1 fhg1VarO = bno1.o(bjg1VarY, fValueOf, fValueOf2, ni20Var, tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                objJ2 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG4 = x340Var.g(bjg1VarY);
                objJ2 = x340Var.T();
                if (zG4 || objJ2 == m4cVar) {
                    jv91 jv91VarO2 = ekb.o();
                    iu30 iu30VarE2 = jv91VarO2 != null ? jv91VarO2.e() : null;
                    jv91 jv91VarU2 = ekb.u(jv91VarO2);
                    try {
                        Object objP1 = k9Var.P0();
                        ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                        x340Var.s0(objP1);
                        objJ2 = objP1;
                        z14 = false;
                    } catch (Throwable th2) {
                        ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                        throw th2;
                    }
                }
                x340Var.r(z14);
            }
            x340Var.i0(-509160985);
            float f3 = ((he5) sqg0.G((vg41) objJ2, linkedHashMap)).b;
            x340Var.r(z14);
            Float fValueOf3 = Float.valueOf(f3);
            boolean zG5 = x340Var.g(bjg1VarY);
            Object objT4 = x340Var.T();
            if (zG5 || objT4 == m4cVar) {
                objT4 = yv91.a(new ro20(bjg1VarY, (byte) 18));
                x340Var.s0(objT4);
            }
            vg41 vg41Var3 = (vg41) ((tob1) objT4).getValue();
            x340Var.i0(-509160985);
            float f4 = ((he5) sqg0.G(vg41Var3, linkedHashMap)).b;
            x340Var.r(false);
            Float fValueOf4 = Float.valueOf(f4);
            boolean zG6 = x340Var.g(bjg1VarY);
            Object objT5 = x340Var.T();
            if (zG6 || objT5 == m4cVar) {
                objT5 = yv91.a(new ro20(bjg1VarY, (byte) 19));
                x340Var.s0(objT5);
            }
            fhg1 fhg1VarO2 = bno1.o(bjg1VarY, fValueOf3, fValueOf4, (ni20) krz0Var.invoke(((tob1) objT5).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                z4 = false;
                objJ3 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG7 = x340Var.g(bjg1VarY);
                objJ3 = x340Var.T();
                if (zG7 || objJ3 == m4cVar) {
                    jv91 jv91VarO3 = ekb.o();
                    iu30 iu30VarE3 = jv91VarO3 != null ? jv91VarO3.e() : null;
                    jv91 jv91VarU3 = ekb.u(jv91VarO3);
                    try {
                        Object objP2 = k9Var.P0();
                        ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                        x340Var.s0(objP2);
                        objJ3 = objP2;
                    } catch (Throwable th3) {
                        ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                        throw th3;
                    }
                }
                z4 = false;
                x340Var.r(false);
            }
            x340Var.i0(348731996);
            float f5 = ((he5) sqg0.G((vg41) objJ3, linkedHashMap)).c;
            x340Var.r(z4);
            Float fValueOf5 = Float.valueOf(f5);
            boolean zG8 = x340Var.g(bjg1VarY);
            Object objT6 = x340Var.T();
            if (zG8 || objT6 == m4cVar) {
                objT6 = yv91.a(new ro20(bjg1VarY, (byte) 20));
                x340Var.s0(objT6);
            }
            vg41 vg41Var4 = (vg41) ((tob1) objT6).getValue();
            x340Var.i0(348731996);
            float f6 = ((he5) sqg0.G(vg41Var4, linkedHashMap)).c;
            x340Var.r(false);
            Float fValueOf6 = Float.valueOf(f6);
            boolean zG9 = x340Var.g(bjg1VarY);
            Object objT7 = x340Var.T();
            if (zG9 || objT7 == m4cVar) {
                objT7 = yv91.a(new ro20(bjg1VarY, (byte) 21));
                x340Var.s0(objT7);
            }
            fhg1 fhg1VarO3 = bno1.o(bjg1VarY, fValueOf5, fValueOf6, (ni20) krz0Var.invoke(((tob1) objT7).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                z5 = false;
                objJ4 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG10 = x340Var.g(bjg1VarY);
                objJ4 = x340Var.T();
                if (zG10 || objJ4 == m4cVar) {
                    jv91 jv91VarO4 = ekb.o();
                    iu30 iu30VarE4 = jv91VarO4 != null ? jv91VarO4.e() : null;
                    jv91 jv91VarU4 = ekb.u(jv91VarO4);
                    try {
                        Object objP3 = k9Var.P0();
                        ekb.C(jv91VarO4, jv91VarU4, iu30VarE4);
                        x340Var.s0(objP3);
                        objJ4 = objP3;
                    } catch (Throwable th4) {
                        ekb.C(jv91VarO4, jv91VarU4, iu30VarE4);
                        throw th4;
                    }
                }
                z5 = false;
                x340Var.r(false);
            }
            x340Var.i0(738683351);
            float f7 = ((he5) sqg0.G((vg41) objJ4, linkedHashMap)).d;
            x340Var.r(z5);
            Float fValueOf7 = Float.valueOf(f7);
            boolean zG11 = x340Var.g(bjg1VarY);
            Object objT8 = x340Var.T();
            if (zG11 || objT8 == m4cVar) {
                objT8 = yv91.a(new ro20(bjg1VarY, (byte) 22));
                x340Var.s0(objT8);
            }
            vg41 vg41Var5 = (vg41) ((tob1) objT8).getValue();
            x340Var.i0(738683351);
            float f8 = ((he5) sqg0.G(vg41Var5, linkedHashMap)).d;
            x340Var.r(false);
            Float fValueOf8 = Float.valueOf(f8);
            boolean zG12 = x340Var.g(bjg1VarY);
            Object objT9 = x340Var.T();
            if (zG12 || objT9 == m4cVar) {
                objT9 = yv91.a(new ro20(bjg1VarY, (byte) 23));
                x340Var.s0(objT9);
            }
            fhg1 fhg1VarO4 = bno1.o(bjg1VarY, fValueOf7, fValueOf8, (ni20) krz0Var.invoke(((tob1) objT9).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                fhg1VarO4 = fhg1VarO4;
                z6 = false;
                objJ5 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG13 = x340Var.g(bjg1VarY);
                objJ5 = x340Var.T();
                if (zG13 || objJ5 == m4cVar) {
                    jv91 jv91VarO5 = ekb.o();
                    iu30 iu30VarE5 = jv91VarO5 != null ? jv91VarO5.e() : null;
                    jv91 jv91VarU5 = ekb.u(jv91VarO5);
                    try {
                        Object objP4 = k9Var.P0();
                        ekb.C(jv91VarO5, jv91VarU5, iu30VarE5);
                        x340Var.s0(objP4);
                        objJ5 = objP4;
                    } catch (Throwable th5) {
                        ekb.C(jv91VarO5, jv91VarU5, iu30VarE5);
                        throw th5;
                    }
                }
                z6 = false;
                x340Var.r(false);
            }
            x340Var.i0(-436970285);
            float f9 = ((he5) sqg0.G((vg41) objJ5, linkedHashMap)).e;
            x340Var.r(z6);
            Float fValueOf9 = Float.valueOf(f9);
            boolean zG14 = x340Var.g(bjg1VarY);
            Object objT10 = x340Var.T();
            if (zG14 || objT10 == m4cVar) {
                objT10 = yv91.a(new ro20(bjg1VarY, (byte) 24));
                x340Var.s0(objT10);
            }
            vg41 vg41Var6 = (vg41) ((tob1) objT10).getValue();
            x340Var.i0(-436970285);
            float f10 = ((he5) sqg0.G(vg41Var6, linkedHashMap)).e;
            x340Var.r(false);
            Float fValueOf10 = Float.valueOf(f10);
            boolean zG15 = x340Var.g(bjg1VarY);
            Object objT11 = x340Var.T();
            if (zG15 || objT11 == m4cVar) {
                objT11 = yv91.a(new ro20(bjg1VarY, (byte) 7));
                x340Var.s0(objT11);
            }
            fhg1 fhg1Var = fhg1VarO4;
            fhg1 fhg1VarO5 = bno1.o(bjg1VarY, fValueOf9, fValueOf10, (ni20) krz0Var.invoke(((tob1) objT11).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                fhg1VarO5 = fhg1VarO5;
                z7 = false;
                objJ6 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG16 = x340Var.g(bjg1VarY);
                objJ6 = x340Var.T();
                if (zG16 || objJ6 == m4cVar) {
                    jv91 jv91VarO6 = ekb.o();
                    iu30 iu30VarE6 = jv91VarO6 != null ? jv91VarO6.e() : null;
                    jv91 jv91VarU6 = ekb.u(jv91VarO6);
                    try {
                        Object objP5 = k9Var.P0();
                        ekb.C(jv91VarO6, jv91VarU6, iu30VarE6);
                        x340Var.s0(objP5);
                        objJ6 = objP5;
                    } catch (Throwable th6) {
                        ekb.C(jv91VarO6, jv91VarU6, iu30VarE6);
                        throw th6;
                    }
                }
                z7 = false;
                x340Var.r(false);
            }
            x340Var.i0(1107318694);
            float f11 = ((he5) sqg0.G((vg41) objJ6, linkedHashMap)).f;
            x340Var.r(z7);
            Float fValueOf11 = Float.valueOf(f11);
            boolean zG17 = x340Var.g(bjg1VarY);
            Object objT12 = x340Var.T();
            if (zG17 || objT12 == m4cVar) {
                objT12 = yv91.a(new ro20(bjg1VarY, (byte) 8));
                x340Var.s0(objT12);
            }
            vg41 vg41Var7 = (vg41) ((tob1) objT12).getValue();
            x340Var.i0(1107318694);
            float f12 = ((he5) sqg0.G(vg41Var7, linkedHashMap)).f;
            x340Var.r(false);
            Float fValueOf12 = Float.valueOf(f12);
            boolean zG18 = x340Var.g(bjg1VarY);
            Object objT13 = x340Var.T();
            if (zG18 || objT13 == m4cVar) {
                objT13 = yv91.a(new ro20(bjg1VarY, (byte) 9));
                x340Var.s0(objT13);
            }
            fhg1 fhg1Var2 = fhg1VarO5;
            fhg1 fhg1VarO6 = bno1.o(bjg1VarY, fValueOf11, fValueOf12, (ni20) krz0Var.invoke(((tob1) objT13).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                fhg1VarO6 = fhg1VarO6;
                z8 = false;
                objJ7 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG19 = x340Var.g(bjg1VarY);
                objJ7 = x340Var.T();
                if (zG19 || objJ7 == m4cVar) {
                    jv91 jv91VarO7 = ekb.o();
                    iu30 iu30VarE7 = jv91VarO7 != null ? jv91VarO7.e() : null;
                    jv91 jv91VarU7 = ekb.u(jv91VarO7);
                    try {
                        Object objP6 = k9Var.P0();
                        ekb.C(jv91VarO7, jv91VarU7, iu30VarE7);
                        x340Var.s0(objP6);
                        objJ7 = objP6;
                    } catch (Throwable th7) {
                        ekb.C(jv91VarO7, jv91VarU7, iu30VarE7);
                        throw th7;
                    }
                }
                z8 = false;
                x340Var.r(false);
            }
            x340Var.i0(1965211675);
            float f13 = ((he5) sqg0.G((vg41) objJ7, linkedHashMap)).g;
            x340Var.r(z8);
            Float fValueOf13 = Float.valueOf(f13);
            boolean zG20 = x340Var.g(bjg1VarY);
            Object objT14 = x340Var.T();
            if (zG20 || objT14 == m4cVar) {
                objT14 = yv91.a(new ro20(bjg1VarY, (byte) 10));
                x340Var.s0(objT14);
            }
            vg41 vg41Var8 = (vg41) ((tob1) objT14).getValue();
            x340Var.i0(1965211675);
            float f14 = ((he5) sqg0.G(vg41Var8, linkedHashMap)).g;
            x340Var.r(false);
            Float fValueOf14 = Float.valueOf(f14);
            boolean zG21 = x340Var.g(bjg1VarY);
            Object objT15 = x340Var.T();
            if (zG21 || objT15 == m4cVar) {
                objT15 = yv91.a(new ro20(bjg1VarY, (byte) 11));
                x340Var.s0(objT15);
            }
            fhg1 fhg1Var3 = fhg1VarO6;
            fhg1 fhg1VarO7 = bno1.o(bjg1VarY, fValueOf13, fValueOf14, (ni20) krz0Var.invoke(((tob1) objT15).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                fhg1VarO7 = fhg1VarO7;
                z9 = false;
                objJ8 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG22 = x340Var.g(bjg1VarY);
                objJ8 = x340Var.T();
                if (zG22 || objJ8 == m4cVar) {
                    jv91 jv91VarO8 = ekb.o();
                    iu30 iu30VarE8 = jv91VarO8 != null ? jv91VarO8.e() : null;
                    jv91 jv91VarU8 = ekb.u(jv91VarO8);
                    try {
                        Object objP7 = k9Var.P0();
                        ekb.C(jv91VarO8, jv91VarU8, iu30VarE8);
                        x340Var.s0(objP7);
                        objJ8 = objP7;
                    } catch (Throwable th8) {
                        ekb.C(jv91VarO8, jv91VarU8, iu30VarE8);
                        throw th8;
                    }
                }
                z9 = false;
                x340Var.r(false);
            }
            x340Var.i0(-1939804266);
            float f15 = ((he5) sqg0.G((vg41) objJ8, linkedHashMap)).h;
            x340Var.r(z9);
            Float fValueOf15 = Float.valueOf(f15);
            boolean zG23 = x340Var.g(bjg1VarY);
            Object objT16 = x340Var.T();
            if (zG23 || objT16 == m4cVar) {
                objT16 = yv91.a(new ro20(bjg1VarY, (byte) 12));
                x340Var.s0(objT16);
            }
            vg41 vg41Var9 = (vg41) ((tob1) objT16).getValue();
            x340Var.i0(-1939804266);
            float f16 = ((he5) sqg0.G(vg41Var9, linkedHashMap)).h;
            x340Var.r(false);
            Float fValueOf16 = Float.valueOf(f16);
            boolean zG24 = x340Var.g(bjg1VarY);
            Object objT17 = x340Var.T();
            if (zG24 || objT17 == m4cVar) {
                objT17 = yv91.a(new ro20(bjg1VarY, (byte) 13));
                x340Var.s0(objT17);
            }
            fhg1 fhg1Var4 = fhg1VarO7;
            fhg1 fhg1VarO8 = bno1.o(bjg1VarY, fValueOf15, fValueOf16, (ni20) krz0Var.invoke(((tob1) objT17).getValue(), x340Var, 0), tzg1Var, x340Var, 196608);
            if (bjg1VarY.g()) {
                z10 = false;
                objJ9 = p3d1.j(x340Var, 1666827533, false, k9Var);
            } else {
                x340Var.i0(1666573488);
                boolean zG25 = x340Var.g(bjg1VarY);
                Object objT18 = x340Var.T();
                if (zG25 || objT18 == m4cVar) {
                    jv91 jv91VarO9 = ekb.o();
                    iu30 iu30VarE9 = jv91VarO9 != null ? jv91VarO9.e() : null;
                    jv91 jv91VarU9 = ekb.u(jv91VarO9);
                    try {
                        Object objP8 = k9Var.P0();
                        ekb.C(jv91VarO9, jv91VarU9, iu30VarE9);
                        x340Var.s0(objP8);
                        objT18 = objP8;
                    } catch (Throwable th9) {
                        ekb.C(jv91VarO9, jv91VarU9, iu30VarE9);
                        throw th9;
                    }
                }
                x340Var.r(false);
                Object obj = objT18;
                z10 = false;
                objJ9 = obj;
            }
            x340Var.i0(-830018798);
            float f17 = ((he5) sqg0.G((vg41) objJ9, linkedHashMap)).i;
            x340Var.r(z10);
            Float fValueOf17 = Float.valueOf(f17);
            boolean zG26 = x340Var.g(bjg1VarY);
            Object objT19 = x340Var.T();
            if (zG26 || objT19 == m4cVar) {
                objT19 = yv91.a(new ro20(bjg1VarY, (byte) 14));
                x340Var.s0(objT19);
            }
            vg41 vg41Var10 = (vg41) ((tob1) objT19).getValue();
            x340Var.i0(-830018798);
            float f18 = ((he5) sqg0.G(vg41Var10, linkedHashMap)).i;
            x340Var.r(false);
            Float fValueOf18 = Float.valueOf(f18);
            boolean zG27 = x340Var.g(bjg1VarY);
            Object objT20 = x340Var.T();
            if (zG27 || objT20 == m4cVar) {
                objT20 = yv91.a(new ro20(bjg1VarY, (byte) 15));
                x340Var.s0(objT20);
            }
            he5 he5Var3 = new he5(((Number) fhg1VarO.t.getValue()).floatValue(), ((Number) fhg1VarO2.t.getValue()).floatValue(), ((Number) fhg1VarO3.t.getValue()).floatValue(), ((Number) fhg1Var.t.getValue()).floatValue(), ((Number) fhg1Var2.t.getValue()).floatValue(), ((Number) fhg1Var3.t.getValue()).floatValue(), ((Number) fhg1Var4.t.getValue()).floatValue(), ((Number) fhg1VarO8.t.getValue()).floatValue(), ((Number) bno1.o(bjg1VarY, fValueOf17, fValueOf18, (ni20) krz0Var.invoke(((tob1) objT20).getValue(), x340Var, 0), tzg1Var, x340Var, 196608).t.getValue()).floatValue());
            Object objT21 = x340Var.T();
            if (objT21 == m4cVar) {
                objT21 = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var2 = (ven0) objT21;
            Object objT22 = x340Var.T();
            if (objT22 == m4cVar) {
                objT22 = kaa0.h(0L, x340Var);
            }
            ven0 ven0Var3 = (ven0) objT22;
            x340Var.i0(760278796);
            wat watVar2 = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            float fX0 = watVar2.X0(16.0f);
            x340Var.r(false);
            Object objT23 = x340Var.T();
            if (objT23 == m4cVar) {
                objT23 = yv91.a(new gj41(ven0Var2, fX0));
                x340Var.s0(objT23);
            }
            tob1 tob1Var = (tob1) objT23;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z15 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z15) {
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
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            boolean zI = x340Var.i(tob1Var) | x340Var.i(ven0Var3);
            Object objT24 = x340Var.T();
            if (zI || objT24 == m4cVar) {
                objT24 = new hf31(tob1Var, ven0Var3, (byte) 14);
                x340Var.s0(objT24);
            }
            j0o1.b(0, x340Var, (iu30) objT24, qim0VarD);
            if (z) {
                x340Var.i0(673446061);
                x340Var.r(false);
                qim0VarY = u291.d(qim0Var2, 1.0f);
            } else {
                x340Var.i0(673447695);
                qim0VarY = too1.y(u291.d(qim0Var2, 1.0f), (erl1) x340Var.k(ede0.a));
                x340Var.r(false);
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (z) {
                x340Var.i0(1732995703);
                x340Var.r(false);
                qim0VarThen = u291.d(qim0Var2, 1.0f);
                z11 = true;
            } else {
                x340Var.i0(1733006573);
                z11 = true;
                wnb0 wnb0Var = new wnb0(1.0f, true);
                mta mtaVar = cbx.b(x340Var).d;
                qim0VarThen = uyn1.B(u291.l(wnb0Var, 56.0f), cbx.b(x340Var).e.a, cbx.b(x340Var).e.b, cbx.b(x340Var).e.a, 0.0f, 8).then(new tq60(een.Q0));
                x340Var.r(false);
            }
            w2g0.c(qim0VarThen, null, apo.r(-1961557484, new fj41(z, ven0Var3, iu30Var, ven0Var2, vu30Var, z2, fX0, tob1Var, he5Var3, ven0Var), x340Var), x340Var, 3072, 6);
            x340Var = x340Var;
            ec5 ec5Var = (ec5) ven0Var.getValue();
            if (ec5Var == null) {
                x340Var.i0(-2109919571);
                z12 = false;
            } else {
                z12 = false;
                x340Var.i0(-2109919570);
                a(ec5Var, x340Var, 0);
            }
            x340Var.r(z12);
            vu30Var3 = vu30Var2;
            us71.k((i4 >> 12) & 14, vu30Var3, x340Var, z11, z11);
        } else {
            vu30Var3 = vu30Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(qim0Var2, vg41Var, vu30Var, iu30Var, vu30Var3, z, z2, i);
        }
    }

    public static final void m(String str, uoa uoaVar, Function0 function0, iu30 iu30Var, iu30 iu30Var2, dr41 dr41Var, Function0 function1, cg0 cg0Var, yt91 yt91Var, Function0 function2, Function0 function3, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function4;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(728885401);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(uoaVar) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | (x340Var2.i(iu30Var2) ? 16384 : 8192) | (x340Var2.g(dr41Var) ? 131072 : 65536) | (x340Var2.i(function1) ? 1048576 : 524288) | (x340Var2.i(cg0Var) ? 8388608 : 4194304) | (x340Var2.i(yt91Var) ? 67108864 : 33554432) | (x340Var2.i(function2) ? 536870912 : 268435456);
        char c = x340Var2.i(function3) ? (char) 4 : (char) 2;
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            iac0 iac0Var = (iac0) x340Var2.k(jfe0.a);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            ven0 ven0VarS = v8r.s(bool, x340Var2);
            boolean zI = x340Var2.i(ven0VarS) | x340Var2.i(uoaVar) | x340Var2.i(iac0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ny51(iac0Var, uoaVar, ven0VarS, (byte) 19);
                x340Var2.s0(objT2);
            }
            qxd0.i(iac0Var, (iu30) objT2, x340Var2);
            Boolean bool2 = (Boolean) ven0Var.getValue();
            bool2.getClass();
            boolean zI2 = x340Var2.i(ven0Var) | x340Var2.i(uoaVar);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new wp41(uoaVar, ven0Var, (lnm) null, (byte) 23);
                x340Var2.s0(objT3);
            }
            qxd0.t(bool2, x340Var2, (vu30) objT3);
            int i3 = i2 & 7168;
            boolean zI3 = (i3 == 2048) | x340Var2.i(ven0Var);
            Object objT4 = x340Var2.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new rc21(iu30Var, ven0Var, (byte) 10);
                x340Var2.s0(objT4);
            }
            q3p1.b(0, 1, (Function0) objT4, x340Var2, false);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = voo1.y(dug.f(qim0VarD, cbx.a(x340Var2).a.c, d4o1.a), voo1.e);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean zI4 = (i3 == 2048) | x340Var2.i(ven0Var);
            Object objT5 = x340Var2.T();
            if (zI4 || objT5 == m4cVar) {
                objT5 = new rc21(iu30Var, ven0Var, (byte) 11);
                x340Var2.s0(objT5);
            }
            Function0 function5 = (Function0) objT5;
            boolean z = !((Boolean) ven0Var.getValue()).booleanValue();
            ln00 ln00VarL = xay.l(14, irn1.o0(300, 0, (dlv) null, 6));
            bby bbyVarD = xay.d(irn1.o0(300, 0, (dlv) null, 6), (fra) null, 14);
            j2i j2iVarR = apo.r(-1221866137, new nu31(uoaVar, function5, function2, (byte) 20), x340Var2);
            pbh pbhVar = pbh.a;
            fq7.b(pbhVar, z, (qim0) null, bbyVarD, ln00VarL, (String) null, j2iVarR, x340Var2, 1572870, 18);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var2.i0(-798309394);
                x340Var2.r(false);
                function4 = null;
            } else {
                x340Var2.i0(-798406764);
                boolean zI5 = x340Var2.i(ven0Var) | ((c & 14) == 4);
                Object objT6 = x340Var2.T();
                if (zI5 || objT6 == m4cVar) {
                    objT6 = new swi0(function3, ven0Var, (byte) 16);
                    x340Var2.s0(objT6);
                }
                x340Var2.r(false);
                function4 = (Function0) objT6;
            }
            int i4 = i2 & 14;
            int i5 = i2 >> 9;
            b(str, iu30Var2, dr41Var, function1, function5, function0, function4, cg0Var, yt91Var, u291.f(pbhVar.a(1.0f, nim0Var, true), 1.0f), x340Var2, i4 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (458752 & (i2 << 9)) | (i2 & 29360128) | (i2 & 234881024));
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r6k(str, uoaVar, function0, iu30Var, iu30Var2, dr41Var, function1, cg0Var, yt91Var, function2, function3, i);
        }
    }

    public static final void n(hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1775376877);
        int i2 = i | ((i & 8) == 0 ? b0kVar2.g(huxVar) : b0kVar2.i(huxVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
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
            w0h1.a(huxVar, isl.a, (qim0) null, cbx.a(b0kVar2).b.a, 0L, false, b0kVar2, 56 | (i2 & 14), 52);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            lee1 lee1Var = ktd.l(qim0Var3, 12.0f, b0kVar2, b0kVar2).j;
            b0kVar2 = b0kVar2;
            uwo1.e(str, u291.f(qim0Var3, 1.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i2 >> 3) & 14, 0, 2040);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sgd(huxVar, str, qim0Var2, i, (byte) 2);
        }
    }

    public static final void o(uoa uoaVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-998496968);
        int i2 = i | (b0kVar3.i(uoaVar) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | (b0kVar3.i(qim0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = dug.f(qim0Var, u7h.b, d4o1.a);
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new pt61(function1, (byte) 20);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            boolean zI = b0kVar3.i(uoaVar);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                d061 d061Var = new d061(1, uoaVar, uoa.class, "addSurface", "addSurface(Lcom/spotify/betamax/player/VideoSurfaceView;)V", 0, (byte) 25);
                b0kVar3.s0(d061Var);
                objT2 = d061Var;
            }
            iu30 iu30Var = (nla0) objT2;
            boolean zI2 = b0kVar3.i(uoaVar);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                d061 d061Var2 = new d061(1, uoaVar, uoa.class, "removeSurface", "removeSurface(Lcom/spotify/betamax/player/VideoSurfaceView;)V", 0, (byte) 26);
                b0kVar3.s0(d061Var2);
                objT3 = d061Var2;
            }
            iu30 iu30Var2 = (nla0) objT3;
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = qva1.X0;
                b0kVar3.s0(objT4);
            }
            b0kVar2 = b0kVar3;
            dm5.b((iu30) objT4, qim0VarD, (iu30) null, iu30Var2, iu30Var, b0kVar2, 6, 4);
            gfx.b(18, apo.r(-141880269, new h621(function0, (byte) 14), b0kVar2), b0kVar2, 54);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, uoaVar, function0, function1, qim0Var, (byte) 21);
        }
    }

    public static final void p(VideoSurfaceView videoSurfaceView, ejj1 ejj1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1967020922);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(videoSurfaceView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ejj1Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean zI = x340Var.i(ejj1Var) | x340Var.i(videoSurfaceView);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new f2m1(ejj1Var, videoSurfaceView, (byte) 6);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
            boolean zI2 = x340Var.i(videoSurfaceView);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new mc81(videoSurfaceView, (byte) 3);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            qim0 qim0Var3 = nim0.a;
            dm5.a(iu30Var, u291.d(qim0Var3, 1.0f), (iu30) null, x340Var, 0, 4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(videoSurfaceView, ejj1Var, qim0Var2, i, (byte) 20);
        }
    }

    public static final void q(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(581601017);
        int i2 = (x340Var.d(f) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            long j = u7h.b;
            mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            boolean zI = x340Var.i(mic0VarS) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ivb(mic0VarS, f, (byte) 2);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarD);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 11, f, i);
        }
    }

    public static final void r(String str, dr41 dr41Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, Function0 function0, iu30 iu30Var5, Function0 function1, qim0 qim0Var, iu30 iu30Var6, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1444734211);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(dr41Var) : b0kVar3.i(dr41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function2 = function0;
            i2 |= b0kVar3.i(function2) ? 1048576 : 524288;
        } else {
            function2 = function0;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.i(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((b0kVar3.i(iu30Var6) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = Uri.parse(str).getScheme() != null ? str : l1d.m("https://", str);
                b0kVar3.s0(objT);
            }
            String str2 = (String) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(null);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI = b0kVar3.i(ven0Var2);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new aya1(ven0Var2, (byte) 1);
                b0kVar3.s0(objT4);
            }
            q3p1.b(0, 0, (Function0) objT4, b0kVar3, zBooleanValue);
            WebView webView = (WebView) ven0Var2.getValue();
            boolean zI2 = ((i2 & 234881024) == 67108864) | b0kVar3.i(ven0Var2) | b0kVar3.g(str2) | ((i2 & 3670016) == 1048576) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && b0kVar3.i(dr41Var)));
            Object objT5 = b0kVar3.T();
            if (zI2 || objT5 == m4cVar) {
                xd1 xd1Var = new xd1(function1, str2, function2, dr41Var, ven0Var2, (lnm) null, (byte) 29);
                b0kVar3.s0(xd1Var);
                objT5 = xd1Var;
            }
            qxd0.t(webView, b0kVar3, (vu30) objT5);
            b0kVar2 = b0kVar3;
            cgj1.n(null, null, null, null, null, 0, 0L, 0L, null, apo.r(1913207188, new jkn(qim0Var, ven0Var2, iu30Var6, iu30Var2, function0, ven0Var, iu30Var5, iu30Var, iu30Var3, iu30Var4), b0kVar3), b0kVar2, 805306368, 511);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pnu(str, dr41Var, iu30Var, iu30Var2, iu30Var3, iu30Var4, function0, iu30Var5, function1, qim0Var, iu30Var6, i);
        }
    }

    public static final void s(ejj1 ejj1Var, Bitmap bitmap, boolean z, qim0 qim0Var, boolean z2, gqb gqbVar, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-6135823);
        int i2 = i | (x340Var2.i(ejj1Var) ? 4 : 2) | (x340Var2.i(bitmap) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.h(true) ? 2048 : 1024) | (x340Var2.g(qim0Var) ? 16384 : 8192) | (x340Var2.g(gqbVar) ? 1048576 : 524288);
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            mr20 mr20Var = ejj1Var.h;
            if (mr20Var == null) {
                eg.m("VideoController is not initialized");
                return;
            }
            ven0 ven0VarG = rwq.g(mr20Var, zij1.a, (o8n) null, x340Var2, 48, 2);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(e3d1.a);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ilv.a.getClass();
            int i3 = i2 >> 3;
            ven0 ven0VarS = zod.S(new hsi1("placeholder fade out animation", Float.valueOf(1.0f), Float.valueOf(0.0f), irn1.o0(500, 0, flv.e, 2), rno1.a), z || ((e3d1) ven0Var.getValue()) != e3d1.b, true, (Function0) null, x340Var2, 8 | (i3 & 896), 8);
            x340Var = x340Var2;
            boolean zD = x340Var.d(((Number) ven0VarS.getValue()).floatValue());
            Object objT2 = x340Var.T();
            if (zD || objT2 == m4cVar) {
                objT2 = c13.l(((Number) ven0VarS.getValue()).floatValue() > 0.0f, x340Var);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT3 = x340Var.T();
            Object obj = objT3;
            if (objT3 == m4cVar) {
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView(context);
                videoSurfaceView.setScaleType(b3k1.c);
                x340Var.s0(videoSurfaceView);
                obj = videoSurfaceView;
            }
            VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
            cjj1 cjj1Var = (cjj1) ven0VarG.getValue();
            boolean zG = x340Var.g(ven0VarG);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new vs3(ven0VarG, ven0Var, (lnm) null, (byte) 13);
                x340Var.s0(objT4);
            }
            qxd0.t(cjj1Var, x340Var, (vu30) objT4);
            x340Var.i0(1893307876);
            qim0 qim0VarJ = v8r.j(qim0Var, gqbVar);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
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
            p(videoSurfaceView2, ejj1Var, null, x340Var, (i2 << 3) & 112);
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(-1717453739);
                j(bitmap, z2, true, i541.D(nim0.a, 0.0f, 0.0f, ((Number) ven0VarS.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571), x340Var, (i3 & 14) | 432);
                x340Var = x340Var;
                z3 = false;
                x340Var.r(false);
            } else {
                z3 = false;
                x340Var.i0(-1717212528);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(z3);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new erc(ejj1Var, bitmap, z, qim0Var, z2, gqbVar, i);
        }
    }

    public static final mrb0 u(Object obj) {
        if (obj instanceof mrb0) {
            return (mrb0) obj;
        }
        return null;
    }

    public static final void v(lzn0 lzn0Var, Context context, String str, tv80 tv80Var) {
        if (nhc1.Y(str, "spotify:", false)) {
            lzn0Var.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null));
            return;
        }
        if (ihc1.h0(str, "play.google.com", false)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
            return;
        }
        oxf oxfVar = oxf.b;
        try {
            int i = PremiumAccountManagementWebviewActivity.f1;
            Intent intent2 = new Intent(context, (Class<?>) PremiumAccountManagementWebviewActivity.class);
            intent2.putExtra("inapp_internalwebview_uri", str);
            intent2.putExtra("inapp_internalwebview_checkout_source", (Parcelable) oxfVar);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        } catch (ClassNotFoundException unused) {
        }
    }

    public static final String w(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !ihc1.y0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !ihc1.y0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final void z(y6 y6Var, String str) {
        y6Var.u(y6Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public float x() {
        return 0.0f;
    }

    public float y() {
        return 0.0f;
    }
}
