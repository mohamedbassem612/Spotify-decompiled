package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class eno0 {
    public static final dno0 Companion = new dno0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ eno0(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, cno0.a.getDescriptor());
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
        if (!(obj instanceof eno0)) {
            return false;
        }
        eno0 eno0Var = (eno0) obj;
        return u890.j(this.a, eno0Var.a) && u890.j(this.b, eno0Var.b) && u890.j(this.c, eno0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
