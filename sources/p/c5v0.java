package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c5v0 {
    public final String a;
    public final Long b;
    public final long c;

    public c5v0(long j, Long l, String str) {
        this.a = str;
        this.b = l;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5v0)) {
            return false;
        }
        c5v0 c5v0Var = (c5v0) obj;
        return this.a.equals(c5v0Var.a) && this.b.equals(c5v0Var.b) && this.c == c5v0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
