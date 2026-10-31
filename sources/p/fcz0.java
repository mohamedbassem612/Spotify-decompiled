package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fcz0 {
    public final kt91 a;
    public final g5p0 b;
    public final pdl0 c;
    public final i8h1 d;
    public final er91 e;

    public fcz0(kt91 kt91Var, g5p0 g5p0Var, pdl0 pdl0Var, i8h1 i8h1Var) {
        this.a = kt91Var;
        this.b = g5p0Var;
        this.c = pdl0Var;
        this.d = i8h1Var;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960797});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960797});
        this.e = new er91((fs91) null, "", 2131960797, (String) null, 2131960784, d37.Y, (cvr) null, (xq91) null, false);
    }

    public final void a(int i) {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        kt91 kt91Var = this.a;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }
}
