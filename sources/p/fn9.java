package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fn9 {
    public final String a;
    public final String b;
    public final List c;
    public final u7h d;

    public fn9(String str, String str2, List list, u7h u7hVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn9)) {
            return false;
        }
        fn9 fn9Var = (fn9) obj;
        return this.a.equals(fn9Var.a) && u890.j(this.b, fn9Var.b) && this.c.equals(fn9Var.c) && u890.j(this.d, fn9Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iB = f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        u7h u7hVar = this.d;
        return iB + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
