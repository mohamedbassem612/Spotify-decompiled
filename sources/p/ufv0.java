package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ufv0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ vr20 c;
    public final /* synthetic */ long d;

    public /* synthetic */ ufv0(l811 l811Var, vr20 vr20Var, long j, byte b) {
        this.a = b;
        this.b = l811Var;
        this.c = vr20Var;
        this.d = j;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        k28 k28Var;
        k28 c28Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        long j = this.d;
        vr20 vr20Var = this.c;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                l811Var.a = true;
                Object objEmit = vr20Var.emit(new vfv0(j, jLongValue), lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            default:
                u18 u18Var = (w18) obj;
                if (u890.j(u18Var, t18.a)) {
                    k28Var = k28.a;
                } else if (u890.j(u18Var, r18.a)) {
                    k28Var = j28.a;
                } else {
                    if (u18Var instanceof u18) {
                        u18 u18Var2 = u18Var;
                        c28Var = new b28(u18Var2.a, u18Var2.b);
                    } else if (u18Var instanceof v18) {
                        c28Var = new c28(((v18) u18Var).a);
                    } else {
                        if (!(u18Var instanceof s18)) {
                            eg.o();
                            return null;
                        }
                        k28Var = z18.a;
                    }
                    k28Var = c28Var;
                }
                if (k28Var instanceof e28) {
                    l811Var.a = true;
                }
                Object objEmit2 = vr20Var.emit(new i2h0(j, k28Var), lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
        }
    }
}
