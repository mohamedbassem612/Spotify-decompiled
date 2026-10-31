package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sla1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sla1(int i, int i2, int i3, int i4) {
        if (i < 0) {
            hhg1.n(gvg.e(i, "lineIndex ", " must be >= 0"));
            throw null;
        }
        if (i2 < 0) {
            hhg1.n(gvg.e(i2, "columnIndex ", " must be >= 0"));
            throw null;
        }
        if (i3 < 0) {
            hhg1.n(gvg.e(i3, "inputIndex ", " must be >= 0"));
            throw null;
        }
        if (i4 < 0) {
            hhg1.n(gvg.e(i4, "length ", " must be >= 0"));
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final sla1 a(int i, int i2) {
        if (i < 0) {
            eg.g(gvg.e(i, "beginIndex ", " + must be >= 0"));
            return null;
        }
        int i3 = this.d;
        if (i > i3) {
            eg.g(cy30.i(i, "beginIndex ", i3, " must be <= length "));
            return null;
        }
        if (i2 < 0) {
            eg.g(gvg.e(i2, "endIndex ", " + must be >= 0"));
            return null;
        }
        if (i2 > i3) {
            eg.g(cy30.i(i2, "endIndex ", i3, " must be <= length "));
            return null;
        }
        if (i > i2) {
            eg.g(cy30.i(i, "beginIndex ", i2, " must be <= endIndex "));
            return null;
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new sla1(this.a, this.b + i, this.c + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sla1.class == obj.getClass()) {
            sla1 sla1Var = (sla1) obj;
            if (this.a == sla1Var.a && this.b == sla1Var.b && this.c == sla1Var.c && this.d == sla1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sbQ = cy30.q(this.a, this.b, "SourceSpan{line=", ", column=", ", input=");
        sbQ.append(this.c);
        sbQ.append(", length=");
        sbQ.append(this.d);
        sbQ.append("}");
        return sbQ.toString();
    }
}
