package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ktv {
    public final lzn0 a;

    public ktv(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public static /* synthetic */ void b(ktv ktvVar, String str, tv80 tv80Var, Set set, g3d0 g3d0Var, int i) {
        if ((i & 4) != 0) {
            set = w7x.a;
        }
        ktvVar.a(str, tv80Var, set, jbr.a, g3d0Var);
    }

    public static String c(String str) {
        Set set = s4b1.f;
        String strZ = uic.x("spotify:internal:playlist-edit-items:".concat(uic.x(str).h())).z();
        if (strZ != null) {
            return strZ;
        }
        hhg1.n("Failed to create target URI for playlist edit items page");
        return null;
    }

    public static String d(String str) {
        Set set = s4b1.f;
        String strZ = uic.x("spotify:internal:playlist-edit-metadata:".concat(uic.x(str).h())).z();
        if (strZ != null) {
            return strZ;
        }
        hhg1.n("Failed to create target URI for playlist edit metadata page");
        return null;
    }

    public final void a(String str, tv80 tv80Var, Set set, lbr lbrVar, g3d0 g3d0Var) {
        String strC = c(str);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("filters", new ArrayList<>(set));
        bundle.putParcelable("deep_link", lbrVar);
        bundle.putParcelable("list-sort-order", g3d0Var);
        this.a.a(strC, tv80Var, bundle);
    }
}
