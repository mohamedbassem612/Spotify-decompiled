package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rim implements mfv0, sh {
    public final Function0 a;

    public long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        long j3 = ((qr80) this.a.invoke()).a;
        int iH = w0o1.h(ur80Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), flb0Var == flb0.a);
        return (((long) w0o1.h(ur80Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iH) << 32);
    }

    public boolean r(View view) {
        this.a.invoke();
        return true;
    }
}
