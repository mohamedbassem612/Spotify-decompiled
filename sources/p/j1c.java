package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j1c {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j1c(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1c)) {
            return false;
        }
        j1c j1cVar = (j1c) obj;
        return this.a == j1cVar.a && this.b == j1cVar.b && this.c == j1cVar.c && this.d == j1cVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
