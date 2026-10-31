package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qux0 implements c931, sck1 {
    public final kdn0 a = new kdn0(l3r.c);
    public final rck1 b = new rck1();
    public final MobiusLoopViewModel c;

    public qux0(String str, String str2, String str3, String str4, boolean z, xkq xkqVar) {
        eux0 eux0Var = new eux0(cux0.c, "", (str == null || str.length() == 0 || str3 != null) ? false : true, wtx0.c, new dux0(), false, null, null, z6x.a, null, str, null, str2, false, null, null, false, null, str3 != null ? new stx0(str3, str4) : rtx0.a, z, 8279968);
        ezo ezoVar = (ezo) xkqVar.a.c;
        hce1 hce1Var = new hce1(o(), new qtx0(eux0Var, (kkq) ezoVar.E.get(), new acl(ezoVar.d(), (byte) 6)), n9p1.s(this));
        tka0 tka0VarB = rc11.a.b(xbk1.class);
        String strO = tka0VarB.o();
        if (strO != null) {
            this.c = hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        } else {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final void clear() {
        this.b.a();
    }

    public final ymd0 getState() {
        return this.a;
    }

    public final rck1 o() {
        return this.b;
    }

    public final void start() {
    }

    public final void stop() {
    }

    public final void c(Bundle bundle) {
    }
}
