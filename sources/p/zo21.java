package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zo21 implements aik1 {
    public final String a;
    public final String b;
    public final String c;

    public zo21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // p.aik1
    public final int a() {
        return 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo21)) {
            return false;
        }
        zo21 zo21Var = (zo21) obj;
        return u890.j(this.a, zo21Var.a) && u890.j(this.b, zo21Var.b) && u890.j(this.c, zo21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
