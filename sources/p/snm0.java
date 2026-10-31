package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class snm0 {
    public final long a;
    public final long b;
    public final boolean c;

    public snm0(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final snm0 a(snm0 snm0Var) {
        return new snm0(Offset.g(this.a, snm0Var.a), Math.max(this.b, snm0Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snm0)) {
            return false;
        }
        snm0 snm0Var = (snm0) obj;
        return Offset.c(this.a, snm0Var.a) && this.b == snm0Var.b && this.c == snm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + Offset.i(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
