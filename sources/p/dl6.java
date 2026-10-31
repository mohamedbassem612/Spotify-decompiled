package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dl6 {
    public final String a;
    public final cl6 b;
    public final zzq0 c;

    public /* synthetic */ dl6(String str, cl6 cl6Var, int i) {
        this(str, (i & 2) != 0 ? zhm0.f : cl6Var, uyn1.h(3, 0.0f, 0.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl6)) {
            return false;
        }
        dl6 dl6Var = (dl6) obj;
        return u890.j(this.a, dl6Var.a) && u890.j(this.b, dl6Var.b) && u890.j(this.c, dl6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public dl6(String str, cl6 cl6Var, zzq0 zzq0Var) {
        this.a = str;
        this.b = cl6Var;
        this.c = zzq0Var;
    }
}
