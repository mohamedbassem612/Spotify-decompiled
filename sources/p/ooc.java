package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ooc implements qoc {
    public final String a;
    public final long b;

    public ooc(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooc)) {
            return false;
        }
        ooc oocVar = (ooc) obj;
        return u890.j(this.a, oocVar.a) && this.b == oocVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
