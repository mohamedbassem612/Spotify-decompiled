package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jj51 {
    public final Integer a;
    public final ArrayList b;

    public jj51(Integer num, ArrayList arrayList) {
        this.a = num;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj51)) {
            return false;
        }
        jj51 jj51Var = (jj51) obj;
        return u890.j(this.a, jj51Var.a) && this.b.equals(jj51Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
