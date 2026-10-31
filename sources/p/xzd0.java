package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xzd0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public xzd0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzd0)) {
            return false;
        }
        xzd0 xzd0Var = (xzd0) obj;
        return this.a.equals(xzd0Var.a) && this.b.equals(xzd0Var.b) && this.c.equals(xzd0Var.c) && this.d.equals(xzd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
