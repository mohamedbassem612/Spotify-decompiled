package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class px8 implements qx8 {
    public final long a;
    public final long b;
    public final long c;
    public final nx8 d;

    public /* synthetic */ px8(long j, long j2, long j3, mx8 mx8Var, int i) {
        this((i & 1) != 0 ? fc11.G(12) : j, j2, (i & 4) != 0 ? fc11.G(2) : j3, (i & 8) != 0 ? lx8.a : mx8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px8)) {
            return false;
        }
        px8 px8Var = (px8) obj;
        return TextUnit.a(this.a, px8Var.a) && TextUnit.a(this.b, px8Var.b) && TextUnit.a(this.c, px8Var.c) && u890.j(this.d, px8Var.d);
    }

    public final int hashCode() {
        wee1[] wee1VarArr = TextUnit.b;
        return this.d.hashCode() + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public px8(long j, long j2, long j3, nx8 nx8Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = nx8Var;
    }
}
