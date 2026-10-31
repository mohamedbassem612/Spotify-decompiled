package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yo21 implements aik1 {
    public final String a;
    public final String b;
    public final String c;

    public yo21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // p.aik1
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo21)) {
            return false;
        }
        yo21 yo21Var = (yo21) obj;
        return u890.j(this.a, yo21Var.a) && u890.j(this.b, yo21Var.b) && u890.j(this.c, yo21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
