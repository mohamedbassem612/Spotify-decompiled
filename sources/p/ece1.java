package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ece1 {
    public final String a;
    public final Rect b;

    public ece1(String str, Rect rect) {
        this.a = str;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ece1)) {
            return false;
        }
        ece1 ece1Var = (ece1) obj;
        return this.a.equals(ece1Var.a) && this.b.equals(ece1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
