package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class h8x0 extends tv30 implements zu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8x0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        List list;
        List list2;
        mq70 mq70Var;
        List list3;
        up70 up70Var;
        byte b = this.a;
        String str = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                tsu0 tsu0Var = (tsu0) obj;
                obx0 obx0Var = (obx0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                tqw tqwVar = (tqw) obj4;
                i8x0 i8x0Var = (i8x0) ((lyc) this).receiver;
                i8x0Var.getClass();
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                if (tsu0Var.equals(tsu0.b)) {
                    i8x0Var.R0.invoke(obx0Var, Integer.valueOf(iIntValue));
                } else if (tsu0Var.equals(tsu0.c)) {
                    i8x0Var.S0.invoke(obx0Var, Integer.valueOf(iIntValue), tv80VarY);
                } else {
                    if (!tsu0Var.equals(tsu0.a)) {
                        eg.o();
                        return null;
                    }
                    i8x0Var.U0.invoke(obx0Var, Integer.valueOf(iIntValue), tv80VarY);
                }
                return rih1Var;
            case 1:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 2:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 3:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 4:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 5:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 6:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 7:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 8:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            case 9:
                ((i8x0) ((lyc) this).receiver).B((zis0) obj, (obx0) obj2, ((Number) obj3).intValue(), (tqw) obj4);
                return rih1Var;
            default:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                hll hllVar = (hll) obj3;
                qtt0 qtt0Var = (qtt0) obj4;
                ((ky01) ((lyc) this).receiver).getClass();
                String str2 = jo70Var.a;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (list3 = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list3)) != null) {
                    str = up70Var.a.a;
                }
                String str3 = str;
                qtt0 qtt0Var2 = qtt0.h;
                boolean z = qtt0Var == qtt0Var2;
                boolean z2 = qtt0Var == null || qtt0Var == qtt0.b;
                boolean zContains = (hllVar == null || (list2 = hllVar.b) == null) ? false : list2.contains(ell.b);
                boolean zContains2 = (hllVar == null || (list = hllVar.b) == null) ? false : list.contains(ell.d);
                boolean z3 = qtt0Var == qtt0.d || qtt0Var == qtt0.e || qtt0Var == qtt0Var2;
                List list4 = jo70Var.d;
                ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ho70) it.next()).a);
                }
                return new hy01(str2, str3, z, z2, zContains, zContains2, z3, arrayList);
        }
    }
}
