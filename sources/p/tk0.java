package p;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tk0 implements io20 {
    public final kly0 a;

    public jgb1 a(String str, int i, int i2, int i3, String str2) {
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        m441 m441Var = new m441(new q4(this, (lnm) null, (byte) 9));
        c0g.x.getClass();
        return new jgb1(str, numValueOf, (String) null, numValueOf2, (sp00) null, (Integer) null, (a2i) null, m441Var, cxo1.P0, (mr20) null, new qxn0(new jxn0(i3, false), new nxn0(str2, (Bundle) null)), (Map) null, 85946);
    }

    public Object b() {
        return Integer.valueOf(((dhb) this.a.get()).c());
    }

    public int c() {
        int iOrdinal = ((p3l) this.a.get()).v().ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        eg.o();
        return 0;
    }
}
