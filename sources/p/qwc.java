package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qwc {
    public final String a;
    public final long b;

    public qwc(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwc)) {
            return false;
        }
        qwc qwcVar = (qwc) obj;
        return u890.j(this.a, qwcVar.a) && this.b == qwcVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
