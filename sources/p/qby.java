package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qby implements vby {
    public final p1v a;

    public qby(p1v p1vVar) {
        this.a = p1vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qby) && this.a.equals(((qby) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
