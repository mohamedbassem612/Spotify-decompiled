package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hs71 {
    public final add a;
    public final q3q b;

    public hs71(add addVar, q3q q3qVar) {
        this.a = addVar;
        this.b = q3qVar;
    }

    public final gs71 a(lzy lzyVar) {
        qf4 qf4Var = this.a.a;
        if (!qf4Var.h() || !qf4Var.d0()) {
            return null;
        }
        q3q q3qVar = this.b;
        switch (q3qVar.a) {
            case 0:
                thq thqVar = q3qVar.b;
                v5q v5qVar = thqVar.c;
                lzn0 lzn0Var = (lzn0) v5qVar.U0.get();
                gw70 gw70Var = (gw70) thqVar.b.d8.get();
                daq daqVar = v5qVar.b;
                return new gs71(lzn0Var, gw70Var, new fs71(new dc31(yx61.a((RetrofitMaker) daqVar.Y3.get()), (xm41) daqVar.l5.get(), (byte) 27), (xm41) daqVar.l5.get(), (q8n) daqVar.r2.get()), new cs71((q8n) v5qVar.b.V2.get(), (lzn0) v5qVar.U0.get()), (r3q) v5qVar.N9.get(), lzyVar);
            default:
                r7q r7qVar = q3qVar.b;
                teq teqVar = r7qVar.d;
                lzn0 lzn0Var2 = (lzn0) teqVar.i.get();
                gw70 gw70Var2 = (gw70) r7qVar.b.d8.get();
                daq daqVar2 = teqVar.d;
                return new gs71(lzn0Var2, gw70Var2, new fs71(new dc31(yx61.a((RetrofitMaker) daqVar2.Y3.get()), (xm41) daqVar2.l5.get(), (byte) 27), (xm41) daqVar2.l5.get(), (q8n) daqVar2.r2.get()), new cs71((q8n) teqVar.d.V2.get(), (lzn0) teqVar.i.get()), (r3q) teqVar.T6.get(), lzyVar);
        }
    }
}
