package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a051 extends q151 {
    public final String a;

    public a051(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a051) && u890.j(this.a, ((a051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
