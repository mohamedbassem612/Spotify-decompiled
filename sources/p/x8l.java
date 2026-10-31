package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x8l {
    public final gia a;

    public x8l(gia giaVar) {
        this.a = giaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8l) && this.a == ((x8l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
