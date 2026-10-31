package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tgc1 {
    public final int a;
    public final Object[] b;

    public tgc1(int i, Object[] objArr) {
        this.a = i;
        this.b = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgc1)) {
            return false;
        }
        tgc1 tgc1Var = (tgc1) obj;
        return this.a == tgc1Var.a && this.b.equals(tgc1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
