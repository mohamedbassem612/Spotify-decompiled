package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h6k {
    public final String a;

    public h6k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6k) && this.a.equals(((h6k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
