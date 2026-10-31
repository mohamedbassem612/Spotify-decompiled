package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eyz0 {
    public final long a;
    public final String b;
    public final long c;

    public eyz0(long j, long j2, String str) {
        this.a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyz0)) {
            return false;
        }
        eyz0 eyz0Var = (eyz0) obj;
        return this.a == eyz0Var.a && u890.j(this.b, eyz0Var.b) && Offset.c(this.c, eyz0Var.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
