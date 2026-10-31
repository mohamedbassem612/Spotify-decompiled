package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xoo {
    public final ijf1 a;
    public final long b;
    public final long c;

    public xoo(ijf1 ijf1Var, long j, long j2) {
        this.a = ijf1Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoo)) {
            return false;
        }
        xoo xooVar = (xoo) obj;
        if (this.a != xooVar.a || !Offset.c(this.b, xooVar.b)) {
            return false;
        }
        long j = xooVar.c;
        int i = u7h.l;
        return z4h1.b(this.c, j);
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        int i = u7h.l;
        return Long.hashCode(this.c) + iF;
    }
}
