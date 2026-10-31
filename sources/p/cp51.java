package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cp51 {
    public final Context a;
    public final lzn0 b;
    public final ynb0 c;
    public final zuw0 d;
    public final xok0 e;
    public final h5p f;

    public cp51(Context context, lzn0 lzn0Var, ynb0 ynb0Var, zuw0 zuw0Var, xok0 xok0Var, h5p h5pVar) {
        this.a = context;
        this.b = lzn0Var;
        this.c = ynb0Var;
        this.d = zuw0Var;
        this.e = xok0Var;
        this.f = h5pVar;
    }

    public final inf a(String str, String str2, boolean z) {
        String string;
        xok0 xok0Var = this.e;
        ttk0 ttk0Var = new ttk0(xok0Var, (byte) 5);
        Context context = this.a;
        String string2 = context.getString(2131953747);
        if (z) {
            string = context.getString(2131953746);
        } else {
            string = context.getString(2131953745, str2 == null ? "" : str2);
        }
        String str3 = string;
        str3.getClass();
        return this.f.a(string2, str3, new phi0(str, sl01.c, this.d.c(), (bfd) this.c.get()), new vmf(context.getString(2131953741), context.getString(2131953739), context.getString(2131953740), context.getString(2131953738), new mn41(this, (byte) 18)), new yjq(new ttk0(xok0Var, (byte) 6), new bp51(ttk0Var, (byte) 0), new bp51(ttk0Var, (byte) 1), new bp51(ttk0Var, (byte) 2), pro1.t("chatFeatureSeenReceipts"), (byte) 13));
    }
}
