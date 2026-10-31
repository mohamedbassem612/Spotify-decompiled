package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p.g3d1;
import p.h3d1;
import p.h4b1;
import p.k29;
import p.xgz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements xgz0 {
    public static final g3d1 a;
    public static final g3d1 b;
    public static final HashSet c;
    public static final HashSet d;

    static {
        g3d1 g3d1Var = new g3d1();
        h3d1 h3d1Var = h3d1.VGA;
        h4b1.g(2, h3d1Var, 0L, g3d1Var);
        h3d1 h3d1Var2 = h3d1.PREVIEW;
        h4b1.g(1, h3d1Var2, 0L, g3d1Var);
        h3d1 h3d1Var3 = h3d1.MAXIMUM;
        h4b1.g(2, h3d1Var3, 0L, g3d1Var);
        a = g3d1Var;
        g3d1 g3d1Var2 = new g3d1();
        g3d1Var2.a(new k29(1, h3d1Var2, 0L));
        g3d1Var2.a(new k29(1, h3d1Var, 0L));
        h4b1.g(2, h3d1Var3, 0L, g3d1Var2);
        b = g3d1Var2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean b() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
