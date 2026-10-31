package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yb3 implements ez00 {
    public final List a;

    public yb3(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb3) && this.a.equals(((yb3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
