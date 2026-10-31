package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n3z {
    public final String a;
    public final int b;
    public final boolean c;
    public final long d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final d1z h;
    public final int i;
    public final tto j;

    public n3z(String str, int i, boolean z, long j, boolean z2, List list, boolean z3, d1z d1zVar, int i2, tto ttoVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = z2;
        this.f = list;
        this.g = z3;
        this.h = d1zVar;
        this.i = i2;
        this.j = ttoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3z)) {
            return false;
        }
        n3z n3zVar = (n3z) obj;
        return u890.j(this.a, n3zVar.a) && this.b == n3zVar.b && this.c == n3zVar.c && this.d == n3zVar.d && this.e == n3zVar.e && this.f.equals(n3zVar.f) && this.g == n3zVar.g && this.h == n3zVar.h && this.i == n3zVar.i && this.j.equals(n3zVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ab80.k(this.i, (this.h.hashCode() + xcg1.g(f4i1.b(xcg1.g(cy30.f(xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31), 31, this.e), 31, this.f), 31, this.g)) * 31, 31);
    }
}
