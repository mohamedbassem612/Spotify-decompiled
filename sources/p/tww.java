package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tww extends vww {
    public final String a;

    public tww(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tww) && u890.j(this.a, ((tww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
