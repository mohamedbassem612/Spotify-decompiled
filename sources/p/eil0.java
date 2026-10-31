package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eil0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;
    public final List c;

    public eil0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-now-playing-view-video-first";
        x6h1VarI.f = "19.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = "standard";
        this.b = x6h1VarI.a();
        this.c = Collections.singletonList("nowplaying");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var2 = this.a;
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.b);
        return new r6h1(arrayList, r6h1Var2.b);
    }
}
