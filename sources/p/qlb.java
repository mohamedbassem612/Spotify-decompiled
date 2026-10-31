package p;

import android.net.Uri;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qlb implements tyq, cvl1 {
    public final /* synthetic */ byte a;
    public final d0r b;
    public final Object c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public qlb(aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, gw70 gw70Var, lo60 lo60Var, fza fzaVar, vgm vgmVar, nwt nwtVar, dnc dncVar, ytp0 ytp0Var, clm clmVar, tbw0 tbw0Var, iuj iujVar, d0r d0rVar, w6e0 w6e0Var, gei0 gei0Var) {
        this.a = (byte) 8;
        this.b = d0rVar;
        this.e = (kko) w6e0Var.b;
        Function0 function0 = (Function0) w6e0Var.d;
        Function0 function1 = (Function0) w6e0Var.e;
        this.c = (vu30) w6e0Var.c;
        idd1 idd1Var = new idd1(new oai0(ycmVar, (byte) 2));
        idd1 idd1Var2 = new idd1(new z8i0(this, (byte) 5));
        idd1 idd1Var3 = new idd1(new qai0(myq0Var, (byte) 2));
        idd1 idd1Var4 = new idd1(new sai0(aru0Var, this, (byte) 3));
        this.g = x3p1.n(new ntf0(this, nwtVar, clmVar, gei0Var, (byte) 9), qci0.P0, new rvg0(fzaVar, ytp0Var, this, (byte) 14), (o8n) null, new ntf0(lo60Var, vgmVar, dncVar, this, (byte) 10), 8);
        this.h = n3o1.q(this).a(h40.U0, ytg0.W0);
        j2i j2iVar = new j2i(-2117227442, new kei0(gei0Var, aru0Var2, gw70Var, tbw0Var, function0, function1, iujVar, idd1Var4, idd1Var2, idd1Var3, idd1Var), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        jd11 jd11Var = rc11.a;
        this.f = w3p1.k(new l4r(new xv00(jd11Var.b(nbw0.class)), 1, qci0.Z0, new j4r(qci0.Q0), qci0.a1), new l4r(new xv00(jd11Var.b(yo60.class)), 1, qci0.b1, new j4r(qci0.R0), qci0.c1), new l4r(new xv00(jd11Var.b(jo70.class)), 1, qci0.d1, new j4r(qci0.S0), qci0.e1), new l4r(new xv00(jd11Var.b(prl.class)), 2, qci0.V0, new j4r(qci0.T0), qci0.W0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, qci0.X0, new j4r(qci0.U0), qci0.Y0), qsj.Q0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (eih1) this.h;
            case 1:
                return (ia00) this.h;
            case 2:
                return (ia00) this.g;
            case 3:
                return (ia00) this.h;
            case 4:
                return (ia00) this.h;
            case 5:
                return (hy00) this.h;
            case 6:
                return (hy00) this.h;
            case 7:
                return (eih1) this.h;
            case 8:
                return (ia00) this.h;
            case 9:
                return (hy00) this.h;
            case 10:
                return (ia00) this.h;
            case 11:
                return (eih1) this.h;
            case 12:
                return (eih1) this.h;
            case 13:
                return (eih1) this.h;
            case 14:
                return (eih1) this.h;
            case 15:
                return (ia00) this.h;
            case 16:
                return (ia00) this.h;
            case 17:
                return (ia00) this.h;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (eih1) this.h;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (ia00) this.g;
            case 20:
                return (eih1) this.h;
            default:
                return (eih1) this.h;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                break;
            case 20:
                break;
        }
        return this.d;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public void f(rem remVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-546783485);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(remVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = remVar.b;
            if (str == null) {
                str = "";
            }
            String strN0 = cwl1.n0(2131962893, new Object[]{str}, x340Var);
            qim0 qim0VarN = anm1.N("standard_context_menu_element_button", nim0.a);
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new jzk(iu30Var, (byte) 17);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strN0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strN0), function0), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-434523238, new pji(strN0, (byte) 19), x340Var), x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, remVar, iu30Var, i, (byte) 13);
        }
    }

    public void g(int i, b0k b0kVar, int i2) {
        zkt0 zkt0Var;
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-196492506, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                zkt0Var = zkt0.c;
            } else if (iC == 1) {
                zkt0Var = zkt0.b;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                zkt0Var = zkt0.a;
            }
            zkt0 zkt0Var2 = zkt0Var;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            wkt0.a(zkt0Var2, anm1.N("music_podcast_chapter_item_list_row_title_play_indicator", u291.r(nim0.a, 12.0f)), (ksl) null, 0L, false, x340Var, 0, 28);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i, i2, (byte) 14);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (js20) this.g;
            case 1:
                return (rey0) this.g;
            case 2:
                return (rey0) this.c;
            case 3:
                return (js20) this.g;
            case 4:
                return (js20) this.g;
            case 5:
                return (js20) this.g;
            case 6:
                return (js20) this.g;
            case 7:
                return (js20) this.g;
            case 8:
                return (js20) this.g;
            case 9:
                return (js20) this.g;
            case 10:
                return (js20) this.g;
            case 11:
                return (js20) this.g;
            case 12:
                return (js20) this.g;
            case 13:
                return (js20) this.g;
            case 14:
                return (rey0) this.g;
            case 15:
                return (js20) this.g;
            case 16:
                return (rey0) this.g;
            case 17:
                return (js20) this.g;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (js20) this.g;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (ljm0) this.c;
            case 20:
                return (js20) this.g;
            default:
                return (js20) this.g;
        }
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return (f4r) this.c;
            case 1:
                return (f4r) this.c;
            case 2:
                return (km1) this.h;
            case 3:
                return (o3r) this.f;
            case 4:
                return (km1) this.c;
            case 5:
                return (km1) this.c;
            case 6:
                return (km1) this.c;
            case 7:
                return (km1) this.c;
            case 8:
                return (o3r) this.f;
            case 9:
                return (o3r) this.f;
            case 10:
                return (o3r) this.f;
            case 11:
                return (iik0) this.c;
            case 12:
                return (iik0) this.c;
            case 13:
                return (f4r) this.c;
            case 14:
                return (iik0) this.c;
            case 15:
                return (o3r) this.f;
            case 16:
                return (f4r) this.c;
            case 17:
                return (o3r) this.f;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (iik0) this.c;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (o3r) this.h;
            case 20:
                return (iik0) this.c;
            default:
                return (f4r) this.c;
        }
    }

    public void h(int i, b0k b0kVar, int i2) {
        zkt0 zkt0Var;
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(434921712, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                zkt0Var = zkt0.c;
            } else if (iC == 1) {
                zkt0Var = zkt0.b;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                zkt0Var = zkt0.a;
            }
            zkt0 zkt0Var2 = zkt0Var;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            wkt0.a(zkt0Var2, anm1.N("music_episode_item_list_row_title_play_indicator", u291.r(nim0.a, 12.0f)), (ksl) null, 0L, false, x340Var, 0, 28);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i, i2, (byte) 13);
        }
    }

    public void i(int i, b0k b0kVar, int i2) {
        zkt0 zkt0Var;
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(2132296478, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                zkt0Var = zkt0.c;
            } else if (iC == 1) {
                zkt0Var = zkt0.b;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                zkt0Var = zkt0.a;
            }
            zkt0 zkt0Var2 = zkt0Var;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            wkt0.a(zkt0Var2, anm1.N("standard_item_list_row_title_play_indicator", u291.r(nim0.a, 12.0f)), (ksl) null, 0L, false, x340Var, 0, 28);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i, i2, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void j(v2n0 v2n0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1855653714);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(v2n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = v2n0Var.a;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            int iC = l1d.C(v2n0Var.b);
            if (iC == 0) {
                x340Var.i0(-871783598);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(-871782118);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -871785463, false);
                }
                x340Var.i0(-871780358);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            }
            long j2 = j;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = czm0.S0;
                x340Var.s0(objT);
            }
            uwo1.e(str, (qim0) null, lee1Var, j2, (a0e1) null, (iu30) null, 2, false, new ajc0((iu30) objT), 0, (qx8) null, x340Var, 0, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, v2n0Var, i, (byte) 15);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void k(p4n0 p4n0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        long j;
        String str = p4n0Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(270929448);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(p4n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(this) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strY0 = p4n0Var.a;
            if (str.length() == 0) {
                b0kVar3.i0(-1629802189);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1629799845);
                List listM = p7h.M(new String[]{strY0, str});
                if (b0kVar3.k(t4k.n) == flb0.b) {
                    listM = o7h.T0(listM);
                }
                strY0 = o7h.y0(listM, " - ", (String) null, (String) null, (iu30) null, 62);
                b0kVar3.r(false);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).g;
            int iC = l1d.C(p4n0Var.c);
            if (iC == 0) {
                b0kVar3.i0(-1629792372);
                j = cbx.a(b0kVar3).b.a;
                b0kVar3.r(false);
            } else if (iC == 1) {
                b0kVar3.i0(-1629790892);
                j = cbx.a(b0kVar3).b.c;
                b0kVar3.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(b0kVar3, -1629794237, false);
                }
                b0kVar3.i0(-1629789132);
                j = cbx.a(b0kVar3).b.c;
                b0kVar3.r(false);
            }
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = k4n0.h;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            uwo1.e(strY0, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, new ajc0((iu30) objT), 0, (qx8) null, b0kVar2, 0, 0, 1714);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, p4n0Var, i, (byte) 18);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void l(kfb1 kfb1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1892402464);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kfb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = kfb1Var.a;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            int iC = l1d.C(kfb1Var.c);
            if (iC == 0) {
                x340Var.i0(1827609444);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1827610924);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1827607579, false);
                }
                x340Var.i0(1827612684);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            }
            long j2 = j;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = seb1.Q0;
                x340Var.s0(objT);
            }
            uwo1.e(str, (qim0) null, lee1Var, j2, (a0e1) null, (iu30) null, 2, false, new ajc0((iu30) objT), 0, (qx8) null, x340Var, 0, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(this, kfb1Var, i, (byte) 3);
        }
    }

    public void m(String str, boolean z, ecx ecxVar, b0k b0kVar, int i) {
        Object puxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1883537262);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(ecxVar) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            if (z) {
                x340Var.i0(1289371991);
                box boxVar = box.c;
                uwr uwrVar = cbx.a;
                fwx fwxVarG = hso1.G(boxVar, 0L, cbx.a(x340Var).a.a.a(), x340Var, box.d, 22);
                puxVar = new pux(fwxVarG, fwxVarG);
                x340Var.r(false);
            } else {
                x340Var.i0(1289587875);
                x340Var.r(false);
                puxVar = oux.a;
            }
            mod.b(oi7.a.a((gw70) this.e), apo.r(-689941166, new pej1(uri, ecxVar, puxVar, (byte) 9), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(this, str, z, ecxVar, i, (byte) 13);
        }
    }

    public qlb(d0r d0rVar, maa maaVar, o3r o3rVar) {
        i13 mchVar;
        this.a = (byte) 21;
        this.b = d0rVar;
        this.e = maaVar;
        this.f = o3rVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVar);
        tyq tyqVar = maaVar instanceof tyq ? (tyq) maaVar : null;
        if (tyqVar != null) {
            arrayList.add(tyqVar.getData());
        }
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.g = z0o1.j(new a9z(this, (byte) 1), olj1.Y0, (iu30) null, 12);
        this.h = new eih1();
        j2i j2iVar = new j2i(1555697, new l6i1(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(gw70 gw70Var, nwt nwtVar, lo60 lo60Var, vgm vgmVar, iuj iujVar, Function0 function0, l0x0 l0x0Var, d0r d0rVar, o3r o3rVar, ptf1 ptf1Var) {
        this.a = (byte) 19;
        this.e = nwtVar;
        this.b = d0rVar;
        this.f = o3rVar;
        this.c = h7w.D(dw81.S0, (bs50) null, (iu30) null, new j2i(156153686, new a6j1(new ymg1(this, (byte) 28), lo60Var, vgmVar), true), 6);
        this.g = n3o1.q(this).a(bnx0.X, new bii0(l0x0Var, (byte) 2));
        j2i j2iVar = new j2i(-80158794, new hef0(function0, (sjf1) ptf1Var.b, gw70Var, iujVar, (idm) ptf1Var.c, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.h = o3rVar;
    }

    public qlb(d0r d0rVar, lzn0 lzn0Var) {
        this.a = (byte) 4;
        this.b = d0rVar;
        this.e = lzn0Var;
        jd11 jd11Var = rc11.a;
        this.f = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 2, bmh.Q0, new j4r(bmh.O0), bmh.R0), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, bmh.S0, new j4r(bmh.P0), bmh.T0), gsh.e);
        this.c = new km1(this, (byte) 11);
        this.h = n3o1.q(this).a(a8h.f, a8h.g);
        this.g = x3p1.n(new buh(this, (byte) 0), bmh.N0, gsh.d, (o8n) null, new buh(this, (byte) 1), 8);
        j2i j2iVar = wdi.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(d0r d0rVar, hpc hpcVar, String str) {
        i13 mchVar;
        this.a = (byte) 1;
        this.b = d0rVar;
        this.e = hpcVar;
        this.f = str;
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.g = new rey0(new gaa(this, (byte) 28));
        this.h = n3o1.q(this).a(s1b.e1, emd.b);
        j2i j2iVar = new j2i(1962148447, new zk9(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(v6q v6qVar, d0r d0rVar) {
        this.a = (byte) 7;
        this.b = d0rVar;
        this.e = v6qVar.a(d0rVar, new bz0(3, (lnm) null, (byte) 15));
        jd11 jd11Var = rc11.a;
        this.f = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, rab0.X0, new j4r(rab0.V0), rab0.Y0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, rab0.Z0, new j4r(rab0.W0), rab0.a1), k9b0.P0);
        this.c = new km1(this, (byte) 24);
        this.g = x3p1.n(new pdb0(this, (byte) 3), rab0.U0, k9b0.O0, (o8n) null, (iu30) null, 24);
        this.h = new eih1();
        j2i j2iVar = new j2i(1385730279, new pba0(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(ahr ahrVar, d0r d0rVar) {
        i13 mchVar;
        this.a = (byte) 0;
        this.e = ahrVar;
        this.b = d0rVar;
        jd11 jd11Var = rc11.a;
        o3r o3rVarN = w3p1.n(new l4r(new xv00(jd11Var.b(zc8.class)), 1, c7b.X0, new j4r(c7b.T0), c7b.Y0), new l4r(new xv00(jd11Var.b(zoy0.class)), 2, c7b.V0, new j4r(c7b.U0), c7b.W0), vq9.a1);
        this.f = o3rVarN;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(c7b.S0, o3rVarN));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.g = x3p1.n(new tla(this, (byte) 12), c7b.R0, new cka(this, (byte) 9), (o8n) null, (iu30) null, 24);
        this.h = new eih1();
        j2i j2iVar = l9i.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(d0r d0rVar, njm njmVar, lwm lwmVar) {
        this.a = (byte) 3;
        this.b = d0rVar;
        this.e = njmVar;
        this.c = lwmVar;
        jd11 jd11Var = rc11.a;
        this.f = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 2, tpg.U0, new j4r(tpg.S0), tpg.V0), new l4r(new wlu(jd11Var.b(xkk1.class)), 3, tpg.W0, new j4r(tpg.T0), tpg.X0), rng.h);
        this.g = z0o1.j(new jyg(this, (byte) 0), kyg.a, new jyg(this, (byte) 1), 4);
        this.h = n3o1.q(this).a(new zee(this, (byte) 16), r0f.X0);
        j2i j2iVar = hdi.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(d0r d0rVar, a1r0 a1r0Var, gw70 gw70Var, qlb qlbVar) {
        i13 mchVar;
        this.a = (byte) 16;
        this.b = d0rVar;
        this.e = gw70Var;
        this.f = qlbVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(zx01.X0, (o3r) qlbVar.f));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.g = new rey0(new ac8(3, (byte) 27));
        this.h = n3o1.q(this).a(new aaq0((Object) this, (byte) 11), new aaq0(4, (byte) 12));
        j2i j2iVar = new j2i(368008019, new dr01(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(ynb0 ynb0Var, gw70 gw70Var, d0r d0rVar) {
        this.a = (byte) 17;
        this.e = ynb0Var;
        this.c = gw70Var;
        this.b = d0rVar;
        jd11 jd11Var = rc11.a;
        this.f = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, hm11.g, new j4r(hm11.c), hm11.h), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, hm11.e, new j4r(hm11.d), hm11.f), h211.T0);
        this.g = x3p1.n(new gm11(this, (byte) 0), hm11.b, h211.S0, (o8n) null, new gm11(this, (byte) 1), 8);
        this.h = new ia00("RelatedPlaylistCardElement", ok11.i, ok11.t);
        j2i j2iVar = new j2i(1652229332, new dr01(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(d0r d0rVar, xzq xzqVar, o3r o3rVar) {
        i13 mchVar;
        this.a = (byte) 13;
        this.b = d0rVar;
        this.e = xzqVar;
        this.f = o3rVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVar);
        arrayList.add(xzqVar.getData());
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.g = z0o1.j(new za8(this, (byte) 1), ofo0.c1, (iu30) null, 12);
        this.h = new eih1();
        j2i j2iVar = new j2i(-949862923, new aso0(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(d0r d0rVar, gw70 gw70Var, lzn0 lzn0Var) {
        this.a = (byte) 15;
        this.b = d0rVar;
        this.e = lzn0Var;
        this.c = gw70Var;
        jd11 jd11Var = rc11.a;
        this.f = w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 1, zx01.h, new j4r(jt01.e1), zx01.i), new l4r(new xv00(jd11Var.b(gw81.class)), 2, zx01.d, new j4r(zx01.b), zx01.e), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, zx01.f, new j4r(zx01.c), zx01.g), krz0.f);
        this.g = z0o1.j(new yx01(this, (byte) 0), atz0.Z0, new yx01(this, (byte) 1), 4);
        this.h = n3o1.q(this).a(rw01.f, rw01.g);
        j2i j2iVar = new j2i(-335562300, new dr01(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(d0r d0rVar, gza gzaVar, tji0 tji0Var) {
        this.a = (byte) 9;
        this.b = d0rVar;
        this.e = gzaVar;
        this.c = tji0Var;
        this.f = w3p1.o(new l4r(new wlu(rc11.a.b(jo70.class)), 2, fii0.t, new j4r(fii0.h), fii0.X), fii0.i);
        this.g = x3p1.n(new yji0(this, (byte) 0), fii0.g, ish0.T0, (o8n) null, new yji0(this, (byte) 1), 8);
        this.h = n3o1.r(this).c(ytg0.Z0, ytg0.a1);
        j2i j2iVar = h0j.b;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(d0r d0rVar, String str, o3o o3oVar) {
        this.a = (byte) 14;
        this.b = d0rVar;
        this.e = str;
        this.f = o3oVar.a(new h2y0(this, (byte) 3));
        this.c = new iik0(this, (byte) 13);
        this.g = k1o1.p();
        this.h = new eih1();
        j2i j2iVar = new j2i(-867326745, new qsu0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(gw70 gw70Var, d0r d0rVar) {
        this.a = (byte) 20;
        this.e = gw70Var;
        this.b = d0rVar;
        this.f = w3p1.o(new l4r(new xv00(rc11.a.b(xkk1.class)), 2, a0k1.t, new j4r(a0k1.Y), a0k1.X), a0k1.Z);
        this.c = new iik0(this, (byte) 29);
        this.g = x3p1.n(new xaj1(this, (byte) 24), a0k1.i, olj1.Z, (o8n) null, (iu30) null, 24);
        j2i j2iVar = new j2i(1750244088, new l6i1(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.h = new eih1();
    }

    public qlb(vgm vgmVar, d0r d0rVar, o8n o8nVar) {
        this.a = (byte) 5;
        this.e = vgmVar;
        this.b = d0rVar;
        hvm hvmVar = hvm.d;
        l4r l4rVar = new l4r(hvmVar, 2, rbm.Q0, new j4r(rbm.h), rbm.R0);
        l4r l4rVar2 = new l4r(hvm.b, 2, rbm.S0, new j4r(rbm.i), rbm.T0);
        l4r l4rVar3 = new l4r(hvmVar, 2, rbm.U0, new j4r(rbm.t), rbm.V0);
        l4r l4rVar4 = new l4r(pwc0.r, 2, rbm.W0, new j4r(rbm.X), rbm.X0);
        jd11 jd11Var = rc11.a;
        this.f = w3p1.j(l4rVar, l4rVar2, l4rVar3, l4rVar4, new l4r(new xv00(jd11Var.b(jo70.class)), 2, rbm.Y0, new j4r(rbm.Y), rbm.N0), new l4r(new xv00(jd11Var.b(hll.class)), 2, rbm.O0, new j4r(rbm.Z), rbm.P0), mcm.b);
        this.c = new km1(this, (byte) 12);
        this.g = a4p1.h(new kcm(this, (byte) 0), rbm.g, new sqk(this, (byte) 2), o8nVar, new kcm(this, (byte) 1));
        this.h = n3o1.r(this).c(ngl.b1, ngl.c1);
        j2i j2iVar = sfi.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public qlb(r3p r3pVar, d0r d0rVar) {
        this.a = (byte) 2;
        this.e = r3pVar;
        this.b = d0rVar;
        this.f = new idd1(new ptb(this, (byte) 20));
        this.c = k1o1.p();
        this.g = n3o1.q(this).a(emd.Q0, emd.R0);
        j2i j2iVar = new j2i(-537282144, new gtd(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.h = new km1(this, (byte) 8);
    }

    public qlb(d0r d0rVar, String str, byte b) {
        this.a = b;
        switch (b) {
            case 12:
                this.e = str;
                this.b = d0rVar;
                this.f = w3p1.n(new l4r(new wlu(rc11.a.b(jo70.class)), 1, k4n0.Y, new j4r(k4n0.i), k4n0.Z), new l4r(pwc0.d, 2, k4n0.t, new j4r(new s4n0(this, (byte) 1)), k4n0.X), new afm0(this, (byte) 10));
                this.c = new iik0(this, (byte) 8);
                this.g = z0o1.j(new s4n0(this, (byte) 0), dbm0.d1, (iu30) null, 12);
                this.h = new eih1();
                j2i j2iVar = new j2i(-139429195, new hmk0(this, (byte) 17), true);
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = d0rVar;
                this.e = str;
                this.f = w3p1.n(new l4r(new wlu(rc11.a.b(jo70.class)), 1, czm0.W0, new j4r(czm0.T0), czm0.X0), new l4r(pwc0.d, 2, czm0.U0, new j4r(new y2n0(this, (byte) 1)), czm0.V0), new afm0(this, (byte) 9));
                this.c = new iik0(this, (byte) 6);
                this.g = z0o1.j(new y2n0(this, (byte) 0), dbm0.Z0, (iu30) null, 12);
                this.h = new eih1();
                j2i j2iVar2 = new j2i(-145150463, new hmk0(this, (byte) 14), true);
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public qlb(d0r d0rVar, jq4 jq4Var, byte b) {
        this.a = b;
        switch (b) {
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                this.b = d0rVar;
                this.e = jq4Var.w() ? d0rVar : null;
                this.c = new iik0(this, (byte) 22);
                this.f = w3p1.n(new l4r(new wlu(rc11.a.b(jo70.class)), 1, seb1.V0, new j4r(seb1.R0), seb1.W0), new l4r(pwc0.d, 2, seb1.T0, new j4r(seb1.S0), seb1.U0), new t491(this, (byte) 17));
                this.g = z0o1.j(new l5b1(this, (byte) 14), nva1.Z, (iu30) null, 12);
                this.h = new eih1();
                j2i j2iVar = new j2i(-925460691, new u491(this, (byte) 28), true);
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = d0rVar;
                this.e = jq4Var.r() ? d0rVar : null;
                this.c = new km1(this, (byte) 13);
                this.f = w3p1.o(new l4r(new wlu(rc11.a.b(jo70.class)), 2, afm.t, new j4r(afm.h), afm.X), afm.i);
                this.g = x3p1.n(new hfm(this, (byte) 0), afm.f, u2m.i, (o8n) null, new hfm(this, (byte) 1), 8);
                this.h = c680.C(afm.g, fdm.i, fdm.X);
                j2i j2iVar2 = new j2i(745233902, new bfm(this, (byte) 2), true);
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public qlb(r7j0 r7j0Var, d0r d0rVar, xsk xskVar) {
        this.a = (byte) 10;
        this.e = r7j0Var;
        this.b = d0rVar;
        this.c = xskVar;
        this.f = w3p1.o(new l4r(pwc0.n, 2, ktj0.T0, new j4r(ktj0.R0), ktj0.U0), ktj0.S0);
        this.g = x3p1.n(new yvj0(this, (byte) 0), ktj0.Q0, m2j0.N0, (o8n) null, new yvj0(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-1790554266, new y3i0(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(eej0.V0, eej0.W0);
    }
}
