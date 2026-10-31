package p;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class np00 {
    public final wao0 a;
    public final Handler b;
    public final Map c = mp10.l();

    public np00(wao0 wao0Var, Handler handler) {
        this.a = wao0Var;
        this.b = handler;
    }

    public final koe1 a(long j, l6u0 l6u0Var) {
        int i = ((int) (j / 15000)) + 1;
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = ((long) i2) * 15000;
        }
        return b(jArr, false, l6u0Var);
    }

    public final koe1 b(long[] jArr, boolean z, l6u0 l6u0Var) {
        if (jArr.length == 0) {
            return null;
        }
        koe1 koe1Var = new koe1();
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (j >= 0) {
                arrayList.add(Long.valueOf(j));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            String strW = nhc1.W(UUID.randomUUID().toString(), "-", "");
            koe1Var.a.add(strW);
            np00 np00Var = this;
            np00Var.a.invoke(new lp00(np00Var, strW, l6u0Var, z, jLongValue));
            this = np00Var;
        }
        return koe1Var;
    }

    public final void c(koe1 koe1Var) {
        this.a.invoke(new mp00(koe1Var, this, (byte) 0));
    }
}
