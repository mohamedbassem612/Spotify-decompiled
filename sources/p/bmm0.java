package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bmm0 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;

    public bmm0(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList.size() == 4;
    }

    public final List a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmm0)) {
            return false;
        }
        bmm0 bmm0Var = (bmm0) obj;
        return u890.j(this.a, bmm0Var.a) && this.b.equals(bmm0Var.b) && this.c.equals(bmm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
