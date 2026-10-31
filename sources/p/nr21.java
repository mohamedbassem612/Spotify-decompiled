package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nr21 {
    public static final List d = p7h.M(new sxk0[]{sxk0.MEET_RESERVED, sxk0.CHOOSE_SHOW, sxk0.DEDICATED_WINDOW, sxk0.SHARE_EXCITEMENT});
    public final i8h1 a;
    public final jpk0 b = new jpk0(new txk0((byte) 0));
    public boolean c;

    public nr21(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final tv80 a(int i, boolean z) {
        w7h1 w7h1Var;
        if (this.c) {
            return null;
        }
        this.c = true;
        y6h1 y6h1Var = b(i).b;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("system_back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        } else {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
        return this.a.m(w7h1Var, (xj61) null);
    }

    public final sqk0 b(int i) {
        return new sqk0(this.b, (sxk0) d.get(i), Integer.valueOf(i));
    }
}
