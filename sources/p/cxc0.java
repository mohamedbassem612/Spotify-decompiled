package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cxc0 {
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public final kby f;
    public final int g;
    public final int h;
    public final boolean i;
    public final Map j;
    public final wsc0 k;

    public cxc0(long j, int i, int i2, long j2, int i3, kby kbyVar, int i4, int i5, boolean z, Map map) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
        this.f = kbyVar;
        this.g = i4;
        this.h = i5;
        this.i = z;
        this.j = map;
        this.k = new wsc0(0, 0, 0, false, (List) null, (kby) null, 0L, (Integer) null, false, map, 0L, (List) null, 0, 15871);
    }

    public final boolean a() {
        return this.g == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxc0)) {
            return false;
        }
        cxc0 cxc0Var = (cxc0) obj;
        return this.a == cxc0Var.a && this.b == cxc0Var.b && this.c == cxc0Var.c && this.d == cxc0Var.d && this.e == cxc0Var.e && u890.j(this.f, cxc0Var.f) && this.g == cxc0Var.g && this.h == cxc0Var.h && this.i == cxc0Var.i && u890.j(this.j, cxc0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xcg1.g(kaa0.f(this.h, kaa0.f(this.g, (this.f.hashCode() + kaa0.f(this.e, cy30.f(kaa0.f(this.c, kaa0.f(this.b, Long.hashCode(this.a) * 31, 31), 31), this.d, 31), 31)) * 31, 31), 31), 31, this.i);
    }

    public /* synthetic */ cxc0() {
        this(0L, 0, 0, 0L, 0, new kby((String) null, -1), 0, 0, false, b7x.a);
    }
}
