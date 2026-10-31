package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class atl1 {
    public final k1c a;
    public final hsl1 b;

    public atl1(Rect rect, hsl1 hsl1Var) {
        this(new k1c(rect), hsl1Var);
    }

    public final Rect a() {
        k1c k1cVar = this.a;
        k1cVar.getClass();
        return new Rect(k1cVar.a, k1cVar.b, k1cVar.c, k1cVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!atl1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        atl1 atl1Var = (atl1) obj;
        return u890.j(this.a, atl1Var.a) && u890.j(this.b, atl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.a + ", windowInsetsCompat=" + this.b + ')';
    }

    public atl1(k1c k1cVar, hsl1 hsl1Var) {
        this.a = k1cVar;
        this.b = hsl1Var;
    }
}
