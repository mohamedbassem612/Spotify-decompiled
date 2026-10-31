package p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.base.java.logging.Logger;
import com.spotify.liveevents.recentlocationsimpl.db.RecentLocationsDatabase;
import com.spotify.liveevents.recentlocationsimpl.db.RecentLocationsDatabase_Impl;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vwz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vwz0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        NetworkCapabilities networkCapabilities;
        cue0 cue0Var;
        String str;
        wpw gj11Var;
        wpw wpwVarA;
        wpw wpwVarT;
        wpw jpg0Var;
        wpw wpwVarT2;
        byte b = 13;
        byte b2 = 0;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.b;
                frq0 frq0Var = frq0.UNKNOWN;
                if (connectivityManager != null) {
                    try {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                            frq0Var = networkCapabilities.hasCapability(16) ? frq0.VALIDATED : frq0.NOT_VALIDATED;
                        }
                        break;
                    } catch (SecurityException unused) {
                    }
                }
                return frq0Var;
            case 1:
                yxz0 yxz0Var = (yxz0) this.b;
                vdq vdqVar = yxz0Var.b;
                String str2 = yxz0Var.a;
                teq teqVar = vdqVar.a.d;
                return new kpg0(new nxz0(str2, true, null, teqVar.c3(), new uqv0((iyc0) teqVar.g1.get(), (byte) 14), (t001) teqVar.a2.get()), new ldz0(yxz0Var, (byte) 7));
            case 2:
                c101 c101Var = (c101) this.b;
                kgq kgqVar = c101Var.a;
                String str3 = c101Var.b;
                kgqVar.getClass();
                return new fqm(str3);
            case 3:
                ((cmh1) this.b).dispose();
                return rih1.a;
            case 4:
                a901 a901Var = (a901) this.b;
                View view = a901Var.a;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(2131429801);
                tka0 tka0Var = dtw.C;
                Context context = view.getContext();
                frameLayout.getClass();
                dtw dtwVarD = mhc.d(context, frameLayout, a901Var.d, (drw) null, 24);
                k8p1.o(frameLayout, dtwVarD.w);
                return dtwVarD;
            case 5:
                return ((y901) this.b).Q0().findViewById(2131430703);
            case 6:
                ((ss50) this.b).a(0);
                return rih1.a;
            case 7:
                ((RecentLocationsDatabase) ((im01) ((wo5) this.b).b).a.c).d();
                return rih1.a;
            case 8:
                return new gm01((RecentLocationsDatabase_Impl) this.b);
            case 9:
                return new xgx0(((kt01) this.b).b, 2);
            case 10:
                return new vfv(((kv01) this.b).a);
            case 11:
                p811 p811Var = new p811();
                p811Var.a = new bx01(b7x.a);
                return Observable.defer(new xf0((gx01) this.b, p811Var, b)).replay(1).f();
            case 12:
                ((lx01) this.b).O0.invoke(ix01.a);
                return rih1.a;
            case 13:
                wo5 wo5Var = (wo5) this.b;
                yg8 yg8Var = ((n4f0) wo5Var.c).h;
                if ((yg8Var == null || (yg8Var != yg8.t && yg8Var != yg8.X && yg8Var != yg8.Y)) && (str = (cue0Var = (cue0) wo5Var.b).d) != null) {
                    cue0Var.a(new z9b0(str, (byte) 10));
                }
                return rih1.a;
            case 14:
                return new kpg0((xpw) ((uyp) ((j2y0) this.b).f).get(), a411.Q0);
            case 15:
                ((vwz0) this.b).invoke();
                return rih1.a;
            case 16:
                ((jh11) this.b).b.e();
                return rih1.a;
            case 17:
                yh11 yh11Var = (yh11) ((oas) this.b).b.get();
                yl1 yl1Var = yh11Var.c;
                dxy dxyVar = yh11Var.i;
                u4q0 u4q0Var = yh11Var.C;
                qn4 qn4Var = yh11Var.H;
                xfx xfxVar = yh11Var.a;
                qzh qzhVarT = voo1.t(xfxVar, (xzf1) null);
                yir yirVar = new yir(xfxVar.a.a, (byte) 0);
                wnq wnqVar = yh11Var.e;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) yirVar.c;
                ynq ynqVar = (ynq) wnqVar.a.c;
                FlowableMap flowableMapB = ynqVar.b();
                ln91 ln91VarI1 = ynqVar.a.i1();
                c8o.l(ln91VarI1);
                uh11 uh11Var = ynqVar.a;
                Scheduler schedulerO = uh11Var.o();
                c8o.l(schedulerO);
                Scheduler schedulerG = uh11Var.G();
                c8o.l(schedulerG);
                ip31 ip31Var = new ip31((View) appCompatImageButton, flowableMapB, ln91VarI1, schedulerO, schedulerG, xqu.a(ynqVar.Q), xqu.a(ynqVar.c), xqu.a(ynqVar.R));
                sap sapVar = yh11Var.b;
                rh11 rh11Var = yh11Var.B;
                if (rh11Var.a() || rh11Var.e() || u4q0Var.h()) {
                    s880 s880Var = yh11Var.k;
                    gj11Var = new gj11((Flowable) s880Var.b, (Flowable) s880Var.c, (w9u0) s880Var.d, (yqg) s880Var.f, (kvs0) s880Var.e, (rh11) s880Var.g, (u4q0) s880Var.h, (a1r0) s880Var.a, voo1.s(xfxVar));
                } else {
                    gj11Var = yh11Var.j.a(voo1.s(xfxVar));
                }
                if (qn4Var.a()) {
                    gj11Var = dxyVar.t(new vh11(gj11Var, (byte) 0), new wh11(yh11Var, b2), 3);
                }
                if (qn4Var.b()) {
                    vi11 vi11Var = yh11Var.m;
                    wpwVarA = new xi11((Flowable) vi11Var.b, (Flowable) vi11Var.c, (w9u0) vi11Var.d, (mrq0) vi11Var.e, (h691) vi11Var.f, voo1.r(xfxVar));
                } else {
                    wpwVarA = yh11Var.l.a(voo1.r(xfxVar));
                }
                wpw wpwVarT3 = wpwVarA;
                if (qn4Var.a()) {
                    wpwVarT3 = dxyVar.t(new vh11(wpwVarT3, (byte) 1), new wh11(yh11Var, b3), 3);
                }
                ye51 ye51Var = new ye51(gj11Var, wpwVarT3);
                pbq pbqVar = yh11Var.n;
                qzh qzhVarV = voo1.v(xfxVar);
                wpw ti11Var = new ti11((Flowable) pbqVar.f, (xbu0) pbqVar.i, (sas) pbqVar.t, (kvs0) pbqVar.X, (t8r0) pbqVar.c, new hj11((AppCompatImageButton) ((tps) qzhVarV).t), new ij11(2131961027), qzhVarV, (ywv0) pbqVar.b, (pqs) pbqVar.g, (ynb0) pbqVar.h, (u4q0) pbqVar.d, (a1r0) pbqVar.e);
                if (qn4Var.a()) {
                    ti11Var = dxyVar.t(new vwz0(ti11Var, (byte) 19), new wh11(yh11Var, (byte) 2), 3);
                }
                if (((e05) rh11Var.a.get()).b()) {
                    wpwVarT = yh11Var.o;
                } else {
                    Object obj = yh11Var.s.get();
                    obj.getClass();
                    wpwVarT = (wpw) obj;
                }
                if (qn4Var.a()) {
                    wpwVarT = dxyVar.t(new vh11(wpwVarT, (byte) 2), new wh11(yh11Var, (byte) 3), 3);
                }
                ye51 ye51Var2 = new ye51(ti11Var, wpwVarT);
                byte b4 = 4;
                if (qn4Var.a()) {
                    wpwVarT2 = dxyVar.t(new zkz0(yh11Var, qzhVarT, (byte) 17), new wh11(yh11Var, b4), 1);
                    sapVar = sapVar;
                    yirVar = yirVar;
                    ip31Var = ip31Var;
                } else {
                    if (rh11Var.e() || u4q0Var.h()) {
                        pbq pbqVar2 = yh11Var.g;
                        jpg0Var = new jpg0(new ri11((Flowable) pbqVar2.f, (Flowable) pbqVar2.b, (w9u0) pbqVar2.g, (Consumer) pbqVar2.h, (kvs0) pbqVar2.i, (u4q0) pbqVar2.X, (a1r0) pbqVar2.c, qzhVarT, (jn4) pbqVar2.t, (rh11) pbqVar2.d, (dma1) pbqVar2.e), fd11.S0);
                    } else {
                        jpg0Var = new jpg0(yh11Var.f.a(qzhVarT), fd11.T0);
                    }
                    wpwVarT2 = jpg0Var;
                }
                uo5 uo5Var = new uo5(new jpg0(yl1Var.a(voo1.i(xfxVar)), fd11.U0), new jpg0(yl1Var.a(voo1.i(xfxVar)), fd11.f), new rt01((s880) yh11Var.d.b, yirVar), (byte) 17);
                eyh0 eyh0Var = new eyh0(yh11Var.w.a(voo1.o(xfxVar)), o671.a(yh11Var.v, voo1.u(xfxVar)), 4);
                lzd lzdVar = new lzd(lkf1.c, null);
                lkf1 lkf1Var = lkf1.b;
                mr20 mr20Var = yh11Var.I;
                List listM = p7h.M(new lzd[]{lzdVar, new lzd(lkf1Var, mr20Var), new lzd(lkf1.a, mr20Var), new lzd(lkf1.g, null)});
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new wzq(yh11Var.x.a(), fd11.g));
                smc0VarN.add(new jpg0(f6o1.A(duy.a(yh11Var.t, 3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), fd11.h));
                smc0VarN.add(new wzq(fdg1.m0(vsy.a(yh11Var.u), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), fd11.i));
                return sapVar.a(ye51Var, ye51Var2, wpwVarT2, uo5Var, eyh0Var, listM, new xq60(k4p1.k(smc0VarN)), (128 & 128) != 0 ? null : null, new bjx(new ak01(yh11Var, (byte) 14), fd11.t, fd11.X, fd11.Y, fd11.Z, fd11.N0, (byte) 18), new a5p0(yh11Var.z, yh11Var.A, yh11Var.y), (128 & 1024) != 0 ? wso0.f : new xh11(ip31Var, yh11Var, (byte) 0), (128 & 2048) != 0 ? wso0.g : new xh11(ip31Var, yh11Var, (byte) 1));
            case 18:
                return (i8h1) ((tas) this.b).b.get();
            case 19:
                return (ti11) this.b;
            case 20:
                kdy0 kdy0Var = (kdy0) this.b;
                return ((pp11) kdy0Var.c).a(((iac0) kdy0Var.d).getLifecycle(), false, false, (PlayOrigin) kdy0Var.e);
            case 21:
                tka0 tka0Var2 = dtw.C;
                ox11 ox11Var = (ox11) this.b;
                LinearLayout linearLayout = ox11Var.a;
                return mhc.b(linearLayout.getContext(), new FrameLayout(linearLayout.getContext()), (sd20) ox11Var.i.getValue(), new rd20(w7x.a), (ipb1) null, 112);
            case 22:
                ((ez11) this.b).a.d();
                return rih1.a;
            case 23:
                mz11 mz11Var = (mz11) this.b;
                luk lukVar = mz11Var.b;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(mz11Var, (byte) 13));
                }
                return null;
            case 24:
                nz11 nz11Var = (nz11) this.b;
                luk lukVar2 = nz11Var.c;
                if (lukVar2 != null) {
                    return lukVar2.e(new e4n0(nz11Var, (byte) 14));
                }
                return null;
            case 25:
                d6b1 d6b1Var = (d6b1) ((kly0) ((wo5) this.b).b).get();
                h1i0 h1i0Var = d6b1Var.f;
                h1i0Var.getClass();
                Logger.g("Stopping MediaSessionStateHandler", new Object[0]);
                h1i0Var.f.g();
                txh0 txh0Var = d6b1Var.c;
                txh0Var.d = null;
                txh0Var.b = null;
                d6b1Var.k.a();
                dg90 dg90Var = d6b1Var.g;
                if (dg90Var != null) {
                    boolean z = d6b1Var.i;
                    y490 y490Var = (y490) dg90Var.b;
                    y490Var.h();
                    if (z) {
                        y490Var.reset();
                    }
                    tyh0 tyh0Var = d6b1Var.h;
                    ryh0 ryh0Var = new ryh0();
                    tyh0Var.b = ryh0Var;
                    dg90 dg90Var2 = tyh0Var.a;
                    if (dg90Var2 != null) {
                        ((y490) dg90Var2.b).setExtras(ryh0Var.b());
                    }
                }
                d6b1Var.j = false;
                d6b1Var.c();
                return rih1.a;
            case 26:
                d6b1 d6b1Var2 = (d6b1) ((kly0) ((l021) this.b).b).get();
                d6b1Var2.j = true;
                ((y490) d6b1Var2.b().b).j();
                d6b1Var2.k.b(new FlowableDoFinally(d6b1Var2.e.a("d6b1").L(d6b1Var2.b), new w43(d6b1Var2, (byte) 11)).subscribe(new fv5(d6b1Var2, (byte) 25)));
                return rih1.a;
            case 27:
                o021 o021Var = (o021) this.b;
                return d5p1.r(new f5y0(yoi1.g(hqq0.O(o021Var.b)), o021Var, (byte) 23), smo1.e(o021Var.c), new alb1(0L, Long.MAX_VALUE), 1);
            case 28:
                return new nm61((r4r) this.b);
            default:
                return Float.valueOf((float) ((guk1) this.b).c);
        }
    }
}
