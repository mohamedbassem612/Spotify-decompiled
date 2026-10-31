package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iio0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ iio0(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return qfo0.Z0.invoke(list.get(((Number) obj).intValue()));
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                return ((eno0) list.get(((Number) obj).intValue())).a;
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return ((fdq0) list.get(((Number) obj).intValue())).a;
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                return ((yv31) list.get(((Number) obj).intValue())).a;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                c380 c380Var = (c380) list.get(((Number) obj).intValue());
                return c380Var.size() == 1 ? ((s3t0) o7h.q0(c380Var)).a : f4i1.e(((s3t0) c380Var.get(0)).a, ((s3t0) c380Var.get(1)).a);
            case 10:
                list.get(((Number) obj).intValue());
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                int iIntValue = ((Number) obj).intValue();
                return fnt0.W0.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case grn1.d /* 12 */:
                list.get(((Number) obj).intValue());
                return null;
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                list.get(((Number) obj).intValue());
                return null;
            case 15:
                return lcz0.X0.invoke(list.get(((Number) obj).intValue()));
            case 16:
                list.get(((Number) obj).intValue());
                return null;
            case 17:
                list.get(((Number) obj).intValue());
                return null;
            case 18:
                list.get(((Number) obj).intValue());
                return null;
            case 19:
                list.get(((Number) obj).intValue());
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return oa01.X0.invoke(list.get(((Number) obj).intValue()));
            case 21:
                list.get(((Number) obj).intValue());
                return null;
            case 22:
                int iIntValue2 = ((Number) obj).intValue();
                wj01 wj01Var = (wj01) list.get(iIntValue2);
                if (wj01Var.getId().length() <= 0) {
                    return f4i1.c(iIntValue2, "body-");
                }
                return wj01Var.getId() + "-" + iIntValue2;
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case 24:
                int iIntValue3 = ((Number) obj).intValue();
                return atz0.V0.invoke(Integer.valueOf(iIntValue3), list.get(iIntValue3));
            case 25:
                list.get(((Number) obj).intValue());
                return null;
            case 26:
                return ((cr01) list.get(((Number) obj).intValue())).a;
            case 27:
                list.get(((Number) obj).intValue());
                return null;
            case 28:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
