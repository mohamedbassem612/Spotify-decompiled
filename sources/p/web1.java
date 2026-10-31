package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class web1 {
    public final String a;
    public final List b;
    public final String c;

    public web1(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof web1)) {
            return false;
        }
        web1 web1Var = (web1) obj;
        return u890.j(this.a, web1Var.a) && this.b.equals(web1Var.b) && this.c.equals(web1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
