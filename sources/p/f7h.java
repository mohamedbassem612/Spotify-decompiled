package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f7h {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public f7h(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7h)) {
            return false;
        }
        f7h f7hVar = (f7h) obj;
        return this.a == f7hVar.a && this.b == f7hVar.b && this.c == f7hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
