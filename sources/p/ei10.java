package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ei10 {
    public final dxy a;
    public final f971 b;
    public final o860 c;

    public ei10(dxy dxyVar, f971 f971Var, o860 o860Var) {
        this.a = dxyVar;
        this.b = f971Var;
        this.c = o860Var;
    }

    public final Observable a(String str, di10 di10Var) {
        String str2 = di10Var.c;
        String str3 = di10Var.a;
        String str4 = di10Var.b;
        igm igmVar = new igm(str3, (str4 == null || ihc1.y0(str4)) ? null : new wfm(Uri.parse(str4), bgm.c), (String) null, 4);
        smc0 smc0VarN = k4p1.n();
        if (di10Var.f) {
            smc0VarN.add(this.a.s(di10Var.d));
        }
        p860 p860Var = di10Var.e;
        if (p860Var != null) {
            smc0VarN.add(this.c.h(p860Var));
        }
        if (str2 != null && (!ihc1.y0(str2))) {
            smc0VarN.add(f971.b(this.b, str2, str));
        }
        return Observable.just(new kjm(igmVar, k4p1.k(smc0VarN), 4));
    }
}
