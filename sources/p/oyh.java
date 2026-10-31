package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oyh {
    public final String a;
    public final mvb1 b;

    public oyh(String str, mvb1 mvb1Var) {
        this.a = str;
        this.b = mvb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyh)) {
            return false;
        }
        oyh oyhVar = (oyh) obj;
        return u890.j(this.a, oyhVar.a) && this.b.equals(oyhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
