package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a8k0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Map d;

    public a8k0(String str, String str2, boolean z, Map map) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8k0)) {
            return false;
        }
        a8k0 a8k0Var = (a8k0) obj;
        return u890.j(this.a, a8k0Var.a) && u890.j(this.b, a8k0Var.b) && this.c == a8k0Var.c && u890.j(this.d, a8k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
