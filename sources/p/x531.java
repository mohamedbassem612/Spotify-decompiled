package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x531 implements acr0 {
    public final Set a = Collections.singleton(vyk1.f);

    public final Class b() {
        return r531.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        a3i1 a3i1Var = (a3i1) tyk1.d.getValue();
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(dataString);
        String str = null;
        v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
        vyk1 vyk1Var = v5b1VarA instanceof vyk1 ? (vyk1) v5b1VarA : null;
        if (vyk1Var == null) {
            hhg1.f(l1d.m("Routed to voting results with a URI it cannot parse: ", intent.getDataString()));
            return null;
        }
        String str2 = vyk1Var.a;
        String str3 = vyk1Var.b;
        String stringExtra = intent.getStringExtra("voting-playlist-uri");
        if (stringExtra != null && !ihc1.y0(stringExtra)) {
            str = stringExtra;
        }
        return new v531(dataString, str2, str3, str);
    }

    public final e6w0 d() {
        return new c6w0(1, false, (hd5) null, 14);
    }

    public final Set e() {
        return this.a;
    }

    public final String getDescription() {
        return "Voting Results";
    }

    public final boolean isEnabled() {
        return true;
    }
}
