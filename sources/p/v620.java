package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v620 implements z620 {
    public final List a;
    public final uha1 b;

    public v620(List list, uha1 uha1Var) {
        this.a = list;
        this.b = uha1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v620)) {
            return false;
        }
        v620 v620Var = (v620) obj;
        return this.a.equals(v620Var.a) && this.b.equals(v620Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
