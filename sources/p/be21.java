package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class be21 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ be21(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return pap1.t(Integer.valueOf(((vd21) obj).b), Integer.valueOf(((vd21) obj2).b));
            case 1:
                return pap1.t((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 2:
                return pap1.t((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 3:
                return pap1.t((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return pap1.t((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return pap1.t(Integer.valueOf(((wy41) obj).ordinal()), Integer.valueOf(((wy41) obj2).ordinal()));
            case 6:
                return pap1.t(((mo21) obj).a, ((mo21) obj2).a);
            case 7:
                return pap1.t((Integer) ((mmr0) obj2).b, (Integer) ((mmr0) obj).b);
            case 8:
                return pap1.t((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 9:
                return pap1.t(Long.valueOf(((gu71) ((mmr0) obj2).b).b), Long.valueOf(((gu71) ((mmr0) obj).b).b));
            case 10:
                return pap1.t(Long.valueOf(((t081) obj).o), Long.valueOf(((t081) obj2).o));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return pap1.t(Long.valueOf(((ll91) obj).b), Long.valueOf(((ll91) obj2).b));
            case grn1.d /* 12 */:
                return pap1.t(Boolean.valueOf(((byg) obj).d == null), Boolean.valueOf(((byg) obj2).d == null));
            case 13:
                return pap1.t((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 14:
                return pap1.t(Long.valueOf(((iqc) ((Map.Entry) obj).getValue()).c), Long.valueOf(((iqc) ((Map.Entry) obj2).getValue()).c));
            case 15:
                return pap1.t(Integer.valueOf(((y3b1) obj2).b.k), Integer.valueOf(((y3b1) obj).b.k));
            case 16:
                return pap1.t(Long.valueOf(((np51) ((Map.Entry) obj).getKey()).g), Long.valueOf(((np51) ((Map.Entry) obj2).getKey()).g));
            case 17:
                return pap1.t(Integer.valueOf(((xsb1) ((Map.Entry) obj).getKey()).b), Integer.valueOf(((xsb1) ((Map.Entry) obj2).getKey()).b));
            case 18:
                return pap1.t((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 19:
                return pap1.t(Boolean.valueOf(((k1c1) obj2).b), Boolean.valueOf(((k1c1) obj).b));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return pap1.t(((mkd1) obj).a, ((mkd1) obj2).a);
            case 21:
                return pap1.t(((okd1) obj).a, ((okd1) obj2).a);
            case 22:
                return pap1.t(Integer.valueOf(((gwe1) obj).b), Integer.valueOf(((gwe1) obj2).b));
            case 23:
                return pap1.t(Integer.valueOf(((Number) ((mmr0) obj2).b).intValue()), Integer.valueOf(((Number) ((mmr0) obj).b).intValue()));
            case 24:
                return pap1.t(Integer.valueOf(((mbe1) obj).a), Integer.valueOf(((mbe1) obj2).a));
            case 25:
                return pap1.t(Long.valueOf(((che) obj).a), Long.valueOf(((che) obj2).a));
            case 26:
                return pap1.t((Integer) ((mmr0) obj2).a, (Integer) ((mmr0) obj).a);
            case 27:
                String str = ((w4i1) obj).b;
                Locale locale = Locale.ROOT;
                return pap1.t(str.toLowerCase(locale), ((w4i1) obj2).b.toLowerCase(locale));
            case 28:
                return pap1.t(((f6m) obj).b.n, ((f6m) obj2).b.n);
            default:
                mo6 mo6Var = ((io6) obj).a;
                mo6 mo6Var2 = mo6.c;
                return pap1.t(Integer.valueOf(mo6Var == mo6Var2 ? 0 : 1), Integer.valueOf(((io6) obj2).a != mo6Var2 ? 1 : 0));
        }
    }
}
