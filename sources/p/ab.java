package p;

import android.content.res.Resources;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ab extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:164:0x0415  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3;
        int i;
        ji0 ji0Var;
        String string;
        String string2;
        String strO0;
        long j;
        Object obj4;
        byte b = this.a;
        int i2 = 2131951855;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        z = false;
        boolean z5 = false;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(((za) obj5).a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var4, ((mj) obj5).e), null, null, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2046);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    long j2 = cbx.a(x340Var6).d.a;
                    avw0 avw0Var = cbx.b(x340Var6).c;
                    ev evVar = (ev) obj5;
                    kiv kivVar = jv71.a;
                    qim0 qim0VarI = zr7.i(nim0Var, new kk11(3, (byte) 5));
                    boolean zF = x340Var6.f(j2) | x340Var6.d(1.0f);
                    Object objT = x340Var6.T();
                    if (zF || objT == fkj0.X) {
                        obj3 = objT;
                        ps psVar = new ps(z ? (byte) 1 : (byte) 0, j2);
                        x340Var6.s0(psVar);
                        obj3 = psVar;
                    }
                    obj3 = objT;
                    wu.c(evVar, exd0.q(qim0VarI, (iu30) obj3), x340Var6, 0, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                wzg wzgVar = (wzg) obj5;
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else if (wzgVar instanceof uzg) {
                    x340Var8.i0(-1023101238);
                    uzg uzgVar = (uzg) wzgVar;
                    myo1.f(uzgVar.a, uzgVar.b, uzgVar.c, uzgVar.d, uzgVar.e, uzgVar.f, uzgVar.g, uzgVar.h, null, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    if (!(wzgVar instanceof vzg)) {
                        throw p3d1.k(x340Var8, 1906657909, false);
                    }
                    x340Var8.i0(-1022644918);
                    vzg vzgVar = (vzg) wzgVar;
                    myo1.i(vzgVar.a, vzgVar.b, vzgVar.f, vzgVar.c, vzgVar.g, vzgVar.d, vzgVar.e, null, x340Var8, 0);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int iC = l1d.C(((m7x0) obj5).a);
                    if (iC == 0) {
                        i = 2131960533;
                    } else if (iC == 1) {
                        i = 2131960534;
                    } else {
                        if (iC != 2 && iC != 3) {
                            eg.o();
                            return null;
                        }
                        i = 2131960441;
                    }
                    uwo1.e(cwl1.o0(x340Var10, i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var10, 0, 0, 2046);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                return ((r30) obj5).e((j30) obj2, (k30) obj);
            case 6:
                c40 c40Var = (c40) obj2;
                return ((i40) obj5).e((d40) obj, c40Var.a, c40Var.b, c40Var.c);
            case 7:
                ((Number) obj2).intValue();
                d0p1.b((yap1) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                g0p1.b((r2p1) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                j1p1.j((yv31) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                if0 if0Var = (if0) obj;
                fgd0 fgd0Var = (fgd0) obj2;
                if (if0Var.a.isEmpty()) {
                    return kf0.a;
                }
                hcx hcxVar = if0Var.b;
                if (fgd0Var == fgd0.b && ((mf0) obj5).a.b(6)) {
                    z5 = true;
                }
                return new jf0(hcxVar, z5);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return t5p1.j(new u70(((zrt0) ((u961) obj5).b).a((String) obj), (byte) 1), 3);
            case grn1.d /* 12 */:
                l62 l62Var = (l62) obj2;
                if (!(((u601) ((cm0) obj5).i).getValue() instanceof ck7) && l62Var.Q0 == 1) {
                    z4 = true;
                }
                return new fm0(z4);
            case 13:
                l62 l62Var2 = (l62) obj2;
                if (!(((u601) ((im0) obj5).t).getValue() instanceof ck7) && l62Var2.Q0 == 1) {
                    z3 = true;
                }
                return new fm0(z3);
            case 14:
                mmr0 mmr0Var = (mmr0) obj2;
                l62 l62Var3 = (l62) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                an0 an0Var = (an0) obj5;
                lsn lsnVar = l62Var3.Z;
                boolean z6 = lsnVar instanceof lsn;
                lsn lsnVar2 = z6 ? lsnVar : null;
                String str = (lsnVar2 == null || (ji0Var = lsnVar2.c.a) == null) ? null : ji0Var.W0;
                if (!(str == null ? false : str.equals("topic_survey"))) {
                    if ((zBooleanValue || !an0Var.Y.c()) && !l62Var3.T0) {
                        lsn lsnVar3 = z6 ? lsnVar : null;
                        if ((lsnVar3 != null ? lsnVar3.c.d : null) != null) {
                            z2 = true;
                        }
                    } else {
                        z2 = true;
                    }
                }
                return new um0(z2, zBooleanValue);
            case 15:
                return ((jp0) obj5).e((lo0) obj);
            case 16:
                l62 l62Var4 = (l62) obj2;
                Resources resources = (Resources) ((br0) obj5).c;
                cw0 cw0Var = l62Var4.U0;
                if (cw0Var.equals(pzs0.d)) {
                    int iC2 = l1d.C(l62Var4.Y);
                    if (iC2 != 0) {
                        if (iC2 != 1) {
                            eg.o();
                            return null;
                        }
                        i2 = 2131951856;
                    }
                    string = resources.getString(i2);
                } else {
                    if (!(cw0Var instanceof bw0)) {
                        eg.o();
                        return null;
                    }
                    string = resources.getString(2131951857, l62Var4.b);
                }
                string.getClass();
                return new eq0(string, !(l62Var4.P0 instanceof k860));
            case 17:
                l62 l62Var5 = (l62) obj2;
                Resources resources2 = (Resources) ((rt01) obj5).c;
                cw0 cw0Var2 = l62Var5.U0;
                if (cw0Var2.equals(pzs0.d)) {
                    int iC3 = l1d.C(l62Var5.Y);
                    if (iC3 != 0) {
                        if (iC3 != 1) {
                            eg.o();
                            return null;
                        }
                        i2 = 2131951856;
                    }
                    string2 = resources2.getString(i2);
                } else {
                    if (!(cw0Var2 instanceof bw0)) {
                        eg.o();
                        return null;
                    }
                    string2 = resources2.getString(2131951857, l62Var5.b);
                }
                string2.getClass();
                return new sm0(string2);
            case 18:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                boolean zY = x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    bc1 bc1Var = (bc1) ((cc1) obj5).c;
                    kiv kivVar2 = xce0.a;
                    qim0 qim0VarH = l6o1.H(zr7.i(nim0Var, gce0.c), l6o1.C(0, 0, 1, x340Var12), false, 14);
                    WeakHashMap weakHashMap = osl1.x;
                    otw.c(bc1Var, rih1Var2, too1.y(qim0VarH, lhc.g(x340Var12).g), (ipb1) null, x340Var12, 48, 8);
                } else {
                    x340Var12.b0();
                }
                return rih1Var2;
            case 19:
                return new wc1(1, (fc1) obj, ((yc1) obj5).b.b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwo1.e(((qw50) obj5).g.a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2046);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String str2 = ((lh1) obj5).e.c;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, null, cbx.d(x340Var16).k, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var16, 0, 0, 1786);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 22:
                return new CompletableFromAction(new dm1((sl1) obj, (rt01) obj5, (byte) 0));
            case 23:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                cm1 cm1Var = (cm1) obj5;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean z7 = cm1Var.e;
                    String str3 = cm1Var.d;
                    klx klxVar = z7 ? klx.c : irx.c;
                    if (str3 != null) {
                        x340Var18.i0(-1625044850);
                        strO0 = cwl1.n0(z7 ? 2131962885 : 2131962884, new Object[]{str3}, x340Var18);
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(-1624684754);
                        strO0 = cwl1.o0(x340Var18, z7 ? 2131962883 : 2131962882);
                        x340Var18.r(false);
                    }
                    jsl jslVar = new jsl(strO0);
                    if (z7) {
                        x340Var18.i0(-1624339910);
                        uwr uwrVar3 = cbx.a;
                        j = cbx.a(x340Var18).b.c;
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(-1624275585);
                        uwr uwrVar4 = cbx.a;
                        j = cbx.a(x340Var18).b.b;
                        x340Var18.r(false);
                    }
                    w0h1.a(klxVar, jslVar, (qim0) null, j, 0L, false, x340Var18, 8, 52);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                boolean zY2 = x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (zY2) {
                    otw.c(((ecv) obj5).b, rih1Var3, (qim0) null, (ipb1) null, x340Var20, 48, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var3;
            case 25:
                return First.b(new ww1(((ww1) obj2).a.j((go1) ((so1) obj5).W0.getValue()), ((vw1) obj).a));
            case 26:
                Set<String> set = (Set) obj;
                j8m0 j8m0Var = (j8m0) obj5;
                for (String str4 : (Set) obj2) {
                    MobiusLoop mobiusLoop = j8m0Var.b;
                    if (mobiusLoop != null) {
                        mobiusLoop.a(new r4d0(Collections.singleton(str4)));
                    }
                }
                for (String str5 : set) {
                    MobiusLoop mobiusLoop2 = j8m0Var.b;
                    if (mobiusLoop2 != null) {
                        mobiusLoop2.a(new w4d0(Collections.singleton(str5)));
                    }
                }
                return rih1Var;
            case 27:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                u961 u961Var = (u961) obj5;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pap1.b((h52) ((hrr0) u961Var.b).getValue(), (gw70) u961Var.a, (iu30) u961Var.c, null, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 28:
                return ((res) obj5).s();
            default:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                v52 v52Var = (v52) obj5;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    maa maaVar = (maa) v52Var.b.get();
                    p52 p52Var = v52Var.c;
                    boolean zI = x340Var24.i(p52Var);
                    Object objT2 = x340Var24.T();
                    if (zI || objT2 == fkj0.X) {
                        obj4 = objT2;
                        q01 q01Var = new q01(0, p52Var, p52.class, "onCtaSelected", "onCtaSelected()V", 0, (byte) 7);
                        x340Var24.s0(q01Var);
                        obj4 = q01Var;
                    }
                    obj4 = objT2;
                    otw.c(maaVar, new q52((Function0) obj4), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
