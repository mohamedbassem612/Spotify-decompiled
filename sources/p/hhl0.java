package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hhl0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ g5l0 b;

    public hhl0(g5l0 g5l0Var, String str) {
        this.b = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("captions_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final w7h1 e() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("disable_subtitles", 1, b7xVar), this.a, this.b.b, System.currentTimeMillis());
    }

    public final w7h1 h(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("enable_subtitles", 1, Collections.singletonMap("code", str)), this.a, this.b.b, System.currentTimeMillis());
    }
}
