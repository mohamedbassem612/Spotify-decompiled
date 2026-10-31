package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l9x {
    public final jdv a;

    public l9x(jdv jdvVar) {
        this.a = jdvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9x) && this.a.equals(((l9x) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
