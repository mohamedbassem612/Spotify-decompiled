package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u9g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b431 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9g0(b431 b431Var, byte b) {
        super(2);
        this.a = b;
        this.b = b431Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b431 b431Var = this.b;
        switch (b) {
            case 0:
                b431Var.a(new h8t((String) obj), (String) obj2);
                break;
            case 1:
                b431Var.a(new gc50((String) obj), (String) obj2);
                break;
            case 2:
                b431Var.a((gc50) obj, (String) obj2);
                break;
            case 3:
                b431Var.a(new h8t((String) obj), (String) obj2);
                break;
            case 4:
                b431Var.a(new gc50((String) obj), (String) obj2);
                break;
            default:
                b431Var.a((gc50) obj, (String) obj2);
                break;
        }
        return rih1Var;
    }
}
