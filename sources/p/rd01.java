package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rd01 {
    public final boolean a;
    public final String b;
    public final List c;

    public rd01(String str, List list, boolean z) {
        this.a = z;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd01)) {
            return false;
        }
        rd01 rd01Var = (rd01) obj;
        return this.a == rd01Var.a && this.b.equals(rd01Var.b) && u890.j(this.c, rd01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
