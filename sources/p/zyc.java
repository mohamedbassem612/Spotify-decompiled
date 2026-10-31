package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zyc extends bzc {
    public final pr31 b;
    public final ArrayList c;
    public final int d;
    public final pr31 e;
    public final int f;

    public zyc(pr31 pr31Var, ArrayList arrayList, int i, pr31 pr31Var2, int i2) {
        super(pr31Var, arrayList);
        this.b = pr31Var;
        this.c = arrayList;
        this.d = i;
        this.e = pr31Var2;
        this.f = i2;
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
        if (!(obj instanceof zyc)) {
            return false;
        }
        zyc zycVar = (zyc) obj;
        return this.b.equals(zycVar.b) && this.c.equals(zycVar.c) && this.d == zycVar.d && this.e.equals(zycVar.e) && this.f == zycVar.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + ((this.e.hashCode() + kaa0.f(this.d, p3d1.f(this.c, this.b.hashCode() * 31, 31), 31)) * 31);
    }
}
