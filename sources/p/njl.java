package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class njl extends ojl {
    public final int a;

    public njl(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njl) && this.a == ((njl) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return l1d.o(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
