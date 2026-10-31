package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yev {
    public final hux a;
    public final int b;
    public final int c;

    public yev(int i, int i2, hux huxVar) {
        this.a = huxVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yev)) {
            return false;
        }
        yev yevVar = (yev) obj;
        return u890.j(this.a, yevVar.a) && this.b == yevVar.b && this.c == yevVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
