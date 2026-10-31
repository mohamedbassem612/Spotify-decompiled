package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f3e0 implements g3e0 {
    public final a9h a;
    public final String b;
    public final String c;
    public final String d;

    public f3e0(String str, String str2, String str3, a9h a9hVar) {
        this.a = a9hVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static f3e0 a(f3e0 f3e0Var) {
        a9h a9hVar = f3e0Var.a;
        String str = f3e0Var.b;
        String str2 = f3e0Var.c;
        f3e0Var.getClass();
        return new f3e0(str, str2, null, a9hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3e0)) {
            return false;
        }
        f3e0 f3e0Var = (f3e0) obj;
        return this.a.equals(f3e0Var.a) && u890.j(this.b, f3e0Var.b) && u890.j(this.c, f3e0Var.c) && u890.j(this.d, f3e0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
