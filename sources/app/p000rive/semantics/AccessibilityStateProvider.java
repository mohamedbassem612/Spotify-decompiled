package app.p000rive.semantics;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lapp/rive/semantics/AccessibilityStateProvider;", "", "Lapp/rive/semantics/AccessibilityEnabledListener;", "listener", "Lp/rih1;", "addAccessibilityStateChangeListener", "(Lapp/rive/semantics/AccessibilityEnabledListener;)V", "removeAccessibilityStateChangeListener", "", "isEnabled", "()Z", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AccessibilityStateProvider {
    void addAccessibilityStateChangeListener(AccessibilityEnabledListener listener);

    boolean isEnabled();

    void removeAccessibilityStateChangeListener(AccessibilityEnabledListener listener);
}
