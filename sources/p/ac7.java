package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ac7 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i091 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac7(i091 i091Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i091Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                ac7 ac7Var = new ac7(this.c, lnmVar, (byte) 0);
                ac7Var.b = obj;
                return ac7Var;
            default:
                ac7 ac7Var2 = new ac7(this.c, lnmVar, (byte) 1);
                ac7Var2.b = obj;
                return ac7Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i091 i091Var = (i091) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(i091Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        boolean z = false;
        i091 i091Var = this.c;
        i091 i091Var2 = (i091) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (u890.j(i091Var2.h, i091Var.h) && i091Var2.c == i091Var.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                hm5.M(obj);
                if (u890.j(i091Var2.h, i091Var.h) && i091Var2.c == i091Var.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
