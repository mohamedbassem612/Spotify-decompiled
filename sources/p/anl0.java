package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class anl0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public anl0(int i, String str) {
        String str2;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-playlist-entity-load-failure";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str2 = "forbidden";
        } else if (i == 2) {
            str2 = "lookup";
        } else if (i == 3) {
            str2 = "not_found";
        } else if (i == 4) {
            str2 = "other";
        } else {
            if (i != 5) {
                throw null;
            }
            str2 = "unavailable_for_legal_reasons";
        }
        x6h1VarI.e = str2;
        x6h1VarI.d = str;
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("playlist/notloaded");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
