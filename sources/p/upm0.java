package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class upm0 implements rij0 {
    public final long a;
    public final long b;
    public final long c;

    public upm0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = -1L;
    }

    public static long d(long j) {
        return (j / 1000) + 2082844800;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upm0)) {
            return false;
        }
        upm0 upm0Var = (upm0) obj;
        return this.a == upm0Var.a && this.b == upm0Var.b && this.c == upm0Var.c;
    }

    public final int hashCode() {
        return anm1.z(this.c) + ((anm1.z(this.b) + ((anm1.z(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    public upm0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
