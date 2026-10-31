package com.spotify.login.signupapi.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.cy30;
import p.dm5;
import p.dsl0;
import p.f4i1;
import p.h661;
import p.kaa0;
import p.kk0;
import p.nma0;
import p.o661;
import p.p661;
import p.u890;
import p.xcg1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u0000 y2\u00020\u0001:\u0002yzB·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cB³\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000b¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010*J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010*J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u0010*J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010*JÀ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bB\u00104J\u0010\u0010C\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bC\u0010\"J\u001a\u0010F\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GJ'\u0010O\u001a\u00020&2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bM\u0010NR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010P\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010P\u0012\u0004\bU\u0010S\u001a\u0004\bT\u0010*R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010P\u0012\u0004\bW\u0010S\u001a\u0004\bV\u0010*R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010P\u0012\u0004\bY\u0010S\u001a\u0004\bX\u0010*R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010P\u0012\u0004\b[\u0010S\u001a\u0004\bZ\u0010*R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010P\u0012\u0004\b]\u0010S\u001a\u0004\b\\\u0010*R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010P\u0012\u0004\b_\u0010S\u001a\u0004\b^\u0010*R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010P\u0012\u0004\ba\u0010S\u001a\u0004\b`\u0010*R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010b\u0012\u0004\bd\u0010S\u001a\u0004\bc\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010e\u001a\u0004\bf\u00104R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\bh\u0010S\u001a\u0004\bg\u0010*R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010i\u0012\u0004\bk\u0010S\u001a\u0004\bj\u00107R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010l\u0012\u0004\bn\u0010S\u001a\u0004\bm\u00109R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010o\u0012\u0004\bq\u0010S\u001a\u0004\bp\u0010;R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010r\u0012\u0004\bt\u0010S\u001a\u0004\bs\u0010=R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010P\u0012\u0004\bv\u0010S\u001a\u0004\bu\u0010*R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010P\u0012\u0004\bx\u0010S\u001a\u0004\bw\u0010*¨\u0006{"}, d2 = {"Lcom/spotify/login/signupapi/services/model/ConfigurationResponse;", "Landroid/os/Parcelable;", "", "canAcceptTermsAndPrivacyPolicyTogether", "canSignupWithAllGenders", "canSignupWithOtherGender", "canSignupWithPreferNotToSayGender", "canImplicitlyAcceptTermsAndCondition", "requiresMarketingOptIn", "requiresMarketingOptInText", "showCollectPersonalInfo", "", "minimumAge", "", "country", "requiresSpecificLicenses", "", "Lcom/spotify/login/signupapi/services/model/CallingCode;", "allowedCallingCodes", "Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "termsAndConditionAcceptance", "Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;", "privacyPolicyAcceptance", "Lcom/spotify/login/signupapi/services/model/MarketingMessagesOption;", "marketingMessagesOption", "showNonRequiredFieldsAsOption", "requiresTailoredAdsOptIn", "<init>", "(ZZZZZZZZILjava/lang/String;ZLjava/util/List;Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;Lcom/spotify/login/signupapi/services/model/MarketingMessagesOption;ZZ)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(IZZZZZZZZILjava/lang/String;ZLjava/util/List;Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;Lcom/spotify/login/signupapi/services/model/MarketingMessagesOption;ZZLp/p661;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/String;", "component11", "component12", "()Ljava/util/List;", "component13", "()Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "component14", "()Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;", "component15", "()Lcom/spotify/login/signupapi/services/model/MarketingMessagesOption;", "component16", "component17", "copy", "(ZZZZZZZZILjava/lang/String;ZLjava/util/List;Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;Lcom/spotify/login/signupapi/services/model/MarketingMessagesOption;ZZ)Lcom/spotify/login/signupapi/services/model/ConfigurationResponse;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "write$Self$src_main_java_com_spotify_login_signupapi_signupapi", "(Lcom/spotify/login/signupapi/services/model/ConfigurationResponse;Lp/z1k;Lp/h661;)V", "write$Self", "Z", "getCanAcceptTermsAndPrivacyPolicyTogether", "getCanAcceptTermsAndPrivacyPolicyTogether$annotations", "()V", "getCanSignupWithAllGenders", "getCanSignupWithAllGenders$annotations", "getCanSignupWithOtherGender", "getCanSignupWithOtherGender$annotations", "getCanSignupWithPreferNotToSayGender", "getCanSignupWithPreferNotToSayGender$annotations", "getCanImplicitlyAcceptTermsAndCondition", "getCanImplicitlyAcceptTermsAndCondition$annotations", "getRequiresMarketingOptIn", "getRequiresMarketingOptIn$annotations", "getRequiresMarketingOptInText", "getRequiresMarketingOptInText$annotations", "getShowCollectPersonalInfo", "getShowCollectPersonalInfo$annotations", "I", "getMinimumAge", "getMinimumAge$annotations", "Ljava/lang/String;", "getCountry", "getRequiresSpecificLicenses", "getRequiresSpecificLicenses$annotations", "Ljava/util/List;", "getAllowedCallingCodes", "getAllowedCallingCodes$annotations", "Lcom/spotify/login/signupapi/services/model/TermsConditionAcceptance;", "getTermsAndConditionAcceptance", "getTermsAndConditionAcceptance$annotations", "Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;", "getPrivacyPolicyAcceptance", "getPrivacyPolicyAcceptance$annotations", "Lcom/spotify/login/signupapi/services/model/MarketingMessagesOption;", "getMarketingMessagesOption", "getMarketingMessagesOption$annotations", "getShowNonRequiredFieldsAsOption", "getShowNonRequiredFieldsAsOption$annotations", "getRequiresTailoredAdsOptIn", "getRequiresTailoredAdsOptIn$annotations", "Companion", "$serializer", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
@o661
public final /* data */ class ConfigurationResponse implements Parcelable {
    public static final int MIN_AGE = 13;
    private final List<CallingCode> allowedCallingCodes;
    private final boolean canAcceptTermsAndPrivacyPolicyTogether;
    private final boolean canImplicitlyAcceptTermsAndCondition;
    private final boolean canSignupWithAllGenders;
    private final boolean canSignupWithOtherGender;
    private final boolean canSignupWithPreferNotToSayGender;
    private final String country;
    private final MarketingMessagesOption marketingMessagesOption;
    private final int minimumAge;
    private final PrivacyPolicyAcceptance privacyPolicyAcceptance;
    private final boolean requiresMarketingOptIn;
    private final boolean requiresMarketingOptInText;
    private final boolean requiresSpecificLicenses;
    private final boolean requiresTailoredAdsOptIn;
    private final boolean showCollectPersonalInfo;
    private final boolean showNonRequiredFieldsAsOption;
    private final TermsConditionAcceptance termsAndConditionAcceptance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConfigurationResponse> CREATOR = new Creator();
    private static final znb0[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, dm5.S(2, ConfigurationResponse$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null};

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ConfigurationResponse f0default = new ConfigurationResponse(false, false, false, false, false, false, false, false, 0, (String) null, false, (List) null, (TermsConditionAcceptance) null, (PrivacyPolicyAcceptance) null, (MarketingMessagesOption) null, false, false, 131071, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/login/signupapi/services/model/ConfigurationResponse$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/login/signupapi/services/model/ConfigurationResponse;", "serializer", "()Lp/nma0;", "default", "Lcom/spotify/login/signupapi/services/model/ConfigurationResponse;", "getDefault", "()Lcom/spotify/login/signupapi/services/model/ConfigurationResponse;", "", "MIN_AGE", "I", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConfigurationResponse getDefault() {
            return ConfigurationResponse.f0default;
        }

        public final nma0 serializer() {
            return ConfigurationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<ConfigurationResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigurationResponse createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            int i = parcel.readInt();
            String string = parcel.readString();
            boolean z9 = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iD = 0;
            while (iD != i2) {
                iD = dsl0.d(CallingCode.CREATOR, parcel, arrayList, iD, 1);
                i2 = i2;
            }
            return new ConfigurationResponse(z, z2, z3, z4, z5, z6, z7, z8, i, string, z9, arrayList, TermsConditionAcceptance.valueOf(parcel.readString()), PrivacyPolicyAcceptance.valueOf(parcel.readString()), MarketingMessagesOption.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigurationResponse[] newArray(int i) {
            return new ConfigurationResponse[i];
        }
    }

    public /* synthetic */ ConfigurationResponse(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, String str, boolean z9, List list, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z10, boolean z11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (i2 & 64) != 0 ? false : z7, (i2 & 128) != 0 ? false : z8, (i2 & 256) != 0 ? 13 : i, (i2 & 512) != 0 ? "" : str, (i2 & 1024) != 0 ? false : z9, (i2 & 2048) != 0 ? new ArrayList() : list, (i2 & 4096) != 0 ? TermsConditionAcceptance.EXPLICIT : termsConditionAcceptance, (i2 & 8192) != 0 ? PrivacyPolicyAcceptance.EXPLICIT : privacyPolicyAcceptance, (i2 & 16384) != 0 ? MarketingMessagesOption.OPT_IN : marketingMessagesOption, (i2 & 32768) != 0 ? false : z10, (i2 & 65536) != 0 ? false : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigurationResponse copy$default(ConfigurationResponse configurationResponse, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, String str, boolean z9, List list, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z10, boolean z11, int i2, Object obj) {
        boolean z12;
        boolean z13;
        boolean z14 = (i2 & 1) != 0 ? configurationResponse.canAcceptTermsAndPrivacyPolicyTogether : z;
        boolean z15 = (i2 & 2) != 0 ? configurationResponse.canSignupWithAllGenders : z2;
        boolean z16 = (i2 & 4) != 0 ? configurationResponse.canSignupWithOtherGender : z3;
        boolean z17 = (i2 & 8) != 0 ? configurationResponse.canSignupWithPreferNotToSayGender : z4;
        boolean z18 = (i2 & 16) != 0 ? configurationResponse.canImplicitlyAcceptTermsAndCondition : z5;
        boolean z19 = (i2 & 32) != 0 ? configurationResponse.requiresMarketingOptIn : z6;
        boolean z20 = (i2 & 64) != 0 ? configurationResponse.requiresMarketingOptInText : z7;
        boolean z21 = (i2 & 128) != 0 ? configurationResponse.showCollectPersonalInfo : z8;
        int i3 = (i2 & 256) != 0 ? configurationResponse.minimumAge : i;
        String str2 = (i2 & 512) != 0 ? configurationResponse.country : str;
        boolean z22 = (i2 & 1024) != 0 ? configurationResponse.requiresSpecificLicenses : z9;
        List list2 = (i2 & 2048) != 0 ? configurationResponse.allowedCallingCodes : list;
        TermsConditionAcceptance termsConditionAcceptance2 = (i2 & 4096) != 0 ? configurationResponse.termsAndConditionAcceptance : termsConditionAcceptance;
        PrivacyPolicyAcceptance privacyPolicyAcceptance2 = (i2 & 8192) != 0 ? configurationResponse.privacyPolicyAcceptance : privacyPolicyAcceptance;
        boolean z23 = z14;
        MarketingMessagesOption marketingMessagesOption2 = (i2 & 16384) != 0 ? configurationResponse.marketingMessagesOption : marketingMessagesOption;
        boolean z24 = (i2 & 32768) != 0 ? configurationResponse.showNonRequiredFieldsAsOption : z10;
        if ((i2 & 65536) != 0) {
            z13 = z24;
            z12 = configurationResponse.requiresTailoredAdsOptIn;
        } else {
            z12 = z11;
            z13 = z24;
        }
        return configurationResponse.copy(z23, z15, z16, z17, z18, z19, z20, z21, i3, str2, z22, list2, termsConditionAcceptance2, privacyPolicyAcceptance2, marketingMessagesOption2, z13, z12);
    }

    public static /* synthetic */ void getAllowedCallingCodes$annotations() {
    }

    public static /* synthetic */ void getCanAcceptTermsAndPrivacyPolicyTogether$annotations() {
    }

    @adt
    public static /* synthetic */ void getCanImplicitlyAcceptTermsAndCondition$annotations() {
    }

    public static /* synthetic */ void getCanSignupWithAllGenders$annotations() {
    }

    public static /* synthetic */ void getCanSignupWithOtherGender$annotations() {
    }

    public static /* synthetic */ void getCanSignupWithPreferNotToSayGender$annotations() {
    }

    public static /* synthetic */ void getMarketingMessagesOption$annotations() {
    }

    public static /* synthetic */ void getMinimumAge$annotations() {
    }

    public static /* synthetic */ void getPrivacyPolicyAcceptance$annotations() {
    }

    @adt
    public static /* synthetic */ void getRequiresMarketingOptIn$annotations() {
    }

    public static /* synthetic */ void getRequiresMarketingOptInText$annotations() {
    }

    @adt
    public static /* synthetic */ void getRequiresSpecificLicenses$annotations() {
    }

    public static /* synthetic */ void getRequiresTailoredAdsOptIn$annotations() {
    }

    public static /* synthetic */ void getShowCollectPersonalInfo$annotations() {
    }

    public static /* synthetic */ void getShowNonRequiredFieldsAsOption$annotations() {
    }

    public static /* synthetic */ void getTermsAndConditionAcceptance$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_login_signupapi_signupapi(ConfigurationResponse self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        if (output.d0() || self.canAcceptTermsAndPrivacyPolicyTogether) {
            output.E(serialDesc, 0, self.canAcceptTermsAndPrivacyPolicyTogether);
        }
        if (output.d0() || self.canSignupWithAllGenders) {
            output.E(serialDesc, 1, self.canSignupWithAllGenders);
        }
        if (output.d0() || self.canSignupWithOtherGender) {
            output.E(serialDesc, 2, self.canSignupWithOtherGender);
        }
        if (output.d0() || self.canSignupWithPreferNotToSayGender) {
            output.E(serialDesc, 3, self.canSignupWithPreferNotToSayGender);
        }
        if (output.d0() || self.canImplicitlyAcceptTermsAndCondition) {
            output.E(serialDesc, 4, self.canImplicitlyAcceptTermsAndCondition);
        }
        if (output.d0() || self.requiresMarketingOptIn) {
            output.E(serialDesc, 5, self.requiresMarketingOptIn);
        }
        if (output.d0() || self.requiresMarketingOptInText) {
            output.E(serialDesc, 6, self.requiresMarketingOptInText);
        }
        if (output.d0() || self.showCollectPersonalInfo) {
            output.E(serialDesc, 7, self.showCollectPersonalInfo);
        }
        if (output.d0() || self.minimumAge != 13) {
            output.e(8, self.minimumAge, serialDesc);
        }
        if (output.d0() || !u890.j(self.country, "")) {
            output.G(serialDesc, 9, self.country);
        }
        if (output.d0() || self.requiresSpecificLicenses) {
            output.E(serialDesc, 10, self.requiresSpecificLicenses);
        }
        if (output.d0() || !u890.j(self.allowedCallingCodes, new ArrayList())) {
            output.k(serialDesc, 11, (nma0) znb0VarArr[11].getValue(), self.allowedCallingCodes);
        }
        if (output.d0() || self.termsAndConditionAcceptance != TermsConditionAcceptance.EXPLICIT) {
            output.k(serialDesc, 12, TermsConditionAcceptanceSerializer.INSTANCE, self.termsAndConditionAcceptance);
        }
        if (output.d0() || self.privacyPolicyAcceptance != PrivacyPolicyAcceptance.EXPLICIT) {
            output.k(serialDesc, 13, PrivacyPolicyAcceptanceSerializer.INSTANCE, self.privacyPolicyAcceptance);
        }
        if (output.d0() || self.marketingMessagesOption != MarketingMessagesOption.OPT_IN) {
            output.k(serialDesc, 14, MarketingMessagesOptionSerializer.INSTANCE, self.marketingMessagesOption);
        }
        if (output.d0() || self.showNonRequiredFieldsAsOption) {
            output.E(serialDesc, 15, self.showNonRequiredFieldsAsOption);
        }
        if (output.d0() || self.requiresTailoredAdsOptIn) {
            output.E(serialDesc, 16, self.requiresTailoredAdsOptIn);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCanAcceptTermsAndPrivacyPolicyTogether() {
        return this.canAcceptTermsAndPrivacyPolicyTogether;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getRequiresSpecificLicenses() {
        return this.requiresSpecificLicenses;
    }

    public final List<CallingCode> component12() {
        return this.allowedCallingCodes;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TermsConditionAcceptance getTermsAndConditionAcceptance() {
        return this.termsAndConditionAcceptance;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PrivacyPolicyAcceptance getPrivacyPolicyAcceptance() {
        return this.privacyPolicyAcceptance;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final MarketingMessagesOption getMarketingMessagesOption() {
        return this.marketingMessagesOption;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getShowNonRequiredFieldsAsOption() {
        return this.showNonRequiredFieldsAsOption;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getRequiresTailoredAdsOptIn() {
        return this.requiresTailoredAdsOptIn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanSignupWithAllGenders() {
        return this.canSignupWithAllGenders;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanSignupWithOtherGender() {
        return this.canSignupWithOtherGender;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanSignupWithPreferNotToSayGender() {
        return this.canSignupWithPreferNotToSayGender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanImplicitlyAcceptTermsAndCondition() {
        return this.canImplicitlyAcceptTermsAndCondition;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRequiresMarketingOptIn() {
        return this.requiresMarketingOptIn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getRequiresMarketingOptInText() {
        return this.requiresMarketingOptInText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowCollectPersonalInfo() {
        return this.showCollectPersonalInfo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMinimumAge() {
        return this.minimumAge;
    }

    public final ConfigurationResponse copy(boolean canAcceptTermsAndPrivacyPolicyTogether, boolean canSignupWithAllGenders, boolean canSignupWithOtherGender, boolean canSignupWithPreferNotToSayGender, boolean canImplicitlyAcceptTermsAndCondition, boolean requiresMarketingOptIn, boolean requiresMarketingOptInText, boolean showCollectPersonalInfo, int minimumAge, String country, boolean requiresSpecificLicenses, List<CallingCode> allowedCallingCodes, TermsConditionAcceptance termsAndConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean showNonRequiredFieldsAsOption, boolean requiresTailoredAdsOptIn) {
        return new ConfigurationResponse(canAcceptTermsAndPrivacyPolicyTogether, canSignupWithAllGenders, canSignupWithOtherGender, canSignupWithPreferNotToSayGender, canImplicitlyAcceptTermsAndCondition, requiresMarketingOptIn, requiresMarketingOptInText, showCollectPersonalInfo, minimumAge, country, requiresSpecificLicenses, allowedCallingCodes, termsAndConditionAcceptance, privacyPolicyAcceptance, marketingMessagesOption, showNonRequiredFieldsAsOption, requiresTailoredAdsOptIn);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigurationResponse)) {
            return false;
        }
        ConfigurationResponse configurationResponse = (ConfigurationResponse) other;
        return this.canAcceptTermsAndPrivacyPolicyTogether == configurationResponse.canAcceptTermsAndPrivacyPolicyTogether && this.canSignupWithAllGenders == configurationResponse.canSignupWithAllGenders && this.canSignupWithOtherGender == configurationResponse.canSignupWithOtherGender && this.canSignupWithPreferNotToSayGender == configurationResponse.canSignupWithPreferNotToSayGender && this.canImplicitlyAcceptTermsAndCondition == configurationResponse.canImplicitlyAcceptTermsAndCondition && this.requiresMarketingOptIn == configurationResponse.requiresMarketingOptIn && this.requiresMarketingOptInText == configurationResponse.requiresMarketingOptInText && this.showCollectPersonalInfo == configurationResponse.showCollectPersonalInfo && this.minimumAge == configurationResponse.minimumAge && u890.j(this.country, configurationResponse.country) && this.requiresSpecificLicenses == configurationResponse.requiresSpecificLicenses && u890.j(this.allowedCallingCodes, configurationResponse.allowedCallingCodes) && this.termsAndConditionAcceptance == configurationResponse.termsAndConditionAcceptance && this.privacyPolicyAcceptance == configurationResponse.privacyPolicyAcceptance && this.marketingMessagesOption == configurationResponse.marketingMessagesOption && this.showNonRequiredFieldsAsOption == configurationResponse.showNonRequiredFieldsAsOption && this.requiresTailoredAdsOptIn == configurationResponse.requiresTailoredAdsOptIn;
    }

    public final List<CallingCode> getAllowedCallingCodes() {
        return this.allowedCallingCodes;
    }

    public final boolean getCanAcceptTermsAndPrivacyPolicyTogether() {
        return this.canAcceptTermsAndPrivacyPolicyTogether;
    }

    public final boolean getCanImplicitlyAcceptTermsAndCondition() {
        return this.canImplicitlyAcceptTermsAndCondition;
    }

    public final boolean getCanSignupWithAllGenders() {
        return this.canSignupWithAllGenders;
    }

    public final boolean getCanSignupWithOtherGender() {
        return this.canSignupWithOtherGender;
    }

    public final boolean getCanSignupWithPreferNotToSayGender() {
        return this.canSignupWithPreferNotToSayGender;
    }

    public final String getCountry() {
        return this.country;
    }

    public final MarketingMessagesOption getMarketingMessagesOption() {
        return this.marketingMessagesOption;
    }

    public final int getMinimumAge() {
        return this.minimumAge;
    }

    public final PrivacyPolicyAcceptance getPrivacyPolicyAcceptance() {
        return this.privacyPolicyAcceptance;
    }

    public final boolean getRequiresMarketingOptIn() {
        return this.requiresMarketingOptIn;
    }

    public final boolean getRequiresMarketingOptInText() {
        return this.requiresMarketingOptInText;
    }

    public final boolean getRequiresSpecificLicenses() {
        return this.requiresSpecificLicenses;
    }

    public final boolean getRequiresTailoredAdsOptIn() {
        return this.requiresTailoredAdsOptIn;
    }

    public final boolean getShowCollectPersonalInfo() {
        return this.showCollectPersonalInfo;
    }

    public final boolean getShowNonRequiredFieldsAsOption() {
        return this.showNonRequiredFieldsAsOption;
    }

    public final TermsConditionAcceptance getTermsAndConditionAcceptance() {
        return this.termsAndConditionAcceptance;
    }

    public int hashCode() {
        return Boolean.hashCode(this.requiresTailoredAdsOptIn) + xcg1.g((this.marketingMessagesOption.hashCode() + ((this.privacyPolicyAcceptance.hashCode() + ((this.termsAndConditionAcceptance.hashCode() + f4i1.b(xcg1.g(cy30.d(kaa0.f(this.minimumAge, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.canAcceptTermsAndPrivacyPolicyTogether) * 31, 31, this.canSignupWithAllGenders), 31, this.canSignupWithOtherGender), 31, this.canSignupWithPreferNotToSayGender), 31, this.canImplicitlyAcceptTermsAndCondition), 31, this.requiresMarketingOptIn), 31, this.requiresMarketingOptInText), 31, this.showCollectPersonalInfo), 31), 31, this.country), 31, this.requiresSpecificLicenses), 31, this.allowedCallingCodes)) * 31)) * 31)) * 31, 31, this.showNonRequiredFieldsAsOption);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.canAcceptTermsAndPrivacyPolicyTogether ? 1 : 0);
        dest.writeInt(this.canSignupWithAllGenders ? 1 : 0);
        dest.writeInt(this.canSignupWithOtherGender ? 1 : 0);
        dest.writeInt(this.canSignupWithPreferNotToSayGender ? 1 : 0);
        dest.writeInt(this.canImplicitlyAcceptTermsAndCondition ? 1 : 0);
        dest.writeInt(this.requiresMarketingOptIn ? 1 : 0);
        dest.writeInt(this.requiresMarketingOptInText ? 1 : 0);
        dest.writeInt(this.showCollectPersonalInfo ? 1 : 0);
        dest.writeInt(this.minimumAge);
        dest.writeString(this.country);
        dest.writeInt(this.requiresSpecificLicenses ? 1 : 0);
        Iterator itM = kk0.m(dest, this.allowedCallingCodes);
        while (itM.hasNext()) {
            ((CallingCode) itM.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.termsAndConditionAcceptance.name());
        dest.writeString(this.privacyPolicyAcceptance.name());
        dest.writeString(this.marketingMessagesOption.name());
        dest.writeInt(this.showNonRequiredFieldsAsOption ? 1 : 0);
        dest.writeInt(this.requiresTailoredAdsOptIn ? 1 : 0);
    }

    public /* synthetic */ ConfigurationResponse(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2, String str, boolean z9, List list, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z10, boolean z11, p661 p661Var) {
        if ((i & 1) == 0) {
            this.canAcceptTermsAndPrivacyPolicyTogether = false;
        } else {
            this.canAcceptTermsAndPrivacyPolicyTogether = z;
        }
        if ((i & 2) == 0) {
            this.canSignupWithAllGenders = false;
        } else {
            this.canSignupWithAllGenders = z2;
        }
        if ((i & 4) == 0) {
            this.canSignupWithOtherGender = false;
        } else {
            this.canSignupWithOtherGender = z3;
        }
        if ((i & 8) == 0) {
            this.canSignupWithPreferNotToSayGender = false;
        } else {
            this.canSignupWithPreferNotToSayGender = z4;
        }
        if ((i & 16) == 0) {
            this.canImplicitlyAcceptTermsAndCondition = false;
        } else {
            this.canImplicitlyAcceptTermsAndCondition = z5;
        }
        if ((i & 32) == 0) {
            this.requiresMarketingOptIn = false;
        } else {
            this.requiresMarketingOptIn = z6;
        }
        if ((i & 64) == 0) {
            this.requiresMarketingOptInText = false;
        } else {
            this.requiresMarketingOptInText = z7;
        }
        if ((i & 128) == 0) {
            this.showCollectPersonalInfo = false;
        } else {
            this.showCollectPersonalInfo = z8;
        }
        if ((i & 256) == 0) {
            this.minimumAge = 13;
        } else {
            this.minimumAge = i2;
        }
        if ((i & 512) == 0) {
            this.country = "";
        } else {
            this.country = str;
        }
        if ((i & 1024) == 0) {
            this.requiresSpecificLicenses = false;
        } else {
            this.requiresSpecificLicenses = z9;
        }
        if ((i & 2048) == 0) {
            this.allowedCallingCodes = new ArrayList();
        } else {
            this.allowedCallingCodes = list;
        }
        this.termsAndConditionAcceptance = (i & 4096) == 0 ? TermsConditionAcceptance.EXPLICIT : termsConditionAcceptance;
        this.privacyPolicyAcceptance = (i & 8192) == 0 ? PrivacyPolicyAcceptance.EXPLICIT : privacyPolicyAcceptance;
        this.marketingMessagesOption = (i & 16384) == 0 ? MarketingMessagesOption.OPT_IN : marketingMessagesOption;
        if ((32768 & i) == 0) {
            this.showNonRequiredFieldsAsOption = false;
        } else {
            this.showNonRequiredFieldsAsOption = z10;
        }
        if ((i & 65536) == 0) {
            this.requiresTailoredAdsOptIn = false;
        } else {
            this.requiresTailoredAdsOptIn = z11;
        }
    }

    public ConfigurationResponse(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, String str, boolean z9, List<CallingCode> list, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z10, boolean z11) {
        this.canAcceptTermsAndPrivacyPolicyTogether = z;
        this.canSignupWithAllGenders = z2;
        this.canSignupWithOtherGender = z3;
        this.canSignupWithPreferNotToSayGender = z4;
        this.canImplicitlyAcceptTermsAndCondition = z5;
        this.requiresMarketingOptIn = z6;
        this.requiresMarketingOptInText = z7;
        this.showCollectPersonalInfo = z8;
        this.minimumAge = i;
        this.country = str;
        this.requiresSpecificLicenses = z9;
        this.allowedCallingCodes = list;
        this.termsAndConditionAcceptance = termsConditionAcceptance;
        this.privacyPolicyAcceptance = privacyPolicyAcceptance;
        this.marketingMessagesOption = marketingMessagesOption;
        this.showNonRequiredFieldsAsOption = z10;
        this.requiresTailoredAdsOptIn = z11;
    }

    public ConfigurationResponse() {
        this(false, false, false, false, false, false, false, false, 0, (String) null, false, (List) null, (TermsConditionAcceptance) null, (PrivacyPolicyAcceptance) null, (MarketingMessagesOption) null, false, false, 131071, (DefaultConstructorMarker) null);
    }
}
