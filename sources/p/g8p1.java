package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g8p1 {
    public final e8p1 a;

    public /* synthetic */ g8p1(dmj1 dmj1Var) {
        this.a = (e8p1) dmj1Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof g8p1) && k8p1.h(this.a, ((g8p1) obj).a) && k8p1.h(null, null) && k8p1.h(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, null});
    }
}
