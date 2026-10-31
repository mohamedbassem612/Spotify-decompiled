package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o8z extends upn1 {
    public final int c;

    public o8z(int i) {
        this.c = i;
    }

    public final int E() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8z) && this.c == ((o8z) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(0) * 31);
    }
}
