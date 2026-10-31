package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cmm implements Comparable {
    public final y6b1 a;

    public cmm(String str) {
        this.a = (str == null || str.length() == 0) ? null : new y6b1(str, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y6b1 y6b1Var = ((cmm) obj).a;
        y6b1 y6b1Var2 = this.a;
        if (y6b1Var2 == null && y6b1Var == null) {
            return 0;
        }
        if (y6b1Var2 == null) {
            return -1;
        }
        if (y6b1Var == null) {
            return 1;
        }
        return y6b1Var2.d(y6b1Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cmm) {
            y6b1 y6b1Var = ((cmm) obj).a;
            if (y6b1Var != null ? y6b1Var.j(this.a) : false) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        y6b1 y6b1Var = this.a;
        if (y6b1Var == null || (str = y6b1Var.e) == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        y6b1 y6b1Var = this.a;
        String string = y6b1Var != null ? y6b1Var.toString() : null;
        return (string == null || string.length() == 0) ? "<empty>" : string;
    }
}
