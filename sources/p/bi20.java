package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bi20 extends ci20 {
    public final String a;
    public final boolean b;
    public final ArrayList c;

    public bi20(String str, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi20)) {
            return false;
        }
        bi20 bi20Var = (bi20) obj;
        return u890.j(this.a, bi20Var.a) && this.b == bi20Var.b && this.c.equals(bi20Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
