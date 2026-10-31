package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h7z {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public h7z(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7z)) {
            return false;
        }
        h7z h7zVar = (h7z) obj;
        return this.a == h7zVar.a && this.b == h7zVar.b && this.c == h7zVar.c && this.d == h7zVar.d && this.e == h7zVar.e && this.f == h7zVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
