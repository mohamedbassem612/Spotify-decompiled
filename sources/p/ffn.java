package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ffn implements ugn {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffn)) {
            return false;
        }
        String str = Build.MODEL;
        return u890.j(str, str);
    }

    public final int hashCode() {
        return Build.MODEL.hashCode();
    }
}
