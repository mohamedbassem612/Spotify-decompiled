package com.spotify.decipher.agent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SearchRescuePlaybackStartedEvent extends h implements v2j0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final SearchRescuePlaybackStartedEvent DEFAULT_INSTANCE;
    public static final int MESSAGE_OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RESCUE_SESSION_ID_FIELD_NUMBER = 2;
    public static final int SUGGESTION_ID_FIELD_NUMBER = 3;
    public static final int TRIGGER_CORRELATION_ID_FIELD_NUMBER = 4;
    private String contentUri_ = "";
    private String rescueSessionId_ = "";
    private String suggestionId_ = "";
    private String triggerCorrelationId_ = "";
    private String messageOpportunityId_ = "";

    static {
        SearchRescuePlaybackStartedEvent searchRescuePlaybackStartedEvent = new SearchRescuePlaybackStartedEvent();
        DEFAULT_INSTANCE = searchRescuePlaybackStartedEvent;
        h.registerDefaultInstance(SearchRescuePlaybackStartedEvent.class, searchRescuePlaybackStartedEvent);
    }

    private SearchRescuePlaybackStartedEvent() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"contentUri_", "rescueSessionId_", "suggestionId_", "triggerCorrelationId_", "messageOpportunityId_"});
        }
        if (iOrdinal == 3) {
            return new SearchRescuePlaybackStartedEvent();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (SearchRescuePlaybackStartedEvent.class) {
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
