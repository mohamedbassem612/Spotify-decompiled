package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gor0 implements hor0 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public /* synthetic */ gor0(float f, float f2, int i, int i2, long j) {
        this((i & 4) != 0 ? fc11.G(2) : j, (i & 8) != 0 ? 0 : 1, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gor0)) {
            return false;
        }
        gor0 gor0Var = (gor0) obj;
        return Float.compare(this.a, gor0Var.a) == 0 && Float.compare(this.b, gor0Var.b) == 0 && TextUnit.a(this.c, gor0Var.c) && this.d == gor0Var.d;
    }

    public final int hashCode() {
        int iF = x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
        wee1[] wee1VarArr = TextUnit.b;
        return Integer.hashCode(this.d) + cy30.f(iF, this.c, 31);
    }

    public gor0(long j, int i, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }
}
