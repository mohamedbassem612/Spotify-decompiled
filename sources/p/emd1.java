package p;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class emd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ omd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emd1(omd1 omd1Var, byte b) {
        super(1);
        this.a = b;
        this.b = omd1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        byte b3 = 2;
        byte b4 = 5;
        omd1 omd1Var = this.b;
        switch (b) {
            case 0:
                Context context = omd1Var.a;
                context.getString(2131952723);
                return context.getString(2131952723);
            case 1:
                fmd1 fmd1Var = new fmd1(omd1Var, b2);
                Set set = wet.e;
                zld1 zld1Var = zld1.N0;
                sld1 sld1Var = sld1.V0;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(cld1.class, r4o1.Q(zld1Var, set, fmd1Var, sld1Var));
                fmd1 fmd1Var2 = new fmd1(omd1Var, b3);
                linkedHashMap.put(dld1.class, r4o1.Q(zld1.P0, f46.S0(new yp21[]{new yp21(v6v0.class), new yp21(r9v0.class)}), fmd1Var2, sld1.W0));
                fmd1 fmd1Var3 = new fmd1(omd1Var, (byte) 3);
                linkedHashMap.put(bld1.class, r4o1.Q(zld1.R0, l1d.u(r9v0.class), fmd1Var3, sld1.X0));
                return rih1Var;
            case 2:
                return omd1Var.a.getString(2131956634);
            case 3:
                hho hhoVar = new hho(omd1Var.h);
                fmd1 fmd1Var4 = new fmd1(omd1Var, (byte) 4);
                zld1 zld1Var2 = zld1.e1;
                imd1 imd1Var = imd1.e;
                LinkedHashMap linkedHashMap2 = ((ji50) obj).b;
                linkedHashMap2.put(ild1.class, new vw21(zld1Var2, b7x.a, new fc3(fmd1Var4, (byte) 5), imd1Var, (vu30) null));
                lmd1 lmd1Var = new lmd1(omd1Var, hhoVar, (byte) 0);
                linkedHashMap2.put(hld1.class, r4o1.Q(kmd1.c, rk11.b(2), lmd1Var, imd1.f));
                return rih1Var;
            case 4:
                return omd1Var.a.getString(2131958899);
            default:
                hho hhoVar2 = new hho(omd1Var.h);
                fmd1 fmd1Var5 = new fmd1(omd1Var, b4);
                kmd1 kmd1Var = kmd1.d;
                imd1 imd1Var2 = imd1.h;
                LinkedHashMap linkedHashMap3 = ((ji50) obj).b;
                linkedHashMap3.put(kld1.class, new vw21(kmd1Var, b7x.a, new fc3(fmd1Var5, (byte) 5), imd1Var2, (vu30) null));
                lmd1 lmd1Var2 = new lmd1(omd1Var, hhoVar2, b2);
                linkedHashMap3.put(lld1.class, r4o1.Q(kmd1.f, rk11.b(2), lmd1Var2, imd1.i));
                imd1 imd1Var3 = imd1.g;
                kmd1 kmd1Var2 = kmd1.h;
                imd1 imd1Var4 = imd1.t;
                w7x w7xVar = w7x.a;
                linkedHashMap3.put(gld1.class, r4o1.Q(kmd1Var2, w7xVar, imd1Var3, imd1Var4));
                linkedHashMap3.put(jld1.class, r4o1.Q(kmd1.t, w7xVar, new fmd1(omd1Var, (byte) 6), imd1.X));
                return rih1Var;
        }
    }
}
