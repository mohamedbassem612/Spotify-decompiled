package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class azy extends dem1 {
    public final ArrayList b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public azy(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.b = arrayList;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azy)) {
            return false;
        }
        azy azyVar = (azy) obj;
        return this.b.equals(azyVar.b) && this.c == azyVar.c && this.d == azyVar.d && this.e == azyVar.e && this.f == azyVar.f && this.g == azyVar.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
