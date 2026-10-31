package p;

import android.app.Activity;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c8b {
    public final zwg a;

    public c8b(zwg zwgVar) {
        this.a = zwgVar;
    }

    public final void a(String str, boolean z) {
        int iOrdinal = new y6b1(str, false).c.ordinal();
        if (iOrdinal != 2 && iOrdinal != 6 && iOrdinal != 8) {
            hhg1.n("Unsupported uri: ".concat(str));
            return;
        }
        zwg zwgVar = this.a;
        it8 it8Var = (it8) zwgVar.b;
        mp8 mp8Var = (mp8) zwgVar.e;
        nw40 nw40Var = (nw40) it8Var.c;
        Activity activity = (Activity) it8Var.b;
        mw40 mw40VarT = yoi1.T(nw40Var.a, activity.getString(2131956194), activity.getString(2131956192));
        String string = activity.getString(2131956193);
        p6u p6uVar = new p6u(z, mp8Var);
        mw40VarT.a = string;
        mw40VarT.c = p6uVar;
        mw40VarT.e = true;
        mw40VarT.f = new o8b(z, mp8Var);
        mw40VarT.b().b();
        i8h1 i8h1VarM = ((n8b) ((z2p) ((y2p) zwgVar.c).a.b).b).m();
        c8o.l(i8h1VarM);
        zwgVar.d = new q59(str, i8h1VarM);
        q59 q59VarS = zwgVar.s();
        ((i8h1) q59VarS.b).f(((rrk0) q59VarS.c).e(), (Set) null);
    }
}
