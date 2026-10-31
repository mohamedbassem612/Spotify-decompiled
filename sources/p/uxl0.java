package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uxl0 implements w6h1 {
    public final y6h1 a;
    public final List b;

    public uxl0() {
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-share-disabled-chat-sheet";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        this.a = x6h1VarI.a();
        this.b = p7h.M(new String[]{"chat/share", "share-sheet"});
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = r6h1.c;
        ArrayList arrayList = new ArrayList();
        return c13.m(arrayList, z6x.a, this.a, arrayList, (u8h1) null);
    }
}
