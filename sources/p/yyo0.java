package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yyo0 {
    public final Set a;
    public final float b;

    public yyo0(Set set, float f) {
        this.a = set;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyo0)) {
            return false;
        }
        yyo0 yyo0Var = (yyo0) obj;
        return this.a.equals(yyo0Var.a) && p3v.c(this.b, yyo0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
