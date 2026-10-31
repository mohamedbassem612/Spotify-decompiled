package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b1m0 implements n8h1 {
    public final y6h1 a;

    public b1m0(c1m0 c1m0Var, UUID uuid, String str) {
        x6h1 x6h1VarC = c1m0Var.a.c();
        x6h1VarC.i.add(new a7h1("content", uuid.toString(), (Integer) null, (String) null, str));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
