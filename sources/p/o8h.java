package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o8h {
    public final int a;
    public final int b;
    public final int c;

    public o8h(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8h)) {
            return false;
        }
        o8h o8hVar = (o8h) obj;
        return this.a == o8hVar.a && this.b == o8hVar.b && this.c == o8hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
