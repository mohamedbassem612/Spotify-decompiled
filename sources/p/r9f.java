package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r9f {
    public final int a;
    public final List b;
    public final boolean c;

    public /* synthetic */ r9f(ArrayList arrayList, int i, int i2) {
        this(i, (List) ((i2 & 2) != 0 ? z6x.a : arrayList), false);
    }

    public static r9f a(r9f r9fVar, int i, ArrayList arrayList, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = r9fVar.a;
        }
        List list = arrayList;
        if ((i2 & 2) != 0) {
            list = r9fVar.b;
        }
        if ((i2 & 4) != 0) {
            z = r9fVar.c;
        }
        return new r9f(i, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9f)) {
            return false;
        }
        r9f r9fVar = (r9f) obj;
        return this.a == r9fVar.a && u890.j(this.b, r9fVar.b) && this.c == r9fVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(l1d.C(this.a) * 31, 31, this.b);
    }

    public r9f(int i, List list, boolean z) {
        this.a = i;
        this.b = list;
        this.c = z;
    }
}
