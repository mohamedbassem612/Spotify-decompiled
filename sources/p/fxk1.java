package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fxk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ max e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ j2i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxk1(qim0 qim0Var, float f, String str, iu30 iu30Var, boolean z, max maxVar, j2i j2iVar) {
        super(2);
        j2i j2iVar2 = vrj.a;
        this.g = qim0Var;
        this.d = f;
        this.c = str;
        this.f = iu30Var;
        this.b = z;
        this.e = maxVar;
        this.h = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                qim0 qim0VarK = d9y0.k(this.g, this.d);
                gdx gdxVarS = yla.s(x340Var2);
                iu30 iu30Var = this.f;
                boolean zG = x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new izj1(iu30Var, (byte) 20);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                String str = this.c;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.f(new gbx(new y50(str), function0), qim0VarK, this.e, gdxVarS, (idn0) null, this.b ? vrj.a : null, (vu30) null, this.h, x340Var2, 0, 80);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                m87.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(1597441));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxk1(boolean z, String str, float f, max maxVar, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.b = z;
        this.c = str;
        this.d = f;
        this.e = maxVar;
        this.f = iu30Var;
        this.g = qim0Var;
        this.h = j2iVar;
    }
}
