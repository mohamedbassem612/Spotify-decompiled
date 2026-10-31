package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rle extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zwg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rle(zwg zwgVar, byte b) {
        super(1);
        this.a = b;
        this.b = zwgVar;
    }

    public final Object invoke(Object obj) {
        h8k1 h8k1Var;
        byte b = this.a;
        int i = 0;
        zwg zwgVar = this.b;
        switch (b) {
            case 0:
                c380 c380Var = (c380) zwgVar.b;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                int i2 = 0;
                for (Object obj2 : c380Var) {
                    int i3 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    wle wleVar = (wle) obj2;
                    if (wleVar instanceof vle) {
                        vle vleVar = (vle) wleVar;
                        String str = vleVar.a;
                        h8k1Var = new h8k1(new ple(i2, str, vleVar.b), str);
                        i2++;
                    } else {
                        if (!(wleVar instanceof xle)) {
                            eg.o();
                            return null;
                        }
                        h8k1Var = new h8k1(new qle(((xle) wleVar).a, i), f4i1.c(i, "section-heading-"));
                    }
                    arrayList.add(h8k1Var);
                    i = i3;
                }
                return new huz(new hj50(arrayList, (ioj0) null), (byte) 10);
            case 1:
                ple pleVar = (ple) obj;
                return new uv11(pleVar.a, (String) zwgVar.a, (Integer) null, pleVar.b, (cqs0) null, (tv11) null, 0, 244);
            default:
                ji50 ji50Var = (ji50) obj;
                kba kbaVar = (kba) zwgVar.c;
                d0r d0rVar = ji50Var.a;
                yt11 yt11Var = (yt11) zwgVar.d;
                o3r o3rVarO = w3p1.o(new l4r(pwc0.d, 2, mle.c, new j4r(mle.e), mle.d), mle.f);
                maa maaVar = (maa) zwgVar.e;
                zs11 zs11Var = (zs11) kbaVar.b;
                o27 o27Var = new o27(2, 2, (l1d) null);
                ya8 ya8Var = new ya8(maaVar, (byte) 3);
                smc0 smc0VarN = k4p1.n();
                jd11 jd11Var = rc11.a;
                smc0VarN.add(new l4r(new xv00(jd11Var.b(jo70.class)), 2, mle.t, new j4r(mle.g), mle.X));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(hll.class)), 2, mle.Y, new j4r(mle.h), mle.Z));
                xzq xzqVar = new xzq(zs11Var.a(d0rVar, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, ya8Var, (iu30) null, (qrk) null, (iu30) null, (iu30) null, yt11Var, new c9c((byte) 1), 2, o27Var, (gye1) null, npc1.a, (sb2) null, (rru) null, false, o3rVarO, (o3r) null, (o3r) null, (o3r) null, new o3r(k4p1.k(smc0VarN), mle.i, false), (o3r) null, (cv11) null, (y5z) null, (bnw0) null, new bt11(true), 0, (o3r) null, -40001073, 375), (nu11) null), new rle(zwgVar, (byte) 1));
                wnb wnbVar = wnb.d1;
                LinkedHashMap linkedHashMap = ji50Var.b;
                linkedHashMap.put(ple.class, new r3r(xzqVar, wnbVar, 4));
                linkedHashMap.put(qle.class, r4o1.P(mle.N0, w7x.a, wnb.c1, wnb.e1));
                return rih1.a;
        }
    }
}
