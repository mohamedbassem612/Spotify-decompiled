package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i3u {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final byte g;

    public i3u(int i, boolean z, boolean z2, boolean z3) {
        this(224, (i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, true);
    }

    public final int a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3u)) {
            return false;
        }
        i3u i3uVar = (i3u) obj;
        return this.a == i3uVar.a && this.b == i3uVar.b && this.c == i3uVar.c && this.d == i3uVar.d && this.e == i3uVar.e && this.g == i3uVar.g;
    }

    public final int hashCode() {
        return (xcg1.g(xcg1.g(ab80.k(this.c, xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e) + this.g) * 31;
    }

    public /* synthetic */ i3u(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, 1, z3, z4, "", 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3u(boolean z, boolean z2, int i, boolean z3, boolean z4, String str, int i2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = str;
        this.g = i2;
    }
}
