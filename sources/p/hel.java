package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hel implements iel {
    public final ofl a;

    public hel(ofl oflVar) {
        this.a = oflVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hel) && this.a.equals(((hel) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
