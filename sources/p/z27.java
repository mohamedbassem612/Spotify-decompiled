package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z27 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ String b;
    public /* synthetic */ Boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z27(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                z27 z27Var = new z27(i, lnmVar, (byte) 0);
                z27Var.b = str;
                z27Var.c = bool;
                return z27Var.invokeSuspend(rih1Var);
            default:
                z27 z27Var2 = new z27(i, lnmVar, (byte) 1);
                z27Var2.b = str;
                z27Var2.c = bool;
                return z27Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                String str = this.b;
                Boolean bool = this.c;
                hm5.M(obj);
                bool.getClass();
                return new v27(str, bool.booleanValue());
            default:
                String str2 = this.b;
                Boolean bool2 = this.c;
                hm5.M(obj);
                String str3 = str2.length() > 0 ? str2 : null;
                if (str3 != null) {
                    return new hpc1(str3, bool2, 0, 0, 28, (l1d) null);
                }
                return null;
        }
    }
}
