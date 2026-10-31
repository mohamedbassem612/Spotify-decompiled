package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jtx0 extends ktx0 {
    public final String a;
    public final String b;
    public final long c;

    public jtx0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtx0)) {
            return false;
        }
        jtx0 jtx0Var = (jtx0) obj;
        return this.a.equals(jtx0Var.a) && this.b.equals(jtx0Var.b) && this.c == jtx0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
