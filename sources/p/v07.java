package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v07 extends o17 {
    public final Drawable a;
    public final g07 b;

    public v07(Drawable drawable, g07 g07Var) {
        this.a = drawable;
        this.b = g07Var;
    }

    public final g07 a() {
        return this.b;
    }

    public final m5n1 b() {
        return null;
    }

    public final boolean c() {
        return false;
    }

    public final Drawable d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v07)) {
            return false;
        }
        v07 v07Var = (v07) obj;
        return u890.j(this.a, v07Var.a) && this.b.equals(v07Var.b);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return this.b.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31);
    }
}
