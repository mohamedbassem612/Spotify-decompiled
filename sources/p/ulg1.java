package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ulg1 extends ylg1 {
    public final String a;
    public final long b;

    public ulg1(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulg1)) {
            return false;
        }
        ulg1 ulg1Var = (ulg1) obj;
        return this.a.equals(ulg1Var.a) && this.b == ulg1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
