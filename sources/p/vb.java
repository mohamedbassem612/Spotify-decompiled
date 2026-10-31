package p;

import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class vb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[TermsConditionAcceptance.values().length];
        try {
            iArr[TermsConditionAcceptance.EXPLICIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TermsConditionAcceptance.IMPLICIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PrivacyPolicyAcceptance.values().length];
        try {
            iArr2[PrivacyPolicyAcceptance.EXPLICIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PrivacyPolicyAcceptance.IMPLICIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PrivacyPolicyAcceptance.NON.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[MarketingMessagesOption.values().length];
        try {
            iArr3[MarketingMessagesOption.OPT_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[MarketingMessagesOption.OPT_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[MarketingMessagesOption.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
