package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class twf implements ywf {
    public final String a;

    public twf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twf) && this.a.equals(((twf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
