package app.p000rive.semantics;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lapp/rive/semantics/AndroidAccessibilityStateProvider;", "Lapp/rive/semantics/AccessibilityStateProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lapp/rive/semantics/AccessibilityEnabledListener;", "listener", "Lp/rih1;", "addAccessibilityStateChangeListener", "(Lapp/rive/semantics/AccessibilityEnabledListener;)V", "removeAccessibilityStateChangeListener", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "listenerAdapters", "Ljava/util/Map;", "", "isEnabled", "()Z", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidAccessibilityStateProvider implements AccessibilityStateProvider {
    public static final int $stable = 8;
    private final AccessibilityManager accessibilityManager;
    private final Map<AccessibilityEnabledListener, AccessibilityManager.AccessibilityStateChangeListener> listenerAdapters = new LinkedHashMap();

    public AndroidAccessibilityStateProvider(Context context) {
        this.accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // app.p000rive.semantics.AccessibilityStateProvider
    public void addAccessibilityStateChangeListener(final AccessibilityEnabledListener listener) {
        if (this.listenerAdapters.containsKey(listener)) {
            return;
        }
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: p.u34
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                listener.onAccessibilityEnabledChanged(z);
            }
        };
        this.listenerAdapters.put(listener, accessibilityStateChangeListener);
        this.accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }

    @Override // app.p000rive.semantics.AccessibilityStateProvider
    public boolean isEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    @Override // app.p000rive.semantics.AccessibilityStateProvider
    public void removeAccessibilityStateChangeListener(AccessibilityEnabledListener listener) {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListenerRemove = this.listenerAdapters.remove(listener);
        if (accessibilityStateChangeListenerRemove == null) {
            return;
        }
        this.accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListenerRemove);
    }
}
