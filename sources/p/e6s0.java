package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e6s0 extends j6s0 {
    public final String a;
    public final int b;

    public e6s0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6s0)) {
            return false;
        }
        e6s0 e6s0Var = (e6s0) obj;
        return u890.j(this.a, e6s0Var.a) && this.b == e6s0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LocalPasswordValidationReceived(validation=");
        int i = this.b;
        if (i == 1) {
            str = "VALID";
        } else if (i == 2) {
            str = "TOO_SHORT";
        } else if (i == 3) {
            str = "TOO_WEAK";
        } else if (i != 4) {
            str = i != 5 ? "null" : "NOT_VALIDATED";
        } else {
            str = "NOT_SET";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
