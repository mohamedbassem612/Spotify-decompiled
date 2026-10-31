package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xim {
    public final i161 a;

    public xim(i161 i161Var) {
        this.a = i161Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xim) && this.a == ((xim) obj).a;
    }

    public final int hashCode() {
        return rih1.a.hashCode() + (this.a.hashCode() * 31);
    }
}
