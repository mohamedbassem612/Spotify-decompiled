package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class p3i1 {
    public static final o3i1 Companion = new o3i1();
    public final String a;
    public final String b;
    public final long c;

    public /* synthetic */ p3i1(int i, String str, String str2, long j) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, n3i1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3i1)) {
            return false;
        }
        p3i1 p3i1Var = (p3i1) obj;
        return u890.j(this.a, p3i1Var.a) && u890.j(this.b, p3i1Var.b) && this.c == p3i1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public p3i1(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
