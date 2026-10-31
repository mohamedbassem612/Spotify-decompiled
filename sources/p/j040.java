package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j040 implements xpw {
    public final q8n a;
    public final kdy0 b;
    public final e7m0 c;
    public final ia00 d;
    public final psw e;

    public j040(cir0 cir0Var, vip vipVar, wip wipVar, q8n q8nVar) {
        this.a = q8nVar;
        q8n q8nVar2 = (q8n) ((e140) ((k42) wipVar.a.c).c).a.get();
        c8o.l(q8nVar2);
        kdy0 kdy0Var = new kdy0(q8nVar2, cir0Var);
        this.b = kdy0Var;
        g040 g040Var = new g040(ez30.d, "", "", gz30.d, kz30.d, false, "", false);
        drm1 drm1Var = new drm1((byte) 19);
        k42 k42Var = (k42) vipVar.a.c;
        RetrofitMaker retrofitMaker = (RetrofitMaker) ((e140) k42Var.c).d.get();
        c8o.l(retrofitMaker);
        kba kbaVar = new kba((lce) retrofitMaker.createWebgateService(lce.class, "android-musicquiz-network-challenge"), (byte) 12);
        kt91 kt91Var = (kt91) ((e140) k42Var.c).i.get();
        c8o.l(kt91Var);
        e140 e140Var = (e140) k42Var.c;
        xh71 xh71Var = (xh71) e140Var.h.get();
        c8o.l(xh71Var);
        lzn0 lzn0Var = (lzn0) e140Var.f.get();
        c8o.l(lzn0Var);
        v5n v5nVar = (v5n) e140Var.e.get();
        c8o.l(v5nVar);
        q8n q8nVar3 = (q8n) e140Var.c.get();
        c8o.l(q8nVar3);
        q8n q8nVar4 = (q8n) e140Var.a.get();
        c8o.l(q8nVar4);
        u040 u040Var = new u040(kbaVar, kt91Var, xh71Var, lzn0Var, v5nVar, q8nVar3, q8nVar4, kdy0Var);
        this.c = sbl.B(g040Var, drm1Var, u040Var.h, bp30.Y, new i040(this));
        this.d = n3o1.q(this).a(rc30.b1, rc30.c1);
        j2i j2iVar = bqi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
