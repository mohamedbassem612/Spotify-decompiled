package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ynb implements zw21 {
    public final long a;
    public final int b;

    public ynb(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        long jL0 = fdg1.l0(this.a, ngv.d);
        long jU = jfv.u(jL0, ngv.g);
        int iJ = jfv.j(jL0);
        jfv.l(jL0);
        return resources.getString(2131959274, jU > 0 ? resources.getString(2131959273, resources.getQuantityString(2131820765, (int) jU, Long.valueOf(jU)), resources.getQuantityString(2131820766, iJ, Integer.valueOf(iJ))) : resources.getQuantityString(2131820766, iJ, Integer.valueOf(iJ)), Integer.valueOf(this.b));
    }
}
