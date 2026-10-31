package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class je91 implements le91 {
    public final ef91 a;
    public final String b;

    public je91(String str, ef91 ef91Var) {
        this.a = ef91Var;
        this.b = str;
    }

    @Override // p.le91
    public final String breadcrumb() {
        return "RetrySlot: " + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je91)) {
            return false;
        }
        je91 je91Var = (je91) obj;
        return this.a == je91Var.a && u890.j(this.b, je91Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
