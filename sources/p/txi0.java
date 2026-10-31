package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class txi0 extends vxi0 {
    public final c561 a;
    public final String b;
    public final Bitmap c;

    public txi0(c561 c561Var, String str, Bitmap bitmap) {
        this.a = c561Var;
        this.b = str;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txi0)) {
            return false;
        }
        txi0 txi0Var = (txi0) obj;
        return this.a.equals(txi0Var.a) && u890.j(this.b, txi0Var.b) && u890.j(this.c, txi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
