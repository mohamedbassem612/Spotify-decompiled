package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d151 implements r151 {
    public final int a;
    public final List b;

    public d151(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d151)) {
            return false;
        }
        d151 d151Var = (d151) obj;
        return this.a == d151Var.a && u890.j(this.b, d151Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
