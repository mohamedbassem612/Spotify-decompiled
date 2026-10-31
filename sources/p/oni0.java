package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oni0 {
    public final String a;
    public final String b;

    public oni0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oni0)) {
            return false;
        }
        oni0 oni0Var = (oni0) obj;
        return u890.j(this.a, oni0Var.a) && u890.j(this.b, oni0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
