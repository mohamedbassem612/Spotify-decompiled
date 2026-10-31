package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class poc implements qoc {
    public final String a;
    public final long b;

    public poc(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poc)) {
            return false;
        }
        poc pocVar = (poc) obj;
        return u890.j(this.a, pocVar.a) && this.b == pocVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
