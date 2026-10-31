package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c7s {
    public final zxl a;
    public final kt91 b;
    public final String c;

    public c7s(zxl zxlVar, kt91 kt91Var, Context context) {
        this.a = zxlVar;
        this.b = kt91Var;
        this.c = context.getString(2131962635);
    }

    public final void a(String str, Function0 function0) {
        lgy lgyVarP = k4k.p(2131962619);
        lgyVarP.a(this.c);
        lgyVarP.j(new kw6(function0, this, str, (byte) 4));
        this.b.k(lgyVarP.c());
    }
}
