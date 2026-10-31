package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hoy implements joy {
    public final String a;

    public hoy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hoy) && u890.j(this.a, ((hoy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
