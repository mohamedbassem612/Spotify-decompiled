package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hht0 extends lht0 {
    public final String a;
    public final d1z b;
    public final long c;

    public hht0(String str, d1z d1zVar, long j) {
        this.a = str;
        this.b = d1zVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hht0)) {
            return false;
        }
        hht0 hht0Var = (hht0) obj;
        return this.a.equals(hht0Var.a) && this.b == hht0Var.b && this.c == hht0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
