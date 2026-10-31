package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c561 {
    public final String a;
    public final String b;
    public final Bitmap c;

    public c561(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c561)) {
            return false;
        }
        c561 c561Var = (c561) obj;
        return u890.j(this.a, c561Var.a) && u890.j(this.b, c561Var.b) && u890.j(this.c, c561Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
