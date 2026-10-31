package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ky01 implements tyq {
    public final Context a;
    public final bz00 b;
    public final d0r c;
    public final o3r d;
    public final iik0 e;
    public final js20 f;
    public final eih1 g;
    public final jd6 h;
    public final psw i;

    public ky01(Context context, bct bctVar, v6q v6qVar, bz00 bz00Var) {
        this.a = context;
        this.b = bz00Var;
        d0r d0rVar = bctVar.b;
        this.c = d0rVar;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 1, zx01.T0, new j4r(zx01.t), zx01.U0), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, zx01.N0, new j4r(zx01.X), zx01.O0), new l4r(new wlu(jd11Var.b(hll.class)), 2, zx01.P0, new j4r(zx01.Y), zx01.Q0), new l4r(pwc0.s, 2, zx01.R0, new j4r(zx01.Z), zx01.S0), new h8x0(4, this, ky01.class, "mapToKodiakState", "mapToKodiakState(Lcom/spotify/extendedmetadata/extensions/foundationaltraits/identitytrait/IdentityTrait;Lcom/spotify/extendedmetadata/extensions/foundationaltraits/visualidentitytrait/VisualIdentityTrait;Lcom/spotify/extendedmetadata/extensions/foundationaltraits/consumptionexperiencetrait/ConsumptionExperienceTrait;Lcom/spotify/playability/playability/PlayabilityRestrictionTable$PlayabilityRestriction;)Lcom/spotify/listuxplatformconsumers/standard/sections/extender/viewelement/child/RecommendationItemElementImpl$KodiakState;", 0, (byte) 10));
        this.e = new iik0((Object) this, (byte) 14);
        this.f = z0o1.j(new iy01(this, (byte) 0), atz0.a1, new iy01(this, (byte) 1), 4);
        this.g = new eih1();
        this.h = v6qVar.a(d0rVar, new bz0(3, null, (byte) 25));
        j2i j2iVar = new j2i(-793054202, new dr01(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.i;
    }

    public final d0r e() {
        return this.c;
    }

    public final void f(int i, String str, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(87636643);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            Uri uri = (str == null || ihc1.y0(str)) ? Uri.EMPTY : Uri.parse(str);
            uri.getClass();
            as80 as80Var = mif1.P0;
            qim0 qim0VarR = d7e.r(1.0f, u291.c(qim0Var, 1.0f), false);
            ltx ltxVar = ltx.c;
            b0kVar2 = b0kVar3;
            eso1.e(uri, isl.a, qim0VarR, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, b0kVar2, 1073744944, 0, 3504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(this, str, qim0Var, i, (byte) 23);
        }
    }

    public final void g(gy01 gy01Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-381121646);
        int i2 = i | (b0kVar3.g(gy01Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(this) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            gra graVar = een.i;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = u291.B(nim0Var, graVar, 2);
            jw31 jw31VarA = ew31.a(h36.b, fraVar, b0kVar3, 0);
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
            if (gy01Var.c) {
                b0kVar3.i0(1417801286);
                b0kVar2 = b0kVar3;
                i1o1.e(this.h, new r7k0(gy01Var.d), this.c, (qim0) null, (ipb1) null, icj.a, (xu30) null, 0, (xu30) null, b0kVar2, 196672, 236);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(1417968500);
                b0kVar2.r(false);
            }
            h7p1.a(new pk1(qk1.a, false, gy01Var.b, this.a.getString(2131959991), (j7p1) null, 18), new gbx(z50.c, function0), anm1.N("playlist_extender_add_button", nim0Var), (max) null, yla.s(b0kVar2), b0kVar2, 0, 8);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0((byte) 24, i, this, gy01Var, function0);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }

    public final f4r getData() {
        return this.e;
    }
}
