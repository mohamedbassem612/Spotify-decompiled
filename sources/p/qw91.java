package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qw91 {
    public final String a;
    public final String b;
    public final boolean c;

    public qw91(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw91)) {
            return false;
        }
        qw91 qw91Var = (qw91) obj;
        return u890.j(this.a, qw91Var.a) && u890.j(this.b, qw91Var.b) && this.c == qw91Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
