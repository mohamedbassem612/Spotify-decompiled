package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ryu extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryu() {
        super(4, (lnm) null);
        this.a = (byte) 6;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 4;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                ryu ryuVar = new ryu(b2, (lnm) obj4, (byte) 0);
                ryuVar.b = zBooleanValue;
                ryuVar.c = zBooleanValue2;
                ryuVar.d = zBooleanValue3;
                return ryuVar.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue4 = bool.booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                ryu ryuVar2 = new ryu(b2, (lnm) obj4, (byte) 1);
                ryuVar2.b = zBooleanValue4;
                ryuVar2.c = zBooleanValue5;
                ryuVar2.d = zBooleanValue6;
                return ryuVar2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue7 = bool.booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue9 = ((Boolean) obj3).booleanValue();
                ryu ryuVar3 = new ryu(b2, (lnm) obj4, (byte) 2);
                ryuVar3.b = zBooleanValue7;
                ryuVar3.c = zBooleanValue8;
                ryuVar3.d = zBooleanValue9;
                return ryuVar3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue10 = bool.booleanValue();
                boolean zBooleanValue11 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue12 = ((Boolean) obj3).booleanValue();
                ryu ryuVar4 = new ryu(b2, (lnm) obj4, (byte) 3);
                ryuVar4.b = zBooleanValue10;
                ryuVar4.c = zBooleanValue11;
                ryuVar4.d = zBooleanValue12;
                return ryuVar4.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue13 = bool.booleanValue();
                boolean zBooleanValue14 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue15 = ((Boolean) obj3).booleanValue();
                ryu ryuVar5 = new ryu(b2, (lnm) obj4, b2);
                ryuVar5.b = zBooleanValue13;
                ryuVar5.c = zBooleanValue14;
                ryuVar5.d = zBooleanValue15;
                return ryuVar5.invokeSuspend(rih1Var);
            case 5:
                boolean zBooleanValue16 = bool.booleanValue();
                boolean zBooleanValue17 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue18 = ((Boolean) obj3).booleanValue();
                ryu ryuVar6 = new ryu(b2, (lnm) obj4, (byte) 5);
                ryuVar6.b = zBooleanValue16;
                ryuVar6.c = zBooleanValue17;
                ryuVar6.d = zBooleanValue18;
                return ryuVar6.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue19 = bool.booleanValue();
                boolean zBooleanValue20 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue21 = ((Boolean) obj3).booleanValue();
                ryu ryuVar7 = new ryu(b2, (lnm) obj4, (byte) 6);
                ryuVar7.b = zBooleanValue19;
                ryuVar7.c = zBooleanValue20;
                ryuVar7.d = zBooleanValue21;
                return ryuVar7.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                boolean z2 = this.b;
                boolean z3 = this.c;
                boolean z4 = this.d;
                hm5.M(obj);
                if (!z2 && !z3 && !z4) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                boolean z5 = this.b;
                boolean z6 = this.c;
                boolean z7 = this.d;
                hm5.M(obj);
                return new c730(z5, z7, z6);
            case 2:
                boolean z8 = this.b;
                boolean z9 = this.c;
                boolean z10 = this.d;
                hm5.M(obj);
                if (!z8 && !z9 && z10) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                boolean z11 = this.b;
                boolean z12 = this.c;
                boolean z13 = this.d;
                hm5.M(obj);
                if (!z11 && !z12 && !z13) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                boolean z14 = this.b;
                boolean z15 = this.c;
                boolean z16 = this.d;
                hm5.M(obj);
                return new yvg1(Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf(z16));
            case 5:
                boolean z17 = this.b;
                boolean z18 = this.c;
                boolean z19 = this.d;
                hm5.M(obj);
                if (!z19) {
                    z17 = z18;
                }
                return new rqg1(z17, z19 ? eqg1.e : gqg1.e);
            default:
                boolean z20 = this.b;
                boolean z21 = this.c;
                boolean z22 = this.d;
                hm5.M(obj);
                return new czl1(z20, z21, z22);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ryu(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
