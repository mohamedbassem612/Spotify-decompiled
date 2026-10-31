package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dgn implements ugn {
    public final String a;

    public dgn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgn) && this.a.equals(((dgn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
