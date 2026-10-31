package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pcf0 implements qcf0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof pcf0) {
            return u890.j(this.a, ((pcf0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("Url(url=", this.a, ")");
    }
}
