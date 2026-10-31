package p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ug implements AccessibilityManager.AccessibilityStateChangeListener, o5s {
    public final AccessibilityManager a;
    public final BehaviorSubject b = BehaviorSubject.g(Boolean.valueOf(a()));

    public ug(Context context) {
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
        krw0.i.f.a(this);
    }

    public final boolean a() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.a.getEnabledAccessibilityServiceList(5);
        return (enabledAccessibilityServiceList == null || enabledAccessibilityServiceList.isEmpty()) ? false : true;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        Single.timer(500L, TimeUnit.MILLISECONDS).doOnSuccess(new tg(this, (byte) 0)).subscribe();
    }

    public final void onStart(iac0 iac0Var) {
        this.b.onNext(Boolean.valueOf(a()));
        this.a.addAccessibilityStateChangeListener(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.a.removeAccessibilityStateChangeListener(this);
    }
}
