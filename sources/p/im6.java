package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class im6 {
    public final String a;
    public final List b;
    public final u7h c;

    public im6(String str, List list, u7h u7hVar) {
        this.a = str;
        this.b = list;
        this.c = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im6)) {
            return false;
        }
        im6 im6Var = (im6) obj;
        return u890.j(this.a, im6Var.a) && u890.j(this.b, im6Var.b) && u890.j(this.c, im6Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        u7h u7hVar = this.c;
        return iB + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a));
    }
}
