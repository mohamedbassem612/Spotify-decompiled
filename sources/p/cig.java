package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cig extends fig {
    @Override // p.fig, p.wav0
    public final String a() {
        return Build.BRAND;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cig)) {
            return false;
        }
        String str = Build.BRAND;
        return u890.j(str, str);
    }

    public final int hashCode() {
        return Build.BRAND.hashCode();
    }
}
