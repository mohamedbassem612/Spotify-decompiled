package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z0g {
    public final int a;
    public final String b;
    public final long c;

    public z0g(long j, int i, String str) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0g)) {
            return false;
        }
        z0g z0gVar = (z0g) obj;
        return this.a == z0gVar.a && this.b.equals(z0gVar.b) && this.c == z0gVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(l1d.C(this.a) * 31, 31, this.b);
    }
}
