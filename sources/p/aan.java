package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aan {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public aan(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aan)) {
            return false;
        }
        aan aanVar = (aan) obj;
        return this.a == aanVar.a && this.b == aanVar.b && this.c == aanVar.c && this.d == aanVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
