package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hrv implements irv {
    public final List a;
    public final boolean b;
    public final Integer c;

    public hrv(c380 c380Var, Integer num, int i) {
        boolean z = (i & 2) == 0;
        num = (i & 4) != 0 ? null : num;
        this.a = c380Var;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrv)) {
            return false;
        }
        hrv hrvVar = (hrv) obj;
        return this.a.equals(hrvVar.a) && this.b == hrvVar.b && u890.j(this.c, hrvVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
