package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w6l extends d7l {
    public final hry0 a;
    public final boolean b;

    public w6l(hry0 hry0Var, boolean z) {
        this.a = hry0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6l)) {
            return false;
        }
        w6l w6lVar = (w6l) obj;
        return this.a.equals(w6lVar.a) && this.b == w6lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
