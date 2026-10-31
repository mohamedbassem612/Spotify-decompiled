package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vyc extends bzc {
    public final pr31 b;
    public final ArrayList c;

    public vyc(pr31 pr31Var, ArrayList arrayList) {
        super(pr31Var, arrayList);
        this.b = pr31Var;
        this.c = arrayList;
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
        if (!(obj instanceof vyc)) {
            return false;
        }
        vyc vycVar = (vyc) obj;
        return this.b.equals(vycVar.b) && this.c.equals(vycVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
