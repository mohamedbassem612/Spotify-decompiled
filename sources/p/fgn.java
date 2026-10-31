package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fgn implements ugn {
    public final boolean a;
    public final int b;

    public fgn(int i, boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgn)) {
            return false;
        }
        fgn fgnVar = (fgn) obj;
        if (this.a != fgnVar.a) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        if (!u890.j(str, str) || this.b != fgnVar.b) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!u890.j(str2, str2)) {
            return false;
        }
        String str3 = Build.MODEL;
        return u890.j(str3, str3);
    }

    public final int hashCode() {
        return Build.MODEL.hashCode() + cy30.d(kaa0.f(this.b, cy30.d(Boolean.hashCode(this.a) * 31, 31, Build.VERSION.RELEASE), 31), 31, Build.MANUFACTURER);
    }
}
