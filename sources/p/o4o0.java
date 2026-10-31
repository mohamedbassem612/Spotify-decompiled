package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o4o0 extends g5 implements akb {
    public final Application a;
    public final d3o0 b;
    public final Context c;
    public final BehaviorSubject d = BehaviorSubject.f();
    public final BehaviorSubject e = BehaviorSubject.f();
    public q2o0 f;

    public o4o0(Application application, d3o0 d3o0Var) {
        this.a = application;
        this.b = d3o0Var;
        this.c = application.getApplicationContext();
    }

    public final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return true;
        }
        ArrayList arrayListO = p7h.O("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE");
        if (i >= 33) {
            arrayListO.add("android.permission.NEARBY_WIFI_DEVICES");
        }
        if (i >= 37) {
            arrayListO.add("android.permission.ACCESS_LOCAL_NETWORK");
        }
        if (arrayListO.isEmpty()) {
            return true;
        }
        Iterator it = arrayListO.iterator();
        while (it.hasNext()) {
            if (x74.j(this.c, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public final Observable b() {
        d3o0 d3o0Var = this.b;
        Flowable flowable = d3o0Var.b;
        vbm[] vbmVarArr = q601.a;
        return Observable.combineLatest((ObservableSource) yoi1.i(o4p1.r(rqt0.u(hu20.e(rqt0.u(new dy20(new kge(flowable), (byte) 11)), new zz90((lnm) null, d3o0Var, (byte) 29))), d3o0Var.e), o6x.a).observeOn(d3o0Var.d).startWith(d3o0Var.a()), (ObservableSource) this.e, (BiFunction) aj20.Q0).flatMap(new tym0(this, (byte) 4)).distinctUntilChanged();
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f = null;
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.d.onNext(Boolean.valueOf(a()));
        this.f = new q2o0(this, activity);
        this.e.onNext(rih1.a);
    }

    public final void start() {
        this.a.registerActivityLifecycleCallbacks(this);
    }

    public final void stop() {
        this.f = null;
        this.a.unregisterActivityLifecycleCallbacks(this);
    }
}
