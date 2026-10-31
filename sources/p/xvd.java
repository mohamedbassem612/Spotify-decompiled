package p;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.style.URLSpan;
import android.util.Rational;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.profile.editprofile.proto.Userprofileview;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xvd implements Comparator {
    public final /* synthetic */ byte a;
    public final Object b;

    public xvd(LinkedHashMap linkedHashMap, mur murVar) {
        this.a = (byte) 18;
        this.b = new gmt(linkedHashMap, murVar, (byte) 1);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iQ;
        re9 re9Var;
        re9 re9Var2;
        byte b = this.a;
        xzg1 xzg1Var = xzg1.a;
        Integer numValueOf = null;
        boolean z = false;
        Object obj3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                List list = ((il51) obj3).a;
                return pap1.t(Boolean.valueOf(((x9a) obj2).g(list)), Boolean.valueOf(((x9a) obj).g(list)));
            case 1:
                Userprofileview.PronounsByLanguage pronounsByLanguage = (Userprofileview.PronounsByLanguage) obj2;
                String language = ((Userprofileview.PronounsByLanguage) obj).getLanguage();
                String str = ((oee) obj3).d;
                if (ihc1.h0(language, str, false)) {
                    return -1;
                }
                return ihc1.h0(pronounsByLanguage.getLanguage(), str, false) ? 1 : 0;
            case 2:
                int iCompare = ((p0d) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : pap1.t((Comparable) ((Map.Entry) obj).getKey(), (Comparable) ((Map.Entry) obj2).getKey());
            case 3:
                int iCompare2 = ((p0d) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                luq0 luq0Var = ((kx7) obj2).d;
                luq0 luq0Var2 = luq0.d;
                return pap1.t(Boolean.valueOf(luq0Var == luq0Var2), Boolean.valueOf(((kx7) obj).d == luq0Var2));
            case 4:
                int iCompare3 = ((xvd) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : pap1.t(((m0u) obj).c.a, ((m0u) obj2).c.a);
            case 5:
                int iCompare4 = ((p0d) obj3).compare(obj, obj2);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                m0u m0uVar = (m0u) obj2;
                Boolean boolValueOf = Boolean.valueOf(m0uVar.b && m0uVar.a);
                m0u m0uVar2 = (m0u) obj;
                if (m0uVar2.b && m0uVar2.a) {
                    z = true;
                }
                return pap1.t(boolValueOf, Boolean.valueOf(z));
            case 6:
                int iCompare5 = ((xvd) obj3).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : pap1.t(Long.valueOf(((m0u) obj2).g), Long.valueOf(((m0u) obj).g));
            case 7:
                int iCompare6 = ((p0d) obj3).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : pap1.t(Long.valueOf(((m0u) obj2).g), Long.valueOf(((m0u) obj).g));
            case 8:
                Map map = ((eqr) obj3).b;
                Integer num = (Integer) map.get(((lhm) obj).getType());
                Integer numValueOf2 = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = (Integer) map.get(((lhm) obj2).getType());
                return pap1.t(numValueOf2, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            case 9:
                Map map2 = ((b0s) obj3).f;
                ((mib1) obj).getClass();
                Integer num3 = (Integer) map2.get(xzg1Var);
                Integer numValueOf3 = Integer.valueOf(num3 != null ? num3.intValue() : Integer.MAX_VALUE);
                ((mib1) obj2).getClass();
                Integer num4 = (Integer) map2.get(xzg1Var);
                return pap1.t(numValueOf3, Integer.valueOf(num4 != null ? num4.intValue() : Integer.MAX_VALUE));
            case 10:
                Map map3 = ((oks) obj3).g;
                Integer num5 = (Integer) map3.get(((xu40) obj).getType());
                Integer numValueOf4 = Integer.valueOf(num5 != null ? num5.intValue() : Integer.MAX_VALUE);
                Integer num6 = (Integer) map3.get(((xu40) obj2).getType());
                return pap1.t(numValueOf4, Integer.valueOf(num6 != null ? num6.intValue() : Integer.MAX_VALUE));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                Map map4 = ((oos) obj3).b;
                Integer num7 = (Integer) map4.get(((xz71) obj).getType());
                Integer numValueOf5 = Integer.valueOf(num7 != null ? num7.intValue() : Integer.MAX_VALUE);
                Integer num8 = (Integer) map4.get(((xz71) obj2).getType());
                return pap1.t(numValueOf5, Integer.valueOf(num8 != null ? num8.intValue() : Integer.MAX_VALUE));
            case grn1.d /* 12 */:
                Map map5 = ((avs) obj3).b;
                ((mib1) obj).getClass();
                Integer num9 = (Integer) map5.get(xzg1Var);
                Integer numValueOf6 = Integer.valueOf(num9 != null ? num9.intValue() : Integer.MAX_VALUE);
                ((mib1) obj2).getClass();
                Integer num10 = (Integer) map5.get(xzg1Var);
                return pap1.t(numValueOf6, Integer.valueOf(num10 != null ? num10.intValue() : Integer.MAX_VALUE));
            case 13:
                SpannedString spannedString = (SpannedString) obj3;
                return pap1.t(Integer.valueOf(spannedString.getSpanStart((Annotation) obj)), Integer.valueOf(spannedString.getSpanStart((Annotation) obj2)));
            case 14:
                waq0 waq0Var = (waq0) obj3;
                return pap1.t((Comparable) waq0Var.invoke(obj), (Comparable) waq0Var.invoke(obj2));
            case 15:
                Set set = (Set) obj3;
                return pap1.t(Boolean.valueOf(set.contains(((g471) obj).a())), Boolean.valueOf(set.contains(((g471) obj2).a())));
            case 16:
                int iCompare7 = ((cvt) obj3).compare(obj, obj2);
                return iCompare7 != 0 ? iCompare7 : pap1.t((String) obj, (String) obj2);
            case 17:
                a8b0 a8b0Var = (a8b0) obj;
                iu30 iu30Var = (iu30) obj3;
                a8b0Var.getClass();
                String string = iu30Var.invoke(a8b0Var).toString();
                a8b0 a8b0Var2 = (a8b0) obj2;
                a8b0Var2.getClass();
                return pap1.t(string, iu30Var.invoke(a8b0Var2).toString());
            case 18:
                return ((gmt) obj3).c((ewt) obj, (ewt) obj2);
            case 19:
                return ((Collator) ((j2e0) obj3).c).compare(((jl50) obj).b, ((jl50) obj2).b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                SpannableString spannableString = (SpannableString) obj3;
                return pap1.t(Integer.valueOf(spannableString.getSpanStart((URLSpan) obj)), Integer.valueOf(spannableString.getSpanStart((URLSpan) obj2)));
            case 21:
                rxx0 rxx0Var = (rxx0) obj3;
                return pap1.t(Integer.valueOf(((vpx0) obj).c(rxx0Var)), Integer.valueOf(((vpx0) obj2).c(rxx0Var)));
            case 22:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
            case 23:
                int iCompare8 = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare8 != 0) {
                    return iCompare8;
                }
                hmb0 hmb0Var = ((v161) obj).c;
                hmb0 hmb0Var2 = ((v161) obj2).c;
                return hmb0Var.y() == hmb0Var2.y() ? u890.q(hmb0Var.w(), hmb0Var2.w()) : Float.compare(hmb0Var.y(), hmb0Var2.y());
            case 24:
                int iCompare9 = ((xvd) obj3).compare(obj, obj2);
                return iCompare9 != 0 ? iCompare9 : pap1.t(Integer.valueOf(((v161) obj).f), Integer.valueOf(((v161) obj2).f));
            case 25:
                ArrayList arrayList = (ArrayList) obj3;
                int iIndexOf = arrayList.indexOf(((g471) obj).a());
                Integer numValueOf7 = Integer.valueOf(iIndexOf);
                if (iIndexOf == -1) {
                    numValueOf7 = null;
                }
                Integer numValueOf8 = Integer.valueOf(numValueOf7 != null ? numValueOf7.intValue() : arrayList.size());
                int iIndexOf2 = arrayList.indexOf(((g471) obj2).a());
                numValueOf = iIndexOf2 != -1 ? Integer.valueOf(iIndexOf2) : null;
                return pap1.t(numValueOf8, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : arrayList.size()));
            case 26:
                hwg hwgVar = (hwg) obj3;
                return pap1.t(Integer.valueOf(hwgVar.a(((mvj1) obj2).c)), Integer.valueOf(hwgVar.a(((mvj1) obj).c)));
            case 27:
                int iCompare10 = ((be21) obj3).compare(obj, obj2);
                return iCompare10 != 0 ? iCompare10 : pap1.t(((k1c1) obj).a, ((k1c1) obj2).a);
            case 28:
                iae1 iae1Var = (iae1) obj3;
                return pap1.t(Float.valueOf(iae1Var.a.b((dce1) obj2)), Float.valueOf(iae1Var.a.b((dce1) obj)));
            default:
                l0l l0lVar = (l0l) obj2;
                Map map6 = (Map) obj3;
                nya nyaVar = (nya) map6.get(((l0l) obj).d());
                Integer numValueOf9 = (nyaVar == null || (re9Var2 = nyaVar.a) == null) ? null : Integer.valueOf(re9Var2.b.a);
                nya nyaVar2 = (nya) map6.get(l0lVar.d());
                if (nyaVar2 != null && (re9Var = nyaVar2.a) != null) {
                    numValueOf = Integer.valueOf(re9Var.b.a);
                }
                if (numValueOf9 != null && numValueOf == null) {
                    return -1;
                }
                if (numValueOf9 == null && numValueOf != null) {
                    return 1;
                }
                if (numValueOf9 == null || numValueOf == null || (iQ = u890.q(numValueOf.intValue(), numValueOf9.intValue())) == 0) {
                    return 0;
                }
                return iQ;
        }
    }

    public /* synthetic */ xvd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
