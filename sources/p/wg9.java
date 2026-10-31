package p;

import android.os.Build;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wg9 implements hi9 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public wg9(ynb0 ynb0Var, ni9 ni9Var, oir oirVar, oib oibVar) {
        Object value;
        Set set;
        this.a = (byte) 1;
        this.b = ynb0Var;
        this.c = ni9Var;
        this.d = oirVar;
        this.e = oibVar;
        this.f = new idd1(new z5o(this, (byte) 21));
        this.g = new rku();
        bpb1 bpb1Var = oibVar.d;
        do {
            value = bpb1Var.getValue();
            set = (Set) value;
            if (set.contains("social_radar")) {
                n57.e("Attempted to enabled already enabled identifier social_radar");
            }
        } while (!bpb1Var.k(value, dm61.x0("social_radar", set)));
    }

    public static final /* synthetic */ tf9 a(wg9 wg9Var) {
        return (tf9) wg9Var.c;
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                gjb gjbVar = (gjb) this.b;
                ((CompositeDisposable) obj).b(gjbVar.d().map(stf0.Q0).withLatestFrom(((xir) this.d).b, mpi1.Y).filter(new bv40(this, (byte) 25)).subscribe(new xu(this, (byte) 10)));
                ((CompositeDisposable) obj2).b(gjbVar.e().map(vrg.X).distinctUntilChanged().subscribe(new tg(this, (byte) 26)));
                break;
            default:
                ni9 ni9Var = (ni9) this.c;
                if (Build.VERSION.SDK_INT < 31) {
                    ni9Var.getClass();
                } else if (ni9Var.c.isEnabled()) {
                    rku rkuVar = (rku) obj2;
                    nir nirVar = (rd9) ((idd1) obj).getValue();
                    Observable observableNever = Observable.never();
                    mir mirVar = new mir(nirVar);
                    oir oirVar = nirVar.d;
                    oib oibVar = nirVar.f;
                    sir sirVar = nirVar.h;
                    it8 it8Var = nirVar.j;
                    fi9 fi9Var = (((tgb) it8Var.b).isEnabled() && ((Boolean) ((kly0) it8Var.c).get()).booleanValue()) ? fi9.d : fi9.c;
                    RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                    subtypeEffectHandlerBuilderC.c(dd9.class, new a21(oibVar, fi9Var, (byte) 16));
                    subtypeEffectHandlerBuilderC.c(ad9.class, new a21(sirVar, oirVar, (byte) 15));
                    subtypeEffectHandlerBuilderC.c(cd9.class, new fd9(oirVar, (byte) 1));
                    subtypeEffectHandlerBuilderC.c(zc9.class, new xu(oirVar, (byte) 8));
                    subtypeEffectHandlerBuilderC.c(bd9.class, new fd9(oirVar, (byte) 0));
                    MobiusLoop.Builder builderD = Mobius.d(mirVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
                    q8n q8nVar = nirVar.a;
                    Observable observableA = nirVar.b.a();
                    ae9 ae9Var = nirVar.c;
                    FlowEventSources.Companion companion = FlowEventSources.a;
                    mr20[] mr20VarArr = {yoi1.g(observableA), rqt0.u(new nf(yoi1.g(ae9Var.a()), (byte) 19)), rqt0.u(new ik(new hs6(rqt0.u(new iib(new mgb(oqo1.p(oibVar.f, rqt0.w(oibVar.e, c7b.P0, rqt0.b), c7b.Q0), oibVar, (byte) 3), oibVar, (byte) 0)), (byte) 16), (byte) 13)), new ik(new mgb(yoi1.g(oibVar.a.g), oibVar, (byte) 1), (byte) 14)};
                    companion.getClass();
                    rkuVar.b(observableNever.compose(RxMobius.b(builderD.h(new b(q8nVar, mr20VarArr)).f(nirVar.e), new td9(w7x.a, false, false, false))).subscribe());
                }
                break;
        }
    }

    public final void stop() {
        Object value;
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                ((CompositeDisposable) this.f).g();
                ((CompositeDisposable) obj).g();
                break;
            default:
                ((rku) obj).a();
                bpb1 bpb1Var = ((oib) this.e).e;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, sqg0.K("social_radar", (Map) value)));
                oir oirVar = (oir) this.d;
                oirVar.a.onNext(w7x.a);
                oirVar.b.onNext(Boolean.FALSE);
                break;
        }
    }

    public wg9(gjb gjbVar, tf9 tf9Var, xir xirVar, tgb tgbVar) {
        this.a = (byte) 0;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        CompositeDisposable compositeDisposable2 = new CompositeDisposable();
        this.b = gjbVar;
        this.c = tf9Var;
        this.d = xirVar;
        this.e = tgbVar;
        this.f = compositeDisposable;
        this.g = compositeDisposable2;
    }
}
