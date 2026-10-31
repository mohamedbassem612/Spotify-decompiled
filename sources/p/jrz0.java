package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jrz0 {
    public final String a;
    public final List b;
    public final String c;
    public final v0a d;
    public final vu30 e;

    public jrz0(String str, List list, String str2, v0a v0aVar, vu30 vu30Var) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = v0aVar;
        this.e = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrz0)) {
            return false;
        }
        jrz0 jrz0Var = (jrz0) obj;
        return u890.j(this.a, jrz0Var.a) && u890.j(this.b, jrz0Var.b) && u890.j(this.c, jrz0Var.c) && u890.j(this.d, jrz0Var.d) && u890.j(this.e, jrz0Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        v0a v0aVar = this.d;
        return this.e.hashCode() + ((iHashCode + (v0aVar != null ? v0aVar.hashCode() : 0)) * 31);
    }
}
