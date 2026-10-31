package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tym1 implements yym1 {
    public final int a;
    public final String b;

    public tym1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tym1)) {
            return false;
        }
        tym1 tym1Var = (tym1) obj;
        return this.a == tym1Var.a && this.b.equals(tym1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
