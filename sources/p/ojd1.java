package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ojd1 {
    public final String a;
    public final int b;

    public ojd1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojd1)) {
            return false;
        }
        ojd1 ojd1Var = (ojd1) obj;
        return u890.j(this.a, ojd1Var.a) && this.b == ojd1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
