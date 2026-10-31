package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hou0 implements xpw {
    public static final PlaylistRequestDecorationPolicy g;
    public final xrc0 a;
    public final lzn0 b;
    public final g7q c;
    public final js20 d = x3p1.n(new fou0(this, (byte) 0), rku0.W0, fnt0.U0, (o8n) null, new fou0(this, (byte) 1), 8);
    public final ia00 e = n3o1.q(this).a(gou0.b, gou0.c);
    public final psw f;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setName(true).setLink(true));
        vwu0VarR.u(ArtistDecorationPolicy.newBuilder().setName(true).build());
        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
        dgu0VarP.q(AlbumDecorationPolicy.newBuilder().setCovers(true).build());
        vwu0VarR.r(dgu0VarP.build());
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.r();
        i8i1VarO.s();
        i8i1VarO.u();
        i8i1VarO.t();
        i8i1VarO.n();
        vwu0VarR.q(i8i1VarO.build());
        hru0VarS.y(vwu0VarR.build());
        g = hru0VarS.build();
    }

    public hou0(xrc0 xrc0Var, lzn0 lzn0Var, g7q g7qVar) {
        this.a = xrc0Var;
        this.b = lzn0Var;
        this.c = g7qVar;
        j2i j2iVar = new j2i(-774636751, new t9r0(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final void e(String str, x4i1 x4i1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(353229085);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(x4i1Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            cr31 cr31Var = er31.a;
            qim0 qim0Var3 = nim0.a;
            kno1.e(cr31Var, apo.r(1026868264, new t1t0(x4i1Var, (byte) 16), x340Var), anm1.N("header_artwork", qim0Var3), apo.r(-89099862, new psr0(str, (byte) 16), x340Var), x340Var, 25008, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, this, str, x4i1Var, qim0Var2, (byte) 20);
        }
    }

    public final void f(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1719494105);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("bold_header_title", u291.f(qim0Var3, 1.0f));
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).h, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, i2 & 14, 0, 1696);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bou0(this, str, qim0Var2, i, (byte) 0);
        }
    }

    public final void g(aou0 aou0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        sh21 sh21Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1007301014);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(aou0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x4i1 x4i1Var = aou0Var.c;
            String str = aou0Var.e;
            String str2 = aou0Var.d;
            String str3 = aou0Var.f;
            if (x4i1Var == null || str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
                x340Var.i0(432664632);
                x340Var.r(false);
            } else {
                x340Var.i0(432328282);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    smt0 smt0Var = new smt0(iu30Var, (byte) 10);
                    g7q g7qVar = this.c;
                    switch (g7qVar.a) {
                        case 0:
                            s7q s7qVar = g7qVar.b.d;
                            sh21Var = new sh21((h7q) s7qVar.Xf.get(), (o7q) s7qVar.Yf.get(), (p7q) s7qVar.Zf.get(), smt0Var);
                            break;
                        default:
                            teq teqVar = g7qVar.b.d;
                            sh21Var = new sh21((h7q) teqVar.M1.get(), (o7q) teqVar.N1.get(), (p7q) teqVar.Q1.get(), smt0Var);
                            break;
                    }
                    objT = sh21Var;
                    x340Var.s0(objT);
                }
                otw.c((sh21) objT, new mh21(x4i1Var, str, str2, str3), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(this, aou0Var, iu30Var, i, (byte) 25);
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    public final void h(aou0 aou0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        String str;
        af5 af5VarZ;
        af5 af5VarP;
        j2i j2iVarR;
        znu0 znu0Var = aou0Var.a;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-598895697);
        int i2 = i | (b0kVar3.i(aou0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(this) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            x4i1 x4i1Var = aou0Var.c;
            xu30 xu30VarR = null;
            String str2 = znu0Var != null ? znu0Var.a : null;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new azr0(iu30Var, (byte) 21);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            b0kVar3.i0(680870101);
            if (znu0Var != null) {
                str = znu0Var.b;
                if (str.length() == 0) {
                    str = null;
                }
            } else {
                str = null;
            }
            b0kVar3.i0(2146062834);
            if (x4i1Var == null) {
                b0kVar3.r(false);
                af5VarZ = null;
            } else {
                String str4 = x4i1Var.h;
                uwr uwrVar = cbx.a;
                zma1 zma1Var = new zma1(cbx.a(b0kVar3).b.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
                boolean zG = b0kVar3.g(iu30Var2) | b0kVar3.i(x4i1Var);
                Object objT2 = b0kVar3.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new aft0(iu30Var2, x4i1Var, (byte) 21);
                    b0kVar3.s0(objT2);
                }
                af5VarZ = wmo1.z(2131960055, str4, "attributedUser", zma1Var, (iu30) objT2, b0kVar3);
                b0kVar3.r(false);
            }
            if (str == null && af5VarZ == null) {
                b0kVar3.r(false);
                af5VarP = null;
            } else {
                ye5 ye5Var = new ye5();
                if (str != null) {
                    ye5Var.g(str);
                }
                if (str != null && af5VarZ != null) {
                    ye5Var.g(" • ");
                }
                if (af5VarZ != null) {
                    ye5Var.h(af5VarZ);
                }
                af5VarP = ye5Var.p();
                b0kVar3.r(false);
            }
            String str5 = aou0Var.b;
            boolean z2 = af5VarP == null && str5 == null;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(nim0.a, 16.0f, 8.0f);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = rku0.V0;
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarY, true, (iu30) objT3);
            uvx uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), z2 ? 1 : 3, null, null, 27);
            if (str5 == null || x4i1Var == null) {
                b0kVar3.i0(-406632114);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-406709303);
                j2iVarR = apo.r(1257847813, new hho0(this, str5, x4i1Var, (byte) 5), b0kVar3);
                b0kVar3.r(false);
            }
            if (af5VarP == null) {
                b0kVar3.i0(-406497574);
            } else {
                b0kVar3.i0(-406497573);
                xu30VarR = apo.r(-122242791, new ukm0(this, af5VarP, (byte) 28), b0kVar3);
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, uvxVarB, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, j2iVarR, (xu30) null, xu30VarR, (xu30) null, (xu30) null, (xu30) null, apo.r(-1424321557, new n8k0(z2, this, str3, (byte) 5), b0kVar3), b0kVar2, 64, 196608, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(this, aou0Var, iu30Var, i, (byte) 16);
        }
    }

    public final void i(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-709246062);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("regular_header_title", qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, i2 & 14, 0, 1712);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bou0(this, str, qim0Var2, i, (byte) 1);
        }
    }

    public final void j(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-681999660);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(4.0f);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("shimmer_list_row", uyn1.y(qim0Var3, 16.0f, 8.0f)), uvx.b((uvx) b0kVar3.k(vvx.a), 3, null, null, 27), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(147890365, new q9e0(cr31VarB, (byte) 1), b0kVar3), (xu30) null, apo.r(546130076, new q9e0(cr31VarB, (byte) 2), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(-500397544, new q9e0(cr31VarB, (byte) 3), b0kVar3), b0kVar2, 805306432, 196656, 30204);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(this, qim0Var2, i, (byte) 11);
        }
    }

    public final void k(af5 af5Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-436696678);
        int i2 = i | (x340Var.i(af5Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("header_subtitle", qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.d(af5Var, cbx.a(x340Var).b.b, qim0VarN, cbx.d(x340Var).j, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (cqs0) null, x340Var, i2 & 14, 0, 3760);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(this, af5Var, qim0Var2, i, (byte) 17);
        }
    }
}
