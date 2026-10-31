package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z0e extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0e(iu30 iu30Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new pxd((String) obj, i));
                return rih1Var;
            case 1:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 2:
                a9k a9kVar = (a9k) obj;
                r6h1 r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(i));
                String str = a9kVar.a;
                String strO = e9k.o(a9kVar);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-concerts-campaign-card";
                x6h1VarI.f = "2.3.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.e = strO;
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                k7h1 k7h1Var = new k7h1();
                k7h1Var.a = y6h1VarA;
                k7h1Var.b = r6h1Var;
                k7h1Var.c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 3:
                jdk jdkVar = (jdk) obj;
                r6h1 r6h1Var2 = (r6h1) iu30Var.invoke(Integer.valueOf(i));
                Integer numValueOf = Integer.valueOf(i);
                String uri = jdkVar.getUri();
                String strQ = sok.q(jdkVar);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-concert-campaign-promo-card";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.c = numValueOf;
                x6h1VarI2.e = strQ;
                x6h1VarI2.d = uri;
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                k7h1 k7h1Var2 = new k7h1();
                k7h1Var2.a = y6h1VarA2;
                k7h1Var2.b = r6h1Var2;
                k7h1Var2.c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 4:
                Map map = ((kae1) obj).a;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new rkk1(new cae1(i, ((uhc0) entry.getKey()).a), vno1.l(((eic0) entry.getValue()).a)));
                }
                iu30Var.invoke(new kde1(arrayList));
                return rih1Var;
            case 5:
                return Integer.valueOf(u890.q(((Number) iu30Var.invoke(obj)).intValue(), i));
            case 6:
                iu30Var.invoke(Integer.valueOf(yoi1.p((int) ((Number) obj).floatValue(), 1, i)));
                return rih1Var;
            default:
                Map map2 = ((kae1) obj).a;
                ArrayList arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    arrayList2.add(new rkk1(new cae1(i, ((uhc0) entry2.getKey()).a), vno1.l(((eic0) entry2.getValue()).a)));
                }
                iu30Var.invoke(new kde1(arrayList2));
                return rih1Var;
        }
    }
}
