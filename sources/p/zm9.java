package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zm9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm9(iu30 iu30Var, boolean z) {
        super(2);
        this.a = (byte) 1;
        this.b = z;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                j2p1.d(z, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new zi80(iu30Var, (byte) 5);
                        x340Var2.s0(objT);
                    }
                    h7p1.g(0, (Function0) objT, x340Var2, z);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new ijd0(iu30Var, (byte) 6);
                        x340Var4.s0(objT2);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT2), new idx(4), anm1.N("LocalFilesRationaleDialogAcceptButton", nim0Var), null, null, null, null, null, null, null, apo.r(-2038979748, new k750((byte) 8, z), x340Var4), x340Var4, 0, 48, 2040);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                u1p1.m(z, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                    return rih1Var;
                }
                qim0 qim0VarN = anm1.N("inferred-action", nim0Var);
                gdx gdxVarS = yla.s(x340Var6);
                String strO0 = cwl1.o0(x340Var6, 2131954214);
                boolean zG3 = x340Var6.g(iu30Var);
                Object objT3 = x340Var6.T();
                if (zG3 || objT3 == fkj0.X) {
                    objT3 = new smt0(iu30Var, (byte) 17);
                    x340Var6.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.f(new gbx(new y50(strO0), function0), qim0VarN, null, gdxVarS, null, z47.s(z), null, k9j.d, x340Var6, 12582912, 84);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                fae1.g(z, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm9(byte b, int i, iu30 iu30Var, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm9(iu30 iu30Var, boolean z, byte b) {
        super(2);
        this.a = b;
        this.c = iu30Var;
        this.b = z;
    }
}
