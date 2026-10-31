package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o6f implements r6f {
    public final String a;
    public final long b;

    public o6f(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6f)) {
            return false;
        }
        o6f o6fVar = (o6f) obj;
        return this.a.equals(o6fVar.a) && this.b == o6fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
