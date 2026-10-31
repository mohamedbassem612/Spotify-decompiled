package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m7e0 {
    public final int a;
    public final List b;
    public final List c;
    public final Integer d;

    public m7e0(int i, List list, List list2, Integer num) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7e0)) {
            return false;
        }
        m7e0 m7e0Var = (m7e0) obj;
        return this.a == m7e0Var.a && u890.j(this.b, m7e0Var.b) && u890.j(this.c, m7e0Var.c) && u890.j(this.d, m7e0Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }
}
