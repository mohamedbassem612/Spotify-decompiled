package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class jb20 {
    public static final ib20 Companion = new ib20();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ jb20(int i, String str, String str2, boolean z) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, hb20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb20)) {
            return false;
        }
        jb20 jb20Var = (jb20) obj;
        return u890.j(this.a, jb20Var.a) && u890.j(this.b, jb20Var.b) && this.c == jb20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
