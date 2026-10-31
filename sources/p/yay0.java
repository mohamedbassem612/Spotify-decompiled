package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yay0 {
    public final List a;
    public final int b;

    public yay0(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yay0)) {
            return false;
        }
        yay0 yay0Var = (yay0) obj;
        return u890.j(this.a, yay0Var.a) && this.b == yay0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
