package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sog extends tog {
    public final String a;

    public sog(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sog) && this.a.equals(((sog) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
