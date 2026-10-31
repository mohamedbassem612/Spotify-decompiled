package p;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d2u {
    public static final long b = System.currentTimeMillis() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
    public final idd1 a;

    public d2u(Context context, gma1 gma1Var, yqg yqgVar) {
        this.a = new idd1(new f2t(gma1Var, context, (byte) 9));
    }

    public final List a() {
        String strE = ((dma1) this.a.getValue()).e(e2u.a, (String) null);
        List listK0 = strE != null ? z561.k0(z561.f0(zlt.X0, new i46(strE, (byte) 7))) : null;
        if (listK0 == null) {
            listK0 = z6x.a;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (hashSet.add(((dos0) obj).a)) {
                arrayList.add(obj);
            }
        }
        return o7h.a1(arrayList, new cvt((byte) 1));
    }
}
