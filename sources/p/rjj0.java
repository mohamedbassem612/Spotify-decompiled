package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rjj0 {
    public final String a;
    public final Map b;
    public final Set c;
    public final xu00 d;

    public rjj0(String str, Map map, Set set, xu00 xu00Var) {
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = xu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjj0)) {
            return false;
        }
        rjj0 rjj0Var = (rjj0) obj;
        return this.a.equals(rjj0Var.a) && this.b.equals(rjj0Var.b) && this.c.equals(rjj0Var.c) && this.d.equals(rjj0Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + gvg.c(cy30.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
