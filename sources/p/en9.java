package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class en9 {
    public final String a;
    public final List b;
    public final u7h c;

    public en9(String str, List list, u7h u7hVar) {
        this.a = str;
        this.b = list;
        this.c = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en9)) {
            return false;
        }
        en9 en9Var = (en9) obj;
        return u890.j(this.a, en9Var.a) && this.b.equals(en9Var.b) && u890.j(this.c, en9Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        u7h u7hVar = this.c;
        return iB + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
