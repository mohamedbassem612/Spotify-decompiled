package p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i461 implements ci90 {
    public final lzn0 a;
    public final rx4 b;
    public final tdl0 c;

    public i461(lzn0 lzn0Var, rx4 rx4Var, tdl0 tdl0Var) {
        this.a = lzn0Var;
        this.b = rx4Var;
        this.c = tdl0Var;
    }

    public static boolean i(wls0 wls0Var) {
        int iOrdinal = wls0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return false;
        }
        if (iOrdinal == 5) {
            return true;
        }
        eg.o();
        return false;
    }

    public static String j(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (list.isEmpty()) {
            hhg1.n("Missing member in members list.");
            return null;
        }
        String str = new y6b1(((fji0) list.get(0)).a.a, false).d;
        if (str != null) {
            return pcf.g(str);
        }
        hhg1.n("No username could be extracted");
        return null;
    }

    public final String a() {
        return "playlist_collaboration_send_message";
    }

    public final b0o1 b() {
        return ahm.c;
    }

    public final void c(vpu0 vpu0Var, tv80 tv80Var) {
        this.a.a(j(vpu0Var), tv80Var, (Bundle) null);
    }

    public final ghm e(vpu0 vpu0Var) {
        List list = vpu0Var.b.f;
        if (!list.isEmpty()) {
            return new ghm(new ny51(this, vpu0Var, ((fji0) list.get(0)).a.a, (byte) 1), new mn41(this, vpu0Var));
        }
        hhg1.n("Missing member in members list.");
        return null;
    }

    public final int f(vpu0 vpu0Var) {
        return 2131960101;
    }

    public final hux g(vpu0 vpu0Var) {
        return uox.c;
    }

    public final boolean h(vpu0 vpu0Var) {
        if (this.b.a() && vpu0Var.d) {
            List list = vpu0Var.b.f;
            if (list.isEmpty()) {
                hhg1.n("Missing member in members list.");
            } else {
                fji0 fji0Var = (fji0) list.get(0);
                String str = new y6b1(fji0Var.a.a, false).d;
                if (str == null) {
                    hhg1.n("No username could be extracted");
                    return false;
                }
                boolean zEquals = str.equals(vpu0Var.c);
                boolean zI = i(vpu0Var.e);
                boolean zI2 = i(fji0Var.f);
                if (!zEquals && zI && zI2 && vpu0Var.f) {
                    return true;
                }
            }
        }
        return false;
    }
}
