package p;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cq91 extends wic0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ byte f5p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq91(Context context, byte b) {
        super(context);
        this.f5p = b;
    }

    public final float b(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f5p) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }
}
