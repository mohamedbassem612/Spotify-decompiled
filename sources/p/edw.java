package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class edw {
    public final yxa0 a;

    public edw(yxa0 yxa0Var) {
        this.a = yxa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edw) && u890.j(this.a, ((edw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
