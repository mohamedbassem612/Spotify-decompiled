package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lf40 {
    public final String a;

    public lf40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf40) && u890.j(this.a, ((lf40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
