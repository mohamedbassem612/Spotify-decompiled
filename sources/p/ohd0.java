package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ohd0 {
    public final Context a;
    public final lzn0 b;
    public final u9c0 c;
    public final jed0 d;
    public final zwz0 e;
    public final xok0 f;
    public final h5p g;
    public final vcd0 h;

    public ohd0(Context context, lzn0 lzn0Var, u9c0 u9c0Var, jed0 jed0Var, zwz0 zwz0Var, xok0 xok0Var, h5p h5pVar, vcd0 vcd0Var) {
        this.a = context;
        this.b = lzn0Var;
        this.c = u9c0Var;
        this.d = jed0Var;
        this.e = zwz0Var;
        this.f = xok0Var;
        this.g = h5pVar;
        this.h = vcd0Var;
    }

    public final inf a(String str, String str2) {
        xok0 xok0Var = this.f;
        ttk0 ttk0Var = new ttk0(xok0Var, (byte) 2);
        String strT = pro1.t("listeningActivity");
        String str3 = str == null ? "" : str;
        Context context = this.a;
        return this.g.a(context.getString(2131953730, str3), context.getString(2131953727, str == null ? "" : str), new ur00(this.c, this.e.c(), str2 == null ? "" : str2, new lmf(this.d.b(), (byte) 4), this.h), new vmf(context.getString(2131953726), context.getString(2131953725), context.getString(2131953740), context.getString(2131953738), new j2d0(this, strT, (byte) 4)), new yjq(new ttk0(xok0Var, (byte) 6), new nhd0(ttk0Var, (byte) 0), new nhd0(ttk0Var, (byte) 1), new nhd0(ttk0Var, (byte) 2), strT, (byte) 13));
    }
}
