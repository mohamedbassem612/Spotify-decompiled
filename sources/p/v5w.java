package p;

import android.media.MediaRouter2;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v5w {
    public static final void a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static int b(MediaRouter2.RoutingController routingController) {
        int transferReason = routingController.getRoutingSessionInfo().getTransferReason();
        if (transferReason == 2) {
            return 1;
        }
        if (transferReason == 1) {
            return 2;
        }
        return transferReason == 0 ? 3 : 0;
    }

    public static void c(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void d(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
