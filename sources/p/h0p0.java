package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h0p0 implements t9h1 {
    public final y6h1 a;

    public h0p0(String str, String str2) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "now-playing-bar";
        x6h1VarI.f = "8.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = str2;
        this.a = x6h1VarI.a();
    }

    public final w7h1 a(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }
}
