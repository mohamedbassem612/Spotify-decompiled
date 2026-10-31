package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class umf0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final rqw b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final mqw f;

    public umf0(Function0 function0, hcb0 hcb0Var, Scheduler scheduler, Scheduler scheduler2, xfx xfxVar, dfm dfmVar, mo51 mo51Var, s691 s691Var, k691 k691Var, e27 e27Var, ifl1 ifl1Var, hq41 hq41Var, i8h1 i8h1Var, jly0 jly0Var, jly0 jly0Var2, Flowable flowable, ekf0 ekf0Var, bhf0 bhf0Var, lnf0 lnf0Var, jly0 jly0Var3, wlk1 wlk1Var, w9u0 w9u0Var, eof0 eof0Var, kt91 kt91Var, t2j0 t2j0Var, zwz0 zwz0Var, sqs0 sqs0Var, sqs0 sqs0Var2, oov0 oov0Var, j8a1 j8a1Var, s8a1 s8a1Var) {
        this.a = (byte) 24;
        this.d = j8a1Var;
        this.e = s8a1Var;
        yku ykuVar = new yku(function0, hcb0Var, new e4f0(kt91Var, (byte) 7), (byte) 1);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC2 = RxMobius.c();
        subtypeEffectHandlerBuilderC2.d(phf0.class, new rwa0(ykuVar, (byte) 16), scheduler2);
        subtypeEffectHandlerBuilderC2.g(shf0.class, new o4e0(new e4f0(w9u0Var, (byte) 9), (byte) 1));
        subtypeEffectHandlerBuilderC2.g(vhf0.class, new bkf0(flowable, (byte) 1));
        subtypeEffectHandlerBuilderC2.g(ihf0.class, new so(bhf0Var, lnf0Var, (byte) 20));
        subtypeEffectHandlerBuilderC2.g(whf0.class, new ckf0(wlk1Var, (byte) 1));
        subtypeEffectHandlerBuilderC2.g(hhf0.class, new bkf0(flowable, (byte) 0));
        subtypeEffectHandlerBuilderC2.g(rhf0.class, new kef0(lnf0Var, (byte) 1));
        subtypeEffectHandlerBuilderC2.g(jhf0.class, new ckf0(wlk1Var, (byte) 0));
        subtypeEffectHandlerBuilderC2.c(thf0.class, new pse0(t2j0Var, (byte) 1));
        subtypeEffectHandlerBuilderC2.c(uhf0.class, new dkf0(t2j0Var));
        subtypeEffectHandlerBuilderC2.c(xhf0.class, new rwa0(sqs0Var2, (byte) 17));
        subtypeEffectHandlerBuilderC2.g(khf0.class, new so(lnf0Var, scheduler, (byte) 21));
        subtypeEffectHandlerBuilderC2.g(qhf0.class, oov0Var);
        subtypeEffectHandlerBuilderC.g(yhf0.class, subtypeEffectHandlerBuilderC2.h());
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC3 = RxMobius.c();
        subtypeEffectHandlerBuilderC3.g(bif0.class, new ckf0(wlk1Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(cif0.class, subtypeEffectHandlerBuilderC3.h());
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC4 = RxMobius.c();
        subtypeEffectHandlerBuilderC4.d(zhf0.class, new rwa0(ifl1Var, (byte) 19), scheduler2);
        subtypeEffectHandlerBuilderC.g(aif0.class, subtypeEffectHandlerBuilderC4.h());
        Connectable connectableA = RxConnectables.a(subtypeEffectHandlerBuilderC.h());
        this.f = sbl.C(new tjf0(jly0Var, sqs0Var, eof0Var, jly0Var3, jly0Var2), xxb0.l, connectableA, ujf0.b, new ntf0(ekf0Var, zwz0Var, hcb0Var, scheduler, (byte) 14));
        this.b = n3o1.q(this).a(wud0.e1, new njf0(i8h1Var, (byte) 0));
        j2i j2iVar = new j2i(39003284, new vjf0(hq41Var, this, e27Var, dfmVar, mo51Var, xfxVar, s691Var, k691Var), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public static hei0 e(ioj0 ioj0Var, mey0 mey0Var) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        goj0 goj0VarA5;
        String str = mey0Var.d;
        String str2 = mey0Var.c;
        hoj0 hoj0VarC = ioj0Var.c(nbw0.class, str);
        ez00 ez00Var = null;
        ez00 ez00Var2 = (hoj0VarC == null || (goj0VarA5 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA5.a;
        if (ez00Var2 == null) {
            hhg1.f(f4i1.f(nbw0.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        nbw0 nbw0Var = (nbw0) ez00Var2;
        hoj0 hoj0VarC2 = ioj0Var.c(yo60.class, str2);
        ez00 ez00Var3 = (hoj0VarC2 == null || (goj0VarA4 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA4.a;
        if (ez00Var3 == null) {
            hhg1.f(f4i1.f(yo60.class.getSimpleName(), " not found for uri: ", str2));
            return null;
        }
        yo60 yo60Var = (yo60) ez00Var3;
        hoj0 hoj0VarC3 = ioj0Var.c(jo70.class, str2);
        ez00 ez00Var4 = (hoj0VarC3 == null || (goj0VarA3 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA3.a;
        if (ez00Var4 == null) {
            hhg1.f(f4i1.f(jo70.class.getSimpleName(), " not found for uri: ", str2));
            return null;
        }
        jo70 jo70Var = (jo70) ez00Var4;
        hoj0 hoj0VarC4 = ioj0Var.c(prl.class, str2);
        prl prlVar = (prl) ((hoj0VarC4 == null || (goj0VarA2 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA2.a);
        hoj0 hoj0VarC5 = ioj0Var.c(xkk1.class, str);
        if (hoj0VarC5 != null && (goj0VarA = hoj0VarC5.a()) != null) {
            ez00Var = (ez00) goj0VarA.a;
        }
        return new hei0(nbw0Var, yo60Var, jo70Var, prlVar, (xkk1) ez00Var);
    }

    public static String f(o7g0 o7g0Var) {
        String str = o7g0Var.b;
        int iOrdinal = o7g0Var.a.ordinal();
        if (iOrdinal == 0) {
            return nik1.V5.b("spotify:internal:parental-control:child:" + str + ":manage-content:approved").a;
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        return nik1.U5.b("spotify:internal:parental-control:child:" + str + ":manage-content:blocked").a;
    }

    public static String g(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return nik1.L0.a;
        }
        if (iC == 1) {
            return nik1.M0.a;
        }
        if (iC == 2) {
            return nik1.x1.a;
        }
        if (iC == 3) {
            return "spotify:presents:import-music";
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var;
            case 1:
                return ia00Var;
            case 2:
                return ia00Var;
            case 3:
                return (eih1) ia00Var;
            case 4:
                return (eih1) ia00Var;
            case 5:
                return (eih1) ia00Var;
            case 6:
                return ia00Var;
            case 7:
                return ia00Var;
            case 8:
                return ia00Var;
            case 9:
                return (eih1) ia00Var;
            case 10:
                return (eih1) ia00Var;
            case 11:
                return ia00Var;
            case 12:
                return ia00Var;
            case 13:
                return ia00Var;
            case 14:
                return ia00Var;
            case 15:
                return ia00Var;
            case 16:
                return (hy00) ia00Var;
            case 17:
                return ia00Var;
            case 18:
                return (eih1) ia00Var;
            case 19:
                return (i7h1) ia00Var;
            case 20:
                return ia00Var;
            case 21:
                return ia00Var;
            case 22:
                return ia00Var;
            case 23:
                return ia00Var;
            case 24:
                return ia00Var;
            case 25:
                return ia00Var;
            case 26:
                return ia00Var;
            case 27:
                return ia00Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return ia00Var;
            default:
                return ia00Var;
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
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                break;
        }
        return this.c;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        poy0 poy0Var = this.f;
        switch (b) {
            case 0:
                return (e7m0) poy0Var;
            case 1:
                return (k8d1) poy0Var;
            case 2:
                return (rey0) poy0Var;
            case 3:
                return (rey0) poy0Var;
            case 4:
                return (rey0) poy0Var;
            case 5:
                return (ljm0) poy0Var;
            case 6:
                return (rey0) poy0Var;
            case 7:
                return (rey0) poy0Var;
            case 8:
                return (js20) poy0Var;
            case 9:
                return (js20) poy0Var;
            case 10:
                return (rey0) poy0Var;
            case 11:
                return (js20) poy0Var;
            case 12:
                return (rey0) poy0Var;
            case 13:
                return (rey0) poy0Var;
            case 14:
                return (rey0) poy0Var;
            case 15:
                return (rey0) poy0Var;
            case 16:
                return (rey0) poy0Var;
            case 17:
                return (rey0) poy0Var;
            case 18:
                return (rey0) poy0Var;
            case 19:
                return (rey0) poy0Var;
            case 20:
                return (ljm0) poy0Var;
            case 21:
                return (rey0) poy0Var;
            case 22:
                return (k8d1) poy0Var;
            case 23:
                return (js20) poy0Var;
            case 24:
                return (e7m0) poy0Var;
            case 25:
                return (rey0) poy0Var;
            case 26:
                return (js20) poy0Var;
            case 27:
                return (js20) poy0Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return (rey0) poy0Var;
            default:
                return poy0Var;
        }
    }

    public umf0(xho xhoVar, lzn0 lzn0Var) {
        this.a = (byte) 6;
        this.d = xhoVar;
        this.e = lzn0Var;
        this.f = new rey0(new dwd(this, (byte) 0));
        this.b = n3o1.q(this).a(emd.g, emd.h);
        j2i j2iVar = new j2i(2058053783, new gtd(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(String str, Function0 function0) {
        this.a = (byte) 7;
        this.d = str;
        this.e = function0;
        this.f = new rey0(new dwd(this, (byte) 7));
        this.b = n3o1.q(this).a(new zee(this, (byte) 1), emd.Y0);
        j2i j2iVar = fbi.b;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(yvk0 yvk0Var, Function0 function0) {
        this.a = (byte) 12;
        this.d = yvk0Var;
        this.e = function0;
        this.f = k1o1.p();
        this.b = n3o1.q(this).a(new cml(this, (byte) 23), zho.Y);
        j2i j2iVar = new j2i(1527701948, new i6r(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(yqg yqgVar) {
        this.a = (byte) 10;
        this.e = yqgVar;
        this.d = new Locale(upn1.m());
        this.f = k1o1.p();
        this.b = new eih1();
        j2i j2iVar = new j2i(-841462533, new bfm(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(v6q v6qVar, d0r d0rVar) {
        this.a = (byte) 3;
        this.d = d0rVar;
        this.e = v6qVar.a(d0rVar, new bz0(3, (lnm) null, (byte) 2));
        this.f = k1o1.p();
        this.b = new eih1();
        j2i j2iVar = new j2i(-1054667695, new i43(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(paj0 paj0Var, nas nasVar) {
        this.a = (byte) 15;
        this.d = paj0Var;
        this.e = nasVar;
        this.f = new rey0(new b1s((Object) this, (byte) 8));
        this.b = n3o1.q(this).a(zyr.R0, new v08(this, (byte) 25));
        j2i j2iVar = new j2i(500985492, new k8s(this), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(thq thqVar, i9i1 i9i1Var) {
        this.a = (byte) 5;
        this.d = thqVar;
        this.e = i9i1Var;
        this.f = h7w.D(jpc.e, (bs50) null, jpc.g, new j2i(196255837, new sw1(this, (byte) 3), true), 2);
        this.b = new eih1();
        j2i j2iVar = jai.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(c9c0 c9c0Var, t0a0 t0a0Var) {
        this.a = (byte) 22;
        this.d = c9c0Var;
        this.e = t0a0Var;
        this.f = k1o1.u(new td1(this, (lnm) null, (byte) 4));
        this.b = n3o1.q(this).a(mx90.t, mx90.X);
        j2i j2iVar = cui.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(lzn0 lzn0Var, n6r0 n6r0Var) {
        this.a = (byte) 21;
        this.d = n6r0Var;
        this.e = lzn0Var;
        this.f = new rey0(new gn50(this, (byte) 3));
        this.b = n3o1.q(this).a(new wx00(this, (byte) 22), vn50.f);
        j2i j2iVar = nri.b;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(h3o0 h3o0Var, Function0 function0) {
        this.a = (byte) 28;
        this.d = h3o0Var;
        this.e = function0;
        this.f = new rey0(new qsn0(this, (byte) 2));
        this.b = n3o1.q(this).a(new pah0(this, (byte) 28), fmk0.e1);
        j2i j2iVar = m3j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(paj0 paj0Var, hkr hkrVar) {
        this.a = (byte) 14;
        this.d = paj0Var;
        this.e = hkrVar;
        this.f = new rey0(new b1s((Object) this, (byte) 5));
        this.b = n3o1.q(this).a(zyr.O0, new v08(this, (byte) 22));
        j2i j2iVar = new j2i(-1168863955, new h8s(this), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(m4c m4cVar, mnk0 mnk0Var, p9n0 p9n0Var, u9a1 u9a1Var) {
        this.a = (byte) 27;
        this.d = m4cVar;
        this.e = mnk0Var;
        this.f = x3p1.n(new uah0(p9n0Var, this, (byte) 20), uak0.c, m2j0.Z0, (o8n) null, new uah0(p9n0Var, u9a1Var, (byte) 21), 8);
        this.b = n3o1.q(this).a(w7k0.t, w7k0.Y);
        j2i j2iVar = new j2i(-1565206677, new y3i0(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(String str, lzn0 lzn0Var) {
        this.a = (byte) 20;
        this.d = str;
        this.e = lzn0Var;
        this.f = h7w.D(new zi50(this, (byte) 0), (bs50) null, (iu30) null, new j2i(-744676609, new sw1(this, (byte) 16), true), 6);
        this.b = n3o1.q(this).a(d640.Z0, d640.a1);
        j2i j2iVar = cri.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(nit nitVar, ybp ybpVar) {
        this.a = (byte) 18;
        this.d = nitVar;
        this.e = ybpVar;
        this.f = new rey0(new oat(this, (byte) 13));
        this.b = new eih1();
        j2i j2iVar = new j2i(-487792622, new ent(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(klm1 klm1Var, hql1 hql1Var, onf0 onf0Var, Flowable flowable, yqg yqgVar, ykf0 ykf0Var, w9u0 w9u0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 0;
        this.d = flowable;
        this.e = yqgVar;
        qtf0 qtf0Var = new qtf0("", "", "", "", emf0.a, 0L, 0L, 0L, 1.0d, false, new bef0("", "", ""), 2, new dnf0());
        dq7 dq7Var = new dq7(new hry(yqgVar, (byte) 1), (byte) 19);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        pgf0 pgf0Var = new pgf0(q8nVar2, klm1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tkm1.class), runSequentially.a(pgf0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vkm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qgf0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ukm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rgf0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wkm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new sgf0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xkm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tgf0(w9u0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rkm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wgf0(onf0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(skm1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ugf0(ykf0Var)));
        this.f = sbl.z(qtf0Var, dq7Var, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI), ujf0.d, new hmf0(q8nVar, hql1Var));
        this.b = n3o1.q(this).a(clf0.e, clf0.f);
        j2i j2iVar = new j2i(-1421738621, new qcd0(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(b7n b7nVar, lag lagVar, pcl pclVar, xv61 xv61Var, g84 g84Var) {
        js20 js20VarM;
        this.a = (byte) 11;
        this.d = b7nVar;
        this.e = xv61Var;
        if (g84Var.b()) {
            uv61 uv61VarA = xv61Var.a(rc11.a.b(dao.class), rih1.a);
            js20VarM = x3p1.m(new x010(new x010(uv61VarA.d, uv61VarA.f, new bu51(3, (lnm) null, (byte) 1), (byte) 1), pclVar.a(), new mnl(3, (lnm) null, (byte) 6), (byte) 1), h9o.h, i9o.a, (o8n) null, new j9o(this, (byte) 0), 8);
        } else {
            js20VarM = x3p1.m(new x010(rqt0.u(new x010(b7nVar.a(e6n.a), b7nVar.a(f6n.a), new k9o(3, null, (byte) 0), (byte) 1)), lagVar.h(), l9o.h, (byte) 1), m9o.h, n9o.a, (o8n) null, new j9o(this, (byte) 1), 8);
        }
        this.f = js20VarM;
        this.b = n3o1.q(this).a(cnn.T0, cnn.U0);
        j2i j2iVar = hhi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(urk0 urk0Var, iu30 iu30Var) {
        this.a = (byte) 19;
        this.d = urk0Var;
        this.e = iu30Var;
        this.f = new rey0(new o8x(this, (byte) 13));
        this.b = new i7h1(new k9s(this, (byte) 27), c0z.Y);
        j2i j2iVar = tmi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(mdp0 mdp0Var, ynb0 ynb0Var) {
        this.a = (byte) 1;
        this.d = mdp0Var;
        this.e = ynb0Var;
        this.f = k1o1.u(new r20(this, (lnm) null, (byte) 0));
        this.b = n3o1.q(this).a(n1.Z, n1.N0);
        j2i j2iVar = y2i.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(epb1 epb1Var, w6e0 w6e0Var, gei0 gei0Var, aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, gw70 gw70Var, lo60 lo60Var, fza fzaVar, vgm vgmVar, nwt nwtVar, dnc dncVar, ytp0 ytp0Var, clm clmVar, tbw0 tbw0Var, iuj iujVar) {
        this.a = (byte) 26;
        this.d = (kko) w6e0Var.b;
        Function0 function0 = (Function0) w6e0Var.d;
        Function0 function1 = (Function0) w6e0Var.e;
        this.e = (vu30) w6e0Var.c;
        idd1 idd1Var = new idd1(new cc00(ycmVar, (byte) 28));
        idd1 idd1Var2 = new idd1(new z8i0(this, (byte) 4));
        idd1 idd1Var3 = new idd1(new cc00(myq0Var, (byte) 29));
        idd1 idd1Var4 = new idd1(new sai0(aru0Var, this, (byte) 2));
        this.f = x3p1.n(new ntf0(gei0Var, clmVar, epb1Var, nwtVar, (byte) 7), new tjf0(epb1Var, gei0Var, this, fzaVar, ytp0Var, (byte) 4), new rvg0(this, fzaVar, ytp0Var, (byte) 13), (o8n) null, new ntf0(lo60Var, vgmVar, dncVar, this, (byte) 8), 8);
        this.b = n3o1.q(this).a(h40.U0, ytg0.W0);
        j2i j2iVar = new j2i(-2117227442, new kei0(gei0Var, aru0Var2, gw70Var, tbw0Var, function0, function1, iujVar, idd1Var4, idd1Var2, idd1Var3, idd1Var), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(lzn0 lzn0Var, q8l0 q8l0Var) {
        this.a = (byte) 25;
        this.d = lzn0Var;
        this.e = q8l0Var;
        this.f = new rey0(new otf0(this, (byte) 5));
        this.b = n3o1.q(this).a(new kmd0(this, (byte) 21), new kds(this, (byte) 22));
        j2i j2iVar = uyi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(lik1 lik1Var, fdc fdcVar) {
        this.a = (byte) 29;
        this.d = lik1Var;
        this.e = fdcVar;
        this.f = d4o1.g(q601.b((mr20) fdcVar.f), mmp0.O0, ofo0.b1, new cnp0(this, (byte) 3), 8);
        j2i j2iVar = new j2i(-920190707, new xyh(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(new x3o0(this, (byte) 10), rmp0.f);
    }

    public umf0(bqk0 bqk0Var, xb2 xb2Var) {
        this.a = (byte) 2;
        this.d = bqk0Var;
        this.e = xb2Var;
        this.f = new rey0(new ub3(this, (byte) 4));
        this.b = n3o1.q(this).a(new cu3(this, (byte) 0), new cu3(this, (byte) 1));
        j2i j2iVar = d6i.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(String str, String str2, iu30 iu30Var) {
        this.a = (byte) 17;
        this.d = str;
        this.e = str2;
        this.f = new rey0(new ip0(iu30Var, (byte) 27));
        j2i j2iVar = new j2i(-84956319, new i6r(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(v0t.Y, new k9s(this, (byte) 4));
    }

    public umf0(hwe1 hwe1Var, cwe1 cwe1Var, los losVar, w6p w6pVar) {
        this.a = (byte) 8;
        this.d = losVar;
        this.e = w6pVar;
        this.f = z0o1.k(gio1.b(vj80.a), rng.d1, (iu30) null, 12);
        this.b = n3o1.q(this).a(a8h.e, new v08(4));
        j2i j2iVar = new j2i(904226782, new rxg(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(evm1 evm1Var, ft30 ft30Var) {
        this.a = (byte) 16;
        this.d = evm1Var;
        this.e = ft30Var;
        this.f = new rey0(new b1s((Object) this, (byte) 15));
        this.b = n3o1.r(this).c(new kds(this, (byte) 2), new kds(this, (byte) 3));
        j2i j2iVar = new j2i(1312605974, new i6r(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(j7c0 j7c0Var, z0t z0tVar) {
        this.a = (byte) 23;
        this.d = j7c0Var;
        this.e = z0tVar;
        m7c0 m7c0Var = (m7c0) j7c0Var;
        this.f = x3p1.m(new ry50(rqt0.u(hu20.e(m7c0Var.b.b(), new zz90((lnm) null, m7c0Var, (byte) 2))), (byte) 27), hyb0.Z, f7c0.b, (o8n) null, new pdb0(this, (byte) 11), 8);
        this.b = n3o1.q(this).a(lta0.U0, lta0.V0);
        j2i j2iVar = new j2i(1961698849, new pba0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(k6c0 k6c0Var, ft30 ft30Var) {
        this.a = (byte) 13;
        this.d = k6c0Var;
        this.e = ft30Var;
        this.f = new rey0(new b1s((Object) this, (byte) 1));
        this.b = n3o1.q(this).a(zyr.X, zyr.Y);
        j2i j2iVar = ivi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(cnc0 cnc0Var, itk0 itk0Var) {
        this.a = (byte) 4;
        this.d = cnc0Var;
        this.e = itk0Var;
        this.f = k1o1.p();
        this.b = new eih1();
        j2i j2iVar = new j2i(-1491426614, new i43(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public umf0(maa maaVar, fqg0 fqg0Var, mr20 mr20Var, boolean z) {
        this.a = (byte) 9;
        fns fnsVar = igu.a;
        this.d = maaVar;
        this.e = fqg0Var;
        this.f = x3p1.m(mr20Var, new gy((byte) 14, z), yzj.T0, fnsVar, (iu30) null, 16);
        this.b = new eih1();
        j2i j2iVar = new j2i(-196749350, new rxg(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
