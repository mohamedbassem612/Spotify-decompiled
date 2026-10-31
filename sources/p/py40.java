package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class py40 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py40(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 4;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                py40 py40Var = new py40(i, (lnm) obj4, (byte) 0);
                py40Var.d = (String) obj;
                py40Var.b = zBooleanValue;
                py40Var.c = zBooleanValue2;
                return py40Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                py40 py40Var2 = new py40(i, (lnm) obj4, (byte) 1);
                py40Var2.d = (i091) obj;
                py40Var2.b = zBooleanValue3;
                py40Var2.c = zBooleanValue4;
                return py40Var2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                py40 py40Var3 = new py40(i, (lnm) obj4, (byte) 2);
                py40Var3.d = (ioj0) obj;
                py40Var3.b = zBooleanValue5;
                py40Var3.c = zBooleanValue6;
                return py40Var3.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj3).booleanValue();
                py40 py40Var4 = new py40(i, (lnm) obj4, (byte) 3);
                py40Var4.d = (cxc0) obj;
                py40Var4.b = zBooleanValue7;
                py40Var4.c = zBooleanValue8;
                return py40Var4.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        boolean z = false;
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                boolean z2 = this.b;
                boolean z3 = this.c;
                hm5.M(obj);
                if (!z3) {
                    if (z2) {
                        String[] strArr = new zcs0(str).a;
                        if (strArr.length == 3 && "opt-in-trial".equals(strArr[0])) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                i091 i091Var = (i091) this.d;
                boolean z4 = this.b;
                boolean z5 = this.c;
                hm5.M(obj);
                if (z4 || z5) {
                    return null;
                }
                return i091Var;
            case 2:
                ioj0 ioj0Var = (ioj0) this.d;
                boolean z6 = this.b;
                boolean z7 = this.c;
                hm5.M(obj);
                return new nus0(ioj0Var, z6, z7);
            default:
                cxc0 cxc0Var = (cxc0) this.d;
                boolean z8 = this.b;
                boolean z9 = this.c;
                hm5.M(obj);
                if (z8 && (z9 || ((charSequence = (CharSequence) cxc0Var.f.q.get("description")) != null && !ihc1.y0(charSequence)))) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
