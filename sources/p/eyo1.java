package p;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.style.URLSpan;
import androidx.compose.ui.geometry.Offset;
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
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class eyo1 {
    public static b180 a;
    public static b180 b;

    public static boolean A(d85 d85Var) {
        return d85Var.a();
    }

    public static final void B(wsc0 wsc0Var, fkv fkvVar) {
        io70 io70Var;
        List list = wsc0Var.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            f1r f1rVarA = null;
            if (!it.hasNext()) {
                break;
            }
            zuc0 zuc0Var = (zuc0) it.next();
            String str = zuc0Var.c;
            f1r f1rVarA2 = hon1.r(str).a(new iey0(str));
            Set set = s4b1.f;
            blc0 blc0Var = uic.x(zuc0Var.c).c;
            if (blc0Var == blc0.ed || blc0Var == blc0.M3) {
                jo70 jo70VarA = zuc0Var.q.a(jo70.class);
                String str2 = (jo70VarA == null || (io70Var = jo70VarA.e) == null) ? null : io70Var.b;
                if (str2 != null) {
                    iey0 iey0Var = new iey0(str2);
                    jd11 jd11Var = rc11.a;
                    f1rVarA = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, jkv.g, new j4r(jkv.X), jkv.h), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, jkv.i, new j4r(jkv.Y), jkv.t), fdv.f).a(iey0Var);
                }
            }
            r7h.W(f46.i0(new f1r[]{f1rVarA2, f1rVarA}), arrayList);
        }
        String str3 = wsc0Var.f.a;
        Set set2 = s4b1.f;
        Set setP1 = o7h.p1(o7h.N0(p7h.N(uic.x(str3).c == blc0.fh ? hon1.r(str3).a(new iey0(str3)) : null), arrayList));
        rhg0 rhg0Var = fkvVar.e;
        if (rhg0Var != null) {
            rhg0Var.a(setP1, (ArrayList) null, (ArrayList) null);
        }
    }

    public static final void a(mp mpVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1805096186);
        int i2 = i | (b0kVar3.g(mpVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uvx uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 2, (tvx) null, new p3v(hcx.d.a(b0kVar3)), 11);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new p1(iu30Var, (byte) 7);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVarB, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(-1746255299, new np(mpVar, b2), b0kVar3), null, null, null, null, null, apo.r(2040409154, new np(mpVar, b3), b0kVar3), b0kVar2, 805306432, 196608, 32188);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((byte) 4, i, (Object) mpVar, iu30Var, qim0Var2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(String str, rb71 rb71Var, yb71 yb71Var, long j, qim0 qim0Var, ib71 ib71Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-228009157);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(rb71Var) ? 32 : 16) | (b0kVar3.g(yb71Var) ? 256 : 128) | (b0kVar3.f(j) ? 2048 : 1024) | 24576 | (b0kVar3.e(ib71Var == null ? -1 : ib71Var.ordinal()) ? 131072 : 65536) | (b0kVar3.h(z) ? 1048576 : 524288);
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z2 = ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576);
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == obj) {
                objT2 = Float.valueOf((ib71Var == ib71.b || (ib71Var != null && z)) ? 0.5f : 1.0f);
                b0kVar3.s0(objT2);
            }
            float fFloatValue = ((Number) objT2).floatValue();
            Object objT3 = b0kVar3.T();
            if (objT3 == obj) {
                objT3 = lmm.b1;
                b0kVar3.s0(objT3);
            }
            boolean z3 = !((Boolean) ven0Var.getValue()).booleanValue();
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            wxo1.e(rb71Var, j, (Function0) objT3, z3, d9y0.k(qim0Var3, fFloatValue), null, apo.r(541257650, new y1g(str, yb71Var, j, z, ven0Var), b0kVar3), b0kVar2, ((i2 >> 3) & 14) | 1573248 | ((i2 >> 6) & 112), 32);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jqo(str, rb71Var, yb71Var, j, qim0Var2, ib71Var, z, i);
        }
    }

    public static final void c(int i, String str, b0k b0kVar, iu30 iu30Var) {
        int i2;
        b0k b0kVar2;
        h311 h311VarV;
        iw10 iw10Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1997766831);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            if (str == null) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    iw10Var = new iw10(str, iu30Var, i, (byte) 0);
                }
            } else {
                boolean z = (i2 & 14) == 4;
                Object objT = b0kVar3.T();
                if (z || objT == fkj0.X) {
                    objT = y(str, new v2y(iu30Var, (byte) 28));
                    b0kVar3.s0(objT);
                }
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar3).m;
                long j = cbx.a(b0kVar3).b.b;
                cvx cvxVar = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                uwo1.d((af5) objT, j, uyn1.B(nim0.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var, null, null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4080);
            }
            h311VarV.d = iw10Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            iw10Var = new iw10(str, iu30Var, i, (byte) 1);
            h311VarV.d = iw10Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(boolean z, boolean z2, boolean z3, boolean z4, int i, Function0 function0, iu30 iu30Var, Function0 function1, Function0 function2, qim0 qim0Var, iu30 iu30Var2, iu30 iu30Var3, int i2, String str, iu30 iu30Var4, String str2, String str3, boolean z5, fw10 fw10Var, iu30 iu30Var5, b0k b0kVar, int i3) throws Throwable {
        x340 x340Var;
        qim0 qim0Var2;
        Integer num;
        y7e1 y7e1Var;
        Throwable th;
        lee1 lee1Var;
        int i4;
        y7e1 y7e1Var2;
        iu30 iu30Var6 = iu30Var2;
        String str4 = str;
        iu30 iu30Var7 = iu30Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-658906806);
        j06 j06Var = x340Var2.a;
        int i5 = i3 | (x340Var2.h(z) ? 4 : 2) | (x340Var2.h(z2) ? 32 : 16) | (x340Var2.h(z3) ? 256 : 128) | (x340Var2.h(z4) ? 2048 : 1024) | (x340Var2.e(i) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | (x340Var2.i(iu30Var) ? 1048576 : 524288) | (x340Var2.i(function1) ? 8388608 : 4194304) | (x340Var2.i(function2) ? 67108864 : 33554432) | 805306368;
        int i6 = (x340Var2.i(iu30Var6) ? 4 : 2) | (x340Var2.i(iu30Var3) ? 32 : 16) | (x340Var2.e(i2) ? 256 : 128) | (x340Var2.g(str4) ? 2048 : 1024) | (x340Var2.i(iu30Var7) ? 16384 : 8192) | (x340Var2.g(str2) ? 131072 : 65536) | (x340Var2.g(str3) ? 1048576 : 524288) | (x340Var2.h(z5) ? 8388608 : 4194304) | (x340Var2.g(fw10Var) ? 67108864 : 33554432) | (x340Var2.i(iu30Var5) ? 536870912 : 268435456);
        if (x340Var2.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var2);
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = pzm.i(x340Var2);
            }
            lz20 lz20Var = (lz20) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = new j5c();
                x340Var2.s0(objT2);
            }
            j5c j5cVar = (j5c) objT2;
            k6a1 k6a1Var = (k6a1) x340Var2.k(t4k.q);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            boolean z6 = !z5 && i >= 10;
            boolean z7 = y7e1VarD.d().d.length() >= 500;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean z8 = z7;
            boolean zI = ((i5 & 7168) == 2048) | x340Var2.i(y7e1VarD) | ((i5 & 29360128) == 8388608);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == m4cVar) {
                num = null;
                objT5 = new cfb(z4, y7e1VarD, function1, (lnm) null);
                x340Var2.s0(objT5);
            } else {
                num = null;
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT5);
            Integer numValueOf = fw10Var != null ? Integer.valueOf(fw10Var.c) : num;
            boolean zI2 = ((i6 & 1879048192) == 536870912) | ((i6 & 234881024) == 67108864) | x340Var2.i(y7e1VarD) | x340Var2.i(lz20Var) | x340Var2.i(k6a1Var) | x340Var2.i(j5cVar);
            Object objT6 = x340Var2.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new af0(fw10Var, y7e1VarD, iu30Var5, lz20Var, k6a1Var, j5cVar, (lnm) null, (byte) 10);
                y7e1Var = y7e1VarD;
                x340Var2.s0(objT6);
            } else {
                y7e1Var = y7e1VarD;
            }
            qxd0.t(numValueOf, x340Var2, (vu30) objT6);
            boolean zI3 = x340Var2.i(y7e1Var) | ((i5 & 458752) == 131072) | ((i6 & 112) == 32);
            Object objT7 = x340Var2.T();
            if (zI3 || objT7 == m4cVar) {
                th = null;
                objT7 = new l2w(y7e1Var, function0, iu30Var3, (lnm) null, (byte) 26);
                x340Var2.s0(objT7);
            } else {
                th = null;
            }
            qxd0.t(y7e1Var, x340Var2, (vu30) objT7);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw th;
            }
            x340Var2.m0();
            boolean z9 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z9) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            y7e1 y7e1Var3 = y7e1Var;
            String language = ((Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0).getLanguage();
            boolean z10 = u890.j(language, "en") || u890.j(language, "es");
            int i7 = z5 ? 2131963062 : 2131963103;
            boolean z11 = z10;
            if (z5) {
                x340Var2.i0(-1827855105);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(x340Var2).d;
            } else {
                x340Var2.i0(-1827853986);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var2).e;
            }
            lee1 lee1Var2 = lee1Var;
            x340Var2.r(false);
            boolean z12 = z6;
            qim0 qim0VarJ = u291.j(40.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarJ);
            if (j06Var == null) {
                tgp1.p();
                throw th;
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
            String string = context.getString(i7);
            long j = cbx.a(x340Var2).b.a;
            Object objT8 = x340Var2.T();
            if (objT8 == m4cVar) {
                objT8 = zs10.Y;
                x340Var2.s0(objT8);
            }
            uwo1.e(string, s161.b(qim0Var3, false, (iu30) objT8), lee1Var2, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(true);
            if (z5) {
                i4 = z11 ? 2131963063 : 2131963064;
            } else {
                i4 = z11 ? 2131963101 : 2131963102;
            }
            Object string2 = (str3 == null || !z5 || ihc1.y0(str3)) ? th : str3;
            if (string2 == null) {
                string2 = context.getString(i4);
            }
            uwo1.e(string2, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            qim0 qim0VarN = aym.n(qim0Var3, j5cVar);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
            if (j06Var == null) {
                tgp1.p();
                throw th;
            }
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
            boolean zH = x340Var.h(z12) | x340Var.i(ven0Var) | x340Var.i(y7e1Var3) | ((i5 & 3670016) == 1048576);
            Object objT9 = x340Var.T();
            if (zH || objT9 == m4cVar) {
                objT9 = new zg6(z12, y7e1Var3, iu30Var, ven0Var, (byte) 3);
                y7e1Var2 = y7e1Var3;
                x340Var.s0(objT9);
            } else {
                y7e1Var2 = y7e1Var3;
            }
            Function0 function3 = (Function0) objT9;
            boolean zI4 = x340Var.i(ven0Var2) | ((i6 & 14) == 4);
            Object objT10 = x340Var.T();
            if (zI4 || objT10 == m4cVar) {
                iu30Var6 = iu30Var2;
                objT10 = new gp0(iu30Var6, ven0Var2, (byte) 14);
                x340Var.s0(objT10);
            } else {
                iu30Var6 = iu30Var2;
            }
            int i8 = i6 >> 9;
            e(y7e1Var2, lz20Var, j5cVar, z, z2, z3, z8, function3, function2, null, (iu30) objT10, i2, str2, x340Var, ((i5 << 9) & 523264) | (i5 & 234881024), ((i6 >> 3) & 112) | (i8 & 896));
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(-1577988840);
                str4 = str;
                iu30Var7 = iu30Var4;
                c(i8 & 126, str4, x340Var, iu30Var7);
                x340Var.r(false);
            } else {
                str4 = str;
                iu30Var7 = iu30Var4;
                x340Var.i0(-1577915804);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-1487442101);
                boolean zI5 = x340Var.i(ven0Var);
                Object objT11 = x340Var.T();
                if (zI5 || objT11 == m4cVar) {
                    objT11 = new iwr(ven0Var, (byte) 20);
                    x340Var.s0(objT11);
                }
                f((Function0) objT11, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1487368104);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jw10(z, z2, z3, z4, i, function0, iu30Var, function1, function2, qim0Var2, iu30Var6, iu30Var3, i2, str4, iu30Var7, str2, str3, z5, fw10Var, iu30Var5, i3);
        }
    }

    public static final void e(y7e1 y7e1Var, lz20 lz20Var, j5c j5cVar, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function1, qim0 qim0Var, iu30 iu30Var, int i, String str, b0k b0kVar, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar;
        b0k b0kVar3;
        qim0 qim0VarE;
        b0k b0kVar4;
        float f;
        Throwable th;
        boolean z5;
        float f2;
        qim0 qim0Var3;
        boolean z6;
        m4c m4cVar2;
        Context context;
        boolean z7;
        Context context2;
        hax haxVar;
        m4c m4cVar3 = fkj0.X;
        b0k b0kVar5 = (x340) b0kVar;
        b0kVar5.k0(-980075058);
        j06 j06Var = ((x340) b0kVar5).a;
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar5.i(y7e1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar5.i(lz20Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar5.i(j5cVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar5.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar5.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= b0kVar5.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= b0kVar5.h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= b0kVar5.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= b0kVar5.i(function1) ? 67108864 : 33554432;
        }
        int i6 = i4 | 805306368;
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar5.i(iu30Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar5.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar5.g(str) ? 256 : 128;
        }
        int i7 = i5;
        if (b0kVar5.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            Context context3 = (Context) b0kVar5.k(AndroidCompositionLocals_androidKt.b);
            Object objT = b0kVar5.T();
            if (objT == m4cVar3) {
                objT = qxd0.M(o6x.a, b0kVar5);
                b0kVar5.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            k6a1 k6a1Var = (k6a1) b0kVar5.k(t4k.q);
            boolean z8 = y7e1Var.d().d.length() > 0;
            Integer numValueOf = Integer.valueOf(i);
            boolean zI = ((i7 & 112) == 32) | b0kVar5.i(lz20Var) | b0kVar5.i(k6a1Var) | b0kVar5.i(j5cVar);
            Object objT2 = b0kVar5.T();
            if (zI || objT2 == m4cVar3) {
                m4cVar = m4cVar3;
                b0kVar3 = b0kVar5;
                ha5 ha5Var = new ha5(i, lz20Var, k6a1Var, j5cVar, (lnm) null);
                b0kVar3.s0(ha5Var);
                objT2 = ha5Var;
            } else {
                m4cVar = m4cVar3;
                b0kVar3 = b0kVar5;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) objT2);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(0);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            boolean z9 = ((Boolean) ven0Var.getValue()).booleanValue() || z8 || z;
            b0k b0kVar6 = b0kVar3;
            tob1 tob1VarA = z95.a((((Boolean) ven0Var.getValue()).booleanValue() || z || z4) ? 8.0f : 24.0f, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), (String) null, b0kVar6, 0, 12);
            tob1 tob1VarA2 = z95.a(((Boolean) ven0Var.getValue()).booleanValue() ? 82.0f : 48.0f, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), (String) null, b0kVar6, 0, 12);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            boolean zI2 = b0kVar6.i(ven0Var2) | b0kVar6.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0265: ARITH (r19v5 'zI2' boolean) = (wrap boolean:0x025f: ARITH (wrap boolean:0x0257: INVOKE (r19v2 'b0kVar6' p.b0k), (r1v9 'ven0Var2' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:600)) | (wrap boolean:0x025b: INVOKE (r19v2 'b0kVar6' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r72v1 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:604)) A[DONT_WRAP, WRAPPED] (LINE:608)) | (wrap boolean:0x0261: INVOKE (r19v2 'b0kVar6' p.b0k), (r65v0 'j5cVar' p.j5c) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:610)) A[DECLARE_VAR] (LINE:614) in method: p.eyo1.e(p.y7e1, p.lz20, p.j5c, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.iu30, int, java.lang.String, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r72v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1691
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.eyo1.e(p.y7e1, p.lz20, p.j5c, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.iu30, int, java.lang.String, p.b0k, int, int):void");
        }

        public static final void f(Function0 function0, b0k b0kVar, int i) {
            Function0 function1;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(848659839);
            int i2 = (x340Var.i(function0) ? 4 : 2) | i;
            byte b2 = 14;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                function1 = function0;
                mqo1.e(function1, null, null, goi.a, goi.b, apo.r(920748929, new vgz(function0, (byte) 13), x340Var), null, x340Var, (i2 & 14) | 224256, 70);
            } else {
                function1 = function0;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vgz(function1, i, b2);
            }
        }

        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r15v7 */
        public static final void g(lbt0 lbt0Var, iu30 iu30Var, wpv0 wpv0Var, xfx xfxVar, vzq0 vzq0Var, b0k b0kVar, int i) {
            int i2;
            ?? r15;
            m4c m4cVar;
            lbt0 lbt0Var2;
            String str;
            im imVar = lbt0Var.b.h;
            oh4 oh4Var = wpv0Var.b;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1164046665);
            if ((i & 6) == 0) {
                i2 = (x340Var.g(lbt0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(wpv0Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= x340Var.i(xfxVar) ? 2048 : 1024;
            }
            int i3 = i & 24576;
            nim0 nim0Var = nim0.a;
            if (i3 == 0) {
                i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= x340Var.i(vzq0Var) ? 131072 : 65536;
            }
            int i4 = i2;
            if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
                x340Var.d0();
                if ((i & 1) != 0 && !x340Var.E()) {
                    x340Var.b0();
                }
                x340Var.s();
                Object objT = x340Var.T();
                m4c m4cVar2 = fkj0.X;
                if (objT == m4cVar2) {
                    objT = new yja(xfxVar, iu30Var);
                    x340Var.s0(objT);
                }
                yja yjaVar = (yja) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar2) {
                    objT2 = new qgh1(iu30Var);
                    x340Var.s0(objT2);
                }
                qgh1 qgh1Var = (qgh1) objT2;
                String strO0 = cwl1.o0(x340Var, oh4Var.t() ? 2131959775 : 2131959776);
                c10 c10Var = (c10) lbt0Var.c.get(t80.a);
                if (c10Var != null && (str = c10Var.b) != null) {
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        strO0 = str;
                    }
                }
                boolean zG = x340Var.g(strO0);
                Object objT3 = x340Var.T();
                if (zG || objT3 == m4cVar2) {
                    objT3 = new ehd(strO0, iu30Var);
                    x340Var.s0(objT3);
                }
                ehd ehdVar = (ehd) objT3;
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar2) {
                    objT4 = new kpm1(iu30Var);
                    x340Var.s0(objT4);
                }
                kpm1 kpm1Var = (kpm1) objT4;
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar2) {
                    objT5 = new fvm0(xfxVar, wpv0Var, iu30Var);
                    x340Var.s0(objT5);
                }
                fvm0 fvm0Var = (fvm0) objT5;
                Object objT6 = x340Var.T();
                if (objT6 == m4cVar2) {
                    objT6 = new o191(xfxVar, iu30Var);
                    x340Var.s0(objT6);
                }
                o191 o191Var = (o191) objT6;
                Object objT7 = x340Var.T();
                if (objT7 == m4cVar2) {
                    objT7 = new pi10(xfxVar);
                    x340Var.s0(objT7);
                }
                pi10 pi10Var = (pi10) objT7;
                qim0 qim0VarN = anm1.N("plan-overview-page", uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var), false, 14), vzq0Var));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (imVar.e) {
                    x340Var.i0(709258488);
                    r15 = 0;
                    m4cVar = m4cVar2;
                    otw.c(pi10Var, lbt0Var, (qim0) null, (ipb1) null, x340Var, (i4 << 3) & 112, 12);
                    x340Var.r(false);
                } else {
                    r15 = 0;
                    m4cVar = m4cVar2;
                    x340Var.i0(709353937);
                    int iC = l1d.C(lbt0Var.a.f);
                    if (iC == 0 || iC == 1) {
                        x340Var.i0(709432274);
                        otw.c(o191Var, lbt0Var, (qim0) null, (ipb1) null, x340Var, (i4 << 3) & 112, 12);
                        x340Var.r(false);
                    } else {
                        if (iC != 2 && iC != 3) {
                            throw p3d1.k(x340Var, 22882385, false);
                        }
                        x340Var.i0(709563187);
                        otw.c(fvm0Var, lbt0Var, (qim0) null, (ipb1) null, x340Var, (i4 << 3) & 112, 12);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
                if (oh4Var.H()) {
                    x340Var.i0(709702780);
                    otw.c(qgh1Var, lbt0Var, (qim0) null, (ipb1) null, x340Var, (i4 << 3) & 112, 12);
                    x340Var.r((boolean) r15);
                } else {
                    x340Var.i0(709771011);
                    x340Var.r((boolean) r15);
                }
                int i5 = (i4 << 3) & 112;
                otw.c(yjaVar, lbt0Var, (qim0) null, (ipb1) null, x340Var, i5, 12);
                if (!oh4Var.h() || oh4Var.t() || lbt0Var.f.isEmpty()) {
                    x340Var.i0(709996195);
                    x340Var.r((boolean) r15);
                } else {
                    x340Var.i0(709929886);
                    otw.c(kpm1Var, lbt0Var, (qim0) null, (ipb1) null, x340Var, i5, 12);
                    x340Var.r((boolean) r15);
                }
                if (imVar.a) {
                    x340Var.i0(710074966);
                    lbt0Var2 = lbt0Var;
                    otw.c(ehdVar, lbt0Var2, (qim0) null, (ipb1) null, x340Var, i5, 12);
                    x340Var.r((boolean) r15);
                } else {
                    lbt0Var2 = lbt0Var;
                    x340Var.i0(710148963);
                    x340Var.r((boolean) r15);
                }
                vy71 vy71VarF = dem0.f((int) r15, 3, x340Var, (iu30) null, (boolean) r15);
                Object objT8 = x340Var.T();
                if (objT8 == m4cVar) {
                    objT8 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT8);
                }
                c9n c9nVar = (c9n) objT8;
                if (lbt0Var2.g) {
                    x340Var.i0(710335056);
                    l4o1.h(c9nVar, vy71VarF, lbt0Var2, iu30Var, null, x340Var, (i4 << 6) & 8064);
                    x340Var = x340Var;
                    x340Var.r((boolean) r15);
                } else if (lbt0Var2.h) {
                    x340Var.i0(710472138);
                    y3o1.e(c9nVar, vy71VarF, lbt0Var2, iu30Var, null, x340Var, (i4 << 6) & 8064);
                    x340Var = x340Var;
                    x340Var.r((boolean) r15);
                } else {
                    x340Var.i0(710557667);
                    x340Var.r((boolean) r15);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ibt0(lbt0Var, iu30Var, wpv0Var, xfxVar, vzq0Var, i, (byte) 0);
            }
        }

        public static final void h(tui1 tui1Var, hav0 hav0Var) {
            d18 d18Var = tui1Var.a;
            sui1 sui1Var = (sui1) d18Var.c;
            b0r[] b0rVarArr = sui1Var.d;
            sui1 sui1Var2 = (sui1) d18Var.b;
            b0r[] b0rVarArr2 = sui1Var2.d;
            boolean zI = p8p1.i(hav0Var);
            long j = hav0Var.b;
            if (zI) {
                f46.h0(b0rVarArr2, (Object) null);
                sui1Var2.e = 0;
                f46.h0(b0rVarArr, (Object) null);
                sui1Var.e = 0;
                d18Var.a = 0L;
            }
            if (!p8p1.k(hav0Var)) {
                List listC = hav0Var.c();
                int i = 0;
                for (int size = listC.size(); i < size; size = size) {
                    yg60 yg60Var = (yg60) listC.get(i);
                    d18Var.f(yg60Var.a, Offset.g(yg60Var.e, 0L));
                    i++;
                }
                d18Var.f(j, Offset.g(hav0Var.n, 0L));
            }
            if (p8p1.k(hav0Var) && j - d18Var.a > 40) {
                f46.h0(b0rVarArr2, (Object) null);
                sui1Var2.e = 0;
                f46.h0(b0rVarArr, (Object) null);
                sui1Var.e = 0;
                d18Var.a = 0L;
            }
            d18Var.a = j;
        }

        public static ld70 i(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            HubsImmutableComponentBundle hubsImmutableComponentBundle2 = HubsImmutableComponentBundle.b;
            return new ld70(str, str2, lqc.v(hubsImmutableComponentBundle));
        }

        public static final float j(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            float f = 0.0f;
            for (int i = 0; i < length; i++) {
                f += fArr[i] * fArr2[i];
            }
            return f;
        }

        public static String[] k(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] l(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }

        public static ld70 m(pc70 pc70Var) {
            if (pc70Var instanceof ld70) {
                return (ld70) pc70Var;
            }
            kd70 kd70Var = ((ld70) pc70Var).a;
            return i(kd70Var.c, kd70Var.d, kd70Var.e);
        }

        public static final boolean n(String str) {
            Set set = s4b1.f;
            return uic.h(str, new blc0[]{blc0.g1, blc0.h1, blc0.j1});
        }

        public static final boolean o(String str) {
            Set set = s4b1.f;
            return uic.h(str, new blc0[]{blc0.u1, blc0.A1, blc0.M1});
        }

        public static final boolean p(String str) {
            if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
                return true;
            }
            if ((nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false)) || str.equals("spotify:playlist:37i9dQZF1Fx4l3meNStj7H")) {
                return true;
            }
            Set set = s4b1.f;
            return uic.h(str, new blc0[]{blc0.C4, blc0.D4});
        }

        public static final boolean q(String str) {
            Set set = s4b1.f;
            return uic.h(str, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6});
        }

        public static final boolean r(String str) {
            return nhc1.Y(str, "spotify:listeningstats", false) && !nhc1.Y(str, "spotify:listeningstatsdetails", false);
        }

        public static final boolean s(yyq yyqVar) {
            if (yyqVar instanceof wyq) {
                return ((wyq) yyqVar).b instanceof c3r;
            }
            if (!(yyqVar instanceof uyq)) {
                return false;
            }
            List list = ((uyq) yyqVar).a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (s((yyq) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public static final boolean t(String str) {
            Set set = s4b1.f;
            return uic.i(str, s4b1.g) || uic.g(str, blc0.Yc);
        }

        public static final boolean u(String str) {
            Set set = s4b1.f;
            return uic.g(str, blc0.fh);
        }

        public static final boolean v(String str) {
            return nhc1.Y(str, "spotify:wrapped-share:", false);
        }

        public static final boolean w(String str) {
            return str.equals("spotify:playlist:37i9dQZF1Fx4l3meNStj7H");
        }

        public static final Single x(String str, ddd1 ddd1Var, iyc0 iyc0Var) {
            return rqt0.F(o6x.a, new n0a0(iyc0Var, str, ddd1Var, (lnm) null, (byte) 11));
        }

        public static final af5 y(String str, iu30 iu30Var) {
            Spanned spannedFromHtml = Html.fromHtml(str, 0);
            String string = ihc1.f1(spannedFromHtml.toString()).toString();
            StringBuilder sb = new StringBuilder(16);
            ArrayList arrayListM = xvj1.m();
            new ArrayList();
            sb.append(string);
            for (Object obj : spannedFromHtml.getSpans(0, string.length(), URLSpan.class)) {
                URLSpan uRLSpan = (URLSpan) obj;
                String url = uRLSpan.getURL();
                url.getClass();
                if (nhc1.Y(url, "https://", false)) {
                    arrayListM.add(new xe5(spannedFromHtml.getSpanStart(uRLSpan), Math.min(spannedFromHtml.getSpanEnd(uRLSpan), string.length()), 8, new ljc0(url, new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14), new uhg(iu30Var, url, (byte) 4)), (String) null));
                }
            }
            String string2 = sb.toString();
            ArrayList arrayList = new ArrayList(arrayListM.size());
            int size = arrayListM.size();
            for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
            }
            return new af5(string2, arrayList);
        }

        public static final void z(float[] fArr, float[] fArr2, int i, float[] fArr3) {
            if (i == 0) {
                qf80.a("At least one point must be provided");
            }
            int i2 = 2 >= i ? i - 1 : 2;
            int i3 = i2 + 1;
            float[][] fArr4 = new float[i3][];
            for (int i4 = 0; i4 < i3; i4++) {
                fArr4[i4] = new float[i];
            }
            for (int i5 = 0; i5 < i; i5++) {
                fArr4[0][i5] = 1.0f;
                for (int i6 = 1; i6 < i3; i6++) {
                    fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
                }
            }
            float[][] fArr5 = new float[i3][];
            for (int i7 = 0; i7 < i3; i7++) {
                fArr5[i7] = new float[i];
            }
            float[][] fArr6 = new float[i3][];
            for (int i8 = 0; i8 < i3; i8++) {
                fArr6[i8] = new float[i3];
            }
            int i9 = 0;
            while (i9 < i3) {
                float[] fArr7 = fArr5[i9];
                f46.S(fArr4[i9], fArr7, 0, 0, i);
                for (int i10 = 0; i10 < i9; i10++) {
                    float[] fArr8 = fArr5[i10];
                    float fJ = j(fArr7, fArr8);
                    for (int i11 = 0; i11 < i; i11++) {
                        fArr7[i11] = fArr7[i11] - (fArr8[i11] * fJ);
                    }
                }
                float fSqrt = (float) Math.sqrt(j(fArr7, fArr7));
                if (fSqrt < 1.0E-6f) {
                    fSqrt = 1.0E-6f;
                }
                float f = 1.0f / fSqrt;
                for (int i12 = 0; i12 < i; i12++) {
                    fArr7[i12] = fArr7[i12] * f;
                }
                float[] fArr9 = fArr6[i9];
                int i13 = 0;
                while (i13 < i3) {
                    fArr9[i13] = i13 < i9 ? 0.0f : j(fArr7, fArr4[i13]);
                    i13++;
                }
                i9++;
            }
            for (int i14 = i2; -1 < i14; i14--) {
                float fJ2 = j(fArr5[i14], fArr2);
                float[] fArr10 = fArr6[i14];
                int i15 = i14 + 1;
                if (i15 <= i2) {
                    int i16 = i2;
                    while (true) {
                        fJ2 -= fArr10[i16] * fArr3[i16];
                        if (i16 != i15) {
                            i16--;
                        }
                    }
                }
                fArr3[i14] = fJ2 / fArr10[i14];
            }
        }
    }
