package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xwd1 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof xwd1) {
            return u890.j(this.a, ((xwd1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("TeenId(value=", this.a, ")");
    }
}
