package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dad0 extends a8d1 implements dv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public /* synthetic */ lax e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dad0(lnm lnmVar, byte b) {
        super(6, lnmVar);
        this.a = b;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                dad0 dad0Var = new dad0((lnm) obj6, (byte) 0);
                dad0Var.b = zBooleanValue;
                dad0Var.c = zBooleanValue2;
                dad0Var.d = zBooleanValue3;
                dad0Var.e = (lax) obj4;
                dad0Var.f = (ibd0) obj5;
                return dad0Var.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue4 = bool.booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                dad0 dad0Var2 = new dad0((lnm) obj6, (byte) 1);
                dad0Var2.b = zBooleanValue4;
                dad0Var2.c = zBooleanValue5;
                dad0Var2.d = zBooleanValue6;
                dad0Var2.e = (lax) obj4;
                dad0Var2.f = (mmr0) obj5;
                return dad0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                lax laxVar = this.e;
                ibd0 ibd0Var = (ibd0) this.f;
                hm5.M(obj);
                if (ibd0Var instanceof hbd0) {
                    return h0p1.y(ibd0Var);
                }
                if (z) {
                    return new gax(new Integer(2131957445), (String) null);
                }
                if (!z2) {
                    return new gax(new Integer(2131957443), (String) null);
                }
                if (z3) {
                    return laxVar instanceof gax ? laxVar : iax.a;
                }
                return new gax(new Integer(2131957444), (String) null);
            default:
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                lax laxVar2 = this.e;
                mmr0 mmr0Var = (mmr0) this.f;
                hm5.M(obj);
                return new rbt0(z4, z5, z6, laxVar2, ((Boolean) mmr0Var.a).booleanValue(), ((Boolean) mmr0Var.b).booleanValue());
        }
    }
}
