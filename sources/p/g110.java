package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g110 extends hab0 implements xu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g110(long j, long j2, boolean z, o95 o95Var, Function0 function0) {
        super(3);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = o95Var;
        this.e = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(190044908);
        qim0 qim0VarF = d1u.F(dug.f(i1p1.q(u291.D((qim0) obj, (era) null, 3), er31.b(72.0f)), this.a, er31.b(72.0f)), 0.4f, v9c.s(p7h.M(new u7h[]{new u7h(this.b), new u7h(u7h.b(this.b, 0.66f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), er31.b(72.0f));
        boolean z = this.c;
        qim0 qim0VarQ = nim0.a;
        if (z) {
            qim0VarQ = exd0.q(qim0VarQ, new wqe(this.d, (byte) 7));
        }
        qim0 qim0VarThen = qim0VarF.then(qim0VarQ);
        uwr uwrVar = cbx.a;
        mta mtaVar = cbx.b(x340Var).d;
        qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarThen);
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarJ);
        Function0 function0 = this.e;
        boolean zG = x340Var.g(function0);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new f110(function0, (byte) 0);
            x340Var.s0(objT);
        }
        qim0 qim0VarB = f8d1.b(qim0VarZ, rih1.a, (PointerInputEventHandler) objT);
        x340Var.r(false);
        return qim0VarB;
    }
}
