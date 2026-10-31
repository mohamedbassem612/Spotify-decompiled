package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j1m0 implements w6h1, p8h1 {
    public final r6h1 a;
    public final y6h1 b;
    public final List c;

    public j1m0(Integer num, String str, r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-song-dna-track-row";
        x6h1VarI.f = "8.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = num;
        x6h1VarI.d = str;
        this.b = x6h1VarI.a();
        this.c = p7h.M(new String[]{"song-dna", "artists-dna", "song-dna-contributor", "song-dna/search"});
    }

    public final w7h1 a(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.b, this.a, System.currentTimeMillis());
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var2 = this.a;
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.b);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.b;
        ((xjn) k7h1Var).b = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = this.c;
        return k7h1Var.a();
    }
}
