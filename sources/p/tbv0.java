package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tbv0 {
    public final e9p1 a;
    public final String b;

    public tbv0(e9p1 e9p1Var, String str) {
        this.a = e9p1Var;
        this.b = str;
    }

    public static tbv0 a(tbv0 tbv0Var, e9p1 e9p1Var, String str, int i) {
        if ((i & 1) != 0) {
            e9p1Var = tbv0Var.a;
        }
        if ((i & 2) != 0) {
            str = tbv0Var.b;
        }
        return new tbv0(e9p1Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbv0)) {
            return false;
        }
        tbv0 tbv0Var = (tbv0) obj;
        return this.a.equals(tbv0Var.a) && this.b.equals(tbv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
