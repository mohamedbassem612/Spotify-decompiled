package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ys70 {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final String d;
    public final String e;

    public ys70(int i, String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys70)) {
            return false;
        }
        ys70 ys70Var = (ys70) obj;
        return u890.j(this.a, ys70Var.a) && this.b.equals(ys70Var.b) && this.c == ys70Var.c && u890.j(this.d, ys70Var.d) && u890.j(this.e, ys70Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
