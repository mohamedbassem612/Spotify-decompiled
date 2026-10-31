package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t8g0 extends x8g0 {
    public final String a;
    public final List b;

    public t8g0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8g0)) {
            return false;
        }
        t8g0 t8g0Var = (t8g0) obj;
        return this.a.equals(t8g0Var.a) && u890.j(this.b, t8g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
