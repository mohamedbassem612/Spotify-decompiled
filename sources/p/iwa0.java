package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iwa0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n2c0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwa0(n2c0 n2c0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 1;
        this.b = n2c0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        max haxVar = jax.a;
        z50 z50Var = z50.c;
        rih1 rih1Var = rih1.a;
        n2c0 n2c0Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new ux90(iu30Var, (byte) 28);
                        x340Var2.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT);
                    idx idxVar = new idx(19);
                    gdx gdxVarR = yla.r(x340Var2);
                    if (n2c0Var.g && n2c0Var.h) {
                        x340Var2.i0(-1074752901);
                    } else {
                        x340Var2.i0(-1074690064);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131957038));
                    }
                    x340Var2.r(false);
                    foo1.c(gbxVar, idxVar, anm1.N("legal_next_button", new tq60(een.Q0)), haxVar, gdxVarR, null, null, null, null, null, mui.a, x340Var2, 0, 48, 1992);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    int i = n2c0Var.a;
                    int i2 = n2c0Var.b;
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new sya0(iu30Var, (byte) 9);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zG3 = x340Var4.g(iu30Var);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new sya0(iu30Var, (byte) 10);
                        x340Var4.s0(objT3);
                    }
                    eko1.m(i, i2, (qim0) null, (sgr0) null, 0L, function0, (Function0) objT3, x340Var4, 0, 28);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    boolean zG4 = x340Var6.g(iu30Var);
                    Object objT4 = x340Var6.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new sya0(iu30Var, (byte) 11);
                        x340Var6.s0(objT4);
                    }
                    gbx gbxVar2 = new gbx(z50Var, (Function0) objT4);
                    idx idxVar2 = new idx(19);
                    gdx gdxVarR2 = yla.r(x340Var6);
                    if (n2c0Var.g && n2c0Var.h) {
                        x340Var6.i0(1154461227);
                    } else {
                        x340Var6.i0(1154524095);
                        haxVar = new hax(cwl1.o0(x340Var6, 2131957218));
                    }
                    x340Var6.r(false);
                    foo1.c(gbxVar2, idxVar2, anm1.N("legal_next_button", new tq60(een.Q0)), haxVar, gdxVarR2, null, null, null, null, null, fvi.a, x340Var6, 0, 48, 1992);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwa0(iu30 iu30Var, n2c0 n2c0Var, byte b) {
        super(2);
        this.a = b;
        this.c = iu30Var;
        this.b = n2c0Var;
    }
}
