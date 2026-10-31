package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tyc extends bzc {
    public final pr31 b;
    public final ArrayList c;

    public tyc(pr31 pr31Var, ArrayList arrayList) {
        super(pr31Var, arrayList);
        this.b = pr31Var;
        this.c = arrayList;
    }

    @Override // p.bzc
    public final pr31 a() {
        return this.b;
    }

    @Override // p.bzc
    public final List b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyc)) {
            return false;
        }
        tyc tycVar = (tyc) obj;
        return u890.j(this.b, tycVar.b) && this.c.equals(tycVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
