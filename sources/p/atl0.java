package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class atl0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public atl0(String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-quiz-sources-sheet";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("quiz/question-sources");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
