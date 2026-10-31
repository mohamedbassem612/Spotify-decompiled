package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class w1p1 {
    public abstract y3p1 a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w1p1)) {
            return false;
        }
        y3p1 y3p1VarA = a();
        y3p1 y3p1VarA2 = ((w1p1) obj).a();
        y3p1VarA.getClass();
        return smo1.H(y3p1VarA2, y3p1VarA);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        y3p1 y3p1VarA = a();
        y3p1VarA.getClass();
        return smo1.I(y3p1VarA);
    }
}
