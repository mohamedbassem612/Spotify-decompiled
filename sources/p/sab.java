package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sab implements u2i1 {
    public static final sab a = new sab();
    public static final List b = p7h.M(new t2i1("internal/bluejay", pbo1.X), new t2i1("internal/bluejay/show-generation-list", qbo1.X), new t2i1("internal/bluejay/update-voice", cxo1.Z), new t2i1("internal/bluejay/connector-apps", o9p1.Z), new t2i1("internal/bluejay/connector-apps/authentication", vap1.Y), new t2i1("internal/bluejay/upload-file", xbp1.Z), new t2i1("internal/bluejay/confirm", wcp1.Y), new t2i1("internal/bluejay/skip-forward", vgp1.Y), new t2i1("internal/personalized-episode-connect-apps", zp8.Z), new t2i1("internal/personalized-episode-voice-picker", uml1.Y));
    public static final List c = p7h.M(kab.d, nab.d, pab.d, mab.d, rab.d, qab.d, lab.d, oab.d, uab.d, vab.d);
    public static final idd1 d = new idd1(cu9.Z);

    @Override // p.u2i1
    public final List a() {
        return c;
    }

    @Override // p.u2i1
    public final List b() {
        return b;
    }

    public final v5b1 c(String str) {
        a3i1 a3i1Var = (a3i1) d.getValue();
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(str);
        if (x6b1VarL == null) {
            return null;
        }
        return a3i1Var.a(x6b1VarL);
    }
}
