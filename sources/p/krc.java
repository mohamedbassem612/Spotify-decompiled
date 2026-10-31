package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class krc {
    public static final List a = p7h.M(new Double[]{Double.valueOf(0.1d), Double.valueOf(0.25d), Double.valueOf(0.5d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d), Double.valueOf(4.0d), Double.valueOf(5.0d), Double.valueOf(6.0d), Double.valueOf(7.0d), Double.valueOf(8.0d), Double.valueOf(9.0d), Double.valueOf(10.0d), Double.valueOf(15.0d), Double.valueOf(20.0d), Double.valueOf(30.0d), Double.valueOf(40.0d), Double.valueOf(50.0d)});

    public static int a(long j, List list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        double d = j / 1.0E9d;
        double d2 = Double.MAX_VALUE;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            double dAbs = Math.abs(((Number) obj).doubleValue() - d);
            if (dAbs < d2) {
                i = i2;
                d2 = dAbs;
            }
            i2 = i3;
        }
        return i;
    }
}
