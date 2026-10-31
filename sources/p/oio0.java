package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oio0 {
    public final ynb0 a;

    public oio0(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final void a(String str) {
        i8h1 i8h1Var = (i8h1) this.a.get();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-contribution-notes-sharing-reminder-bottom-sheet";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "playlist");
        x6h1VarR.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:share-sheet")), x6h1VarR.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
