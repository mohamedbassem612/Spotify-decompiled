package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uzd1 {
    public final String a;
    public final int b;

    public uzd1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzd1)) {
            return false;
        }
        uzd1 uzd1Var = (uzd1) obj;
        return u890.j(this.a, uzd1Var.a) && this.b == uzd1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
