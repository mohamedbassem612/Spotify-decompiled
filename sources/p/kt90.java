package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kt90 implements ot90 {
    public final boolean a;

    public kt90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt90) && this.a == ((kt90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
