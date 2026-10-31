package p;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f6f0 implements vu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ f6f0(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return Boolean.FALSE;
            case 1:
                ((e6f0) obj2).getClass();
                return rih1Var;
            case 2:
                return Integer.valueOf(((afh0) obj).n(((Integer) obj2).intValue()));
            case 3:
                return Integer.valueOf(((afh0) obj).C(((Integer) obj2).intValue()));
            case 4:
                return Integer.valueOf(((afh0) obj).d(((Integer) obj2).intValue()));
            case 5:
                return Integer.valueOf(((afh0) obj).w(((Integer) obj2).intValue()));
            case 6:
                edt0 edt0Var = (edt0) obj2;
                Boolean boolValueOf = Boolean.valueOf(edt0Var.a);
                df41 df41Var = jf41.a;
                return p7h.H(new Object[]{boolValueOf, jf41.a(new f5x(edt0Var.b), f6o1.b, (id41) obj)});
            case 7:
                return Integer.valueOf(((f5x) obj2).a);
            case 8:
                return Integer.valueOf(((mhc0) obj2).a);
            case 9:
                gbe1 gbe1Var = (gbe1) obj2;
                return p7h.H(new Object[]{jf41.a(new fbe1(gbe1Var.a), f6o1.e, (id41) obj), Boolean.valueOf(gbe1Var.b)});
            case 10:
                return Integer.valueOf(((fbe1) obj2).a);
            case 11:
                return Integer.valueOf(((es41) obj2).a.s());
            case 12:
                return obj == null ? obj2 : obj;
            case 13:
                v161 v161Var = (v161) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                o161 o161Var = ((v161) obj).d;
                d261 d261Var = z161.u;
                Object objG = o161Var.a.g(d261Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = v161Var.d.a.g(d261Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 14:
                return new mmr0(obj, obj2);
            case 15:
                List list = (List) obj2;
                ArrayList arrayListW = wmo1.w(j761.a, list, true);
                arrayListW.getClass();
                return wmo1.o((tka0) obj, arrayListW, new jes(list, (byte) 1));
            case 16:
                List list2 = (List) obj2;
                ArrayList arrayListW2 = wmo1.w(j761.a, list2, true);
                arrayListW2.getClass();
                nma0 nma0VarO = wmo1.o((tka0) obj, arrayListW2, new jes(list2, (byte) 2));
                if (nma0VarO != null) {
                    return m5n1.z(nma0VarO);
                }
                return null;
            case 17:
                return ((vy71) obj2).d();
            case 18:
                return (jad1) ((iad1) obj2).a.g.getValue();
            case 19:
                return Integer.valueOf(((afh0) obj).w(((Integer) obj2).intValue()));
            case 20:
                return Integer.valueOf(((afh0) obj).C(((Integer) obj2).intValue()));
            case 21:
                return Integer.valueOf(((afh0) obj).n(((Integer) obj2).intValue()));
            case 22:
                return Integer.valueOf(((afh0) obj).d(((Integer) obj2).intValue()));
            case 23:
                r6e1 r6e1Var = (r6e1) obj2;
                return p7h.M(new Object[]{Float.valueOf(r6e1Var.a.s()), Boolean.valueOf(((qqq0) r6e1Var.f.getValue()) == qqq0.a)});
            case 24:
                m8n m8nVar = (m8n) obj2;
                if (!(m8nVar instanceof yfe1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? m8nVar : Integer.valueOf(iIntValue + 1);
            case 25:
                yfe1 yfe1Var = (yfe1) obj;
                yfe1 yfe1Var2 = (m8n) obj2;
                if (yfe1Var != null) {
                    return yfe1Var;
                }
                if (yfe1Var2 instanceof yfe1) {
                    return yfe1Var2;
                }
                return null;
            case 26:
                pge1 pge1Var = (pge1) obj;
                yfe1 yfe1Var3 = (m8n) obj2;
                if (yfe1Var3 instanceof yfe1) {
                    yfe1 yfe1Var4 = yfe1Var3;
                    o8n o8nVar = pge1Var.a;
                    Object objG3 = yfe1Var4.G();
                    Object[] objArr = pge1Var.b;
                    int i = pge1Var.d;
                    objArr[i] = objG3;
                    yfe1[] yfe1VarArr = pge1Var.c;
                    pge1Var.d = i + 1;
                    yfe1VarArr[i] = yfe1Var4;
                }
                return pge1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                b8f1 b8f1Var = (b8f1) obj2;
                return p7h.M(new Float[]{Float.valueOf(b8f1Var.a), Float.valueOf(b8f1Var.c.s()), Float.valueOf(b8f1Var.b.s())});
            default:
                y580.S0.invoke(obj);
                return rih1Var;
        }
    }
}
