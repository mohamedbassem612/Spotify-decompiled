package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ltj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltj(String str, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 3;
        this.b = str;
        this.d = qim0Var;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        boolean z = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ucp1.c(czo1.p(1), str, b0kVar, qim0Var, z);
                break;
            case 1:
                x4p1.b(czo1.p(1), str, b0kVar, qim0Var, z);
                break;
            case 2:
                a8o.o(czo1.p(1), str, b0kVar, qim0Var, z);
                break;
            case 3:
                zno1.b(czo1.p(1), str, b0kVar, qim0Var, z);
                break;
            case 4:
                s1p1.b(czo1.p(1), str, b0kVar, qim0Var, z);
                break;
            case 5:
                j6p1.h(czo1.p(7), str, b0kVar, qim0Var, z);
                break;
            case 6:
                d1u.t(czo1.p(1), str, b0kVar, qim0Var, z);
                break;
            default:
                c97.e(czo1.p(1), str, b0kVar, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ltj(String str, boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ltj(boolean z, String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = z;
        this.b = str;
        this.d = qim0Var;
    }
}
