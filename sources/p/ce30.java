package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ce30 extends tn21 {
    public static final r8i0 c;
    public final List a;
    public final List b;

    static {
        se11 se11Var = r8i0.e;
        c = bmq0.w("application/x-www-form-urlencoded");
    }

    public ce30(ArrayList arrayList, ArrayList arrayList2) {
        this.a = z4n1.j(arrayList);
        this.b = z4n1.j(arrayList2);
    }

    public final long a() {
        return e(null, true);
    }

    public final void d(fbc fbcVar) {
        e(fbcVar, false);
    }

    public final long e(fbc fbcVar, boolean z) {
        nac nacVarK;
        if (z) {
            nacVarK = new nac();
        } else {
            fbcVar.getClass();
            nacVarK = fbcVar.k();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                nacVarK.R(38);
            }
            nacVarK.Y((String) list.get(i));
            nacVarK.R(61);
            nacVarK.Y((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = nacVarK.b;
        nacVarK.a();
        return j;
    }
}
