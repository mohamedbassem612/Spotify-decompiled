package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tne1 {
    public final sne1 a;

    public tne1(sne1 sne1Var) {
        this.a = sne1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tne1) && this.a.equals(((tne1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
