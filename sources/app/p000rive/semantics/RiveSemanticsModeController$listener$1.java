package app.p000rive.semantics;

import kotlin.Metadata;
import p.cv30;
import p.iv30;
import p.tv30;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RiveSemanticsModeController$listener$1 implements AccessibilityEnabledListener, iv30 {
    final /* synthetic */ RiveSemanticsModeController $tmp0;

    public RiveSemanticsModeController$listener$1(RiveSemanticsModeController riveSemanticsModeController) {
        this.$tmp0 = riveSemanticsModeController;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AccessibilityEnabledListener) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(1, this.$tmp0, RiveSemanticsModeController.class, "publishEnabled", "publishEnabled(Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // app.p000rive.semantics.AccessibilityEnabledListener
    public final void onAccessibilityEnabledChanged(boolean z) {
        this.$tmp0.publishEnabled(z);
    }
}
