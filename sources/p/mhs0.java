package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mhs0 {
    public final long a;
    public final String b;
    public final long c;

    public mhs0(long j, long j2, String str) {
        this.a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhs0)) {
            return false;
        }
        mhs0 mhs0Var = (mhs0) obj;
        return this.a == mhs0Var.a && u890.j(this.b, mhs0Var.b) && Offset.c(this.c, mhs0Var.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
