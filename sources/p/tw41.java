package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tw41 {
    public final List a;
    public final String b;
    public final List c;

    public tw41(String str, List list, List list2) {
        this.a = list;
        this.b = str;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw41)) {
            return false;
        }
        tw41 tw41Var = (tw41) obj;
        return this.a.equals(tw41Var.a) && this.b.equals(tw41Var.b) && u890.j(this.c, tw41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
