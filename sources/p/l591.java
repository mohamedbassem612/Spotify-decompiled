package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l591 {
    public static final df41 c = kyo1.t(er81.N0, yd81.N0);
    public final String a;
    public final p791 b;

    public l591(String str, p791 p791Var) {
        this.a = str;
        this.b = p791Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l591)) {
            return false;
        }
        l591 l591Var = (l591) obj;
        return u890.j(this.a, l591Var.a) && this.b == l591Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
