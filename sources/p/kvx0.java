package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kvx0 extends qvx0 {
    public final String a;
    public final String b;

    public kvx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvx0)) {
            return false;
        }
        kvx0 kvx0Var = (kvx0) obj;
        return u890.j(this.a, kvx0Var.a) && u890.j(this.b, kvx0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
