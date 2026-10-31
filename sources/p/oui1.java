package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oui1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pui1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oui1(pui1 pui1Var, byte b) {
        super(1);
        this.a = b;
        this.b = pui1Var;
    }

    public final Object invoke(Object obj) {
        long j;
        byte b = this.a;
        pui1 pui1Var = this.b;
        switch (b) {
            case 0:
                dhg1 dhg1Var = (dhg1) obj;
                pay payVar = pay.a;
                pay payVar2 = pay.b;
                if (dhg1Var.f(payVar, payVar2)) {
                    oig1 oig1Var = pui1Var.P0.a;
                    return xay.c;
                }
                if (!dhg1Var.f(payVar2, pay.c)) {
                    return xay.c;
                }
                oig1 oig1Var2 = pui1Var.Q0.a;
                return xay.c;
            default:
                int iOrdinal = ((pay) obj).ordinal();
                if (iOrdinal == 0) {
                    oig1 oig1Var3 = pui1Var.P0.a;
                    j = u7h.j;
                } else if (iOrdinal == 1) {
                    oig1 oig1Var4 = pui1Var.P0.a;
                    oig1 oig1Var5 = pui1Var.Q0.a;
                    j = u7h.j;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    oig1 oig1Var6 = pui1Var.Q0.a;
                    j = pui1Var.R0.f;
                }
                return new u7h(j);
        }
    }
}
