package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qgn1 {
    public final String a;
    public final long b;

    public qgn1(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public static y2g1 a() {
        return new y2g1();
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgn1) {
            qgn1 qgn1Var = (qgn1) obj;
            if (this.a.equals(qgn1Var.a) && this.b == qgn1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerQueueParams{queueId=");
        sb.append(this.a);
        sb.append(", queueVersion=");
        return pze0.h(this.b, "}", sb);
    }
}
