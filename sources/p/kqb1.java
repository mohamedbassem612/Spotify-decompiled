package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kqb1 {
    public final int a;
    public final String b;
    public final ArrayList c;

    public kqb1(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqb1)) {
            return false;
        }
        kqb1 kqb1Var = (kqb1) obj;
        return this.a == kqb1Var.a && this.b.equals(kqb1Var.b) && this.c.equals(kqb1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
