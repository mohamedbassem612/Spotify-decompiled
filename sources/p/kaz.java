package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kaz implements yt11 {
    public final lzn0 a;
    public final vgm b;
    public final boolean c;

    public kaz(lzn0 lzn0Var, vgm vgmVar, boolean z) {
        this.a = lzn0Var;
        this.b = vgmVar;
        this.c = z;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        if (unb1Var instanceof jmb1) {
            String str = ((jmb1) unb1Var).a.a;
            lzn0 lzn0Var = this.a;
            if (tv80Var != null) {
                lzn0Var.a(str, tv80Var, (Bundle) null);
            } else {
                lzn0Var.h(str);
            }
        }
        return rih1.a;
    }

    public final s9d1 b() {
        return null;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        if ((unb1Var instanceof jmb1) && tv80Var != null) {
            jmb1 jmb1Var = (jmb1) unb1Var;
            this.b.d(jmb1Var.a.a, nik1.K1.a, tv80Var, new tgm((String) null, false, true, this.c, false, true, false, (yh10) null, false, false, 0, false, false, true, false, k4p1.w(jmb1Var.o), (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -163919, 1));
        }
        return rih1.a;
    }
}
