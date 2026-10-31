package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uzg1 extends lrn1 {
    public final String c;
    public final vze0 d;

    public uzg1(String str, vze0 vze0Var) {
        this.c = str;
        this.d = vze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uzg1) {
            uzg1 uzg1Var = (uzg1) obj;
            return u890.j(this.c, uzg1Var.c) && this.d == uzg1Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
