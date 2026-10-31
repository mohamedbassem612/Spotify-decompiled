package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hfn implements ugn {
    public final boolean a;

    public hfn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfn) && this.a == ((hfn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
