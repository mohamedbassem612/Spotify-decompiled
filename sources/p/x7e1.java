package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x7e1 implements cf41 {
    public static final x7e1 b = new x7e1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ x7e1(byte b2) {
        this.a = b2;
    }

    public final Object a(Object obj) {
        byte b2 = this.a;
        x7e1 x7e1Var = vee1.i;
        switch (b2) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                Object obj4 = list.get(2);
                Object obj5 = list.get(3);
                String str = (String) obj2;
                long jE = e6p1.e(((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                obj5.getClass();
                List list2 = (List) obj5;
                Object obj6 = list2.get(0);
                Object obj7 = list2.get(1);
                vee1 vee1Var = obj6 != null ? (vee1) x7e1Var.a(obj6) : null;
                obj7.getClass();
                return new y7e1(str, jE, new esa1(vee1Var, (ghh1) uee1.a.a(obj7)));
            case 1:
                hrr0 hrr0VarQ = v8r.q((Object) null);
                jy2 parcelable = ((Bundle) obj).getParcelable("agentsBottomSheetModel");
                if (parcelable != null) {
                    hrr0VarQ.setValue(new jy2(parcelable.a, parcelable.b, new my2(hrr0VarQ, (byte) 0)));
                }
                return hrr0VarQ;
            case 2:
                List list3 = (List) obj;
                int iIntValue = ((Integer) list3.get(0)).intValue();
                int iIntValue2 = ((Integer) list3.get(1)).intValue();
                int iIntValue3 = ((Integer) list3.get(2)).intValue();
                smc0 smc0VarN = k4p1.n();
                int i = 3;
                while (i < iIntValue2 + 3) {
                    smc0VarN.add(x7e1Var.a(list3.get(i)));
                    i++;
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                smc0 smc0VarN2 = k4p1.n();
                while (i < iIntValue2 + iIntValue3 + 3) {
                    smc0VarN2.add(x7e1Var.a(list3.get(i)));
                    i++;
                }
                return new ghh1(iIntValue, smc0VarK, k4p1.k(smc0VarN2));
            default:
                List list4 = (List) obj;
                return new vee1(((Integer) list4.get(0)).intValue(), (String) list4.get(1), (String) list4.get(2), e6p1.e(((Integer) list4.get(3)).intValue(), ((Integer) list4.get(4)).intValue()), e6p1.e(((Integer) list4.get(5)).intValue(), ((Integer) list4.get(6)).intValue()), ((Long) list4.get(7)).longValue(), false, 64);
        }
    }

    public final Object b(id41 id41Var, Object obj) {
        List listM = null;
        switch (this.a) {
            case 0:
                y7e1 y7e1Var = (y7e1) obj;
                String string = y7e1Var.d().d.toString();
                long j = y7e1Var.d().e;
                int i = nbe1.c;
                Integer numValueOf = Integer.valueOf((int) (j >> 32));
                Integer numValueOf2 = Integer.valueOf((int) (y7e1Var.d().e & 4294967295L));
                esa1 esa1Var = y7e1Var.a;
                vee1 vee1Var = (vee1) ((hrr0) esa1Var.c).getValue();
                if (vee1Var != null) {
                    Integer numValueOf3 = Integer.valueOf(vee1Var.a);
                    String str = vee1Var.b;
                    String str2 = vee1Var.c;
                    long j2 = vee1Var.d;
                    int i2 = nbe1.c;
                    Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
                    Integer numValueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
                    long j3 = vee1Var.e;
                    listM = p7h.M(new Object[]{numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(vee1Var.f)});
                }
                return p7h.M(new Object[]{string, numValueOf, numValueOf2, p7h.M(new Object[]{listM, uee1.a.b(id41Var, (ghh1) esa1Var.b)})});
            case 1:
                Parcelable parcelable = (jy2) ((ven0) obj).getValue();
                if (parcelable == null) {
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("agentsBottomSheetModel", parcelable);
                return bundle;
            case 2:
                ghh1 ghh1Var = (ghh1) obj;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(Integer.valueOf(ghh1Var.a));
                bw91 bw91Var = ghh1Var.b;
                smc0VarN.add(Integer.valueOf(bw91Var.size()));
                bw91 bw91Var2 = ghh1Var.c;
                smc0VarN.add(Integer.valueOf(bw91Var2.size()));
                int size = bw91Var.size();
                int i3 = 0;
                while (true) {
                    x7e1 x7e1Var = vee1.i;
                    if (i3 >= size) {
                        int size2 = bw91Var2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            smc0VarN.add(x7e1Var.b(id41Var, bw91Var2.get(i4)));
                        }
                        return k4p1.k(smc0VarN);
                    }
                    smc0VarN.add(x7e1Var.b(id41Var, bw91Var.get(i3)));
                    i3++;
                }
                break;
            default:
                vee1 vee1Var2 = (vee1) obj;
                Integer numValueOf6 = Integer.valueOf(vee1Var2.a);
                String str3 = vee1Var2.b;
                String str4 = vee1Var2.c;
                long j4 = vee1Var2.d;
                int i5 = nbe1.c;
                Integer numValueOf7 = Integer.valueOf((int) (j4 >> 32));
                Integer numValueOf8 = Integer.valueOf((int) (j4 & 4294967295L));
                long j5 = vee1Var2.e;
                return p7h.M(new Object[]{numValueOf6, str3, str4, numValueOf7, numValueOf8, Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Long.valueOf(vee1Var2.f)});
        }
    }
}
