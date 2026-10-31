package p;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hju {
    public final DisplayCutout a;

    public hju(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final nk80 a() {
        return Build.VERSION.SDK_INT >= 30 ? nk80.d(w081.n(this.a)) : nk80.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hju.class != obj.getClass()) {
            return false;
        }
        return n8p1.o(this.a, ((hju) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
