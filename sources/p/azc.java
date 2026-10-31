package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class azc extends bzc {
    public final pr31 b;
    public final ArrayList c;
    public final int d;

    public azc(pr31 pr31Var, ArrayList arrayList, int i) {
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
        if (!(obj instanceof azc)) {
            return false;
        }
        azc azcVar = (azc) obj;
        return this.b.equals(azcVar.b) && this.c.equals(azcVar.c) && this.d == azcVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p3d1.f(this.c, this.b.hashCode() * 31, 31);
    }
}
