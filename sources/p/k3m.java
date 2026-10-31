package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k3m implements xpw {
    public final d0r a;
    public final cx0 b;
    public final nu c;
    public final u4p d;
    public final nu e;
    public final cx0 f;
    public final idd1 g = new idd1(new j3m(this, (byte) 0));
    public final e7m0 h;
    public final ia00 i;
    public final psw t;

    public k3m(d0r d0rVar, String str, q8n q8nVar, q8n q8nVar2, xwb xwbVar, t4p t4pVar, cx0 cx0Var, nu nuVar, u4p u4pVar, nu nuVar2, cx0 cx0Var2) {
        this.a = d0rVar;
        this.b = cx0Var;
        this.c = nuVar;
        this.d = u4pVar;
        this.e = nuVar2;
        this.f = cx0Var2;
        wj3 wj3Var = (wj3) t4pVar.a.c;
        q8n q8nVarE = ((t1m) wj3Var.d).e();
        c8o.l(q8nVarE);
        q8n q8nVarG = ((t1m) wj3Var.d).g();
        c8o.l(q8nVarG);
        t1m t1mVar = (t1m) wj3Var.d;
        RetrofitMaker retrofitMakerN = t1mVar.n();
        c8o.l(retrofitMakerN);
        rd51 rd51Var = (rd51) retrofitMakerN.createWebgateService(rd51.class, "android-search-onlineproto");
        rd51 rd51Var2 = (rd51) ((jly0) wj3Var.g).get();
        n851 n851Var = new n851(new uy41(), new a0b((byte) 11), new lqc((byte) 10));
        hc51 hc51VarT0 = t1mVar.T0();
        c8o.l(hc51VarT0);
        luk lukVarK = t1mVar.k();
        c8o.l(lukVarK);
        vi11 vi11Var = new vi11(rd51Var, rd51Var2, n851Var, hc51VarT0, new di4(lukVarK), (byte) 8);
        t5h1 t5h1Var = (t5h1) ((jly0) wj3Var.h).get();
        String strM = upn1.m();
        yqg yqgVarA = t1mVar.a();
        c8o.l(yqgVarA);
        g931 g931Var = new g931(vi11Var, new g931(t5h1Var, strM, yqgVarA, (byte) 20), new yla((byte) 24), (tcy) ((jly0) wj3Var.i).get(), (byte) 21);
        xrc0 xrc0VarL = t1mVar.l();
        c8o.l(xrc0VarL);
        iyc0 iyc0VarX = t1mVar.x();
        c8o.l(iyc0VarX);
        new t2b((byte) 22);
        tcy tcyVar = (tcy) ((jly0) wj3Var.i).get();
        zle1 zle1VarR0 = t1mVar.R0();
        c8o.l(zle1VarR0);
        q1m q1mVar = new q1m(zle1VarR0, (byte) 0);
        c9n c9nVar = (c9n) ((jly0) wj3Var.t).get();
        g2z g2zVar = new g2z();
        g2zVar.a = xrc0VarL;
        g2zVar.b = iyc0VarX;
        g2zVar.c = tcyVar;
        g2zVar.d = q1mVar;
        g2zVar.e = c9nVar;
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.v();
        PlaylistItemDecorationPolicy playlistItemDecorationPolicyBuild = iou0VarV.build();
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        hru0VarS.u(playlistItemDecorationPolicyBuild);
        g2zVar.f = hru0VarS.build();
        Single singleP0 = t1mVar.P0();
        c8o.l(singleP0);
        nfa0 nfa0VarA0 = t1mVar.A0();
        c8o.l(nfa0VarA0);
        i3m i3mVar = new i3m(q8nVarE, q8nVarG, g931Var, g2zVar, new tn01(singleP0, nfa0VarA0, (tcy) ((jly0) wj3Var.i).get()), (tcy) ((jly0) wj3Var.i).get(), xwbVar);
        fg91 fg91Var = fg91.b;
        this.h = sbl.B(new s2m(str, "", fg91Var, fg91Var, fg91Var, fg91Var, k620.a, false, true, null), t2m.b, i3mVar, yzj.e1, new o0d(q8nVar, q8nVar2, str, (byte) 26));
        this.i = n3o1.q(this).a(ngl.O0, ngl.P0);
        j2i j2iVar = new j2i(1673432787, new rxg(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
