package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class op9 {
    public final String a;
    public final String b;

    public op9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op9)) {
            return false;
        }
        op9 op9Var = (op9) obj;
        return u890.j(this.a, op9Var.a) && this.b.equals(op9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
