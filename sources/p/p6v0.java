package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p6v0 implements ez00 {
    public final boolean a;

    public p6v0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6v0) && this.a == ((p6v0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
