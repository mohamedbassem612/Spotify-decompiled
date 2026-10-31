package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o3b0 extends z0o1 {
    public final int c;

    public o3b0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3b0) && this.c == ((o3b0) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return l1d.o(new StringBuilder("TypeParameter(id="), this.c, ')');
    }
}
