package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o30 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ ioj0 b;
    public /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30() {
        super(3, (lnm) null);
        this.a = (byte) 2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        ioj0 ioj0Var = (ioj0) obj;
        Set set = (Set) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                o30 o30Var = new o30(b2, lnmVar, (byte) 0);
                o30Var.b = ioj0Var;
                o30Var.c = set;
                return o30Var.invokeSuspend(rih1Var);
            case 1:
                o30 o30Var2 = new o30(b2, lnmVar, (byte) 1);
                o30Var2.b = ioj0Var;
                o30Var2.c = set;
                return o30Var2.invokeSuspend(rih1Var);
            case 2:
                o30 o30Var3 = new o30(b2, lnmVar, (byte) 2);
                o30Var3.b = ioj0Var;
                o30Var3.c = set;
                return o30Var3.invokeSuspend(rih1Var);
            default:
                o30 o30Var4 = new o30(b2, lnmVar, b2);
                o30Var4.b = ioj0Var;
                o30Var4.c = set;
                return o30Var4.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                ioj0 ioj0Var = this.b;
                Set set = this.c;
                hm5.M(obj);
                set.getClass();
                return new j30(ioj0Var, set);
            case 1:
                ioj0 ioj0Var2 = this.b;
                Set set2 = this.c;
                hm5.M(obj);
                return new z24(ioj0Var2, set2);
            case 2:
                ioj0 ioj0Var3 = this.b;
                Set set3 = this.c;
                hm5.M(obj);
                set3.getClass();
                return new egi0(ioj0Var3, set3);
            default:
                ioj0 ioj0Var4 = this.b;
                Set set4 = this.c;
                hm5.M(obj);
                set4.getClass();
                return new lii0(ioj0Var4, set4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o30(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
