package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rmf0 extends a8d1 implements zu30 {
    public /* synthetic */ g3e0 a;
    public /* synthetic */ boolean b;
    public /* synthetic */ evf c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmf0(boolean z, boolean z2, lnm lnmVar) {
        super(4, lnmVar);
        this.d = z;
        this.e = z2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        rmf0 rmf0Var = new rmf0(this.d, this.e, (lnm) obj4);
        rmf0Var.a = (g3e0) obj;
        rmf0Var.b = zBooleanValue;
        rmf0Var.c = (evf) obj3;
        return rmf0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        g3e0 g3e0Var = this.a;
        boolean z2 = this.b;
        evf evfVar = this.c;
        hm5.M(obj);
        boolean z3 = g3e0Var instanceof f3e0;
        boolean z4 = false;
        boolean z5 = !z2 || this.d;
        int iOrdinal = evfVar.ordinal();
        if (iOrdinal == 0) {
            z = true;
        } else if (iOrdinal == 1) {
            z = this.e;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            z = false;
        }
        if (z3 && z5 && z) {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
