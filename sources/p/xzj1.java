package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xzj1 {
    public final f1n0 a;

    public xzj1(f1n0 f1n0Var) {
        this.a = f1n0Var;
    }

    public final Object a(String str, tv80 tv80Var, onm onmVar) {
        String strH;
        String str2;
        boolean zY0 = ihc1.y0(str);
        rih1 rih1Var = rih1.a;
        if (zY0) {
            n57.e("showVideoSelectionSheet called with blank listUri");
            return rih1Var;
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        blc0 blc0Var = s4b1VarX.c;
        if (blc0Var == blc0.g1) {
            strH = s4b1VarX.h();
            str2 = "spotify:internal:album:";
        } else {
            if (!uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
                n57.e("showVideoSelectionSheet called with unsupported link type: " + blc0Var);
                return rih1Var;
            }
            strH = s4b1VarX.h();
            str2 = "spotify:internal:playlist:";
        }
        dwn0 dwn0Var = new dwn0(f4i1.f(str2, strH, ":video-download-selection"), "", false, false, 0, 0, false, null, null, tv80Var != null ? new bwn0(tv80Var) : null);
        b0k1 b0k1Var = new b0k1(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("video_selection_sheet_page_parameters", b0k1Var);
        Object objC = this.a.c(dwn0Var, bundle, onmVar);
        return objC == d9n.a ? objC : rih1Var;
    }
}
