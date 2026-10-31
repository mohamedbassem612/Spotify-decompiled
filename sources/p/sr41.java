package p;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sr41 {
    public final rr41 a;

    public sr41(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new qr41(nestedScrollView);
        } else {
            this.a = new m4c((byte) 23);
        }
    }

    public static sr41 a(NestedScrollView nestedScrollView) {
        return new sr41(nestedScrollView);
    }

    public final void b(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
