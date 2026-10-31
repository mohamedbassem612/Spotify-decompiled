package p;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.net.Uri;
import android.os.RemoteException;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.protobuf.Duration;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class iqo1 {
    public static final String[] a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public static b180 c;

    public static final void a(int i, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(330671674);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            k5k k5kVar = qgx.a;
            uwr uwrVar = cbx.a;
            mod.c(new ely0[]{k5kVar.a(new u7h(cbx.a(x340Var).b.a)), rgx.a.a(cbx.d(x340Var).j)}, apo.r(-635573510, new k7f(vu30Var, (byte) 15), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ahx(vu30Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1482432602);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long jE = z4p1.e(((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getColor(2131101503));
            gra graVar = een.h;
            qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(anm1.N("custom_reactions_button", qim0Var2), 40.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarR, (idn0) objT, jtr.f, false, null, new pm31(0), function0, 12);
            cr31 cr31Var = er31.a;
            qim0 qim0VarF = dug.f(sto1.o(qim0VarV, 4.0f, cr31Var, false, 0L, 0L, 24), jE, cr31Var);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            tjx tjxVar = tjx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131953369));
            uwr uwrVar = cbx.a;
            function1 = function0;
            w0h1.a(tjxVar, jslVar, u291.r(qim0Var2, 24.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, tjx.d | 384, 48);
            x340Var.r(true);
        } else {
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function1, qim0Var2, i, (byte) 26);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        qim0 qim0Var2;
        String strN0;
        long jC;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(869735684);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | 3072;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                x340Var2.i0(-1702625279);
                strN0 = cwl1.n0(2131953401, new Object[]{str}, x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1702621986);
                strN0 = cwl1.n0(2131953400, new Object[]{str}, x340Var2);
                x340Var2.r(false);
            }
            String str2 = strN0;
            gra graVar = een.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 40.0f);
            pm31 pm31Var = new pm31(0);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 17);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarR, false, str2, pm31Var, null, (Function0) objT, 9);
            cr31 cr31VarB = er31.b(24.0f);
            if (z) {
                x340Var2.i0(-1702608723);
                uwr uwrVar = cbx.a;
                jC = cbx.a(x340Var2).a.b.c();
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1702606707);
                uwr uwrVar2 = cbx.a;
                jC = cbx.a(x340Var2).a.a.c();
                x340Var2.r(false);
            }
            qim0 qim0VarF = dug.f(qim0VarX, jC, cr31VarB);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(str, null, lee1.a(cbx.d(x340Var2).d, 0L, ((wat) x340Var2.k(t4k.h)).s(24.0f), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), 0L, null, null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2042);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, z, function0, qim0Var2, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void d(j2i j2iVar, j2i j2iVar2, qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        vu30 vu30Var4;
        boolean z;
        vu30 vu30Var5;
        vu30 vu30Var6;
        qim0 qim0Var3;
        vu30 vu30Var7;
        h311 h311VarV;
        qim0 qim0Var4;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(235450101);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = (x340Var.i(qim0Var2) ? 256 : 128) | i;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                vu30Var4 = vu30Var;
                i3 |= x340Var.i(vu30Var4) ? 2048 : 1024;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i4 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i5 != 0) {
                    vu30Var4 = null;
                }
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = u291.f(uyn1.x(dug.f(qim0Var2, cbx.a(x340Var).a.c, er31.b(8.0f)), 24.0f), 1.0f);
                vq60 vq60Var = jw80.a;
                qim0 qim0VarThen = qim0VarF.then(tsj0.a);
                mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.Q0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarThen);
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
                e((i3 >> 9) & 14, x340Var, vu30Var4, null);
                n(6, j2iVar, x340Var, null);
                vu30Var5 = vu30Var2;
                a(6, x340Var, vu30Var5, null);
                h(6, j2iVar2, x340Var, uyn1.B(qim0Var4, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                vu30Var6 = vu30Var3;
                l(6, x340Var, vu30Var6, null);
                x340Var.r(true);
            } else {
                vu30Var5 = vu30Var2;
                vu30Var6 = vu30Var3;
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            vu30Var7 = vu30Var4;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(j2iVar, j2iVar2, qim0Var3, vu30Var7, vu30Var5, vu30Var6, i, i2, (byte) 5);
            }
        }
        i3 |= 3072;
        vu30Var4 = vu30Var;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                qim0Var2 = qim0Var4;
            }
            if (i5 != 0) {
                vu30Var4 = null;
            }
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarF2 = u291.f(uyn1.x(dug.f(qim0Var2, cbx.a(x340Var).a.c, er31.b(8.0f)), 24.0f), 1.0f);
            vq60 vq60Var2 = jw80.a;
            qim0 qim0VarThen2 = qim0VarF2.then(tsj0.a);
            mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.Q0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarThen2);
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
            e((i3 >> 9) & 14, x340Var, vu30Var4, null);
            n(6, j2iVar, x340Var, null);
            vu30Var5 = vu30Var2;
            a(6, x340Var, vu30Var5, null);
            h(6, j2iVar2, x340Var, uyn1.B(qim0Var4, 0.0f, 16.0f, 0.0f, 0.0f, 13));
            vu30Var6 = vu30Var3;
            l(6, x340Var, vu30Var6, null);
            x340Var.r(true);
        } else {
            vu30Var5 = vu30Var2;
            vu30Var6 = vu30Var3;
            x340Var.b0();
        }
        qim0Var3 = qim0Var2;
        vu30Var7 = vu30Var4;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(j2iVar, j2iVar2, qim0Var3, vu30Var7, vu30Var5, vu30Var6, i, i2, (byte) 5);
        }
    }

    public static final void e(int i, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2084075759);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0Var = nim0.a;
            if (vu30Var == null) {
                x340Var.i0(-1346199281);
                x340Var.r(false);
            } else {
                x340Var.i0(-1346199280);
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                us71.k(i3 & 14, vu30Var, x340Var, true, false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ahx(vu30Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void f(hux huxVar, b0k b0kVar, int i) {
        int i2;
        hux huxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-389907832);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 6.0f, 1, nim0.a);
            zov0 zov0Var = cbx.b(x340Var).g;
            huxVar2 = huxVar;
            w0h1.a(huxVar2, isl.a, u291.r(qim0VarZ, 16.0f), 0L, 0L, false, x340Var, 56 | (i2 & 14), 56);
        } else {
            huxVar2 = huxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q4f(huxVar2, i);
        }
    }

    public static final void g(String str, String str2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function2;
        qim0 qim0Var2;
        Uri uri;
        Function0 function3 = function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1894070078);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function3) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(dug.f(u291.f(qim0Var3, 1.0f), u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14), er31.b(8.0f)), 12.0f);
            d36 d36Var = new d36(12.0f, true, new um5(false));
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (str == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            uri.getClass();
            bmq0.a(uri, anm1.N("pending-join-request-avatar", u291.r(qim0Var3, 24.0f)), hcx.c, str2, (String) null, 0L, 0L, false, x340Var, ((i2 << 6) & 7168) | 384, 240);
            uwr uwrVar = cbx.a;
            uwo1.e(str2, anm1.N("pending-join-request-username", new wnb0(1.0f, true)), cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2040);
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (ihc1.y0("Decline")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            function3 = function1;
            foo1.c(new gbx(new y50("Decline"), function3), jdx.c, anm1.N("pending-join-request-deny-button", qim0Var3), null, yla.s(x340Var), null, null, null, null, null, w6j.a, x340Var, 0, 48, 2008);
            if (ihc1.y0("Accept")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            function2 = function0;
            foo1.c(new gbx(new y50("Accept"), function2), new idx(4), anm1.N("pending-join-request-accept-button", qim0Var3), null, yla.s(x340Var), null, null, null, null, null, w6j.b, x340Var, 0, 48, 2008);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            function2 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ogs0(str, str2, function2, function3, qim0Var2, i, (byte) 0);
        }
    }

    public static final void h(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1405664228);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            dv20.l(i2 & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3f(b2, i, j2iVar, qim0Var);
        }
    }

    public static final void i(w201 w201Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(356771338);
        int i2 = i | (x340Var.g(w201Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            boolean z = w201Var.c;
            float f2 = z ? 290.0f : Float.NaN;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            if (z) {
                x340Var.i0(-740114478);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 4.0f;
            } else {
                x340Var.i0(-740113972);
                x340Var.r(false);
                f = 0.0f;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(uyn1.B(dug.f(u291.x(0.0f, f2, 1, qim0Var3), cbx.a(x340Var).a.a.c(), er31.b(28.0f)), 0.0f, 4.0f, f, 4.0f, 1), er31.b(28.0f));
            gfh0 gfh0VarC = t1c.c(een.i, false);
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
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            cvx cvxVar3 = cbx.b(x340Var).b;
            float f3 = z ? 20.0f : 0.0f;
            float f4 = z ? 28.0f : 4.0f;
            qim0 qim0VarS = exd0.s(i541.D(uyn1.B(qim0Var3, 0.0f, 0.0f, f3, 0.0f, 11), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new pq50(xtb0VarA, (byte) 3));
            zzq0 zzq0VarJ = uyn1.j(4.0f, 0.0f, f4, 0.0f, 10);
            d36 d36Var = new d36(4.0f, true, new um5(false));
            int i3 = i2 & 112;
            boolean zI = (i3 == 32) | ((i2 & 14) == 4) | x340Var.i(ss50Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ozu0(w201Var, ss50Var, iu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarS, xtb0VarA, zzq0VarJ, d36Var, null, null, false, null, (iu30) objT, x340Var, 24576, 488);
            if (z) {
                x340Var.i0(-1843548684);
                boolean z2 = i3 == 32;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new j9z0(iu30Var, (byte) 11);
                    x340Var.s0(objT2);
                }
                b(0, (Function0) objT2, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(-1843458350);
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
            h311VarV.d = new ffx0(w201Var, iu30Var, qim0Var2, i, (byte) 11);
        }
    }

    public static final void j(erc1 erc1Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1499070200);
        int i2 = i | (x340Var.g(erc1Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var4, cr31VarB), cbx.a(x340Var).a.b.a(), d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 2.0f, 2.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
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
            boolean z2 = erc1Var instanceof yqc1;
            isl islVar = isl.a;
            if (z2) {
                x340Var.i0(-1296731064);
                yqc1 yqc1Var = (yqc1) erc1Var;
                hux huxVar = yqc1Var.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(huxVar, islVar, u291.r(qim0Var4, 12.0f), i1p1.y(x340Var, yqc1Var.b), 0L, false, x340Var, 56, 48);
                x340Var.r(false);
                z = true;
                qim0Var3 = qim0Var4;
                b2 = 0;
                x340Var = x340Var;
            } else {
                if (erc1Var instanceof crc1) {
                    x340Var.i0(-1296722204);
                    crc1 crc1Var = (crc1) erc1Var;
                    String str = crc1Var.a;
                    String str2 = crc1Var.c;
                    x340Var = x340Var;
                    qim0Var3 = qim0Var4;
                    b2 = 0;
                    uwo1.e(str, anm1.N("active-row-subtitle-text", str2 == null ? qim0Var4 : s161.b(qim0Var4, false, new hqa1(str2, (byte) 8))), cbx.d(x340Var).n, i1p1.y(x340Var, crc1Var.b), null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1776);
                    x340Var.r(false);
                } else {
                    if (!(erc1Var instanceof arc1)) {
                        throw p3d1.k(x340Var, -1296731510, false);
                    }
                    x340Var.i0(-1543309201);
                    arc1 arc1Var = (arc1) erc1Var;
                    crc1 crc1Var2 = arc1Var.b;
                    yqc1 yqc1Var2 = arc1Var.a;
                    hux huxVar2 = yqc1Var2.a;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    w0h1.a(huxVar2, islVar, u291.r(qim0Var4, 12.0f), i1p1.y(x340Var, yqc1Var2.b), 0L, false, x340Var, 56, 48);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(qim0Var4, 4.0f));
                    String str3 = crc1Var2.a;
                    String str4 = crc1Var2.c;
                    x340Var = x340Var;
                    qim0Var3 = qim0Var4;
                    uwo1.e(str3, anm1.N("active-row-subtitle-text", str4 == null ? qim0Var4 : s161.b(qim0Var4, false, new hqa1(str4, (byte) 8))), cbx.d(x340Var).n, i1p1.y(x340Var, crc1Var2.b), null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1776);
                    b2 = 0;
                    x340Var.r(false);
                }
                z = true;
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mqc1(erc1Var, qim0Var2, i, b2);
        }
    }

    public static final void k(ArrayList arrayList, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1726856591);
        int i2 = (x340Var.g(arrayList) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            x340Var.i0(-466977699);
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                erc1 erc1Var = (erc1) obj;
                if (i3 > 0) {
                    x340Var.i0(554790082);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    ab80.p(qim0Var2, 4.0f, x340Var, false);
                } else {
                    x340Var.i0(554874650);
                    x340Var.r(false);
                }
                j(erc1Var, null, x340Var, 0);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc0(arrayList, qim0Var, i, (byte) 4);
        }
    }

    public static final void l(int i, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-744051720);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            k5k k5kVar = qgx.a;
            uwr uwrVar = cbx.a;
            mod.b(k5kVar.a(new u7h(cbx.a(x340Var).b.a)), apo.r(588251320, new k7f(vu30Var, (byte) 16), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ahx(vu30Var, qim0Var, i, (byte) 2);
        }
    }

    public static final void m(int i, int i2, b0k b0kVar, hux huxVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(92153881);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(huxVar) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, nim0Var);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            f(huxVar, x340Var, ((i3 >> 3) & 14) | 8);
            yla.s(x340Var);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            uwo1.e(cwl1.o0(x340Var, i), null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q4f(i, i2, huxVar);
        }
    }

    public static final void n(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1598435552);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            k5k k5kVar = qgx.a;
            uwr uwrVar = cbx.a;
            mod.c(new ely0[]{k5kVar.a(new u7h(cbx.a(x340Var).b.a)), rgx.a.a(cbx.d(x340Var).e)}, apo.r(1709605920, new pu2(j2iVar), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3f(b2, i, j2iVar, qim0Var);
        }
    }

    public static int o(int i, Context context, String str) {
        if (str == null) {
            return 1;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return 2;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return 0;
            }
        }
        return 1;
    }

    public static final int p(zci1 zci1Var) {
        int iG = zci1Var.g();
        int i = iG == 0 ? -1 : wci1.a[l1d.C(iG)];
        if (i == -1) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        eg.o();
        return 0;
    }

    public static final jyl1 q(fn20 fn20Var, ytw0 ytw0Var, vpp0 vpp0Var, xrc0 xrc0Var, RetrofitMaker retrofitMaker, Context context, Scheduler scheduler) {
        if (!fn20Var.a.b()) {
            return null;
        }
        avw0 avw0Var = new avw0((byte) 12);
        tig tigVar = (tig) retrofitMaker.createWebgateService(tig.class, "android-fitness-offline-plugin", wrn.b);
        geo geoVar = (geo) retrofitMaker.createWebgateService(geo.class, "android-fitness-offline-plugin");
        tigVar.getClass();
        tz01 tz01Var = new tz01(tigVar, (byte) 9);
        geoVar.getClass();
        return new jyl1(new rm5(new File(context.getFilesDir(), "fitness-tts-cue-store"), avw0Var), avw0Var, ytw0Var, vpp0Var, xrc0Var, tz01Var, new xaz0(geoVar, (byte) 14), new m2l1((byte) 1), new ConcurrentHashMap(), scheduler);
    }

    public static void r(eh70 eh70Var) {
        if (eh70Var != null) {
            try {
                eh70Var.onDisconnected();
            } catch (RemoteException unused) {
            }
        }
    }

    public static final tr3 s(tr3 tr3Var, List list) {
        w7c0 w7c0Var = tr3Var.c;
        return tr3.b(tr3Var, (List) null, (sxc0) null, new w7c0(sqg0.O(w7c0Var.a, Collections.singletonMap(vg60.a, list))), false, 11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0210  */
    /* JADX WARN: Code duplicated, block: B:116:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x021e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0227  */
    /* JADX WARN: Code duplicated, block: B:127:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0235  */
    /* JADX WARN: Code duplicated, block: B:134:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0240  */
    /* JADX WARN: Code duplicated, block: B:141:0x0249  */
    /* JADX WARN: Code duplicated, block: B:148:0x025e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0264  */
    /* JADX WARN: Code duplicated, block: B:156:0x0275  */
    /* JADX WARN: Code duplicated, block: B:158:0x0279  */
    /* JADX WARN: Code duplicated, block: B:161:0x027f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0282  */
    /* JADX WARN: Code duplicated, block: B:165:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0288  */
    /* JADX WARN: Code duplicated, block: B:168:0x028f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0292  */
    /* JADX WARN: Code duplicated, block: B:171:0x0295  */
    /* JADX WARN: Code duplicated, block: B:173:0x029c  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:179:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:183:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:186:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:188:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:191:0x0317 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0320  */
    /* JADX WARN: Code duplicated, block: B:197:0x0324 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x0328  */
    /* JADX WARN: Code duplicated, block: B:201:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0336  */
    /* JADX WARN: Code duplicated, block: B:209:0x033e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0346  */
    /* JADX WARN: Code duplicated, block: B:215:0x034c  */
    /* JADX WARN: Code duplicated, block: B:218:0x0353  */
    /* JADX WARN: Code duplicated, block: B:221:0x035d  */
    /* JADX WARN: Code duplicated, block: B:223:0x0369  */
    /* JADX WARN: Code duplicated, block: B:224:0x0370  */
    /* JADX WARN: Code duplicated, block: B:227:0x037f  */
    /* JADX WARN: Code duplicated, block: B:230:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:238:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:241:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:244:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:246:0x03be  */
    /* JADX WARN: Code duplicated, block: B:247:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:250:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:252:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:255:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:256:0x0410  */
    /* JADX WARN: Code duplicated, block: B:258:0x041c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0422  */
    /* JADX WARN: Code duplicated, block: B:261:0x0429  */
    /* JADX WARN: Code duplicated, block: B:264:0x043f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0444  */
    /* JADX WARN: Code duplicated, block: B:267:0x044d  */
    /* JADX WARN: Code duplicated, block: B:269:0x0453  */
    /* JADX WARN: Code duplicated, block: B:270:0x0456 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x0469  */
    /* JADX WARN: Code duplicated, block: B:278:0x0472  */
    /* JADX WARN: Code duplicated, block: B:281:0x0484  */
    /* JADX WARN: Code duplicated, block: B:282:0x0487  */
    /* JADX WARN: Code duplicated, block: B:285:0x0491  */
    /* JADX WARN: Code duplicated, block: B:287:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x049f  */
    /* JADX WARN: Code duplicated, block: B:293:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:294:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:296:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:297:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:303:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:304:0x04db  */
    /* JADX WARN: Code duplicated, block: B:307:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:309:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:310:0x04fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:314:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:325:0x051e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0521  */
    /* JADX WARN: Code duplicated, block: B:329:0x054c  */
    /* JADX WARN: Code duplicated, block: B:331:0x0558 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:339:0x056f  */
    /* JADX WARN: Code duplicated, block: B:342:0x0577  */
    /* JADX WARN: Code duplicated, block: B:343:0x057c  */
    /* JADX WARN: Code duplicated, block: B:345:0x0595  */
    /* JADX WARN: Code duplicated, block: B:348:0x059f  */
    /* JADX WARN: Code duplicated, block: B:349:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:351:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:353:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:354:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:357:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:359:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:360:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:362:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:364:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:366:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:369:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:372:0x0601  */
    /* JADX WARN: Code duplicated, block: B:382:0x0630  */
    /* JADX WARN: Code duplicated, block: B:384:0x0633  */
    /* JADX WARN: Code duplicated, block: B:385:0x0636  */
    /* JADX WARN: Code duplicated, block: B:387:0x0674  */
    /* JADX WARN: Code duplicated, block: B:389:0x0678  */
    /* JADX WARN: Code duplicated, block: B:391:0x067d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:392:0x067f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0686  */
    /* JADX WARN: Code duplicated, block: B:397:0x0693  */
    /* JADX WARN: Code duplicated, block: B:399:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:401:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:402:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:404:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:405:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:407:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:408:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:410:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:413:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:415:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:417:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:420:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:422:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:423:0x06f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00df A[PHI: r74
      0x00df: PHI (r74v5 boolean) = (r74v1 boolean), (r74v6 boolean) binds: [B:44:0x00e6, B:40:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ba A[ADDED_TO_REGION] */
    public static final hob1 t(mey0 mey0Var, t810 t810Var, xei0 xei0Var, fza fzaVar, hvp0 hvp0Var, yqg yqgVar, ytp0 ytp0Var, fiv0 fiv0Var, vu30 vu30Var, iu30 iu30Var, boolean z, iix0 iix0Var, Resources resources) {
        String str;
        boolean z2;
        ArrayList arrayList;
        List list;
        boolean z3;
        String str2;
        String str3;
        r4p1 r4p1VarH;
        ArrayList arrayList2;
        nbw0 nbw0Var;
        yo60 yo60Var;
        xkk1 xkk1Var;
        er00 dr00Var;
        boolean z4;
        boolean z5;
        gix0 gix0Var;
        mgo0 mgo0Var;
        rle1 rle1Var;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        xkk1 xkk1Var2;
        mgo0 mgo0Var2;
        hzy hzyVar;
        int i;
        mgo0 mgo0Var3;
        String strConcat;
        mgo0 pm0Var;
        g371 g371Var;
        mgo0 mgo0Var4;
        boolean z12;
        boolean z13;
        mgo0 mgo0Var5;
        mgo0 mgo0Var6;
        boolean z14;
        lsm0 lsm0VarR;
        mgo0 mgo0Var7;
        mgo0 mgo0Var8;
        mgo0 mgo0Var9;
        boolean z15;
        boolean z16;
        mgo0 mgo0Var10;
        mgo0 mgo0Var11;
        mgo0 c5v0Var;
        mgo0 mgo0Var12;
        long j;
        mgo0 mgo0Var13;
        mgo0 mgo0VarV;
        long j2;
        mgo0 mgo0VarValueOf;
        mgo0 mgo0VarJ;
        mgo0 mgo0Var14;
        er00 er00Var;
        boolean z17;
        boolean z18;
        mgo0 mgo0Var15;
        mgo0 mgo0VarY0;
        mgo0 mgo0Var16;
        boolean z19;
        String str4;
        mgo0 mgo0VarF;
        ArrayList arrayList3;
        mgo0 mgo0Var17;
        mgo0 mgo0Var18;
        boolean z20;
        lfi0 lfi0VarR;
        boolean z21;
        lfi0 lfi0Var;
        hwt hwtVar;
        mgo0 mgo0VarU;
        mgo0 mgo0Var19;
        mgo0 mgo0Var20;
        mgo0 mgo0Var21;
        mgo0 uiv0Var;
        mgo0 m9g1Var;
        long jP;
        long j3;
        boolean z22;
        mgo0 mgo0Var22;
        boolean z23;
        mgo0 mgo0Var23;
        boolean zA;
        mgo0 mgo0Var24;
        Duration duration;
        Duration duration2;
        boolean z24;
        TimeUnit timeUnit;
        t9g1 r9g1Var;
        io70 io70Var;
        int i2;
        boolean z25;
        boolean z26;
        mgo0 mgo0Var25;
        long jLongValue;
        mgo0 mgo0VarA;
        io70 io70Var2;
        mgo0 mgo0Var26;
        io70 io70Var3;
        mgo0 mgo0VarZ;
        int iC;
        mq70 mq70Var;
        up70 up70VarA;
        u281 u281Var;
        io70 io70Var4;
        mgo0 mgo0Var27 = mey0Var.e;
        mgo0 mgo0Var28 = mey0Var.d;
        mgo0 mgo0Var29 = mey0Var.c;
        boolean z27 = t810Var.l;
        boolean z28 = t810Var.k;
        zkm zkmVar = t810Var.b;
        boolean z29 = t810Var.g;
        boolean z30 = t810Var.e;
        y2u0 y2u0Var = t810Var.p;
        boolean z31 = t810Var.f;
        hwt hwtVar2 = t810Var.c;
        jo70 jo70Var = xei0Var.c;
        nbw0 nbw0Var2 = xei0Var.a;
        Duration duration3 = nbw0Var2.h;
        long j4 = nbw0Var2.i;
        String str5 = nbw0Var2.e;
        tyl tylVar = nbw0Var2.p;
        mgo0 mgo0Var30 = tylVar.a;
        mgo0 mgo0Var31 = nbw0Var2.a;
        String str6 = nbw0Var2.f;
        int i3 = nbw0Var2.l;
        Long lValueOf = j4 > yqgVar.b() ? Long.valueOf(j4) : null;
        yo60 yo60Var2 = xei0Var.b;
        boolean z32 = yo60Var2 != null;
        prl prlVar = xei0Var.d;
        w281 w281Var = xei0Var.g;
        e2k1 e2k1Var = xei0Var.f;
        l1z l1zVar = xei0Var.i;
        mtl mtlVar = xei0Var.j;
        xkk1 xkk1Var3 = xei0Var.e;
        Set set = s4b1.f;
        boolean zG = uic.g(mgo0Var29, blc0.ed);
        xkk1 xkk1Var4 = xei0Var.h;
        boolean z33 = (mtlVar != null ? mtlVar.a : null) == ktl.b;
        if (!zG || jo70Var == null || (io70Var4 = jo70Var.e) == null || (str = io70Var4.a) == null || ihc1.y0(str)) {
            str = null;
        }
        boolean z34 = zG && z33;
        boolean z35 = zG && !z33;
        ArrayList arrayList4 = z6x.a;
        if (!zG) {
            z2 = z33;
            if (!uic.h(mgo0Var29, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6})) {
                str = str;
                mgo0Var29 = mgo0Var29;
                arrayList = arrayList4;
            }
            if (eqr0.z(mgo0Var29) || !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (w281Var != null || (u281Var = w281Var.g) == null) {
                str2 = null;
            } else {
                str2 = u281Var.a;
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            r4p1VarH = fza.h(nbw0Var2.j);
            if (yo60Var2 != null) {
                q8i0 q8i0VarA = kno1.A(yo60Var2, null);
                hwt hwtVar3 = t810Var.c;
                if (y2u0Var != null) {
                    arrayList2 = arrayList;
                    boolean z36 = y2u0Var.c;
                    dr00Var = upo1.G(q8i0VarA, nbw0Var2, yo60Var2, xkk1Var3, str3, r4p1VarH, hwtVar3, z36, 64);
                    nbw0Var = nbw0Var2;
                    yo60Var = yo60Var2;
                    xkk1Var = xkk1Var3;
                } else {
                    arrayList2 = arrayList;
                }
                dr00Var = upo1.G(q8i0VarA, nbw0Var2, yo60Var2, xkk1Var3, str3, r4p1VarH, hwtVar3, z36, 64);
                nbw0Var = nbw0Var2;
                yo60Var = yo60Var2;
                xkk1Var = xkk1Var3;
            } else {
                arrayList2 = arrayList;
                nbw0Var = nbw0Var2;
                yo60Var = yo60Var2;
                xkk1Var = xkk1Var3;
                dr00Var = new dr00(false, upo1.F(i3), false, o2p1.k(xkk1Var, vp70.d, nbw0Var.g));
            }
            if (z32 || !kno1.A(yo60Var, hwtVar2).equals(m8i0.a)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z || !(dr00Var instanceof cr00)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (iix0Var instanceof gix0) {
                gix0Var = (gix0) iix0Var;
            } else {
                gix0Var = null;
            }
            if (gix0Var != null || !z5 || resources == null || fho1.u(gix0Var, null) == null) {
                gix0Var = null;
            }
            if (gix0Var == null) {
                mgo0Var = null;
                rle1Var = null;
            } else {
                if (resources == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                ogv ogvVar = new ogv(resources, (byte) 0);
                ytw0 ytw0Var = jfv.b;
                rle1Var = (rle1) ogvVar.invoke(new jfv(fdg1.l0(gix0Var.b - gix0Var.c, ngv.d)));
                mgo0Var = null;
            }
            if (z4 || !z30 || !eqr0.z(mgo0Var29) || (z2 && !z31)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z4 && z31 && eqr0.A(mgo0Var29)) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z6 || z7) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8 || z35 || (zG && z31)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z8 || (z31 && z4)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (eqr0.A(mgo0Var29) || !eqr0.A(mgo0Var28) || j4 <= 0 || j4 <= yqgVar.b()) {
                z11 = false;
            } else {
                z11 = true;
            }
            xkk1Var2 = xei0Var.e;
            if (xkk1Var2 != null || (mq70Var = xkk1Var2.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) {
                mgo0Var2 = mgo0Var;
            } else {
                mgo0Var2 = up70VarA.a.a;
            }
            if (mgo0Var2 == null) {
                mgo0Var2 = "";
            }
            hzyVar = xei0Var.k;
            if (hzyVar != null) {
                i = hzyVar.a;
            } else {
                i = 0;
            }
            if (jo70Var != null) {
                if (i != 0) {
                    iC = l1d.C(i);
                    if (iC == 3) {
                        mgo0VarZ = wgo1.z(mgo0Var2, jo70Var);
                    } else if (iC != 6) {
                        mgo0Var3 = mgo0Var;
                    } else {
                        mgo0VarZ = wgo1.r(mgo0Var2, jo70Var);
                    }
                } else {
                    mgo0VarZ = wgo1.z(mgo0Var2, jo70Var);
                    if (mgo0VarZ == null) {
                        mgo0VarZ = wgo1.r(mgo0Var2, jo70Var);
                    }
                }
                mgo0Var3 = mgo0VarZ;
            } else {
                mgo0Var3 = mgo0Var;
            }
            if (z11) {
                strConcat = ihc1.Y0(str5, '?').concat("?feature=mvcdp");
            } else {
                strConcat = str5;
            }
            String str7 = mey0Var.c;
            boolean z37 = t810Var.g;
            boolean z38 = t810Var.h;
            String str8 = strConcat;
            boolean z39 = t810Var.i;
            if (z6) {
                pm0Var = new pm0(vu30Var, (byte) 5);
            } else {
                pm0Var = mgo0Var;
            }
            boolean z40 = t810Var.s;
            if (z11) {
                g371Var = new g371(Collections.singletonList(gan0.a));
            } else {
                g371Var = new g371();
            }
            wcm wcmVarP = bpo1.p(str7, null, z37, z38, z39, false, null, pm0Var, mgo0Var31, z40, iu30Var, z11, mgo0Var3, g371Var, 398);
            boolean zN = rwq.n(mey0Var, dr00Var);
            if (zG || jo70Var == null || (io70Var3 = jo70Var.e) == null) {
                mgo0Var4 = mgo0Var29;
            } else {
                mgo0Var4 = io70Var3.b;
            }
            if (z32 || z11) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12 || (l1zVar != null && l1zVar.e)) {
                z13 = true;
            } else {
                z13 = false;
            }
            mgo0Var5 = mgo0Var29;
            if (!zG || u890.j(mgo0Var28, mgo0Var5)) {
                mgo0Var6 = mgo0Var;
            } else {
                mgo0Var6 = mgo0Var28;
            }
            if (z29 || !(dr00Var instanceof cr00)) {
                z14 = false;
            } else {
                z14 = true;
            }
            String str9 = mey0Var.b;
            String str10 = mey0Var.a;
            if (yo60Var != null) {
                hwt hwtVar4 = t810Var.c;
                String str11 = mey0Var.c;
                if (prlVar != null) {
                    mgo0Var26 = prlVar.c;
                } else {
                    mgo0Var26 = mgo0Var;
                }
                lsm0VarR = bwp0.r(yo60Var, str11, str11, z8, hwtVar4, false, mgo0Var26);
            } else {
                ubw0.a.getClass();
                lsm0VarR = rbw0.b;
            }
            lsm0 lsm0Var = lsm0VarR;
            boolean z41 = dr00Var instanceof dr00;
            long j5 = (z41 ? !z14 : !z6) ? 0L : 1000L;
            if (t810Var.u) {
                mgo0Var7 = 3000L;
            } else {
                mgo0Var7 = mgo0Var;
            }
            boolean z42 = !t810Var.t;
            if (jo70Var != null || (io70Var2 = jo70Var.e) == null) {
                mgo0Var8 = mgo0Var;
            } else {
                mgo0Var8 = io70Var2.b;
            }
            if (zG) {
                mgo0Var9 = mgo0Var8;
            } else {
                mgo0Var9 = mgo0Var;
            }
            z15 = z6;
            sbw0 sbw0Var = new sbw0(str9, str10, "", lsm0Var, j5, z15, z14, z32, z42, mgo0Var9, mgo0Var7);
            z16 = z12;
            String str12 = mey0Var.a;
            String str13 = mey0Var.c;
            if (zG) {
                mgo0Var10 = mgo0Var28;
            } else {
                mgo0Var10 = mgo0Var;
            }
            boolean zS = p2o1.s(zkmVar, mgo0Var4);
            boolean zV = p2o1.v(zkmVar, mgo0Var4);
            mgo0Var11 = mgo0Var4;
            boolean zV2 = upo1.v(t810Var, str6);
            if (z) {
                c5v0Var = new c5v0(duration3.p() * 1000, Long.valueOf(j4), str6);
            } else {
                c5v0Var = mgo0Var;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
                if (z11) {
                    mgo0VarA = fiv0Var.a(jLongValue);
                } else {
                    mgo0VarA = ((DateFormat) fiv0Var.c.getValue()).format(Long.valueOf(jLongValue));
                }
                mgo0Var12 = mgo0VarA;
            } else {
                mgo0Var12 = mgo0Var;
            }
            if (z11) {
                mgo0Var13 = iiv0.a;
                j = 1000;
            } else {
                j = 1000;
                mgo0Var13 = mgo0Var;
            }
            if (z28 && mgo0Var27 != null && (!z41 || z27)) {
                mgo0VarV = bpo1.v(mgo0Var27);
            } else {
                mgo0VarV = mgo0Var;
            }
            k4m k4mVarF = upo1.F(i3);
            j2 = j;
            if (e2k1Var != null) {
                mgo0VarValueOf = Long.valueOf(e2k1Var.a);
            } else {
                mgo0VarValueOf = mgo0Var;
            }
            mgo0 mgo0Var32 = mgo0VarV;
            mgo0VarJ = e6p1.j(mgo0VarValueOf, Long.valueOf(j4), yqgVar.b());
            if (z3) {
                mgo0Var14 = mgo0Var;
            } else {
                mgo0Var14 = mgo0VarJ;
            }
            boolean z43 = dr00Var instanceof cr00;
            boolean z44 = t810Var.g;
            boolean z45 = t810Var.m;
            if (y2u0Var != 0) {
                er00Var = dr00Var;
                if (!y2u0Var.c && z41) {
                    z17 = true;
                }
                z18 = t810Var.r;
                boolean z46 = !z16;
                if (rle1Var != null) {
                    mgo0Var15 = rle1Var.a;
                } else {
                    mgo0Var15 = mgo0Var;
                }
                if (rle1Var != null) {
                    mgo0Var16 = rle1Var.b;
                    mgo0VarY0 = mgo0Var30;
                } else {
                    mgo0VarY0 = mgo0Var30;
                    mgo0Var16 = mgo0Var;
                }
                Float fG = fj30.G(gix0Var);
                if (str != null) {
                    z19 = z18;
                    str4 = str;
                    mgo0VarF = f4i1.f(mgo0Var31, " - ", str4);
                } else {
                    z19 = z18;
                    str4 = str;
                    if (z34) {
                        mgo0VarF = mgo0Var31;
                    } else {
                        mgo0VarF = mgo0Var;
                    }
                }
                arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    if (str4 != null && !z34) {
                        mgo0Var17 = mgo0Var;
                    }
                    if (str4 != null || z34) {
                        mgo0Var18 = mgo0Var;
                    } else {
                        if (jo70Var == null || (mgo0Var25 = jo70Var.b) == null) {
                            mgo0Var25 = nbw0Var.b;
                        } else {
                            if (ihc1.y0(mgo0Var25)) {
                                mgo0Var25 = mgo0Var;
                            }
                            if (mgo0Var25 == null) {
                                mgo0Var25 = nbw0Var.b;
                            }
                        }
                        mgo0Var18 = mgo0Var25;
                    }
                    z20 = z8;
                    lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z41, k4mVarF, wcmVarP, null, mgo0Var14, z43, false, z44, z45, z20, false, z41, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z46, z11, mgo0Var16, fG, 35072);
                    z21 = z11;
                    if (z32) {
                        String str14 = mey0Var.a;
                        String str15 = mey0Var.c;
                        gab0 gab0Var = nbw0Var.m;
                        String str16 = gab0Var.a;
                        String str17 = gab0Var.b;
                        if (!z5 || z30) {
                            lfi0Var = lfi0VarR;
                            hwtVar = hwtVar2;
                        } else {
                            if (!z41 || hwtVar2 == 0) {
                                lfi0Var = lfi0VarR;
                                hwtVar = hwtVar2;
                            } else {
                                hwtVar = hwtVar2;
                                lfi0Var = lfi0VarR;
                                if (hwtVar.d) {
                                }
                                if (hwtVar != null) {
                                    z26 = hwtVar.d;
                                } else {
                                    z26 = true;
                                }
                                mgo0VarU = bpo1.u(136, str14, str15, str16, null, str17, null, z26, z25, z20, z5);
                            }
                            z25 = true;
                            if (hwtVar != null) {
                                z26 = hwtVar.d;
                            } else {
                                z26 = true;
                            }
                            mgo0VarU = bpo1.u(136, str14, str15, str16, null, str17, null, z26, z25, z20, z5);
                        }
                        z25 = false;
                        if (hwtVar != null) {
                            z26 = hwtVar.d;
                        } else {
                            z26 = true;
                        }
                        mgo0VarU = bpo1.u(136, str14, str15, str16, null, str17, null, z26, z25, z20, z5);
                    } else {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        mgo0VarU = mgo0Var;
                    }
                    mgo0Var19 = mey0Var.c;
                    if (zG) {
                        mgo0Var20 = mgo0Var6;
                    }
                    if (zG) {
                        mgo0Var20 = mgo0Var28;
                        mgo0Var21 = mgo0Var11;
                    } else if (mgo0Var6 != null) {
                        mgo0Var21 = mgo0Var19;
                    } else {
                        mgo0Var21 = mgo0Var;
                    }
                    set0 set0VarS = bpo1.s(mgo0Var19, w281Var, z41, null, zN, mgo0Var20, mgo0Var21, zG, z13);
                    uho uhoVarQ = bpo1.q(str6, mgo0Var5, mgo0Var31);
                    if (z21) {
                        String str18 = mey0Var.c;
                        long j6 = j4 / j2;
                        if (z29) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        uiv0Var = new uiv0(2, j6, str18, i2);
                    } else {
                        uiv0Var = mgo0Var;
                    }
                    if (yo60Var != null) {
                        myp0 myp0Var = yo60Var.d;
                        duration = myp0Var.b;
                        duration2 = myp0Var.a;
                        if (hwtVar == null && hwtVar.d) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        String str19 = mey0Var.c;
                        timeUnit = TimeUnit.SECONDS;
                        if (!zG && t810Var.n) {
                            r9g1Var = new t9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), (jo70Var == null || (io70Var = jo70Var.e) == null) ? str5 : io70Var.b);
                        } else if (z15) {
                            r9g1Var = s9g1.a;
                        } else {
                            r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                        }
                        m9g1Var = new m9g1(str19, z24, r9g1Var, new w8g1(), t810Var.g);
                    } else {
                        m9g1Var = mgo0Var;
                    }
                    if (z16) {
                        if (z20) {
                            jP = duration3.p();
                        } else {
                            jP = yo60Var.f.p();
                        }
                        j3 = jP * j2;
                    } else {
                        j3 = -1;
                    }
                    long j7 = j3;
                    boolean z47 = t810Var.g;
                    boolean z48 = t810Var.k;
                    if (yo60Var != null) {
                        zA = er00Var.a();
                        Set set2 = s4b1.f;
                        if (uic.g(mgo0Var5, blc0.ed)) {
                            if (yo60Var.d.b.p() < yo60Var.g.p()) {
                                zA = true;
                            } else {
                                zA = false;
                            }
                        }
                        if (zA) {
                            z22 = true;
                            if (z15) {
                                mgo0Var24 = mgo0Var;
                            } else if (!z2 || zN) {
                                mgo0Var24 = 2131959807;
                            } else {
                                mgo0Var24 = 2131963836;
                            }
                        } else {
                            mgo0Var24 = mgo0Var;
                            z22 = true;
                        }
                        mgo0Var22 = mgo0Var24;
                    } else {
                        z22 = true;
                        mgo0Var22 = mgo0Var;
                    }
                    if (z10 || !upo1.B(hwtVar)) {
                        z23 = false;
                    } else {
                        z23 = z22;
                    }
                    if (z28 && (!z41 || z27)) {
                        mgo0Var23 = mgo0Var27;
                    } else {
                        mgo0Var23 = mgo0Var;
                    }
                    return new hob1(str12, str13, mgo0Var11, str8, tylVar.b, zV, zS, er00Var, zV2, mgo0Var32, lfi0Var, mgo0VarU, (xfn0) null, set0VarS, wcmVarP, uhoVarQ, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var, j7, z47, z48, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
                }
                mgo0VarY0 = o7h.y0(o7h.O0(mgo0VarY0, arrayList3), ", ", (String) null, (String) null, (iu30) null, 62);
                mgo0Var17 = mgo0VarY0;
                if (str4 != null) {
                    mgo0Var18 = mgo0Var;
                } else {
                    mgo0Var18 = mgo0Var;
                }
                z20 = z8;
                lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z41, k4mVarF, wcmVarP, null, mgo0Var14, z43, false, z44, z45, z20, false, z41, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z46, z11, mgo0Var16, fG, 35072);
                z21 = z11;
                if (z32) {
                    String str110 = mey0Var.a;
                    String str111 = mey0Var.c;
                    gab0 gab0Var2 = nbw0Var.m;
                    String str112 = gab0Var2.a;
                    String str113 = gab0Var2.b;
                    if (z5) {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    } else {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    }
                    if (hwtVar != null) {
                        z26 = hwtVar.d;
                    } else {
                        z26 = true;
                    }
                    mgo0VarU = bpo1.u(136, str110, str111, str112, null, str113, null, z26, z25, z20, z5);
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    mgo0VarU = mgo0Var;
                }
                mgo0Var19 = mey0Var.c;
                if (zG) {
                    mgo0Var20 = mgo0Var6;
                }
                if (zG) {
                    mgo0Var20 = mgo0Var28;
                    mgo0Var21 = mgo0Var11;
                } else if (mgo0Var6 != null) {
                    mgo0Var21 = mgo0Var19;
                } else {
                    mgo0Var21 = mgo0Var;
                }
                set0 set0VarS2 = bpo1.s(mgo0Var19, w281Var, z41, null, zN, mgo0Var20, mgo0Var21, zG, z13);
                uho uhoVarQ2 = bpo1.q(str6, mgo0Var5, mgo0Var31);
                if (z21) {
                    String str114 = mey0Var.c;
                    long j8 = j4 / j2;
                    if (z29) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    uiv0Var = new uiv0(2, j8, str114, i2);
                } else {
                    uiv0Var = mgo0Var;
                }
                if (yo60Var != null) {
                    myp0 myp0Var2 = yo60Var.d;
                    duration = myp0Var2.b;
                    duration2 = myp0Var2.a;
                    if (hwtVar == null) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    String str115 = mey0Var.c;
                    timeUnit = TimeUnit.SECONDS;
                    if (!zG) {
                        if (z15) {
                            r9g1Var = s9g1.a;
                        } else {
                            r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                        }
                    } else if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                    m9g1Var = new m9g1(str115, z24, r9g1Var, new w8g1(), t810Var.g);
                } else {
                    m9g1Var = mgo0Var;
                }
                if (z16) {
                    j3 = -1;
                } else {
                    if (z20) {
                        jP = duration3.p();
                    } else {
                        jP = yo60Var.f.p();
                    }
                    j3 = jP * j2;
                }
                long j9 = j3;
                boolean z49 = t810Var.g;
                boolean z410 = t810Var.k;
                if (yo60Var != null) {
                    zA = er00Var.a();
                    Set set3 = s4b1.f;
                    if (uic.g(mgo0Var5, blc0.ed)) {
                        if (yo60Var.d.b.p() < yo60Var.g.p()) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                    if (zA) {
                        mgo0Var24 = mgo0Var;
                        z22 = true;
                    } else {
                        z22 = true;
                        if (z15) {
                            mgo0Var24 = mgo0Var;
                        } else if (!z2) {
                            mgo0Var24 = 2131959807;
                        } else {
                            mgo0Var24 = 2131959807;
                        }
                    }
                    mgo0Var22 = mgo0Var24;
                } else {
                    z22 = true;
                    mgo0Var22 = mgo0Var;
                }
                if (z10) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                if (z28) {
                    mgo0Var23 = mgo0Var;
                } else {
                    mgo0Var23 = mgo0Var27;
                }
                return new hob1(str12, str13, mgo0Var11, str8, tylVar.b, zV, zS, er00Var, zV2, mgo0Var32, lfi0Var, mgo0VarU, (xfn0) null, set0VarS2, wcmVarP, uhoVarQ2, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var, j9, z49, z410, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
            }
            er00Var = dr00Var;
            z17 = false;
            z18 = t810Var.r;
            boolean z411 = !z16;
            if (rle1Var != null) {
                mgo0Var15 = rle1Var.a;
            } else {
                mgo0Var15 = mgo0Var;
            }
            if (rle1Var != null) {
                mgo0Var16 = rle1Var.b;
                mgo0VarY0 = mgo0Var30;
            } else {
                mgo0VarY0 = mgo0Var30;
                mgo0Var16 = mgo0Var;
            }
            Float fG2 = fj30.G(gix0Var);
            if (str != null) {
                z19 = z18;
                str4 = str;
                mgo0VarF = f4i1.f(mgo0Var31, " - ", str4);
            } else {
                z19 = z18;
                str4 = str;
                if (z34) {
                    mgo0VarF = mgo0Var31;
                } else {
                    mgo0VarF = mgo0Var;
                }
            }
            arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                if (str4 != null) {
                }
                if (str4 != null) {
                    mgo0Var18 = mgo0Var;
                } else {
                    mgo0Var18 = mgo0Var;
                }
                z20 = z8;
                lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z41, k4mVarF, wcmVarP, null, mgo0Var14, z43, false, z44, z45, z20, false, z41, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z411, z11, mgo0Var16, fG2, 35072);
                z21 = z11;
                if (z32) {
                    String str116 = mey0Var.a;
                    String str117 = mey0Var.c;
                    gab0 gab0Var3 = nbw0Var.m;
                    String str118 = gab0Var3.a;
                    String str119 = gab0Var3.b;
                    if (z5) {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    } else {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    }
                    if (hwtVar != null) {
                        z26 = hwtVar.d;
                    } else {
                        z26 = true;
                    }
                    mgo0VarU = bpo1.u(136, str116, str117, str118, null, str119, null, z26, z25, z20, z5);
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    mgo0VarU = mgo0Var;
                }
                mgo0Var19 = mey0Var.c;
                if (zG) {
                    mgo0Var20 = mgo0Var6;
                }
                if (zG) {
                    mgo0Var20 = mgo0Var28;
                    mgo0Var21 = mgo0Var11;
                } else if (mgo0Var6 != null) {
                    mgo0Var21 = mgo0Var19;
                } else {
                    mgo0Var21 = mgo0Var;
                }
                set0 set0VarS3 = bpo1.s(mgo0Var19, w281Var, z41, null, zN, mgo0Var20, mgo0Var21, zG, z13);
                uho uhoVarQ3 = bpo1.q(str6, mgo0Var5, mgo0Var31);
                if (z21) {
                    String str1110 = mey0Var.c;
                    long j10 = j4 / j2;
                    if (z29) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    uiv0Var = new uiv0(2, j10, str1110, i2);
                } else {
                    uiv0Var = mgo0Var;
                }
                if (yo60Var != null) {
                    myp0 myp0Var3 = yo60Var.d;
                    duration = myp0Var3.b;
                    duration2 = myp0Var3.a;
                    if (hwtVar == null) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    String str1111 = mey0Var.c;
                    timeUnit = TimeUnit.SECONDS;
                    if (!zG) {
                        if (z15) {
                            r9g1Var = s9g1.a;
                        } else {
                            r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                        }
                    } else if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                    m9g1Var = new m9g1(str1111, z24, r9g1Var, new w8g1(), t810Var.g);
                } else {
                    m9g1Var = mgo0Var;
                }
                if (z16) {
                    j3 = -1;
                } else {
                    if (z20) {
                        jP = duration3.p();
                    } else {
                        jP = yo60Var.f.p();
                    }
                    j3 = jP * j2;
                }
                long j11 = j3;
                boolean z412 = t810Var.g;
                boolean z413 = t810Var.k;
                if (yo60Var != null) {
                    zA = er00Var.a();
                    Set set4 = s4b1.f;
                    if (uic.g(mgo0Var5, blc0.ed)) {
                        if (yo60Var.d.b.p() < yo60Var.g.p()) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                    if (zA) {
                        mgo0Var24 = mgo0Var;
                        z22 = true;
                    } else {
                        z22 = true;
                        if (z15) {
                            mgo0Var24 = mgo0Var;
                        } else if (!z2) {
                            mgo0Var24 = 2131959807;
                        } else {
                            mgo0Var24 = 2131959807;
                        }
                    }
                    mgo0Var22 = mgo0Var24;
                } else {
                    z22 = true;
                    mgo0Var22 = mgo0Var;
                }
                if (z10) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                if (z28) {
                    mgo0Var23 = mgo0Var;
                } else {
                    mgo0Var23 = mgo0Var27;
                }
                return new hob1(str12, str13, mgo0Var11, str8, tylVar.b, zV, zS, er00Var, zV2, mgo0Var32, lfi0Var, mgo0VarU, (xfn0) null, set0VarS3, wcmVarP, uhoVarQ3, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var, j11, z412, z413, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
            }
            mgo0VarY0 = o7h.y0(o7h.O0(mgo0VarY0, arrayList3), ", ", (String) null, (String) null, (iu30) null, 62);
            mgo0Var17 = mgo0VarY0;
            if (str4 != null) {
                mgo0Var18 = mgo0Var;
            } else {
                mgo0Var18 = mgo0Var;
            }
            z20 = z8;
            lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z41, k4mVarF, wcmVarP, null, mgo0Var14, z43, false, z44, z45, z20, false, z41, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z411, z11, mgo0Var16, fG2, 35072);
            z21 = z11;
            if (z32) {
                String str1112 = mey0Var.a;
                String str1113 = mey0Var.c;
                gab0 gab0Var4 = nbw0Var.m;
                String str1114 = gab0Var4.a;
                String str1115 = gab0Var4.b;
                if (z5) {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                }
                if (hwtVar != null) {
                    z26 = hwtVar.d;
                } else {
                    z26 = true;
                }
                mgo0VarU = bpo1.u(136, str1112, str1113, str1114, null, str1115, null, z26, z25, z20, z5);
            } else {
                lfi0Var = lfi0VarR;
                hwtVar = hwtVar2;
                mgo0VarU = mgo0Var;
            }
            mgo0Var19 = mey0Var.c;
            if (zG) {
                mgo0Var20 = mgo0Var6;
            }
            if (zG) {
                mgo0Var20 = mgo0Var28;
                mgo0Var21 = mgo0Var11;
            } else if (mgo0Var6 != null) {
                mgo0Var21 = mgo0Var19;
            } else {
                mgo0Var21 = mgo0Var;
            }
            set0 set0VarS4 = bpo1.s(mgo0Var19, w281Var, z41, null, zN, mgo0Var20, mgo0Var21, zG, z13);
            uho uhoVarQ4 = bpo1.q(str6, mgo0Var5, mgo0Var31);
            if (z21) {
                String str1116 = mey0Var.c;
                long j12 = j4 / j2;
                if (z29) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                uiv0Var = new uiv0(2, j12, str1116, i2);
            } else {
                uiv0Var = mgo0Var;
            }
            if (yo60Var != null) {
                myp0 myp0Var4 = yo60Var.d;
                duration = myp0Var4.b;
                duration2 = myp0Var4.a;
                if (hwtVar == null) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                String str1117 = mey0Var.c;
                timeUnit = TimeUnit.SECONDS;
                if (!zG) {
                    if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                } else if (z15) {
                    r9g1Var = s9g1.a;
                } else {
                    r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                }
                m9g1Var = new m9g1(str1117, z24, r9g1Var, new w8g1(), t810Var.g);
            } else {
                m9g1Var = mgo0Var;
            }
            if (z16) {
                j3 = -1;
            } else {
                if (z20) {
                    jP = duration3.p();
                } else {
                    jP = yo60Var.f.p();
                }
                j3 = jP * j2;
            }
            long j13 = j3;
            boolean z414 = t810Var.g;
            boolean z415 = t810Var.k;
            if (yo60Var != null) {
                zA = er00Var.a();
                Set set5 = s4b1.f;
                if (uic.g(mgo0Var5, blc0.ed)) {
                    if (yo60Var.d.b.p() < yo60Var.g.p()) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                }
                if (zA) {
                    mgo0Var24 = mgo0Var;
                    z22 = true;
                } else {
                    z22 = true;
                    if (z15) {
                        mgo0Var24 = mgo0Var;
                    } else if (!z2) {
                        mgo0Var24 = 2131959807;
                    } else {
                        mgo0Var24 = 2131959807;
                    }
                }
                mgo0Var22 = mgo0Var24;
            } else {
                z22 = true;
                mgo0Var22 = mgo0Var;
            }
            if (z10) {
                z23 = false;
            } else {
                z23 = false;
            }
            if (z28) {
                mgo0Var23 = mgo0Var;
            } else {
                mgo0Var23 = mgo0Var27;
            }
            return new hob1(str12, str13, mgo0Var11, str8, tylVar.b, zV, zS, er00Var, zV2, mgo0Var32, lfi0Var, mgo0VarU, (xfn0) null, set0VarS4, wcmVarP, uhoVarQ4, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var, j13, z414, z415, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
        }
        z2 = z33;
        if (z2) {
            if (jo70Var == null || (list = jo70Var.d) == null) {
                arrayList = null;
            } else {
                List list2 = list;
                arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ho70) it.next()).a);
                }
            }
            if (arrayList == null) {
            }
            if (eqr0.z(mgo0Var29)) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (w281Var != null) {
                str2 = null;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            r4p1VarH = fza.h(nbw0Var2.j);
            if (yo60Var2 != null) {
                q8i0 q8i0VarA2 = kno1.A(yo60Var2, null);
                hwt hwtVar5 = t810Var.c;
                if (y2u0Var != null) {
                    arrayList2 = arrayList;
                    if (y2u0Var.c) {
                    }
                    dr00Var = upo1.G(q8i0VarA2, nbw0Var2, yo60Var2, xkk1Var3, str3, r4p1VarH, hwtVar5, z36, 64);
                    nbw0Var = nbw0Var2;
                    yo60Var = yo60Var2;
                    xkk1Var = xkk1Var3;
                } else {
                    arrayList2 = arrayList;
                }
                dr00Var = upo1.G(q8i0VarA2, nbw0Var2, yo60Var2, xkk1Var3, str3, r4p1VarH, hwtVar5, z36, 64);
                nbw0Var = nbw0Var2;
                yo60Var = yo60Var2;
                xkk1Var = xkk1Var3;
            } else {
                arrayList2 = arrayList;
                nbw0Var = nbw0Var2;
                yo60Var = yo60Var2;
                xkk1Var = xkk1Var3;
                dr00Var = new dr00(false, upo1.F(i3), false, o2p1.k(xkk1Var, vp70.d, nbw0Var.g));
            }
            if (z32) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (iix0Var instanceof gix0) {
                gix0Var = (gix0) iix0Var;
            } else {
                gix0Var = null;
            }
            if (gix0Var != null) {
                gix0Var = null;
            } else {
                gix0Var = null;
            }
            if (gix0Var == null) {
                mgo0Var = null;
                rle1Var = null;
            } else {
                if (resources == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                ogv ogvVar2 = new ogv(resources, (byte) 0);
                ytw0 ytw0Var2 = jfv.b;
                rle1Var = (rle1) ogvVar2.invoke(new jfv(fdg1.l0(gix0Var.b - gix0Var.c, ngv.d)));
                mgo0Var = null;
            }
            if (z4) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (!z4) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z6) {
                z8 = true;
            } else {
                z8 = true;
            }
            if (z8) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (z8) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (eqr0.A(mgo0Var29)) {
                z11 = false;
            } else {
                z11 = false;
            }
            xkk1Var2 = xei0Var.e;
            if (xkk1Var2 != null) {
                mgo0Var2 = mgo0Var;
            } else {
                mgo0Var2 = mgo0Var;
            }
            if (mgo0Var2 == null) {
                mgo0Var2 = "";
            }
            hzyVar = xei0Var.k;
            if (hzyVar != null) {
                i = hzyVar.a;
            } else {
                i = 0;
            }
            if (jo70Var != null) {
                if (i != 0) {
                    iC = l1d.C(i);
                    if (iC == 3) {
                        mgo0VarZ = wgo1.z(mgo0Var2, jo70Var);
                    } else if (iC != 6) {
                        mgo0Var3 = mgo0Var;
                    } else {
                        mgo0VarZ = wgo1.r(mgo0Var2, jo70Var);
                    }
                } else {
                    mgo0VarZ = wgo1.z(mgo0Var2, jo70Var);
                    if (mgo0VarZ == null) {
                        mgo0VarZ = wgo1.r(mgo0Var2, jo70Var);
                    }
                }
                mgo0Var3 = mgo0VarZ;
            } else {
                mgo0Var3 = mgo0Var;
            }
            if (z11) {
                strConcat = ihc1.Y0(str5, '?').concat("?feature=mvcdp");
            } else {
                strConcat = str5;
            }
            String str20 = mey0Var.c;
            boolean z310 = t810Var.g;
            boolean z311 = t810Var.h;
            String str21 = strConcat;
            boolean z312 = t810Var.i;
            if (z6) {
                pm0Var = new pm0(vu30Var, (byte) 5);
            } else {
                pm0Var = mgo0Var;
            }
            boolean z416 = t810Var.s;
            if (z11) {
                g371Var = new g371(Collections.singletonList(gan0.a));
            } else {
                g371Var = new g371();
            }
            wcm wcmVarP2 = bpo1.p(str20, null, z310, z311, z312, false, null, pm0Var, mgo0Var31, z416, iu30Var, z11, mgo0Var3, g371Var, 398);
            boolean zN2 = rwq.n(mey0Var, dr00Var);
            if (zG) {
                mgo0Var4 = mgo0Var29;
            } else {
                mgo0Var4 = mgo0Var29;
            }
            if (z32) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z12) {
                z13 = true;
            } else {
                z13 = true;
            }
            mgo0Var5 = mgo0Var29;
            if (zG) {
                mgo0Var6 = mgo0Var;
            } else {
                mgo0Var6 = mgo0Var;
            }
            if (z29) {
                z14 = false;
            } else {
                z14 = false;
            }
            String str22 = mey0Var.b;
            String str120 = mey0Var.a;
            if (yo60Var != null) {
                hwt hwtVar6 = t810Var.c;
                String str121 = mey0Var.c;
                if (prlVar != null) {
                    mgo0Var26 = prlVar.c;
                } else {
                    mgo0Var26 = mgo0Var;
                }
                lsm0VarR = bwp0.r(yo60Var, str121, str121, z8, hwtVar6, false, mgo0Var26);
            } else {
                ubw0.a.getClass();
                lsm0VarR = rbw0.b;
            }
            lsm0 lsm0Var2 = lsm0VarR;
            boolean z417 = dr00Var instanceof dr00;
            if (z417) {
            }
            if (t810Var.u) {
                mgo0Var7 = 3000L;
            } else {
                mgo0Var7 = mgo0Var;
            }
            boolean z418 = !t810Var.t;
            if (jo70Var != null) {
                mgo0Var8 = mgo0Var;
            } else {
                mgo0Var8 = mgo0Var;
            }
            if (zG) {
                mgo0Var9 = mgo0Var8;
            } else {
                mgo0Var9 = mgo0Var;
            }
            z15 = z6;
            sbw0 sbw0Var2 = new sbw0(str22, str120, "", lsm0Var2, j5, z15, z14, z32, z418, mgo0Var9, mgo0Var7);
            z16 = z12;
            String str122 = mey0Var.a;
            String str123 = mey0Var.c;
            if (zG) {
                mgo0Var10 = mgo0Var28;
            } else {
                mgo0Var10 = mgo0Var;
            }
            boolean zS2 = p2o1.s(zkmVar, mgo0Var4);
            boolean zV3 = p2o1.v(zkmVar, mgo0Var4);
            mgo0Var11 = mgo0Var4;
            boolean zV4 = upo1.v(t810Var, str6);
            if (z) {
                c5v0Var = new c5v0(duration3.p() * 1000, Long.valueOf(j4), str6);
            } else {
                c5v0Var = mgo0Var;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
                if (z11) {
                    mgo0VarA = fiv0Var.a(jLongValue);
                } else {
                    mgo0VarA = ((DateFormat) fiv0Var.c.getValue()).format(Long.valueOf(jLongValue));
                }
                mgo0Var12 = mgo0VarA;
            } else {
                mgo0Var12 = mgo0Var;
            }
            if (z11) {
                mgo0Var13 = iiv0.a;
                j = 1000;
            } else {
                j = 1000;
                mgo0Var13 = mgo0Var;
            }
            if (z28) {
                mgo0VarV = mgo0Var;
            } else {
                mgo0VarV = bpo1.v(mgo0Var27);
            }
            k4m k4mVarF2 = upo1.F(i3);
            j2 = j;
            if (e2k1Var != null) {
                mgo0VarValueOf = Long.valueOf(e2k1Var.a);
            } else {
                mgo0VarValueOf = mgo0Var;
            }
            mgo0 mgo0Var33 = mgo0VarV;
            mgo0VarJ = e6p1.j(mgo0VarValueOf, Long.valueOf(j4), yqgVar.b());
            if (z3) {
                mgo0Var14 = mgo0VarJ;
            } else {
                mgo0Var14 = mgo0Var;
            }
            boolean z419 = dr00Var instanceof cr00;
            boolean z420 = t810Var.g;
            boolean z421 = t810Var.m;
            if (y2u0Var != 0) {
                er00Var = dr00Var;
                if (!y2u0Var.c) {
                }
                z18 = t810Var.r;
                boolean z4110 = !z16;
                if (rle1Var != null) {
                    mgo0Var15 = rle1Var.a;
                } else {
                    mgo0Var15 = mgo0Var;
                }
                if (rle1Var != null) {
                    mgo0Var16 = rle1Var.b;
                    mgo0VarY0 = mgo0Var30;
                } else {
                    mgo0VarY0 = mgo0Var30;
                    mgo0Var16 = mgo0Var;
                }
                Float fG3 = fj30.G(gix0Var);
                if (str != null) {
                    z19 = z18;
                    str4 = str;
                    mgo0VarF = f4i1.f(mgo0Var31, " - ", str4);
                } else {
                    z19 = z18;
                    str4 = str;
                    if (z34) {
                        mgo0VarF = mgo0Var31;
                    } else {
                        mgo0VarF = mgo0Var;
                    }
                }
                arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    if (str4 != null) {
                    }
                    if (str4 != null) {
                        mgo0Var18 = mgo0Var;
                    } else {
                        mgo0Var18 = mgo0Var;
                    }
                    z20 = z8;
                    lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z417, k4mVarF2, wcmVarP2, null, mgo0Var14, z419, false, z420, z421, z20, false, z417, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z4110, z11, mgo0Var16, fG3, 35072);
                    z21 = z11;
                    if (z32) {
                        String str1118 = mey0Var.a;
                        String str1119 = mey0Var.c;
                        gab0 gab0Var5 = nbw0Var.m;
                        String str11110 = gab0Var5.a;
                        String str11111 = gab0Var5.b;
                        if (z5) {
                            lfi0Var = lfi0VarR;
                            hwtVar = hwtVar2;
                            z25 = false;
                        } else {
                            lfi0Var = lfi0VarR;
                            hwtVar = hwtVar2;
                            z25 = false;
                        }
                        if (hwtVar != null) {
                            z26 = hwtVar.d;
                        } else {
                            z26 = true;
                        }
                        mgo0VarU = bpo1.u(136, str1118, str1119, str11110, null, str11111, null, z26, z25, z20, z5);
                    } else {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        mgo0VarU = mgo0Var;
                    }
                    mgo0Var19 = mey0Var.c;
                    if (zG) {
                        mgo0Var20 = mgo0Var6;
                    }
                    if (zG) {
                        mgo0Var20 = mgo0Var28;
                        mgo0Var21 = mgo0Var11;
                    } else if (mgo0Var6 != null) {
                        mgo0Var21 = mgo0Var19;
                    } else {
                        mgo0Var21 = mgo0Var;
                    }
                    set0 set0VarS5 = bpo1.s(mgo0Var19, w281Var, z417, null, zN2, mgo0Var20, mgo0Var21, zG, z13);
                    uho uhoVarQ5 = bpo1.q(str6, mgo0Var5, mgo0Var31);
                    if (z21) {
                        String str11112 = mey0Var.c;
                        long j14 = j4 / j2;
                        if (z29) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        uiv0Var = new uiv0(2, j14, str11112, i2);
                    } else {
                        uiv0Var = mgo0Var;
                    }
                    if (yo60Var != null) {
                        myp0 myp0Var5 = yo60Var.d;
                        duration = myp0Var5.b;
                        duration2 = myp0Var5.a;
                        if (hwtVar == null) {
                            z24 = false;
                        } else {
                            z24 = false;
                        }
                        String str11113 = mey0Var.c;
                        timeUnit = TimeUnit.SECONDS;
                        if (!zG) {
                            if (z15) {
                                r9g1Var = s9g1.a;
                            } else {
                                r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                            }
                        } else if (z15) {
                            r9g1Var = s9g1.a;
                        } else {
                            r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                        }
                        m9g1Var = new m9g1(str11113, z24, r9g1Var, new w8g1(), t810Var.g);
                    } else {
                        m9g1Var = mgo0Var;
                    }
                    if (z16) {
                        j3 = -1;
                    } else {
                        if (z20) {
                            jP = duration3.p();
                        } else {
                            jP = yo60Var.f.p();
                        }
                        j3 = jP * j2;
                    }
                    long j15 = j3;
                    boolean z4111 = t810Var.g;
                    boolean z4112 = t810Var.k;
                    if (yo60Var != null) {
                        zA = er00Var.a();
                        Set set6 = s4b1.f;
                        if (uic.g(mgo0Var5, blc0.ed)) {
                            if (yo60Var.d.b.p() < yo60Var.g.p()) {
                                zA = true;
                            } else {
                                zA = false;
                            }
                        }
                        if (zA) {
                            mgo0Var24 = mgo0Var;
                            z22 = true;
                        } else {
                            z22 = true;
                            if (z15) {
                                mgo0Var24 = mgo0Var;
                            } else if (!z2) {
                                mgo0Var24 = 2131959807;
                            } else {
                                mgo0Var24 = 2131959807;
                            }
                        }
                        mgo0Var22 = mgo0Var24;
                    } else {
                        z22 = true;
                        mgo0Var22 = mgo0Var;
                    }
                    if (z10) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    if (z28) {
                        mgo0Var23 = mgo0Var;
                    } else {
                        mgo0Var23 = mgo0Var27;
                    }
                    return new hob1(str122, str123, mgo0Var11, str21, tylVar.b, zV3, zS2, er00Var, zV4, mgo0Var33, lfi0Var, mgo0VarU, (xfn0) null, set0VarS5, wcmVarP2, uhoVarQ5, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var2, j15, z4111, z4112, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
                }
                mgo0VarY0 = o7h.y0(o7h.O0(mgo0VarY0, arrayList3), ", ", (String) null, (String) null, (iu30) null, 62);
                mgo0Var17 = mgo0VarY0;
                if (str4 != null) {
                    mgo0Var18 = mgo0Var;
                } else {
                    mgo0Var18 = mgo0Var;
                }
                z20 = z8;
                lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z417, k4mVarF2, wcmVarP2, null, mgo0Var14, z419, false, z420, z421, z20, false, z417, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z4110, z11, mgo0Var16, fG3, 35072);
                z21 = z11;
                if (z32) {
                    String str11114 = mey0Var.a;
                    String str11115 = mey0Var.c;
                    gab0 gab0Var6 = nbw0Var.m;
                    String str11116 = gab0Var6.a;
                    String str11117 = gab0Var6.b;
                    if (z5) {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    } else {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    }
                    if (hwtVar != null) {
                        z26 = hwtVar.d;
                    } else {
                        z26 = true;
                    }
                    mgo0VarU = bpo1.u(136, str11114, str11115, str11116, null, str11117, null, z26, z25, z20, z5);
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    mgo0VarU = mgo0Var;
                }
                mgo0Var19 = mey0Var.c;
                if (zG) {
                    mgo0Var20 = mgo0Var6;
                }
                if (zG) {
                    mgo0Var20 = mgo0Var28;
                    mgo0Var21 = mgo0Var11;
                } else if (mgo0Var6 != null) {
                    mgo0Var21 = mgo0Var19;
                } else {
                    mgo0Var21 = mgo0Var;
                }
                set0 set0VarS6 = bpo1.s(mgo0Var19, w281Var, z417, null, zN2, mgo0Var20, mgo0Var21, zG, z13);
                uho uhoVarQ6 = bpo1.q(str6, mgo0Var5, mgo0Var31);
                if (z21) {
                    String str11118 = mey0Var.c;
                    long j16 = j4 / j2;
                    if (z29) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    uiv0Var = new uiv0(2, j16, str11118, i2);
                } else {
                    uiv0Var = mgo0Var;
                }
                if (yo60Var != null) {
                    myp0 myp0Var6 = yo60Var.d;
                    duration = myp0Var6.b;
                    duration2 = myp0Var6.a;
                    if (hwtVar == null) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    String str11119 = mey0Var.c;
                    timeUnit = TimeUnit.SECONDS;
                    if (!zG) {
                        if (z15) {
                            r9g1Var = s9g1.a;
                        } else {
                            r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                        }
                    } else if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                    m9g1Var = new m9g1(str11119, z24, r9g1Var, new w8g1(), t810Var.g);
                } else {
                    m9g1Var = mgo0Var;
                }
                if (z16) {
                    j3 = -1;
                } else {
                    if (z20) {
                        jP = duration3.p();
                    } else {
                        jP = yo60Var.f.p();
                    }
                    j3 = jP * j2;
                }
                long j17 = j3;
                boolean z4113 = t810Var.g;
                boolean z4114 = t810Var.k;
                if (yo60Var != null) {
                    zA = er00Var.a();
                    Set set7 = s4b1.f;
                    if (uic.g(mgo0Var5, blc0.ed)) {
                        if (yo60Var.d.b.p() < yo60Var.g.p()) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                    if (zA) {
                        mgo0Var24 = mgo0Var;
                        z22 = true;
                    } else {
                        z22 = true;
                        if (z15) {
                            mgo0Var24 = mgo0Var;
                        } else if (!z2) {
                            mgo0Var24 = 2131959807;
                        } else {
                            mgo0Var24 = 2131959807;
                        }
                    }
                    mgo0Var22 = mgo0Var24;
                } else {
                    z22 = true;
                    mgo0Var22 = mgo0Var;
                }
                if (z10) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                if (z28) {
                    mgo0Var23 = mgo0Var;
                } else {
                    mgo0Var23 = mgo0Var27;
                }
                return new hob1(str122, str123, mgo0Var11, str21, tylVar.b, zV3, zS2, er00Var, zV4, mgo0Var33, lfi0Var, mgo0VarU, (xfn0) null, set0VarS6, wcmVarP2, uhoVarQ6, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var2, j17, z4113, z4114, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
            }
            er00Var = dr00Var;
            z17 = false;
            z18 = t810Var.r;
            boolean z4115 = !z16;
            if (rle1Var != null) {
                mgo0Var15 = rle1Var.a;
            } else {
                mgo0Var15 = mgo0Var;
            }
            if (rle1Var != null) {
                mgo0Var16 = rle1Var.b;
                mgo0VarY0 = mgo0Var30;
            } else {
                mgo0VarY0 = mgo0Var30;
                mgo0Var16 = mgo0Var;
            }
            Float fG4 = fj30.G(gix0Var);
            if (str != null) {
                z19 = z18;
                str4 = str;
                mgo0VarF = f4i1.f(mgo0Var31, " - ", str4);
            } else {
                z19 = z18;
                str4 = str;
                if (z34) {
                    mgo0VarF = mgo0Var31;
                } else {
                    mgo0VarF = mgo0Var;
                }
            }
            arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                if (str4 != null) {
                }
                if (str4 != null) {
                    mgo0Var18 = mgo0Var;
                } else {
                    mgo0Var18 = mgo0Var;
                }
                z20 = z8;
                lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z417, k4mVarF2, wcmVarP2, null, mgo0Var14, z419, false, z420, z421, z20, false, z417, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z4115, z11, mgo0Var16, fG4, 35072);
                z21 = z11;
                if (z32) {
                    String str111110 = mey0Var.a;
                    String str111111 = mey0Var.c;
                    gab0 gab0Var7 = nbw0Var.m;
                    String str111112 = gab0Var7.a;
                    String str111113 = gab0Var7.b;
                    if (z5) {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    } else {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    }
                    if (hwtVar != null) {
                        z26 = hwtVar.d;
                    } else {
                        z26 = true;
                    }
                    mgo0VarU = bpo1.u(136, str111110, str111111, str111112, null, str111113, null, z26, z25, z20, z5);
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    mgo0VarU = mgo0Var;
                }
                mgo0Var19 = mey0Var.c;
                if (zG) {
                    mgo0Var20 = mgo0Var6;
                }
                if (zG) {
                    mgo0Var20 = mgo0Var28;
                    mgo0Var21 = mgo0Var11;
                } else if (mgo0Var6 != null) {
                    mgo0Var21 = mgo0Var19;
                } else {
                    mgo0Var21 = mgo0Var;
                }
                set0 set0VarS7 = bpo1.s(mgo0Var19, w281Var, z417, null, zN2, mgo0Var20, mgo0Var21, zG, z13);
                uho uhoVarQ7 = bpo1.q(str6, mgo0Var5, mgo0Var31);
                if (z21) {
                    String str111114 = mey0Var.c;
                    long j18 = j4 / j2;
                    if (z29) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    uiv0Var = new uiv0(2, j18, str111114, i2);
                } else {
                    uiv0Var = mgo0Var;
                }
                if (yo60Var != null) {
                    myp0 myp0Var7 = yo60Var.d;
                    duration = myp0Var7.b;
                    duration2 = myp0Var7.a;
                    if (hwtVar == null) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    String str111115 = mey0Var.c;
                    timeUnit = TimeUnit.SECONDS;
                    if (!zG) {
                        if (z15) {
                            r9g1Var = s9g1.a;
                        } else {
                            r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                        }
                    } else if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                    m9g1Var = new m9g1(str111115, z24, r9g1Var, new w8g1(), t810Var.g);
                } else {
                    m9g1Var = mgo0Var;
                }
                if (z16) {
                    j3 = -1;
                } else {
                    if (z20) {
                        jP = duration3.p();
                    } else {
                        jP = yo60Var.f.p();
                    }
                    j3 = jP * j2;
                }
                long j19 = j3;
                boolean z4116 = t810Var.g;
                boolean z4117 = t810Var.k;
                if (yo60Var != null) {
                    zA = er00Var.a();
                    Set set8 = s4b1.f;
                    if (uic.g(mgo0Var5, blc0.ed)) {
                        if (yo60Var.d.b.p() < yo60Var.g.p()) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                    if (zA) {
                        mgo0Var24 = mgo0Var;
                        z22 = true;
                    } else {
                        z22 = true;
                        if (z15) {
                            mgo0Var24 = mgo0Var;
                        } else if (!z2) {
                            mgo0Var24 = 2131959807;
                        } else {
                            mgo0Var24 = 2131959807;
                        }
                    }
                    mgo0Var22 = mgo0Var24;
                } else {
                    z22 = true;
                    mgo0Var22 = mgo0Var;
                }
                if (z10) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                if (z28) {
                    mgo0Var23 = mgo0Var;
                } else {
                    mgo0Var23 = mgo0Var27;
                }
                return new hob1(str122, str123, mgo0Var11, str21, tylVar.b, zV3, zS2, er00Var, zV4, mgo0Var33, lfi0Var, mgo0VarU, (xfn0) null, set0VarS7, wcmVarP2, uhoVarQ7, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var2, j19, z4116, z4117, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
            }
            mgo0VarY0 = o7h.y0(o7h.O0(mgo0VarY0, arrayList3), ", ", (String) null, (String) null, (iu30) null, 62);
            mgo0Var17 = mgo0VarY0;
            if (str4 != null) {
                mgo0Var18 = mgo0Var;
            } else {
                mgo0Var18 = mgo0Var;
            }
            z20 = z8;
            lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z417, k4mVarF2, wcmVarP2, null, mgo0Var14, z419, false, z420, z421, z20, false, z417, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z4115, z11, mgo0Var16, fG4, 35072);
            z21 = z11;
            if (z32) {
                String str111116 = mey0Var.a;
                String str111117 = mey0Var.c;
                gab0 gab0Var8 = nbw0Var.m;
                String str111118 = gab0Var8.a;
                String str111119 = gab0Var8.b;
                if (z5) {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                }
                if (hwtVar != null) {
                    z26 = hwtVar.d;
                } else {
                    z26 = true;
                }
                mgo0VarU = bpo1.u(136, str111116, str111117, str111118, null, str111119, null, z26, z25, z20, z5);
            } else {
                lfi0Var = lfi0VarR;
                hwtVar = hwtVar2;
                mgo0VarU = mgo0Var;
            }
            mgo0Var19 = mey0Var.c;
            if (zG) {
                mgo0Var20 = mgo0Var6;
            }
            if (zG) {
                mgo0Var20 = mgo0Var28;
                mgo0Var21 = mgo0Var11;
            } else if (mgo0Var6 != null) {
                mgo0Var21 = mgo0Var19;
            } else {
                mgo0Var21 = mgo0Var;
            }
            set0 set0VarS8 = bpo1.s(mgo0Var19, w281Var, z417, null, zN2, mgo0Var20, mgo0Var21, zG, z13);
            uho uhoVarQ8 = bpo1.q(str6, mgo0Var5, mgo0Var31);
            if (z21) {
                String str1111110 = mey0Var.c;
                long j110 = j4 / j2;
                if (z29) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                uiv0Var = new uiv0(2, j110, str1111110, i2);
            } else {
                uiv0Var = mgo0Var;
            }
            if (yo60Var != null) {
                myp0 myp0Var8 = yo60Var.d;
                duration = myp0Var8.b;
                duration2 = myp0Var8.a;
                if (hwtVar == null) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                String str1111111 = mey0Var.c;
                timeUnit = TimeUnit.SECONDS;
                if (!zG) {
                    if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                } else if (z15) {
                    r9g1Var = s9g1.a;
                } else {
                    r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                }
                m9g1Var = new m9g1(str1111111, z24, r9g1Var, new w8g1(), t810Var.g);
            } else {
                m9g1Var = mgo0Var;
            }
            if (z16) {
                j3 = -1;
            } else {
                if (z20) {
                    jP = duration3.p();
                } else {
                    jP = yo60Var.f.p();
                }
                j3 = jP * j2;
            }
            long j111 = j3;
            boolean z4118 = t810Var.g;
            boolean z4119 = t810Var.k;
            if (yo60Var != null) {
                zA = er00Var.a();
                Set set9 = s4b1.f;
                if (uic.g(mgo0Var5, blc0.ed)) {
                    if (yo60Var.d.b.p() < yo60Var.g.p()) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                }
                if (zA) {
                    mgo0Var24 = mgo0Var;
                    z22 = true;
                } else {
                    z22 = true;
                    if (z15) {
                        mgo0Var24 = mgo0Var;
                    } else if (!z2) {
                        mgo0Var24 = 2131959807;
                    } else {
                        mgo0Var24 = 2131959807;
                    }
                }
                mgo0Var22 = mgo0Var24;
            } else {
                z22 = true;
                mgo0Var22 = mgo0Var;
            }
            if (z10) {
                z23 = false;
            } else {
                z23 = false;
            }
            if (z28) {
                mgo0Var23 = mgo0Var;
            } else {
                mgo0Var23 = mgo0Var27;
            }
            return new hob1(str122, str123, mgo0Var11, str21, tylVar.b, zV3, zS2, er00Var, zV4, mgo0Var33, lfi0Var, mgo0VarU, (xfn0) null, set0VarS8, wcmVarP2, uhoVarQ8, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var2, j111, z4118, z4119, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
        }
        str = str;
        mgo0Var29 = mgo0Var29;
        arrayList = arrayList4;
        if (eqr0.z(mgo0Var29)) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (w281Var != null) {
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        r4p1VarH = fza.h(nbw0Var2.j);
        if (yo60Var2 != null) {
            q8i0 q8i0VarA3 = kno1.A(yo60Var2, null);
            hwt hwtVar7 = t810Var.c;
            if (y2u0Var != null) {
                arrayList2 = arrayList;
                if (y2u0Var.c) {
                }
                dr00Var = upo1.G(q8i0VarA3, nbw0Var2, yo60Var2, xkk1Var3, str3, r4p1VarH, hwtVar7, z36, 64);
                nbw0Var = nbw0Var2;
                yo60Var = yo60Var2;
                xkk1Var = xkk1Var3;
            } else {
                arrayList2 = arrayList;
            }
            dr00Var = upo1.G(q8i0VarA3, nbw0Var2, yo60Var2, xkk1Var3, str3, r4p1VarH, hwtVar7, z36, 64);
            nbw0Var = nbw0Var2;
            yo60Var = yo60Var2;
            xkk1Var = xkk1Var3;
        } else {
            arrayList2 = arrayList;
            nbw0Var = nbw0Var2;
            yo60Var = yo60Var2;
            xkk1Var = xkk1Var3;
            dr00Var = new dr00(false, upo1.F(i3), false, o2p1.k(xkk1Var, vp70.d, nbw0Var.g));
        }
        if (z32) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (iix0Var instanceof gix0) {
            gix0Var = (gix0) iix0Var;
        } else {
            gix0Var = null;
        }
        if (gix0Var != null) {
            gix0Var = null;
        } else {
            gix0Var = null;
        }
        if (gix0Var == null) {
            mgo0Var = null;
            rle1Var = null;
        } else {
            if (resources == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            ogv ogvVar3 = new ogv(resources, (byte) 0);
            ytw0 ytw0Var3 = jfv.b;
            rle1Var = (rle1) ogvVar3.invoke(new jfv(fdg1.l0(gix0Var.b - gix0Var.c, ngv.d)));
            mgo0Var = null;
        }
        if (z4) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (!z4) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (z6) {
            z8 = true;
        } else {
            z8 = true;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = true;
        }
        if (z8) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (eqr0.A(mgo0Var29)) {
            z11 = false;
        } else {
            z11 = false;
        }
        xkk1Var2 = xei0Var.e;
        if (xkk1Var2 != null) {
            mgo0Var2 = mgo0Var;
        } else {
            mgo0Var2 = mgo0Var;
        }
        if (mgo0Var2 == null) {
            mgo0Var2 = "";
        }
        hzyVar = xei0Var.k;
        if (hzyVar != null) {
            i = hzyVar.a;
        } else {
            i = 0;
        }
        if (jo70Var != null) {
            if (i != 0) {
                iC = l1d.C(i);
                if (iC == 3) {
                    mgo0VarZ = wgo1.z(mgo0Var2, jo70Var);
                } else if (iC != 6) {
                    mgo0Var3 = mgo0Var;
                } else {
                    mgo0VarZ = wgo1.r(mgo0Var2, jo70Var);
                }
            } else {
                mgo0VarZ = wgo1.z(mgo0Var2, jo70Var);
                if (mgo0VarZ == null) {
                    mgo0VarZ = wgo1.r(mgo0Var2, jo70Var);
                }
            }
            mgo0Var3 = mgo0VarZ;
        } else {
            mgo0Var3 = mgo0Var;
        }
        if (z11) {
            strConcat = ihc1.Y0(str5, '?').concat("?feature=mvcdp");
        } else {
            strConcat = str5;
        }
        String str23 = mey0Var.c;
        boolean z313 = t810Var.g;
        boolean z314 = t810Var.h;
        String str24 = strConcat;
        boolean z315 = t810Var.i;
        if (z6) {
            pm0Var = new pm0(vu30Var, (byte) 5);
        } else {
            pm0Var = mgo0Var;
        }
        boolean z4120 = t810Var.s;
        if (z11) {
            g371Var = new g371(Collections.singletonList(gan0.a));
        } else {
            g371Var = new g371();
        }
        wcm wcmVarP3 = bpo1.p(str23, null, z313, z314, z315, false, null, pm0Var, mgo0Var31, z4120, iu30Var, z11, mgo0Var3, g371Var, 398);
        boolean zN3 = rwq.n(mey0Var, dr00Var);
        if (zG) {
            mgo0Var4 = mgo0Var29;
        } else {
            mgo0Var4 = mgo0Var29;
        }
        if (z32) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (z12) {
            z13 = true;
        } else {
            z13 = true;
        }
        mgo0Var5 = mgo0Var29;
        if (zG) {
            mgo0Var6 = mgo0Var;
        } else {
            mgo0Var6 = mgo0Var;
        }
        if (z29) {
            z14 = false;
        } else {
            z14 = false;
        }
        String str25 = mey0Var.b;
        String str124 = mey0Var.a;
        if (yo60Var != null) {
            hwt hwtVar8 = t810Var.c;
            String str125 = mey0Var.c;
            if (prlVar != null) {
                mgo0Var26 = prlVar.c;
            } else {
                mgo0Var26 = mgo0Var;
            }
            lsm0VarR = bwp0.r(yo60Var, str125, str125, z8, hwtVar8, false, mgo0Var26);
        } else {
            ubw0.a.getClass();
            lsm0VarR = rbw0.b;
        }
        lsm0 lsm0Var3 = lsm0VarR;
        boolean z4121 = dr00Var instanceof dr00;
        if (z4121) {
        }
        if (t810Var.u) {
            mgo0Var7 = 3000L;
        } else {
            mgo0Var7 = mgo0Var;
        }
        boolean z4122 = !t810Var.t;
        if (jo70Var != null) {
            mgo0Var8 = mgo0Var;
        } else {
            mgo0Var8 = mgo0Var;
        }
        if (zG) {
            mgo0Var9 = mgo0Var8;
        } else {
            mgo0Var9 = mgo0Var;
        }
        z15 = z6;
        sbw0 sbw0Var3 = new sbw0(str25, str124, "", lsm0Var3, j5, z15, z14, z32, z4122, mgo0Var9, mgo0Var7);
        z16 = z12;
        String str126 = mey0Var.a;
        String str127 = mey0Var.c;
        if (zG) {
            mgo0Var10 = mgo0Var28;
        } else {
            mgo0Var10 = mgo0Var;
        }
        boolean zS3 = p2o1.s(zkmVar, mgo0Var4);
        boolean zV5 = p2o1.v(zkmVar, mgo0Var4);
        mgo0Var11 = mgo0Var4;
        boolean zV6 = upo1.v(t810Var, str6);
        if (z) {
            c5v0Var = new c5v0(duration3.p() * 1000, Long.valueOf(j4), str6);
        } else {
            c5v0Var = mgo0Var;
        }
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
            if (z11) {
                mgo0VarA = fiv0Var.a(jLongValue);
            } else {
                mgo0VarA = ((DateFormat) fiv0Var.c.getValue()).format(Long.valueOf(jLongValue));
            }
            mgo0Var12 = mgo0VarA;
        } else {
            mgo0Var12 = mgo0Var;
        }
        if (z11) {
            mgo0Var13 = iiv0.a;
            j = 1000;
        } else {
            j = 1000;
            mgo0Var13 = mgo0Var;
        }
        if (z28) {
            mgo0VarV = mgo0Var;
        } else {
            mgo0VarV = bpo1.v(mgo0Var27);
        }
        k4m k4mVarF3 = upo1.F(i3);
        j2 = j;
        if (e2k1Var != null) {
            mgo0VarValueOf = Long.valueOf(e2k1Var.a);
        } else {
            mgo0VarValueOf = mgo0Var;
        }
        mgo0 mgo0Var34 = mgo0VarV;
        mgo0VarJ = e6p1.j(mgo0VarValueOf, Long.valueOf(j4), yqgVar.b());
        if (z3) {
            mgo0Var14 = mgo0VarJ;
        } else {
            mgo0Var14 = mgo0Var;
        }
        boolean z4123 = dr00Var instanceof cr00;
        boolean z422 = t810Var.g;
        boolean z423 = t810Var.m;
        if (y2u0Var != 0) {
            er00Var = dr00Var;
            if (!y2u0Var.c) {
            }
            z18 = t810Var.r;
            boolean z41110 = !z16;
            if (rle1Var != null) {
                mgo0Var15 = rle1Var.a;
            } else {
                mgo0Var15 = mgo0Var;
            }
            if (rle1Var != null) {
                mgo0Var16 = rle1Var.b;
                mgo0VarY0 = mgo0Var30;
            } else {
                mgo0VarY0 = mgo0Var30;
                mgo0Var16 = mgo0Var;
            }
            Float fG5 = fj30.G(gix0Var);
            if (str != null) {
                z19 = z18;
                str4 = str;
                mgo0VarF = f4i1.f(mgo0Var31, " - ", str4);
            } else {
                z19 = z18;
                str4 = str;
                if (z34) {
                    mgo0VarF = mgo0Var31;
                } else {
                    mgo0VarF = mgo0Var;
                }
            }
            arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                if (str4 != null) {
                }
                if (str4 != null) {
                    mgo0Var18 = mgo0Var;
                } else {
                    mgo0Var18 = mgo0Var;
                }
                z20 = z8;
                lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z4121, k4mVarF3, wcmVarP3, null, mgo0Var14, z4123, false, z422, z423, z20, false, z4121, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z41110, z11, mgo0Var16, fG5, 35072);
                z21 = z11;
                if (z32) {
                    String str1111112 = mey0Var.a;
                    String str1111113 = mey0Var.c;
                    gab0 gab0Var9 = nbw0Var.m;
                    String str1111114 = gab0Var9.a;
                    String str1111115 = gab0Var9.b;
                    if (z5) {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    } else {
                        lfi0Var = lfi0VarR;
                        hwtVar = hwtVar2;
                        z25 = false;
                    }
                    if (hwtVar != null) {
                        z26 = hwtVar.d;
                    } else {
                        z26 = true;
                    }
                    mgo0VarU = bpo1.u(136, str1111112, str1111113, str1111114, null, str1111115, null, z26, z25, z20, z5);
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    mgo0VarU = mgo0Var;
                }
                mgo0Var19 = mey0Var.c;
                if (zG) {
                    mgo0Var20 = mgo0Var6;
                }
                if (zG) {
                    mgo0Var20 = mgo0Var28;
                    mgo0Var21 = mgo0Var11;
                } else if (mgo0Var6 != null) {
                    mgo0Var21 = mgo0Var19;
                } else {
                    mgo0Var21 = mgo0Var;
                }
                set0 set0VarS9 = bpo1.s(mgo0Var19, w281Var, z4121, null, zN3, mgo0Var20, mgo0Var21, zG, z13);
                uho uhoVarQ9 = bpo1.q(str6, mgo0Var5, mgo0Var31);
                if (z21) {
                    String str1111116 = mey0Var.c;
                    long j112 = j4 / j2;
                    if (z29) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    uiv0Var = new uiv0(2, j112, str1111116, i2);
                } else {
                    uiv0Var = mgo0Var;
                }
                if (yo60Var != null) {
                    myp0 myp0Var9 = yo60Var.d;
                    duration = myp0Var9.b;
                    duration2 = myp0Var9.a;
                    if (hwtVar == null) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    String str1111117 = mey0Var.c;
                    timeUnit = TimeUnit.SECONDS;
                    if (!zG) {
                        if (z15) {
                            r9g1Var = s9g1.a;
                        } else {
                            r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                        }
                    } else if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                    m9g1Var = new m9g1(str1111117, z24, r9g1Var, new w8g1(), t810Var.g);
                } else {
                    m9g1Var = mgo0Var;
                }
                if (z16) {
                    j3 = -1;
                } else {
                    if (z20) {
                        jP = duration3.p();
                    } else {
                        jP = yo60Var.f.p();
                    }
                    j3 = jP * j2;
                }
                long j113 = j3;
                boolean z41111 = t810Var.g;
                boolean z41112 = t810Var.k;
                if (yo60Var != null) {
                    zA = er00Var.a();
                    Set set10 = s4b1.f;
                    if (uic.g(mgo0Var5, blc0.ed)) {
                        if (yo60Var.d.b.p() < yo60Var.g.p()) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                    if (zA) {
                        mgo0Var24 = mgo0Var;
                        z22 = true;
                    } else {
                        z22 = true;
                        if (z15) {
                            mgo0Var24 = mgo0Var;
                        } else if (!z2) {
                            mgo0Var24 = 2131959807;
                        } else {
                            mgo0Var24 = 2131959807;
                        }
                    }
                    mgo0Var22 = mgo0Var24;
                } else {
                    z22 = true;
                    mgo0Var22 = mgo0Var;
                }
                if (z10) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                if (z28) {
                    mgo0Var23 = mgo0Var;
                } else {
                    mgo0Var23 = mgo0Var27;
                }
                return new hob1(str126, str127, mgo0Var11, str24, tylVar.b, zV5, zS3, er00Var, zV6, mgo0Var34, lfi0Var, mgo0VarU, (xfn0) null, set0VarS9, wcmVarP3, uhoVarQ9, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var3, j113, z41111, z41112, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
            }
            mgo0VarY0 = o7h.y0(o7h.O0(mgo0VarY0, arrayList3), ", ", (String) null, (String) null, (iu30) null, 62);
            mgo0Var17 = mgo0VarY0;
            if (str4 != null) {
                mgo0Var18 = mgo0Var;
            } else {
                mgo0Var18 = mgo0Var;
            }
            z20 = z8;
            lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z4121, k4mVarF3, wcmVarP3, null, mgo0Var14, z4123, false, z422, z423, z20, false, z4121, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z41110, z11, mgo0Var16, fG5, 35072);
            z21 = z11;
            if (z32) {
                String str1111118 = mey0Var.a;
                String str1111119 = mey0Var.c;
                gab0 gab0Var10 = nbw0Var.m;
                String str11111110 = gab0Var10.a;
                String str11111111 = gab0Var10.b;
                if (z5) {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                }
                if (hwtVar != null) {
                    z26 = hwtVar.d;
                } else {
                    z26 = true;
                }
                mgo0VarU = bpo1.u(136, str1111118, str1111119, str11111110, null, str11111111, null, z26, z25, z20, z5);
            } else {
                lfi0Var = lfi0VarR;
                hwtVar = hwtVar2;
                mgo0VarU = mgo0Var;
            }
            mgo0Var19 = mey0Var.c;
            if (zG) {
                mgo0Var20 = mgo0Var6;
            }
            if (zG) {
                mgo0Var20 = mgo0Var28;
                mgo0Var21 = mgo0Var11;
            } else if (mgo0Var6 != null) {
                mgo0Var21 = mgo0Var19;
            } else {
                mgo0Var21 = mgo0Var;
            }
            set0 set0VarS10 = bpo1.s(mgo0Var19, w281Var, z4121, null, zN3, mgo0Var20, mgo0Var21, zG, z13);
            uho uhoVarQ10 = bpo1.q(str6, mgo0Var5, mgo0Var31);
            if (z21) {
                String str11111112 = mey0Var.c;
                long j114 = j4 / j2;
                if (z29) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                uiv0Var = new uiv0(2, j114, str11111112, i2);
            } else {
                uiv0Var = mgo0Var;
            }
            if (yo60Var != null) {
                myp0 myp0Var10 = yo60Var.d;
                duration = myp0Var10.b;
                duration2 = myp0Var10.a;
                if (hwtVar == null) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                String str11111113 = mey0Var.c;
                timeUnit = TimeUnit.SECONDS;
                if (!zG) {
                    if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                } else if (z15) {
                    r9g1Var = s9g1.a;
                } else {
                    r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                }
                m9g1Var = new m9g1(str11111113, z24, r9g1Var, new w8g1(), t810Var.g);
            } else {
                m9g1Var = mgo0Var;
            }
            if (z16) {
                j3 = -1;
            } else {
                if (z20) {
                    jP = duration3.p();
                } else {
                    jP = yo60Var.f.p();
                }
                j3 = jP * j2;
            }
            long j115 = j3;
            boolean z41113 = t810Var.g;
            boolean z41114 = t810Var.k;
            if (yo60Var != null) {
                zA = er00Var.a();
                Set set11 = s4b1.f;
                if (uic.g(mgo0Var5, blc0.ed)) {
                    if (yo60Var.d.b.p() < yo60Var.g.p()) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                }
                if (zA) {
                    mgo0Var24 = mgo0Var;
                    z22 = true;
                } else {
                    z22 = true;
                    if (z15) {
                        mgo0Var24 = mgo0Var;
                    } else if (!z2) {
                        mgo0Var24 = 2131959807;
                    } else {
                        mgo0Var24 = 2131959807;
                    }
                }
                mgo0Var22 = mgo0Var24;
            } else {
                z22 = true;
                mgo0Var22 = mgo0Var;
            }
            if (z10) {
                z23 = false;
            } else {
                z23 = false;
            }
            if (z28) {
                mgo0Var23 = mgo0Var;
            } else {
                mgo0Var23 = mgo0Var27;
            }
            return new hob1(str126, str127, mgo0Var11, str24, tylVar.b, zV5, zS3, er00Var, zV6, mgo0Var34, lfi0Var, mgo0VarU, (xfn0) null, set0VarS10, wcmVarP3, uhoVarQ10, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var3, j115, z41113, z41114, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
        }
        er00Var = dr00Var;
        z17 = false;
        z18 = t810Var.r;
        boolean z41115 = !z16;
        if (rle1Var != null) {
            mgo0Var15 = rle1Var.a;
        } else {
            mgo0Var15 = mgo0Var;
        }
        if (rle1Var != null) {
            mgo0Var16 = rle1Var.b;
            mgo0VarY0 = mgo0Var30;
        } else {
            mgo0VarY0 = mgo0Var30;
            mgo0Var16 = mgo0Var;
        }
        Float fG6 = fj30.G(gix0Var);
        if (str != null) {
            z19 = z18;
            str4 = str;
            mgo0VarF = f4i1.f(mgo0Var31, " - ", str4);
        } else {
            z19 = z18;
            str4 = str;
            if (z34) {
                mgo0VarF = mgo0Var31;
            } else {
                mgo0VarF = mgo0Var;
            }
        }
        arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            if (str4 != null) {
            }
            if (str4 != null) {
                mgo0Var18 = mgo0Var;
            } else {
                mgo0Var18 = mgo0Var;
            }
            z20 = z8;
            lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z4121, k4mVarF3, wcmVarP3, null, mgo0Var14, z4123, false, z422, z423, z20, false, z4121, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z41115, z11, mgo0Var16, fG6, 35072);
            z21 = z11;
            if (z32) {
                String str11111114 = mey0Var.a;
                String str11111115 = mey0Var.c;
                gab0 gab0Var11 = nbw0Var.m;
                String str11111116 = gab0Var11.a;
                String str11111117 = gab0Var11.b;
                if (z5) {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                } else {
                    lfi0Var = lfi0VarR;
                    hwtVar = hwtVar2;
                    z25 = false;
                }
                if (hwtVar != null) {
                    z26 = hwtVar.d;
                } else {
                    z26 = true;
                }
                mgo0VarU = bpo1.u(136, str11111114, str11111115, str11111116, null, str11111117, null, z26, z25, z20, z5);
            } else {
                lfi0Var = lfi0VarR;
                hwtVar = hwtVar2;
                mgo0VarU = mgo0Var;
            }
            mgo0Var19 = mey0Var.c;
            if (zG) {
                mgo0Var20 = mgo0Var6;
            }
            if (zG) {
                mgo0Var20 = mgo0Var28;
                mgo0Var21 = mgo0Var11;
            } else if (mgo0Var6 != null) {
                mgo0Var21 = mgo0Var19;
            } else {
                mgo0Var21 = mgo0Var;
            }
            set0 set0VarS11 = bpo1.s(mgo0Var19, w281Var, z4121, null, zN3, mgo0Var20, mgo0Var21, zG, z13);
            uho uhoVarQ11 = bpo1.q(str6, mgo0Var5, mgo0Var31);
            if (z21) {
                String str11111118 = mey0Var.c;
                long j116 = j4 / j2;
                if (z29) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                uiv0Var = new uiv0(2, j116, str11111118, i2);
            } else {
                uiv0Var = mgo0Var;
            }
            if (yo60Var != null) {
                myp0 myp0Var11 = yo60Var.d;
                duration = myp0Var11.b;
                duration2 = myp0Var11.a;
                if (hwtVar == null) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                String str11111119 = mey0Var.c;
                timeUnit = TimeUnit.SECONDS;
                if (!zG) {
                    if (z15) {
                        r9g1Var = s9g1.a;
                    } else {
                        r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                    }
                } else if (z15) {
                    r9g1Var = s9g1.a;
                } else {
                    r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                }
                m9g1Var = new m9g1(str11111119, z24, r9g1Var, new w8g1(), t810Var.g);
            } else {
                m9g1Var = mgo0Var;
            }
            if (z16) {
                j3 = -1;
            } else {
                if (z20) {
                    jP = duration3.p();
                } else {
                    jP = yo60Var.f.p();
                }
                j3 = jP * j2;
            }
            long j117 = j3;
            boolean z41116 = t810Var.g;
            boolean z41117 = t810Var.k;
            if (yo60Var != null) {
                zA = er00Var.a();
                Set set12 = s4b1.f;
                if (uic.g(mgo0Var5, blc0.ed)) {
                    if (yo60Var.d.b.p() < yo60Var.g.p()) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                }
                if (zA) {
                    mgo0Var24 = mgo0Var;
                    z22 = true;
                } else {
                    z22 = true;
                    if (z15) {
                        mgo0Var24 = mgo0Var;
                    } else if (!z2) {
                        mgo0Var24 = 2131959807;
                    } else {
                        mgo0Var24 = 2131959807;
                    }
                }
                mgo0Var22 = mgo0Var24;
            } else {
                z22 = true;
                mgo0Var22 = mgo0Var;
            }
            if (z10) {
                z23 = false;
            } else {
                z23 = false;
            }
            if (z28) {
                mgo0Var23 = mgo0Var;
            } else {
                mgo0Var23 = mgo0Var27;
            }
            return new hob1(str126, str127, mgo0Var11, str24, tylVar.b, zV5, zS3, er00Var, zV6, mgo0Var34, lfi0Var, mgo0VarU, (xfn0) null, set0VarS11, wcmVarP3, uhoVarQ11, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var3, j117, z41116, z41117, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
        }
        mgo0VarY0 = o7h.y0(o7h.O0(mgo0VarY0, arrayList3), ", ", (String) null, (String) null, (iu30) null, 62);
        mgo0Var17 = mgo0VarY0;
        if (str4 != null) {
            mgo0Var18 = mgo0Var;
        } else {
            mgo0Var18 = mgo0Var;
        }
        z20 = z8;
        lfi0VarR = bpo1.r(nbw0Var, xkk1Var, xkk1Var4, ytp0Var, hvp0Var, z4121, k4mVarF3, wcmVarP3, null, mgo0Var14, z4123, false, z422, z423, z20, false, z4121, z17, z19, mgo0VarF, mgo0Var17, mgo0Var18, mgo0Var15, z41115, z11, mgo0Var16, fG6, 35072);
        z21 = z11;
        if (z32) {
            String str111111110 = mey0Var.a;
            String str111111111 = mey0Var.c;
            gab0 gab0Var12 = nbw0Var.m;
            String str111111112 = gab0Var12.a;
            String str111111113 = gab0Var12.b;
            if (z5) {
                lfi0Var = lfi0VarR;
                hwtVar = hwtVar2;
                z25 = false;
            } else {
                lfi0Var = lfi0VarR;
                hwtVar = hwtVar2;
                z25 = false;
            }
            if (hwtVar != null) {
                z26 = hwtVar.d;
            } else {
                z26 = true;
            }
            mgo0VarU = bpo1.u(136, str111111110, str111111111, str111111112, null, str111111113, null, z26, z25, z20, z5);
        } else {
            lfi0Var = lfi0VarR;
            hwtVar = hwtVar2;
            mgo0VarU = mgo0Var;
        }
        mgo0Var19 = mey0Var.c;
        if (zG) {
            mgo0Var20 = mgo0Var6;
        }
        if (zG) {
            mgo0Var20 = mgo0Var28;
            mgo0Var21 = mgo0Var11;
        } else if (mgo0Var6 != null) {
            mgo0Var21 = mgo0Var19;
        } else {
            mgo0Var21 = mgo0Var;
        }
        set0 set0VarS12 = bpo1.s(mgo0Var19, w281Var, z4121, null, zN3, mgo0Var20, mgo0Var21, zG, z13);
        uho uhoVarQ12 = bpo1.q(str6, mgo0Var5, mgo0Var31);
        if (z21) {
            String str111111114 = mey0Var.c;
            long j118 = j4 / j2;
            if (z29) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            uiv0Var = new uiv0(2, j118, str111111114, i2);
        } else {
            uiv0Var = mgo0Var;
        }
        if (yo60Var != null) {
            myp0 myp0Var12 = yo60Var.d;
            duration = myp0Var12.b;
            duration2 = myp0Var12.a;
            if (hwtVar == null) {
                z24 = false;
            } else {
                z24 = false;
            }
            String str111111115 = mey0Var.c;
            timeUnit = TimeUnit.SECONDS;
            if (!zG) {
                if (z15) {
                    r9g1Var = s9g1.a;
                } else {
                    r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
                }
            } else if (z15) {
                r9g1Var = s9g1.a;
            } else {
                r9g1Var = new r9g1(timeUnit.toMillis(duration2.p()), timeUnit.toMillis(duration.p()), yo60Var.c);
            }
            m9g1Var = new m9g1(str111111115, z24, r9g1Var, new w8g1(), t810Var.g);
        } else {
            m9g1Var = mgo0Var;
        }
        if (z16) {
            j3 = -1;
        } else {
            if (z20) {
                jP = duration3.p();
            } else {
                jP = yo60Var.f.p();
            }
            j3 = jP * j2;
        }
        long j119 = j3;
        boolean z41118 = t810Var.g;
        boolean z41119 = t810Var.k;
        if (yo60Var != null) {
            zA = er00Var.a();
            Set set13 = s4b1.f;
            if (uic.g(mgo0Var5, blc0.ed)) {
                if (yo60Var.d.b.p() < yo60Var.g.p()) {
                    zA = true;
                } else {
                    zA = false;
                }
            }
            if (zA) {
                mgo0Var24 = mgo0Var;
                z22 = true;
            } else {
                z22 = true;
                if (z15) {
                    mgo0Var24 = mgo0Var;
                } else if (!z2) {
                    mgo0Var24 = 2131959807;
                } else {
                    mgo0Var24 = 2131959807;
                }
            }
            mgo0Var22 = mgo0Var24;
        } else {
            z22 = true;
            mgo0Var22 = mgo0Var;
        }
        if (z10) {
            z23 = false;
        } else {
            z23 = false;
        }
        if (z28) {
            mgo0Var23 = mgo0Var;
        } else {
            mgo0Var23 = mgo0Var27;
        }
        return new hob1(str126, str127, mgo0Var11, str24, tylVar.b, zV5, zS3, er00Var, zV6, mgo0Var34, lfi0Var, mgo0VarU, (xfn0) null, set0VarS12, wcmVarP3, uhoVarQ12, (wiv0) null, uiv0Var, mgo0Var12, (Long) null, mgo0Var13, (v9n) null, m9g1Var, (ch7) null, sbw0Var3, j119, z41118, z41119, mgo0Var22, z15, z9, z23, mgo0Var23, aqo1.x(i3), t810Var.p, z13, (sq51) null, mgo0Var10, (String) null, zG, t810Var.r, mey0Var.i, c5v0Var, 11079680, 80);
    }

    public static /* synthetic */ hob1 u(mey0 mey0Var, t810 t810Var, xei0 xei0Var, fza fzaVar, hvp0 hvp0Var, yqg yqgVar, ytp0 ytp0Var, fiv0 fiv0Var, vu30 vu30Var, eei0 eei0Var, boolean z, iix0 iix0Var, Resources resources, int i) {
        if ((i & 256) != 0) {
            eei0Var = null;
        }
        if ((i & 512) != 0) {
            z = false;
        }
        if ((i & 1024) != 0) {
            iix0Var = null;
        }
        if ((i & 2048) != 0) {
            resources = null;
        }
        return t(mey0Var, t810Var, xei0Var, fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, vu30Var, eei0Var, z, iix0Var, resources);
    }

    public static hob1 v(mey0 mey0Var, t810 t810Var, fza fzaVar, hvp0 hvp0Var, yqg yqgVar, ytp0 ytp0Var, fiv0 fiv0Var, vu30 vu30Var, iu30 iu30Var, boolean z, iix0 iix0Var, Resources resources, int i) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        goj0 goj0VarA5;
        goj0 goj0VarA6;
        goj0 goj0VarA7;
        goj0 goj0VarA8;
        goj0 goj0VarA9;
        goj0 goj0VarA10;
        ez00 ez00Var = null;
        iu30 iu30Var2 = (i & 128) != 0 ? null : iu30Var;
        boolean z2 = (i & 256) != 0 ? false : z;
        iix0 iix0Var2 = (i & 512) != 0 ? null : iix0Var;
        Resources resources2 = (i & 1024) != 0 ? null : resources;
        ioj0 ioj0Var = t810Var.a;
        String str = mey0Var.c;
        hoj0 hoj0VarC = ioj0Var.c(nbw0.class, str);
        ez00 ez00Var2 = (hoj0VarC == null || (goj0VarA10 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA10.a;
        if (ez00Var2 == null) {
            hhg1.f(f4i1.f(nbw0.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        nbw0 nbw0Var = (nbw0) ez00Var2;
        hoj0 hoj0VarC2 = ioj0Var.c(yo60.class, str);
        yo60 yo60Var = (yo60) ((hoj0VarC2 == null || (goj0VarA9 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA9.a);
        hoj0 hoj0VarC3 = ioj0Var.c(jo70.class, str);
        jo70 jo70Var = (jo70) ((hoj0VarC3 == null || (goj0VarA8 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA8.a);
        hoj0 hoj0VarC4 = ioj0Var.c(mtl.class, str);
        mtl mtlVar = (mtl) ((hoj0VarC4 == null || (goj0VarA7 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA7.a);
        hoj0 hoj0VarC5 = ioj0Var.c(prl.class, str);
        prl prlVar = (prl) ((hoj0VarC5 == null || (goj0VarA6 = hoj0VarC5.a()) == null) ? null : (ez00) goj0VarA6.a);
        hoj0 hoj0VarC6 = ioj0Var.c(xkk1.class, str);
        xkk1 xkk1Var = (xkk1) ((hoj0VarC6 == null || (goj0VarA5 = hoj0VarC6.a()) == null) ? null : (ez00) goj0VarA5.a);
        hoj0 hoj0VarC7 = ioj0Var.c(e2k1.class, str);
        e2k1 e2k1Var = (e2k1) ((hoj0VarC7 == null || (goj0VarA4 = hoj0VarC7.a()) == null) ? null : (ez00) goj0VarA4.a);
        hoj0 hoj0VarC8 = ioj0Var.c(w281.class, mey0Var.d);
        w281 w281Var = (w281) ((hoj0VarC8 == null || (goj0VarA3 = hoj0VarC8.a()) == null) ? null : (ez00) goj0VarA3.a);
        hoj0 hoj0VarC9 = ioj0Var.c(l1z.class, str);
        l1z l1zVar = (l1z) ((hoj0VarC9 == null || (goj0VarA2 = hoj0VarC9.a()) == null) ? null : (ez00) goj0VarA2.a);
        hoj0 hoj0VarC10 = ioj0Var.c(hzy.class, str);
        if (hoj0VarC10 != null && (goj0VarA = hoj0VarC10.a()) != null) {
            ez00Var = (ez00) goj0VarA.a;
        }
        return t(mey0Var, t810Var, new xei0(nbw0Var, yo60Var, jo70Var, prlVar, xkk1Var, e2k1Var, w281Var, (xkk1) null, l1zVar, mtlVar, (hzy) ez00Var, 128), fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, vu30Var, iu30Var2, z2, iix0Var2, resources2);
    }

    public static void w(ipc1 ipc1Var, int i, akl aklVar) {
        long jC = ipc1Var.c(i);
        List listB = ipc1Var.b(jC);
        if (listB.isEmpty()) {
            return;
        }
        if (i == ipc1Var.d() - 1) {
            bhn0.w();
            return;
        }
        long jC2 = ipc1Var.c(i + 1) - ipc1Var.c(i);
        if (jC2 > 0) {
            aklVar.accept(new bfo(jC, jC2, listB));
        }
    }

    public static final q0o1 x(y65 y65Var) {
        int iOrdinal = y65Var.ordinal();
        if (iOrdinal == 0) {
            return xkd.c;
        }
        if (iOrdinal == 1) {
            return wkd.c;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void y(ipc1 ipc1Var, kqc1 kqc1Var, akl aklVar) {
        int iA;
        boolean z;
        long j = kqc1Var.b;
        if (j == -9223372036854775807L) {
            iA = 0;
        } else {
            iA = ipc1Var.a(j);
            if (iA == -1) {
                iA = ipc1Var.d();
            }
            if (iA > 0 && ipc1Var.c(iA - 1) == j) {
                iA--;
            }
        }
        if (j == -9223372036854775807L || iA >= ipc1Var.d()) {
            z = false;
        } else {
            List listB = ipc1Var.b(j);
            long jC = ipc1Var.c(iA);
            if (listB.isEmpty()) {
                z = false;
            } else {
                long j2 = kqc1Var.b;
                if (j2 < jC) {
                    aklVar.accept(new bfo(j2, jC - j2, listB));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iA; i < ipc1Var.d(); i++) {
            w(ipc1Var, i, aklVar);
        }
        if (kqc1Var.a) {
            if (z) {
                iA--;
            }
            for (int i2 = 0; i2 < iA; i2++) {
                w(ipc1Var, i2, aklVar);
            }
            if (z) {
                aklVar.accept(new bfo(ipc1Var.c(iA), j - ipc1Var.c(iA), ipc1Var.b(j)));
            }
        }
    }
}
