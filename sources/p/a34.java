package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a34 extends c34 {
    public final List a;
    public final String b;
    public final x360 c;

    public a34(List list, String str, x360 x360Var) {
        this.a = list;
        this.b = str;
        this.c = x360Var;
    }

    @Override // p.c34
    public final x360 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a34)) {
            return false;
        }
        a34 a34Var = (a34) obj;
        return this.a.equals(a34Var.a) && this.b.equals(a34Var.b) && u890.j(this.c, a34Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return iD + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
