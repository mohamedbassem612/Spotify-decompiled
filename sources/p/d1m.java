package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d1m implements xpw {
    public final cx0 a;
    public final ujo b;
    public final e7m0 c;
    public final ia00 d;
    public final psw e;

    public d1m(xwb xwbVar, l8p l8pVar, cx0 cx0Var, d0r d0rVar, add addVar, m8p m8pVar) {
        this.a = cx0Var;
        this.b = addVar.h() ? m8pVar.a(d0rVar) : null;
        a680 a680Var = (a680) l8pVar.a.c;
        j1m j1mVar = (j1m) a680Var.a;
        q8n q8nVar = (q8n) ((j1m) a680Var.a).c.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) j1mVar.d.get();
        c8o.l(q8nVar2);
        RetrofitMaker retrofitMaker = (RetrofitMaker) j1mVar.a.get();
        c8o.l(retrofitMaker);
        this.c = sbl.B(new w0m("", fg91.b, true, false, false, true), n4.E, new c1m(xwbVar, q8nVar, q8nVar2, (cs40) retrofitMaker.createWebgateService(cs40.class, "android-campfire-chat-content-picker-page-gifs")), yzj.c1, vll.b1);
        this.d = n3o1.q(this).a(ngl.Z, ngl.N0);
        j2i j2iVar = new j2i(93017791, new rxg(this, (byte) 26), true);
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
