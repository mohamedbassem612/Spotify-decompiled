package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zz71 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n081 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz71(n081 n081Var, byte b) {
        super(3);
        this.a = b;
        this.b = n081Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n081 n081Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                a081.c(n081Var.h, null, (b0k) obj2, 0);
                break;
            case 1:
                ((Number) obj3).intValue();
                a081.a(n081Var.c, n081Var.b, (b0k) obj2, 0);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = n081Var.a;
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar).k, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar, 0, 0, 1722);
                break;
        }
        return rih1Var;
    }
}
