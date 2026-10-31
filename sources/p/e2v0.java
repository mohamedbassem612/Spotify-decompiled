package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e2v0 implements f2v0 {
    public final boolean a;

    public e2v0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2v0) && this.a == ((e2v0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
