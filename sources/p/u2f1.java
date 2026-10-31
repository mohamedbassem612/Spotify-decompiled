package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u2f1 extends a8d1 implements dv30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ ly50 b;
    public /* synthetic */ int c;
    public /* synthetic */ String d;
    public /* synthetic */ ymc0 e;
    public final /* synthetic */ q2f1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2f1(q2f1 q2f1Var, lnm lnmVar) {
        super(6, lnmVar);
        this.f = q2f1Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        u2f1 u2f1Var = new u2f1(this.f, (lnm) obj6);
        u2f1Var.a = zBooleanValue;
        u2f1Var.b = (ly50) obj2;
        u2f1Var.c = iIntValue;
        u2f1Var.d = (String) obj4;
        u2f1Var.e = (ymc0) obj5;
        return u2f1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        ly50 ly50Var = this.b;
        int i = this.c;
        String str = this.d;
        ymc0 ymc0Var = this.e;
        hm5.M(obj);
        boolean z2 = ly50Var.a == iy50.c;
        Integer num = ymc0Var != null ? new Integer(ymc0Var.a) : this.f.b;
        boolean zBooleanValue = false;
        boolean z3 = ly50Var.c;
        Boolean bool = ly50Var.h;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new q2f1(str, num, i, z2, z, z3, zBooleanValue);
    }
}
