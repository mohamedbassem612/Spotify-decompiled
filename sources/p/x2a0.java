package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x2a0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ String b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2a0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        switch (b) {
            case 0:
                mp90 mp90Var = (mp90) obj;
                String str = mp90Var != null ? mp90Var.a : null;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                x2a0 x2a0Var = new x2a0(i, (lnm) obj3, (byte) 0);
                x2a0Var.b = str;
                x2a0Var.c = zBooleanValue;
                return x2a0Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                x2a0 x2a0Var2 = new x2a0(i, (lnm) obj3, (byte) 1);
                x2a0Var2.b = (String) obj;
                x2a0Var2.c = zBooleanValue2;
                return x2a0Var2.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                x2a0 x2a0Var3 = new x2a0(i, (lnm) obj3, (byte) 2);
                x2a0Var3.c = zBooleanValue3;
                x2a0Var3.b = (String) obj2;
                return x2a0Var3.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    public final Object invokeSuspend(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                String str2 = this.b;
                boolean z = this.c;
                hm5.M(obj);
                if (str2 != null) {
                    mp90 mp90Var = new mp90(str2);
                    if (!z) {
                        mp90Var = null;
                    }
                    if (mp90Var != null) {
                        str = mp90Var.a;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    return new mp90(str);
                }
                return null;
            case 1:
                String str3 = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                if (z2) {
                    return str3;
                }
                return null;
            default:
                boolean z3 = this.c;
                String str4 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(z3 && str4.length() > 0);
        }
    }
}
