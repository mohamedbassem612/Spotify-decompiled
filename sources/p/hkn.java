package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hkn implements zu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public hkn(ArrayList arrayList, d0r d0rVar, fod0 fod0Var, k7p k7pVar, q7p q7pVar, cfp cfpVar, afp afpVar, u9u0 u9u0Var) {
        this.b = arrayList;
        this.c = d0rVar;
        this.d = fod0Var;
        this.e = k7pVar;
        this.f = q7pVar;
        this.g = cfpVar;
        this.h = afpVar;
        this.i = u9u0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        List list = this.b;
        Object obj9 = this.i;
        Object obj10 = this.g;
        Object obj11 = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
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
                    h6q0 h6q0Var = (h6q0) list.get(iIntValue);
                    x340Var2.i0(2063691484);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = c13.l(h6q0Var.c, x340Var2);
                    }
                    ven0 ven0Var = (ven0) objT;
                    fq7.b((nbh) obj7, ((Boolean) ven0Var.getValue()).booleanValue(), (qim0) null, (bby) null, xay.f(2, irn1.o0(100, 0, null, 6)).a(xay.l(14, irn1.o0(0, 0, null, 7))), (String) null, apo.r(-1994012334, new ni1((gv51) obj10, h6q0Var, (zkn) obj11, ((c380) obj8).size() + ((List) ((ven0) obj6).getValue()).size() + 1 + iIntValue, (iu30) obj9, (ven0) obj5, ven0Var, (byte) 1), x340Var2), x340Var2, 1597440, 22);
                    x340Var2.r(false);
                }
                break;
            case 1:
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
                    ke00 ke00Var = (ke00) ((ArrayList) list).get(iIntValue3);
                    x340Var4.i0(-1177537050);
                    h4o1.b(ke00Var, (d0r) obj8, (fod0) obj7, (k7p) obj6, (q7p) obj5, (cfp) obj10, (afp) obj11, (u9u0) obj9, x340Var4, 0);
                    x340Var4.r(false);
                }
                break;
            default:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                xu30 xu30Var = (xu30) obj11;
                iu30 iu30Var = (iu30) obj10;
                iu30 iu30Var2 = (iu30) obj9;
                m4c m4cVar = fkj0.X;
                int i3 = (iIntValue6 & 6) == 0 ? iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    x340Var6.b0();
                } else {
                    UnmatchedItem unmatchedItem = (UnmatchedItem) ((ArrayList) list).get(iIntValue5);
                    x340Var6.i0(2034251065);
                    Set setH = ((mah0) obj8).h(unmatchedItem.getId());
                    boolean zJ = u890.j((String) obj7, unmatchedItem.getId());
                    p410 p410Var = (p410) obj6;
                    String str = (String) obj5;
                    boolean zG = x340Var6.g(iu30Var2) | x340Var6.g(unmatchedItem);
                    Object objT2 = x340Var6.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new fah0(iu30Var2, unmatchedItem, (byte) 0);
                        x340Var6.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zG2 = x340Var6.g(iu30Var) | x340Var6.g(unmatchedItem);
                    Object objT3 = x340Var6.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new fah0(iu30Var, unmatchedItem, (byte) 1);
                        x340Var6.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zG3 = x340Var6.g(xu30Var) | x340Var6.g(unmatchedItem);
                    Object objT4 = x340Var6.T();
                    if (zG3 || objT4 == m4cVar) {
                        objT4 = new q0g0(xu30Var, unmatchedItem, (byte) 12);
                        x340Var6.s0(objT4);
                    }
                    r4o1.u(unmatchedItem, setH, zJ, p410Var, str, function0, function1, (vu30) objT4, x340Var6, 0);
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }

    public hkn(ArrayList arrayList, mah0 mah0Var, String str, p410 p410Var, String str2, iu30 iu30Var, iu30 iu30Var2, xu30 xu30Var) {
        this.b = arrayList;
        this.c = mah0Var;
        this.d = str;
        this.e = p410Var;
        this.f = str2;
        this.i = iu30Var;
        this.g = iu30Var2;
        this.h = xu30Var;
    }

    public hkn(List list, c380 c380Var, nbh nbhVar, ven0 ven0Var, gv51 gv51Var, zkn zknVar, iu30 iu30Var, ven0 ven0Var2) {
        this.b = list;
        this.c = c380Var;
        this.d = nbhVar;
        this.e = ven0Var;
        this.g = gv51Var;
        this.h = zknVar;
        this.i = iu30Var;
        this.f = ven0Var2;
    }
}
