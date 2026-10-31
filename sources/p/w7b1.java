package p;

import android.app.PendingIntent;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w7b1 {
    public final Bitmap a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final hm5 f;
    public final m1p1 g;
    public final hm5 h;
    public final PendingIntent i;
    public final boolean j;
    public final v7b1 k;

    public w7b1(Bitmap bitmap, int i, int i2, String str, String str2, hm5 hm5Var, m1p1 m1p1Var, hm5 hm5Var2, PendingIntent pendingIntent, boolean z, v7b1 v7b1Var) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = hm5Var;
        this.g = m1p1Var;
        this.h = hm5Var2;
        this.i = pendingIntent;
        this.j = z;
        this.k = v7b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7b1)) {
            return false;
        }
        w7b1 w7b1Var = (w7b1) obj;
        return u890.j(this.a, w7b1Var.a) && this.b == w7b1Var.b && this.c == w7b1Var.c && this.d.equals(w7b1Var.d) && this.e.equals(w7b1Var.e) && this.f.equals(w7b1Var.f) && this.g.equals(w7b1Var.g) && this.h.equals(w7b1Var.h) && this.i.equals(w7b1Var.i) && this.j == w7b1Var.j && this.k.equals(w7b1Var.k);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Boolean.hashCode(this.k.a) + xcg1.g((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + cy30.d(cy30.d(kaa0.f(this.c, kaa0.f(this.b, (bitmap == null ? 0 : bitmap.hashCode()) * 31, 31), 31), 31, this.d), 31, this.e)) * 31)) * 31)) * 31)) * 31, 31, this.j);
    }
}
