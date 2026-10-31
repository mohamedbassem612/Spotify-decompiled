package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bgm0 {
    public final String a;
    public final td10 b;

    public bgm0(String str, td10 td10Var) {
        this.a = str;
        this.b = td10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgm0)) {
            return false;
        }
        bgm0 bgm0Var = (bgm0) obj;
        return u890.j(this.a, bgm0Var.a) && u890.j(this.b, bgm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        td10 td10Var = this.b;
        return Boolean.hashCode(true) + ((iHashCode + (td10Var == null ? 0 : td10Var.hashCode())) * 31);
    }
}
