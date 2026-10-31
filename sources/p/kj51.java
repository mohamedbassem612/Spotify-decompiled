package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kj51 {
    public final Integer a;
    public final List b;
    public final boolean c;

    public kj51(Integer num, List list) {
        this.a = num;
        this.b = list;
        this.c = list.size() > 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj51)) {
            return false;
        }
        kj51 kj51Var = (kj51) obj;
        return u890.j(this.a, kj51Var.a) && u890.j(this.b, kj51Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
