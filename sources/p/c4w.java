package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c4w {
    public final int a;
    public final int b;
    public final List c;
    public final float d;
    public final float e;

    public c4w(int i, int i2, List list, float f, float f2) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = f;
        this.e = f2;
    }

    public static c4w a(c4w c4wVar, int i, int i2, List list, float f, float f2, int i3) {
        if ((i3 & 1) != 0) {
            i = c4wVar.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = c4wVar.b;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            list = c4wVar.c;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            f = c4wVar.d;
        }
        float f3 = f;
        if ((i3 & 16) != 0) {
            f2 = c4wVar.e;
        }
        return new c4w(i4, i5, list2, f3, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4w)) {
            return false;
        }
        c4w c4wVar = (c4w) obj;
        return this.a == c4wVar.a && this.b == c4wVar.b && u890.j(this.c, c4wVar.c) && Float.compare(this.d, c4wVar.d) == 0 && Float.compare(this.e, c4wVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + x0d.f(f4i1.b(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }
}
