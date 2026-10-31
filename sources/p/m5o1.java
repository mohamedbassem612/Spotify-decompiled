package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m5o1 {
    public final q0p1 a;
    public final Boolean b;
    public final g8p1 c;

    public /* synthetic */ m5o1(fqn1 fqn1Var) {
        this.a = (q0p1) fqn1Var.b;
        this.b = (Boolean) fqn1Var.c;
        this.c = (g8p1) fqn1Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m5o1)) {
            return false;
        }
        m5o1 m5o1Var = (m5o1) obj;
        return k8p1.h(this.a, m5o1Var.a) && k8p1.h(null, null) && k8p1.h(this.b, m5o1Var.b) && k8p1.h(null, null) && k8p1.h(this.c, m5o1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b, null, this.c});
    }
}
