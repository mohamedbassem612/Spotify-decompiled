package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhq implements lr01 {
    public final /* synthetic */ thq a;

    public uhq(thq thqVar) {
        this.a = thqVar;
    }

    public final vr01 a(String str) {
        thq thqVar = this.a;
        daq daqVar = thqVar.b;
        Flowable flowable = (Flowable) daqVar.D5.get();
        teq teqVar = thqVar.c;
        xrc0 xrc0Var = (xrc0) teqVar.e1.get();
        ziq ziqVar = teqVar.a;
        daq daqVar2 = ziqVar.a;
        ftr ftrVar = (ftr) daqVar2.Kp.get();
        Context context = (Context) daqVar2.x1.a;
        zwm1 zwm1Var = (zwm1) daqVar2.pa.get();
        agc0 agc0Var = (agc0) daqVar2.B7.get();
        daq daqVar3 = ziqVar.a;
        s880 s880Var = new s880(ftrVar, context, new iw01(zwm1Var, agc0Var, new bx5((Context) daqVar3.x1.a), (Context) daqVar2.x1.a), new iw01((zwm1) daqVar2.pa.get(), new bx5((Context) daqVar3.x1.a), (Context) daqVar2.x1.a, (agc0) daqVar2.B7.get()), new bb01(new i3h((Context) daqVar2.x1.a, (ltm1) daqVar2.V7.get(), (agc0) daqVar2.B7.get()), (byte) 1), (agc0) daqVar2.B7.get(), new cua((byte) 22), new vh4((luk) daqVar3.L1.get()));
        xrc0 xrc0Var2 = (xrc0) ziqVar.b.e1.get();
        daq daqVar4 = ziqVar.a;
        phi0 phi0Var = new phi0(xrc0Var2, (q8n) daqVar4.E1.get(), (xr01) ziqVar.lc.get(), (t2j0) daqVar4.f2.get());
        iyc0 iyc0Var = (iyc0) teqVar.g1.get();
        bf3 bf3Var = new bf3((yqg) ziqVar.a.J1.get());
        q8n q8nVar = (q8n) daqVar.E1.get();
        daq daqVar5 = ziqVar.a;
        poj0 poj0Var = new poj0((uu00) daqVar5.a5.get(), (q8n) daqVar5.E1.get(), (xr01) ziqVar.lc.get(), (t2j0) daqVar5.f2.get(), (byte) 25);
        ziqVar.getClass();
        bn70 bn70VarJ = q901.j();
        daq daqVar6 = ziqVar.a;
        dxy dxyVar = new dxy(bn70VarJ, (q8n) daqVar6.E1.get(), (kv01) ziqVar.mc.get(), (yix0) ziqVar.b.Y2.get(), (xr01) ziqVar.lc.get(), (t2j0) daqVar6.f2.get(), (byte) 19);
        daq daqVar7 = ziqVar.a;
        kdy0 kdy0Var = new kdy0((q8n) daqVar7.E1.get(), new xaz0(new c9c((byte) 24), new ko71((uu00) daqVar7.a5.get()), new twa()), (xr01) ziqVar.lc.get(), (t2j0) daqVar7.f2.get(), (byte) 15);
        yiq yiqVar = teqVar.b;
        daq daqVar8 = yiqVar.a;
        yt91 yt91Var = new yt91((uu00) daqVar8.a5.get(), (q8n) daqVar8.E1.get(), (t2j0) daqVar8.f2.get(), (byte) 15);
        daq daqVar9 = yiqVar.a;
        l0x0 l0x0Var = new l0x0((opm) daqVar9.Dp.get(), (t2j0) daqVar9.f2.get(), (xr01) yiqVar.b.a.lc.get(), (byte) 23);
        daq daqVar10 = yiqVar.a;
        return new vr01(flowable, xrc0Var, s880Var, phi0Var, iyc0Var, bf3Var, q8nVar, poj0Var, dxyVar, kdy0Var, yt91Var, l0x0Var, new cik1(q901.B((RetrofitMaker) daqVar10.Y3.get()), (q8n) daqVar10.E1.get(), (xr01) yiqVar.b.a.lc.get(), (t2j0) daqVar10.f2.get(), (byte) 9), (hgd0) daqVar.Xd.get(), (Flowable) daqVar.z2.get(), (zle1) daqVar.a3.get(), str, new vh4((luk) ziqVar.a.L1.get()), (t2j0) daqVar.f2.get());
    }
}
