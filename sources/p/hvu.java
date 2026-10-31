package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hvu {
    public final fvu a;
    public final boolean b;
    public final boolean c;

    public hvu(fvu fvuVar, boolean z, boolean z2) {
        this.a = fvuVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvu)) {
            return false;
        }
        hvu hvuVar = (hvu) obj;
        return this.a.equals(hvuVar.a) && this.b == hvuVar.b && this.c == hvuVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
