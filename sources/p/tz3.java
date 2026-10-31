package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tz3 {
    public final long a;
    public final sqe1 b;
    public final int c;
    public final p2i0 d;
    public final long e;
    public final sqe1 f;
    public final int g;
    public final p2i0 h;
    public final long i;
    public final long j;

    public tz3(long j, sqe1 sqe1Var, int i, p2i0 p2i0Var, long j2, sqe1 sqe1Var2, int i2, p2i0 p2i0Var2, long j3, long j4) {
        this.a = j;
        this.b = sqe1Var;
        this.c = i;
        this.d = p2i0Var;
        this.e = j2;
        this.f = sqe1Var2;
        this.g = i2;
        this.h = p2i0Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tz3.class != obj.getClass()) {
            return false;
        }
        tz3 tz3Var = (tz3) obj;
        return this.a == tz3Var.a && this.c == tz3Var.c && this.e == tz3Var.e && this.g == tz3Var.g && this.i == tz3Var.i && this.j == tz3Var.j && this.b.equals(tz3Var.b) && Objects.equals(this.d, tz3Var.d) && Objects.equals(this.f, tz3Var.f) && Objects.equals(this.h, tz3Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
