package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kzq0 implements wdg {
    public final Class a;

    public kzq0(Class cls) {
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kzq0) {
            return u890.j(this.a, ((kzq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Class n() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
