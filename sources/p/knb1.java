package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class knb1 extends oob1 {
    public final mlb1 b;

    public knb1(mlb1 mlb1Var) {
        super(mlb1Var.a);
        this.b = mlb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knb1) && this.b.equals(((knb1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
