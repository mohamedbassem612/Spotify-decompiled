package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g5e1 {
    public static final g5e1 f = new g5e1(false, 9205357640488583168L, 0.0f, 1, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final int d;
    public final boolean e;

    public g5e1(boolean z, long j, float f2, int i, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = i;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5e1)) {
            return false;
        }
        g5e1 g5e1Var = (g5e1) obj;
        return this.a == g5e1Var.a && Offset.c(this.b, g5e1Var.b) && Float.compare(this.c, g5e1Var.c) == 0 && this.d == g5e1Var.d && this.e == g5e1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ab80.k(this.d, x0d.f(cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31);
    }

    public final String toString() {
        String strI = Offset.i(this.b);
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(strI);
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(fd21.p(this.d));
        sb.append(", handlesCrossed=");
        return l1d.r(sb, this.e, ")");
    }

    public /* synthetic */ g5e1(float f2, int i, long j, boolean z) {
        this(true, j, f2, i, z);
    }
}
