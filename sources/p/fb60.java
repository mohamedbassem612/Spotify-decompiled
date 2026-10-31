package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fb60 {
    public final long a;
    public final long b;
    public final float c;

    public fb60(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb60)) {
            return false;
        }
        fb60 fb60Var = (fb60) obj;
        return TextUnit.a(this.a, fb60Var.a) && TextUnit.a(this.b, fb60Var.b) && Float.compare(this.c, fb60Var.c) == 0;
    }

    public final int hashCode() {
        wee1[] wee1VarArr = TextUnit.b;
        return Float.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
