package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ep90 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof ep90) {
            return this.a.equals(((ep90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("Id(value=", this.a, ")");
    }
}
