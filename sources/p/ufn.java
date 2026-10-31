package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ufn implements ugn {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufn)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return u890.j(str, str);
    }

    public final int hashCode() {
        return Build.VERSION.RELEASE.hashCode();
    }
}
