package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eig extends fig {
    @Override // p.fig, p.wav0
    public final String a() {
        return Build.MODEL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eig)) {
            return false;
        }
        String str = Build.MODEL;
        return u890.j(str, str);
    }

    public final int hashCode() {
        return Build.MODEL.hashCode();
    }
}
