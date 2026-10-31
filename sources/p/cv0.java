package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cv0 {
    public static final String d;
    public static final String e;
    public static final String f;
    public final long a;
    public final long b;
    public final String c;

    static {
        String str = zoi1.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public cv0(long j, long j2, String str) {
        dm5.m((j == -9223372036854775807L && j2 == -9223372036854775807L && str == null) ? false : true);
        this.a = j == -9223372036854775807L ? 0L : j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cv0.class == obj.getClass()) {
            cv0 cv0Var = (cv0) obj;
            if (this.a == cv0Var.a && this.b == cv0Var.b && Objects.equals(this.c, cv0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), this.c);
    }
}
