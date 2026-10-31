package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dlb1 extends flb1 {
    public final f291 a;
    public final String b;
    public final String c;

    public dlb1(f291 f291Var, String str, String str2) {
        this.a = f291Var;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final f291 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlb1)) {
            return false;
        }
        dlb1 dlb1Var = (dlb1) obj;
        return u890.j(this.a, dlb1Var.a) && u890.j(this.b, dlb1Var.b) && u890.j(this.c, dlb1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
