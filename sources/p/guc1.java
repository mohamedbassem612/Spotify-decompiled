package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class guc1 {
    public final bxt a;
    public final Map b;
    public final jwc1 c;

    public guc1(bxt bxtVar, Map map, jwc1 jwc1Var) {
        this.a = bxtVar;
        this.b = map;
        this.c = jwc1Var;
    }

    public final bxt a() {
        return this.a;
    }

    public final jwc1 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guc1)) {
            return false;
        }
        guc1 guc1Var = (guc1) obj;
        return u890.j(this.a, guc1Var.a) && u890.j(this.b, guc1Var.b) && u890.j(this.c, guc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.e(this.a.hashCode() * 31, 31, this.b);
    }
}
