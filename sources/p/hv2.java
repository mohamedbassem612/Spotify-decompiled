package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hv2 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    /* JADX WARN: Multi-variable type inference failed */
    public hv2(int i, String str, String str2, String str3, smc0 smc0Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv2)) {
            return false;
        }
        hv2 hv2Var = (hv2) obj;
        return this.a == hv2Var.a && this.b.equals(hv2Var.b) && this.c.equals(hv2Var.c) && this.d.equals(hv2Var.d) && this.e.equals(hv2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a ? 1 : 0) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
