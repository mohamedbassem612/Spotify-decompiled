package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fb6 {
    public final String a;
    public final String b;
    public final List c;

    public fb6(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb6)) {
            return false;
        }
        fb6 fb6Var = (fb6) obj;
        return this.a.equals(fb6Var.a) && u890.j(this.b, fb6Var.b) && this.c.equals(fb6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
