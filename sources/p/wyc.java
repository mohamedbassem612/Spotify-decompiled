package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wyc extends bzc {
    public final pr31 b;
    public final ArrayList c;
    public final int d;

    public wyc(pr31 pr31Var, ArrayList arrayList, int i) {
        super(pr31Var, arrayList);
        this.b = pr31Var;
        this.c = arrayList;
        this.d = i;
    }

    public final pr31 a() {
        return this.b;
    }

    public final List b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyc)) {
            return false;
        }
        wyc wycVar = (wyc) obj;
        return u890.j(this.b, wycVar.b) && this.c.equals(wycVar.c) && this.d == wycVar.d;
    }

    public final int hashCode() {
        pr31 pr31Var = this.b;
        return Integer.hashCode(this.d) + p3d1.f(this.c, (pr31Var == null ? 0 : pr31Var.hashCode()) * 31, 31);
    }
}
