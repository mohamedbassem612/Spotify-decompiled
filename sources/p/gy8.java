package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gy8 {
    public final int a;
    public final long b;

    public gy8(int i, long j) {
        if (i == 0) {
            bhn0.i("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public static gy8 a() {
        return new gy8(3, -1L);
    }

    public static gy8 b(long j) {
        return new gy8(1, j);
    }

    public static gy8 c() {
        return new gy8(2, -1L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gy8)) {
            return false;
        }
        gy8 gy8Var = (gy8) obj;
        return l1d.d(this.a, gy8Var.a) && this.b == gy8Var.b;
    }

    public final int hashCode() {
        int iC = (l1d.C(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iC;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return pze0.h(this.b, "}", sb);
    }
}
