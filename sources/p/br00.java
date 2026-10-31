package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class br00 {
    public final int a;
    public final int b;

    public br00(int i, int i2, l1d l1dVar) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br00)) {
            return false;
        }
        br00 br00Var = (br00) obj;
        return this.a == br00Var.a && this.b == br00Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
