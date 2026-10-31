package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dg0 extends g5 {
    public final zia a = new zia();

    public final Observable a(Activity activity) {
        return this.a.distinctUntilChanged().map(new cg0(activity));
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isChangingConfigurations()) {
            return;
        }
        this.a.accept(new bg0(activity.toString(), w8c0.a));
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.a.accept(new bg0(activity.toString(), w8c0.e));
    }
}
