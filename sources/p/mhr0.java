package p;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mhr0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Locale c;
    public final /* synthetic */ bcb0 d;
    public final /* synthetic */ iu30 e;

    public /* synthetic */ mhr0(ArrayList arrayList, Locale locale, bcb0 bcb0Var, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = locale;
        this.d = bcb0Var;
        this.e = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String strConcat;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        z50 z50Var = z50.c;
        bcb0 bcb0Var = this.d;
        String str = "";
        ArrayList arrayList = this.b;
        Locale locale = this.c;
        iu30 iu30Var = this.e;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    xab0 xab0Var = (xab0) arrayList.get(iIntValue);
                    x340Var2.i0(651402501);
                    String displayName = Locale.forLanguageTag(xab0Var.a).getDisplayName(locale);
                    if (displayName.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        char cCharAt = displayName.charAt(0);
                        locale.getClass();
                        sb.append((Object) eth.U(cCharAt, locale));
                        sb.append(displayName.substring(1));
                        displayName = sb.toString();
                    }
                    String str2 = xab0Var.d;
                    strConcat = str2 != null ? " ".concat(str2) : null;
                    String str3 = strConcat == null ? "" : strConcat;
                    if (xab0Var.b) {
                        x340Var2.i0(-1918640609);
                        str = " • " + cwl1.o0(x340Var2, 2131957160);
                    } else {
                        x340Var2.i0(651744056);
                    }
                    x340Var2.r(false);
                    String strF = f4i1.f(displayName, str3, str);
                    boolean zJ = u890.j(bcb0Var.b, xab0Var.a);
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.i(xab0Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new lhr0(iu30Var, xab0Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    rzn1.g(strF, gbxVar, uyn1.z(8.0f, 0.0f, 2, nim0Var), zJ, x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    xab0 xab0Var2 = (xab0) arrayList.get(iIntValue3);
                    x340Var4.i0(1730399026);
                    String displayName2 = Locale.forLanguageTag(xab0Var2.a).getDisplayName(locale);
                    if (displayName2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        char cCharAt2 = displayName2.charAt(0);
                        locale.getClass();
                        sb2.append((Object) eth.U(cCharAt2, locale));
                        sb2.append(displayName2.substring(1));
                        displayName2 = sb2.toString();
                    }
                    String str4 = xab0Var2.d;
                    strConcat = str4 != null ? " ".concat(str4) : null;
                    String strConcat2 = displayName2.concat(strConcat != null ? strConcat : "");
                    boolean zJ2 = u890.j(bcb0Var.b, xab0Var2.a);
                    boolean zG2 = x340Var4.g(iu30Var) | x340Var4.i(xab0Var2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new lhr0(iu30Var, xab0Var2, (byte) 1);
                        x340Var4.s0(objT2);
                    }
                    gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    rzn1.g(strConcat2, gbxVar2, uyn1.z(8.0f, 0.0f, 2, nim0Var), zJ2, x340Var4, 0);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
