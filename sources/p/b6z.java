package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b6z {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public b6z(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6z)) {
            return false;
        }
        b6z b6zVar = (b6z) obj;
        return this.a == b6zVar.a && this.b == b6zVar.b && this.c == b6zVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
