package p;

import android.content.Context;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i0q implements dl4 {
    public final AuthorizationActivity a;
    public final daq b;
    public final jly0 c;
    public final jly0 d;
    public final p2p e;
    public final jly0 f;

    public i0q(daq daqVar, AuthorizationActivity authorizationActivity) {
        this.b = daqVar;
        this.a = authorizationActivity;
        this.c = xqu.b(new p2p(daqVar, this, 2, (byte) 15));
        this.d = xqu.b(new p2p(daqVar, this, 1, (byte) 15));
        this.e = new p2p(daqVar, this, 0, (byte) 15);
        this.f = xqu.b(new p2p(daqVar, this, 3, (byte) 15));
    }

    public final void w(Object obj) {
        AuthorizationActivity authorizationActivity = (AuthorizationActivity) obj;
        daq daqVar = this.b;
        ((t3b1) authorizationActivity).b1 = (jgu) daqVar.a.g0.get();
        ((t3b1) authorizationActivity).c1 = new tuk(xqu.a(this.e));
        authorizationActivity.m1 = (BehaviorSubject) daqVar.To.get();
        authorizationActivity.p1 = (PublishSubject) daqVar.Hm.get();
        AuthorizationActivity authorizationActivity2 = this.a;
        authorizationActivity.s1 = new hur(authorizationActivity2, (byte) 25);
        jly0 jly0Var = this.f;
        authorizationActivity.l1 = (zq8) jly0Var.get();
        authorizationActivity.q1 = new lag((t2j0) daqVar.f2.get(), (Flowable) daqVar.z2.get(), (jqt) daqVar.Z1.get());
        Scheduler scheduler = (Scheduler) daqVar.r3.get();
        Scheduler scheduler2 = (Scheduler) daqVar.z1.get();
        final Flowable flowable = (Flowable) daqVar.z2.get();
        km3 km3Var = new km3((yze1) daqVar.Gm.get(), new x5j1((w5b1) daqVar.W3.get(), (byte) 2));
        z141 z141Var = (z141) daqVar.B8.get();
        final byte b = 1;
        Maybe maybeFirstElement = eth.X((xm41) daqVar.l5.get()).filter(new q58((byte) 1)).firstElement();
        maybeFirstElement.getClass();
        final MaybeIgnoreElementCompletable maybeIgnoreElementCompletable = new MaybeIgnoreElementCompletable(maybeFirstElement);
        final hq8 hq8Var = new hq8(scheduler, scheduler2, flowable, km3Var, z141Var, maybeIgnoreElementCompletable, (Context) daqVar.x1.a);
        zq8 zq8Var = (zq8) jly0Var.get();
        rq8 rq8Var = new rq8();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.a(zp8.class, new w43(authorizationActivity2, (byte) 2));
        final byte b2 = 0;
        subtypeEffectHandlerBuilderC.d(up8.class, new gq8(authorizationActivity2, (byte) 0), scheduler2);
        subtypeEffectHandlerBuilderC.d(vp8.class, new gq8(authorizationActivity2, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.d(wp8.class, new po5(hq8Var, authorizationActivity2, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.d(tp8.class, new gq8(authorizationActivity2, (byte) 4), scheduler2);
        subtypeEffectHandlerBuilderC.d(qp8.class, new gq8(authorizationActivity2, (byte) 2), scheduler2);
        final byte b3 = 3;
        subtypeEffectHandlerBuilderC.d(rp8.class, new gq8(authorizationActivity2, (byte) 3), scheduler2);
        subtypeEffectHandlerBuilderC.g(xp8.class, new eq8(km3Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(sp8.class, new eq8(km3Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(yp8.class, new ObservableTransformer() { // from class: p.dq8
            public final ObservableSource apply(Observable observable) {
                byte b4 = b;
                Object obj2 = hq8Var;
                switch (b4) {
                    case 0:
                        return observable.switchMap(new vq6((Flowable) obj2, (byte) 8));
                    case 1:
                        return observable.switchMap(new vq6((hq8) obj2, (byte) 9));
                    case 2:
                        return observable.switchMap(new vq6((MaybeIgnoreElementCompletable) obj2, (byte) 11));
                    default:
                        return observable.switchMap(new vq6((Observable) obj2, (byte) 10));
                }
            }
        });
        subtypeEffectHandlerBuilderC.g(cq8.class, new ObservableTransformer() { // from class: p.dq8
            public final ObservableSource apply(Observable observable) {
                byte b4 = b2;
                Object obj2 = flowable;
                switch (b4) {
                    case 0:
                        return observable.switchMap(new vq6((Flowable) obj2, (byte) 8));
                    case 1:
                        return observable.switchMap(new vq6((hq8) obj2, (byte) 9));
                    case 2:
                        return observable.switchMap(new vq6((MaybeIgnoreElementCompletable) obj2, (byte) 11));
                    default:
                        return observable.switchMap(new vq6((Observable) obj2, (byte) 10));
                }
            }
        });
        final Observable observable = hq8Var.b;
        subtypeEffectHandlerBuilderC.g(aq8.class, new ObservableTransformer() { // from class: p.dq8
            public final ObservableSource apply(Observable observable2) {
                byte b4 = b3;
                Object obj2 = observable;
                switch (b4) {
                    case 0:
                        return observable2.switchMap(new vq6((Flowable) obj2, (byte) 8));
                    case 1:
                        return observable2.switchMap(new vq6((hq8) obj2, (byte) 9));
                    case 2:
                        return observable2.switchMap(new vq6((MaybeIgnoreElementCompletable) obj2, (byte) 11));
                    default:
                        return observable2.switchMap(new vq6((Observable) obj2, (byte) 10));
                }
            }
        });
        final byte b4 = 2;
        subtypeEffectHandlerBuilderC.g(bq8.class, new ObservableTransformer() { // from class: p.dq8
            public final ObservableSource apply(Observable observable2) {
                byte b5 = b4;
                Object obj2 = maybeIgnoreElementCompletable;
                switch (b5) {
                    case 0:
                        return observable2.switchMap(new vq6((Flowable) obj2, (byte) 8));
                    case 1:
                        return observable2.switchMap(new vq6((hq8) obj2, (byte) 9));
                    case 2:
                        return observable2.switchMap(new vq6((MaybeIgnoreElementCompletable) obj2, (byte) 11));
                    default:
                        return observable2.switchMap(new vq6((Observable) obj2, (byte) 10));
                }
            }
        });
        MobiusLoop.Builder builderE = Mobius.d(rq8Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).e(new q58((byte) 6));
        zq8Var.getClass();
        authorizationActivity.k1 = Mobius.c(gvg.d("Authorization Feature", builderE.h(RxEventSources.a(new ObservableSource[]{Observable.create(new vq6(zq8Var, (byte) 12))}))), tq8.i, MainThreadWorkRunner.a());
        authorizationActivity.o1 = (nbr) daqVar.io.get();
        authorizationActivity.n1 = new dh30(new t2b((byte) 21), new jma((byte) 2, false), (zwz0) daqVar.U1.get(), authorizationActivity2);
        authorizationActivity.r1 = (u2f0) daqVar.Cf.get();
    }
}
