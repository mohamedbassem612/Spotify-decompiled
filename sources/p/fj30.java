package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fj30 implements t9k1 {
    public static final m c = new m(18);
    public static b180 d;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ fj30(Rect rect, byte b) {
        this.a = b;
        this.b = rect;
    }

    public static void A() {
        boolean z = gx4.e;
    }

    public static final int B(fua1 fua1Var) {
        int iOrdinal = fua1Var.ordinal();
        if (iOrdinal == 0) {
            return 4;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal == 3) {
            return 5;
        }
        eg.o();
        return 0;
    }

    public static final v850 C(Intent intent) {
        String string;
        Object next;
        Bundle extras = intent.getExtras();
        if (extras != null && (string = extras.getString("graduation_flow")) != null) {
            d7 d7Var = new d7(v850.d, (byte) 0);
            do {
                if (!d7Var.hasNext()) {
                    next = null;
                    break;
                }
                next = d7Var.next();
            } while (!u890.j(((v850) next).name(), string));
            v850 v850Var = (v850) next;
            if (v850Var != null) {
                return v850Var;
            }
        }
        return v850.a;
    }

    public static boolean D() {
        return gx4.e;
    }

    public static boolean E(cm4 cm4Var) {
        return cm4Var.a();
    }

    public static final qim0 F(qim0 qim0Var, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? qim0Var : i541.D(qim0Var, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048572);
    }

    public static final Float G(iix0 iix0Var) {
        if (!(iix0Var instanceof gix0)) {
            return null;
        }
        gix0 gix0Var = (gix0) iix0Var;
        long j = gix0Var.b;
        if (j <= 0) {
            return null;
        }
        return Float.valueOf(yoi1.o(gix0Var.c / j, 0.0f, 1.0f));
    }

    public static final rn71 H(exy exyVar) {
        return exyVar.g instanceof auu0 ? new rn71(rc11.a.b(vyg.class)) : new rn71(rc11.a.b(i9d1.class));
    }

    public static final iix0 I(iix0 iix0Var, Long l) {
        if (l != null) {
            if (l.longValue() <= 0) {
                l = null;
            }
            if (l != null) {
                long jLongValue = l.longValue();
                if (iix0Var == null) {
                    return new hix0(false, jLongValue);
                }
                if (iix0Var instanceof hix0) {
                    hix0 hix0Var = (hix0) iix0Var;
                    return hix0Var.b > 0 ? hix0Var : new hix0(hix0Var.a, jLongValue);
                }
                if (!(iix0Var instanceof gix0)) {
                    eg.o();
                    return null;
                }
                gix0 gix0Var = (gix0) iix0Var;
                if (gix0Var.b > 0) {
                    return gix0Var;
                }
                return new gix0(jLongValue, gix0Var.c, gix0Var.a);
            }
        }
        return iix0Var;
    }

    public static final ywy J(ywy ywyVar, wkt wktVar) {
        if (ywyVar instanceof xwy) {
            return xwy.g((xwy) ywyVar, (ela1) null, (u771) null, 0, wktVar, 7);
        }
        if (ywyVar instanceof uwy) {
            return uwy.g((uwy) ywyVar, (ela1) null, (u771) null, 0, wktVar, 55);
        }
        if (ywyVar instanceof wwy) {
            return wwy.g((wwy) ywyVar, 0, wktVar, (cuu0) null, (llw0) null, (vwy) null, 0, 4087);
        }
        eg.o();
        return null;
    }

    public static final void a(u1g0 u1g0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u1g0 u1g0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1972122736);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = dvf0.P0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = dvf0.Q0;
                x340Var.s0(objT2);
            }
            u1g0Var2 = u1g0Var;
            cgj1.k(u1g0Var2, "banner", iu30Var, rih1.a, (iu30) objT2, lrn1.x(qim0Var, 100.0f), (vzq0) null, x340Var, (i2 & 14) | 28080, 32);
        } else {
            u1g0Var2 = u1g0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v1g0(u1g0Var2, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(xhl xhlVar, ihl ihlVar, ihl ihlVar2, ihl ihlVar3, ihl ihlVar4, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1131991307);
        int i2 = i | (x340Var.i(xhlVar) ? 4 : 2) | (x340Var.g(ihlVar) ? 32 : 16) | (x340Var.g(ihlVar2) ? 256 : SemanticState.Focused) | (x340Var.g(ihlVar3) ? 2048 : SemanticState.ReadOnly) | (x340Var.g(ihlVar4) ? 16384 : SemanticState.Multiline);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            long j = u7h.b;
            long jB = u7h.b(j, 0.85f, 0.0f, 0.0f, 0.0f, 14);
            long jB2 = u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            ceo ceoVar = p1g0.a;
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new jih(ihlVar2, ihlVar3, (byte) 5);
                x340Var.s0(objT);
            }
            xhlVar.getClass();
            nim0 nim0Var = nim0.a;
            p1g0.a(jB2, jB, ceoVar, lrn1.x(xhl.j(nim0Var, ihlVar, (iu30) objT), 0.9f), x340Var, 438);
            long jB3 = u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            ceo ceoVar2 = mlv.c;
            ihl ihlVarK = xhlVar.k();
            boolean z2 = (i2 & 57344) == 16384;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new pu(ihlVar4, (byte) 14);
                x340Var.s0(objT2);
            }
            p1g0.a(jB3, j, ceoVar2, lrn1.x(xhl.j(nim0Var, ihlVarK, (iu30) objT2), 0.9f), x340Var, 54);
            ihl ihlVarK2 = xhlVar.k();
            boolean z3 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new pu(ihlVar, (byte) 15);
                x340Var.s0(objT3);
            }
            t1c.a(lrn1.x(dug.f(xhl.j(nim0Var, ihlVarK2, (iu30) objT3), jB, d4o1.a), 0.9f), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20(xhlVar, ihlVar, ihlVar2, ihlVar3, ihlVar4, i);
        }
    }

    public static final void c(n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-465893150);
        int i2 = (x340Var.g(n041Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vz31.b(n041Var, qim0Var, apo.r(1880259114, new h8(n041Var, (byte) 1), x340Var), x340Var, ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 3462);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i8(n041Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void d(wz31 wz31Var, n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        List listM;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-453495847);
        int i2 = i | (x340Var.i(wz31Var) ? 4 : 2) | (x340Var.g(n041Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            Locale localeB = yoi1.A(configuration).b(0);
            if (localeB == null) {
                localeB = Locale.ROOT;
            }
            boolean zG = x340Var.g(configuration) | x340Var.g(wz31Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                Resources resources = context.getResources();
                localeB.getClass();
                objT = crm0.C(wz31Var, resources, localeB);
                x340Var.s0(objT);
            }
            p041 p041Var = (p041) objT;
            x340Var.i0(-2017798843);
            gzl1 gzl1Var = wz31Var.a;
            int i3 = gzl1Var == null ? -1 : hfa0.a[gzl1Var.ordinal()];
            if (i3 == -1) {
                listM = p7h.M(new Integer[]{2131961372, 2131961369, 2131961367});
            } else if (i3 == 1) {
                listM = p7h.M(new Integer[]{2131961373, 2131961371, 2131961365});
            } else if (i3 == 2) {
                listM = p7h.M(new Integer[]{2131961364, 2131961370, 2131961366});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    eg.o();
                    return;
                }
                listM = p7h.M(new Integer[]{2131961372, 2131961369, 2131961367});
            } else {
                listM = p7h.M(new Integer[]{2131961373, 2131961368, 2131961365});
            }
            List list = listM;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strO0 = cwl1.o0(x340Var, ((Number) it.next()).intValue());
                localeB.getClass();
                arrayList.add(strO0.toUpperCase(localeB));
            }
            x340Var.r(false);
            qim0Var2 = qim0Var;
            vz31.b(n041Var, qim0Var2, apo.r(607586705, new jb1(n041Var, arrayList, wz31Var, localeB, p041Var, (byte) 16), x340Var), x340Var, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 3462);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j8(wz31Var, n041Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void e(u1g0 u1g0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u1g0 u1g0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1354213039);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = dvf0.R0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = dvf0.S0;
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            qim0 qim0VarX = lrn1.x(dug.f(qim0Var, u7h.b, d4o1.a), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            u1g0Var2 = u1g0Var;
            cgj1.k(u1g0Var2, "limitedExperienceIndicator", iu30Var, rih1.a, iu30Var2, qim0VarX, uyn1.j(0.0f, 4.0f, 0.0f, 0.0f, 13), x340Var, (i2 & 14) | 28080, 0);
        } else {
            u1g0Var2 = u1g0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v1g0(u1g0Var2, qim0Var, i, (byte) 1);
        }
    }

    public static final void f(u1g0 u1g0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-742023133);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(nim0.a, false, new tu(ufh0Var, (byte) 15)), apo.i(x340Var, -1488813576, new w0f0(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 11), u1g0Var, (byte) 5)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 11), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s1g0(u1g0Var, i);
        }
    }

    public static final void g(u1g0 u1g0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u1g0 u1g0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-607194996);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = dvf0.Y0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            qim0 qim0VarX = lrn1.x(qim0Var, 0.0f);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new w1g0(u1g0Var, (byte) 2);
                x340Var.s0(objT2);
            }
            u1g0Var2 = u1g0Var;
            j9k1.g(u1g0Var2, iu30Var, layoutParams, qim0VarX, (iu30) objT2, x340Var, i3 | 48, 0);
        } else {
            u1g0Var2 = u1g0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v1g0(u1g0Var2, qim0Var, i, (byte) 2);
        }
    }

    public static final void h(u1g0 u1g0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u1g0 u1g0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(8304101);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = dvf0.Z0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            ttn0 ttn0Var = new ttn0(1, uyn1.h(3, 0.0f, 0.0f));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = dvf0.a1;
                x340Var.s0(objT2);
            }
            u1g0Var2 = u1g0Var;
            cgj1.k(u1g0Var2, "navigationBar", iu30Var, ttn0Var, (iu30) objT2, lrn1.x(qim0Var, 1.0f), (vzq0) null, x340Var, (i2 & 14) | 25008, 32);
        } else {
            u1g0Var2 = u1g0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v1g0(u1g0Var2, qim0Var, i, (byte) 3);
        }
    }

    public static final void i(u1g0 u1g0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u1g0 u1g0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1468540161);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = dvf0.b1;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            w6p0 w6p0Var = new w6p0(new t6p0((mzf0) null, (Integer) null));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = dvf0.c1;
                x340Var.s0(objT2);
            }
            u1g0Var2 = u1g0Var;
            cgj1.k(u1g0Var2, "nowPlayingBar", iu30Var, w6p0Var, (iu30) objT2, lrn1.x(qim0Var, 1.0f), (vzq0) null, x340Var, (i2 & 14) | 29104, 32);
        } else {
            u1g0Var2 = u1g0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v1g0(u1g0Var2, qim0Var, i, (byte) 4);
        }
    }

    public static final void j(u1g0 u1g0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u1g0 u1g0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-766227515);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = dvf0.d1;
                x340Var.s0(objT);
            }
            u1g0Var2 = u1g0Var;
            j9k1.g(u1g0Var2, (iu30) objT, new ViewGroup.LayoutParams(-1, -1), lrn1.x(qim0Var, 10.0f), (iu30) null, x340Var, (i2 & 14) | 48, 8);
        } else {
            u1g0Var2 = u1g0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v1g0(u1g0Var2, qim0Var, i, (byte) 5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(qwq0 qwq0Var, Function0 function0, Function0 function1, vu30 vu30Var, iu30 iu30Var, Function0 function2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        vu30 vu30Var2;
        Function0 function3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1106818878);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qwq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            vu30Var2 = vu30Var;
            i2 |= x340Var.i(vu30Var2) ? 2048 : SemanticState.ReadOnly;
        } else {
            vu30Var2 = vu30Var;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            function3 = function2;
            i2 |= x340Var.i(function3) ? 131072 : 65536;
        } else {
            function3 = function2;
        }
        int i3 = i2;
        if (!x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.b0();
        } else if (qwq0Var instanceof pwq0) {
            x340Var.i0(1498958649);
            pwq0 pwq0Var = (pwq0) qwq0Var;
            kvq0 kvq0Var = new kvq0(pwq0Var.b, pwq0Var.a);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 14) == 4) | ((i3 & 57344) == 16384) | ((i3 & 458752) == 131072);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                swq0 swq0Var = new swq0(vu30Var2, qwq0Var, iu30Var, function3, (byte) 0);
                x340Var.s0(swq0Var);
                objT = swq0Var;
            }
            obg1.i(kvq0Var, qim0VarD, function1, (iu30) objT, x340Var, (i3 & 896) | 48);
            x340Var.r(false);
        } else {
            if (!(qwq0Var instanceof owq0)) {
                throw p3d1.k(x340Var, 1498957299, false);
            }
            x340Var.i0(1498971121);
            owq0 owq0Var = (owq0) qwq0Var;
            kvq0 kvq0Var2 = new kvq0(owq0Var.b, owq0Var.a);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384) | ((i3 & 458752) == 131072);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                swq0 swq0Var2 = new swq0(vu30Var, qwq0Var, iu30Var, function2, (byte) 1);
                x340Var.s0(swq0Var2);
                objT2 = swq0Var2;
            }
            y9g1.i(kvq0Var2, function0, function1, (iu30) objT2, x340Var, i3 & ContentMediaFormat.PREVIEW_EPISODE);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((byte) 10, i, qwq0Var, function0, function1, vu30Var, iu30Var, function2, false);
        }
    }

    public static final void l(n041 n041Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1049750186);
        int i2 = (x340Var.g(n041Var) ? 4 : 2) | i;
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            int i3 = vz31.b;
            qim0 qim0VarS = exd0.s(qim0VarD, rz31.c);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new gfa0(n041Var, (byte) 0);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarS);
            x340Var.i0(-288776199);
            d7 d7Var = new d7(ifa0.i, b);
            while (d7Var.hasNext()) {
                ifa0 ifa0Var = (ifa0) d7Var.next();
                lit litVar = ifa0Var.f;
                t1c.a(dug.f(u291.s(eqr0.C(nim0Var, litVar.a, litVar.b), litVar.c, litVar.d), n041Var.a, er31.d(0.0f, 0.0f, ifa0Var.g, 0.0f, 11)), x340Var, 0);
            }
            x340Var.r(false);
            lit litVar2 = efa0.d;
            qim0 qim0VarS2 = u291.s(eqr0.C(nim0Var, litVar2.a, litVar2.b), litVar2.c, litVar2.d);
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new gfa0(n041Var, (byte) 1);
                x340Var.s0(objT2);
            }
            j0o1.b(6, x340Var, (iu30) objT2, qim0VarS2);
            jmr0 jmr0VarN = i3o1.n(2131233868, x340Var, 0);
            f2b f2bVar = new f2b(n041Var.a(), 5);
            lit litVar3 = efa0.c;
            cwl1.f(jmr0VarN, (String) null, u291.r(j9k1.x(nim0Var, new lw11(litVar3, (byte) 21)), litVar3.c), (tl3) null, (j6m) null, 0.0f, f2bVar, x340Var, 56, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gs90(n041Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(String str, c380 c380Var, ifa0 ifa0Var, n041 n041Var, jfa0 jfa0Var, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1504873982);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(c380Var) ? 32 : 16) | (x340Var2.e(ifa0Var.ordinal()) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var2.g(n041Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var2.g(jfa0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        boolean z2 = false;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            float f = ifa0Var.a;
            float f2 = ifa0Var.b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarV = u291.v(eqr0.C(nim0Var, f, f2), ifa0Var.c);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(4.0f, true, new um5(z2));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            lee1 lee1Var = jfa0Var.b;
            boolean z4 = n041Var.b;
            vex vexVar = n041Var.c;
            int i3 = (i2 & 14) | 1794048;
            boolean z5 = false;
            jch0.c(str, j9k1.x(nim0Var, new t041(1, kfa0.b)), lee1.a(lee1Var, z4 ? vexVar.m : vexVar.f, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 2, false, 1, 0, (x9h) null, (m0e1) null, x340Var2, i3, 904);
            x340Var = x340Var2;
            if (c380Var.isEmpty()) {
                z = true;
                x340Var.i0(-967072018);
                x340Var.r(false);
            } else {
                x340Var.i0(-967628437);
                p(c380Var, n041Var, x340Var, ((i2 >> 3) & 14) | ((i2 >> 6) & ContentType.LONG_FORM_ON_DEMAND));
                int i4 = 1;
                mbh mbhVarA2 = jbh.a(new d36(ifa0Var.e, true, new um5(z5)), eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                for (Iterator itN = kk0.n(x340Var, qim0VarE2, lljVar4, 1129366618, c380Var); itN.hasNext(); itN = itN) {
                    q041 q041Var = (q041) itN.next();
                    String str2 = q041Var.c;
                    if (str2 == null) {
                        str2 = q041Var.a;
                    }
                    x340 x340Var3 = x340Var;
                    jch0.c(str2, j9k1.x(u291.v(nim0Var, ifa0Var.d), new t041(i4, kfa0.c)), lee1.a(jfa0Var.c, n041Var.a(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 2, false, 1, 0, (x9h) null, (m0e1) null, x340Var3, 1794048, 904);
                    i4 = i4;
                    x340Var = x340Var3;
                }
                boolean z6 = i4;
                us71.m(x340Var, false, z6, false);
                z = z6;
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 17, i, c380Var, ifa0Var, n041Var, jfa0Var, str);
        }
    }

    public static final void n(u1g0 u1g0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u1g0 u1g0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2134481495);
        int i2 = (x340Var.g(u1g0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = dvf0.e1;
                x340Var.s0(objT);
            }
            u1g0Var2 = u1g0Var;
            j9k1.g(u1g0Var2, (iu30) objT, new ViewGroup.LayoutParams(-1, -2), lrn1.x(qim0Var, 100.0f), (iu30) null, x340Var, (i2 & 14) | 48, 8);
        } else {
            u1g0Var2 = u1g0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v1g0(u1g0Var2, qim0Var, i, (byte) 6);
        }
    }

    public static final void o(q041 q041Var, n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1436424701);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(q041Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(n041Var) : x340Var.i(n041Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(3.0f));
            long j = n041Var.a;
            vex vexVar = n041Var.c;
            boolean z2 = n041Var.b;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(i1p1.q(uyn1.x(dug.f(qim0VarQ, j, u5j1Var), 2.0f), er31.b(1.0f)), z2 ? vexVar.i : vexVar.b, u5j1Var);
            boolean zI = x340Var.i(q041Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new m8(q041Var, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            yk4 yk4Var = q041Var.b;
            nim0 nim0Var = nim0.a;
            if (yk4Var != null) {
                x340Var.i0(-1280488341);
                cwl1.g(yk4Var, (String) null, u291.d(nim0Var, 1.0f), mif1.P0, 3, x340Var, 25008, 104);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(-1280190865);
                z = true;
                w0h1.a(ltx.c, isl.a, u291.d(nim0Var, 0.5f), z2 ? vexVar.l : vexVar.e, 0L, false, x340Var, ltx.d | 432, 48);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(q041Var, n041Var, qim0Var, i, (byte) 18);
        }
    }

    public static final void p(c380 c380Var, n041 n041Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1297668666);
        int i2 = (i & 6) == 0 ? (x340Var.i(c380Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(n041Var) : x340Var.i(n041Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            List listD1 = o7h.d1(efa0.e, c380Var.size());
            float fFloatValue = ((Number) ((mmr0) o7h.A0(listD1)).a).floatValue() + 23.48f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarS = u291.s(nim0Var, fFloatValue, 23.74f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
            x340Var.i0(-1293105134);
            int i3 = 0;
            for (Object obj : o7h.v1(c380Var, listD1)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                mmr0 mmr0Var = (mmr0) obj;
                q041 q041Var = (q041) mmr0Var.a;
                mmr0 mmr0Var2 = (mmr0) mmr0Var.b;
                o(q041Var, n041Var, k1u.u(u291.r(eqr0.C(nim0Var, (((Number) mmr0Var2.a).floatValue() + 0.7399998f) - 2.0f, (((Number) mmr0Var2.b).floatValue() + 0.7399998f) - 2.0f), 26.0f), i3 % 2 == 0 ? -4.0f : 4.0f), x340Var, i2 & ContentType.LONG_FORM_ON_DEMAND);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(c380Var, n041Var, i, (byte) 11);
        }
    }

    public static final void q(String str, String str2, u7h u7hVar, boolean z, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        long jA;
        int i2;
        qim0 qim0Var2;
        int i3;
        x340 x340Var2;
        float f;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(515887806);
        int i4 = i | (x340Var3.g(str) ? 4 : 2) | (x340Var3.g(str2) ? 32 : 16) | (x340Var3.g(u7hVar) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var3.h(z) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var3.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var3.i(function0) ? 131072 : 65536);
        if (x340Var3.Y(i4 & 1, (i4 & 74899) != 74898)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var3).f;
            cr31 cr31VarB = er31.b(8.0f);
            boolean z2 = (!z || str == null || str.length() == 0) ? false : true;
            float f2 = z2 ? 0.8f : 0.6f;
            if (u7hVar == null) {
                x340Var3.i0(1846957442);
                jA = cbx.a(x340Var3).a.b.a();
                x340Var3.r(false);
            } else {
                x340Var3.i0(1846955861);
                x340Var3.r(false);
                jA = u7hVar.a;
            }
            qim0 qim0VarQ = i1p1.q(d7e.r(1.7777778f, u291.f(qim0Var, 1.0f), false), cr31VarB);
            if (z2) {
                jA = u7h.j;
            }
            qim0 qim0VarF = dug.f(qim0VarQ, jA, d4o1.a);
            int i5 = i4 & 458752;
            boolean z3 = i5 == 131072;
            Object objT = x340Var3.T();
            if (z3 || objT == m4cVar) {
                objT = new tpj1(function0, (byte) 27);
                x340Var3.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarX);
            hzj.A.getClass();
            boolean z4 = z2;
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            qim0 qim0Var3 = nim0.a;
            if (z4) {
                x340Var3.i0(1929993622);
                f = f2;
                qim0Var2 = qim0Var3;
                i3 = 0;
                i2 = i5;
                eso1.e(Uri.parse(str), isl.a, u291.d(qim0Var3, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 224304, 0, 3968);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                i2 = i5;
                qim0Var2 = qim0Var3;
                i3 = 0;
                x340Var2 = x340Var3;
                f = f2;
                x340Var2.i0(1930278078);
                x340Var2.r(false);
            }
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            Float fValueOf = Float.valueOf(0.02f);
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.e;
            vex vexVar2 = (vex) zscVar.b;
            t1c.a(dug.e(qim0VarD, v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(vexVar.a)), new mmr0(Float.valueOf(0.55f), new u7h(((vex) zscVar.e).d)), new mmr0(Float.valueOf(1.0f), new u7h(vexVar2.a))}, 0.0f, 0.0f, 14), (hw61) null, f, 2), x340Var2, i3);
            lee1 lee1Var = cbx.d(x340Var2).d;
            long j = vexVar2.b;
            cjc0 cjc0Var = new cjc0(3);
            gra graVar = een.t;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var2, graVar);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            x340 x340Var4 = x340Var2;
            uwo1.e(str2, uyn1.B(qim0VarA, 16.0f, 0.0f, 72.0f, 16.0f, 2), lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var4, (i4 >> 3) & 14, 0, 1712);
            int i6 = i2 == 131072 ? 1 : i3;
            Object objT2 = x340Var4.T();
            if (i6 != 0 || objT2 == m4cVar) {
                objT2 = new tpj1(function0, (byte) 28);
                x340Var4.s0(objT2);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT2);
            idx idxVar = new idx(8);
            gdx gdxVarS = yla.s(x340Var4);
            qim0 qim0VarA2 = h2cVar.a(qim0Var2, een.Y);
            cvx cvxVar3 = cbx.b(x340Var4).b;
            wro1.h(gbxVar, idxVar, uyn1.x(qim0VarA2, 16.0f), (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, lsj.a, x340Var4, 12582912, 6, 856);
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j2g1(str, str2, u7hVar, z, qim0Var, function0, i);
        }
    }

    public static final boolean r(float f, CharSequence charSequence, TextPaint textPaint) {
        if (f == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (z1a1.m(spanned, g3c0.class) || z1a1.m(spanned, f3c0.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }

    public static final CharSequence s(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (z1a1.m(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }

    public static gx4 t() {
        if (gx4.e) {
            return new gx4();
        }
        return null;
    }

    public static xj61 u(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        xj61 xj61Var = new xj61();
        xj61Var.add(str);
        try {
            xj61Var.add(nhc1.W(str, s4b1VarX.h(), "?"));
        } catch (UnsupportedOperationException unused) {
        }
        return cwl1.j(xj61Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(bhf bhfVar, ywy ywyVar, onm onmVar) {
        kwy kwyVar;
        if (onmVar instanceof kwy) {
            kwyVar = (kwy) onmVar;
            int i = kwyVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                kwyVar.c = i - os00.INVALID_ID;
            } else {
                kwyVar = new kwy(onmVar);
            }
        } else {
            kwyVar = new kwy(onmVar);
        }
        Object objA = kwyVar.b;
        int i2 = kwyVar.c;
        if (i2 == 0) {
            hm5.M(objA);
            if (!(ywyVar instanceof wwy)) {
                return null;
            }
            wwy wwyVar = (wwy) ywyVar;
            t0c t0cVarF = lcc.F(wwyVar.f);
            ez61 ez61Var = wwyVar.a.b.c;
            kwyVar.a = wwyVar;
            kwyVar.c = 1;
            bhfVar.getClass();
            objA = bhf.a(t0cVarF, ez61Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ywyVar = kwyVar.a;
            hm5.M(objA);
        }
        xgf xgfVar = (xgf) objA;
        wwy wwyVar2 = (wwy) ywyVar;
        jlw0 jlw0VarH = wwyVar2.h();
        return new wgf(xgfVar, jlw0VarH != null ? new fhf(Uri.parse(jlw0VarH.a)) : null, new r771(wwyVar2.a.a.b));
    }

    public static final double w(double d2, ngv ngvVar, ngv ngvVar2) {
        TimeUnit timeUnit = ngvVar2.a;
        TimeUnit timeUnit2 = ngvVar.a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d2 * jConvert : d2 / timeUnit2.convert(1L, timeUnit);
    }

    public static final long x(long j, ngv ngvVar, ngv ngvVar2) {
        return ngvVar2.a.convert(j, ngvVar.a);
    }

    public static final long y(long j, ngv ngvVar) {
        long j2;
        int iOrdinal = ngvVar.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                hhg1.o(ngvVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0115 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:74:0x0173
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final void z(int r35, int r36, p.xen0 r37) {
        /*
            Method dump skipped, instruction units count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fj30.z(int, int, p.xen0):void");
    }
}
