package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ei80 {
    public final ci80 a;

    public ei80(ci80 ci80Var) {
        this.a = ci80Var;
    }

    public static ei80 a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new ei80(new di80(obj)) : new ei80(new ci80(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ei80)) {
            return false;
        }
        return this.a.equals(((ei80) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
