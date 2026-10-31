package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gh7 {
    public final ArrayList a;
    public final ArrayList b;
    public final int c;
    public final String d;

    public gh7(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh7)) {
            return false;
        }
        gh7 gh7Var = (gh7) obj;
        return this.a.equals(gh7Var.a) && this.b.equals(gh7Var.b) && this.c == gh7Var.c && this.d.equals(gh7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
