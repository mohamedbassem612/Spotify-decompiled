package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cft {
    public final int a;
    public final int b;
    public final int c;

    public cft(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cft)) {
            return false;
        }
        cft cftVar = (cft) obj;
        return this.a == cftVar.a && this.b == cftVar.b && this.c == cftVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
