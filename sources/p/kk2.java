package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kk2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AgeVerificationDialogActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk2(AgeVerificationDialogActivity ageVerificationDialogActivity, byte b) {
        super(2);
        this.a = b;
        this.b = ageVerificationDialogActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        AgeVerificationDialogActivity ageVerificationDialogActivity = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i = AgeVerificationDialogActivity.n1;
                    rk2 rk2Var = (rk2) ageVerificationDialogActivity.l1.getValue();
                    if (rk2Var == null) {
                        x340Var2.i0(2012262434);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(2012262435);
                        boolean zI = x340Var2.i(ageVerificationDialogActivity);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            obj3 = objT;
                            jk2 jk2Var = new jk2(ageVerificationDialogActivity, (byte) 0);
                            x340Var2.s0(jk2Var);
                            obj3 = jk2Var;
                        }
                        Function0 function0 = (Function0) obj3;
                        boolean zI2 = x340Var2.i(ageVerificationDialogActivity);
                        Object objT2 = x340Var2.T();
                        Object obj4 = objT2;
                        if (zI2 || objT2 == m4cVar) {
                            jk2 jk2Var2 = new jk2(ageVerificationDialogActivity, (byte) 1);
                            x340Var2.s0(jk2Var2);
                            obj4 = jk2Var2;
                        }
                        Function0 function1 = (Function0) obj4;
                        boolean zI3 = x340Var2.i(ageVerificationDialogActivity);
                        Object objT3 = x340Var2.T();
                        Object obj5 = objT3;
                        if (zI3 || objT3 == m4cVar) {
                            jk2 jk2Var3 = new jk2(ageVerificationDialogActivity, (byte) 2);
                            x340Var2.s0(jk2Var3);
                            obj5 = jk2Var3;
                        }
                        kbb.b(rk2Var, function0, function1, (Function0) obj5, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(0, (wux) null, apo.r(1139298573, new kk2(ageVerificationDialogActivity, z ? 1 : 0), x340Var4), x340Var4, 3072, 7);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = ageVerificationDialogActivity.h1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(-1524242182, new kk2(ageVerificationDialogActivity, b2), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
