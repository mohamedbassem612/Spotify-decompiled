package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ou60 extends ru60 {
    public final String a;
    public final pto1 b;

    public ou60(String str, pto1 pto1Var) {
        this.a = str;
        this.b = pto1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou60)) {
            return false;
        }
        ou60 ou60Var = (ou60) obj;
        return u890.j(this.a, ou60Var.a) && this.b.equals(ou60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
