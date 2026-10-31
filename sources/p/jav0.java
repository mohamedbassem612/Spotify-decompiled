package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jav0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public jav0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jav0)) {
            return false;
        }
        jav0 jav0Var = (jav0) obj;
        return w8p1.n(this.a, jav0Var.a) && this.b == jav0Var.b && Offset.c(this.c, jav0Var.c) && Offset.c(this.d, jav0Var.d) && this.e == jav0Var.e && Float.compare(this.f, jav0Var.f) == 0 && this.g == jav0Var.g && this.h == jav0Var.h && this.i.equals(jav0Var.i) && Offset.c(this.j, jav0Var.j) && Float.compare(this.k, jav0Var.k) == 0 && Offset.c(this.l, jav0Var.l) && Offset.c(this.m, jav0Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + cy30.f(x0d.f(cy30.f(p3d1.f(this.i, xcg1.g(kaa0.f(this.g, x0d.f(xcg1.g(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31), 31, this.h), 31), this.j, 31), 31, this.k), this.l, 31);
    }

    public final String toString() {
        String strZ = w8p1.z(this.a);
        String strI = Offset.i(this.c);
        String strI2 = Offset.i(this.d);
        String strC = rav0.c(this.g);
        String strI3 = Offset.i(this.j);
        String strI4 = Offset.i(this.l);
        String strI5 = Offset.i(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strZ);
        sb.append(", uptime=");
        sb.append(this.b);
        bb00.j(sb, ", positionOnScreen=", strI, ", position=", strI2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strC);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strI3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strI4);
        return l1d.q(sb, ", originalEventPosition=", strI5, ")");
    }
}
