package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pmq0 extends ovo0 {
    public final String a;
    public final boolean b;

    public pmq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmq0)) {
            return false;
        }
        pmq0 pmq0Var = (pmq0) obj;
        return u890.j(this.a, pmq0Var.a) && this.b == pmq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
