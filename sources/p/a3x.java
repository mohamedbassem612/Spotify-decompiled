package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a3x extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ufh0 b;
    public final /* synthetic */ ziu c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3x(ufh0 ufh0Var, ziu ziuVar, Function0 function0, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = ufh0Var;
        this.c = ziuVar;
        this.d = function0;
        this.e = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x0105  */
    /* JADX WARN: Code duplicated, block: B:27:0x0134  */
    /* JADX WARN: Code duplicated, block: B:31:0x0157  */
    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var;
        Object objT;
        m4c m4cVar;
        boolean zG;
        Object objT2;
        x340 x340Var2;
        Object objT3;
        m4c m4cVar2;
        boolean zG2;
        Object objT4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        ufh0 ufh0Var = this.b;
        Function0 function0 = this.d;
        switch (b) {
            case 0:
                x340 x340Var3 = (b0k) obj;
                if ((((Number) obj2).intValue() & 11) != 2) {
                    ufh0Var.c(x340Var3, 8);
                    x340Var = x340Var3;
                    x340Var.i0(-1549745439);
                    qim0 qim0VarX = t3k1.x(nim0Var, "background");
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var).a.c;
                    cua cuaVar = cbx.b(x340Var).f;
                    qim0 qim0VarF = dug.f(qim0VarX, j, er31.b(8.0f));
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = vrw.Y0;
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT);
                    ziu ziuVar = this.c;
                    boolean zB = ziuVar.f.d.b.b();
                    zG = x340Var.g(function0);
                    objT2 = x340Var.T();
                    if (zG) {
                        objT2 = new ivw(function0, (byte) 2);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new ivw(function0, (byte) 2);
                        x340Var.s0(objT2);
                    }
                    t1c.a(bin.x(qim0VarA, zB, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 14), x340Var, 0);
                    qim0 qim0VarX2 = t3k1.x(nim0Var, "image");
                    iu30 iu30Var = this.e;
                    c2p1.a(0, x340Var, ziuVar, iu30Var, qim0VarX2);
                    iho1.a(0, x340Var, ziuVar, iu30Var, t3k1.x(nim0Var, "bottom_row"));
                    x340Var.r(false);
                } else {
                    x340 x340Var4 = x340Var3;
                    if (!x340Var4.H()) {
                        ufh0Var.c(x340Var3, 8);
                        x340Var = x340Var3;
                        x340Var.i0(-1549745439);
                        qim0 qim0VarX3 = t3k1.x(nim0Var, "background");
                        uwr uwrVar2 = cbx.a;
                        long j2 = cbx.a(x340Var).a.c;
                        cua cuaVar2 = cbx.b(x340Var).f;
                        qim0 qim0VarF2 = dug.f(qim0VarX3, j2, er31.b(8.0f));
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = vrw.Y0;
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarA2 = s161.a(qim0VarF2, (iu30) objT);
                        ziu ziuVar2 = this.c;
                        boolean zB2 = ziuVar2.f.d.b.b();
                        zG = x340Var.g(function0);
                        objT2 = x340Var.T();
                        if (zG || objT2 == m4cVar) {
                            objT2 = new ivw(function0, (byte) 2);
                            x340Var.s0(objT2);
                        }
                        t1c.a(bin.x(qim0VarA2, zB2, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 14), x340Var, 0);
                        qim0 qim0VarX4 = t3k1.x(nim0Var, "image");
                        iu30 iu30Var2 = this.e;
                        c2p1.a(0, x340Var, ziuVar2, iu30Var2, qim0VarX4);
                        iho1.a(0, x340Var, ziuVar2, iu30Var2, t3k1.x(nim0Var, "bottom_row"));
                        x340Var.r(false);
                    } else {
                        x340Var4.b0();
                    }
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                if ((((Number) obj2).intValue() & 11) != 2) {
                    ufh0Var.c(x340Var5, 8);
                    x340Var2 = x340Var5;
                    x340Var2.i0(730914908);
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var2).f;
                    qim0 qim0VarQ = i1p1.q(dug.f(t3k1.x(nim0Var, "background"), cbx.a(x340Var2).a.b.a(), er31.b(8.0f)), er31.b(8.0f));
                    objT3 = x340Var2.T();
                    m4cVar2 = fkj0.X;
                    if (objT3 == m4cVar2) {
                        objT3 = vrw.Z0;
                        x340Var2.s0(objT3);
                    }
                    qim0 qim0VarA3 = s161.a(qim0VarQ, (iu30) objT3);
                    ziu ziuVar3 = this.c;
                    boolean zB3 = ziuVar3.f.d.b.b();
                    zG2 = x340Var2.g(function0);
                    objT4 = x340Var2.T();
                    if (zG2) {
                        objT4 = new ivw(function0, (byte) 3);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new ivw(function0, (byte) 3);
                        x340Var2.s0(objT4);
                    }
                    t1c.a(bin.x(qim0VarA3, zB3, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 14), x340Var2, 0);
                    qim0 qim0VarQ2 = i1p1.q(t3k1.x(nim0Var, "image"), er31.d(8.0f, 8.0f, 0.0f, 0.0f, 12));
                    iu30 iu30Var3 = this.e;
                    f2p1.a(0, x340Var2, ziuVar3, iu30Var3, qim0VarQ2);
                    e9p1.c(ziuVar3, cbx.d(x340Var2).k, new idx(8), t3k1.x(nim0Var, "bottom_row"), iu30Var3, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340 x340Var6 = x340Var5;
                    if (!x340Var6.H()) {
                        ufh0Var.c(x340Var5, 8);
                        x340Var2 = x340Var5;
                        x340Var2.i0(730914908);
                        uwr uwrVar4 = cbx.a;
                        cua cuaVar4 = cbx.b(x340Var2).f;
                        qim0 qim0VarQ3 = i1p1.q(dug.f(t3k1.x(nim0Var, "background"), cbx.a(x340Var2).a.b.a(), er31.b(8.0f)), er31.b(8.0f));
                        objT3 = x340Var2.T();
                        m4cVar2 = fkj0.X;
                        if (objT3 == m4cVar2) {
                            objT3 = vrw.Z0;
                            x340Var2.s0(objT3);
                        }
                        qim0 qim0VarA4 = s161.a(qim0VarQ3, (iu30) objT3);
                        ziu ziuVar4 = this.c;
                        boolean zB4 = ziuVar4.f.d.b.b();
                        zG2 = x340Var2.g(function0);
                        objT4 = x340Var2.T();
                        if (zG2 || objT4 == m4cVar2) {
                            objT4 = new ivw(function0, (byte) 3);
                            x340Var2.s0(objT4);
                        }
                        t1c.a(bin.x(qim0VarA4, zB4, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 14), x340Var2, 0);
                        qim0 qim0VarQ4 = i1p1.q(t3k1.x(nim0Var, "image"), er31.d(8.0f, 8.0f, 0.0f, 0.0f, 12));
                        iu30 iu30Var4 = this.e;
                        f2p1.a(0, x340Var2, ziuVar4, iu30Var4, qim0VarQ4);
                        e9p1.c(ziuVar4, cbx.d(x340Var2).k, new idx(8), t3k1.x(nim0Var, "bottom_row"), iu30Var4, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var6.b0();
                    }
                }
                break;
        }
        return rih1Var;
    }
}
