package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zm7 {
    public final String a;
    public final String b;
    public final String c;
    public final an7 d;
    public final int e;

    public zm7(String str, String str2, String str3, an7 an7Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = an7Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm7)) {
            return false;
        }
        zm7 zm7Var = (zm7) obj;
        return u890.j(this.a, zm7Var.a) && u890.j(this.b, zm7Var.b) && this.c.equals(zm7Var.c) && this.d.equals(zm7Var.d) && this.e == zm7Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
