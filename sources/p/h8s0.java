package p;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final enum h8s0 extends n8s0 {
    @Override // p.n8s0
    public final View a(Context context, AttributeSet attributeSet, int i) {
        return new StateListAnimatorImageButton(context, attributeSet, i);
    }

    @Override // p.n8s0
    public final int b() {
        return R.attr.imageButtonStyle;
    }
}
