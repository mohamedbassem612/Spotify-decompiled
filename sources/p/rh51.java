package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rh51 {
    public final String a;
    public final boolean b;

    public rh51(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh51)) {
            return false;
        }
        rh51 rh51Var = (rh51) obj;
        return u890.j(this.a, rh51Var.a) && this.b == rh51Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
