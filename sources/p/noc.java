package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class noc implements qoc {
    public final String a;
    public final long b;

    public noc(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noc)) {
            return false;
        }
        noc nocVar = (noc) obj;
        return u890.j(this.a, nocVar.a) && this.b == nocVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
