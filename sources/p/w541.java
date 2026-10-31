package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w541 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r541 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w541(r541 r541Var, boolean z) {
        super(3);
        this.c = r541Var;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r541 r541Var = this.c;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                qxd0.z(r541Var.c, mqo1.A(r541Var.d), (qim0) null, r541Var.k, this.b, (String) null, (String) null, (b0k) obj2, 0, 100);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("title", pqo.h(nim0.a, this.b));
                String str = r541Var.b;
                uwr uwrVar = cbx.a;
                uwo1.e(str, qim0VarN, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1712);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w541(boolean z, r541 r541Var) {
        super(3);
        this.b = z;
        this.c = r541Var;
    }
}
