package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mh71 implements xpw {
    public final nw2 a;
    public final sm71 b;
    public final uq7 c;

    public mh71(nw2 nw2Var, sm71 sm71Var, aqq aqqVar, mar0 mar0Var) {
        this.a = nw2Var;
        this.b = sm71Var;
        pug pugVar = (pug) aqqVar.a.c;
        m021 m021Var = new m021(pugVar.s(), (ol71) ((jly0) pugVar.k).get(), (byte) 6);
        dzp0 dzp0Var = ((qqq) ((jly0) pugVar.n).get()).a;
        v6a0 v6a0Var = new v6a0(new ke71((smc0) dzp0Var.b, (smc0) dzp0Var.c, (byte) 1), (ol71) ((jly0) pugVar.k).get(), (byte) 27);
        fj71 fj71Var = (fj71) pugVar.u;
        kly0 kly0Var = fj71Var.u;
        uu00 uu00Var = (uu00) kly0Var.get();
        c8o.l(uu00Var);
        q8n q8nVarB = fj71Var.b();
        c8o.l(q8nVarB);
        tz01 tz01Var = new tz01(new qa00(uu00Var, q8nVarB), (byte) 18);
        uu00 uu00Var2 = (uu00) kly0Var.get();
        c8o.l(uu00Var2);
        q8n q8nVarB2 = fj71Var.b();
        c8o.l(q8nVarB2);
        j2e0 j2e0Var = new j2e0(new o3e0(tz01Var, new nn61(new le71(uu00Var2, q8nVarB2), new q3c(), pugVar.q()), pugVar.s(), (byte) 2), (ol71) ((jly0) pugVar.k).get(), (byte) 1);
        g871 g871VarQ = pugVar.q();
        kjz kjzVar = (kjz) ((jly0) pugVar.o).get();
        Context contextA = fj71Var.a();
        c8o.l(contextA);
        lc20 lc20Var = new lc20(g871VarQ, kjzVar, contextA, (byte) 23);
        bqq bqqVar = (bqq) ((jly0) pugVar.q).get();
        ki20 ki20Var = new ki20((wh71) ((jly0) pugVar.d).get());
        g971 g971Var = (g971) fj71Var.n.get();
        c8o.l(g971Var);
        m771 m771VarV = uge0.v(pugVar.i());
        twb twbVar = new twb((byte) 24);
        yfu yfuVarF = pugVar.f();
        RetrofitMaker retrofitMakerC = fj71Var.c();
        c8o.l(retrofitMakerC);
        pugVar.h();
        rjs0 rjs0Var = new rjs0(g971Var, m771VarV, twbVar, new ptf1(new cfd((dhf) retrofitMakerC.createWebgateService(dhf.class, "android-share-chatpreviews-core-wiring"), new zwa(yfuVarF, new pob((byte) 16, false)), (byte) 12), pugVar.q(), (byte) 21), pugVar.t(), pugVar.a().d(), pugVar.a().k(), pugVar.a().l());
        bb01 bb01Var = new bb01(pugVar.q(), (byte) 24);
        j810 j810Var = (j810) fj71Var.x.get();
        c8o.l(j810Var);
        this.c = new uq7(new cg71(m021Var, v6a0Var, j2e0Var, lc20Var, bqqVar, ki20Var, rjs0Var, bb01Var, new z8c0(j810Var, (byte) 26), new dr41((ol71) ((jly0) pugVar.r).get(), (byte) 22), new khc((byte) 1)), (ug71) ((jly0) pugVar.b).get(), (ol71) ((jly0) pugVar.r).get(), mar0Var);
    }

    public final rqw a() {
        return this.a;
    }

    public final jsw c() {
        return this.b;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
