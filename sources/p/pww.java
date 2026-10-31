package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pww extends vww {
    public final String a;

    public pww(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pww) && u890.j(this.a, ((pww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
