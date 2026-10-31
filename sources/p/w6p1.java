package p;

import android.content.Context;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Timestamp;
import j$.net.URLDecoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(yg1 yg1Var, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function0;
        oh1 oh1Var = yg1Var.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1372916983);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(yg1Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var, cbx.a(x340Var).a.a.a(), er31.b(8.0f)), 1.0f), 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
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
            String str = oh1Var.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            nim0 nim0Var = nim0.a;
            uwo1.e(str, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            fra fraVar = een.Z;
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            upx upxVar = upx.c;
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            int i3 = upx.d | 48;
            isl islVar = isl.a;
            Function0 function2 = function0;
            w0h1.a(upxVar, islVar, qim0VarR, 0L, 0L, false, x340Var, i3, 56);
            uwo1.e(oh1Var.b, null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            w0h1.a(xrx.c, islVar, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, xrx.d | 48, 56);
            uwo1.e(oh1Var.c, null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xf1(yg1Var, qim0Var, i, (byte) 2);
        }
    }

    public static final void b(int i, String str, String str2, String str3, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-256229284);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = u291.x(71.0f, 0.0f, 2, u291.j(32.0f, 0.0f, 2, qim0Var3));
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, d1u.E(1.0f, cbx.a(x340Var2).c.a, qim0VarX, er31.b(46.0f)));
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new kq00(str3, (byte) 19);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new are(iu30Var, str, (byte) 8);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarX2 = bin.x(qim0VarB, false, null, null, null, (Function0) objT2, 15);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX2);
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
            long j = cbx.a(x340Var2).b.a;
            qim0Var2 = qim0Var3;
            uwo1.e(str2, null, lee1.a(cbx.d(x340Var2).e, 0L, fc11.G(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), j, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i2 >> 3) & 14, 0, 2018);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20(str, str2, str3, (Object) iu30Var, (Object) qim0Var2, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(v2v0 v2v0Var, iu30 iu30Var, qim0 qim0Var, yqg yqgVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        byte b2;
        int i2;
        String str = v2v0Var.p;
        int i3 = v2v0Var.f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(898199700);
        int i4 = i | (b0kVar3.i(v2v0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.g(yqgVar) ? 2048 : 1024);
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = o0c.F(i3, v2v0Var.j, v2v0Var.k);
            c380 c380VarA = mqo1.A(z6x.a);
            String str2 = v2v0Var.b;
            if ((78 & 1) != 0) {
                str2 = "Title";
            }
            j2i j2iVarR = null;
            va51 va51Var = new va51(str2, (78 & 2) != 0 ? c380VarA : null, ai4.b, (78 & 8) != 0 ? 3 : 0, (78 & 16) != 0 ? 1 : 2, (78 & 32) != 0 ? false : zF, (78 & 64) != 0 ? 0 : 2);
            ta51 ta51Var = new ta51(v2v0Var.c, i3 == 3 ? fg91.b : mqo1.s(new ra51(i3)));
            boolean z = (!v2v0Var.o || str == null || str.length() == 0) ? false : true;
            if (!z) {
                str = v2v0Var.e;
            }
            if (z) {
                i2 = 2;
                b2 = 2;
            } else {
                b2 = 2;
                i2 = 1;
            }
            String str3 = v2v0Var.s;
            String str4 = (196 & 1) != 0 ? null : str;
            boolean z2 = (196 & 2) != 0 ? false : zF;
            oa51 oa51Var = (196 & 4) != 0 ? oa51.a : null;
            int i5 = (196 & 8) != 0 ? 1 : i2;
            na51 na51Var = (196 & 16) != 0 ? na51.i : na51.e;
            if ((196 & 32) != 0) {
                str3 = "";
            }
            pa51 pa51Var = new pa51(str4, z2, oa51Var, i5, na51Var, str3, false, false);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 0.0f, 8.0f);
            tvx tvxVarB = gto1.B(1, b0kVar3, 3);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            tvx tvxVarA = tvx.a(tvxVarB, 2.0f, 6);
            byte b3 = z ? b2 : (byte) 1;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            uvx uvxVar = new uvx(1, (pgx) null, 3, zzq0Var, (zzq0) null, tvxVarA, (hw61) null, b3, new p3v(48.0f), 82);
            hax haxVar = zF ? new hax("Content restricted") : jax.a;
            boolean z3 = ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new sn8(iu30Var, yqgVar, (byte) 6);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (v2v0Var.i != 1 || v2v0Var.q.length() <= 0) {
                b0kVar3.i0(624940600);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(623729833);
                j2iVarR = apo.r(907984379, new dvt0(v2v0Var, (byte) 6), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, haxVar, false, null, null, gbxVar, null, null, apo.r(397073291, new una0(pa51Var, (byte) 1), b0kVar3), null, apo.r(902701516, new cn20(ta51Var, b2), b0kVar3), apo.r(494677901, new n8k0(v2v0Var, zF, iu30Var, (byte) 6), b0kVar3), j2iVarR, null, apo.r(-729392944, new vna0(va51Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 197040, 17848);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(v2v0Var, iu30Var, qim0Var2, yqgVar, i);
        }
    }

    public static final void d(qim0 qim0Var, xky0 xky0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-714464401);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(xky0Var) ? 32 : 16;
        }
        int i3 = i & 384;
        j2i j2iVar2 = v8r.a;
        if (i3 == 0) {
            i2 |= x340Var.i(j2iVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                hrr0 hrr0Var = new hrr0((Object) null, f331.X0);
                x340Var.s0(hrr0Var);
                objT = hrr0Var;
            }
            gea geaVarG = g((i2 >> 6) & 14, j2iVar2, x340Var);
            mod.b(xky0Var.a(geaVarG), apo.r(274270255, new hea(qim0Var, (ven0) objT, j2iVar, geaVarG), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(qim0Var, xky0Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void e(String str, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1896105278);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            mqo1.e(function1, new i3u(4, true, true, false), null, apo.r(1183113022, new mv8(z, str, (byte) 11), x340Var), adj.a, apo.r(1788887804, new tse0(function0, (byte) 29), x340Var), apo.r(2091775195, new h621(function1, (byte) 0), x340Var), x340Var, ((i3 >> 9) & 14) | 1797120, 4);
            function2 = function1;
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i621(str, z, function0, function2, i);
        }
    }

    public static final boolean f(gbl gblVar) {
        return gblVar == gbl.X || gblVar == gbl.Y;
    }

    public static final gea g(int i, j2i j2iVar, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        boolean z = (((i & 14) ^ 6) > 4 && ((x340) b0kVar).g(j2iVar)) || (i & 6) == 4;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == m4cVar) {
            objT = new gea(j2iVar);
            x340Var.s0(objT);
        }
        gea geaVar = (gea) objT;
        boolean zG = x340Var.g(geaVar);
        Object objT2 = x340Var.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new j6(geaVar, (byte) 10);
            x340Var.s0(objT2);
        }
        qxd0.i(geaVar, (iu30) objT2, x340Var);
        return geaVar;
    }

    public static final uwe1 h(uwe1 uwe1Var, h290 h290Var) {
        rwe1 rwe1Var = rwe1.a;
        if (uwe1Var.equals(rwe1Var)) {
            return rwe1Var;
        }
        twe1 twe1Var = twe1.a;
        if (uwe1Var.equals(twe1Var)) {
            return twe1Var;
        }
        if (!(uwe1Var instanceof swe1)) {
            eg.o();
            return null;
        }
        int iS = zno1.s(q7h.U(h290Var, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            Timestamp timestamp = (Timestamp) it.next();
            linkedHashMap.put(Integer.valueOf((int) (timestamp.n() / 1000)), Long.valueOf(timestamp.o()));
        }
        return new swe1(mqo1.B(linkedHashMap));
    }

    public static final List i(m3n1 m3n1Var) {
        kly0 kly0Var = m3n1Var.a;
        Class<kly0> cls = kly0.class;
        mdp0 mdp0Var = new mdp0(0, kly0Var, cls, "get", "get()Ljava/lang/Object;", 0, (byte) 18);
        kly0 kly0Var2 = m3n1Var.j;
        int i = 0;
        int i2 = 0;
        jlq0 wo5Var = new wo5((Context) mdp0Var.invoke(), (q8n) new mdp0(i2, kly0Var2, cls, "get", "get()Ljava/lang/Object;", i, (byte) 19).invoke(), (byte) 7);
        mdp0 mdp0Var2 = new mdp0(0, kly0Var, cls, "get", "get()Ljava/lang/Object;", 0, (byte) 16);
        mdp0 mdp0Var3 = new mdp0(i2, kly0Var2, cls, "get", "get()Ljava/lang/Object;", i, (byte) 17);
        Context context = (Context) mdp0Var2.invoke();
        q8n q8nVar = (q8n) mdp0Var3.invoke();
        return p7h.M(new jlq0[]{wo5Var, new wo5(q8nVar, new f85(new x15(context, q8nVar), (byte) 24), (byte) 1)});
    }

    public static final String j(String str) {
        String str2 = (String) o7h.t0(5, ihc1.Q0(str, new String[]{":"}, 0, 6));
        if (str2 == null) {
            str2 = "";
        }
        return URLDecoder.decode(str2, "UTF-8");
    }

    public static final float k(kee1 kee1Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(841967684);
        TextUnit textUnit = kee1Var.b;
        float fC = textUnit != null ? TextUnit.c(textUnit.a) : 12.0f;
        if (fC == 0.0f) {
            x340Var.r(false);
            return 0.0f;
        }
        float f = (fC * ((Context) x340Var.k(p4k.b)).getResources().getConfiguration().fontScale * 1.3f) + 2.0f;
        x340Var.r(false);
        return f;
    }

    public static final float l(kee1 kee1Var, String str, float f, x340 x340Var) {
        DisplayMetrics displayMetrics = ((Context) x340Var.k(p4k.b)).getResources().getDisplayMetrics();
        TextUnit textUnit = kee1Var.b;
        float fC = (textUnit != null ? TextUnit.c(textUnit.a) : 14.0f) * displayMetrics.scaledDensity;
        ka30 ka30Var = kee1Var.c;
        int i = (ka30Var != null && ka30Var.a == 700) ? 1 : 0;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(fC);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", i));
        int iU = jch0.U(f * displayMetrics.density);
        return StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, iU >= 1 ? iU : 1).build().getHeight() / displayMetrics.density;
    }

    public static final cd8 m(q781 q781Var) {
        if (q781Var instanceof p781) {
            return ((p781) q781Var).a.y.a(cd8.class);
        }
        if (q781Var instanceof o781) {
            return ((o781) q781Var).h;
        }
        eg.o();
        return null;
    }

    public static final String n(q781 q781Var) {
        if (q781Var instanceof p781) {
            return ((p781) q781Var).a.d;
        }
        if (!(q781Var instanceof o781)) {
            eg.o();
            return null;
        }
        jo70 jo70Var = ((o781) q781Var).b;
        String str = jo70Var != null ? jo70Var.a : null;
        return str == null ? "" : str;
    }

    public static final w281 o(q781 q781Var) {
        if (q781Var instanceof p781) {
            return ((p781) q781Var).a.y.a(w281.class);
        }
        if (q781Var instanceof o781) {
            return ((o781) q781Var).f;
        }
        eg.o();
        return null;
    }

    public static final String p(q781 q781Var) {
        List list;
        ho70 ho70Var;
        if (q781Var instanceof p781) {
            return ((p781) q781Var).a.e;
        }
        String str = null;
        if (!(q781Var instanceof o781)) {
            eg.o();
            return null;
        }
        jo70 jo70Var = ((o781) q781Var).b;
        if (jo70Var != null && (list = jo70Var.d) != null && (ho70Var = (ho70) o7h.s0(list)) != null) {
            str = ho70Var.a;
        }
        return str == null ? "" : str;
    }

    public static final String q(q781 q781Var) {
        if (q781Var instanceof p781) {
            return ((p781) q781Var).a.a;
        }
        if (q781Var instanceof o781) {
            return ((o781) q781Var).a;
        }
        eg.o();
        return null;
    }

    public static final qga0 r(o6 o6Var, x8c0 x8c0Var) {
        if (x8c0Var.b().compareTo(w8c0.a) <= 0) {
            k220.n("Cannot configure ", o6Var, " to disposeComposition at Lifecycle ON_DESTROY: ", x8c0Var, "is already destroyed");
            return null;
        }
        rg rgVar = new rg(o6Var, (byte) 4);
        x8c0Var.a(rgVar);
        return new qga0(x8c0Var, rgVar, (byte) 27);
    }

    public static final boolean s(q781 q781Var) {
        if (q781Var instanceof p781) {
            return ((p781) q781Var).a.x;
        }
        if (q781Var instanceof o781) {
            iam iamVar = ((o781) q781Var).d;
            return (iamVar != null ? iamVar.a : 0) == 8;
        }
        eg.o();
        return false;
    }

    public static final boolean t(q781 q781Var) {
        if (q781Var instanceof p781) {
            return ((p781) q781Var).a.m;
        }
        if (q781Var instanceof o781) {
            return ((o781) q781Var).k.a;
        }
        eg.o();
        return false;
    }

    public static final boolean u(q781 q781Var) {
        if (!(q781Var instanceof p781)) {
            if (!(q781Var instanceof o781)) {
                eg.o();
                return false;
            }
            if (!((o781) q781Var).j.b) {
                return true;
            }
        }
        return false;
    }

    public static final uio v(String str) {
        if (!nhc1.Y(str, "spotify:local:", false)) {
            return null;
        }
        return new uio(str, tio.c, Collections.singletonList(new pio(Collections.singletonList("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt"))));
    }

    public static h4l0 w(String str) {
        r6h1 r6h1Var = r6h1.c;
        return new h4l0(str);
    }
}
