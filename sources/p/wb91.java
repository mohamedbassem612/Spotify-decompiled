package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wb91 {
    public final tr80 a;
    public final cc91 b;

    public wb91(tr80 tr80Var, cc91 cc91Var) {
        this.a = tr80Var;
        this.b = cc91Var;
    }

    public final tr80 a() {
        return this.a;
    }

    public final wb91 b(int i, int i2, tr80 tr80Var, int i3) {
        tr80 tr80Var2 = new tr80(i, i2, 1);
        cc91 cc91Var = this.b;
        byte b = cc91Var.a;
        int iMin = Math.min(i, ((rr80) tr80Var).a);
        int iMax = Math.max(((rr80) tr80Var2).b, ((rr80) tr80Var).b);
        int iMax2 = Math.max(0, iMin);
        int i4 = (iMax - iMax2) + 1;
        if (i4 < b) {
            int i5 = b - i4;
            int iC = l1d.C(i3);
            if (iC == 0) {
                iMax += i5;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                int iMin2 = Math.min(i5, iMax2);
                iMax2 -= iMin2;
                iMax += i5 - iMin2;
            }
        }
        return new wb91(new tr80(iMax2, iMax, 1), cc91Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb91)) {
            return false;
        }
        wb91 wb91Var = (wb91) obj;
        return u890.j(this.a, wb91Var.a) && this.b.equals(wb91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
