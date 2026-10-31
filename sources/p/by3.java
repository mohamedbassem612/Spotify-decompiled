package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class by3 {
    public final lzn0 a;
    public final q8n b;

    public by3(q8n q8nVar, lzn0 lzn0Var) {
        this.a = lzn0Var;
        this.b = q8nVar;
    }

    public final Object a(String str, tv80 tv80Var, onm onmVar) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        blc0 blc0Var = s4b1VarX.c;
        blc0 blc0Var2 = blc0.fh;
        String strF = blc0Var == blc0Var2 ? f4i1.f("spotify:internal:allowlisting:request:audiobook:", s4b1VarX.h(), "") : nik1.Z5.a;
        Bundle bundle = new Bundle();
        if (blc0Var != blc0Var2) {
            bundle.putString("com.spotify.genalphablocking.childallowlistingrequest.bottomsheetpage.EXTRA_ITEM_URI", str);
        }
        Object objY = fn31.Y(this.b, new sr1(tv80Var, this, strF, bundle, (lnm) null, (byte) 1), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
