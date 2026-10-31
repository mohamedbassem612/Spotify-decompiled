package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class ljp0 {
    public static final kjp0 Companion = new kjp0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ljp0(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, jjp0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljp0)) {
            return false;
        }
        ljp0 ljp0Var = (ljp0) obj;
        return u890.j(this.a, ljp0Var.a) && u890.j(this.b, ljp0Var.b) && u890.j(this.c, ljp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public ljp0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
