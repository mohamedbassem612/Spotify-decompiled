package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cv90 implements dv90 {
    public final long a;
    public final String b;

    public cv90(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv90)) {
            return false;
        }
        cv90 cv90Var = (cv90) obj;
        return this.a == cv90Var.a && u890.j(this.b, cv90Var.b);
    }

    @Override // p.dv90
    public final long getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
