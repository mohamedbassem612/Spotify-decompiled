package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c3o1 {
    public static final c3o1 b = new c3o1(0);
    public static final c3o1 c = new c3o1(1);
    public static final c3o1 d = new c3o1(2);
    public static final c3o1 e = new c3o1(3);
    public static final c3o1 f = new c3o1(4);
    public static final c3o1 g = new c3o1(5);
    public static final c3o1 h = new c3o1(6);
    public static final c3o1 i = new c3o1(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ c3o1(byte b2) {
        this.a = b2;
    }

    public final boolean a(int i2) {
        jno1 jno1Var;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                switch (i2) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    case grn1.d /* 12 */:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
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
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                        break;
                }
                return true;
            case 2:
                return lqn1.b(i2) != 0;
            case 3:
                if (i2 == 0) {
                    jno1Var = jno1.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    jno1Var = jno1.PURCHASES_UPDATED_ACTION;
                } else if (i2 != 2) {
                    jno1Var = i2 != 3 ? null : jno1.ALTERNATIVE_BILLING_ACTION;
                } else {
                    jno1Var = jno1.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return jno1Var != null;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                switch (i2) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    case grn1.d /* 12 */:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i2 == 0 || i2 == 1;
        }
    }
}
