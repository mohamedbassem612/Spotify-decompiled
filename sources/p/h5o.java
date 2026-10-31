package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h5o implements j5o {
    public final int a;
    public final ArrayList b;
    public final int c;

    public h5o(ArrayList arrayList, int i, int i2) {
        this.a = i;
        this.b = arrayList;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5o)) {
            return false;
        }
        h5o h5oVar = (h5o) obj;
        return this.a == h5oVar.a && this.b.equals(h5oVar.b) && this.c == h5oVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + p3d1.f(this.b, l1d.C(this.a) * 31, 31);
    }
}
