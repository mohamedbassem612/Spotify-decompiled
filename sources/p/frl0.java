package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class frl0 implements w6h1, p8h1 {
    public final r6h1 a;
    public final y6h1 b;

    public frl0(int i, r6h1 r6h1Var) {
        String str;
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-prompt-playlist-refresh";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "generate";
        } else if (i == 2) {
            str = "generate_banner";
        } else if (i == 3) {
            str = "refresh";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "retry";
        }
        x6h1VarI.b = str;
        this.b = x6h1VarI.a();
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
        return k7h1Var.a();
    }

    public final w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), this.b, this.a, System.currentTimeMillis());
    }
}
