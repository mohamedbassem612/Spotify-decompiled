package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b4f0 {
    public final yg8 a;
    public final int b;
    public final boolean c;

    public b4f0(yg8 yg8Var, int i, boolean z) {
        this.a = yg8Var;
        this.b = i;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    public final yg8 b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4f0)) {
            return false;
        }
        b4f0 b4f0Var = (b4f0) obj;
        return this.a == b4f0Var.a && this.b == b4f0Var.b && this.c == b4f0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31);
    }
}
