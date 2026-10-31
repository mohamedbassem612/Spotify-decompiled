package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qtb1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xsb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtb1(xsb1 xsb1Var, byte b) {
        super(3);
        this.a = b;
        this.b = xsb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cr31 cr31VarB;
        cr31 cr31VarB2;
        byte b = this.a;
        xsb1 xsb1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-1588932084);
                qim0 qim0VarR = d7e.r(1.0f, u291.f((qim0) obj, 1.0f), false);
                int iOrdinal = xsb1Var.ordinal();
                if (iOrdinal == 2) {
                    x340Var.i0(2044630439);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    cr31VarB = er31.b(2.0f);
                    x340Var.r(false);
                } else if (iOrdinal == 3 || iOrdinal == 5) {
                    x340Var.i0(2044635319);
                    x340Var.r(false);
                    cr31VarB = er31.a;
                } else if (iOrdinal != 6) {
                    x340Var.i0(2044636228);
                    x340Var.r(false);
                    cr31VarB = er31.b(0.0f);
                } else {
                    x340Var.i0(2044630439);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    cr31VarB = er31.b(2.0f);
                    x340Var.r(false);
                }
                qim0 qim0VarQ = i1p1.q(qim0VarR, cr31VarB);
                x340Var.r(false);
                return qim0VarQ;
            default:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-708109431);
                qim0 qim0VarR2 = u291.r((qim0) obj, 155.0f);
                int iOrdinal2 = xsb1Var.ordinal();
                if (iOrdinal2 == 2) {
                    x340Var2.i0(-1888325372);
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var2).f;
                    cr31VarB2 = er31.b(2.0f);
                    x340Var2.r(false);
                } else if (iOrdinal2 == 3 || iOrdinal2 == 5) {
                    x340Var2.i0(-1888320492);
                    x340Var2.r(false);
                    cr31VarB2 = er31.a;
                } else if (iOrdinal2 != 6) {
                    x340Var2.i0(-1888319583);
                    x340Var2.r(false);
                    cr31VarB2 = er31.b(0.0f);
                } else {
                    x340Var2.i0(-1888325372);
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar4 = cbx.b(x340Var2).f;
                    cr31VarB2 = er31.b(2.0f);
                    x340Var2.r(false);
                }
                qim0 qim0VarQ2 = i1p1.q(qim0VarR2, cr31VarB2);
                x340Var2.r(false);
                return qim0VarQ2;
        }
    }
}
