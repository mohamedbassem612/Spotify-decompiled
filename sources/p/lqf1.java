package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lqf1 extends ero1 {
    public final String b;
    public final ArrayList c;

    public lqf1(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqf1)) {
            return false;
        }
        lqf1 lqf1Var = (lqf1) obj;
        return this.b.equals(lqf1Var.b) && this.c.equals(lqf1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
