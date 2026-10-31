package com.spotify.voting.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lyk1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetVotingRootResponse extends h implements v2j0 {
    public static final int AWARD_ID_FIELD_NUMBER = 11;
    public static final int BOTTOM_SHEET_FIELD_NUMBER = 6;
    public static final int CONFIRMATION_PAGE_FIELD_NUMBER = 7;
    public static final int CONTEST_ID_FIELD_NUMBER = 10;
    private static final GetVotingRootResponse DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 9;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 8;
    public static final int FAQ_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_UPSELL_FIELD_NUMBER = 4;
    public static final int REDIRECT_URI_FIELD_NUMBER = 14;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VOTING_SECTION_FIELD_NUMBER = 5;
    public static final int VOTING_STATE_FIELD_NUMBER = 13;
    private int bitField0_;
    private BottomSheet bottomSheet_;
    private ConfirmationPage confirmationPage_;
    private ErrorMessage errorMessage_;
    private PremiumUpsell premiumUpsell_;
    private VotingSection votingSection_;
    private int votingState_;
    private String title_ = "";
    private String subtitle_ = "";
    private String faqUri_ = "";
    private String entrypointUri_ = "";
    private String contestId_ = "";
    private String awardId_ = "";
    private String redirectUri_ = "";

    public static final class BottomSheet extends h implements v2j0 {
        public static final int CANCEL_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 6;
        public static final int CANCEL_BUTTON_TITLE_FIELD_NUMBER = 2;
        public static final int CONFIRM_VOTE_PLURAL_FIELD_NUMBER = 4;
        public static final int CONFIRM_VOTE_SINGULAR_FIELD_NUMBER = 3;
        private static final BottomSheet DEFAULT_INSTANCE;
        public static final int DEFAULT_TITLE_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int VOTE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 7;
        public static final int VOTE_BUTTON_TITLE_FIELD_NUMBER = 1;
        private String voteButtonTitle_ = "";
        private String cancelButtonTitle_ = "";
        private String confirmVoteSingular_ = "";
        private String confirmVotePlural_ = "";
        private String defaultTitle_ = "";
        private String cancelButtonAccessibilityAction_ = "";
        private String voteButtonAccessibilityAction_ = "";

        static {
            BottomSheet bottomSheet = new BottomSheet();
            DEFAULT_INSTANCE = bottomSheet;
            h.registerDefaultInstance(BottomSheet.class, bottomSheet);
        }

        private BottomSheet() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static BottomSheet r() {
            return DEFAULT_INSTANCE;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"voteButtonTitle_", "cancelButtonTitle_", "confirmVoteSingular_", "confirmVotePlural_", "defaultTitle_", "cancelButtonAccessibilityAction_", "voteButtonAccessibilityAction_"});
            }
            if (iOrdinal == 3) {
                return new BottomSheet();
            }
            if (iOrdinal == 4) {
                return new a(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (BottomSheet.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final String n() {
            return this.cancelButtonAccessibilityAction_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.cancelButtonTitle_;
        }

        public final String p() {
            return this.confirmVotePlural_;
        }

        public final String q() {
            return this.confirmVoteSingular_;
        }

        public final String s() {
            return this.defaultTitle_;
        }

        public final String t() {
            return this.voteButtonAccessibilityAction_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final String u() {
            return this.voteButtonTitle_;
        }
    }

    public static final class ConfirmationPage extends h implements v2j0 {
        private static final ConfirmationPage DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int SUBTITLE_PLURAL_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subtitle_ = "";
        private String subtitlePlural_ = "";

        static {
            ConfirmationPage confirmationPage = new ConfirmationPage();
            DEFAULT_INSTANCE = confirmationPage;
            h.registerDefaultInstance(ConfirmationPage.class, confirmationPage);
        }

        private ConfirmationPage() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "subtitle_", "subtitlePlural_"});
            }
            if (iOrdinal == 3) {
                return new ConfirmationPage();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (ConfirmationPage.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ErrorMessage extends h implements v2j0 {
        private static final ErrorMessage DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PRIMARY_BUTTON_TITLE_FIELD_NUMBER = 3;
        public static final int SECONDARY_BUTTON_TITLE_FIELD_NUMBER = 4;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subtitle_ = "";
        private String primaryButtonTitle_ = "";
        private String secondaryButtonTitle_ = "";

        static {
            ErrorMessage errorMessage = new ErrorMessage();
            DEFAULT_INSTANCE = errorMessage;
            h.registerDefaultInstance(ErrorMessage.class, errorMessage);
        }

        private ErrorMessage() {
        }

        public static ErrorMessage n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"title_", "subtitle_", "primaryButtonTitle_", "secondaryButtonTitle_"});
            }
            if (iOrdinal == 3) {
                return new ErrorMessage();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (ErrorMessage.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.primaryButtonTitle_;
        }

        public final String p() {
            return this.secondaryButtonTitle_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Nominee extends h implements v2j0 {
        public static final int ART_URL_FIELD_NUMBER = 2;
        private static final Nominee DEFAULT_INSTANCE;
        public static final int NOMINEE_ID_FIELD_NUMBER = 1;
        public static final int NOMINEE_KIND_FIELD_NUMBER = 6;
        private static volatile qzr0 PARSER = null;
        public static final int PREVIEW_URL_FIELD_NUMBER = 5;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        private String nomineeId_ = "";
        private String artUrl_ = "";
        private String title_ = "";
        private String subtitle_ = "";
        private String previewUrl_ = "";
        private String nomineeKind_ = "";

        static {
            Nominee nominee = new Nominee();
            DEFAULT_INSTANCE = nominee;
            h.registerDefaultInstance(Nominee.class, nominee);
        }

        private Nominee() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"nomineeId_", "artUrl_", "title_", "subtitle_", "previewUrl_", "nomineeKind_"});
            }
            if (iOrdinal == 3) {
                return new Nominee();
            }
            if (iOrdinal == 4) {
                return new e(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (Nominee.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        public final String n() {
            return this.artUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.nomineeId_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VotingSection extends h implements v2j0 {
        public static final int ADD_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 13;
        public static final int ADD_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 12;
        private static final VotingSection DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 3;
        public static final int NOMINEES_FIELD_NUMBER = 7;
        public static final int NOMINEE_VOTE_COUNT_ACCESSIBILITY_TEXT_FIELD_NUMBER = 11;
        private static volatile qzr0 PARSER = null;
        public static final int REMOVE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 10;
        public static final int REMOVE_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 9;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int VOTES_REMAINING_FIELD_NUMBER = 6;
        public static final int VOTES_REMAINING_LINES_FIELD_NUMBER = 8;
        private int votesRemaining_;
        private String title_ = "";
        private String subtitle_ = "";
        private String header_ = "";
        private h290 nominees_ = h.emptyProtobufList();
        private h290 votesRemainingLines_ = h.emptyProtobufList();
        private String removeButtonAccessibilityText_ = "";
        private String removeButtonAccessibilityAction_ = "";
        private h290 nomineeVoteCountAccessibilityText_ = h.emptyProtobufList();
        private String addButtonAccessibilityText_ = "";
        private String addButtonAccessibilityAction_ = "";

        static {
            VotingSection votingSection = new VotingSection();
            DEFAULT_INSTANCE = votingSection;
            h.registerDefaultInstance(VotingSection.class, votingSection);
        }

        private VotingSection() {
        }

        public static VotingSection p() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\r\u000b\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0006\u0004\u0007\u001b\bȚ\tȈ\nȈ\u000bȚ\fȈ\rȈ", new Object[]{"title_", "subtitle_", "header_", "votesRemaining_", "nominees_", Nominee.class, "votesRemainingLines_", "removeButtonAccessibilityText_", "removeButtonAccessibilityAction_", "nomineeVoteCountAccessibilityText_", "addButtonAccessibilityText_", "addButtonAccessibilityAction_"});
            }
            if (iOrdinal == 3) {
                return new VotingSection();
            }
            if (iOrdinal == 4) {
                return new f(DEFAULT_INSTANCE);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (VotingSection.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        public final String n() {
            return this.addButtonAccessibilityAction_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.addButtonAccessibilityText_;
        }

        public final String q() {
            return this.header_;
        }

        public final h290 r() {
            return this.nomineeVoteCountAccessibilityText_;
        }

        public final h290 s() {
            return this.nominees_;
        }

        public final String t() {
            return this.removeButtonAccessibilityAction_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final String u() {
            return this.removeButtonAccessibilityText_;
        }

        public final int v() {
            return this.votesRemaining_;
        }

        public final h290 w() {
            return this.votesRemainingLines_;
        }
    }

    static {
        GetVotingRootResponse getVotingRootResponse = new GetVotingRootResponse();
        DEFAULT_INSTANCE = getVotingRootResponse;
        h.registerDefaultInstance(GetVotingRootResponse.class, getVotingRootResponse);
    }

    private GetVotingRootResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tȈ\nȈ\u000bȈ\r\f\u000eለ\u0005", new Object[]{"bitField0_", "title_", "subtitle_", "faqUri_", "premiumUpsell_", "votingSection_", "bottomSheet_", "confirmationPage_", "errorMessage_", "entrypointUri_", "contestId_", "awardId_", "votingState_", "redirectUri_"});
        }
        if (iOrdinal == 3) {
            return new GetVotingRootResponse();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (GetVotingRootResponse.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getTitle() {
        return this.title_;
    }

    public final BottomSheet n() {
        BottomSheet bottomSheet = this.bottomSheet_;
        return bottomSheet == null ? BottomSheet.r() : bottomSheet;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ErrorMessage o() {
        ErrorMessage errorMessage = this.errorMessage_;
        return errorMessage == null ? ErrorMessage.n() : errorMessage;
    }

    public final String p() {
        return this.redirectUri_;
    }

    public final VotingSection q() {
        VotingSection votingSection = this.votingSection_;
        return votingSection == null ? VotingSection.p() : votingSection;
    }

    public final lyk1 r() {
        lyk1 lyk1Var;
        switch (this.votingState_) {
            case 0:
                lyk1Var = lyk1.VOTING_STATE_TYPE_UNSPECIFIED;
                break;
            case 1:
                lyk1Var = lyk1.VOTING_STATE_TYPE_DISABLED;
                break;
            case 2:
                lyk1Var = lyk1.VOTING_STATE_TYPE_NOT_STARTED;
                break;
            case 3:
                lyk1Var = lyk1.VOTING_STATE_TYPE_AVAILABLE;
                break;
            case 4:
                lyk1Var = lyk1.VOTING_STATE_TYPE_AVAILABLE_VOTES_USED;
                break;
            case 5:
                lyk1Var = lyk1.VOTING_STATE_TYPE_CLOSED;
                break;
            case 6:
                lyk1Var = lyk1.VOTING_STATE_TYPE_USER_INELIGIBLE;
                break;
            case 7:
                lyk1Var = lyk1.VOTING_STATE_TYPE_RESULTS;
                break;
            default:
                lyk1Var = null;
                break;
        }
        return lyk1Var == null ? lyk1.UNRECOGNIZED : lyk1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
