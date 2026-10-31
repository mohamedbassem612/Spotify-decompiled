package com.spotify.liveroom.listeningpartyvotingcardimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qr40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetVotingWidgetResponse extends h implements v2j0 {
    public static final int AVAILABLE_VOTES_FIELD_NUMBER = 5;
    public static final int AWARD_ID_FIELD_NUMBER = 2;
    public static final int CONTEST_ID_FIELD_NUMBER = 1;
    private static final GetVotingWidgetResponse DEFAULT_INSTANCE;
    public static final int NOMINEES_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int VOTING_END_FIELD_NUMBER = 6;
    private int availableVotes_;
    private int bitField0_;
    private int state_;
    private Timestamp votingEnd_;
    private String contestId_ = "";
    private String awardId_ = "";
    private String question_ = "";
    private h290 nominees_ = h.emptyProtobufList();

    public static final class WidgetNominee extends h implements v2j0 {
        private static final WidgetNominee DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int URI_FIELD_NUMBER = 1;
        private String uri_ = "";
        private String imageUrl_ = "";
        private String title_ = "";
        private String subtitle_ = "";

        static {
            WidgetNominee widgetNominee = new WidgetNominee();
            DEFAULT_INSTANCE = widgetNominee;
            h.registerDefaultInstance(WidgetNominee.class, widgetNominee);
        }

        private WidgetNominee() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "imageUrl_", "title_", "subtitle_"});
            }
            if (iOrdinal == 3) {
                return new WidgetNominee();
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
            synchronized (WidgetNominee.class) {
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

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        public final String getUri() {
            return this.uri_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GetVotingWidgetResponse getVotingWidgetResponse = new GetVotingWidgetResponse();
        DEFAULT_INSTANCE = getVotingWidgetResponse;
        h.registerDefaultInstance(GetVotingWidgetResponse.class, getVotingWidgetResponse);
    }

    private GetVotingWidgetResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u0004\u0006ဉ\u0000\u0007\u001b", new Object[]{"bitField0_", "contestId_", "awardId_", "question_", "state_", "availableVotes_", "votingEnd_", "nominees_", WidgetNominee.class});
        }
        if (iOrdinal == 3) {
            return new GetVotingWidgetResponse();
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
        synchronized (GetVotingWidgetResponse.class) {
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

    public final int n() {
        return this.availableVotes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.awardId_;
    }

    public final String p() {
        return this.contestId_;
    }

    public final h290 q() {
        return this.nominees_;
    }

    public final String r() {
        return this.question_;
    }

    public final qr40 s() {
        qr40 qr40Var;
        int i = this.state_;
        if (i == 0) {
            qr40Var = qr40.VOTING_WIDGET_STATE_UNSPECIFIED;
        } else if (i == 1) {
            qr40Var = qr40.VOTING_WIDGET_STATE_AVAILABLE;
        } else if (i != 2) {
            qr40Var = i != 3 ? null : qr40.VOTING_WIDGET_STATE_CLOSED;
        } else {
            qr40Var = qr40.VOTING_WIDGET_STATE_AVAILABLE_VOTES_USED;
        }
        return qr40Var == null ? qr40.UNRECOGNIZED : qr40Var;
    }

    public final Timestamp t() {
        Timestamp timestamp = this.votingEnd_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
