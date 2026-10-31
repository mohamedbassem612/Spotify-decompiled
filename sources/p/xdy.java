package p;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.accountswitching.v1.Account;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class xdy {
    public static final kiv a = new kiv(oxx.h, (byte) 1);
    public static final d261 b = new d261("CardTitleMaxLines");

    public static final void a(o17 o17Var, n6r n6rVar, b0k b0kVar, int i) {
        byte b2;
        boolean z;
        Drawable drawable;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(122505604);
        int i2 = (b0kVar2.i(o17Var) ? 4 : 2) | i | (b0kVar2.i(n6rVar) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = o17Var.a().b instanceof xz6;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarQ = z2 ? i1p1.q(qim0Var, er31.a) : qim0Var;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            zvx zvxVar = null;
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
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            if (!(o17Var instanceof v07) || (drawable = ((v07) o17Var).a) == null) {
                b0kVar2.i0(-202973042);
                String str = o17Var.a().a;
                if (str == null) {
                    str = "";
                }
                Uri uri = Uri.parse(str);
                qim0 qim0VarThen = u291.d(qim0Var, 1.0f).then(qim0VarQ);
                if (z2) {
                    b0kVar2.i0(-202724237);
                } else {
                    b0kVar2.i0(1656029361);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(b0kVar2).f;
                    cua cuaVar2 = cbx.b(b0kVar2).f;
                    zvxVar = new zvx();
                }
                b0kVar2.r(false);
                eso1.e(uri, isl.a, qim0VarThen, null, zvxVar, null, null, null, null, ppo1.l(o17Var, b0kVar2), false, false, b0kVar2, 3120, 0, 3552);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-203213354);
                cwl1.f(x7v.a(drawable, b0kVar2), (String) null, u291.d(qim0Var, 1.0f).then(qim0VarQ), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 24632, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
                b0kVar2.r(false);
            }
            if (n6rVar == null) {
                b0kVar2.i0(-202601632);
                b0kVar2.r(false);
                z = true;
                b2 = 0;
            } else {
                b0kVar2.i0(-202601631);
                z = true;
                b2 = 0;
                r4p1.c(n6rVar, h2c.a.b(qim0Var), "CardDateOverlayTestTag", b0kVar2, 384, 0);
                b0kVar2.r(false);
            }
            b0kVar2.r(z);
        } else {
            b2 = 0;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new udy(o17Var, n6rVar, i, b2);
        }
    }

    public static final void b(String str, boolean z, boolean z2, boolean z3, b0k b0kVar, int i) {
        x340 x340Var;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1229696183);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.h(z3) ? 2048 : 1024);
        if (!x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else if (z2) {
            x340Var = x340Var2;
            x340Var.i0(2103490571);
            x340Var.r(false);
        } else {
            x340Var2.i0(2103068692);
            int i3 = z3 ? 2 : 1;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).j;
            if (z) {
                x340Var2.i0(622035523);
                j = cbx.a(x340Var2).b.c;
            } else {
                x340Var2.i0(622036763);
                j = cbx.a(x340Var2).b.a;
            }
            x340Var2.r(false);
            cjc0 cjc0Var = new cjc0(i3);
            qim0 qim0VarN = anm1.N("CardTitleTestTag", nim0.a);
            boolean zE = x340Var2.e(i3);
            Object objT = x340Var2.T();
            if (zE || objT == fkj0.X) {
                objT = new uv4(i3, (byte) 26);
                x340Var2.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarN, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, (i2 & 14) | 1572864, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vdy(str, z, z2, z3, i, (byte) 0);
        }
    }

    public static final void c(zdy zdyVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        byte b2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2023836824);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(zdyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131957306);
            qim0 qim0VarN = anm1.N("EntityCardComposeTestTag", pqo.h(nim0.a, zdyVar.i));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx(2.0f, 0.0f, 12.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), wdx.a);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new y9y(iu30Var, (byte) 8);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            boolean z2 = i3 == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new y9y(iu30Var, (byte) 9);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(strO0), function0);
            String str = zdyVar.g;
            Set set = zdyVar.m;
            xu30 j2iVar = ((str == null || ihc1.y0(str)) && !j9k1.v(set)) ? null : new j2i(6303419, new o3(set, str, zdyVar.l, (byte) 14), true);
            fgx0 fgx0Var = zdyVar.e;
            String str2 = zdyVar.n;
            int i4 = fgx0Var.b;
            boolean z3 = i4 == 2 || (i4 == 3 && fgx0Var.a > 0 && fgx0Var.c > 0);
            b0kVar2 = b0kVar3;
            b2 = 1;
            ioo1.c(qim0VarN, (pgx) null, ydxVar, (hw61) null, (max) null, (idn0) null, (ga80) null, gbxVar, gbxVar2, apo.r(-859244787, new wdy(zdyVar, (byte) 0), b0kVar3), (xu30) null, (xu30) null, j2iVar, (xu30) null, (xu30) null, (z3 || !(str2 == null || ihc1.y0(str2))) ? new j2i(997362833, new o3((byte) 13, fgx0Var, str2, z3), true) : null, apo.r(-611313133, new wdy(zdyVar, (byte) 1), b0kVar3), b0kVar2, 805306880, 1572864, 27770);
        } else {
            b0kVar2 = b0kVar3;
            b2 = 1;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new say(zdyVar, iu30Var, i, b2);
        }
    }
}
