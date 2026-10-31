package p;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yx6 {
    public final lzn0 a;

    public void a(chi1 chi1Var) {
        boolean zEquals = chi1Var.equals(ygi1.a);
        lzn0 lzn0Var = this.a;
        if (zEquals) {
            lzn0Var.e();
            return;
        }
        if (chi1Var instanceof zgi1) {
            Parcelable.Creator creator = lik1.CREATOR;
            String str = ((zgi1) chi1Var).a;
            if (oap1.o(str)) {
                lzn0Var.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
            } else {
                v8i0.j("Invalid URI, won't navigate. Uri: ", str);
            }
        }
    }
}
