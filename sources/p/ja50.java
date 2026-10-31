package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ja50 {
    public final String a;

    public ja50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja50) && u890.j(this.a, ((ja50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
