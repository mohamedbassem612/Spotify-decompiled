package p;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dlb0 {
    public static final fjb g = new fjb((byte) 14);
    public final Context a;
    public final LinkedHashMap b;
    public int c;
    public final int d;
    public final LinkedHashSet e;
    public final Set f;

    public dlb0(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = context;
        this.b = linkedHashMap;
        this.c = i;
        this.d = i2;
        this.e = linkedHashSet;
        this.f = set;
    }

    public final int a(s3x s3xVar) {
        hnb0 hnb0VarT = eqr0.t(this.a, s3xVar);
        synchronized (this) {
            Integer num = (Integer) this.b.get(hnb0VarT);
            if (num != null) {
                int iIntValue = num.intValue();
                this.e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int iB = this.c;
            while (this.f.contains(Integer.valueOf(iB))) {
                iB = (iB + 1) % qnb0.b();
                if (iB == this.c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.c = (iB + 1) % qnb0.b();
            this.e.add(Integer.valueOf(iB));
            this.f.add(Integer.valueOf(iB));
            this.b.put(hnb0VarT, Integer.valueOf(iB));
            return iB;
        }
    }

    public final Object b(yx5 yx5Var) {
        Object objD = nt40.a.d(this.a, tnb0.b, f4i1.c(this.d, "appWidgetLayout-"), new y160(this, (lnm) null, (byte) 22), yx5Var);
        return objD == d9n.a ? objD : rih1.a;
    }
}
