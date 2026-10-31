package p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b92 extends ypa0 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b92(Class cls, byte b) {
        super(cls);
        this.b = b;
    }

    public final Object a(u8 u8Var) {
        switch (this.b) {
            case 0:
                y82 y82Var = (y82) u8Var;
                return new xmw0(new dzp0(y82Var.n().i()), y82Var.o().n());
            case 1:
                g92 g92Var = (g92) u8Var;
                ypa0[] ypa0VarArr = {new b92(o980.class, (byte) 2)};
                HashMap map = new HashMap();
                for (ypa0 ypa0Var : ypa0VarArr) {
                    boolean zContainsKey = map.containsKey(ypa0Var.a);
                    Class cls = ypa0Var.a;
                    if (zContainsKey) {
                        hhg1.n(cy30.k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, ypa0Var);
                }
                if (ypa0VarArr.length > 0) {
                    Class cls2 = ypa0VarArr[0].a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                l92 l92VarN = g92Var.n();
                ypa0 ypa0Var2 = (ypa0) mapUnmodifiableMap.get(o980.class);
                if (ypa0Var2 != null) {
                    o980 o980Var = (o980) ypa0Var2.a(l92VarN);
                    ypa0[] ypa0VarArr2 = {new xl60(iuf0.class)};
                    HashMap map2 = new HashMap();
                    for (ypa0 ypa0Var3 : ypa0VarArr2) {
                        boolean zContainsKey2 = map2.containsKey(ypa0Var3.a);
                        Class cls3 = ypa0Var3.a;
                        if (zContainsKey2) {
                            hhg1.n(cy30.k(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        } else {
                            map2.put(cls3, ypa0Var3);
                        }
                    }
                    if (ypa0VarArr2.length > 0) {
                        Class cls4 = ypa0VarArr2[0].a;
                    }
                    Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                    vl60 vl60VarO = g92Var.o();
                    ypa0 ypa0Var4 = (ypa0) mapUnmodifiableMap2.get(iuf0.class);
                    if (ypa0Var4 != null) {
                        return new bzx(o980Var, (iuf0) ypa0Var4.a(vl60VarO), g92Var.o().p().o());
                    }
                    mna0.e("Requested primitive class ", iuf0.class.getCanonicalName(), " not supported.");
                } else {
                    mna0.e("Requested primitive class ", o980.class.getCanonicalName(), " not supported.");
                }
                return null;
            case 2:
                l92 l92Var = (l92) u8Var;
                return new j92(l92Var.n().i(), l92Var.o().n());
            case 3:
                q92 q92Var = (q92) u8Var;
                return new o92(q92Var.n().i(), q92Var.o().n());
            case 4:
                return new t92(((v92) u8Var).m().i());
            case 5:
                return new y92(((aa2) u8Var).n().i());
            case 6:
                return new ca2(((ea2) u8Var).m().i());
            case 7:
                return new obe((byte) 0, ((qbe) u8Var).n().i());
            case 8:
                String strN = ((f4b0) u8Var).n().n();
                return h4b0.a(strN).b(strN);
            case 9:
                k4b0 k4b0Var = (k4b0) u8Var;
                String strO = k4b0Var.n().o();
                return new i4b0(k4b0Var.n().n(), h4b0.a(strO).b(strO));
            default:
                return new obe((byte) 1, ((akm1) u8Var).n().i());
        }
    }
}
