package p;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class grk0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public grk0(String str, UUID uuid) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-allboarding-contentpicker";
        x6h1VarI.f = "15.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = uuid.toString();
        x6h1VarI.e = str;
        x6h1VarI.d = "spotify:allboarding";
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("allboarding/contentpicker");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
