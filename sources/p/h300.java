package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h300 implements t600 {
    public final boolean a;
    public final String b;
    public final String c;
    public final Set d;

    public h300(boolean z, String str, String str2, Set set) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h300)) {
            return false;
        }
        h300 h300Var = (h300) obj;
        return this.a == h300Var.a && u890.j(this.b, h300Var.b) && u890.j(this.c, h300Var.c) && this.d.equals(h300Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
