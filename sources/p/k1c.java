package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k1c {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public k1c(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            hhg1.f(cy30.i(i, "Left must be less than or equal to right, left: ", i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        hhg1.f(cy30.i(i2, "top must be less than or equal to bottom, top: ", i4, ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k1c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k1c k1cVar = (k1c) obj;
        return this.a == k1cVar.a && this.b == k1cVar.b && this.c == k1cVar.c && this.d == k1cVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(k1c.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return gvg.j(sb, this.d, "] }");
    }
}
