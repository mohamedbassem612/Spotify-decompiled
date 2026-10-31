package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a82 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Boolean b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a82(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                a82 a82Var = new a82(b2, (lnm) obj3, (byte) 0);
                a82Var.c = zBooleanValue;
                a82Var.b = (Boolean) obj2;
                return a82Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                a82 a82Var2 = new a82(b2, (lnm) obj3, (byte) 1);
                a82Var2.b = bool;
                a82Var2.c = zBooleanValue2;
                return a82Var2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                a82 a82Var3 = new a82(b2, (lnm) obj3, (byte) 2);
                a82Var3.b = bool;
                a82Var3.c = zBooleanValue3;
                return a82Var3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                a82 a82Var4 = new a82(b2, (lnm) obj3, b2);
                a82Var4.b = bool;
                a82Var4.c = zBooleanValue4;
                return a82Var4.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                a82 a82Var5 = new a82(b2, (lnm) obj3, (byte) 4);
                a82Var5.b = bool;
                a82Var5.c = zBooleanValue5;
                return a82Var5.invokeSuspend(rih1Var);
            case 5:
                boolean zBooleanValue6 = bool.booleanValue();
                a82 a82Var6 = new a82(b2, (lnm) obj3, (byte) 5);
                a82Var6.c = zBooleanValue6;
                a82Var6.b = (Boolean) obj2;
                return a82Var6.invokeSuspend(rih1Var);
            case 6:
                boolean zBooleanValue7 = bool.booleanValue();
                a82 a82Var7 = new a82(b2, (lnm) obj3, (byte) 6);
                a82Var7.c = zBooleanValue7;
                a82Var7.b = (Boolean) obj2;
                return a82Var7.invokeSuspend(rih1Var);
            case 7:
                boolean zBooleanValue8 = bool.booleanValue();
                a82 a82Var8 = new a82(b2, (lnm) obj3, (byte) 7);
                a82Var8.c = zBooleanValue8;
                a82Var8.b = (Boolean) obj2;
                return a82Var8.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue9 = bool.booleanValue();
                a82 a82Var9 = new a82(b2, (lnm) obj3, (byte) 8);
                a82Var9.c = zBooleanValue9;
                a82Var9.b = (Boolean) obj2;
                return a82Var9.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                boolean z2 = this.c;
                Boolean bool = this.b;
                hm5.M(obj);
                if (z2 && !bool.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Boolean bool2 = this.b;
                boolean z3 = this.c;
                hm5.M(obj);
                if (bool2.booleanValue() && !z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                Boolean bool3 = this.b;
                boolean z4 = this.c;
                hm5.M(obj);
                return new mmr0(bool3, Boolean.valueOf(z4));
            case 3:
                Boolean bool4 = this.b;
                boolean z5 = this.c;
                hm5.M(obj);
                return new mmr0(bool4, Boolean.valueOf(z5));
            case 4:
                Boolean bool5 = this.b;
                boolean z6 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(bool5.booleanValue() || z6);
            case 5:
                boolean z7 = this.c;
                Boolean bool6 = this.b;
                hm5.M(obj);
                return new mmr0(Boolean.valueOf(z7), bool6);
            case 6:
                boolean z8 = this.c;
                Boolean bool7 = this.b;
                hm5.M(obj);
                bool7.getClass();
                return new ea11(z8, bool7.booleanValue());
            case 7:
                boolean z9 = this.c;
                Boolean bool8 = this.b;
                hm5.M(obj);
                xj61 xj61Var = new xj61();
                if (z9) {
                    xj61Var.add(jh91.a);
                }
                if (bool8.booleanValue()) {
                    xj61Var.add(jh91.b);
                }
                return new kh91(cwl1.j(xj61Var));
            default:
                boolean z10 = this.c;
                Boolean bool9 = this.b;
                hm5.M(obj);
                if (!z10 && !bool9.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
