package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mn10 {
    public static final mn10 a = new mn10();
    public static final HashMap b = new HashMap();

    public static final void a(jn10 jn10Var, kn10 kn10Var) {
        b120.d(new ln10(jn10Var, kn10Var));
    }

    public static final boolean b(kn10 kn10Var) {
        kn10 kn10VarH;
        boolean z;
        boolean z2 = false;
        if (kn10.Unknown != kn10Var) {
            if (kn10.Core != kn10Var) {
                String string = wf10.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + kn10Var, null);
                if (string == null || !string.equals("18.2.3")) {
                    int i = kn10Var.a;
                    if ((i & 255) > 0) {
                        kn10VarH = gxo1.h(i & (-256));
                    } else if ((65280 & i) > 0) {
                        kn10VarH = gxo1.h(i & (-65536));
                    } else {
                        kn10VarH = (16711680 & i) > 0 ? gxo1.h(i & (-16777216)) : gxo1.h(0);
                    }
                    if (kn10VarH == kn10Var) {
                        switch (kn10Var.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            default:
                                z2 = true;
                                break;
                        }
                        return b120.b("FBSDKFeature" + kn10Var, wf10.b(), z2);
                    }
                    if (b(kn10VarH)) {
                        switch (kn10Var.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                                z = false;
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            default:
                                z = true;
                                break;
                        }
                        if (b120.b("FBSDKFeature" + kn10Var, wf10.b(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
