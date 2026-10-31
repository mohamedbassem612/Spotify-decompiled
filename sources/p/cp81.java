package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cp81 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;

    public cp81(bo91 bo91Var) {
        this.a = (byte) 5;
        this.b = new nm3(bo91Var, (byte) 22);
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 3;
        byte b5 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new c681((fe81) obj, (byte) 4));
            case 1:
                Observable map = observable.map(b4x0.Y);
                yww ywwVar = (yww) obj;
                ywwVar.getClass();
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                xww xwwVar = new xww(ywwVar, b3);
                Scheduler scheduler = AndroidSchedulers.a;
                RxAndroidPlugins.b(scheduler);
                subtypeEffectHandlerBuilderC.d(qww.class, xwwVar, scheduler);
                subtypeEffectHandlerBuilderC.b(rww.class, new f72(ywwVar, (byte) 17), scheduler);
                subtypeEffectHandlerBuilderC.d(tww.class, new xww(ywwVar, b5), scheduler);
                subtypeEffectHandlerBuilderC.d(sww.class, new xww(ywwVar, b2), scheduler);
                subtypeEffectHandlerBuilderC.d(pww.class, new xww(ywwVar, b4), scheduler);
                subtypeEffectHandlerBuilderC.g(uww.class, new www(ywwVar.e, b3));
                return map.compose(subtypeEffectHandlerBuilderC.h()).map(c4x0.Z);
            case 2:
                Observable map2 = observable.map(e4x0.Y);
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC2 = RxMobius.c();
                f72 f72Var = new f72((yc40) obj, (byte) 22);
                Scheduler scheduler2 = AndroidSchedulers.a;
                RxAndroidPlugins.b(scheduler2);
                subtypeEffectHandlerBuilderC2.b(xc40.class, f72Var, scheduler2);
                return map2.compose(subtypeEffectHandlerBuilderC2.h()).map(f4x0.X);
            case 3:
                Observable map3 = observable.map(i5x0.X);
                hjn0 hjn0Var = (hjn0) obj;
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC3 = RxMobius.c();
                gjn0 gjn0Var = new gjn0(hjn0Var, b3);
                Scheduler scheduler3 = AndroidSchedulers.a;
                RxAndroidPlugins.b(scheduler3);
                subtypeEffectHandlerBuilderC3.d(cjn0.class, gjn0Var, scheduler3);
                subtypeEffectHandlerBuilderC3.d(ejn0.class, new gjn0(hjn0Var, b5), scheduler3);
                subtypeEffectHandlerBuilderC3.d(djn0.class, new gjn0(hjn0Var, b2), scheduler3);
                subtypeEffectHandlerBuilderC3.c(bjn0.class, new gjn0(hjn0Var, b4));
                return map3.compose(subtypeEffectHandlerBuilderC3.h()).map(p5x0.Z);
            case 4:
                Observable map4 = observable.map(r5x0.Z);
                d6s0 d6s0Var = (d6s0) obj;
                d6s0Var.getClass();
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC4 = RxMobius.c();
                wqd0 wqd0Var = new wqd0(d6s0Var, (byte) 15);
                Scheduler scheduler4 = AndroidSchedulers.a;
                RxAndroidPlugins.b(scheduler4);
                subtypeEffectHandlerBuilderC4.b(a6s0.class, wqd0Var, scheduler4);
                subtypeEffectHandlerBuilderC4.g(z5s0.class, new o4e0(d6s0Var.a, (byte) 10));
                subtypeEffectHandlerBuilderC4.g(b6s0.class, new www(d6s0Var.d, b5));
                return map4.compose(subtypeEffectHandlerBuilderC4.h()).map(r6x0.Z);
            case 5:
                return ((nm3) obj).apply(observable);
            case 6:
                return observable.map(new zb91(this, (byte) 15));
            case 7:
                return observable.switchMap(new ltf1((dlg1) obj, (byte) 3));
            case 8:
                return observable.switchMap(new hqh1(this));
            case 9:
                return observable.switchMap(new i2i1((ehi1) obj, (byte) 1));
            case 10:
                return observable.switchMapMaybe(new o2b1((hce1) obj, (byte) 22));
            default:
                return observable.map(new ghk1((onr) obj, (byte) 1));
        }
    }

    public /* synthetic */ cp81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public cp81() {
        this.a = (byte) 6;
        this.b = new uic((byte) 27);
    }
}
