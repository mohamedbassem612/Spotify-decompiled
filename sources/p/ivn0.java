package p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Empty;
import com.spotify.mobius.MobiusLoop;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplayingbar.nowplayingbar.view.carousel.TrackInfoView;
import com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider;
import com.spotify.widgets.npvwidget.WidgetUpdateCoordinator;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ivn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ivn0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 3;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jvn0) obj).c();
                return rih1Var;
            case 1:
                return new zfs0(new lbc0(1, (MobiusLoop) ((mwn0) obj).h.getValue(), MobiusLoop.class, "dispatchEvent", "dispatchEvent(Ljava/lang/Object;)V", 0, (byte) 29));
            case 2:
                ((lzn0) ((eyn0) obj).f).e();
                return rih1Var;
            case 3:
                ((g2o0) obj).d.g();
                return rih1Var;
            case 4:
                q8n q8nVar = ((u2o0) obj).d;
                j0d1 j0d1VarB = guo1.B();
                q8nVar.getClass();
                return flo1.l(q8nVar, j0d1VarB);
            case 5:
                q8n q8nVar2 = ((y2o0) obj).c;
                j0d1 j0d1VarB2 = guo1.B();
                q8nVar2.getClass();
                return flo1.l(q8nVar2, j0d1VarB2);
            case 6:
                ((p3o0) obj).d.l();
                return rih1Var;
            case 7:
                ((a4o0) obj).d.l();
                return rih1Var;
            case 8:
                q6o0 q6o0Var = new q6o0((w5o0) obj);
                q6o0Var.g(true);
                return q6o0Var;
            case 9:
                g2z g2zVar = (g2z) obj;
                mu4 mu4Var = (mu4) g2zVar.a;
                return new ht20(new fu20(new iib(new sii0(r4p1.k(hu20.d(new mr20[]{(dt71) mu4Var.d, new m441(new k53(mu4Var, (lnm) null, (byte) 1)), d5p1.g((dt71) g2zVar.d)}), 500L), g2zVar, (byte) 12), new xx0(g2zVar, (lnm) null, (byte) 14), (byte) 6), new ibo0(g2zVar, (lnm) null, (byte) 0), (byte) 1), new ian0(g2zVar, lnmVar, b2));
            case 10:
                g9r g9rVar = (g9r) obj;
                vno0 vno0Var = (vno0) g9rVar.c;
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    if (i >= 26) {
                        kw7.r(vno0Var.b, "NOTIFICATION_CHANNEL_DEFAULT");
                    } else {
                        vno0Var.getClass();
                    }
                    if (((zg4) g9rVar.b).m()) {
                        if (i >= 26) {
                            kw7.r(vno0Var.b, "NOTIFICATION_CHANNEL_MESSAGES");
                        } else {
                            vno0Var.getClass();
                        }
                    }
                }
                return rih1Var;
            case 11:
                iqo0 iqo0Var = (iqo0) obj;
                Map map = iqo0Var.e;
                ipo0 ipo0Var = iqo0Var.d.b;
                Object obj2 = map.get(ipo0Var);
                if (obj2 != null) {
                    return (hpo0) obj2;
                }
                bhn0.s(ipo0Var, "No NotificationOptInConfig registered for key ");
                return null;
            case 12:
                dg30 dg30VarN0 = ((fso0) obj).N0();
                hce1 hce1Var = new hce1(dg30VarN0.o(), dg30VarN0.N(), n9p1.s(dg30VarN0));
                tka0 tka0VarB = rc11.a.b(gso0.class);
                String strO = tka0VarB.o();
                if (strO != null) {
                    return (gso0) hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
                }
                hhg1.n("Local and anonymous classes can not be ViewModels");
                return null;
            case 13:
                return (tl7) obj;
            case 14:
                Function0 function0 = (Function0) ((u3) obj).b;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 15:
                ((lb5) obj).removeAllViews();
                return rih1Var;
            case 16:
                View viewFindViewById = ((TrackInfoView) obj).findViewById(2131429806);
                cx0 cx0Var = new cx0((byte) 18);
                tka0 tka0Var = dtw.C;
                dtw dtwVarB = mhc.b(viewFindViewById.getContext(), (ViewGroup) viewFindViewById.getParent(), new rmd0(f6o1.A(cx0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3)), new smd0(false, false), (ipb1) null, 112);
                k8p1.o(viewFindViewById, dtwVarB.w);
                return dtwVarB;
            case 17:
                View viewFindViewById2 = ((j2p0) obj).Z.findViewById(2131428191);
                dtw dtwVarE = j2p0.e(new rmd0(f6o1.A(new cx0((byte) 18), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3)), (ViewGroup) viewFindViewById2.getParent(), new smd0(false, false));
                k8p1.o(viewFindViewById2, dtwVarE.w);
                return dtwVarE;
            case 18:
                return ((r3p0) obj).L1.b();
            case 19:
                return ((x3p0) obj).g.b();
            case 20:
                m7p0 m7p0Var = ((b4p0) obj).I1;
                if (m7p0Var != null) {
                    return new l7p0(m7p0Var.c.incrementAndGet());
                }
                u890.C("nowPlayingVisibilityStateUpdater");
                throw null;
            case 21:
                return (i8h1) ((u4p0) obj).d.get();
            case 22:
                return (i8h1) ((kly0) ((rzo0) obj).b).get();
            case 23:
                b7p0 b7p0Var = (b7p0) obj;
                Flowable flowable = b7p0Var.c;
                vbm[] vbmVarArr = q601.a;
                mr20 mr20VarU = rqt0.u(new kge(flowable));
                ytw0 ytw0Var = jfv.b;
                return d5p1.t(new r6k0(rqt0.u(new f8f0(r4p1.k(mr20VarU, hap1.u(fdg1.k0(100, ngv.d))), (byte) 6)), (byte) 29), cto1.q(b7p0Var.a), new alb1(0L, Long.MAX_VALUE), (Object) null);
            case 24:
                Context context = (Context) ((km0) obj).c;
                Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
                intent.setAction("com.spotify.widgets.widgets.ACTION_USER_LOGOUT");
                context.sendBroadcast(intent);
                return rih1Var;
            case 25:
                ynb0 ynb0Var = ((kaa) ((NpvWidgetProvider) obj)).d;
                if (ynb0Var != null) {
                    return sqg0.U(((rol1) ynb0Var.get()).a);
                }
                u890.C("bitmapCache");
                throw null;
            case 26:
                ph61 ph61VarE = ((mlv0) ((u6j0) obj).b).e();
                q qVar = new q();
                qVar.b = EmptyDisposable.a;
                qVar.b = ((be) ph61VarE.h.b).callStream("spotify.connectivity.auth.esperanto.proto.Session", "apPermanentError", Empty.n()).map(zov0.e).map(oa61.a).subscribe(p.b);
                return qVar;
            case 27:
                return new w((fnh0) ((ibp0) obj).invoke(), (byte) 0);
            case 28:
                return new yv(new z34(true, (xz11) ((xap0) obj).invoke()));
            default:
                return new w((jb0) ((qcp0) obj).invoke());
        }
    }
}
