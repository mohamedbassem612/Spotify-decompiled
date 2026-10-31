package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x8y {
    public final List a;
    public final v8y b;
    public final int c;
    public final chf0 d;
    public final int e;
    public final boolean f;
    public final ArrayList g;

    public x8y(List list, v8y v8yVar, int i, chf0 chf0Var, int i2, boolean z, ArrayList arrayList) {
        this.a = list;
        this.b = v8yVar;
        this.c = i;
        this.d = chf0Var;
        this.e = i2;
        this.f = z;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8y)) {
            return false;
        }
        x8y x8yVar = (x8y) obj;
        return this.a.equals(x8yVar.a) && this.b.equals(x8yVar.b) && this.c == x8yVar.c && this.d == x8yVar.d && this.e == x8yVar.e && this.f == x8yVar.f && this.g.equals(x8yVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(ab80.k(this.e, (this.d.hashCode() + kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, 31), 31, this.f);
    }
}
