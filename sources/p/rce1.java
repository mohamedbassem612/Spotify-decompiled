package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rce1 {
    public final long a;
    public final long b;

    public rce1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rce1)) {
            return false;
        }
        rce1 rce1Var = (rce1) obj;
        long j = rce1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, rce1Var.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return z4h1.c(this.b) + (z4h1.c(this.a) * 31);
    }

    public final String toString() {
        return cy30.p("SelectionColors(selectionHandleColor=", u7h.h(this.a), ", selectionBackgroundColor=", u7h.h(this.b), ")");
    }
}
