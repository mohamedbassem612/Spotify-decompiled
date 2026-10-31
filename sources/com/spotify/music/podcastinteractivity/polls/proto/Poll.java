package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.h;
import p.acv0;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yav0;
import p.zbv0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Poll extends h implements v2j0 {
    public static final int CLOSING_DATE_FIELD_NUMBER = 3;
    private static final Poll DEFAULT_INSTANCE;
    public static final int ENTITY_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int ENTITY_URI_FIELD_NUMBER = 5;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 15;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 6;
    public static final int OPENING_DATE_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int POLL_URI_FIELD_NUMBER = 12;
    public static final int QUESTION_FIELD_NUMBER = 7;
    public static final int REPORTING_LINK_FIELD_NUMBER = 11;
    public static final int STATUS_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 8;
    private int bitField0_;
    private int entityTimestampMs_;
    private EpisodeMetadata episodeMetadata_;
    private int id_;
    private int status_;
    private int type_;
    private String openingDate_ = "";
    private String closingDate_ = "";
    private String entityUri_ = "";
    private String name_ = "";
    private String question_ = "";
    private h290 options_ = h.emptyProtobufList();
    private String reportingLink_ = "";
    private String pollUri_ = "";

    static {
        Poll poll = new Poll();
        DEFAULT_INSTANCE = poll;
        h.registerDefaultInstance(Poll.class, poll);
    }

    private Poll() {
    }

    public static Poll o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static yav0 x(Poll poll) {
        return (yav0) DEFAULT_INSTANCE.createBuilder(poll);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u000f\r\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\f\t\u001b\n\f\u000bȈ\fȈ\u000fဉ\u0000", new Object[]{"bitField0_", "id_", "openingDate_", "closingDate_", "entityTimestampMs_", "entityUri_", "name_", "question_", "type_", "options_", PollOption.class, "status_", "reportingLink_", "pollUri_", "episodeMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Poll();
        }
        if (iOrdinal == 4) {
            return new yav0(DEFAULT_INSTANCE);
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
        synchronized (Poll.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String n() {
        return this.closingDate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EpisodeMetadata p() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.n() : episodeMetadata;
    }

    public final int q() {
        return this.id_;
    }

    public final h290 r() {
        return this.options_;
    }

    public final String s() {
        return this.pollUri_;
    }

    public final String t() {
        return this.question_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final zbv0 u() {
        zbv0 zbv0Var;
        int i = this.status_;
        if (i == 0) {
            zbv0Var = zbv0.DRAFT;
        } else if (i == 1) {
            zbv0Var = zbv0.SCHEDULED;
        } else if (i == 2) {
            zbv0Var = zbv0.LIVE;
        } else if (i != 3) {
            zbv0Var = i != 4 ? null : zbv0.BLOCKED;
        } else {
            zbv0Var = zbv0.CLOSED;
        }
        return zbv0Var == null ? zbv0.UNRECOGNIZED : zbv0Var;
    }

    public final acv0 v() {
        acv0 acv0Var;
        int i = this.type_;
        if (i != 0) {
            acv0Var = i != 1 ? null : acv0.SINGLE_CHOICE;
        } else {
            acv0Var = acv0.MULTIPLE_CHOICE;
        }
        return acv0Var == null ? acv0.UNRECOGNIZED : acv0Var;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void y(EpisodeMetadata episodeMetadata) {
        episodeMetadata.getClass();
        this.episodeMetadata_ = episodeMetadata;
        this.bitField0_ |= 1;
    }
}
