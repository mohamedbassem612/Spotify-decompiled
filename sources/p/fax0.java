package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fax0 extends yax0 {
    public final String a;

    public fax0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fax0) && u890.j(this.a, ((fax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
