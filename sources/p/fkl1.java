package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.httpwebgate.WebgateTokenProvider$WebgateTokenException;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fkl1 implements p090 {
    public final gkl1 a;
    public final kly0 b;

    public fkl1(gkl1 gkl1Var, kly0 kly0Var) {
        this.a = gkl1Var;
        this.b = kly0Var;
    }

    public static ry21 b(uf01 uf01Var, ln21 ln21Var, String str, ry21 ry21Var) {
        ry21 ry21VarA;
        ne neVarB = ln21Var.b();
        ((t360) neVarB.c).b("Authorization", "Bearer ".concat(str));
        zx21 zx21VarC = uf01Var.b(new ln21(neVarB)).c();
        if (ry21Var != null) {
            zx21 zx21VarC2 = ry21Var.c();
            zx21VarC2.g = uz21.a;
            ry21VarA = zx21VarC2.a();
        } else {
            ry21VarA = null;
        }
        zx21VarC.k = ry21VarA;
        return zx21VarC.a();
    }

    public final ry21 a(uf01 uf01Var) {
        kly0 kly0Var = this.b;
        ln21 ln21Var = uf01Var.e;
        v360 v360Var = ln21Var.c;
        l370 l370Var = ln21Var.a;
        if (v360Var.c("No-Webgate-Authentication") != null) {
            ne neVarB = ln21Var.b();
            ((t360) neVarB.c).f("No-Webgate-Authentication");
            return uf01Var.b(new ln21(neVarB));
        }
        if (ln21Var.a().j) {
            return uf01Var.b(ln21Var);
        }
        this.a.getClass();
        if (gkl1.a(ln21Var)) {
            tka0 tka0VarB = rc11.a.b(Object.class);
            ((wdg) tka0VarB).n().cast(ln21Var.e.v(tka0VarB));
            String strC = ln21Var.c.c("Authorization");
            if (strC == null || strC.length() == 0) {
                try {
                    String str = null;
                    ry21 ry21VarB = b(uf01Var, ln21Var, ((bz81) kly0Var.get()).a(), null);
                    if (ry21VarB.d == 401) {
                        String strC2 = ry21VarB.f.c("client-token-error");
                        if (strC2 != null) {
                            str = strC2;
                        }
                        if (str == null) {
                            ry21VarB.g.close();
                            return b(uf01Var, ln21Var, ((bz81) kly0Var.get()).b(true), ry21VarB);
                        }
                    }
                    return ry21VarB;
                } catch (WebgateTokenProvider$WebgateTokenException e) {
                    String str2 = "Could not retrieve access token for a webgate request: " + l370Var + " with error: " + e.getMessage();
                    Logger.d("%s: %s %s", str2, ln21Var.b, l370Var);
                    tz21 tz21Var = uz21.a;
                    ArrayList arrayList = new ArrayList(20);
                    se11 se11Var = r8i0.e;
                    return new ry21(ln21Var, bjy0.c, str2, NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS, (ms50) null, new v360((String[]) arrayList.toArray(new String[0])), dm5.D(str2, bmq0.w("plain/text")), (a6a1) null, (ry21) null, (ry21) null, (ry21) null, 0L, 0L, (i25) null, a6g1.u0);
                }
            }
        }
        return uf01Var.b(ln21Var);
    }
}
