package p;

import android.content.Context;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ng20 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ng20(epb1 epb1Var, o3e0 o3e0Var, kai0 kai0Var, nwt nwtVar, fza fzaVar, km3 km3Var, gw70 gw70Var, lo60 lo60Var, aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, vgm vgmVar, dnc dncVar, ytp0 ytp0Var, clm clmVar, tbw0 tbw0Var, iuj iujVar) {
        this.a = (byte) 20;
        kko kkoVar = (kko) o3e0Var.c;
        this.b = kkoVar;
        Function0 function0 = (Function0) o3e0Var.b;
        Function0 function1 = (Function0) o3e0Var.d;
        this.c = x3p1.n(new tjf0(this, kai0Var, clmVar, epb1Var, nwtVar, (byte) 2), new tjf0(epb1Var, kai0Var, this, fzaVar, km3Var, ytp0Var), new mai0(this, fzaVar, km3Var, ytp0Var), (o8n) null, new lz6(lo60Var, vgmVar, dncVar, (byte) 4), 8);
        this.d = n3o1.q(this).a(h40.R0, ytg0.R0);
        j2i j2iVar = new j2i(-759714704, new tai0(gw70Var, tbw0Var, function0, function1, aru0Var, kkoVar, myq0Var, ycmVar, aru0Var2, iujVar), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static lai0 k(ioj0 ioj0Var, mey0 mey0Var) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        goj0 goj0VarA5;
        goj0 goj0VarA6;
        String str = mey0Var.d;
        String str2 = mey0Var.c;
        hoj0 hoj0VarC = ioj0Var.c(nbw0.class, str);
        ez00 ez00Var = null;
        ez00 ez00Var2 = (hoj0VarC == null || (goj0VarA6 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA6.a;
        if (ez00Var2 == null) {
            hhg1.f(f4i1.f(nbw0.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        nbw0 nbw0Var = (nbw0) ez00Var2;
        hoj0 hoj0VarC2 = ioj0Var.c(yo60.class, str);
        ez00 ez00Var3 = (hoj0VarC2 == null || (goj0VarA5 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA5.a;
        if (ez00Var3 == null) {
            hhg1.f(f4i1.f(yo60.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        yo60 yo60Var = (yo60) ez00Var3;
        hoj0 hoj0VarC3 = ioj0Var.c(jo70.class, str2);
        ez00 ez00Var4 = (hoj0VarC3 == null || (goj0VarA4 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA4.a;
        if (ez00Var4 == null) {
            hhg1.f(f4i1.f(jo70.class.getSimpleName(), " not found for uri: ", str2));
            return null;
        }
        jo70 jo70Var = (jo70) ez00Var4;
        hoj0 hoj0VarC4 = ioj0Var.c(zoy0.class, str2);
        zoy0 zoy0Var = (zoy0) ((hoj0VarC4 == null || (goj0VarA3 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA3.a);
        hoj0 hoj0VarC5 = ioj0Var.c(xkk1.class, str);
        xkk1 xkk1Var = (xkk1) ((hoj0VarC5 == null || (goj0VarA2 = hoj0VarC5.a()) == null) ? null : (ez00) goj0VarA2.a);
        hoj0 hoj0VarC6 = ioj0Var.c(prl.class, str2);
        if (hoj0VarC6 != null && (goj0VarA = hoj0VarC6.a()) != null) {
            ez00Var = (ez00) goj0VarA.a;
        }
        return new lai0(nbw0Var, yo60Var, jo70Var, zoy0Var, xkk1Var, (prl) ez00Var);
    }

    public static k7s0 l(k7s0 k7s0Var) {
        List<j7s0> list = k7s0Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (j7s0 i7s0Var : list) {
            if (i7s0Var instanceof i7s0) {
                i7s0 i7s0Var2 = (i7s0) i7s0Var;
                e7s0 e7s0Var = i7s0Var2.g;
                String str = i7s0Var2.h;
                String str2 = i7s0Var2.i;
                i7s0Var = new i7s0(str2, i7s0Var2.b, str, null, e7s0Var, i7s0Var2.f, e7s0Var, str, str2);
            }
            arrayList.add(i7s0Var);
        }
        return new k7s0(k7s0Var.a, arrayList);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return (hy00) obj2;
            case 1:
                return (ia00) obj3;
            case 2:
                return (eih1) obj3;
            case 3:
                return (eih1) obj3;
            case 4:
                return (hy00) obj3;
            case 5:
                return (ia00) obj3;
            case 6:
                return (eih1) obj;
            case 7:
                return (eih1) obj2;
            case 8:
                return (ia00) obj3;
            case 9:
                return (ia00) obj3;
            case 10:
                return (ia00) obj2;
            case 11:
                return (hy00) obj2;
            case 12:
                return (ia00) obj3;
            case 13:
                return (eih1) obj3;
            case 14:
                return (ia00) obj3;
            case 15:
                return (hy00) obj2;
            case 16:
                return (ia00) obj3;
            case 17:
                return (ia00) obj2;
            case 18:
                return (ia00) obj2;
            case 19:
                return (ia00) obj3;
            case 20:
                return (ia00) obj3;
            case 21:
                return (ia00) obj;
            case 22:
                return (rqw) obj3;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (eih1) obj3;
            case 24:
                return n3o1.q(this).a(new pah0(this, (byte) 21), fmk0.e);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (hy00) obj2;
            case 26:
                return (ia00) obj;
            case 27:
                return (eih1) obj3;
            case 28:
                return (rqw) obj3;
            default:
                return (hy00) obj2;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                j2i j2iVar = zoi.a;
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 1:
                return (psw) obj2;
            case 2:
                return (psw) obj2;
            case 3:
                return (psw) obj2;
            case 4:
                return (psw) obj2;
            case 5:
                return (psw) obj2;
            case 6:
                return (psw) obj2;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj2;
            case 9:
                return (psw) obj2;
            case 10:
                return (psw) obj;
            case 11:
                return (psw) obj;
            case 12:
                return (psw) obj2;
            case 13:
                return (psw) obj2;
            case 14:
                return (psw) obj2;
            case 15:
                return (psw) obj;
            case 16:
                return (psw) obj2;
            case 17:
                return (psw) obj;
            case 18:
                return (psw) obj;
            case 19:
                return (psw) obj2;
            case 20:
                return (psw) obj2;
            case 21:
                return (psw) obj2;
            case 22:
                return (psw) obj2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (psw) obj2;
            case 24:
                j2i j2iVar2 = new j2i(1107808197, new hmk0(this, (byte) 5), true);
                ien0 ien0Var2 = qsw.a;
                return new psw(j2iVar2, (byte) 0);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (psw) obj;
            case 26:
                return (psw) obj2;
            case 27:
                return (psw) obj2;
            case 28:
                return (psw) obj2;
            default:
                j2i j2iVar3 = p6j.a;
                ien0 ien0Var3 = qsw.a;
                return new psw(j2iVar3, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void e(v330 v330Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(319061832);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(v330Var) : x340Var.i(v330Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (v330Var.equals(r330.a)) {
                strK = x0d.k(x340Var, 1675746981, 2131956072, x340Var, false);
            } else {
                if (!v330Var.equals(u330.a)) {
                    throw p3d1.k(x340Var, 1675745805, false);
                }
                strK = x0d.k(x340Var, 1675749858, 2131956071, x340Var, false);
            }
            String strO0 = cwl1.o0(x340Var, 2131956065);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y720(iu30Var, (byte) 20);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), jdx.c, anm1.N("follow_action_button", nim0.a), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-985204951, new ps00(strK, (byte) 12), x340Var), x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10((Object) this, (Object) v330Var, (Object) iu30Var, i, (byte) 6);
        }
    }

    public void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-337038026);
        int i2 = i & 1;
        byte b = 0;
        if (x340Var.Y(i2, i2 != 0)) {
            inx inxVar = inx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(inxVar, isl.a, u291.r(nim0.a, 24.0f), 0L, 0L, false, x340Var, inx.d | 48, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afb0(this, i, b);
        }
    }

    public void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-153713941);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48 | (x340Var.i(this) ? 256 : 128);
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131953028);
            String strN0 = cwl1.n0(2131953037, new Object[]{cwl1.o0(x340Var, 2131953036), strO0}, x340Var);
            int i3 = ((i2 << 3) & 7168) | ((i2 << 6) & 896);
            int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
            int length = strO0.length() + iW0;
            x340Var.i0(-1613682863);
            ye5 ye5Var = new ye5();
            ye5Var.f(strN0.subSequence(0, iW0));
            if ((((i3 & 896) ^ 384) <= 256 || !x340Var.g(function0)) && (i3 & 384) != 256) {
                z = false;
            }
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new xet(function0, (byte) 26);
                x340Var.s0(objT);
            }
            vhg.d(ye5Var, strO0, "https://www.ftc.go.kr/selectBizOvrCommPop.do?apvPermMgtNo=2024%EA%B3%B5%EC%A0%950007", (iu30) objT);
            ye5Var.f(strN0.subSequence(length, strN0.length()));
            af5 af5VarP = ye5Var.p();
            x340Var.r(false);
            qim0 qim0Var3 = nim0.a;
            uwo1.f(af5VarP, qim0Var3, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 48, 0, 4092);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(this, function0, qim0Var2, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return x3p1.n(new lg20(this, b3), new lg20(this, b2), wo10.R0, (o8n) null, new lg20(this, (byte) 2), 8);
            case 1:
                return (js20) obj2;
            case 2:
                return (rey0) obj2;
            case 3:
                return (js20) obj2;
            case 4:
                return (ljm0) obj2;
            case 5:
                return (js20) obj2;
            case 6:
                return (rey0) obj;
            case 7:
                return (k8d1) obj2;
            case 8:
                return (rey0) obj2;
            case 9:
                return (k8d1) obj2;
            case 10:
                return (js20) obj2;
            case 11:
                return (rey0) obj2;
            case 12:
                return (js20) obj2;
            case 13:
                return (rey0) obj2;
            case 14:
                return (rey0) obj2;
            case 15:
                return (k8d1) obj2;
            case 16:
                return (rey0) obj2;
            case 17:
                return (rey0) obj2;
            case 18:
                return (rey0) obj2;
            case 19:
                return (rey0) obj2;
            case 20:
                return (js20) obj2;
            case 21:
                return (poy0) obj;
            case 22:
                return (mqw) obj2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (js20) obj2;
            case 24:
                return d4o1.f(new rkm0(this, b3), xjm0.d, dbm0.N0, new rkm0(this, b2), 8);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (poy0) obj2;
            case 26:
                return (rey0) obj;
            case 27:
                return (e7m0) obj2;
            case 28:
                return (mqw) obj2;
            default:
                return (js20) obj;
        }
    }

    public void h(uf40 uf40Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1465704531);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(uf40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            otw.c((lot0) this.b, new hot0(uf40Var.a, 2, uf40Var.b), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(this, uf40Var, i, (byte) 20);
        }
    }

    public void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1866182036);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131957174);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afb0(this, i, (byte) 1);
        }
    }

    public void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1366695024);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131957175);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afb0(this, i, (byte) 2);
        }
    }

    public ng20(cm0 cm0Var) {
        this.a = (byte) 13;
        this.b = cm0Var;
        this.c = k1o1.p();
        this.d = new eih1();
        j2i j2iVar = new j2i(-1928344278, new qcd0(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20() {
        this.a = (byte) 14;
        this.b = new h7l0((byte) 21);
        this.c = new rey0(gce0.d);
        this.d = n3o1.q(this).a(new kmd0(this, (byte) 7), wud0.Z);
        j2i j2iVar = fxi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(res resVar) {
        this.a = (byte) 6;
        this.b = resVar;
        this.c = new eih1();
        this.d = k1o1.p();
        j2i j2iVar = new j2i(-310836665, new wv60(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(f1n0 f1n0Var) {
        this.a = (byte) 7;
        this.b = f1n0Var;
        this.c = k1o1.u(new td1(this, (lnm) null, (byte) 3));
        j2i j2iVar = fti.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.e = new eih1();
    }

    public ng20(lzn0 lzn0Var, fg60 fg60Var) {
        this.a = (byte) 29;
        this.b = lzn0Var;
        this.c = fg60Var;
        this.d = x3p1.m(fg60Var.a, new l7s0(this, (byte) 0), new xgr0(this, (byte) 5), (o8n) null, new l7s0(this, (byte) 1), 8);
        this.e = n3o1.r(this).c(f2s0.c, f2s0.d);
    }

    public ng20(los losVar) {
        this.a = (byte) 11;
        this.b = new svh0(losVar, (byte) 16);
        this.c = new rey0(new k2d0((Object) this, (byte) 3));
        this.e = n3o1.r(this).c(i2d0.f, i2d0.g);
        j2i j2iVar = new j2i(-454511971, new pba0(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public ng20(Context context, vu60 vu60Var) {
        this.a = (byte) 3;
        this.b = context;
        this.c = x3p1.m(new xr0(d5p1.h(vu60Var.e), (byte) 18), hh60.h, oq50.d1, (o8n) null, (iu30) null, 24);
        this.d = new eih1();
        j2i j2iVar = new j2i(1393077404, new wv60(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(z710 z710Var) {
        this.a = (byte) 16;
        this.b = z710Var;
        this.c = new rey0(new otf0(this, (byte) 2));
        this.d = n3o1.q(this).a(clf0.i, clf0.t);
        j2i j2iVar = new j2i(-1228106762, new qcd0(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(bqk0 bqk0Var) {
        this.a = (byte) 19;
        this.b = bqk0Var;
        this.c = new rey0(gce0.h);
        this.d = n3o1.q(this).a(new pah0(this, (byte) 2), ytg0.X);
        j2i j2iVar = b0j.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(epb1 epb1Var, Optional optional) {
        this.a = (byte) 21;
        this.b = optional;
        this.c = n3o1.q(this).a(fri0.d, fri0.e);
        this.d = f2p1.q(new av70(epb1Var, (byte) 1), ish0.a1, new z6h0(this, (byte) 26), 4);
        j2i j2iVar = l0j.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(w460 w460Var) {
        this.a = (byte) 28;
        this.b = w460Var;
        this.c = w460Var.d;
        this.d = w460Var.e;
        j2i j2iVar = new j2i(1969648964, new aso0(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(lzn0 lzn0Var, fg60 fg60Var, l6m0 l6m0Var) {
        this.a = (byte) 0;
        this.b = lzn0Var;
        this.c = fg60Var;
        this.d = l6m0Var;
        this.e = n3o1.r(this).c(new mg20(this, (byte) 0), new mg20(this, (byte) 1));
    }

    public ng20(ffb0 ffb0Var) {
        this.a = (byte) 10;
        this.b = ffb0Var;
        this.c = x3p1.n(new cfb0(this, (byte) 0), rab0.Q0, k9b0.N0, (o8n) null, new cfb0(this, (byte) 1), 8);
        j2i j2iVar = new j2i(447759962, new pba0(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.e = n3o1.q(this).a(lta0.Y, lta0.Z);
    }

    public ng20(f4f0 f4f0Var) {
        this.a = (byte) 15;
        this.b = f4f0Var;
        this.c = k1o1.u(new r20(this, (lnm) null, (byte) 26));
        this.e = n3o1.r(this).c(wud0.X0, wud0.Y0);
        j2i j2iVar = xxi.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public ng20(gw70 gw70Var, ytp0 ytp0Var, fhk0 fhk0Var, l6m0 l6m0Var) {
        this.a = (byte) 24;
        this.b = gw70Var;
        this.c = ytp0Var;
        this.e = fhk0Var;
        this.d = l6m0Var;
    }

    public ng20(svb0 svb0Var, onq0 onq0Var, hgo hgoVar, ioq0 ioq0Var, Scheduler scheduler) {
        this.a = (byte) 27;
        this.b = scheduler;
        joq0 joq0Var = joq0.c;
        wam0 wam0Var = new wam0((byte) 5);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(lnq0.class, new ax8(new mnq0(onq0Var, (byte) 0), (byte) 2));
        nnq0 nnq0Var = new nnq0(onq0Var, (byte) 0);
        Scheduler scheduler2 = onq0Var.b;
        subtypeEffectHandlerBuilderC.d(hnq0.class, nnq0Var, scheduler2);
        subtypeEffectHandlerBuilderC.d(inq0.class, new nnq0(onq0Var, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.c(jnq0.class, new nnq0(onq0Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(knq0.class, new ax8(new mnq0(onq0Var, (byte) 1), (byte) 2));
        this.c = sbl.z(joq0Var, wam0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), w0q0.i, new voq0(hgoVar, ioq0Var, this));
        this.d = new eih1();
        j2i j2iVar = new j2i(1635121970, new aso0(svb0Var, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(xgc xgcVar, zob1 zob1Var) {
        this.a = (byte) 23;
        this.b = zob1Var;
        this.c = z0o1.j(new r7j0(this, (byte) 29), new afm0(this, (byte) 4), (iu30) null, 12);
        this.d = new eih1();
        j2i j2iVar = m2j.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(wxp wxpVar) {
        this.a = (byte) 2;
        this.b = wxpVar.a();
        this.c = k1o1.p();
        this.d = new eih1();
        j2i j2iVar = new j2i(-1938183962, new zq30(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(ynb0 ynb0Var) {
        this.a = (byte) 5;
        this.b = ynb0Var;
        this.c = x3p1.n(b980.b, b980.c, g070.S0, (o8n) null, new ux70(this, (byte) 3), 8);
        this.d = n3o1.q(this).a(oe60.Z0, oe60.a1);
        j2i j2iVar = qsi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(ser serVar) {
        this.a = (byte) 8;
        this.b = serVar;
        this.c = new rey0(new yy80(this, (byte) 8));
        this.d = n3o1.q(this).a(rb80.b1, rb80.c1);
        j2i j2iVar = sti.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(kpg0 kpg0Var) {
        this.a = (byte) 22;
        this.b = kpg0Var;
        this.c = kpg0Var.getBehavior();
        this.d = kpg0Var.a();
        j2i j2iVar = new j2i(707596339, new hmk0(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(j4g0 j4g0Var, iu30 iu30Var) {
        this.a = (byte) 17;
        this.b = j4g0Var;
        this.c = new rey0(new ipy(iu30Var, (byte) 13));
        j2i j2iVar = new j2i(-1364700989, new qcd0(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.e = n3o1.q(this).a(clf0.O0, new kmd0(this, (byte) 19));
    }

    public ng20(d0r d0rVar, String str, ktv ktvVar) {
        this.a = (byte) 12;
        this.b = ktvVar;
        this.c = x3p1.m(new vvu(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, l1d0.Y0, new j4r(l1d0.W0), l1d0.Z0), l1d0.X0), str), (byte) 29), l1d0.V0, x5d0.d, (o8n) null, new l6d0(this, (byte) 3), 8);
        this.d = n3o1.q(this).a(i2d0.t, new kds(this, (byte) 19));
        j2i j2iVar = svi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(o4g0 o4g0Var, iu30 iu30Var) {
        this.a = (byte) 18;
        this.b = o4g0Var;
        this.c = new rey0(new ipy(iu30Var, (byte) 14));
        j2i j2iVar = new j2i(1245904636, new qcd0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.e = n3o1.q(this).a(clf0.P0, new kmd0(this, (byte) 20));
    }

    public ng20(z5a0 z5a0Var) {
        this.a = (byte) 9;
        this.b = z5a0Var;
        this.c = k1o1.u(new r20(this, (lnm) null, (byte) 23));
        this.d = n3o1.q(this).a(mx90.P0, mx90.Q0);
        j2i j2iVar = eui.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(sd41 sd41Var) {
        this.a = (byte) 1;
        this.b = sd41Var;
        this.c = x3p1.n(new y330(this, (byte) 0), i330.f, wo10.U0, (o8n) null, new y330(this, (byte) 1), 8);
        this.d = n3o1.q(this).a(je20.Y, je20.N0);
        j2i j2iVar = new j2i(-560369088, new yhy(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(iu30 iu30Var) {
        this.a = (byte) 26;
        this.b = iu30Var;
        this.c = n3o1.q(this).a(n3o0.i, n3o0.t);
        this.d = new rey0(new qsn0(this, (byte) 8));
        j2i j2iVar = t3j.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(j4f1 j4f1Var, zrg zrgVar) {
        this.a = (byte) 4;
        this.b = zrgVar;
        this.c = h7w.B(zr70.b, (o8n) null, zr70.d, oe60.X, 2);
        this.d = new hy00(j4f1Var, j830.Y, oe60.Y);
        j2i j2iVar = new j2i(-1296617393, new wv60(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public ng20(dxy dxyVar, lik1 lik1Var) {
        this.a = (byte) 25;
        this.b = lik1Var;
        this.c = d4o1.f(new xkm0(dxyVar, (byte) 14), k4n0.a1, b5n0.i, new j9n0(this, dxyVar, (byte) 0), 8);
        this.e = n3o1.r(this).c(new pah0(this, (byte) 24), fmk0.T0);
        j2i j2iVar = x2j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
