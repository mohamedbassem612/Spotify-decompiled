package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xk6 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public xk6(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk6)) {
            return false;
        }
        xk6 xk6Var = (xk6) obj;
        return this.a.equals(xk6Var.a) && u890.j(this.b, xk6Var.b) && this.c.equals(xk6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
