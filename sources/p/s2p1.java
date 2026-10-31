package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s2p1 extends cip1 {
    private static final s2p1 zzh;
    private int zzb;
    private k3p1 zzd;
    private u9p1 zze;
    private lip1 zzf = rjp1.e;
    private jip1 zzg = eip1.e;

    static {
        s2p1 s2p1Var = new s2p1();
        zzh = s2p1Var;
        cip1.h(s2p1.class, s2p1Var);
    }

    public static q2p1 m() {
        return (q2p1) zzh.e();
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", h9p1.class, "zzg", wdx0.a1});
        }
        if (i2 == 3) {
            return new s2p1();
        }
        if (i2 == 4) {
            return new q2p1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final /* synthetic */ void n(k3p1 k3p1Var) {
        this.zzd = k3p1Var;
        this.zzb |= 1;
    }

    public final void o(ArrayList arrayList) {
        List list = this.zzg;
        if (!((ugp1) list).a) {
            int size = list.size();
            this.zzg = ((eip1) list).zzf(size + size);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y1p1 y1p1Var = (y1p1) it.next();
            ((eip1) this.zzg).zzh(y1p1Var.a);
        }
    }
}
