package p;

import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c9h extends ColorFilter {
    public float[] b;

    public final float[] a() {
        float[] fArr = this.b;
        if (fArr != null) {
            return fArr;
        }
        android.graphics.ColorFilter colorFilter = ((ColorFilter) this).a;
        if (!(colorFilter instanceof ColorMatrixColorFilter) || 26 > Build.VERSION.SDK_INT) {
            hhg1.n("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        float[] fArrW = kw7.w((ColorMatrixColorFilter) colorFilter);
        this.b = fArrW;
        return fArrW;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9h) && Arrays.equals(a(), ((c9h) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        float[] fArr = this.b;
        return f4i1.f("ColorMatrixColorFilter(colorMatrix=", fArr == null ? "null" : f4i1.f("ColorMatrix(values=", Arrays.toString(fArr), ")"), ")");
    }
}
