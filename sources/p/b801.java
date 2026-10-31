package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b801 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ String b;
    public /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b801(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        String str = (String) obj;
        String str2 = (String) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                b801 b801Var = new b801(i, lnmVar, (byte) 0);
                b801Var.b = str;
                b801Var.c = str2;
                return b801Var.invokeSuspend(rih1Var);
            case 1:
                b801 b801Var2 = new b801(i, lnmVar, (byte) 1);
                b801Var2.b = str;
                b801Var2.c = str2;
                return b801Var2.invokeSuspend(rih1Var);
            default:
                b801 b801Var3 = new b801(i, lnmVar, (byte) 2);
                b801Var3.b = str;
                b801Var3.c = str2;
                return b801Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                String str = this.b;
                String str2 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(u890.j(str, str2));
            case 1:
                String str3 = this.b;
                String str4 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(u890.j(str3, str4));
            default:
                String str5 = this.b;
                String str6 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(u890.j(str5, str6));
        }
    }
}
