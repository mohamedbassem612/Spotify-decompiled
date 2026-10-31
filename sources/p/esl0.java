package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class esl0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public esl0() {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-queue-upsell";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("nowplaying/queue");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
