package p;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yah1 {
    public final List a;
    public final String b;
    public final boolean c;
    public final LinkedHashSet d;

    public yah1(List list, String str, boolean z, LinkedHashSet linkedHashSet) {
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yah1)) {
            return false;
        }
        yah1 yah1Var = (yah1) obj;
        return this.a.equals(yah1Var.a) && u890.j(this.b, yah1Var.b) && this.c == yah1Var.c && this.d.equals(yah1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
