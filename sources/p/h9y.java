package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h9y implements s9y {
    public final d9h a;

    public h9y(d9h d9hVar) {
        this.a = d9hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9y) && this.a.equals(((h9y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
