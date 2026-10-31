package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w3l implements z3l {
    public final String a;
    public final xvd1 b;

    public w3l(String str, xvd1 xvd1Var) {
        this.a = str;
        this.b = xvd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3l)) {
            return false;
        }
        w3l w3lVar = (w3l) obj;
        return this.a.equals(w3lVar.a) && this.b == w3lVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
