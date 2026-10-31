package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cd60 implements gd60 {
    public final k37 a;

    public cd60(k37 k37Var) {
        this.a = k37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd60) && this.a.equals(((cd60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
