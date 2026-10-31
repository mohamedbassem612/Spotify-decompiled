package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rc7 extends uc7 {
    public final String a;
    public final String b;

    public rc7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc7)) {
            return false;
        }
        rc7 rc7Var = (rc7) obj;
        return u890.j(this.a, rc7Var.a) && u890.j(this.b, rc7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
