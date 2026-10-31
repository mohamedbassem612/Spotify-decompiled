package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gfj1 implements d5t0 {
    public final nxp a;
    public final vtm0 b;
    public final q7r0 c;

    public gfj1(nxp nxpVar, vtm0 vtm0Var, q7r0 q7r0Var) {
        this.a = nxpVar;
        this.b = vtm0Var;
        this.c = q7r0Var;
    }

    public final void a(d0r d0rVar, ji50 ji50Var, sjq0 sjq0Var) {
        ttm0 ttm0VarE = cwl1.E(this.c);
        zau0 zau0VarC = ttm0VarE.c(true);
        ttm0VarE.a(zau0VarC);
        b6j1 b6j1Var = new b6j1(zau0VarC, (byte) 2);
        a9l1 a9l1Var = new a9l1();
        lzn0 lzn0Var = (lzn0) ((y4t0) ((h72) this.a.a.c).b).f.get();
        c8o.l(lzn0Var);
        qfv qfvVarM0 = fdg1.m0(new hw2(lzn0Var, d0rVar, b6j1Var, a9l1Var, this.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        wzq wzqVar = new wzq(qfvVarM0, l6j1.V0);
        wzq wzqVar2 = new wzq(qfvVarM0, l6j1.U0);
        zhi1 zhi1Var = zhi1.T0;
        LinkedHashMap linkedHashMap = ji50Var.b;
        linkedHashMap.put(u4t0.class, new r3r(wzqVar, zhi1Var, (vu30) null));
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) sjq0Var.b;
        linkedHashMap2.put(u4t0.class, wzqVar);
        sjq0Var.c = d0rVar;
        linkedHashMap.put(t4t0.class, new r3r(wzqVar2, zhi1.U0, (vu30) null));
        linkedHashMap2.put(t4t0.class, wzqVar2);
        sjq0Var.c = d0rVar;
    }
}
