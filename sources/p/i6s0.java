package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i6s0 extends j6s0 {
    public final String a;
    public final r0c0 b;

    public i6s0(String str, r0c0 r0c0Var) {
        this.a = str;
        this.b = r0c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i6s0) {
            i6s0 i6s0Var = (i6s0) obj;
            return this.a.equals(i6s0Var.a) && this.b == i6s0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePasswordValidationReceived(validationResult=" + this.b + ")";
    }
}
