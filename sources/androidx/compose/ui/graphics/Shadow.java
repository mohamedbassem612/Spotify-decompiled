package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import p.cy30;
import p.gvg;
import p.u7h;
import p.z4h1;
import p.z4p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Shadow {
    public static final Shadow d = new Shadow(0.0f, z4p1.g(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public Shadow(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        long j = shadow.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && Offset.c(this.b, shadow.b) && this.c == shadow.c;
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(this.c) + cy30.f(z4h1.c(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbN = gvg.n("Shadow(color=", u7h.h(this.a), ", offset=", Offset.i(this.b), ", blurRadius=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
