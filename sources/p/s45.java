package p;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s45 implements zle1 {
    public final pjm0 a;
    public final Function0 b;
    public volatile ooe1 c;
    public final idd1 d;
    public final ConcurrentHashMap e;

    public s45() {
        pjm0 pjm0Var = new pjm0(new h94());
        ou1 ou1Var = ou1.a1;
        this.a = pjm0Var;
        this.b = ou1Var;
        this.d = new idd1(new k25(this, (byte) 25));
        this.e = new ConcurrentHashMap(50);
    }

    public final t45 a(String str) {
        return new t45(str, this.a);
    }

    public final void b(pne1 pne1Var) {
        c921.y((c9n) this.d.getValue(), (o8n) null, 0, new k2(this, pne1Var, (lnm) null, (byte) 27), 3);
    }
}
