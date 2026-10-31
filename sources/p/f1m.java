package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f1m implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public f1m(List list) {
        this.a = (byte) 29;
        wg50 wg50Var = wg50.b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                list.get(((Number) obj).intValue());
                return null;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                return ((vy30) list.get(((Number) obj).intValue())).a;
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return ((gxm) list.get(((Number) obj).intValue())).a;
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                return ((w4i1) list.get(((Number) obj).intValue())).a;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                return String.valueOf(((d6q0) list.get(((Number) obj).intValue())).b().a);
            case 9:
                list.get(((Number) obj).intValue());
                return null;
            case 10:
                return String.valueOf(((h6q0) list.get(((Number) obj).intValue())).b().a);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                list.get(((Number) obj).intValue());
                return null;
            case grn1.d /* 12 */:
                return String.valueOf(((h6q0) list.get(((Number) obj).intValue())).b().a);
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                return (String) list.get(((Number) obj).intValue());
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                return nvr.b.invoke(list.get(((Number) obj).intValue()));
            case 17:
                list.get(((Number) obj).intValue());
                return null;
            case 18:
                return nvr.c.invoke(list.get(((Number) obj).intValue()));
            case 19:
                list.get(((Number) obj).intValue());
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iIntValue = ((Number) obj).intValue();
                return szr.h.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case 21:
                list.get(((Number) obj).intValue());
                return null;
            case 22:
                int iIntValue2 = ((Number) obj).intValue();
                return szr.S0.invoke(Integer.valueOf(iIntValue2), list.get(iIntValue2));
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case 24:
                list.get(((Number) obj).intValue());
                return null;
            case 25:
                return ((ftv) list.get(((Number) obj).intValue())).a;
            case 26:
                list.get(((Number) obj).intValue());
                return null;
            case 27:
                return ((x820) list.get(((Number) obj).intValue())).a;
            case 28:
                list.get(((Number) obj).intValue());
                return null;
            default:
                return wg50.b.get(list.get(((Number) obj).intValue()));
        }
    }

    public /* synthetic */ f1m(List list, byte b) {
        this.a = b;
        this.b = list;
    }
}
