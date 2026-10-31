package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nw5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw5(byte b) {
        super(2, (lnm) null);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nw5 nw5Var = new nw5(2, lnmVar, (byte) 0);
                nw5Var.b = ((Boolean) obj).booleanValue();
                return nw5Var;
            case 1:
                nw5 nw5Var2 = new nw5(2, lnmVar, (byte) 1);
                nw5Var2.b = ((Boolean) obj).booleanValue();
                return nw5Var2;
            case 2:
                nw5 nw5Var3 = new nw5(2, lnmVar, (byte) 2);
                nw5Var3.b = ((Boolean) obj).booleanValue();
                return nw5Var3;
            case 3:
                nw5 nw5Var4 = new nw5(2, lnmVar, (byte) 3);
                nw5Var4.b = ((Boolean) obj).booleanValue();
                return nw5Var4;
            case 4:
                nw5 nw5Var5 = new nw5(2, lnmVar, (byte) 4);
                nw5Var5.b = ((Boolean) obj).booleanValue();
                return nw5Var5;
            case 5:
                nw5 nw5Var6 = new nw5(2, lnmVar, (byte) 5);
                nw5Var6.b = ((Boolean) obj).booleanValue();
                return nw5Var6;
            case 6:
                nw5 nw5Var7 = new nw5(2, lnmVar, (byte) 6);
                nw5Var7.b = ((Boolean) obj).booleanValue();
                return nw5Var7;
            case 7:
                nw5 nw5Var8 = new nw5(2, lnmVar, (byte) 7);
                nw5Var8.b = ((Boolean) obj).booleanValue();
                return nw5Var8;
            case 8:
                return new nw5(2, lnmVar, (byte) 8);
            case 9:
                nw5 nw5Var9 = new nw5(2, lnmVar, (byte) 9);
                nw5Var9.b = ((Boolean) obj).booleanValue();
                return nw5Var9;
            case 10:
                nw5 nw5Var10 = new nw5(2, lnmVar, (byte) 10);
                nw5Var10.b = ((Boolean) obj).booleanValue();
                return nw5Var10;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                nw5 nw5Var11 = new nw5(2, lnmVar, (byte) 11);
                nw5Var11.b = ((Boolean) obj).booleanValue();
                return nw5Var11;
            case grn1.d /* 12 */:
                nw5 nw5Var12 = new nw5(2, lnmVar, (byte) 12);
                nw5Var12.b = ((Boolean) obj).booleanValue();
                return nw5Var12;
            case 13:
                nw5 nw5Var13 = new nw5(2, lnmVar, (byte) 13);
                nw5Var13.b = ((Boolean) obj).booleanValue();
                return nw5Var13;
            case 14:
                return new nw5(2, lnmVar, (byte) 14);
            case 15:
                nw5 nw5Var14 = new nw5(2, lnmVar, (byte) 15);
                nw5Var14.b = ((Boolean) obj).booleanValue();
                return nw5Var14;
            case 16:
                nw5 nw5Var15 = new nw5(2, lnmVar, (byte) 16);
                nw5Var15.b = ((Boolean) obj).booleanValue();
                return nw5Var15;
            case 17:
                nw5 nw5Var16 = new nw5(2, lnmVar, (byte) 17);
                nw5Var16.b = ((Boolean) obj).booleanValue();
                return nw5Var16;
            case 18:
                nw5 nw5Var17 = new nw5(2, lnmVar, (byte) 18);
                nw5Var17.b = ((Boolean) obj).booleanValue();
                return nw5Var17;
            case 19:
                nw5 nw5Var18 = new nw5(2, lnmVar, (byte) 19);
                nw5Var18.b = ((Boolean) obj).booleanValue();
                return nw5Var18;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                nw5 nw5Var19 = new nw5(2, lnmVar, (byte) 20);
                nw5Var19.b = ((Boolean) obj).booleanValue();
                return nw5Var19;
            case 21:
                return new nw5(2, lnmVar, (byte) 21);
            case 22:
                nw5 nw5Var20 = new nw5(2, lnmVar, (byte) 22);
                nw5Var20.b = ((Boolean) obj).booleanValue();
                return nw5Var20;
            case 23:
                nw5 nw5Var21 = new nw5(2, lnmVar, (byte) 23);
                nw5Var21.b = ((Boolean) obj).booleanValue();
                return nw5Var21;
            case 24:
                return new nw5(2, lnmVar, (byte) 24);
            case 25:
                return new nw5(2, lnmVar, (byte) 25);
            case 26:
                return new nw5(2, lnmVar, (byte) 26);
            case 27:
                return new nw5(2, lnmVar, (byte) 27);
            case 28:
                return new nw5(2, lnmVar, (byte) 28);
            default:
                nw5 nw5Var22 = new nw5(2, lnmVar, (byte) 29);
                nw5Var22.b = ((Boolean) obj).booleanValue();
                return nw5Var22;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nw5) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((nw5) create(bool2, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((nw5) create(bool3, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((nw5) create(bool4, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((nw5) create(bool5, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((nw5) create(bool6, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((nw5) create(bool7, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((nw5) create(bool8, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((nw5) create((Throwable) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((nw5) create(bool9, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((nw5) create(bool10, (lnm) obj2)).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((nw5) create(bool11, (lnm) obj2)).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((nw5) create(bool12, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((nw5) create(bool13, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((nw5) create((Throwable) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                return ((nw5) create(bool14, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                Boolean bool15 = (Boolean) obj;
                bool15.booleanValue();
                return ((nw5) create(bool15, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                Boolean bool16 = (Boolean) obj;
                bool16.booleanValue();
                return ((nw5) create(bool16, (lnm) obj2)).invokeSuspend(rih1Var);
            case 18:
                Boolean bool17 = (Boolean) obj;
                bool17.booleanValue();
                return ((nw5) create(bool17, (lnm) obj2)).invokeSuspend(rih1Var);
            case 19:
                Boolean bool18 = (Boolean) obj;
                bool18.booleanValue();
                return ((nw5) create(bool18, (lnm) obj2)).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                Boolean bool19 = (Boolean) obj;
                bool19.booleanValue();
                return ((nw5) create(bool19, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((nw5) create((h810) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                Boolean bool20 = (Boolean) obj;
                bool20.booleanValue();
                return ((nw5) create(bool20, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                Boolean bool21 = (Boolean) obj;
                bool21.booleanValue();
                return ((nw5) create(bool21, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((nw5) create((nq01) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                return ((nw5) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 26:
                return ((nw5) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 27:
                return ((nw5) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 28:
                return ((nw5) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                Boolean bool22 = (Boolean) obj;
                bool22.booleanValue();
                return ((nw5) create(bool22, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z);
            case 1:
                boolean z2 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z2);
            case 2:
                boolean z3 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z3);
            case 3:
                boolean z4 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z4);
            case 4:
                boolean z5 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(!z5);
            case 5:
                boolean z6 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z6);
            case 6:
                boolean z7 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z7);
            case 7:
                boolean z8 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z8);
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(5000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            case 9:
                boolean z10 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z10);
            case 10:
                boolean z11 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(!z11);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                boolean z12 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z12);
            case grn1.d /* 12 */:
                boolean z13 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z13);
            case 13:
                boolean z14 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z14);
            case 14:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(1000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            case 15:
                boolean z16 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z16);
            case 16:
                boolean z17 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z17);
            case 17:
                boolean z18 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z18);
            case 18:
                boolean z19 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z19);
            case 19:
                boolean z20 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z20);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                boolean z21 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(!z21);
            case 21:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    return hap1.i(800L, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z22) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                boolean z23 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(!z23);
            case 23:
                boolean z24 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(!z24);
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n5f0 n5f0Var = new n5f0(2000L, 5000L);
                cqz0 cqz0Var = dqz0.a;
                long jI = yoi1.I(n5f0Var);
                this.b = true;
                return hap1.i(jI, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n5f0 n5f0Var2 = new n5f0(1000L, 4000L);
                cqz0 cqz0Var2 = dqz0.a;
                long jI2 = yoi1.I(n5f0Var2);
                this.b = true;
                return hap1.i(jI2, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n5f0 n5f0Var3 = new n5f0(1000L, 4000L);
                cqz0 cqz0Var3 = dqz0.a;
                long jI3 = yoi1.I(n5f0Var3);
                this.b = true;
                return hap1.i(jI3, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n5f0 n5f0Var4 = new n5f0(1000L, 4000L);
                cqz0 cqz0Var4 = dqz0.a;
                long jI4 = yoi1.I(n5f0Var4);
                this.b = true;
                return hap1.i(jI4, this) == d9nVar ? d9nVar : rih1Var;
            case 28:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n5f0 n5f0Var5 = new n5f0(1000L, 4000L);
                cqz0 cqz0Var5 = dqz0.a;
                long jI5 = yoi1.I(n5f0Var5);
                this.b = true;
                return hap1.i(jI5, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z30 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z30);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw5(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
