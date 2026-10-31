package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ewd0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gwd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ewd0(gwd0 gwd0Var, byte b) {
        super(4);
        this.a = b;
        this.b = gwd0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        lb50 lb50Var;
        Object obj5;
        byte b = this.a;
        boolean z = false;
        byte b2 = 1;
        gwd0 gwd0Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                g0e0 g0e0Var = (g0e0) obj;
                qim0 qim0Var = (qim0) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    fqp fqpVar = (fqp) gwd0Var.i.a.c;
                    lzn0 lzn0Var = (lzn0) fqpVar.e.get();
                    twd0 twd0Var = fqpVar.a;
                    z710 z710Var = (z710) twd0Var.j.get();
                    c8o.l(z710Var);
                    blp blpVar = fqpVar.h;
                    ffq ffqVar = (ffq) twd0Var.u.get();
                    c8o.l(ffqVar);
                    blp blpVar2 = fqpVar.d;
                    gw70 gw70VarB = twd0Var.b();
                    c8o.l(gw70VarB);
                    v5n v5nVar = (v5n) twd0Var.y.get();
                    c8o.l(v5nVar);
                    mr20 mr20Var = (mr20) twd0Var.z.get();
                    c8o.l(mr20Var);
                    kre kreVar = new kre(lzn0Var, z710Var, blpVar, ffqVar, blpVar2, gw70VarB, new oql(mr20Var, v5nVar, (byte) 17));
                    x340Var.s0(kreVar);
                    objT = kreVar;
                }
                otw.c((kre) objT, new wre(g0e0Var.a, g0e0Var.b, g0e0Var.e, g0e0Var.c, g0e0Var.d), qim0Var, (ipb1) null, x340Var, (iIntValue << 3) & 896, 8);
                break;
            case 1:
                p0e0 p0e0Var = (p0e0) obj;
                qim0 qim0Var2 = (qim0) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                String str2 = p0e0Var.a;
                x340 x340Var2 = (b0k) obj3;
                Object objT2 = x340Var2.T();
                if (objT2 == fkj0.X) {
                    fqp fqpVar2 = (fqp) gwd0Var.j.a.c;
                    twd0 twd0Var2 = fqpVar2.a;
                    Context contextA = twd0Var2.a();
                    c8o.l(contextA);
                    RetrofitMaker retrofitMakerC = twd0Var2.c();
                    c8o.l(retrofitMakerC);
                    ilh1 ilh1Var = new ilh1((qvk1) retrofitMakerC.createWebgateService(qvk1.class, "android-liveroom-voting-card"), new xyk1(contextA), (byte) 17);
                    str = str2;
                    blp blpVar3 = fqpVar2.g;
                    blp blpVar4 = fqpVar2.e;
                    blp blpVar5 = fqpVar2.f;
                    q8n q8nVarX = brt.x();
                    Context contextA2 = fqpVar2.a.a();
                    c8o.l(contextA2);
                    tuk1 tuk1Var = new tuk1(str, ilh1Var, blpVar3, blpVar4, blpVar5, q8nVarX, contextA2);
                    x340Var2.s0(tuk1Var);
                    objT2 = tuk1Var;
                } else {
                    str = str2;
                }
                otw.c((tuk1) objT2, new dvk1(p0e0Var.d, str, p0e0Var.b, p0e0Var.c), qim0Var2, (ipb1) null, x340Var2, (iIntValue2 << 3) & 896, 8);
                break;
            case 2:
                rwd0 rwd0Var = (rwd0) obj;
                int iIntValue3 = ((Number) obj4).intValue();
                rzd0 rzd0Var = gwd0Var.f;
                lb50 lb50Var2 = new lb50(rzd0Var, (iu30) obj2, rwd0Var, (byte) 23);
                yqg yqgVar = gwd0Var.e;
                x340 x340Var3 = (b0k) obj3;
                boolean zI = x340Var3.i(rzd0Var);
                Object objT3 = x340Var3.T();
                if (zI || objT3 == fkj0.X) {
                    lb50Var = lb50Var2;
                    lbc0 lbc0Var = new lbc0(1, rzd0Var, rzd0.class, "logPartyStateImpression", "logPartyStateImpression(Lcom/spotify/liveroom/livestreampagefragment/domain/PartyState;)V", 0, (byte) 8);
                    x340Var3.s0(lbc0Var);
                    objT3 = lbc0Var;
                } else {
                    lb50Var = lb50Var2;
                }
                e0e0.a(rwd0Var, lb50Var, yqgVar, (iu30) objT3, apo.r(-516462844, new ewd0(gwd0Var, z ? 1 : 0), x340Var3), apo.r(1331412950, new ewd0(gwd0Var, b2), x340Var3), null, apo.r(1237970, new wh(gwd0Var, lb50Var, (byte) 18), x340Var3), x340Var3, (iIntValue3 & 14) | 12804096);
                break;
            default:
                swd0 swd0Var = (swd0) obj;
                x340 x340Var4 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var4.g(swd0Var) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (!x340Var5.Y(1 & iIntValue4, (iIntValue4 & 131) != 130)) {
                    x340Var5.b0();
                } else {
                    qwd0 qwd0Var = swd0Var instanceof qwd0 ? (qwd0) swd0Var : null;
                    if (qwd0Var != null) {
                        boolean zG = x340Var5.g(qwd0Var) | x340Var5.i(gwd0Var);
                        Object objT4 = x340Var5.T();
                        if (zG || objT4 == fkj0.X) {
                            obj5 = objT4;
                            e9c0 e9c0Var = new e9c0(qwd0Var, gwd0Var, (lnm) null, (byte) 11);
                            x340Var5.s0(e9c0Var);
                            obj5 = e9c0Var;
                        }
                        obj5 = objT4;
                        qxd0.t(rih1Var, x340Var5, (vu30) obj5);
                    }
                }
                break;
        }
        return rih1Var;
    }
}
