package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dpk {
    public final uu00 a;
    public final llm b;
    public final kdn0 c;
    public final kdn0 d;

    public dpk(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = smo1.e(q8nVar);
        kdn0 kdn0Var = new kdn0();
        this.c = kdn0Var;
        this.d = kdn0Var;
    }

    public final kdn0 a(String str, ArrayList arrayList) {
        l4p1.u(this.b, new sr0(yoi1.g(this.a.b(new oi("concert-gallery", true, new cpk(arrayList, str)))), arrayList, str, this, (byte) 7));
        return this.d;
    }
}
