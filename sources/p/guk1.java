package p;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class guk1 extends iuk1 {
    public final String a;
    public final BitmapDrawable b;
    public final double c;

    public guk1(String str, BitmapDrawable bitmapDrawable, double d) {
        this.a = str;
        this.b = bitmapDrawable;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guk1)) {
            return false;
        }
        guk1 guk1Var = (guk1) obj;
        return u890.j(this.a, guk1Var.a) && this.b.equals(guk1Var.b) && Double.compare(this.c, guk1Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
