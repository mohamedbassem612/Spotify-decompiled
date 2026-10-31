package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qvu0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tvu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qvu0(tvu0 tvu0Var, byte b) {
        super(2);
        this.a = b;
        this.b = tvu0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        tvu0 tvu0Var = this.b;
        switch (b) {
            case 0:
                qv21 qv21Var = (qv21) obj2;
                return i6p1.s((dvu0) obj, qv21Var.a, qv21Var.c, tvu0Var.a);
            default:
                uvk0 uvk0Var = (uvk0) tvu0Var.c.getValue();
                String id = ((dvu0) obj).a.getId();
                uvk0Var.getClass();
                x6h1 x6h1VarC = uvk0Var.a.c();
                x6h1VarC.i.add(new a7h1("shareable_card", id, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = uvk0Var.b;
                return k7h1Var.a();
        }
    }
}
