package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xz3 {
    public final long a;
    public final c14 b;
    public final boolean c;

    public xz3(long j, c14 c14Var, boolean z) {
        this.a = j;
        this.b = c14Var;
        this.c = z;
    }

    public static xz3 a(xz3 xz3Var, long j) {
        c14 c14Var = xz3Var.b;
        boolean z = xz3Var.c;
        xz3Var.getClass();
        return new xz3(j, c14Var, z);
    }

    public final boolean b() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    eg.o();
                }
            }
            return false;
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz3)) {
            return false;
        }
        xz3 xz3Var = (xz3) obj;
        return Offset.c(this.a, xz3Var.a) && this.b == xz3Var.b && this.c == xz3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }
}
