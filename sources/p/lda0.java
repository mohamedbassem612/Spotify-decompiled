package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class lda0 {
    public static final jda0 Companion = new jda0();
    public final String a;
    public final qs60 b;
    public final m8d0 c;
    public final kda0 d;

    public lda0(int i, String str, qs60 qs60Var, m8d0 m8d0Var) {
        Object obj = null;
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ida0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = qs60Var;
        if ((i & 4) == 0) {
            this.c = new m8d0();
        } else {
            this.c = m8d0Var;
        }
        d7 d7Var = new d7(kda0.f, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            if (((kda0) next).a.equalsIgnoreCase(str)) {
                obj = next;
                break;
            }
        }
        kda0 kda0Var = (kda0) obj;
        this.d = kda0Var == null ? kda0.UNKNOWN : kda0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lda0)) {
            return false;
        }
        lda0 lda0Var = (lda0) obj;
        return u890.j(this.a, lda0Var.a) && u890.j(this.b, lda0Var.b) && u890.j(this.c, lda0Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c.a) + xcg1.g(this.a.hashCode() * 31, 31, this.b.a);
    }
}
