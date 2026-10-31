package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class krh1 {
    public final String a;
    public final String b;

    public krh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krh1)) {
            return false;
        }
        krh1 krh1Var = (krh1) obj;
        return u890.j(this.a, krh1Var.a) && u890.j(this.b, krh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
