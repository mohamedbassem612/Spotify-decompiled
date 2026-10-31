package p;

import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class k34 {
    public static /* synthetic */ RouteDiscoveryPreference.Builder a(ArrayList arrayList) {
        return new RouteDiscoveryPreference.Builder(arrayList, false);
    }

    public static /* synthetic */ RoutingSessionInfo.Builder b(RoutingSessionInfo routingSessionInfo) {
        return new RoutingSessionInfo.Builder(routingSessionInfo);
    }

    public static /* synthetic */ CloseGuard c() {
        return new CloseGuard();
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds d(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation e(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* synthetic */ AccessibilityEvent f() {
        return new AccessibilityEvent();
    }

    public static /* synthetic */ void g() {
    }
}
