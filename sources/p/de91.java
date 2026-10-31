package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class de91 {
    public final ef91 a;
    public final String b;

    public de91(String str, ef91 ef91Var) {
        this.a = ef91Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final ef91 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de91)) {
            return false;
        }
        de91 de91Var = (de91) obj;
        return this.a == de91Var.a && u890.j(this.b, de91Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
