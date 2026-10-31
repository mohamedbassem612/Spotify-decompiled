package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fcj0 implements icj0 {
    public final String a;
    public final String b;

    public fcj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcj0)) {
            return false;
        }
        fcj0 fcj0Var = (fcj0) obj;
        return u890.j(this.a, fcj0Var.a) && u890.j(this.b, fcj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
