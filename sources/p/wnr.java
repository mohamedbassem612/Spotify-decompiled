package p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wnr {
    public final bpb1 a = gio1.b((Object) null);
    public View b;
    public x37 c;

    public final void a(View view) {
        if (!view.isAttachedToWindow() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        this.a.m((Object) null, new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]));
    }
}
