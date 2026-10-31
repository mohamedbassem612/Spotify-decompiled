package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class opk1 implements ppk1 {
    public final String a;
    public final String b;

    public opk1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opk1)) {
            return false;
        }
        opk1 opk1Var = (opk1) obj;
        return u890.j(this.a, opk1Var.a) && this.b.equals(opk1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
