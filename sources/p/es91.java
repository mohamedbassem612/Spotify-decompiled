package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class es91 implements fs91 {
    public final String a;
    public final Drawable b;

    public es91(String str, Drawable drawable) {
        this.a = str;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es91)) {
            return false;
        }
        es91 es91Var = (es91) obj;
        return u890.j(this.a, es91Var.a) && this.b.equals(es91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
