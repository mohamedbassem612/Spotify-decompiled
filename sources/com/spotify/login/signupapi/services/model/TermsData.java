package com.spotify.login.signupapi.services.model;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h380;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010\u0013¨\u0006)"}, d2 = {"Lcom/spotify/login/signupapi/services/model/TermsData;", "", "", "iAgree", "collectPersonalInformation", "thirdPartyDataProvision", "emailConsent", "tailoredAdsConsent", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lp/h380;", "", "paramBuilder", "Lp/rih1;", "setFields", "(Lp/h380;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/spotify/login/signupapi/services/model/TermsData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getIAgree", "Ljava/lang/Boolean;", "getCollectPersonalInformation", "getThirdPartyDataProvision", "getEmailConsent", "getTailoredAdsConsent", "Builder", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class TermsData {
    private final Boolean collectPersonalInformation;
    private final Boolean emailConsent;
    private final boolean iAgree;
    private final Boolean tailoredAdsConsent;
    private final Boolean thirdPartyDataProvision;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/spotify/login/signupapi/services/model/TermsData$Builder;", "", "origin", "Lcom/spotify/login/signupapi/services/model/TermsData;", "<init>", "(Lcom/spotify/login/signupapi/services/model/TermsData;)V", "iAgree", "", "collectPersonalInformation", "Ljava/lang/Boolean;", "thirdPartyDataProvision", "emailConsent", "tailoredAdsConsent", "value", "(Ljava/lang/Boolean;)Lcom/spotify/login/signupapi/services/model/TermsData$Builder;", "build", "src_main_java_com_spotify_login_signupapi-signupapi"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Builder {
        private Boolean collectPersonalInformation;
        private Boolean emailConsent;
        private boolean iAgree;
        private Boolean tailoredAdsConsent;
        private Boolean thirdPartyDataProvision;

        public Builder(TermsData termsData) {
            this.iAgree = termsData.getIAgree();
            this.collectPersonalInformation = termsData.getCollectPersonalInformation();
            this.thirdPartyDataProvision = termsData.getThirdPartyDataProvision();
            this.emailConsent = termsData.getEmailConsent();
            this.tailoredAdsConsent = termsData.getTailoredAdsConsent();
        }

        public final TermsData build() {
            return new TermsData(this.iAgree, this.collectPersonalInformation, this.thirdPartyDataProvision, this.emailConsent, this.tailoredAdsConsent);
        }

        public final Builder collectPersonalInformation(Boolean value) {
            this.collectPersonalInformation = value;
            return this;
        }

        public final Builder emailConsent(Boolean value) {
            this.emailConsent = value;
            return this;
        }

        public final Builder iAgree(boolean value) {
            this.iAgree = value;
            return this;
        }

        public final Builder tailoredAdsConsent(Boolean value) {
            this.tailoredAdsConsent = value;
            return this;
        }

        public final Builder thirdPartyDataProvision(Boolean value) {
            this.thirdPartyDataProvision = value;
            return this;
        }
    }

    public /* synthetic */ TermsData(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4);
    }

    public static /* synthetic */ TermsData copy$default(TermsData termsData, boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = termsData.iAgree;
        }
        if ((i & 2) != 0) {
            bool = termsData.collectPersonalInformation;
        }
        if ((i & 4) != 0) {
            bool2 = termsData.thirdPartyDataProvision;
        }
        if ((i & 8) != 0) {
            bool3 = termsData.emailConsent;
        }
        if ((i & 16) != 0) {
            bool4 = termsData.tailoredAdsConsent;
        }
        Boolean bool5 = bool4;
        Boolean bool6 = bool2;
        return termsData.copy(z, bool, bool6, bool3, bool5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIAgree() {
        return this.iAgree;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCollectPersonalInformation() {
        return this.collectPersonalInformation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getThirdPartyDataProvision() {
        return this.thirdPartyDataProvision;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEmailConsent() {
        return this.emailConsent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getTailoredAdsConsent() {
        return this.tailoredAdsConsent;
    }

    public final TermsData copy(boolean iAgree, Boolean collectPersonalInformation, Boolean thirdPartyDataProvision, Boolean emailConsent, Boolean tailoredAdsConsent) {
        return new TermsData(iAgree, collectPersonalInformation, thirdPartyDataProvision, emailConsent, tailoredAdsConsent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TermsData)) {
            return false;
        }
        TermsData termsData = (TermsData) other;
        return this.iAgree == termsData.iAgree && u890.j(this.collectPersonalInformation, termsData.collectPersonalInformation) && u890.j(this.thirdPartyDataProvision, termsData.thirdPartyDataProvision) && u890.j(this.emailConsent, termsData.emailConsent) && u890.j(this.tailoredAdsConsent, termsData.tailoredAdsConsent);
    }

    public final Boolean getCollectPersonalInformation() {
        return this.collectPersonalInformation;
    }

    public final Boolean getEmailConsent() {
        return this.emailConsent;
    }

    public final boolean getIAgree() {
        return this.iAgree;
    }

    public final Boolean getTailoredAdsConsent() {
        return this.tailoredAdsConsent;
    }

    public final Boolean getThirdPartyDataProvision() {
        return this.thirdPartyDataProvision;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.iAgree) * 31;
        Boolean bool = this.collectPersonalInformation;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.thirdPartyDataProvision;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.emailConsent;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.tailoredAdsConsent;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final void setFields(h380 paramBuilder) {
        paramBuilder.e("iagree", Boolean.valueOf(this.iAgree));
        Boolean bool = this.collectPersonalInformation;
        if (bool != null) {
            paramBuilder.e("collect_personal_info", bool);
        }
        Boolean bool2 = this.thirdPartyDataProvision;
        if (bool2 != null) {
            paramBuilder.e("thirdpartyemail", bool2);
        }
        Boolean bool3 = this.emailConsent;
        if (bool3 != null) {
            paramBuilder.e("send-email", bool3);
        }
        Boolean bool4 = this.tailoredAdsConsent;
        if (bool4 != null) {
            paramBuilder.e("tailored_ads", bool4);
        }
    }

    public String toString() {
        return super.toString();
    }

    public TermsData(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.iAgree = z;
        this.collectPersonalInformation = bool;
        this.thirdPartyDataProvision = bool2;
        this.emailConsent = bool3;
        this.tailoredAdsConsent = bool4;
    }
}
