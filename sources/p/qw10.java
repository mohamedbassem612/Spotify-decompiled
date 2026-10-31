package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qw10 implements rw10 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public qw10(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw10)) {
            return false;
        }
        qw10 qw10Var = (qw10) obj;
        return u890.j(this.a, qw10Var.a) && u890.j(this.b, qw10Var.b) && this.c == qw10Var.c && this.d == qw10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
