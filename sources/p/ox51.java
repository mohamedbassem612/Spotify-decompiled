package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ox51 {
    public final qr50 a;
    public final long b;
    public final int c;
    public final boolean d;

    public ox51(qr50 qr50Var, long j, int i, boolean z) {
        this.a = qr50Var;
        this.b = j;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox51)) {
            return false;
        }
        ox51 ox51Var = (ox51) obj;
        return this.a == ox51Var.a && Offset.c(this.b, ox51Var.b) && this.c == ox51Var.c && this.d == ox51Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, cy30.f(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        String str;
        String strI = Offset.i(this.b);
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(strI);
        sb.append(", anchor=");
        int i = this.c;
        if (i == 1) {
            str = "Left";
        } else if (i != 2) {
            str = i != 3 ? "null" : "Right";
        } else {
            str = "Middle";
        }
        sb.append(str);
        sb.append(", visible=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
