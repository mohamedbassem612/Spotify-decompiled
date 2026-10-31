package p;

import android.content.res.Resources;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qe30 implements zw21 {
    public final int a;
    public final Object[] b;

    public qe30(int i, Object... objArr) {
        this.a = i;
        this.b = objArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qe30)) {
            return false;
        }
        qe30 qe30Var = (qe30) obj;
        return this.a == qe30Var.a && Arrays.equals(this.b, qe30Var.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final Object invoke(Object obj) {
        Object[] objArr = this.b;
        return ((Resources) obj).getString(this.a, Arrays.copyOf(objArr, objArr.length));
    }
}
