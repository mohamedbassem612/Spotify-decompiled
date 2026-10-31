package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lsc {
    public final i8o0 a;

    public lsc(i8o0 i8o0Var) {
        this.a = i8o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsc) && u890.j(this.a, ((lsc) obj).a);
    }

    public final int hashCode() {
        i8o0 i8o0Var = this.a;
        if (i8o0Var != null) {
            return i8o0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ')';
    }
}
