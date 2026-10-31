package p;

import android.content.Context;
import android.graphics.Canvas;
import app.p000rive.runtime.kotlin.R;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tbk1 extends l7v {
    public tbk1(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    public final void dispatchGetDisplayList() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }
}
