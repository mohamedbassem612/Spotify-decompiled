package p;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import app.p000rive.semantics.SemanticState;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g7o1 extends View.AccessibilityDelegate {
    public final /* synthetic */ CastSeekBar a;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        CastSeekBar castSeekBar = this.a;
        castSeekBar.a.getClass();
        accessibilityEvent.setItemCount(1);
        accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(SemanticState.Obscured);
            accessibilityNodeInfo.addAction(SemanticState.Multiline);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (view.isEnabled()) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096 || i == 8192) {
                CastSeekBar castSeekBar = this.a;
                k2o1 k2o1Var = castSeekBar.a;
                k2o1Var.getClass();
                castSeekBar.getProgress();
                k2o1Var.getClass();
                return false;
            }
        }
        return false;
    }
}
