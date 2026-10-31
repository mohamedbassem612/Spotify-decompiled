package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e650 implements h650 {
    public final String a;
    public final String b;
    public final String c;

    public e650(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e650)) {
            return false;
        }
        e650 e650Var = (e650) obj;
        return this.a.equals(e650Var.a) && this.b.equals(e650Var.b) && this.c.equals(e650Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
