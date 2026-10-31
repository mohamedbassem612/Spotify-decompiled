package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a331 extends k331 {
    public final String a;
    public final String b;

    public a331(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a331)) {
            return false;
        }
        a331 a331Var = (a331) obj;
        return u890.j(this.a, a331Var.a) && u890.j(this.b, a331Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
