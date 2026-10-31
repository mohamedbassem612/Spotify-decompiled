package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ja41 {
    public final String a;

    public ja41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja41) && u890.j(this.a, ((ja41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
