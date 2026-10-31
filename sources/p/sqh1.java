package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sqh1 extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ int b;
    public /* synthetic */ Integer c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ dlg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqh1(dlg1 dlg1Var, lnm lnmVar) {
        super(4, lnmVar);
        this.e = dlg1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        sqh1 sqh1Var = new sqh1(this.e, (lnm) obj4);
        sqh1Var.b = iIntValue;
        sqh1Var.c = (Integer) obj2;
        sqh1Var.d = zBooleanValue;
        return sqh1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        Integer num = this.c;
        boolean z = this.d;
        boolean z2 = this.a;
        if (!z2) {
            hm5.M(obj);
            if (!z) {
                return new gax(new Integer(2131963515), (String) null);
            }
            if (num != null && i == num.intValue()) {
                return new gax(new Integer(2131963516), (String) null);
            }
            this.c = null;
            this.b = i;
            this.d = z;
            this.a = true;
            obj = this.e.D(this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return (lax) obj;
    }
}
