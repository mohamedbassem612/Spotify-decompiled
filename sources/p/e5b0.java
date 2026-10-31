package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e5b0 implements dbr0 {
    public final List a;
    public final List b;
    public final List c;
    public final String d;

    public e5b0(int i, List list, List list2) {
        int i2 = i & 1;
        z6x z6xVar = z6x.a;
        list = i2 != 0 ? z6xVar : list;
        list2 = (i & 2) != 0 ? z6xVar : list2;
        String str = (i & 16) != 0 ? null : "android-home-evo-page";
        this.a = list;
        this.b = list2;
        this.c = z6xVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5b0)) {
            return false;
        }
        e5b0 e5b0Var = (e5b0) obj;
        return this.a.equals(e5b0Var.a) && this.b.equals(e5b0Var.b) && this.c.equals(e5b0Var.c) && u890.j(this.d, e5b0Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(f4i1.b(this.a.hashCode() * 31, 961, this.b), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
