package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ar8 implements fr8 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public ar8(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar8)) {
            return false;
        }
        ar8 ar8Var = (ar8) obj;
        return this.a.equals(ar8Var.a) && u890.j(this.b, ar8Var.b) && this.c == ar8Var.c && u890.j(this.d, ar8Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
