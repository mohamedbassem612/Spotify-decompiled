package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ol91 {
    public final int a;
    public final yk91 b;

    public ol91(int i, yk91 yk91Var) {
        this.a = i;
        this.b = yk91Var;
    }

    public final yk91 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol91)) {
            return false;
        }
        ol91 ol91Var = (ol91) obj;
        return this.a == ol91Var.a && this.b.equals(ol91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
