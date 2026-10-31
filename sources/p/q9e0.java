package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q9e0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9e0(cr31 cr31Var, byte b) {
        super(3);
        this.a = b;
        this.b = cr31Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cr31 cr31Var = this.b;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                x4p1.e(cr31Var, u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), (b0k) obj2, 0);
                break;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                t1c.a(cwl1.l0(dug.f(u291.r(nim0Var, 48.0f), cbx.a(b0kVar).a.b.a(), cr31Var), 0L, cr31Var, 13), b0kVar, 0);
                break;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0Var, 120.0f), 13.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                t1c.a(cwl1.l0(dug.f(qim0VarB, cbx.a(b0kVar2).a.b.a(), cr31Var), 0L, cr31Var, 13), b0kVar2, 0);
                break;
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarH = u291.h(u291.v(nim0Var, 160.0f), 18.0f);
                uwr uwrVar3 = cbx.a;
                t1c.a(cwl1.l0(dug.f(qim0VarH, cbx.a(b0kVar3).a.b.a(), cr31Var), 0L, cr31Var, 13), b0kVar3, 0);
                break;
        }
        return rih1Var;
    }
}
