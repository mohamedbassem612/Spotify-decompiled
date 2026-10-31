package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d6h extends x3p1 {
    public final boolean c;

    public d6h(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6h) && this.c == ((d6h) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
