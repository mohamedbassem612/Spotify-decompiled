package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u8e1 {
    public static final u8e1 c = new u8e1(3, 0, 0);
    public final long a;
    public final long b;

    public /* synthetic */ u8e1(int i, long j, long j2) {
        this((i & 1) != 0 ? fc11.G(0) : j, (i & 2) != 0 ? fc11.G(0) : j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8e1)) {
            return false;
        }
        u8e1 u8e1Var = (u8e1) obj;
        return TextUnit.a(this.a, u8e1Var.a) && TextUnit.a(this.b, u8e1Var.b);
    }

    public final int hashCode() {
        wee1[] wee1VarArr = TextUnit.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return cy30.p("TextIndent(firstLine=", TextUnit.f(this.a), ", restLine=", TextUnit.f(this.b), ")");
    }

    public u8e1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
