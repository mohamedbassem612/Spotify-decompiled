package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fir0 extends g5 {
    public final ynb0 a;
    public final er11 b;
    public final ynb0 c;
    public Activity e;
    public final idd1 d = new idd1(new gyq0(this, (byte) 19));
    public final LinkedHashSet f = new LinkedHashSet();

    public fir0(ynb0 ynb0Var, er11 er11Var, ynb0 ynb0Var2) {
        this.a = ynb0Var;
        this.b = er11Var;
        this.c = ynb0Var2;
    }

    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (a()) {
            this.f.remove(activity);
        }
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (a()) {
            this.f.remove(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zA = a();
        LinkedHashSet linkedHashSet = this.f;
        if (zA) {
            linkedHashSet.add(activity);
        }
        Activity activity2 = this.e;
        if (activity2 != activity) {
            if (a() && o7h.i0(linkedHashSet, activity2)) {
                return;
            }
            boolean z = activity2 instanceof lir0;
            ynb0 ynb0Var = this.a;
            if (z) {
                hir0 hir0Var = (hir0) ynb0Var.get();
                hir0Var.d = activity2.isChangingConfigurations();
                Disposable disposable = hir0Var.c;
                if (disposable != null) {
                    disposable.dispose();
                }
                hir0Var.c = null;
            }
            Observable observableDistinctUntilChanged = activity instanceof lir0 ? ((lir0) activity).getU1().a : nhc.r().a;
            if (activity instanceof vkg) {
                observableDistinctUntilChanged = Observable.combineLatest((ObservableSource) observableDistinctUntilChanged, (ObservableSource) ((vkg) activity).j(), (BiFunction) b610.V0).distinctUntilChanged();
            }
            hir0 hir0Var2 = (hir0) ynb0Var.get();
            hir0Var2.getClass();
            hir0Var2.c = observableDistinctUntilChanged.filter(wdu0.b1).skipWhile(new vyq0(hir0Var2, (byte) 1)).subscribe((Consumer) new ixp0(hir0Var2, (byte) 9));
            this.e = activity;
            this.b.getClass();
        }
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Activity activity2;
        if (a()) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.remove(activity);
            if (this.e == activity && (activity2 = (Activity) o7h.B0(linkedHashSet)) != null) {
                onActivityResumed(activity2);
            }
        }
        if (this.e == activity) {
            hir0 hir0Var = (hir0) this.a.get();
            hir0Var.d = activity.isChangingConfigurations();
            Disposable disposable = hir0Var.c;
            if (disposable != null) {
                disposable.dispose();
            }
            hir0Var.c = null;
            this.e = null;
            this.b.getClass();
        }
    }
}
