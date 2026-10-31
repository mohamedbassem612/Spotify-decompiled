package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a701 implements c701 {
    public final v601 a;

    public a701(v601 v601Var) {
        this.a = v601Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a701) && u890.j(this.a, ((a701) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
