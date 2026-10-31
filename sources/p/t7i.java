package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t7i extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7i(iu30 iu30Var, byte b) {
        super(4);
        this.a = b;
        this.b = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        z50 z50Var = z50.c;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                String strO0 = cwl1.o0(x340Var, 2131952571);
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new a6i(iu30Var, (byte) 14);
                    x340Var2.s0(objT);
                }
                vzn1.d(strO0, new gbx(z50Var, (Function0) objT), null, x340Var2, 0);
                rqo1.g(0, 1, x340Var2, null);
                return rih1Var;
            case 1:
                pxl.d((qwl) obj2, iu30Var, zr7.i(nim0Var, zrj.T0), (b0k) obj3, (((Number) obj4).intValue() >> 3) & 14);
                return rih1Var;
            case 2:
                pxl.d((qwl) obj2, iu30Var, zr7.i(nim0Var, zrj.U0), (b0k) obj3, (((Number) obj4).intValue() >> 3) & 14);
                return rih1Var;
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                x340 x340Var3 = (b0k) obj3;
                ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                if (zBooleanValue) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-129308150);
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new q7u(iu30Var, (byte) 23);
                        x340Var4.s0(objT2);
                    }
                    lro1.d(new gbx(z50Var, (Function0) objT2), null, null, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-129190009);
                    boolean zG3 = x340Var5.g(iu30Var);
                    Object objT3 = x340Var5.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new q7u(iu30Var, (byte) 24);
                        x340Var5.s0(objT3);
                    }
                    lro1.i(new gbx(z50Var, (Function0) objT3), null, null, x340Var5, 0);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 4:
                x340 x340Var6 = (b0k) obj3;
                ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                int iOrdinal = ((jwb0) obj2).ordinal();
                if (iOrdinal == 0) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(-828939474);
                    boolean zG4 = x340Var7.g(iu30Var);
                    Object objT4 = x340Var7.T();
                    if (zG4 || objT4 == m4cVar2) {
                        objT4 = new y720(iu30Var, (byte) 10);
                        x340Var7.s0(objT4);
                    }
                    dzo1.b((Function0) objT4, anm1.N("ClearButton", nim0Var), false, null, x340Var7, 0);
                    x340Var7.r(false);
                } else if (iOrdinal == 1) {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(-828932022);
                    boolean zG5 = x340Var8.g(iu30Var);
                    Object objT5 = x340Var8.T();
                    if (zG5 || objT5 == m4cVar2) {
                        objT5 = new y720(iu30Var, (byte) 11);
                        x340Var8.s0(objT5);
                    }
                    dzo1.d((Function0) objT5, anm1.N("MoreFilters", nim0Var), false, null, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var6, -828941641, false);
                    }
                    x340 x340Var9 = x340Var6;
                    x340Var9.i0(-828925438);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 5:
                ku50 ku50Var = (ku50) obj;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var10.g(ku50Var) : x340Var10.i(ku50Var) ? 4 : 2;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                    boolean zG6 = x340Var11.g(iu30Var);
                    int i = iIntValue & 14;
                    if (i != 4 && ((iIntValue & 8) == 0 || !x340Var11.i(ku50Var))) {
                        z = false;
                    }
                    boolean z2 = zG6 | z;
                    Object objT6 = x340Var11.T();
                    if (z2 || objT6 == fkj0.X) {
                        objT6 = new nu50(iu30Var, ku50Var, (byte) 0);
                        x340Var11.s0(objT6);
                    }
                    l0o1.b(ku50Var, (Function0) objT6, x340Var11, 8 | i);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 6:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                x340 x340Var12 = (b0k) obj3;
                ((Number) obj4).intValue();
                if (zBooleanValue2) {
                    x340 x340Var13 = x340Var12;
                    x340Var13.i0(-1537596325);
                    qim0 qim0VarN = anm1.N("clear_button", nim0Var);
                    boolean zG7 = x340Var13.g(iu30Var);
                    Object objT7 = x340Var13.T();
                    if (zG7 || objT7 == fkj0.X) {
                        objT7 = new sya0(iu30Var, (byte) 18);
                        x340Var13.s0(objT7);
                    }
                    oec0.a(new gbx(z50Var, (Function0) objT7), qim0VarN, false, (idn0) null, x340Var13, 48);
                    x340Var13.r(false);
                } else {
                    x340 x340Var14 = x340Var12;
                    x340Var14.i0(-1537401831);
                    x340Var14.r(false);
                }
                return rih1Var;
            case 7:
                iu30Var.invoke(new bkk0((s69) obj, (s69) obj2, ((Number) obj4).intValue(), (duk1) obj3));
                return rih1Var;
            case 8:
                iu30Var.invoke(new znk0((ijf1) obj, o4w.c((o4w) obj2, ara.c, 6), (yoo) obj3, (bpo) obj4));
                return rih1Var;
            case 9:
                iu30Var.invoke(new tnk0((ijf1) obj, o4w.c((o4w) obj2, (iu30) null, 7), (yoo) obj3, (bpo) obj4));
                return rih1Var;
            case 10:
                iu30Var.invoke(new unk0((ijf1) obj, o4w.c((o4w) obj2, (iu30) null, 7), (yoo) obj3, (bpo) obj4));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                iu30Var.invoke(new vnk0((ijf1) obj, o4w.c((o4w) obj2, (iu30) null, 7), (yoo) obj3, (bpo) obj4));
                return rih1Var;
            case grn1.d /* 12 */:
                int iIntValue2 = ((Number) obj3).intValue();
                ((Number) obj4).intValue();
                i3r i3rVarO = ((ses0) obj2).o(iIntValue2);
                if (i3rVarO == null) {
                    i3rVarO = i3r.a;
                }
                return i3rVarO instanceof j3r ? new j3r(iu30Var.invoke(((j3r) i3rVarO).a)) : i3rVarO;
            case 13:
                ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                ((Number) obj4).intValue();
                String strO1 = cwl1.o0(x340Var15, 2131962995);
                x340 x340Var16 = x340Var15;
                boolean zG8 = x340Var16.g(iu30Var);
                Object objT8 = x340Var16.T();
                if (zG8 || objT8 == fkj0.X) {
                    objT8 = new pba1(iu30Var, (byte) 27);
                    x340Var16.s0(objT8);
                }
                ozn1.e(strO1, new gbx(z50Var, (Function0) objT8), null, x340Var16, 0);
                rqo1.g(0, 1, x340Var16, null);
                return rih1Var;
            case 14:
                int iIntValue3 = ((Number) obj3).intValue();
                iu30Var.invoke(Integer.valueOf(iIntValue3));
                return new it61(Integer.valueOf(iIntValue3));
            default:
                int iIntValue4 = ((Number) obj).intValue();
                eeo0 eeo0Var = (eeo0) obj2;
                b0k b0kVar = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                j82.j(iIntValue4, eeo0Var, apo.r(2124674360, new eii1(eeo0Var, iu30Var, (byte) 21), b0kVar), b0kVar, (iIntValue5 & 112) | (iIntValue5 & 14) | 384);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7i(iu30 iu30Var, maa maaVar, byte b) {
        super(4);
        this.a = b;
        this.b = iu30Var;
    }
}
