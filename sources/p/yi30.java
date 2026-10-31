package p;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yi30 extends Transition.EpicenterCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ yi30(Rect rect, byte b) {
        this.a = b;
        this.b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        byte b = this.a;
        Rect rect = this.b;
        switch (b) {
            case 0:
                return rect;
            default:
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
