package p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zgn implements uv80, wwn0 {
    public final boolean a;
    public final h6h1 b;
    public String c;

    public zgn(boolean z, h6h1 h6h1Var) {
        ygn ygnVar = ygn.a;
        this.a = z;
        this.b = h6h1Var;
        this.c = "";
    }

    public final void a(rj41 rj41Var, hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, Long l, Set set, String str) {
        String str2;
        gwn0 gwn0Var;
        gwn0 gwn0Var2 = hwn0Var.b;
        y6r0 y6r0Var = hwn0Var.a;
        if (this.a) {
            Long l2 = null;
            String str3 = y6r0Var != null ? y6r0Var.a : null;
            if (str3 == null) {
                str3 = "";
            }
            h6h1 h6h1Var = this.b;
            dt71 dt71Var = h6h1Var.a;
            dt71 dt71Var2 = h6h1Var.a;
            dt71Var.a(new pfn(str3));
            this.c = str3;
            dt71Var2.a(new ofn(gwn0Var2.a));
            dt71Var2.a(new nfn(nsn0Var.b()));
            String str4 = (hwn0Var2 == null || (gwn0Var = hwn0Var2.b) == null) ? null : gwn0Var.a;
            String str5 = gwn0Var2.a;
            String strC1 = (y6r0Var == null || (str2 = y6r0Var.a) == null) ? null : ihc1.c1(8, str2);
            if (l != null) {
                long jLongValue = ((Number) ygn.a.invoke()).longValue() - l.longValue();
                Long lValueOf = Long.valueOf(jLongValue);
                if (0 <= jLongValue && jLongValue < 600001) {
                    l2 = lValueOf;
                }
            }
            if (l2 == null) {
                Logger.b("Nav < %s -> %s pi=%s %s", str4, str5, strC1, nsn0Var.b());
            } else {
                Logger.b("Nav < %s -> %s pi=%s %s (+%dms)", str4, str5, strC1, nsn0Var.b(), l2);
            }
        }
    }

    public final void b(rj41 rj41Var, w7h1 w7h1Var, tv80 tv80Var) {
        y7h1 y7h1Var = w7h1Var.d;
        z6h1 z6h1Var = ((q6h1) w7h1Var).c;
        ou80 ou80Var = tv80Var.a;
        if (this.a) {
            String strI = xcg1.i(y7h1Var.a().b(), " in ", o7h.y0(z6h1Var.b().d, "/", (String) null, (String) null, (iu30) null, 62));
            h6h1 h6h1Var = this.b;
            dt71 dt71Var = h6h1Var.a;
            dt71 dt71Var2 = h6h1Var.a;
            dt71Var.a(new kfn(strI));
            dt71Var2.a(new mfn(this.c));
            dt71Var2.a(new lfn(ou80Var.a));
            Logger.b("UI %s in %s id=%s", y7h1Var.a().b(), o7h.y0(o7h.e1(3, z6h1Var.b().d), "/", (String) null, (String) null, (iu30) null, 62), ihc1.c1(8, ou80Var.a));
        }
    }
}
