package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sam0 implements xm41, jrb1 {
    public final String a;
    public final dc31 b;
    public final tif1 c;
    public final String d;
    public final yue0 e;
    public final gp80 f;
    public final tn41 g;
    public final ObservableTransformer h;
    public final MobiusLoop i;
    public final ObservableRefCount j;
    public final BehaviorSubject k;
    public final CompletableFromAction l;
    public final CompletableFromAction m;
    public final Completable n;
    public final CopyOnWriteArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f78p;

    public sam0(String str, mr20 mr20Var, dc31 dc31Var, Set set, dn41 dn41Var, tif1 tif1Var) {
        this.a = str;
        this.b = dc31Var;
        this.c = tif1Var;
        this.d = str.concat("_Initialization");
        this.e = dn41Var.b;
        this.f = dn41Var.a;
        this.g = dn41Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(y9m0.class, new qam0(this, (byte) 0));
        subtypeEffectHandlerBuilderC.g(aam0.class, new qam0(this, (byte) 2));
        subtypeEffectHandlerBuilderC.g(bam0.class, new ax8(this, (byte) 7));
        subtypeEffectHandlerBuilderC.c(z9m0.class, new wx91(this, (byte) 14));
        subtypeEffectHandlerBuilderC.g(x9m0.class, new qam0(this, (byte) 1));
        ObservableTransformer observableTransformerH = subtypeEffectHandlerBuilderC.h();
        this.h = observableTransformerH;
        this.i = Mobius.d(new w6m0(this, (byte) 1), RxConnectables.a(observableTransformerH)).f(CompositeLogger.g(new yn41(str), new MobiusLoop.Logger[]{new r9m0(str)})).d(mif1.j1).b(new m4e0(this, (byte) 10)).g(new oam0(u9m0.e, null, null, false));
        ConnectableObservable connectableObservableReplay = new nam0(this, mr20Var).distinctUntilChanged().replay(1);
        Scheduler schedulerH = dc31Var.h();
        connectableObservableReplay.getClass();
        ObjectHelper.a(1, "observerCount");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(schedulerH, "scheduler is null");
        this.j = new ObservableRefCount(connectableObservableReplay, 5L, timeUnit, schedulerH);
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(Boolean.TRUE);
        this.k = behaviorSubjectG;
        this.l = new CompletableFromAction(new wqd0(this, (byte) 7));
        byte b = 3;
        this.m = new CompletableFromAction(new c72(this, (byte) 3));
        this.n = behaviorSubjectG.filter(rh20.P0).take(1L).ignoreElements();
        this.o = new CopyOnWriteArrayList();
        ArrayList arrayListN0 = o7h.n0(set, sam0.class);
        this.f78p = arrayListN0;
        Iterator it = arrayListN0.iterator();
        while (it.hasNext()) {
            ((sam0) it.next()).o.add(this.l.c(this.n).c(this.m));
        }
        this.i.b(new qjk(this, b));
    }

    public static Next d(oam0 oam0Var) {
        kkn kknVar = oam0Var.a;
        Observer observer = oam0Var.c;
        boolean z = kknVar instanceof s9m0;
        bn41 bn41Var = bn41.a;
        if (z) {
            return observer == null ? Next.i(oam0.a(oam0Var, v9m0.e, bn41Var, null, false, 12), Effects.a(new bam0(((s9m0) kknVar).e))) : Next.i(oam0.a(oam0Var, new w9m0(((s9m0) kknVar).e), bn41Var, null, false, 12), Effects.a(aam0.e));
        }
        if (kknVar instanceof w9m0) {
            return Next.h(oam0.a(oam0Var, null, bn41Var, null, false, 13));
        }
        return Next.i(oam0.a(oam0Var, null, bn41Var, null, false, 13), (observer == null || u890.j(oam0Var.b, bn41Var)) ? Effects.a(new z9m0[0]) : Effects.a(new z9m0(kn41.a, observer)));
    }

    public final boolean a() {
        ArrayList arrayList = this.f78p;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oam0 oam0Var = (oam0) ((sam0) it.next()).i.i;
            if (!((oam0Var != null ? oam0Var.a : null) instanceof s9m0)) {
                return false;
            }
        }
        return true;
    }

    public final xbm b() {
        oam0 oam0Var = (oam0) this.i.i;
        kkn kknVar = oam0Var != null ? oam0Var.a : null;
        if (kknVar instanceof s9m0) {
            return ((s9m0) kknVar).e;
        }
        if (kknVar instanceof w9m0) {
            return ((w9m0) kknVar).e;
        }
        return null;
    }

    public final xbm c(eub0 eub0Var) {
        Object value;
        r7j0 r7j0Var = new r7j0(this, (byte) 24);
        if (eub0Var.a) {
            value = eub0Var.b.getValue();
        } else {
            value = r7j0Var.invoke(new y52(0, eub0Var, eub0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2));
        }
        return (xbm) value;
    }

    public final ram0 e(Function0 function0, iu30 iu30Var) {
        return new ram0(this.j.subscribe((Consumer) new cj9(iu30Var, function0, (byte) 4)));
    }
}
