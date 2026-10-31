package p;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fkh0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public fkh0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == fkh0.class) {
            fkh0 fkh0Var = (fkh0) obj;
            if (TextUtils.equals(this.a, fkh0Var.a) && this.b == fkh0Var.b && this.c == fkh0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((cy30.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
