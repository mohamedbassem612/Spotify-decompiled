package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mae1 {
    public final String a;
    public final String b;

    public mae1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mae1)) {
            return false;
        }
        mae1 mae1Var = (mae1) obj;
        return u890.j(this.a, mae1Var.a) && u890.j(this.b, mae1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
