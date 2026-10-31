package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a8n1 extends ozn1 {
    public final /* synthetic */ byte c;

    public /* synthetic */ a8n1(byte b) {
        this.c = b;
    }

    @Override // p.ozn1
    public px40 k(Context context, Looper looper, d520 d520Var, Object obj, nz40 nz40Var, oz40 oz40Var) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object obj2 = d520Var.g;
                Integer num = (Integer) d520Var.h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new lj81(context, looper, d520Var, bundle, nz40Var, oz40Var);
            case 1:
                throw td6.k(obj);
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 10:
            case 13:
            default:
                return super.k(context, looper, d520Var, obj, nz40Var, oz40Var);
            case 5:
                return new man1(context, looper, d520Var, (mf8) obj, (h8n1) nz40Var, (h8n1) oz40Var);
            case 7:
                return new gan1(context, looper, d520Var, (GoogleSignInOptions) obj, (h8n1) nz40Var, (h8n1) oz40Var);
            case 9:
                n2e n2eVar = (n2e) obj;
                zod.t(n2eVar, "Setting the API options is required.");
                return new vhp1(context, looper, d520Var, n2eVar.a, n2eVar.c, n2eVar.d, (h8n1) nz40Var, (h8n1) oz40Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new mzo1(context, looper, 161, d520Var, nz40Var, oz40Var);
            case grn1.d /* 12 */:
                return new ldo1(context, looper, d520Var, (h8n1) nz40Var, (h8n1) oz40Var);
            case 14:
                return new dqo1(context, looper, d520Var, (h8n1) nz40Var, (h8n1) oz40Var);
        }
    }

    @Override // p.ozn1
    public px40 l(Context context, Looper looper, d520 d520Var, Object obj, h8n1 h8n1Var, h8n1 h8n1Var2) {
        switch (this.c) {
            case 2:
                return new x9n1(context, looper, 308, d520Var, h8n1Var, h8n1Var2);
            case 3:
                return new f8n1(context, looper, 449, d520Var, h8n1Var, h8n1Var2);
            case 4:
                return new s9n1(context, looper, d520Var, (ixd1) obj, h8n1Var, h8n1Var2);
            case 5:
            case 7:
            case 9:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case grn1.d /* 12 */:
            default:
                return super.l(context, looper, d520Var, obj, h8n1Var, h8n1Var2);
            case 6:
                return new pan1(context, looper, d520Var, h8n1Var, h8n1Var2);
            case 8:
                return new cfn1(context, looper, 432, d520Var, h8n1Var, h8n1Var2);
            case 10:
                return new o1o1(context, looper, d520Var, h8n1Var, h8n1Var2);
            case 13:
                return new bvo1(context, looper, 380, d520Var, h8n1Var, h8n1Var2);
        }
    }
}
