package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cig0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof cig0) {
            return u890.j(this.a, ((cig0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("ManifestId(value=", this.a, ")");
    }
}
