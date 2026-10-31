package p;

import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mv5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AppRaterActivity b;
    public final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv5(AppRaterActivity appRaterActivity, Intent intent, byte b) {
        super(2);
        this.a = b;
        this.b = appRaterActivity;
        this.c = intent;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Intent intent = this.c;
        AppRaterActivity appRaterActivity = this.b;
        byte b2 = 1;
        boolean z = false;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                idx idxVar = new idx(13);
                boolean zI = x340Var2.i(appRaterActivity) | x340Var2.i(intent);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    obj3 = objT;
                    nx2 nx2Var = new nx2(appRaterActivity, intent, (byte) 16);
                    x340Var2.s0(nx2Var);
                    obj3 = nx2Var;
                }
                obj3 = objT;
                Function0 function0 = (Function0) obj3;
                if (ihc1.y0("rate_app_no_thanks")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50("rate_app_no_thanks"), function0), idxVar, null, null, null, null, null, null, null, null, m6i.c, x340Var2, 0, 48, 2044);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    boolean zI2 = x340Var4.i(appRaterActivity);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == fkj0.X) {
                        obj4 = objT2;
                        lv5 lv5Var = new lv5(appRaterActivity, z ? (byte) 1 : (byte) 0);
                        x340Var4.s0(lv5Var);
                        obj4 = lv5Var;
                    }
                    obj4 = objT2;
                    mqo1.e((Function0) obj4, null, null, m6i.a, m6i.b, apo.r(1868876898, new mv5(appRaterActivity, intent, z ? (byte) 1 : (byte) 0), x340Var4), apo.r(109517027, new xb2(appRaterActivity, (byte) 19), x340Var4), x340Var4, 1797120, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(997100896, new mv5(appRaterActivity, intent, b2), x340Var6), x340Var6, 3078, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
