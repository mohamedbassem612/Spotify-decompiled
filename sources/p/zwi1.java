package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.Mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwi1 extends hab0 implements vu30 {
    public final /* synthetic */ axi1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwi1(axi1 axi1Var) {
        super(2);
        this.a = axi1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        axi1 axi1Var = this.a;
        xwi1 xwi1Var = axi1Var.d;
        y1t0 y1t0Var = axi1Var.h;
        wwi1 wwi1Var = new wwi1();
        goq goqVar = (goq) xwi1Var.a.a.c;
        q8n q8nVar = (q8n) ((cxi1) goqVar.g).k.get();
        c8o.l(q8nVar);
        cxi1 cxi1Var = (cxi1) goqVar.g;
        lzn0 lzn0Var = (lzn0) cxi1Var.e.get();
        c8o.l(lzn0Var);
        RetrofitMaker retrofitMaker = (RetrofitMaker) cxi1Var.c.get();
        c8o.l(retrofitMaker);
        utw0 utw0Var = new utw0((tyi1) retrofitMaker.createWebgateService(tyi1.class, "android-liveevents-datasource"));
        fod0 fod0Var = (fod0) cxi1Var.f.get();
        c8o.l(fod0Var);
        return Mobius.d(wwi1Var, new iwi1(q8nVar, lzn0Var, utw0Var, new f2g1(fod0Var, (byte) 7), y1t0Var));
    }
}
