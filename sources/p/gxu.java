package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxu {
    public final String a;
    public final String b;
    public final List c;
    public final b8c0 d;

    public gxu(String str, String str2, List list, b8c0 b8c0Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = b8c0Var;
    }

    public final b8c0 a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxu)) {
            return false;
        }
        gxu gxuVar = (gxu) obj;
        return this.a.equals(gxuVar.a) && this.b.equals(gxuVar.b) && u890.j(this.c, gxuVar.c) && u890.j(this.d, gxuVar.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        b8c0 b8c0Var = this.d;
        return iB + (b8c0Var == null ? 0 : b8c0Var.hashCode());
    }
}
