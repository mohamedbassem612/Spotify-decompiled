package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d49 extends c0p1 {
    public final boolean c;

    public d49(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d49) && this.c == ((d49) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
