package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.spotify.carmobile.waze.WazeReturnActivity;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity;
import com.spotify.scannables.scannables.ScannablesActivity;
import com.spotify.scannables.scannables.view.ScannablesOnboardingActivity;
import com.spotify.widgets.npvwidget.WidgetsProxyActivity;
import com.spotify.widgets.npvwidget.m;
import com.spotify.widgets.npvwidget.u;
import com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider;
import com.spotify.xrprojected.ui.XrProjectedActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class obq implements jly0 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final byte c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ obq(daq daqVar, Object obj, int i, byte b) {
        this.a = b;
        this.b = daqVar;
        this.d = obj;
        this.c = i;
    }

    private final Object a() {
        ojq ojqVar = (ojq) this.d;
        byte b = 5;
        byte b2 = 6;
        byte b3 = 3;
        byte b4 = 4;
        byte b5 = 2;
        byte b6 = 0;
        byte b7 = 1;
        daq daqVar = this.b;
        byte b8 = this.c;
        switch (b8) {
            case 0:
                return new ejq(this, (byte) 0);
            case 1:
                daq daqVar2 = (daq) ojqVar.b;
                daq daqVar3 = (daq) ojqVar.b;
                om31 om31Var = new om31(new f831((f8q) daqVar2.mf.get(), (byte) 1));
                zqg zqgVar = new zqg((byte) 0);
                e541 e541Var = new e541();
                y03 y03Var = new y03();
                cmk1 cmk1Var = new cmk1(new a050((Application) daqVar3.x1.a), ulk1.o(), new bj4(false, (luk) daqVar3.L1.get()));
                w641 w641Var = new w641();
                x641 x641Var = new x641((byte) 0);
                l741 l741Var = new l741();
                x741 x741Var = new x741();
                x641 x641Var2 = new x641((byte) 1);
                x641 x641Var3 = new x641((byte) 2);
                j841 j841Var = new j841();
                daqVar3.getClass();
                return t380.w(om31Var, zqgVar, e541Var, y03Var, cmk1Var, w641Var, new suk[]{x641Var, l741Var, x741Var, x641Var2, x641Var3, j841Var, new hc9(new lc9((c8q) daqVar3.kf.get())), new ofl1(), new uuh0(), new tuh0(new f831((g8q) daqVar3.nf.get(), (byte) 0)), new n64(daqVar3.c()), new g9h(), new cfp0((byte) 0), new cfp0((byte) 1), new yhq0(), new cfp0((byte) 2), new pnm0(), new f391(), new bv91(), new zog1(), new ckm1(), new zqg((byte) 1), new cfp0((byte) 3), new cfp0((byte) 4), new oyq0(), new u450(), new gql1()});
            case 2:
                return new uhh0((d6b1) daqVar.Uf.get(), (zih0) ojqVar.c1.get(), (Set) ((obq) ojqVar.j1).get(), (r8l) daqVar.ff.get(), (txh0) daqVar.Ze.get(), (sxh0) ojqVar.d1.get(), (m89) daqVar.Kf.get(), new uic(false));
            case 3:
                tuk tukVar = new tuk(xqu.a((obq) ojqVar.j1));
                uic uicVar = new uic(false);
                tam tamVar = new tam((byte) 1);
                Context context = (Context) daqVar.x1.a;
                h380 h380VarB = j380.b(10);
                h380VarB.e(hf61.f, xqu.a((obq) ojqVar.k1));
                h380VarB.e(hf61.t, xqu.a((obq) ojqVar.l1));
                h380VarB.e(hf61.c, xqu.a(ojqVar.t));
                h380VarB.e(hf61.i, xqu.a(ojqVar.X));
                h380VarB.e(hf61.d, xqu.a(ojqVar.Y));
                h380VarB.e(hf61.b, xqu.a(ojqVar.Z));
                h380VarB.e(hf61.g, xqu.a(ojqVar.N0));
                h380VarB.e(hf61.h, xqu.a(ojqVar.O0));
                h380VarB.e(hf61.e, xqu.a(ojqVar.P0));
                h380VarB.e(hf61.a, xqu.a(ojqVar.h));
                gg11 gg11VarB = h380VarB.b(true);
                h380 h380VarB2 = j380.b(9);
                h380VarB2.e(fzc.f, xqu.a(ojqVar.Q0));
                h380VarB2.e(fzc.c, xqu.a(ojqVar.U0));
                h380VarB2.e(fzc.h, xqu.a(ojqVar.V0));
                daq daqVar4 = (daq) ojqVar.b;
                h380VarB2.e(fzc.d, xqu.a(daqVar4.kf));
                h380VarB2.e(fzc.b, xqu.a(daqVar4.mf));
                h380VarB2.e(fzc.i, xqu.a((obq) ojqVar.m1));
                h380VarB2.e(fzc.e, xqu.a(ojqVar.a1));
                h380VarB2.e(fzc.g, xqu.a(ojqVar.b1));
                h380VarB2.e(fzc.a, xqu.a(daqVar4.nf));
                return new zih0(tukVar, uicVar, tamVar, context, gg11VarB, h380VarB2.b(true));
            case 4:
                return new z03((jjq) ojqVar.i.get(), (byte) 0);
            case 5:
                return new jjq(this, (byte) 0);
            case 6:
                return new kjq(this, (byte) 0);
            case 7:
                zle1 zle1Var = (zle1) daqVar.a3.get();
                ojqVar.getClass();
                return new xgb0(zle1Var, t380.t(new w64((byte) 1), new w64((byte) 0)));
            case 8:
                return ((njq) ojqVar.f.get()).a(((ljq) ojqVar.d.get()).a(((mjq) ojqVar.e.get()).a(daqVar.v1())));
            case 9:
                return new ljq(this, (byte) 0);
            case 10:
                return new mjq(this, (byte) 0);
            case 11:
                return new njq(this, (byte) 0);
            case 12:
                return new z03((jjq) ojqVar.i.get(), (byte) 1);
            case 13:
                return new ajq(this, b4);
            case 14:
                return new ajq(this, b);
            case 15:
                return new ajq(this, b2);
            case 16:
                return new ajq(this, b6);
            case 17:
                return new ajq(this, b7);
            case 18:
                return new ajq(this, b5);
            case 19:
                return new ajq(this, b3);
            case 20:
                return new bjq(this, b6);
            case 21:
                return new bjq(this, b7);
            case 22:
                return new cjq(this, (byte) 0);
            case 23:
                return new djq(this, (byte) 0);
            case 24:
                return new hyv0();
            case 25:
                return new bjq(this, b5);
            case 26:
                qna1 qna1VarB2 = daqVar.b2();
                daq daqVar5 = (daq) ojqVar.b;
                return new av91(qna1VarB2, new j2e0((a710) daqVar5.ui.get(), (g510) daqVar5.L5.get(), (byte) 4), (r8l) daqVar.ff.get(), (g8q) daqVar.nf.get());
            case 27:
                return new bjq(this, b3);
            case 28:
                return new fjq(this, (byte) 0);
            case 29:
                daq daqVar6 = (daq) ojqVar.b;
                return new op8(new ro5(new r961((Scheduler) daqVar6.r3.get(), (Flowable) daqVar6.z2.get(), (b7n) daqVar6.L4.get(), (byte) 2), new lag((t2j0) daqVar6.f2.get(), (Flowable) daqVar6.z2.get(), (jqt) daqVar6.Z1.get()), new nhc((byte) 10), new ow3(new km3((yze1) daqVar6.Gm.get(), new x5j1((w5b1) daqVar6.W3.get(), b5)), daqVar6.A(), (byte) 27), (Context) daqVar6.x1.a), new jma((byte) 2, false), (Context) daqVar.x1.a, (o241) daqVar.u4.get(), (pp8) daqVar.Uo.get(), (t2j0) daqVar.f2.get(), ojqVar.a());
            case 30:
                return new gjq(this, (byte) 0);
            case 31:
                return new hjq(this, (byte) 0);
            case 32:
                return new bjq(this, b4);
            case 33:
                return new sxh0((zih0) ojqVar.c1.get());
            case 34:
                return new ajh0((pbk1) daqVar.Oh.get());
            case 35:
                return new ijq(this, (byte) 0);
            case 36:
                return new hcl((zwz0) daqVar.U1.get(), (mr20) daqVar.cc.get());
            case 37:
                Object obj = ojqVar.i1;
                return "SpotifyMediaBrowserService";
            case 38:
                return new wjs0((zle1) daqVar.a3.get());
            case 39:
                return new od61((Flowable) daqVar.z2.get(), (Scheduler) daqVar.z1.get(), (d6b1) daqVar.Uf.get(), (zwz0) daqVar.U1.get());
            default:
                jah.e(b8);
                return null;
        }
    }

    private final Object b() {
        ojq ojqVar = (ojq) this.d;
        byte b = 5;
        byte b2 = 6;
        byte b3 = 3;
        byte b4 = 4;
        byte b5 = 2;
        byte b6 = 0;
        byte b7 = 1;
        daq daqVar = this.b;
        byte b8 = this.c;
        switch (b8) {
            case 0:
                return new ejq(this, (byte) 1);
            case 1:
                daq daqVar2 = (daq) ojqVar.b;
                daq daqVar3 = (daq) ojqVar.b;
                om31 om31Var = new om31(new f831((f8q) daqVar2.mf.get(), (byte) 1));
                zqg zqgVar = new zqg((byte) 0);
                e541 e541Var = new e541();
                y03 y03Var = new y03();
                cmk1 cmk1Var = new cmk1(new a050((Application) daqVar3.x1.a), ulk1.o(), new bj4(false, (luk) daqVar3.L1.get()));
                w641 w641Var = new w641();
                x641 x641Var = new x641((byte) 0);
                l741 l741Var = new l741();
                x741 x741Var = new x741();
                x641 x641Var2 = new x641((byte) 1);
                x641 x641Var3 = new x641((byte) 2);
                j841 j841Var = new j841();
                daqVar3.getClass();
                return t380.w(om31Var, zqgVar, e541Var, y03Var, cmk1Var, w641Var, new suk[]{x641Var, l741Var, x741Var, x641Var2, x641Var3, j841Var, new hc9(new lc9((c8q) daqVar3.kf.get())), new ofl1(), new uuh0(), new tuh0(new f831((g8q) daqVar3.nf.get(), (byte) 0)), new n64(daqVar3.c()), new g9h(), new cfp0((byte) 0), new cfp0((byte) 1), new yhq0(), new cfp0((byte) 2), new pnm0(), new f391(), new bv91(), new zog1(), new ckm1(), new zqg((byte) 1), new cfp0((byte) 3), new cfp0((byte) 4), new oyq0(), new u450(), new gql1()});
            case 2:
                return new uhh0((d6b1) daqVar.Uf.get(), (zih0) ojqVar.c1.get(), (Set) ((obq) ojqVar.j1).get(), (r8l) daqVar.ff.get(), (txh0) daqVar.Ze.get(), (sxh0) ojqVar.d1.get(), (m89) daqVar.Kf.get(), new uic(false));
            case 3:
                tuk tukVar = new tuk(xqu.a((obq) ojqVar.j1));
                uic uicVar = new uic(false);
                tam tamVar = new tam((byte) 1);
                Context context = (Context) daqVar.x1.a;
                h380 h380VarB = j380.b(10);
                h380VarB.e(hf61.f, xqu.a((obq) ojqVar.k1));
                h380VarB.e(hf61.t, xqu.a((obq) ojqVar.l1));
                h380VarB.e(hf61.c, xqu.a(ojqVar.t));
                h380VarB.e(hf61.i, xqu.a(ojqVar.X));
                h380VarB.e(hf61.d, xqu.a(ojqVar.Y));
                h380VarB.e(hf61.b, xqu.a(ojqVar.Z));
                h380VarB.e(hf61.g, xqu.a(ojqVar.N0));
                h380VarB.e(hf61.h, xqu.a(ojqVar.O0));
                h380VarB.e(hf61.e, xqu.a(ojqVar.P0));
                h380VarB.e(hf61.a, xqu.a(ojqVar.h));
                gg11 gg11VarB = h380VarB.b(true);
                h380 h380VarB2 = j380.b(9);
                h380VarB2.e(fzc.f, xqu.a(ojqVar.Q0));
                h380VarB2.e(fzc.c, xqu.a(ojqVar.U0));
                h380VarB2.e(fzc.h, xqu.a(ojqVar.V0));
                daq daqVar4 = (daq) ojqVar.b;
                h380VarB2.e(fzc.d, xqu.a(daqVar4.kf));
                h380VarB2.e(fzc.b, xqu.a(daqVar4.mf));
                h380VarB2.e(fzc.i, xqu.a((obq) ojqVar.m1));
                h380VarB2.e(fzc.e, xqu.a(ojqVar.a1));
                h380VarB2.e(fzc.g, xqu.a(ojqVar.b1));
                h380VarB2.e(fzc.a, xqu.a(daqVar4.nf));
                return new zih0(tukVar, uicVar, tamVar, context, gg11VarB, h380VarB2.b(true));
            case 4:
                return new z03((jjq) ojqVar.i.get(), (byte) 0);
            case 5:
                return new jjq(this, (byte) 1);
            case 6:
                return new kjq(this, (byte) 1);
            case 7:
                zle1 zle1Var = (zle1) daqVar.a3.get();
                ojqVar.getClass();
                return new xgb0(zle1Var, t380.t(new w64((byte) 1), new w64((byte) 0)));
            case 8:
                return ((njq) ojqVar.f.get()).a(((ljq) ojqVar.d.get()).a(((mjq) ojqVar.e.get()).a(daqVar.v1())));
            case 9:
                return new ljq(this, (byte) 1);
            case 10:
                return new mjq(this, (byte) 1);
            case 11:
                return new njq(this, (byte) 1);
            case 12:
                return new z03((jjq) ojqVar.i.get(), (byte) 1);
            case 13:
                return new qjq(this, b4);
            case 14:
                return new qjq(this, b);
            case 15:
                return new qjq(this, b2);
            case 16:
                return new qjq(this, b6);
            case 17:
                return new qjq(this, b7);
            case 18:
                return new qjq(this, b5);
            case 19:
                return new qjq(this, b3);
            case 20:
                return new rjq(this, b6);
            case 21:
                return new rjq(this, b7);
            case 22:
                return new cjq(this, (byte) 1);
            case 23:
                return new djq(this, (byte) 1);
            case 24:
                return new hyv0();
            case 25:
                return new rjq(this, b5);
            case 26:
                qna1 qna1VarB2 = daqVar.b2();
                daq daqVar5 = (daq) ojqVar.b;
                return new av91(qna1VarB2, new j2e0((a710) daqVar5.ui.get(), (g510) daqVar5.L5.get(), (byte) 4), (r8l) daqVar.ff.get(), (g8q) daqVar.nf.get());
            case 27:
                return new rjq(this, b3);
            case 28:
                return new fjq(this, (byte) 1);
            case 29:
                daq daqVar6 = (daq) ojqVar.b;
                return new op8(new ro5(new r961((Scheduler) daqVar6.r3.get(), (Flowable) daqVar6.z2.get(), (b7n) daqVar6.L4.get(), (byte) 2), new lag((t2j0) daqVar6.f2.get(), (Flowable) daqVar6.z2.get(), (jqt) daqVar6.Z1.get()), new nhc((byte) 10), new ow3(new km3((yze1) daqVar6.Gm.get(), new x5j1((w5b1) daqVar6.W3.get(), b5)), daqVar6.A(), (byte) 27), (Context) daqVar6.x1.a), new jma((byte) 2, false), (Context) daqVar.x1.a, (o241) daqVar.u4.get(), (pp8) daqVar.Uo.get(), (t2j0) daqVar.f2.get(), ojqVar.a());
            case 30:
                return new gjq(this, (byte) 1);
            case 31:
                return new hjq(this, (byte) 1);
            case 32:
                return new rjq(this, b4);
            case 33:
                return new sxh0((zih0) ojqVar.c1.get());
            case 34:
                return new ajh0((pbk1) daqVar.Oh.get());
            case 35:
                return new ijq(this, (byte) 1);
            case 36:
                return new hcl((zwz0) daqVar.U1.get(), (mr20) daqVar.cc.get());
            case 37:
                Object obj = ojqVar.i1;
                return "SpotifyMediaLibraryService";
            case 38:
                return new wjs0((zle1) daqVar.a3.get());
            case 39:
                return new od61((Flowable) daqVar.z2.get(), (Scheduler) daqVar.z1.get(), (d6b1) daqVar.Uf.get(), (zwz0) daqVar.U1.get());
            default:
                jah.e(b8);
                return null;
        }
    }

    private final Object c() {
        f9p f9pVar = (f9p) this.d;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                return new u5b1((TranssionCardWidgetProvider) f9pVar.t, (Context) daqVar.x1.a);
            case 1:
                return new ry30((t2j0) daqVar.f2.get(), (ru71) ((jly0) f9pVar.b).get(), (String) daqVar.k2.get(), (co40) daqVar.Q4.get(), (p85) daqVar.Il.get());
            case 2:
                return new ru71((Context) daqVar.x1.a, (ut71) daqVar.g2.get());
            case 3:
                daq daqVar2 = (daq) f9pVar.X;
                daq daqVar3 = (daq) f9pVar.X;
                return new u(new pck1((Context) daqVar2.x1.a, xqu.a((obq) f9pVar.P0), xqu.a((obq) f9pVar.Q0), xqu.a((obq) f9pVar.R0), daqVar2.R1(), xqu.a((obq) f9pVar.S0), (mr20) daqVar2.u5.get(), f9pVar.m(), new p2f0((ru71) ((jly0) f9pVar.b).get(), (mr20) daqVar2.cc.get()), (p85) daqVar2.Il.get(), f9pVar.f(), xqu.a((obq) f9pVar.X0)), f9pVar.k(), f9pVar.k(), f9pVar.k(), new lb((Context) daqVar3.x1.a), (ne11) daqVar.fm.get(), (q8n) daqVar.E1.get(), (zle1) daqVar.a3.get(), (tol1) ((obq) f9pVar.Y0).get(), (wu71) ((obq) f9pVar.T0).get(), new m((i8h1) daqVar3.A5.get(), (mwn0) daqVar3.Wd.get()));
            case 4:
                m111 m111VarX = f9pVar.x();
                daq daqVar4 = (daq) f9pVar.X;
                return new gf0(new hyy0(m111VarX, (y011) daqVar4.fm.get(), (byte) 14), f9pVar.g(), f9pVar.m(), (p85) daqVar.Il.get(), f9pVar.e(), (om40) daqVar.Jl.get(), (q8n) daqVar.E1.get(), new il00((p85) daqVar4.Il.get(), (byte) 7), new ffe1(f9pVar.e(), ((Context) daqVar4.x1.a).getString(2131952026), (byte) 7), w081.p((Context) daqVar4.x1.a));
            case 5:
                zhq0 zhq0Var = new zhq0((Context) ((daq) f9pVar.X).x1.a);
                mih0 mih0Var = (mih0) ((jly0) f9pVar.c).get();
                daq daqVar5 = (daq) f9pVar.X;
                return new ktc(zhq0Var, mih0Var, new sp00((mr20) daqVar5.cc.get(), new ow3((Context) daqVar5.x1.a, (g420) daqVar5.O2.get()), (nfa0) daqVar5.b2.get(), (q8n) daqVar5.E1.get(), (byte) 9));
            case 6:
                return new e1q(this, (byte) 2);
            case 7:
                return new piq0(new zhq0((Context) ((daq) f9pVar.X).x1.a), (mih0) ((jly0) f9pVar.c).get());
            case 8:
                return new lw70((gw70) daqVar.d8.get(), (q8n) daqVar.E1.get());
            case 9:
                return new bv00((uu00) daqVar.a5.get(), (q8n) daqVar.E1.get());
            case 10:
                return new bv00(xqu.a((obq) f9pVar.O0), (q8n) daqVar.E1.get());
            case 11:
                return mw60.v((RetrofitMaker) daqVar.Y3.get());
            case 12:
                m111 m111VarX2 = f9pVar.x();
                daq daqVar6 = (daq) f9pVar.X;
                return new b880(new hyy0(m111VarX2, (y011) daqVar6.fm.get(), (byte) 14), f9pVar.g(), (Context) daqVar.x1.a, f9pVar.m(), new il00((p85) daqVar6.Il.get(), (byte) 7), f9pVar.e(), (q8n) daqVar.E1.get(), (agc0) daqVar.B7.get(), w081.p((Context) daqVar6.x1.a));
            case 13:
                m111 m111VarX3 = f9pVar.x();
                daq daqVar7 = (daq) f9pVar.X;
                return new rfh1(m111VarX3, new hlr((t2j0) daqVar7.f2.get()), (mr20) daqVar.Mn.get(), (q8n) daqVar.E1.get(), w081.p((Context) daqVar7.x1.a));
            case 14:
                return new uq40((uu00) daqVar.a5.get());
            case 15:
                daq daqVar8 = (daq) f9pVar.X;
                y441 y441Var = new y441(new l85(false, (luk) daqVar8.L1.get()), (wu71) ((obq) f9pVar.T0).get(), new yzu(new iuw((Context) daqVar8.x1.a, (ut71) daqVar8.g2.get()), (huw) ((RetrofitMaker) daqVar8.Y3.get()).createWebgateService(huw.class, "android-widgets-wrapped-eligibility"), (mr20) daqVar8.cc.get(), (nuw) daqVar8.Nn.get()), (cv71) ((obq) f9pVar.U0).get());
                xim1 xim1Var = (xim1) ((obq) f9pVar.V0).get();
                zsc zscVarF = f9pVar.f();
                obq obqVar = (obq) f9pVar.W0;
                daq daqVar9 = (daq) f9pVar.X;
                return new hjm1(y441Var, xim1Var, zscVarF, new o860(obqVar, (rol1) daqVar9.Ln.get(), (yqg) daqVar9.J1.get(), (e080) daqVar9.Pn.get(), (byte) 8));
            case 16:
                return new wu71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 17:
                return new cv71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 18:
                f9pVar.getClass();
                daq daqVar10 = (daq) f9pVar.X;
                return new xim1(new wpl1((upl1) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(upl1.class, "android-widgets-dynamicnpvwidget-wrapped-resources"), new mx21((Context) daqVar10.x1.a, (ut71) daqVar10.g2.get())), new zrj1(new ezb1((k931) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(k931.class, "android-widgets-dynamicnpvwidget-wrapped-retrieval"), (byte) 1), (ohm1) daqVar10.On.get(), (cv71) ((obq) f9pVar.U0).get(), (byte) 17));
            case 19:
                return new jw70((gw70) daqVar.d8.get());
            case 20:
                daq daqVar11 = (daq) f9pVar.X;
                return new uog1(new vx40((ox5) daqVar11.Gl.get(), daqVar11.e0(), (byte) 25));
            case 21:
                return new rsc((ru71) ((jly0) f9pVar.b).get());
            case 22:
                return new tx5((Context) daqVar.x1.a, (TranssionCardWidgetProvider) f9pVar.t, (ox5) daqVar.Gl.get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object d() {
        tjq tjqVar = (tjq) this.d;
        WazeReturnActivity wazeReturnActivity = (WazeReturnActivity) tjqVar.b;
        byte b = this.c;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) tjqVar.d).get();
            daq daqVar = (daq) tjqVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
        }
        daq daqVar2 = this.b;
        if (b == 1) {
            return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) tjqVar.a).get(), (yqg) daqVar2.J1.get(), wazeReturnActivity);
        }
        if (b == 2) {
            return j310.x(wazeReturnActivity, (t8u0) daqVar2.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object e() {
        pbq pbqVar = (pbq) this.d;
        WidgetsProxyActivity widgetsProxyActivity = (WidgetsProxyActivity) pbqVar.f;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) ((jly0) pbqVar.d).get();
                daq daqVar2 = (daq) pbqVar.b;
                return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
            case 1:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) pbqVar.c).get(), (yqg) daqVar.J1.get(), widgetsProxyActivity);
            case 2:
                return j310.x(widgetsProxyActivity, (t8u0) daqVar.d9.get());
            case 3:
                g1n0 g1n0Var = (g1n0) ((jly0) pbqVar.h).get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 4:
                return new g1n0(widgetsProxyActivity, (bi0) ((jly0) pbqVar.e).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
            case 5:
                return new yym0(widgetsProxyActivity);
            case 6:
                return new cv71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 7:
                return new wu71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        g1n0 jzm0Var;
        g1n0 gu7Var;
        g1n0 r2lVar;
        Object h7aVar;
        byte b = this.a;
        byte b2 = 1;
        byte b3 = this.c;
        Object obj = this.d;
        daq daqVar = this.b;
        byte b4 = 3;
        byte b5 = 4;
        byte b6 = 2;
        switch (b) {
            case 0:
                yxo yxoVar = (yxo) obj;
                switch (b3) {
                    case 0:
                        gu7 gu7Var2 = (gu7) ((jly0) yxoVar.e).get();
                        daq daqVar2 = (daq) yxoVar.d;
                        return t380.p(s2.p(gu7Var2, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
                    case 1:
                        return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) yxoVar.b.get(), (yqg) daqVar.J1.get(), (ScannablesActivity) yxoVar.c);
                    case 2:
                        return j310.x((ScannablesActivity) yxoVar.c, (t8u0) daqVar.d9.get());
                    case 3:
                        return new mbq(this);
                    case 4:
                        return new nbq(this);
                    case 5:
                        kh41 kh41Var = (kh41) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(kh41.class, "android-scannables-scannables");
                        c8o.m(kh41Var);
                        return kh41Var;
                    case 6:
                        return new d241();
                    case 7:
                        return new c241();
                    case 8:
                        daq daqVar3 = (daq) yxoVar.d;
                        daq daqVar4 = (daq) yxoVar.d;
                        Single singleFirstOrError = Observable.combineLatest(aan0.y((Observable) daqVar3.A8.get()), aan0.k((jj4) daqVar4.K4.get()), aan0.w((dxz0) daqVar4.I4.get()), new ncn0((byte) 7)).firstOrError();
                        c8o.m(singleFirstOrError);
                        Observable map = Observable.combineLatest(aan0.y((Observable) daqVar4.A8.get()), aan0.w((dxz0) daqVar4.I4.get()), new ncn0((byte) 5)).startWithItem(Boolean.TRUE).distinctUntilChanged().skip(1L).filter(new nh61((byte) 4)).map(new ncn0((byte) 6));
                        c8o.m(map);
                        return new q1n0(singleFirstOrError, map, (ScannablesActivity) yxoVar.c, new q3n0((luk) daqVar4.L1.get()));
                    case 9:
                        jzm0Var = new jzm0((ScannablesActivity) yxoVar.c, (lzn0) ((obq) yxoVar.O0).get(), (i8h1) daqVar.A5.get(), kmq0.m((ScannablesActivity) yxoVar.c), (bsp0) yxoVar.U0.get(), (o7r0) ((obq) yxoVar.c1).get());
                        break;
                    case 10:
                        g1n0 g1n0Var = (g1n0) yxoVar.N0.get();
                        int i = t380.c;
                        aan0.s(g1n0Var, kg11.t);
                        return g1n0Var;
                    case 11:
                        jzm0Var = new g1n0((ScannablesActivity) yxoVar.c, (bi0) yxoVar.Z.get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
                        break;
                    case 12:
                        return new yym0((ScannablesActivity) yxoVar.c);
                    case 13:
                        return new zyp(this, b4);
                    case 14:
                        return new azp(this, b4);
                    case 15:
                        return new e70(xqu.a((obq) yxoVar.P0));
                    case 16:
                        return new wy40(xqu.a((obq) yxoVar.O0), xqu.a(daqVar.V2));
                    case 17:
                        return new bzp(this, b4);
                    case 18:
                        return ((ScannablesActivity) yxoVar.c).getResources();
                    case 19:
                        return new ybs((czp) yxoVar.b1.get(), (b4n0) daqVar.Sg.get());
                    case 20:
                        return new czp(this, (byte) 4);
                    case 21:
                        return new dzp(this, (byte) 4);
                    case 22:
                        return new ezp(this, (byte) 4);
                    case 23:
                        return new fzp(this, b5);
                    case 24:
                        return new gzp(this, b5);
                    case 25:
                        return new hzp(this, b5);
                    case 26:
                        return new hun0(new kco0());
                    default:
                        jah.e(b3);
                        return null;
                }
                return jzm0Var;
            case 1:
                toj0 toj0Var = (toj0) obj;
                ScannablesOnboardingActivity scannablesOnboardingActivity = (ScannablesOnboardingActivity) toj0Var.b;
                if (b3 == 0) {
                    gu7 gu7Var3 = (gu7) ((jly0) toj0Var.e).get();
                    daq daqVar5 = (daq) toj0Var.c;
                    return t380.p(s2.p(gu7Var3, new y4l(daqVar5.F(), (fpr) daqVar5.Ka.get(), daqVar5.k2())));
                }
                if (b3 == 1) {
                    return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) toj0Var.d).get(), (yqg) daqVar.J1.get(), scannablesOnboardingActivity);
                }
                if (b3 == 2) {
                    return j310.x(scannablesOnboardingActivity, (t8u0) daqVar.d9.get());
                }
                if (b3 == 3) {
                    return new sh41((i8h1) daqVar.A5.get());
                }
                jah.e(b3);
                return null;
            case 2:
                em0 em0Var = (em0) obj;
                daq daqVar6 = (daq) em0Var.c;
                SocialListeningInfoDialogActivity socialListeningInfoDialogActivity = (SocialListeningInfoDialogActivity) em0Var.b;
                switch (b3) {
                    case 0:
                        h380 h380VarB = j380.b(103);
                        hbq hbqVar = daqVar6.a;
                        h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
                        h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
                        h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
                        h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar6.c);
                        h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
                        h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
                        h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
                        h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
                        h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar6.d);
                        h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
                        h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar6.e);
                        h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
                        h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar6.f);
                        h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
                        h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
                        h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
                        h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
                        h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
                        h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar6.g);
                        h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
                        h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
                        h380VarB.e("p.k2l", daqVar6.h);
                        h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar6.i);
                        h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
                        h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
                        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar6.t);
                        h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar6.X);
                        h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar6.Y);
                        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar6.Z);
                        h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar6.N0);
                        h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar6.O0);
                        h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar6.P0);
                        h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar6.Q0);
                        h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
                        h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
                        h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar6.R0);
                        h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar6.S0);
                        h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
                        h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
                        h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar6.T0);
                        h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
                        h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
                        h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
                        h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
                        h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
                        h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
                        h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar6.U0);
                        h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
                        h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
                        h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar6.V0);
                        h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar6.W0);
                        h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar6.X0);
                        h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
                        h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
                        h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
                        h380VarB.e("p.fso0", daqVar6.Y0);
                        h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
                        h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar6.Z0);
                        h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar6.a1);
                        h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
                        h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
                        h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
                        h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
                        h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
                        h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar6.b1);
                        h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
                        h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
                        h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar6.c1);
                        h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar6.d1);
                        h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
                        h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
                        h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
                        h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar6.e1);
                        h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar6.f1);
                        h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
                        h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
                        h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
                        h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar6.g1);
                        h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar6.h1);
                        h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar6.i1);
                        h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
                        h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar6.j1);
                        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar6.k1);
                        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar6.l1);
                        h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
                        h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar6.m1);
                        h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar6.n1);
                        h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar6.o1);
                        h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar6.p1);
                        h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
                        h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar6.q1);
                        h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
                        h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar6.r1);
                        h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
                        h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
                        h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar6.s1);
                        h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar6.t1);
                        h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar6.u1);
                        h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
                        h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
                        h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
                        h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
                        h380VarB.e("p.u0a1", (obq) em0Var.d);
                        return new jgu(h380VarB.b(true));
                    case 1:
                        return new s0q(daqVar, em0Var, (byte) 9);
                    case 2:
                        return t380.p(s2.p((gu7) ((jly0) em0Var.g).get(), new y4l(daqVar6.F(), (fpr) daqVar6.Ka.get(), daqVar6.k2())));
                    case 3:
                        gu7Var = new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) em0Var.f).get(), (yqg) daqVar.J1.get(), socialListeningInfoDialogActivity);
                        break;
                    case 4:
                        return j310.x(socialListeningInfoDialogActivity, (t8u0) daqVar.d9.get());
                    case 5:
                        g1n0 g1n0Var2 = (g1n0) ((jly0) em0Var.t).get();
                        int i2 = t380.c;
                        aan0.s(g1n0Var2, kg11.t);
                        return g1n0Var2;
                    case 6:
                        gu7Var = new g1n0(socialListeningInfoDialogActivity, (bi0) ((jly0) em0Var.i).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
                        break;
                    case 7:
                        return new yym0(socialListeningInfoDialogActivity);
                    default:
                        jah.e(b3);
                        return null;
                }
                return gu7Var;
            case 3:
                ai0 ai0Var = (ai0) obj;
                byte b7 = 0;
                switch (b3) {
                    case 0:
                        apr aprVarH = daqVar.H();
                        dg30 dg30Var = (Activity) ai0Var.a;
                        daq daqVar7 = (daq) ai0Var.b;
                        return new ior(aprVarH, new r2l(dg30Var, new h21(xqu.a((obq) ai0Var.e), (byte) 17), new h21(xqu.a((obq) ai0Var.d), (byte) 18), new t2l((Activity) ai0Var.a, (byte) 0), (g0l) daqVar7.E5.get(), (zor) daqVar7.V6.get(), new v1k((i8h1) daqVar7.A5.get())), (fur) ((obq) ai0Var.g).get());
                    case 1:
                        return j1l.d((g5t) ai0Var.c);
                    case 2:
                        r2lVar = new r2l((Activity) ai0Var.a, new h21(xqu.a((obq) ai0Var.e), (byte) 17), new h21(xqu.a((obq) ai0Var.d), (byte) 18), new t2l((Activity) ai0Var.a, (byte) 0), (g0l) daqVar.E5.get(), (zor) daqVar.V6.get(), new v1k((i8h1) ((daq) ai0Var.b).A5.get()));
                        return r2lVar;
                    case 3:
                        return j1l.e((g5t) ai0Var.c);
                    case 4:
                        return new fur((a1r0) ((jly0) ai0Var.f).get());
                    case 5:
                        return new c1r0((Activity) ai0Var.a, (mwn0) daqVar.Wd.get());
                    case 6:
                        r2lVar = new e7p0((Activity) ai0Var.a, (lzn0) ((obq) ai0Var.X).get(), (mwn0) daqVar.Wd.get(), (m7p0) daqVar.q9.get(), (d7p0) ((jly0) ai0Var.Z).get(), daqVar.fo, (w4p0) daqVar.go.get());
                        return r2lVar;
                    case 7:
                        g1n0 g1n0Var3 = (g1n0) ((jly0) ai0Var.t).get();
                        int i3 = t380.c;
                        aan0.s(g1n0Var3, kg11.t);
                        return g1n0Var3;
                    case 8:
                        r2lVar = new g1n0((Activity) ai0Var.a, (bi0) ((jly0) ai0Var.i).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
                        return r2lVar;
                    case 9:
                        return new yym0((Activity) ai0Var.a);
                    case 10:
                        return (d7p0) ((jly0) ai0Var.Y).get();
                    case 11:
                        return new d7p0();
                    case 12:
                        return new h5p0((a1r0) ((jly0) ai0Var.f).get());
                    case 13:
                        daq daqVar8 = (daq) ai0Var.b;
                        qjg qjgVar = new qjg(daqVar8.w1(), (tek1) ((jly0) ai0Var.j1).get(), (emc) daqVar8.G6.get(), (Scheduler) daqVar8.z1.get());
                        return new urj0(qjgVar);
                    case 14:
                        return new uek1((hmc) daqVar.Hb.get(), (p6w0) ((jly0) ai0Var.i1).get(), b8j0.j((f9j0) daqVar.F6.get()), b8j0.h((f9j0) daqVar.F6.get()));
                    case 15:
                        return new p6w0(xqu.a((obq) ai0Var.T0), xqu.a((obq) ai0Var.X0), xqu.a((obq) ai0Var.Y0), xqu.a((obq) ai0Var.Z0), xqu.a((obq) ai0Var.c1), xqu.a((obq) ai0Var.e1), xqu.a((obq) ai0Var.f1), xqu.a((obq) ai0Var.h1));
                    case 16:
                        dg30 dg30Var2 = (Activity) ai0Var.a;
                        y6a y6aVar = (y6a) daqVar.oj.get();
                        l4q l4qVar = (l4q) ((jly0) ai0Var.R0).get();
                        gw70 gw70Var = (gw70) daqVar.d8.get();
                        y4q0 y4q0Var = (y4q0) daqVar.Xp.get();
                        w7q0 w7q0Var = (w7q0) daqVar.Yp.get();
                        h7aVar = new h7a(y6aVar, (q8n) daqVar.f6.get(), l4qVar, dg30Var2, gw70Var, (v1q0) ((jly0) ai0Var.S0).get(), y4q0Var, w7q0Var);
                        return h7aVar;
                    case 17:
                        return new l4q(this, (byte) 2);
                    case 18:
                        return new n4q((byte) 2);
                    case 19:
                        return new o4q(this, (byte) 2);
                    case 20:
                        h7aVar = new x1q0((Activity) ai0Var.a, (mmc) daqVar.Zp.get(), (hmc) daqVar.Hb.get(), (qic) daqVar.Mb.get(), (z4q0) daqVar.aq.get());
                        return h7aVar;
                    case 21:
                        return new m0c((Activity) ai0Var.a, (ldj0) ((obq) ai0Var.W0).get(), (y4q0) daqVar.Xp.get(), b6);
                    case 22:
                        return new ldj0((Activity) ai0Var.a, (lzn0) ((obq) ai0Var.X).get(), (i3j0) ((jly0) ai0Var.V0).get(), (a1r0) ((jly0) ai0Var.f).get());
                    case 23:
                        return (i3j0) ((jly0) ai0Var.U0).get();
                    case 24:
                        return new i3j0((lzn0) ((obq) ai0Var.X).get(), (e4j0) daqVar.E7.get());
                    case 25:
                        return new m0c((Activity) ai0Var.a, (ldj0) ((obq) ai0Var.W0).get(), (y4q0) daqVar.Xp.get(), b2);
                    case 26:
                        return new m0c((Activity) ai0Var.a, (ldj0) ((obq) ai0Var.W0).get(), (y4q0) daqVar.Xp.get(), b7);
                    case 27:
                        h7aVar = new i5f1((Activity) ai0Var.a, new t2b((byte) 6, false), b8j0.g((f9j0) daqVar.F6.get()), (w7q0) daqVar.Yp.get(), (z4q0) daqVar.aq.get(), (v1q0) ((jly0) ai0Var.S0).get(), (y4q0) daqVar.Xp.get(), new n4f1((p4q) ((jly0) ai0Var.a1).get()), (gw70) daqVar.d8.get(), (i8h1) daqVar.A5.get(), (l6h1) daqVar.fg.get(), (x4f1) ((jly0) ai0Var.b1).get());
                        return h7aVar;
                    case 28:
                        return new p4q((byte) 2);
                    case 29:
                        return new zus((Activity) ai0Var.a, (e4j0) daqVar.E7.get(), (Scheduler) daqVar.z1.get(), (j5f1) daqVar.G7.get());
                    case 30:
                        return new bf80((w7q0) daqVar.Yp.get(), (y4q0) daqVar.Xp.get(), (v1q0) ((jly0) ai0Var.S0).get(), new rd80((q4q) ((jly0) ai0Var.d1).get()));
                    case 31:
                        return new q4q(this, (byte) 2);
                    case 32:
                        return new m0c((Activity) ai0Var.a, (ldj0) ((obq) ai0Var.W0).get(), (y4q0) daqVar.Xp.get(), b4);
                    case 33:
                        dg30 dg30Var3 = (Activity) ai0Var.a;
                        vox0 vox0Var = (vox0) daqVar.cq.get();
                        w7q0 w7q0Var2 = (w7q0) daqVar.Yp.get();
                        z4q0 z4q0Var = (z4q0) daqVar.aq.get();
                        v1q0 v1q0Var = (v1q0) ((jly0) ai0Var.S0).get();
                        y4q0 y4q0Var2 = (y4q0) daqVar.Xp.get();
                        gw70 gw70Var2 = (gw70) daqVar.d8.get();
                        i8h1 i8h1Var = (i8h1) daqVar.A5.get();
                        l6h1 l6h1Var = (l6h1) daqVar.fg.get();
                        h7aVar = new ut91((q8n) daqVar.f6.get(), dg30Var3, gw70Var2, v1q0Var, y4q0Var2, z4q0Var, w7q0Var2, vox0Var, new kr91((r4q) ((jly0) ai0Var.g1).get(), (o4q) ((jly0) ai0Var.Q0).get()), l6h1Var, i8h1Var);
                        return h7aVar;
                    case 34:
                        return new r4q((byte) 2);
                    case 35:
                        return new xh71((Activity) ai0Var.a, (qfb0) daqVar.Ag.get(), (a1r0) ((jly0) ai0Var.f).get(), (q8n) daqVar.w1.get());
                    default:
                        jah.e(b3);
                        return null;
                }
            case 4:
                pbq pbqVar = (pbq) obj;
                SpotifyCheckoutActivity spotifyCheckoutActivity = (SpotifyCheckoutActivity) pbqVar.f;
                daq daqVar9 = (daq) pbqVar.b;
                switch (b3) {
                    case 0:
                        return new a2k(j380.n(h22.class, new h21(xqu.a((obq) pbqVar.g), (byte) 3), qbs0.class, new t700(xqu.a((obq) pbqVar.i), (byte) 24), pyf.class, new h21(xqu.a((obq) pbqVar.t), (byte) 14), mh41.class, new uww0(xqu.a((obq) pbqVar.X), (byte) 7)));
                    case 1:
                        return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
                    case 2:
                        return kmq0.h((obq) pbqVar.h, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
                    case 3:
                        return new lbs0(new gbs0(daqVar9.D1(), new bx5((Context) daqVar9.x1.a)), new lvc((t2j0) daqVar9.f2.get()), new xcs0((dma1) daqVar9.C5.get(), (yqg) daqVar9.J1.get(), (nfa0) daqVar9.b2.get()));
                    case 4:
                        return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
                    case 5:
                        return rx31.c(daqVar.d8, daqVar.A5);
                    case 6:
                        c2r0 c2r0Var = (c2r0) daqVar.hm.get();
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        return c2r0Var.e(spotifyCheckoutActivity, yon1.G1("CHECKOUT_SPOTIFY", "checkout/spotify", 338, "checkout"), new lik1("spotify:checkout:spotify").a());
                    case 7:
                        return ((hik1) daqVar.zm.get()).a(spotifyCheckoutActivity, (b2r0) ((jly0) pbqVar.d).get());
                    default:
                        jah.e(b3);
                        return null;
                }
            case 5:
                return a();
            case 6:
                return b();
            case 7:
                byp bypVar = (byp) obj;
                q2p0 q2p0Var = (q2p0) bypVar.b;
                if (b3 == 0) {
                    return k9o0.t(q2p0Var);
                }
                if (b3 == 1) {
                    return k9o0.B(q2p0Var);
                }
                if (b3 == 2) {
                    return f2u0.B(f2u0.D((Flowable) ((jly0) bypVar.e).get()), (Flowable) ((jly0) bypVar.f).get(), (Flowable) ((jly0) bypVar.g).get(), bypVar.f());
                }
                if (b3 == 3) {
                    return f2u0.z((Flowable) ((jly0) bypVar.e).get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), bypVar.f());
                }
                if (b3 == 4) {
                    return f2u0.y((Flowable) ((jly0) bypVar.e).get(), bypVar.f());
                }
                if (b3 == 5) {
                    return k9o0.z(q2p0Var);
                }
                jah.e(b3);
                return null;
            case 8:
                return c();
            case 9:
                return d();
            case 10:
                return e();
            default:
                ip31 ip31Var = (ip31) obj;
                daq daqVar10 = (daq) ip31Var.c;
                XrProjectedActivity xrProjectedActivity = (XrProjectedActivity) ip31Var.b;
                if (b3 == 0) {
                    return t380.p(s2.p((gu7) ((jly0) ip31Var.e).get(), new y4l(daqVar10.F(), (fpr) daqVar10.Ka.get(), daqVar10.k2())));
                }
                if (b3 == 1) {
                    return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) ip31Var.d).get(), (yqg) daqVar.J1.get(), xrProjectedActivity);
                }
                if (b3 == 2) {
                    return j310.x(xrProjectedActivity, (t8u0) daqVar.d9.get());
                }
                if (b3 == 3) {
                    return new klm1();
                }
                if (b3 != 4) {
                    if (b3 == 5) {
                        return new loc1();
                    }
                    jah.e(b3);
                    return null;
                }
                t8u0 t8u0Var = (t8u0) daqVar10.d9.get();
                Flowable flowable = (Flowable) daqVar10.D5.get();
                Scheduler scheduler = (Scheduler) daqVar10.z1.get();
                yqg yqgVar = (yqg) daqVar10.J1.get();
                cyp cypVarA = t8u0Var.a(((f0i) xrProjectedActivity).a);
                arb1 arb1Var = new arb1(cypVarA.a(), new grb1(flowable.L(scheduler), yqgVar, new erb1(yqgVar), new frb1(yqgVar), new Handler()));
                cypVarA.c();
                return arb1Var;
        }
    }
}
