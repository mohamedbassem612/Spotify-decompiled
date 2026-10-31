package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ed21 {
    public final Map a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public ed21(Map map, int i, boolean z, boolean z2) {
        this.a = map;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed21)) {
            return false;
        }
        ed21 ed21Var = (ed21) obj;
        return u890.j(this.a, ed21Var.a) && this.b == ed21Var.b && this.c == ed21Var.c && this.d == ed21Var.d;
    }

    public final int hashCode() {
        Map map = this.a;
        return Boolean.hashCode(this.d) + xcg1.g(kaa0.f(this.b, (map == null ? 0 : map.hashCode()) * 31, 31), 31, this.c);
    }
}
