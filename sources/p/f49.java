package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f49 extends c0p1 {
    public final boolean c;

    public f49(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f49) && this.c == ((f49) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
