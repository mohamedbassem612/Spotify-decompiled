package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qf1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ qf1(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                return ((w4i1) list.get(((Number) obj).intValue())).a;
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return String.valueOf(((h6q0) list.get(((Number) obj).intValue())).b().a);
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                return String.valueOf(((h6q0) list.get(((Number) obj).intValue())).b().a);
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                return ((pt1) list.get(((Number) obj).intValue())) instanceof ot1 ? coc0.a : coc0.b;
            case 9:
                iy2 iy2Var = (iy2) list.get(((Number) obj).intValue());
                String str = iy2Var.c;
                if (str != null) {
                    return str;
                }
                String str2 = iy2Var.b;
                return str2 == null ? iy2Var.a : str2;
            case 10:
                list.get(((Number) obj).intValue());
                return null;
            case 11:
                int iIntValue = ((Number) obj).intValue();
                return p83.a1.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case 12:
                list.get(((Number) obj).intValue());
                return null;
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                return ((kb6) list.get(((Number) obj).intValue())).a;
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                return ((t77) list.get(((Number) obj).intValue())).getKey();
            case 17:
                t77 t77Var = (t77) list.get(((Number) obj).intValue());
                return rc11.a.b(t77Var instanceof r77 ? l77.class : t77Var.getClass());
            case 18:
                int iIntValue2 = ((Number) obj).intValue();
                return tj8.t.invoke(Integer.valueOf(iIntValue2), list.get(iIntValue2));
            case 19:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                int iIntValue3 = ((Number) obj).intValue();
                return tj8.X.invoke(Integer.valueOf(iIntValue3), list.get(iIntValue3));
            case 21:
                list.get(((Number) obj).intValue());
                return null;
            case 22:
                int iIntValue4 = ((Number) obj).intValue();
                return tj8.Y.invoke(Integer.valueOf(iIntValue4), list.get(iIntValue4));
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case 24:
                return ((yq9) list.get(((Number) obj).intValue())).a;
            case 25:
                list.get(((Number) obj).intValue());
                return null;
            case 26:
                m0d m0dVar = (m0d) list.get(((Number) obj).intValue());
                return xcg1.i(m0dVar.a, ":", m0dVar.b);
            case 27:
                list.get(((Number) obj).intValue());
                return null;
            case 28:
                return Integer.valueOf(((x5d) list.get(((Number) obj).intValue())).a);
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
