package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xd2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd2(ven0 ven0Var) {
        super(2);
        this.a = (byte) 9;
        j2i j2iVar = vji.a;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object usuVar;
        cwj0 cwj0Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((vu30) ven0Var.getValue()).invoke((String) obj, (tv80) obj2);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (u890.j((dzx0) ven0Var.getValue(), azx0.a)) {
                    x340Var2.i0(-1883018996);
                    xto1.e(uyn1.x(u291.r(nim0Var, 22.0f), 2.0f), 0, 0L, 0L, x340Var2, 0, 14);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1756035575);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    znx znxVar = ((Boolean) ven0Var.getValue()).booleanValue() ? znx.c : nrx.c;
                    jsl jslVar = new jsl(((Boolean) ven0Var.getValue()).booleanValue() ? x0d.k(x340Var4, 2095852728, 2131956552, x340Var4, false) : x0d.k(x340Var4, 2095934072, 2131962433, x340Var4, false));
                    qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                    boolean zI = x340Var4.i(ven0Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new bp9(ven0Var, (byte) 3);
                        x340Var4.s0(objT);
                    }
                    w0h1.a(znxVar, jslVar, bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 0L, 0L, false, x340Var4, 8, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ven0Var.setValue(new mmr0((xse) obj, (tv80) obj2));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e((String) ven0Var.getValue(), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var6, 1572864, 0, 1726);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ((vu30) ven0Var.getValue()).invoke(x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                int iIntValue5 = ((Number) obj).intValue();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ven0Var.setValue(sqg0.P((Map) ven0Var.getValue(), new mmr0(Integer.valueOf(iIntValue5), bool)));
                return rih1Var;
            case 7:
                Offset offset = (Offset) obj2;
                long j = offset.a;
                ((hav0) obj).a();
                ((iu30) ven0Var.getValue()).invoke(offset);
                return rih1Var;
            case 8:
                p0v p0vVar = (p0v) obj;
                iu30 iu30Var = (iu30) ven0Var.getValue();
                int iOrdinal = ((q0v) obj2).ordinal();
                if (iOrdinal == 0) {
                    usuVar = new usu(p0vVar);
                } else if (iOrdinal == 1) {
                    usuVar = new qsu(p0vVar);
                } else if (iOrdinal == 2) {
                    usuVar = new xsu(p0vVar);
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    usuVar = new tsu(p0vVar);
                }
                iu30Var.invoke(usuVar);
                return rih1Var;
            case 9:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var10.b0();
                } else if (((pfu) ven0Var.getValue()) == null) {
                    x340Var10.i0(132254447);
                    dv20.l(0, vji.a, x340Var10, false);
                } else {
                    x340Var10.i0(132290004);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 10:
                Offset offset2 = (Offset) obj2;
                long j2 = offset2.a;
                ((hav0) obj).a();
                ((iu30) ven0Var.getValue()).invoke(offset2);
                return rih1Var;
            case 11:
                ven0Var.setValue(new z5o0((h0r0) obj, (c7r0) obj2));
                return rih1Var;
            case 12:
                ((vu30) ven0Var.getValue()).invoke((iys0) obj, (tv80) obj2);
                return rih1Var;
            case 13:
                ((iu30) ven0Var.getValue()).invoke(new w8g0((String) obj, (ox3) obj2));
                return rih1Var;
            case 14:
                ((iu30) ven0Var.getValue()).invoke(new tgg0((String) obj, ((Boolean) obj2).booleanValue()));
                return rih1Var;
            case 15:
                tv80 tv80Var = (tv80) obj2;
                iu30 iu30Var2 = (iu30) ven0Var.getValue();
                int iOrdinal2 = ((naj0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    cwj0Var = gwj0.a;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    cwj0Var = new cwj0(tv80Var);
                }
                iu30Var2.invoke(cwj0Var);
                return rih1Var;
            case 16:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    aux auxVar = ((Boolean) ven0Var.getValue()).booleanValue() ? aux.c : ztx.c;
                    qim0 qim0VarQ = i1p1.q(u291.r(nim0Var, 64.0f), er31.a);
                    uwr uwrVar = cbx.a;
                    w0h1.a(auxVar, isl.a, uyn1.x(dug.f(qim0VarQ, cbx.a(x340Var12).a.c, d4o1.a), 16.0f), 0L, 0L, false, x340Var12, 56, 56);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    w0h1.a(((Boolean) ven0Var.getValue()).booleanValue() ? ilx.c : amx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var14, 56, 60);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x3p1.g((String) ven0Var.getValue(), x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 19:
                return anm1.N("share.sheet.share.preview.sections.card", u291.v(nim0Var, ((p3v) ((btd) ven0Var.getValue()).a.get(((Number) obj2).intValue())).a));
            case 20:
                ((vu30) ven0Var.getValue()).invoke((String) obj, (tv80) obj2);
                return rih1Var;
            case 21:
                int iIntValue10 = ((Number) obj).intValue();
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                ArrayList arrayList = new ArrayList((List) ven0Var.getValue());
                arrayList.set(iIntValue10, bool2);
                ven0Var.setValue(arrayList);
                return rih1Var;
            case 22:
                String str = (String) obj;
                nag1 nag1Var = new nag1(str, ((Number) obj2).intValue());
                nag1 nag1Var2 = str.length() > 0 ? nag1Var : null;
                if (nag1Var2 == null) {
                    nag1Var2 = ((lcg1) ven0Var.getValue()).b;
                }
                ven0Var.setValue(new lcg1(nag1Var, nag1Var2));
                return rih1Var;
            default:
                ven0Var.setValue(new l6m(((Number) obj).intValue(), ((Number) obj2).intValue()));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd2(ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = ven0Var;
    }
}
