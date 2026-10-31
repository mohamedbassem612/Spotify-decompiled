package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rv00 {
    public final String a;
    public final Class b;
    public final boolean c;

    public rv00(String str, Class cls, boolean z) {
        this.a = str;
        this.b = cls;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv00)) {
            return false;
        }
        rv00 rv00Var = (rv00) obj;
        return u890.j(this.a, rv00Var.a) && u890.j(this.b, rv00Var.b) && this.c == rv00Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
