package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sb7 {
    public final lzn0 a;
    public final a1r0 b;

    public sb7(lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = lzn0Var;
        this.b = a1r0Var;
    }

    public final void a(String str, tv80 tv80Var) {
        String strConcat = "spotify:assisted-curation?context=".concat(str);
        dwn0 dwn0Var = new dwn0(strConcat, "", false, false, 0, 0, false, null, null, new bwn0(tv80Var));
        Bundle bundle = new Bundle();
        bundle.putParcelable("AssistedCurationPageRouteParameters", new vb7(strConcat, str, qb7.a));
        this.a.i(dwn0Var, bundle);
    }

    public final void b(String str, tv80 tv80Var) {
        String strConcat = "spotify:assisted-curation?context=".concat(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("AssistedCurationPageRouteParameters", new vb7(strConcat, str, qb7.a));
        this.b.k(strConcat, tv80Var, bundle, true);
    }
}
