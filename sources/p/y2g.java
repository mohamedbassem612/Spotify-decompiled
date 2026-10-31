package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y2g {
    public final int a;
    public final boolean b;
    public final boolean c;

    public y2g(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2g)) {
            return false;
        }
        y2g y2gVar = (y2g) obj;
        return this.a == y2gVar.a && this.b == y2gVar.b && this.c == y2gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
