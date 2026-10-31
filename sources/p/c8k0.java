package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c8k0 {
    public final a8k0 a;
    public final a8k0 b;
    public final String c;
    public final Map d;

    public c8k0(a8k0 a8k0Var, a8k0 a8k0Var2, String str, Map map) {
        this.a = a8k0Var;
        this.b = a8k0Var2;
        this.c = str;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8k0)) {
            return false;
        }
        c8k0 c8k0Var = (c8k0) obj;
        return this.a.equals(c8k0Var.a) && this.b.equals(c8k0Var.b) && this.c.equals(c8k0Var.c) && u890.j(this.d, c8k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
