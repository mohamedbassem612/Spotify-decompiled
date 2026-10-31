package p;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import com.spotify.player.model.PlayerState;
import com.spotify.pses.v1.proto.ClientData;
import com.spotify.pses.v1.proto.ConfigurationRequest;
import com.spotify.pses.v1.proto.DeviceInformation;
import com.spotify.pses.v1.proto.Screen;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import j$.time.Clock;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yj1 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        crq0 crq0Var;
        byte b = this.a;
        nwq0 nwq0Var = nwq0.b;
        nwq0 nwq0Var2 = nwq0.a;
        o6x o6xVar = o6x.a;
        char c = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new p301(((b301) obj).c);
            case 1:
                View view = ((AdsOverlayControlsLayout) obj).R0;
                if (view != null && view.getVisibility() == 0) {
                    nwq0Var = nwq0Var2;
                }
                return Flowable.I(nwq0Var);
            case 2:
                g38 g38Var = (g38) obj;
                w28 w28VarA = g38Var.i.a();
                g38Var.h.set(sap1.a());
                return w28VarA;
            case 3:
                cce cceVar = (cce) obj;
                return yoi1.i(new mgb(((yzc0) ((ynb0) cceVar.c).get()).j(), cceVar, (byte) 26), o6xVar);
            case 4:
                return ((g3s0) ((rhn) obj).c.get()).a(f3s0.b);
            case 5:
                mnr mnrVar = (mnr) obj;
                mnrVar.c.set(true);
                ArrayList arrayList = mnrVar.b;
                b380 b380VarP = b380.p(arrayList);
                arrayList.clear();
                return mnrVar.d.startWithIterable(b380VarP).doOnDispose(new f72(mnrVar, (byte) 11));
            case 6:
                m0w m0wVar = (m0w) obj;
                m0wVar.c.set(true);
                ArrayList arrayList2 = m0wVar.b;
                List listL1 = o7h.l1(arrayList2);
                arrayList2.clear();
                return m0wVar.d.startWithIterable(listL1).doOnDispose(new f72(m0wVar, (byte) 16));
            case 7:
                p900 p900Var = (p900) obj;
                p900Var.c.set(true);
                ArrayList arrayList3 = p900Var.b;
                b380 b380VarP2 = b380.p(arrayList3);
                arrayList3.clear();
                return p900Var.d.startWithIterable(b380VarP2).doOnDispose(new f72(p900Var, (byte) 20));
            case 8:
                return yoi1.i(((zwz0) ((ynb0) obj).get()).c(), o6xVar);
            case 9:
                return ((Observable) obj).switchMap(new hl00(new AtomicBoolean(false), (byte) 3));
            case 10:
                return ((u560) ((kly0) obj).get()).a;
            case 11:
                return Observable.create(new bm00(new en70(((bbr0) obj).b0(bn70.class)), (byte) 16));
            case 12:
                nwa0 nwa0Var = (nwa0) obj;
                swa0 swa0Var = nwa0Var.b;
                lik1 lik1VarV = ozn1.v(nwa0Var.d.a);
                return (lik1VarV.equals(nik1.r3) || lik1VarV.equals(nik1.H3.b(lik1VarV.a))) ? new qwa0(swa0Var.c(), swa0Var.d.Z) : new qwa0(0, swa0Var.d.Z);
            case 13:
                return (moy0) ((yse0) obj).a.get();
            case 14:
                qig0 qig0Var = (qig0) obj;
                kh0 kh0Var = qig0Var.g;
                if (kh0Var != null) {
                    return qig0Var.b.O(kh0Var).firstOrError().map(zz10.N0).doOnSuccess(new rwa0(qig0Var, (byte) 22)).compose(new jpa0(qig0Var, (byte) 16));
                }
                Single singleError = Single.error(new IllegalStateException("Unable to register activity result"));
                singleError.getClass();
                return singleError;
            case 15:
                ima1 ima1Var = ((p8o) obj).a;
                bma1 bma1Var = nfo0.a;
                return yoi1.i(ima1Var.q(bma1Var), o6xVar).filter(d710.R0).map(e710.R0).startWithItem(Boolean.valueOf(ima1Var.h(bma1Var, true))).distinctUntilChanged();
            case 16:
                return Flowable.I(Boolean.valueOf(((NowPlayingScrollView) obj).getScrollY() > 0));
            case 17:
                if (((OverlayHidingFrameLayout) obj).e()) {
                    nwq0Var = nwq0Var2;
                }
                return Flowable.I(nwq0Var);
            case 18:
                return ((x2s0) obj).b.a();
            case 19:
                return (tjm) obj;
            case 20:
                lbu0 lbu0Var = (lbu0) obj;
                return lbu0Var.b.x(new e5l0(lbu0Var, (byte) 27)).x(new vgq0(lbu0Var, (byte) 10)).y(PlayerState.EMPTY);
            case 21:
                wlv0 wlv0Var = (wlv0) obj;
                vlv0 vlv0Var = wlv0Var.d;
                muk mukVarN = ConfigurationRequest.n();
                ip31 ip31Var = wlv0Var.b;
                uig uigVarN = ClientData.n();
                uigVarN.w((String) ip31Var.i);
                zym0 zym0Var = (ajg) ip31Var.c;
                uigVarN.u(((String[]) ihc1.Q0(zym0Var.e(), new String[]{"-"}, 0, 6).toArray(new String[0]))[0]);
                uigVarN.r((String) ip31Var.b);
                uigVarN.t();
                no41 no41VarN = Screen.n();
                DisplayMetrics displayMetrics = (DisplayMetrics) ip31Var.d;
                no41VarN.n(displayMetrics.heightPixels);
                no41VarN.r(displayMetrics.widthPixels);
                no41VarN.q(displayMetrics.density);
                uigVarN.v(no41VarN.build());
                yqt yqtVarN = DeviceInformation.n();
                jc9 jc9Var = (jc9) ip31Var.e;
                yqtVarN.t(String.valueOf(Build.VERSION.SDK_INT));
                String str = Build.BRAND;
                yqtVarN.n();
                String str2 = Build.MODEL;
                yqtVarN.s();
                fad0 fad0Var = (fad0) ip31Var.g;
                yqtVarN.r(((DateTimeFormatter) fad0Var.c).format(((Clock) fad0Var.b).instant()));
                long jC = tm80.C((Activity) jc9Var.b);
                yqtVarN.u(jC == -1 ? -1 : (int) ((jC / 1000) / 1000));
                yqtVarN.q(((dxz0) ((i6b) ip31Var.f).b).b().d);
                uigVarN.q(yqtVarN.build());
                f1f0 f1f0Var = (f1f0) ip31Var.h;
                if (f1f0Var.b) {
                    crq0Var = f1f0Var.a ? crq0.c : crq0.d;
                } else {
                    crq0Var = crq0.b;
                }
                f1f0Var.a = false;
                f1f0Var.b = false;
                uigVarN.s(crq0Var);
                uigVarN.n(zym0Var.a);
                mukVarN.n(uigVarN.build());
                return vlv0Var.a(mukVarN.build()).map(new uip0(wlv0Var, (byte) 17));
            case 22:
                Set set = ((yov0) obj).a;
                ArrayList arrayList4 = new ArrayList(q7h.U(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((xov0) it.next()).a());
                }
                return Single.zip(arrayList4, ta20.d1);
            case 23:
                lzw0 lzw0Var = (lzw0) obj;
                lzw0Var.d.set(true);
                ArrayList arrayList5 = lzw0Var.b;
                List listL2 = o7h.l1(arrayList5);
                arrayList5.clear();
                return lzw0Var.c.startWithIterable(listL2).doOnDispose(new wqd0(lzw0Var, (byte) 22));
            case 24:
                yaz0 yaz0Var = (yaz0) obj;
                eh4 eh4Var = yaz0Var.a;
                boolean zF = eh4Var.f();
                p241 p241Var = yaz0Var.c;
                if (zF) {
                    return Observable.combineLatest(p241Var.a.filter(r6x0.d), new ObservableFromPublisher(yaz0Var.e.J(y6x0.c)).distinctUntilChanged(), eh4Var.j(), new s6z0((Object) yaz0Var, (byte) (c == true ? 1 : 0)));
                }
                Observable observableDistinctUntilChanged = p241Var.a.filter(p5x0.d).distinctUntilChanged();
                qns0 qns0Var = yaz0Var.d;
                return Observable.combineLatest(observableDistinctUntilChanged, yoi1.i(qns0Var.c(), qns0Var.a).startWithItem(new j5q0(false)), eh4Var.j(), r5x0.d).switchMap(new rpv0(yaz0Var, (byte) 10));
            case 25:
                return ((tk21) obj).b;
            case 26:
                return (moy0) ((xi61) obj).b.get();
            case 27:
                ima1 ima1Var2 = ((iov0) obj).a;
                bma1 bma1Var2 = o181.a;
                return yoi1.i(ima1Var2.q(bma1Var2), o6xVar).filter(b4x0.X).map(c4x0.Y).startWithItem(Boolean.valueOf(ima1Var2.h(bma1Var2, false))).distinctUntilChanged();
            case 28:
                ima1 ima1Var3 = ((t0t) obj).a;
                bma1 bma1Var3 = a281.a;
                return yoi1.i(ima1Var3.q(bma1Var3), o6xVar).filter(i5x0.t).map(p5x0.Y).startWithItem(Boolean.valueOf(ima1Var3.h(bma1Var3, false))).distinctUntilChanged();
            default:
                h991 h991Var = (h991) obj;
                return Observable.combineLatest(h991Var.b.e(), h991Var.a.e(), icx0.Z);
        }
    }
}
