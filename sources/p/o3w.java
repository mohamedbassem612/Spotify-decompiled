package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o3w {
    public final int a;
    public final int b;
    public final int c;

    public o3w(int i, int i2, int i3, int i4) {
        i = (i4 & 1) != 0 ? 0 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        i3 = (i4 & 4) != 0 ? 0 : i3;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3w)) {
            return false;
        }
        o3w o3wVar = (o3w) obj;
        return this.a == o3wVar.a && this.b == o3wVar.b && this.c == o3wVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
