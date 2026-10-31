package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jnf {
    public final String a;

    public jnf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnf) && this.a.equals(((jnf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
