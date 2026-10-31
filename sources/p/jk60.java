package p;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jk60 extends yca {
    public int h;

    @Override // p.qp00
    public final int c() {
        return this.h;
    }

    @Override // p.qp00
    public final Object j() {
        return null;
    }

    @Override // p.qp00
    public final void l(long j, long j2, long j3, List list, vjh0[] vjh0VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.h, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.h = i;
                    return;
                }
            }
            bhn0.w();
        }
    }

    @Override // p.qp00
    public final int t() {
        return 0;
    }
}
