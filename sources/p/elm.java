package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class elm {
    public final int a;
    public final long b;

    public elm(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final int a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elm)) {
            return false;
        }
        elm elmVar = (elm) obj;
        return this.a == elmVar.a && this.b == elmVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
