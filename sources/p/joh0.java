package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class joh0 {
    public static final String b;
    public final Uri a;

    static {
        String str = zoi1.a;
        b = Integer.toString(0, 36);
    }

    public joh0(eea0 eea0Var) {
        this.a = (Uri) eea0Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof joh0) && this.a.equals(((joh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
