package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yeb1 {
    public final List a;
    public final String b;

    public yeb1(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeb1)) {
            return false;
        }
        yeb1 yeb1Var = (yeb1) obj;
        return this.a.equals(yeb1Var.a) && this.b.equals(yeb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
