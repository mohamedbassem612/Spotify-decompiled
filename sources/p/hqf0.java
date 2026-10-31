package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hqf0 {
    public final List a;
    public final ArrayList b;
    public final boolean c;

    public hqf0(ArrayList arrayList, List list, boolean z) {
        this.a = list;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqf0)) {
            return false;
        }
        hqf0 hqf0Var = (hqf0) obj;
        return this.a.equals(hqf0Var.a) && this.b.equals(hqf0Var.b) && this.c == hqf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
