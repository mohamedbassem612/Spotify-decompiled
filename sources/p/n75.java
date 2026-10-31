package p;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class n75 implements vu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ n75(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        kch kchVar;
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                dm5.b0((hmb0) obj).setDensity((wat) obj2);
                return rih1Var;
            case 1:
                dm5.b0((hmb0) obj).setLifecycleOwner((iac0) obj2);
                return rih1Var;
            case 2:
                dm5.b0((hmb0) obj).setSavedStateRegistryOwner((qe41) obj2);
                return rih1Var;
            case 3:
                fbk1 fbk1VarB0 = dm5.b0((hmb0) obj);
                int iOrdinal = ((flb0) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                fbk1VarB0.setLayoutDirection(i);
                return rih1Var;
            case 4:
                dm5.b0((hmb0) obj).setResetBlock((iu30) obj2);
                return rih1Var;
            case 5:
                dm5.b0((hmb0) obj).setUpdateBlock((iu30) obj2);
                return rih1Var;
            case 6:
                dm5.b0((hmb0) obj).setReleaseBlock((iu30) obj2);
                return rih1Var;
            case 7:
                dm5.b0((hmb0) obj).setUpdateBlock((iu30) obj2);
                return rih1Var;
            case 8:
                dm5.b0((hmb0) obj).setReleaseBlock((iu30) obj2);
                return rih1Var;
            case 9:
                dm5.b0((hmb0) obj).setModifier((qim0) obj2);
                return rih1Var;
            case 10:
                String str = (String) obj;
                m8n m8nVar = (m8n) obj2;
                if (str.length() == 0) {
                    return m8nVar.toString();
                }
                return str + ", " + m8nVar;
            case 11:
                StringBuilder sb = (StringBuilder) obj;
                oim0 oim0Var = (oim0) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(oim0Var);
                return sb;
            case 12:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (!x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x340Var16.b0();
                }
                return rih1Var;
            case 20:
                o8n o8nVar = (m8n) obj2;
                o8n o8nVarC = ((o8n) obj).C(o8nVar.getKey());
                o8n o8nVar2 = o6x.a;
                if (o8nVarC == o8nVar2) {
                    return o8nVar;
                }
                wdu0 wdu0Var = wdu0.Y;
                q8n q8nVarA = o8nVarC.A(wdu0Var);
                if (q8nVarA == null) {
                    kchVar = new kch(o8nVar, o8nVarC);
                } else {
                    o8n o8nVarC2 = o8nVarC.C(wdu0Var);
                    if (o8nVarC2 == o8nVar2) {
                        return new kch(q8nVarA, o8nVar);
                    }
                    kchVar = new kch(q8nVarA, new kch(o8nVar, o8nVarC2));
                }
                return kchVar;
            case 21:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((m8n) obj2) instanceof l4n));
            case 22:
                o8n o8nVar3 = (o8n) obj;
                l4n l4nVar = (m8n) obj2;
                if (!(l4nVar instanceof l4n)) {
                    return o8nVar3.y((o8n) l4nVar);
                }
                l4nVar.m();
                return o8nVar3.y((o8n) null);
            case 23:
                return (o8v) ((hrr0) ((n8v) obj2).a.e).getValue();
            case 24:
                return Boolean.valueOf(u890.j(obj, obj2));
            case 25:
                return ((pi30) obj2).a;
            case 26:
                ((Integer) obj2).intValue();
                return new bg50(blo1.c(1));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                upb0 upb0Var = (upb0) obj2;
                return p7h.M(new Integer[]{Integer.valueOf(((err0) upb0Var.d.c).s()), Integer.valueOf(((err0) upb0Var.d.d).s())});
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Map mapE = ((hub0) obj2).e();
                if (mapE.isEmpty()) {
                    return null;
                }
                return mapE;
            default:
                uu0 uu0Var = ((fvb0) obj2).c;
                return p7h.M(new int[][]{(int[]) uu0Var.c, (int[]) uu0Var.e});
        }
    }
}
