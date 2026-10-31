package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vzo1 {
    public final szo1 a;
    public final Integer b;

    public /* synthetic */ vzo1(bym1 bym1Var) {
        this.a = (szo1) bym1Var.b;
        this.b = (Integer) bym1Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vzo1)) {
            return false;
        }
        vzo1 vzo1Var = (vzo1) obj;
        return k8p1.h(this.a, vzo1Var.a) && k8p1.h(this.b, vzo1Var.b) && k8p1.h(null, null) && k8p1.h(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
