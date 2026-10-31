package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wgb implements io20 {
    public final kly0 a;

    public static sqk0 a() {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-your-library-folder-page";
        x6h1VarI.f = "3.0.1";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = null;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("playlist/folder");
        r6h1 r6h1Var = r6h1.c;
        return new sqk0(new c4m0(new r6h1(kk0.l(y6h1VarA), (u8h1) null), (byte) 3));
    }

    public Object b() {
        return Integer.valueOf(((dhb) this.a.get()).z());
    }

    public void c() {
        i8h1 i8h1Var = (i8h1) this.a.get();
        sqk0 sqk0VarA = a();
        x6h1 x6h1VarC = sqk0VarA.b.c();
        x6h1VarC.i.add(new a7h1("cancel_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, sqk0VarA.c.b, System.currentTimeMillis()), (xj61) null);
    }
}
