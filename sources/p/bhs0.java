package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bhs0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gob b;
    public final /* synthetic */ g5f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bhs0(gob gobVar, g5f g5fVar, byte b) {
        super(3);
        this.a = b;
        this.b = gobVar;
        this.c = g5fVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g5f g5fVar = this.c;
        gob gobVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(gobVar);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new gyq0(gobVar, (byte) 27);
                    x340Var.s0(objT);
                }
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, (Function0) objT), jdx.c, null, null, yla.s(x340Var), null, null, null, null, null, x6j.a, x340Var, 0, 48, 2012);
                boolean zG2 = x340Var.g(g5fVar);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new gyq0(g5fVar, (byte) 28);
                    x340Var.s0(objT2);
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), null, null, yla.s(x340Var), null, null, null, null, null, x6j.b, x340Var, 0, 48, 2012);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                cvx cvxVar2 = cbx.b(b0kVar).b;
                k5p1.d(qim0VarB, new d36(16.0f, true, new g21(een.Q0, (byte) 29)), null, null, 0, 0, apo.r(613615192, new bhs0(gobVar, g5fVar, (byte) 0), b0kVar), b0kVar, 1572864, 60);
                break;
        }
        return rih1Var;
    }
}
