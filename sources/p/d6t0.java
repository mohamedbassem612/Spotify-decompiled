package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d6t0 {
    public final long a;
    public final long b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public d6t0(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        wee1[] wee1VarArr = TextUnit.b;
        if ((j & 1095216660480L) == 0) {
            rf80.a("width cannot be TextUnit.Unspecified");
        }
        if ((1095216660480L & j2) == 0) {
            rf80.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6t0)) {
            return false;
        }
        d6t0 d6t0Var = (d6t0) obj;
        return TextUnit.a(this.a, d6t0Var.a) && TextUnit.a(this.b, d6t0Var.b) && this.c == d6t0Var.c;
    }

    public final int hashCode() {
        wee1[] wee1VarArr = TextUnit.b;
        return Integer.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String str;
        String strF = TextUnit.f(this.a);
        String strF2 = TextUnit.f(this.b);
        byte b = this.c;
        if (b == 1) {
            str = "AboveBaseline";
        } else if (b == 2) {
            str = "Top";
        } else if (b == 3) {
            str = "Bottom";
        } else if (b == 4) {
            str = "Center";
        } else if (b == 5) {
            str = "TextTop";
        } else if (b == 6) {
            str = "TextBottom";
        } else {
            str = b == 7 ? "TextCenter" : "Invalid";
        }
        return l1d.n(str, ")", gvg.n("Placeholder(width=", strF, ", height=", strF2, ", placeholderVerticalAlign="));
    }
}
