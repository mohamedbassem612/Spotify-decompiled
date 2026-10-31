package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f5o {
    public final int a;
    public final ArrayList b;
    public final int c;

    public f5o(ArrayList arrayList, int i, int i2) {
        this.a = i;
        this.b = arrayList;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5o)) {
            return false;
        }
        f5o f5oVar = (f5o) obj;
        return this.a == f5oVar.a && this.b.equals(f5oVar.b) && this.c == f5oVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + p3d1.f(this.b, l1d.C(this.a) * 31, 31);
    }
}
