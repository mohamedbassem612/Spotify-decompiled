package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tr01 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ su01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr01(su01 su01Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = su01Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        su01 su01Var = this.b;
        switch (b) {
            case 0:
                return new tr01(su01Var, lnmVar, (byte) 0);
            default:
                return new tr01(su01Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((mv01) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                su01 su01Var = this.b;
                if (!su01Var.g && su01Var.i.size() == ou01.i.b()) {
                    su01Var.g = true;
                    su01Var.a();
                    su01Var.b();
                    qyo1.B(su01Var.a, su01Var.b, 1);
                }
                break;
            default:
                hm5.M(obj);
                this.b.f("network_fetch_sponsorships");
                break;
        }
        return rih1.a;
    }
}
